package com.openDJ.converter;

import com.openDJ.pojo.User;
import com.openDJ.view.json.DatabaseTableJson;
import com.openDJ.view.json.UserJson;

public class UserConverter {
		
		/**
		 * This method create user data for admin
		 * @param user
		 * @return
		 */
		public static UserJson createUserDataForAdmin(User user){
			UserJson userJson = new UserJson();
			userJson.setFirstName(user.getFirstName());
			userJson.setLastName(user.getLastName());
			userJson.setCn(user.getCn());
			userJson.setSn(user.getSn());
			userJson.setUserPassword(user.getUserPassword());
			userJson.setTelephoneNumber(user.getTelephoneNumber());
			userJson.setPostalAddress(user.getPostalAddress());
			return userJson;
		}
		
		public static DatabaseTableJson createDatabaseTable(Object object)
		{
			DatabaseTableJson databaseTableJson = new DatabaseTableJson();
			databaseTableJson.setName(object.toString());
			return databaseTableJson;
		}
}
