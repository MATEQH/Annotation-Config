# Annotation-Config

## Example

### (@ConfigPath annotation)

```java
public class Messages {
  
  @ConfigPath(path = "exampleString")
  public static String EXAMPLE_STRING = "This is an example message.";
  
  @ConfigPath(path = "exampleInt")
  public static int EXAMPLE_INT = 2021;
  
  @ConfigPath(path = "exampleLong")
  public static long EXAMPLE_LONG = 401234543l;
}
```
