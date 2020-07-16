import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;

import java.util.UUID;

public class Resource {
  private String id;
  private String name;
  private String description;
  private Data data;

  public Resource(String name, String description) {
    this.id = UUID.randomUUID().toString();
    this.name = name;
    this.description = description;
  }

  public Data createData(String data) {
    JSONParser parser = new JSONParser();
    JSONObject dataObj = (JSONObject) parser.parse(data);
    this.data = new Data(dataObj);
    return this.data;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }
}
