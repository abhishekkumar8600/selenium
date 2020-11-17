package abhishek;
import org.apache.logging.log4j.*;

public class Log4j2 {
       private static Logger log=LogManager.getLogger(Log4j2.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		log.debug("i am debugging ");
		
		if(5>4)
		{
			log.info("info");
			log.error("error");
			log.fatal("fatal");
		}
		

	}

}
