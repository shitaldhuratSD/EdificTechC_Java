package com.tyss.trainingmaintenance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.trainingmaintenance.dao.BatchInfoDAO;
import com.tyss.trainingmaintenance.dao.CalendarEventDAO;
import com.tyss.trainingmaintenance.dto.BatchInfo;
import com.tyss.trainingmaintenance.dto.CalendarEvent;

@Service
public class ServiceDAOImpl implements ServiceDAO {
	
	@Autowired
	BatchInfoDAO dao;
	
	@Autowired
	CalendarEventDAO cdao;
	
	@Override
	public BatchInfo addBatch(BatchInfo batch) {
		return dao.addBatch(batch);
	}

	@Override
	public CalendarEvent addEvent(CalendarEvent event) {
		return cdao.addEvent(event);
	}

	@Override
	public List<CalendarEvent> getAllEvent() {
		return cdao.getAllEvent();
	}

}
