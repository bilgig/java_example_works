package threads.thread03;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TranslationMain {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        String textToTranslate="Hello, where are you from?";
        String targetLanguage="es";
        String[] availableLanguage={"es","fr","tr","ae","de"};
        for(String language :availableLanguage){
            if (!language.equals(targetLanguage)) {
                Runnable translation=new Translation(textToTranslate,language,targetLanguage);
                executorService.execute(translation);
            }
        }
        executorService.shutdown();
    }
}
