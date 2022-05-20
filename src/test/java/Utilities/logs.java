package Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logs {
	Logger log;
	
	public Logger createLog() {
		log=LogManager.getLogger(getClass());
		return log;
	}
	

}
