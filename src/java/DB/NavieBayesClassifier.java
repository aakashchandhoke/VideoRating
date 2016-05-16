/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;

import Analayse.com.datumbox.opensource.classifiers.NaiveBayes;
import Analayse.com.datumbox.opensource.dataobjects.NaiveBayesKnowledgeBase;
import static Analayse.com.datumbox.opensource.examples.NaiveBayesExample.readLines;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DKG
 */
public class NavieBayesClassifier {
    public static void main(String args[]){
    analayseData("It was a very good receipe");
    }
    public static String analayseData(String input){
          String output = null;
        try{
          Map<String, URL> trainingFiles = new HashMap<String, URL>();
        trainingFiles.put("positive", NavieBayesClassifier.class.getResource("/datasets/positive.txt"));
        trainingFiles.put("negative", NavieBayesClassifier.class.getResource("/datasets/negative.txt"));
        
        //loading examples in memory
        Map<String, String[]> trainingExamples = new HashMap<String, String[]>();
        for(Map.Entry<String, URL> entry : trainingFiles.entrySet()) {
            trainingExamples.put(entry.getKey(), readLines(entry.getValue()));
        }
        
        //train classifier
        NaiveBayes nb = new NaiveBayes();
        nb.setChisquareCriticalValue(1.63); //0.01 pvalue
        nb.train(trainingExamples);
        
        //get trained classifier knowledgeBase
        NaiveBayesKnowledgeBase knowledgeBase = nb.getKnowledgeBase();
        
        //nb = null;
      //  trainingExamples = null;
        
        
        //Use classifier
        nb = new NaiveBayes(knowledgeBase);
        
         output = nb.predict(input);
       // System.out.format("The company \"%s\" was classified as \"%s\".%n", exampleEn, outputEn);
          System.out.format("The Moode  \"%s\" was classified as \"%s\".%n", input, output);
        }catch(Exception e){}
    return output;
    }
}
