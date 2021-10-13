package structuralPattern.facadePattern;

import java.sql.Connection;

import javax.swing.text.html.HTML;

public class HelpFacade {

	public static void generateReport(DBtype dbType, ReportType reportType, String tableName){
		Connection con ;
		switch(dbType){
			case MYSQL:
			con = MysqlHelper.getMysqlDBConnection();
			MysqlHelper mysqlHelper = new MysqlHelper();
			switch(reportType){
				case HTML : 
					mysqlHelper.generateMysqlHTMLReport(tableName, con);
					break;
				case PDF : 
					mysqlHelper.generateMysqlPDFReport(tableName, con);
					break;
			}

			break;

			case ORACLE:
			con = OracleHelper.getMysqlDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch(reportType){
				case HTML : 
					oracleHelper.generateMysqlHTMLReport(tableName, con);
					break;
				case PDF : 
					oracleHelper.generateMysqlPDFReport(tableName, con);
					break;
			}
			
			break;
		}
	}

	public static enum DBtype{
		MYSQL,ORACLE;
	}
	public static enum ReportType{
		HTML,PDF;
	}
	
}
