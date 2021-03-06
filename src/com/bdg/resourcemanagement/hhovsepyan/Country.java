package hhovsepyan;

public enum Country {



    AM("Armenia", "Yerevan"),

    RU("Russia", "Moscow"),

    US("USA", "Washington");





    private final String countryName;

    private final String city;



    Country(String countryName, String city) {

        this.countryName = countryName;

        this.city = city;

    }



    public String getCountryName() {

        return this.countryName;

    }



    public String getCity() {

        return this.city;

    }



    @Override

    public String toString() {

        return "Country{" +

                "countryName='" + countryName + '\'' +

                ", city='" + city + '\'' +

                '}';

    }

}
