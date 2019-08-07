package com.openDJ.service;

import java.sql.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openDJ.pojo.UserListResponse;
import com.openDJ.view.json.FaultJson;

@Service
public class UserService {
	private final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private UserRepositoryImpl userRepositoryImpl;
	
	@Autowired
	private UtilService utilService;
	
	/*Added by vikash*/
	public static List<Object> userList ;
	
	/*Added by vikash*/
	public static List<Object> getAllUserList(){
		return userList;
	}
	
	/*Added by vikash*/
	public static void setAllUserList(UserListResponse userListResponse){
		userList = userListResponse.getUser();		
	}
	
	public UserListResponse getUserList() throws Exception 
	{
		logger.info("=== UserRepositoryImpl getUserList Start ===");
		UserListResponse userListResponse = new UserListResponse();
		List<Object> object= userRepositoryImpl.getAllUsers();
		userListResponse.setUser(object);
		logger.info("=== UserRepositoryImpl getUserList End ===");
		
		//setAllUserList(userListResponse);		
		return userListResponse;
	}
	
	/*Added by vikash*/
	public List<Object> getUserListFor(String speSystemID,Map<String,String> mapUserRecords,String[] arrayAttributes) throws Exception 
	{		
		logger.info("=== UserRepositoryImpl getUserList Start speSystemID :"+speSystemID);
		List<Object> object= userRepositoryImpl.getAllUsersFor(speSystemID,mapUserRecords,arrayAttributes);
		logger.info("=== UserRepositoryImpl getUserList End ===");
		return object;
	}
	
	public List<Map> getUserFromDB(String attributes,String arrayAttributes[]) throws Exception 
	{
		logger.info("=== START GET RECORD FROM DB START===");
		List<Map> listOfUsers = getRecords(attributes,arrayAttributes);		
		logger.info("=== START GET RECORD FROM DB END===");
		return listOfUsers;
	}
	
	public List<Map> getRecords(String attributes,String arrayAttributes[]){
		List<Map> listOfUsers = new LinkedList<Map>();
		Connection con = null;
		if(!attributes.contains("MIIS_ID")){
			attributes = "MIIS_ID,"+attributes;
			arrayAttributes = append(arrayAttributes, "MIIS_ID");			
		}
		
		try {
			//TODO:: NEED TO CHANGE AS PER ENV			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "sys as sysdba", "test");
			Statement stmt = con.createStatement();
			String selectQuery = "select "+attributes+" from WD_EMP_FULL WHERE ROWNUM <= 50";//TODO:: Remove Where clause
			logger.info("Select Query "+selectQuery);
			ResultSet rs = stmt.executeQuery(selectQuery);
			
			while (rs.next()){
				Map<String,String> userDetails = new HashMap<String,String>();
				for (String attr : arrayAttributes) {					
					String attrValue = rs.getString(attr);
					userDetails.put(attr, attrValue);
				}
				listOfUsers.add(userDetails);
			}
		} catch (Exception e) {
			System.out.println("[WARNING]"+e.getMessage());
			e.printStackTrace();
		}finally{
			try {
				if(con!=null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		logger.info("FROM DB listOfUsers: "+listOfUsers);
		return listOfUsers;
	}
	
	static <T> T[] append(T[] arr, T element) {
	    final int N = arr.length;
	    arr = Arrays.copyOf(arr, N + 1);
	    arr[N] = element;
	    return arr;
	}
	
}

