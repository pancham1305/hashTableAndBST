import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFrequencyAnalyzer {
    private MyHashTable<String, Integer> frequencyMap;

    public WordFrequencyAnalyzer() {
        frequencyMap = new MyHashTable<>();
    }

    // Analyze word frequencies in a paragraph
    public void analyzeFrequency(String paragraph) {
        // Remove punctuation and convert to lowercase
        String cleanedParagraph = cleanText(paragraph);

        // Split into words
        String[] words = cleanedParagraph.split("\\s+");

        // Count frequencies
        for (String word : words) {
            // Get current frequency or default to 0
            Integer currentFreq = frequencyMap.get(word);
            int newFreq = (currentFreq == null) ? 1 : currentFreq + 1;

            // Add/Update frequency
            frequencyMap.put(word, newFreq);
        }
    }

    // Clean text by removing punctuation
    private String cleanText(String text) {
        // Convert to lowercase and remove punctuation
        return text.toLowerCase()
                .replaceAll("[^a-zA-Z\\s]", "");
    }

    // Print word frequencies
    public void printWordFrequencies() {
        System.out.println("Word Frequencies:");
        frequencyMap.printHashTable();
    }
}