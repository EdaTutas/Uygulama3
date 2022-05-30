class Diller {

    private String isim;

    public Diller(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Konusuluyor";
    }
}


class Turkce extends Diller {

    public Turkce(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "Turkce konusuluyor";
    }
}


class Ingilizce extends Diller {
    public Ingilizce(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "Ingilizce konusuluyor";
    }
}


class Almanca extends Diller {
    public Almanca(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "Almanca konusuluyor";
    }
}


public class Main {


    public static void main(String[] args) {

        Diller dil1 = new Turkce("Turkce  = ");
        Diller dil2 = new Ingilizce("Ingilizce  = ");
        Diller dil3 = new Almanca("Almanca  = ");

        System.out.println(dil1.konus());
        System.out.println(dil2.konus());
        System.out.println(dil3.konus());


    }
}


//Polymorphism



