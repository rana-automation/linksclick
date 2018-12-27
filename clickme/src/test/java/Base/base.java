package Base;

public class base {

    protected String Tier;

    protected void selectEnvTestData() {
        Tier = readTier();
        if (Tier.equalsIgnoreCase("INT"))
        {
            readPropertiesFiles("IntEnv.properties");
        } else if (Tier.equalsIgnoreCase("Stage"))
        {
            readPropertiesFiles("StageEnv.properties");
        } else if (Tier.equalsIgnoreCase("Test"))
        {
            readPropertiesFiles("TestEnv.properties");
        }
        else if (Tier.equalsIgnoreCase("Prod")) {
            readPropertiesFiles("ProdEnv.properties");
        }
        else if (Tier.equalsIgnoreCase("Pref")) {
            readPropertiesFiles("PrefEnv.properties");
        }
    }
    protected String readTier() {
        return (System.getProperty("Tier"));
    }



}
