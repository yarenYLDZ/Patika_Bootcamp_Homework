package Week_3.FilmVeKoleksiyonFiltreleme;

public class Film {

    private final String ad;
    private final int yayinYili;
    private final String tur;
    private final double imdbPuani;

    public Film (String ad, int yayinYili, String tur, double imdbPuani){

        this.ad=ad;
        this.yayinYili=yayinYili;
        this.tur=tur;
        this.imdbPuani=imdbPuani;
    }

    public String getAd() {
        return ad;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public String getTur() {
        return tur;
    }

    public double getImdbPuani() {
        return imdbPuani;
    }

    // Varsayılan toString yerine film bilgilerini düzgün göstermek için override edildi
    @Override
    public String toString() {
        return "Film{" +
                "ad='" + ad + '\'' +
                ", yayin Yili=" + yayinYili +
                ", tur='" + tur + '\'' +
                ", imdb Puani=" + imdbPuani +
                '}';
    }
}
