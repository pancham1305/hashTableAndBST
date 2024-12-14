public class main {
    public static void main(String[] args) {
        WordFrequencyCounter counter = new WordFrequencyCounter();
        String sentence = "To be or not to be";

        counter.countWordFrequency(sentence);
        counter.printWordFrequencies();
    }
}
