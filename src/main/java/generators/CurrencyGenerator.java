package generators;

import api.Generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrey on 21.05.2017.
 */
public class CurrencyGenerator implements Generator {

    private List<String> currency = new ArrayList<String>(Arrays.asList("USD", "EURO", "Dollar"));


    public Object generate() {
        return currency.get(0);
    }
}
