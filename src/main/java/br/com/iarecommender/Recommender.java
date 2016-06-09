package br.com.iarecommender;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericBooleanPrefItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;

public class Recommender {
	
	public static void main(String[] args) throws TasteException, IOException {
		File data = new File("/home/webster/Projects/unesp/ia/projeto/recommender/src/main/resources/data.csv");
		
		DataModel dataModel = new FileDataModel(data);
		ItemSimilarity similarity = new TanimotoCoefficientSimilarity(dataModel);
		GenericBooleanPrefItemBasedRecommender recommender = new GenericBooleanPrefItemBasedRecommender(dataModel, similarity);
		
		List<RecommendedItem> recommendations = recommender.recommend(2, 3);
		for (RecommendedItem item : recommendations) {
			System.out.println(item);
		}
	}

}
