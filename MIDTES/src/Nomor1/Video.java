package Nomor1;

public class Video {
    protected String title;
    protected String genre;
    protected int releaseYear;
    protected Subtitle subtitle;
    protected int duration;

    public Video(String title, String genre, int releaseYear, Subtitle subtitle, int duration) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.subtitle = subtitle;
        this.duration = duration;
    }

    public Video(String title, String genre, int releaseYear, Subtitle subtitle) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Subtitle getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void showDetail(){
        System.out.printf("Judul       : %s%n", this.getTitle());
        System.out.printf("Genre       : %s%n", this.getGenre());
        System.out.printf("Tahun Rilis : %d%n", this.getReleaseYear());
        System.out.printf("Subtitle    : %s (%s)%n", this.getSubtitle().getLanguage(), this.subtitle.getTranslator());

    }
}
class Movie extends Video{
    public Movie(String title, String genre, int releaseYear, Subtitle subtitle, int duration) {
        super(title, genre, releaseYear, subtitle, duration);
    }
    @Override
    public void showDetail() {
        super.showDetail();
        System.out.printf("Duration    : %d%n", this.getDuration());
    }
}
class Series extends Video{
    private int eps;

    public int getEps() {
        return eps;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    private int season;
    public Series(String title, String genre, int releaseYear, Subtitle subtitle, int eps, int season) {
        super(title, genre, releaseYear, subtitle);
        this.eps = eps;
        this.season = season;
    }

    @Override
    public void showDetail() {
        super.showDetail();
        System.out.printf("Jumlah Episode   : %d%n", this.getEps());
        System.out.printf("Jumlah Season    : %d%n", this.getSeason());
    }
}
