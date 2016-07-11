package com.philhacker.vice;

import java.util.ArrayList;
import java.util.List;

/**
 * Collects info for the tests that will be generated.
 *
 * Created by mattdupree on 7/11/16.
 */
public class ViceSpec {

    private final List<Invocation> invocations = new ArrayList<>();

    public void clampMethod(Object target, Object returnValue, Object... params) {
        invocations.add(new Invocation(target, returnValue, params));
    }

    public void onObject(Object object) {

    }

    List<Invocation> getInvocations() {
        return invocations;
    }
}
