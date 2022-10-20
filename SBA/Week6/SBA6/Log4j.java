package SBA6;
import org.apache.log4.BasicConfigurator;
import org.apache.log4.Logger;
public class Log4j {
	static java.util.logging.Logger log= Logger.getLogger(Log4j.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		log.info("Print info");
		log.debug("Debug message");
		log.trace("trace message");
		log.warn("Warning message");
		log.error("Error message");
		log.fatal("Fatal message`");
		

	}

}
