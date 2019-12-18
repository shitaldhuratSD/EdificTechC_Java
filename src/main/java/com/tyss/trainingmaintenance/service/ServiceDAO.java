package com.tyss.trainingmaintenance.service;

import java.util.List;

import com.tyss.trainingmaintenance.dto.BatchInfo;
import com.tyss.trainingmaintenance.dto.CalendarEvent;

public interface ServiceDAO {
	public BatchInfo addBatch(BatchInfo batch);
	public CalendarEvent addEvent(CalendarEvent event);
	public List<CalendarEvent> getAllEvent();
}
