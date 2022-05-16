package Altex.config;

import Altex.pageDefinition.SauceDemoPageDefinition;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jConfig {

        public Logger log = Logger.getLogger(SauceDemoPageDefinition.class);

        public void propertiesConfigure()
        {
            PropertyConfigurator.configure("./src/main/resources/log4j.properties");
        }

}
