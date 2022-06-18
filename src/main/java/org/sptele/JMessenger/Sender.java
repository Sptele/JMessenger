package org.sptele.JMessenger;

import org.sptele.JMessenger.Entities.Message;

public class Sender {

    public static boolean sendMessage(Message msg) {

        System.out.println("Will send " + msg.toString());

        return true;
    }
}
