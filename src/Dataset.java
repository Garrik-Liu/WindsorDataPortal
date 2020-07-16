import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Dataset {
  private String id;
  private String title;
  private String description;
  private String visibility;
  private String author;
  private String authorEmail;
  private String maintainer;
  private String maintainerEmail;
  private List<Tag> tagList;
  private List<Resource> resourceList;
  private Publisher publisher;
  private Organization organization;

  public Dataset(String title, String description, String author, String authorEmail, String maintainer, String maintainerEmail) {
    this.id = UUID.randomUUID().toString();
    this.title = title;
    this.description = description;
    this.author = author;
    this.authorEmail = authorEmail;
    this.maintainer = maintainer;
    this.maintainerEmail = maintainerEmail;
  }

  public List<Tag> addTags(String[] tags) {
    for(String tagName : tags) {
      Tag tag = new Tag(tagName);
      tagList.add(tag);
    }
    return tagList;
  }

  public List<Resource> createResource(String name, String description, String data) {
    Resource resource = new Resource(name, description);
    resource.createData(data);
    resourceList.add(resource);
    return resourceList;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getAuthorEmail() {
    return authorEmail;
  }

  public void setAuthorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
  }

  public String getMaintainer() {
    return maintainer;
  }

  public void setMaintainer(String maintainer) {
    this.maintainer = maintainer;
  }

  public String getMaintainerEmail() {
    return maintainerEmail;
  }

  public void setMaintainerEmail(String maintainerEmail) {
    this.maintainerEmail = maintainerEmail;
  }

  public List<Tag> getTagList() {
    return tagList;
  }

  public void setTagList(List<Tag> tagList) {
    this.tagList = tagList;
  }

  public List<Resource> getResourceList() {
    return resourceList;
  }

  public void setResourceList(List<Resource> resourceList) {
    this.resourceList = resourceList;
  }

  public Publisher getPublisher() {
    return publisher;
  }

  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }

  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }
}
