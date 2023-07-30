package primer.api.primerApi.validators;

public class EmailValidator {
    public boolean esValidoPregunta(String email){
        if(!email.contains("@")){
            return false;
        }
        if(!email.contains(".")){
            return false;
        }
        if(email.endsWith("@")){
            return false;
        }
        if(email.contains(" ")){
            return false;
        }
        if(email.length() > 255){
            return false;
        }
        else{
            return true;
        }
    }
}
