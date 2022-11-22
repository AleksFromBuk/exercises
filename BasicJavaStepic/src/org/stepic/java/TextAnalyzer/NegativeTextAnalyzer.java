package org.stepic.java.TextAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] angrySmail = {":(", "=(", ":|"};


    public NegativeTextAnalyzer() {

    };

    @Override
    protected String[] getKeywords() {
        return angrySmail;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

//    @Override
//    public Label processText(String text) {
//        String[] target = getKeywords();
//        for(int i = 0; i < target.length; i++) {
//            if(text.contains(target[i])) {
//                return getLabel();
//            }
//        }
//        return Label.OK;
//    }
}
