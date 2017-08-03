package adp.tcs.implementation;

import java.util.ArrayList;



import adp.tcs.utilities.ReportMapping;

public class BaseTemplateSteps {
	
    public static ReportMapping reportMapping = null;
    public static ArrayList<ReportMapping> comprehensiveMap = new ArrayList<ReportMapping>();
    public static String envName = null;
    
    public String getEnvName() {
		return envName;
	}

	public void setEnvName(String envName) {
		BaseTemplateSteps.envName = envName;
	}

}
