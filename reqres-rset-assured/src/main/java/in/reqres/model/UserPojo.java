package in.reqres.model;

public class UserPojo {
    private String id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;
    private String job;
    private String password;

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getJob(){
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

}
