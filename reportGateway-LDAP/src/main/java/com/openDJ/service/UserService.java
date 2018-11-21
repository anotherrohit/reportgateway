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

@Service
public class UserService {
	private final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private UserRepositoryImpl userRepositoryImpl;
	
	@Autowired
	private UtilService utilService;
	
	public UserListResponse getUserList() throws Exception 
	{
		logger.info("=== UserRepositoryImpl getUserList Start ===");
		UserListResponse userListResponse = new UserListResponse();
		List<Object> object= userRepositoryImpl.getAllUsers();
		//logger.info(">>"+object);
		userListResponse.setUser(object);
		logger.info("=== UserRepositoryImpl getUserList End ===");
		return userListResponse;
	}
	
	/*Added by vikash*/
	public List<Object> getUserListFor(String speSystemID,Map<String,String> mapUserRecords,String[] arrayAttributes) throws Exception 
	{		
		logger.info("=== UserRepositoryImpl getUserList Start speSystemID :"+speSystemID);
		//UserListResponse userListResponse = new UserListResponse();
		List<Object> object= userRepositoryImpl.getAllUsersFor(speSystemID,mapUserRecords,arrayAttributes);
		//userListResponse.setUser(object);
		logger.info("=== UserRepositoryImpl getUserList End ===");
		return object;
	}
	
	public List<Map> getUserFromDB(String attributes,String arrayAttributes[]) throws Exception 
	{
		logger.info("=== START GET RECORD FROM DB ===");
		List<Map> listOfUsers = getRecords(attributes,arrayAttributes);		
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
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@uspxh005d1.spe.sony.com:30714:COSDIIQD", "identityiq", "C0n#iD3+idQ");
			Statement stmt = con.createStatement();
			String selectQuery = "select "+attributes+" from WD_EMP_FULL WHERE ROWNUM <= 50";//TODO:: Remove Wehere clause
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
		logger.info(">>FROM DB listOfUsers "+listOfUsers);
		return listOfUsers;
	}
	
	static <T> T[] append(T[] arr, T element) {
	    final int N = arr.length;
	    arr = Arrays.copyOf(arr, N + 1);
	    arr[N] = element;
	    return arr;
	}
	
}

