package structuralPattern.facadePattern;


public class Main {
	public static void main(String[] args) {
		String tableName="Employee";
		
		//generating MySql HTML report and Oracle PDF report using Facade
		HelpFacade.generateReport(HelpFacade.DBtype.MYSQL, HelpFacade.ReportType.HTML, tableName);
		HelpFacade.generateReport(HelpFacade.DBtype.ORACLE, HelpFacade.ReportType.PDF, tableName);
	}
}
