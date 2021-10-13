package structuralPattern.facadePattern;

public class Main {
	public static void main(String[] args) {
		String tableName="Employee";
		
		//generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelpFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelpFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}
}
