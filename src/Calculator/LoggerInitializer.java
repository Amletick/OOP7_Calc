package Calculator;
import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerInitializer {
    public static Logger getLogger(String loggerName) {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("log.config"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Logger.getLogger(loggerName);
    }
}
