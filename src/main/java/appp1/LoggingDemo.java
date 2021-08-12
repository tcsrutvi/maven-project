package appp1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Log levels: T-trace, D-debug, I-info, W-warn , E-error, F- fatal
//fatal is of highest priority

public class LoggingDemo {

	private static Logger logger = LogManager.getLogger(LoggingDemo.class);
	public static void main(String[] args) {
		//System.out.println();  //never use this
		logger.fatal("fatal message");
		logger.error("error message");
		logger.warn("warning message");
		logger.info("Info message");
		logger.debug("debug message");
		logger.trace("trace message");
	}
}
