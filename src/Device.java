public class Device {
    String code;
    String producer;
    String type;
    double price;

    Device(String kod, String ktoZrobil, String typ) {
        this.code = kod;
        this.producer = ktoZrobil;
        this.type = typ;
    }

    Device(String kod, String ktoZrobil, String typ, double zaIle) {
        this(kod, typ, ktoZrobil);
        this.price = zaIle;
    }

    String getInfo() {
        return "Kod: " + code + " " + ", Producent: " + producer + ", Typ: " + type + ", Cena: " + price;

    }
}