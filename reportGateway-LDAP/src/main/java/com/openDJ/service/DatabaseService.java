package com.openDJ.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openDJ.converter.UserConverter;
import com.openDJ.dao.BaseHibernateDomainDAOAbstract;
import com.openDJ.util.FaultEnum;
import com.openDJ.view.json.DatabaseTableJson;
import com.openDJ.view.json.FaultJson;
import com.openDJ.view.json.user.DataTableListResponse;
import com.openDJ.view.json.user.TableDataRequest;
import com.openDJ.view.json.user.TableDataResponse;

@Service
public class DatabaseService {
	private final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private UtilService utilService;

	@Autowired
	private BaseHibernateDomainDAOAbstract baseHibernateDomainDAOAbstract;
	
	public DataTableListResponse getDataBaseTableList() throws Exception 
	{
		logger.info("/services/admin/database/table/list json request :: ");
		DataTableListResponse dataTableListResponse = new DataTableListResponse();
		
		
		List<Object> list= baseHibernateDomainDAOAbstract.getName();
		if(list.isEmpty())
		{
			FaultJson faults = utilService.getFaultsObject(FaultEnum.NO_RESULTS_FOUND);
			dataTableListResponse.setFaultJson(faults);
		}
		else
		{
			List<DatabaseTableJson> databaseTableJsons = new ArrayList<DatabaseTableJson>();
			for(Object object : list)
			{
				databaseTableJsons.add(UserConverter.createDatabaseTable(object));
				
			}
			dataTableListResponse.setDatabaseTableJsons(databaseTableJsons);
		}
		
		logger.info("/services/admin/database/table/list json response :: " + new JSONObject(dataTableListResponse).toString());
		return dataTableListResponse;
	}
	
	public TableDataResponse getTableData(TableDataRequest tableDataRequest) throws Exception 
	{
		logger.info("/services/admin/database/table/data json request :: "+ new JSONObject(tableDataRequest).toString());
		TableDataResponse tableDataResponse = new TableDataResponse();
		
		
		List<Object> list= baseHibernateDomainDAOAbstract.getData(tableDataRequest.getName());
		if(list.isEmpty())
		{
			FaultJson faults = utilService.getFaultsObject(FaultEnum.NO_RESULTS_FOUND);
			tableDataResponse.setFaultJson(faults);
		}
		else
		{
			List<DatabaseTableJson> databaseTableJsons = new ArrayList<DatabaseTableJson>();
			
			tableDataResponse.setObject(list);
		}
		
		logger.info("/services/admin/database/table/data json response :: " + new JSONObject(tableDataResponse).toString());
		return tableDataResponse;
	}
	
}
