import java.util.HashMap;
import java.util.Map;

public interface ConfigurationInterface {
    Map<String, AlertConfig> configMap = new HashMap<>();
    Map<String, DispatchStrategy> dispatchStrategy = new HashMap<>();
    String client = null;
    String eventType = null;
    void setConfiguration(AlertConfigParent alertConfigParent);
    AlertConfigParent alertConfigParent = new AlertConfigParent();
    void getConfiguration(String client);
}
