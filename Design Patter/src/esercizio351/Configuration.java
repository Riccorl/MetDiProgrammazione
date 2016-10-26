package esercizio351;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Configuration
{
    public final static String FILENAME = "config/project.properties";
    private Map<String, String> config = new HashMap<>();

    static private Configuration configuration;

    private Configuration()
    {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(FILENAME));
            while(br.ready())
            {
                String[] pair = br.readLine().split("=");
                config.put(pair[0], pair[1]);
            }
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }

        // ...
    }

    static public Configuration getInstance()
    {
        if (configuration == null) configuration = new Configuration();
        return configuration;
    }

    public String get(String name)
    {
        return config.get(name);
    }
}
