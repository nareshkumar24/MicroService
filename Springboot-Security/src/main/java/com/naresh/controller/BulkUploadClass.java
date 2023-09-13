package com.naresh.controller;

import org.springframework.web.multipart.MultipartFile;

public class BulkUploadClass  implements BulkUpload{

	@Override
	public void processEmployeeBulkUpload(int orgId, MultipartFile file) {

//		@Override
//		public void processEmployeeBulkUpload(int orgId, MultipartFile excelFile) {
//			try {
//				Workbook workbook = WorkbookFactory.create(excelFile.getInputStream());
//				Sheet sheet = workbook.getSheetAt(0);
//
//				for (Row row : sheet) {
//					if (row.getRowNum() == 0) {
//						continue;
//					}
//					DmsEmployee employee = new DmsEmployee();
//					Iterator<Cell> cellIterator = row.cellIterator();
//
//					while (cellIterator.hasNext()) {
//						Cell cell = cellIterator.next();
//						String columnName = getColumnName(cell.getColumnIndex());
//
//						switch (columnName) {
//						case "Employee Name":
//							employee.setEmpName(getCellValueAsString(cell));
//							break;
//						case "Email":
//							employee.setEmail(getCellValueAsString(cell));
//							break;
//						case "Mobile":
//							employee.setMobile(getCellValueAsString(cell));
//							break;
//						case "Password":
//							employee.setPassword(PasswordEncryptor.encrypt(getCellValueAsString(cell)));
//							break;
//						case "Username":
//							employee.setUsername(getCellValueAsString(cell));
//							break;
//						case "Basic Salary":
//							employee.setBasicSal(getCellValueAsString(cell));
//							break;
//						case "Prev Experience":
//							employee.setPrevExperience(getCellValueAsString(cell));
//							break;
//						case "Approver Manager":
//							employee.setApproverManager(getManagerByName(orgId, getCellValueAsString(cell)));
//							break;
//						case "Reporting Manager":
//							employee.setReportingManager(getManagerByName(orgId, getCellValueAsString(cell)));
//							break;
//						default:
//							break;
//						}
//					}
//					Optional<DmsOrganization> dbOrganization = dmsOrganizationRepository.findById(orgId);
//					if (dbOrganization.isPresent()) {
//						DmsOrganization organization = dbOrganization.get();
//						employee.setDmsOrganization(organization);
//					}
//					employee.setStatus("Active");
//					dmsEmployeeRepository.save(employee);
//				}
//			} catch (IOException | EncryptedDocumentException e) {
//				log.error("Error while parsing the Employee Bulk Upload Excel ", e);
//			}
//		}
//
//		private DmsEmployee getManagerByName(int orgId, String employeeName) {
//			try {
//				DmsEmployee employeeByOrgIdAndEmployeeName = dmsEmployeeRepository.getEmployeeByOrgIdAndEmployeeName(orgId,
//						employeeName);
//				return employeeByOrgIdAndEmployeeName;
//			} catch (Exception e) {
//				return null;
//			}
//		}
//
//		private String getCellValueAsString(Cell cell) {
//			return cell.getCellType() == CellType.STRING ? cell.getStringCellValue() : "";
//		}
//
//		@SuppressWarnings("unused")
//		private Date getCellValueAsDate(Cell cell) {
//			Date dateValue = null;
//			try {
//				dateValue = cell.getDateCellValue();
//			} catch (IllegalStateException ignored) {
//			}
//			return dateValue;
//		}


	}

}
