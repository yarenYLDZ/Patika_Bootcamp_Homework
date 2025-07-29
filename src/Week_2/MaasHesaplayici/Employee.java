package Week_2.MaasHesaplayici;

public class Employee {

    String ad;
    double maas;
    int haftalikCalismaSaati;
    int iseBaslangic;

    public Employee(String ad, double maas, int haftalikCalismaSaati,int iseBaslangic){

        this.ad =ad;
        this.maas =maas;
        this.haftalikCalismaSaati =haftalikCalismaSaati;
        this.iseBaslangic =iseBaslangic;

    }
    public double vergiHesapla() {
        if (this.maas < 1000) {
            return 0.0;
        } else {
            return this.maas *0.03;
        }
    }

    public double bonusHesapla(){
        if(this.haftalikCalismaSaati >40){
            return (this.haftalikCalismaSaati -40)*30;
        }else{
            return 0;
        }
    }

    public double maasArtisHesapla(){
        int guncelYil=2025;
        int calismaSuresi=guncelYil-this.iseBaslangic;

        if(calismaSuresi<10){
            return this.maas *0.05;

        } else if (calismaSuresi<20){
            return this.maas *0.10;
        }else{
            return this.maas *0.15;
        }
    }

    public String toString(){
        double vergi= vergiHesapla();
        double bonus= bonusHesapla();
        double zam= maasArtisHesapla();

        double vergiVeBonus = this.maas - vergi + bonus;
        double toplamMaas=this.maas +zam;

        return "Adı : " + this.ad +
                "\nMaaşı : " + this.maas +
                "\nÇalışma Saati : " + this.haftalikCalismaSaati +
                "\nBaşlangıç Yılı : " + this.iseBaslangic +
                "\nVergi : " + vergi +
                "\nBonus : " + bonus +
                "\nMaaş Artışı : " + zam +
                "\nVergi ve Bonuslar ile birlikte maaşi : " + vergiVeBonus +
                "\nToplam Maaş : " + toplamMaas;


    }
}
