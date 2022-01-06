package data;

public class Client {

     private String prenom;

     private String nom;

     private String birthday;

     private String villeNaissance;

     private String departement;

     public Client(String prenom, String nom, String birthday, String villeNaissance, String departement) {
          this.prenom = prenom;
          this.nom = nom;
          this.birthday = birthday;
          this.villeNaissance = villeNaissance;
          this.departement = departement;
     }


     public String getPrenom() {
          return prenom;
     }

     public void setPrenom(String prenom) {
          this.prenom = prenom;
     }

     public String getNom() {
          return nom;
     }

     public void setNom(String nom) {
          this.nom = nom;
     }

     public String getBirthday() {
          return birthday;
     }

     public void setBirthday(String birthday) {
          this.birthday = birthday;
     }

     public String getVilleNaissance() {
          return villeNaissance;
     }

     public void setVilleNaissance(String villeNaissance) {
          this.villeNaissance = villeNaissance;
     }

     public String getDepartement() {
          return departement;
     }

     public void setDepartement(String departement) {
          this.departement = departement;
     }
}
