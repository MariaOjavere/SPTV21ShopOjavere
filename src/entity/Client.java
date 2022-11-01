
package entity;

public class Client {
private String FirstName;
private String LastName;
private String Phone;
private int Cash;

    public Client() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getCash() {
        return Cash;
    }

    public void setCash(int Cash) {
        this.Cash = Cash;
    }


    @Override
    public String toString() {
        return "Client{" + "FirstName=" + FirstName + ", LastName=" + LastName + ", Phone=" + Phone + ", Cash=" + Cash + '}';
    }



}
