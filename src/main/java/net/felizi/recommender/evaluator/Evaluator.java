package net.felizi.recommender.evaluator;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

import net.felizi.recommender.builder.Builder;

public class Evaluator {
  private final static double TRAINING_PERCENTAGE = 0.9;
  private final static double EVALUATION_PERCENTAGE = 1.0;

  public double execute(DataModel dataModel) throws TasteException {
    RandomUtils.useTestSeed();
    AverageAbsoluteDifferenceRecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
    RecommenderBuilder builder = new Builder();
    return evaluator.evaluate(builder, null, dataModel, TRAINING_PERCENTAGE, EVALUATION_PERCENTAGE);
  }
}
