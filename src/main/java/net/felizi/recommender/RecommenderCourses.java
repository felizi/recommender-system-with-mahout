package net.felizi.recommender;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

import net.felizi.recommender.datamodels.DataModels;
import net.felizi.recommender.evaluator.Evaluator;

public class RecommenderCourses extends RecommenderBase {

  public static void main(String[] args) throws IOException, TasteException {
    DataModel dataModel = new DataModels().loadCourses();
    RecommenderBase recommender = new RecommenderBase();
    List<RecommendedItem> recommendations = recommender.recommend(dataModel, 1, 3);
    for (RecommendedItem recommendation : recommendations) {
      System.out.println(recommendation);
    }
    Evaluator evaluator = new Evaluator();
    double error = evaluator.execute(dataModel);
    System.out.println("Score: " + error);
  }
}
