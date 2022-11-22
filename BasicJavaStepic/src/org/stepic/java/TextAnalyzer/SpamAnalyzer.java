package org.stepic.java.TextAnalyzer;

 class SpamAnalyzer extends KeywordAnalyzer {
     private String[] spamWords;

     public SpamAnalyzer(String[] spamWords) {
         this.spamWords = spamWords;
     }

     @Override
     protected String[] getKeywords() {
         return spamWords;
     }

     @Override
     protected Label getLabel() {
         return Label.SPAM;
     }

//     @Override
//     public Label processText(String text) {
//         String[] target = getKeywords();
//         for(int i = 0; i < target.length; i++) {
//             if(text.contains(target[i])) {
//                 return getLabel();
//             }
//         }
//         return Label.OK;
//     }
 }
