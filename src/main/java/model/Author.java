
package model;

public class Author {
    private String user;
    private String pswrd;
    private String mail;

    public Author(String user, String pswrd, String mail) {
        this.user = user;
        this.pswrd = pswrd;
        this.mail = mail;
    }

    public Author(){
        
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPswrd() {
        return pswrd;
    }

    public void setPswrd(String pswrd) {
        this.pswrd = pswrd;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Author{user=").append(user);
        sb.append(", pswrd=").append(pswrd);
        sb.append(", mail=").append(mail);
        sb.append('}');
        return sb.toString();
    }
    
}
