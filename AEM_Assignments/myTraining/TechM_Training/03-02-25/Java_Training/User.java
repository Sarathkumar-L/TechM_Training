package cust;

public class User {

    private String user_name;
    private String user_email;
    private long mob_num;
    private String address;

    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public long getMob_num() {
        return mob_num;
    }
    public void setMob_num(long mob_num) {
        this.mob_num = mob_num;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public User(String user_name, String user_email, long mob_num, String address){
        this.user_name=user_name;
        this.user_email=user_email;
        this.mob_num=mob_num;
        this.address=address;
    }

    public void displayUser(){
        System.out.println("User: "+user_name);
        System.out.println("Email:"+user_email);
        System.out.println("Mobile:"+mob_num);
        System.out.println("Address:"+address);
    }


}
