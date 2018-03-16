package com.openDJ.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.openDJ.dao.BaseHibernateDomainDAOAbstract;
import com.openDJ.service.DatabaseService;
import com.openDJ.service.UtilService;
import com.openDJ.util.Constant;
import com.openDJ.util.FaultEnum;
import com.openDJ.view.json.FaultJson;
import com.openDJ.view.json.user.DataTableListResponse;
import com.openDJ.view.json.user.TableDataRequest;
import com.openDJ.view.json.user.TableDataResponse;

@RestController
@RequestMapping("/admin/database")
public class AdminDatabaseController {
	
	
	@Autowired
	private BaseHibernateDomainDAOAbstract baseHibernateDomainDAOAbstract;
	
	@Autowired
	private DatabaseService  dataBaseService;
	
	@Autowired
	private UtilService utilService;
	
	private final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * Get All table name
	 * @return
	 */
	@RequestMapping(value = "/table/list", method = RequestMethod.POST, produces = Constant.JSON_CONTENT_TYPE)
	public @ResponseBody DataTableListResponse getTableList() 
	{
		DataTableListResponse dataTableListResponse;
		try
		{
			dataTableListResponse= dataBaseService.getDataBaseTableList();
			return dataTableListResponse;
		}
		catch (Exception e)
		{
			dataTableListResponse = new DataTableListResponse();
			FaultJson faults = utilService.getFaultsObject(FaultEnum.SYSTEM_ERROR);
			dataTableListResponse.setFaultJson(faults);
			logger.error("Error in getdatabase table() ", e);
			e.printStackTrace();
			return dataTableListResponse;
		}
		
	}
	
	@RequestMapping(value = "/table/data", method = RequestMethod.POST, produces = Constant.JSON_CONTENT_TYPE)
	public @ResponseBody TableDataResponse getTableData(@RequestBody TableDataRequest tableDataRequest) 
	{
		TableDataResponse tabledataResponse;
		try
		{
			tabledataResponse= dataBaseService.getTableData(tableDataRequest);
			return tabledataResponse;
		}
		catch (Exception e)
		{
			tabledataResponse = new TableDataResponse();
			FaultJson faults = utilService.getFaultsObject(FaultEnum.SYSTEM_ERROR);
			tabledataResponse.setFaultJson(faults);
			logger.error("Error in getdatabase table() ", e);
			e.printStackTrace();
			return tabledataResponse;
		}
		
	}
	
}
