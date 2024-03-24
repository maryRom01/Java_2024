enum Country {
    CANADA("CAD"),
    POLAND("PLN"),
    GERMANY("EUR"),
    LAOPAPAS,
    ZIMKABU();

    String currency;

    Country(String currency) {
        this.currency = currency;
    }

    Country() {
    }
}

public class EnumExample {
    public static void main(String[] args) {
        for (Country country : Country.values()) {
            System.out.println(country + ", " + country.currency);
        }
    }
}
