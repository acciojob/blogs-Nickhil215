package com.driver.models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "Image")
public class Image {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String description;
  private String dimensions;

  public Image() {
  }

  public Image(String description, String dimensions) {
    this.description = description;
    this.dimensions = dimensions;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDimensions() {
    return dimensions;
  }

  public void setDimensions(String dimensions) {
    this.dimensions = dimensions;
  }

  @ManyToOne
  @JoinColumn
  private Blog blog;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Blog getBlog() {
    return blog;
  }

  public void setBlog(Blog blog) {
    this.blog = blog;
  }
}