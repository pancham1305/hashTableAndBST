import java.util.Objects;

class WordFrequencyCounter {
    private MyLinkedList<String, Integer> frequencyMap;

    public WordFrequencyCounter() {
        frequencyMap = new MyLinkedList<>();
    }

    // Count frequency of words in a sentence
    public void countWordFrequency(String sentence) {
        // Convert to lowercase and split into words
        String[] words = sentence.toLowerCase().split("\\s+");

        for (String word : words) {
            // Get current frequency or default to 0
            Integer currentFreq = frequencyMap.get(word);
            int newFreq = (currentFreq == null) ? 1 : currentFreq + 1;

            // Add/Update frequency
            frequencyMap.add(word, newFreq);
        }
    }

    // Print word frequencies
    public void printWordFrequencies() {
        System.out.println("Word Frequencies:");
        frequencyMap.printList();
    }

}
