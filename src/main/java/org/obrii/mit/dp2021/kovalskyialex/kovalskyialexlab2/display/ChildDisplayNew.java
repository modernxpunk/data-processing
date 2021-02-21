/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.kovalskyialex.kovalskyialexlab2.display;

import org.obrii.mit.dp2021.kovalskyialex.kovalskyialexlab2.user.UserInterface;

public class ChildDisplayNew extends ChildNewAbstractDisplay {

    public ChildDisplayNew(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public String getAnotherMessage() {
        return "This is message from " + getUserInterface().getName() + ". And it means using a new CHILD class.";
    }

}