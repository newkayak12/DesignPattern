package behavioralPattern.chainOfResponsibilityPattern;

import javax.swing.text.AsyncBoxView.ChildLocator;

public class ChainofResponsibilityClient {
	private static Logger doChaining(){
		Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);

		Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
		consoleLogger.setNextLevelLogger(errorLogger);

		Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
		errorLogger.setNextLevelLogger(debugLogger);

		return consoleLogger;
	}	

	public static void main(String[] args) {
		Logger chainLogger = doChaining();

		chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values");
		chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
		chainLogger.logMessage(Logger.DEBUGINFO, "this was the error now debugging is completed");
	}
}


/*
	구조 조금만 더 살펴보자
*/
