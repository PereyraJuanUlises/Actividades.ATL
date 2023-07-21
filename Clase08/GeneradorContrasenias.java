package Clase08;

public class GeneradorContrasenias {
    public static void main(String[] args) {
        //Generador de contraseñas
        String newPassword= generatePassword();
        System.out.println("newPassword = " + newPassword);
    }
    public static String generatePassword(){
        double alateory= Math.random()*1000000;
        long alateoryNumber = Math.round(alateory);
        String password="asdasdasdas"+alateoryNumber;
        return password;
    }
}
