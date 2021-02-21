/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.kovalskyialex.kovalskyialexlab2.display;

import org.obrii.mit.dp2021.kovalskyialex.kovalskyialexlab2.user.UserInterface;

public class ChildDisplayOld extends Display {

    public ChildDisplayOld(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public String getMessage() {
        return "Hello, " + getUserInterface().getName() + ". This message is from OVERRIDEN method in CHILD.";
    }
}