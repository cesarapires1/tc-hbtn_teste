public class Person {
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkUser() {
        if (getUser().matches("(?=.*[a-zA-Z])(?=.*[0-9]).{8,}")) {
            return true;
        }
        return false;

    }

    public boolean checkPassword(){
        if (getPassword().matches("(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$") ) {
            return true;
        }
        return false;
    }
}
