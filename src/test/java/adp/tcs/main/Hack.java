package adp.tcs.main;

import adp.tcs.implementation.ReportSend;
import adp.tcs.utilities.GenerateTabularReport;

public class Hack {
	private static final String workingDir = System.getProperty("user.dir");
	private static final String customReportPath = workingDir + "\\target\\CustomReport\\AutmationReport.html";
	
	public static void main(String[] args) {
		

		
		GenerateTabularReport generateTabularReport = new GenerateTabularReport();
		generateTabularReport.generateReportFile(generateTabularReport.getReportData(),customReportPath);
    	ReportSend reportSend= new ReportSend();
		reportSend.send();
		
		

	}

}
