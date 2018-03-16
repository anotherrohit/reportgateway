package com.openDJ.dao;

import java.util.List;

public interface UserRepositoryIntf {

 public List<Object> getAllUsers() throws Exception;

 public boolean authenticate(String base,String userName, String password) throws Exception;

}
