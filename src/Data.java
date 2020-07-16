import org.json.JSONObject;

import java.util.UUID;

public class Data {
  private String id;
  private JSONObject data;

  public Data(JSONObject data) {
    this.id = UUID.randomUUID().toString();
    this.data = data;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JSONObject getData() {
    return data;
  }

  public void setData(JSONObject data) {
    this.data = data;
  }
}
