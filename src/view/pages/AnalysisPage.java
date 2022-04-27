package view.pages;

import RandonForest.RandomForest;

public class AnalysisPage extends HomePage {
    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName());
        System.out.println("To perform an analysis, enter your data:");
        RandomForest forest = new RandomForest();
        forest.getAnalysis();
        super.goToBack();

    }
}
