package com.learn.oops.encapsulation.subclass_package;

import com.learn.oops.encapsulation.access_modifiers.ProtectedExample;

public class SubclassProtectedExample extends ProtectedExample {

    void accessProtectedMembers() {
        protectedField = 40;
        protectedMethod();
    }
}
