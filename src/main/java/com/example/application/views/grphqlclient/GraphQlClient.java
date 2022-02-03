package com.example.application.views.grphqlclient;

import com.example.application.data.DataClient;
import com.example.application.data.QueueService;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

@PageTitle("GraphQlClient")
@Route(value = "gqlclient", layout = MainLayout.class)
public class GraphQlClient extends HorizontalLayout {

    private static final boolean NON_DURABLE = false;
    private static final String MY_QUEUE_NAME = "myQueue";


    private TextField name;
    private Button sayHello;

    //private DataClient dataClient;
    //private QueueService queueService;


    //@Autowired
    //public GraphQlClient(DataClient dataClient, QueueService queueService) {
        public GraphQlClient() {
       // this.dataClient = dataClient;
        //this.queueService = queueService;
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            int count = 88;//dataClient.doSomething();
            Notification.show("Hello, Welcome to Heroku " + name.getValue() + " - " + count);
        });

        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            int count = 78;//dataClient.doSomething();
            showNotification("Hello, Welcome to Heroku " + name.getValue() + " - " + count);
            //Notification.show("Hello, Welcome to Heroku " + name.getValue() + " - " + count);
        });

        TextField queueTextField = new TextField("Message to queue");
        Button sendQueue = new Button("Send");
        sendQueue.addClickListener(buttonClickEvent -> {

        });
        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        setVerticalComponentAlignment(Alignment.END, queueTextField, sendQueue);


        add(name,sayHello);
        add(queueTextField, sendQueue);
      //  if (Objects.nonNull(queueService)) {
//            queueService.setMessageListener(s -> showNotification("Queue received : " + s));
        //}
    }

    private void showNotification(String message) {
         Notification.show(message);
    }


}
