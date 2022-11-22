package org.stepic.java.TextAnalyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        String[] target = getKeywords();
        for(int i = 0; i < target.length; i++) {
            if(text.contains(target[i])) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
