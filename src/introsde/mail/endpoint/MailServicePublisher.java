package introsde.mail.endpoint;

import javax.xml.ws.Endpoint;
import introsde.mail.ws.MailServiceImpl;

//Endpoint publisher
public class MailServicePublisher{
    public static void main(String[] args) {
       Endpoint.publish("http://localhost:6901/ws/mail", new MailServiceImpl());
    }
}
