
package model;

public class Author {
    private String user;
    private Integer edad;
    private String mail;

    public Author(String user, Integer edad, String mail) {
        this.user = user;
        this.edad = edad;
        this.mail = mail;
    }
    
    public Author(){
        
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Author{user=").append(user);
        sb.append(", edad=").append(edad);
        sb.append(", mail=").append(mail);
        sb.append('}');
        return sb.toString();
    }
    
    
}
