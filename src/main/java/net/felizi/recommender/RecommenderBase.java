package net.felizi.recommender;

import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

import net.felizi.recommender.builder.Builder;

public class RecommenderBase {
  public List<RecommendedItem> recommend(DataModel dataModel, long userID, int howMany) throws TasteException {
    return new Builder().buildRecommender(dataModel).recommend(userID, howMany);
  }
}
