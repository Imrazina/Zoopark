
package zoopark;

public class Cat extends fullpack implements Domestic{
    private String personName;
    private String address;
    private String name;
   
    public Cat(String personName, String address, String name) {
        super("cat", 4, "Meow");
        this.address = address;
        this.personName = personName;
        this.name = name;  
    }

    @Override
    public String getPerson() {
        return personName;
    }

    @Override
    public void setPerson(String personName) {
        this.personName = personName;
    }

    @Override
    public String getAdress() {
        return address;
    }

    @Override
    public void setAdress(String address) {
        this.address = address;
    }
 
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
    return name + " {" + "Vid = " + this.getVid() + ", personName = " + personName + ", address = " + address + ", pronauns = " + this.getPronauns() +'}';
    }

}
