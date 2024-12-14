public class WordManagementAnalyzer {
    private MyHashTable<String, Integer> frequencyMap;

    public WordManagementAnalyzer() {
        frequencyMap = new MyHashTable<>();
    }

    public void analyzeFrequency(String paragraph) {

        String cleanedParagraph = cleanText(paragraph);

        String[] words = cleanedParagraph.split("\\s+");

        for (String word : words) {

            Integer currentFreq = frequencyMap.get(word);
            int newFreq = (currentFreq == null) ? 1 : currentFreq + 1;

            frequencyMap.put(word, newFreq);
        }
    }

    public String removeWord(String paragraph, String wordToRemove) {

        String cleanedParagraph = cleanText(paragraph);
        String[] words = cleanedParagraph.split("\\s+");

        frequencyMap.remove(wordToRemove);

        StringBuilder rebuiltParagraph = new StringBuilder();
        for (String word : words) {
            if (!word.equals(wordToRemove)) {
                rebuiltParagraph.append(word).append(" ");
            }
        }

        return rebuiltParagraph.toString().trim();
    }

    private String cleanText(String text) {

        return text.toLowerCase()
                .replaceAll("[^a-zA-Z\\s]", "");
    }

    public void printWordFrequencies() {
        System.out.println("Word Frequencies:");
        frequencyMap.printHashTable();
    }
}