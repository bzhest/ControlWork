package generators;

import api.Generator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Andrey on 21.05.2017.
 */
public class CreditCardGenerator implements Generator {

    private String cardNumber;
    private String expireDate;

    public CreditCardGenerator(String cardNumber, String expireDate) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
    }

    public Object generate() {
        return new CreditCardGenerator(this.cardNumber, this.expireDate);
    }

    public void cardNumberType(String cardNumber) {
        if (cardNumber.startsWith("4")) {
            System.out.println("Visa");
        } else if (cardNumber.startsWith("5")) {
            System.out.println("MasterCard");
        } else {
            System.out.println("Maestro");
        }
    }

    public Boolean isCardValid(String expireDate){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String currentDate = dateFormat.format(date);
        try{
            Date currentDate1 = sdf.parse(currentDate);
            Date expiredDate = sdf.parse(expireDate);
            if(currentDate1.after(expiredDate)){
                return false;
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return true;
    }
}

