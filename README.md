# Annotation-Config

### @ConfigPath annotation

```java
public class Messages {
  
    @ConfigPath(path = "exampleString")
    public static String EXAMPLE_STRING = "This is an example message.";
  
    @ConfigPath(path = "exampleInt")
    public static int EXAMPLE_INT = 2021;
  
    @ConfigPath(path = "exampleLong")
    public static long EXAMPLE_LONG = 401234543l;
    
     @ConfigPath(path = "exampleExportString", name = "exported-config")
    public static long EXAMPLE_EXPORT_STRING = "This string was exported.";
}
```

### Config file initialize
```java
public class ExamplePlugin extends JavaPlugin {

    private ConfigFile simpleConfig, exportConfig;
  
    @Override
    public void onEnable() {
        simpleConfig = new ConfigFile(this, "config")
                .registerClass(Messages.class)
                .createFile(true)
                .loadConfig();
        simpleConfig = new ConfigFile(this, "exported-config")
                .registerClass(Messages.class)
                .export()
                .loadConfig();
    }
}
```
