package threads.thread03;

public class Translation implements Runnable{
    private final String text;
    private final String sourceLanguage;
    private final String targetLanguage;

    public Translation(String text, String sourceLanguage, String targetLanguage) {
        this.text = text;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
    }

    @Override
    public void run() {
        System.out.println("Translation from "+sourceLanguage+" to "+ targetLanguage+": "+translate(text));
    }

    private String translate(String text){
        return text+" translated";
    }
}
