public class Avto {
    //описати класс автомобіля з полями: марка, колір, номер, рік випуску, дані про власника
    //поля мають бути приватними
    private String marka;
    private String kolor;
    private String nomer;
    private int rikVypuska;
    private String vlasyhnik;



    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public int getRikVypuska() {
        return rikVypuska;
    }

    public void setRikVypuska(int rikVypuska) {
        this.rikVypuska = rikVypuska;
    }

    public String getVlasyhnik() {
        return vlasyhnik;
    }

    public void setVlasyhnik(String vlasyhnik) {
        this.vlasyhnik = vlasyhnik;
    }
}
