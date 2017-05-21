package generators;

import api.Generator;

import java.awt.*;

/**
 * Created by Andrey on 21.05.2017.
 */
public class ColorGenerator implements Generator{


    public Object generate() {
        Color color = new Color(0x016709);
        return color;
    }
}
