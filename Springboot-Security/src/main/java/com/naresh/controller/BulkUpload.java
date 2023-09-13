package com.naresh.controller;

import org.springframework.web.multipart.MultipartFile;

public interface BulkUpload {
	
	
	public void processEmployeeBulkUpload(int orgId, MultipartFile file);

}
