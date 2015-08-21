package com.hotel.service;

import java.util.Map;

public interface StaffService {
	Map<String, Object> queryStaffMenu(long staffId, long parentMenuCode);

}
