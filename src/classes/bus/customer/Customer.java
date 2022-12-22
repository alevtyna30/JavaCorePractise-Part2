package classes.bus.customer;

public class Customer {

    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int id = idGenerator;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private int CardNumber;
    private int BankAccountNumber;

    public Customer(String surname, String name, String middleName, String address, int cardNumber, int bankAccountNumber) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        CardNumber = cardNumber;
        BankAccountNumber = bankAccountNumber;
    }

    public String getName() {
        return name;
    }

    public int getCardNumber() {
        return CardNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", CardNumber=" + CardNumber +
                ", BankAccountNumber=" + BankAccountNumber +
                '}';
    }
}
