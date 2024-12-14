public class main {
    
    public static void main(String[] args) {
        WordFrequencyAnalyzer analyzer = new WordFrequencyAnalyzer();

        String paragraph = "Paranoids are not paranoid because they are paranoid " +
                "but because they keep putting themselves deliberately " +
                "into paranoid avoidable situations";

        
        analyzer.analyzeFrequency(paragraph);

        
        analyzer.printWordFrequencies();
    }
}