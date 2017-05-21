package generators;

import api.Generator;

/**
 * Created by Andrey on 21.05.2017.
 */
public class EmailGenerator implements Generator {

    private String name = "";
    private String last_name = "";
    private String domain = "";


    public Object generate() {
        return this.name + "." + this.last_name + "@" + this.domain;
    }
}


//given template   [name].[last_name] @ [free_email_domain]
