public class CustomerManager {
    private Customer customer;
    private Person person;

    private ICreditManager ıcreditManager;

    public  CustomerManager(Customer customer, ICreditManager ıcreditManager){
        this.customer = customer;
        this.ıcreditManager = ıcreditManager;
    }

    public void save(){
        System.out.println("Musteri kaydedildi : ");
    }

    public void delete(){
        System.out.println("Musteri Silindi : ");
    }

    public void giveCredit(){
        ıcreditManager.calculate();
        System.out.println("Kredi verildi");
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
