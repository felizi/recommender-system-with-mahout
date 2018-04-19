package net.felizi.recommender.datamodels;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

public class DataModels {

  private static final String PATH = "src/main/resources/";

  public DataModel loadCourses() throws IOException {
    return getDataModel("courses.csv");
  }

  public DataModel loadProducts() throws IOException {
    return getDataModel("products.csv");
  }

  private DataModel getDataModel(String path) throws IOException {
    File file = new File(PATH + path);
    DataModel dataModel = new FileDataModel(file);
    return dataModel;
  }

}
