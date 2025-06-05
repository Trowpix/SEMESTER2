package Kuliah.Class.Encapsulation;

public class User {
    private String Id;
    private String Nama;
    private String Password;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public User(String nama, String password){
        Nama =  nama;
        Password = password;
    }

    public User(){
        Nama =  "";
        Password = "belum ter isi";
    }


}
