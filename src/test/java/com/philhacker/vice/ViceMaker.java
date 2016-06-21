package com.philhacker.vice;

import com.philhacker.vice.annotations.Clamp;
import com.philhacker.vice.annotations.ViceFor;

/**
 * Created by mattdupree on 6/16/16.
 */
@ViceFor(Reverser.class)
public class ViceMaker {

    @Clamp
    public void clampReverse(Reverser reverser) {
        reverser.reverse("hello");
    }
}
