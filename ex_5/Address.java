//Використовуючи IDEA, створіть проект із пакетом. Потрібно: Створити клас із ім'ям Address.
// У тілі класу потрібно створити поля: index, country, city, street, house, apartment.
// Для кожного поля створити метод з двома методами доступу (get, set)
// Створити екземпляр класу Address. У поля екземпляра записати інформацію про поштову адресу.
// Виведіть на екран значення полів, що описують адресу.

package ex_5;

public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public static void main(String[] args) {
        Address home = new Address();
        home.index = 65458;
        home.country = "Ukraine";
        home.city = "Odessa";
        home.street = "Sonyachna";
        home.house = 10;
        home.apartment = 45;
        System.out.println("index = " + home.index + "\ncountry = " + home.country + "\ncity = " + home.city + "\nstreet = " + home.street + "\nhouse = " + home.house + "\napartment = " + home.apartment);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }




}
