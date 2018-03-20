package org.sdrc.bbbp.service;

import java.util.List;

import org.json.simple.JSONObject;
import org.sdrc.bbbp.models.DataCollectionModel;
import org.sdrc.bbbp.models.LineChartData;

public interface ThematicDashboardViewService {

	
	DataCollectionModel fetchData(String indicatorId, String sourceNid, String areaId, String timeperiodId, Integer childLevel);

	List<LineChartData> getLineChartData(Integer area_NId, Integer indicator_NId, Integer periodicity, Integer timePeriod_NId, Integer facilityTypeId);

	JSONObject getThematicTableViewData(Integer sectorNid, Integer timePeriod_NId,Integer areaNid, Integer facilityTypeId);

	DataCollectionModel fetchMapData(String indicatorId, String sourceNid, String areaId, String timeperiodId, Integer parentAreaId, Integer facilityTypeId);
	
}
