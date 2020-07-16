public class Publisher {
  private String id;
  private String name;
  private String email;
  private Organization organization;

  public Dataset createDataset(String title, String description, String author, String authorEmail, String maintainer, String maintainerEmail) {
    Dataset dataset = new Dataset(title, description, author, authorEmail, maintainer, maintainerEmail);
    dataset.setPublisher(this);
    dataset.setOrganization(organization);
    return dataset;
  }

  public void addTags(Dataset dataset, String[] tags) {
    dataset.addTags(tags);
  }

  public void addResource(Dataset dataset, String name, String description, String data) {
    dataset.createResource(name, description, data);
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }
}
