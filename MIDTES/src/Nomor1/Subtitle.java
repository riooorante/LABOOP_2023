package Nomor1;
public class Subtitle {
    private String language;
    private String translator;

    public Subtitle(String language, String translator) {
        this.language = language;
        this.translator = translator;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }
}
