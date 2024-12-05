package oggy;

import java.util.Objects;

public class OggyTeam {

    // Encapsulation
    // thể hiện tất cả thuộc tính của đối tượng

    private int id;
    private String name;
    private String address;

    // constructor
    public OggyTeam() {
    }

    public OggyTeam(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // getter
    public int getId() {
        return id;
    }

    // setter - void không trả về giá trị
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    // method to work
    public void muaNuoc() {
        System.out.println("di Mua nước");
    }

    public void muaDoAn() {
        muaDoDongVat();
        muaChatXo();
    }

    private void muaDoDongVat() {
        System.out.println("mua thit");
        System.out.println("mua trung");
        System.out.println("mua ca");
    }

    private void muaChatXo() {
        System.out.println("mua rau");
        System.out.println("mua dua");
    }

















    @Override
    public String toString() {
        return "OggyTeam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override // annotation
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OggyTeam oggyTeam = (OggyTeam) o;
        return id == oggyTeam.id && Objects.equals(name, oggyTeam.name) && Objects.equals(address, oggyTeam.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}
