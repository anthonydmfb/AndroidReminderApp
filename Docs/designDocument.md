Author: Team 2

1)Design Considerations

1.1
    one assumption that we have about the user interface is that the design will not allow for scrolling and will be a one-page design. We expect to use SQL lite given the assumption that this product will be an offline app as opposed to using something like Firestorm which is an online database service.on top of SQL Lite, other operational dependencies such as Kotlin will be used to write both the front and back end of this app.

1.2
    unless the user is running the app on an outdated OS we don't see any forsee any constraints on the design of our system for the time being.

1.3
    most smartphones are more than capable of handling a reminders app but we will be targeting devices that support API levels 25 and above.



2) Architectural design
       ![componentDiagram](https://github.com/qc-se-fall23/370Fall23Sec132Team2/assets/112432548/5a71e52e-4f29-4436-9885-6d18d9bea876)

 2.1
        In this diagram, there are 5 components 3 of which are classes and another being a database. the list manager will have direct access to the database as it is the first step in creating a reminders list the other two classes that will be associated with the list manager are the reminders list class where you will be able to edit your reminders list. and the reminders class where you will be able to create and edit a reminder.
![deployment diagram](https://github.com/qc-se-fall23/370Fall23Sec132Team2/assets/112432548/7d97b93a-0ca1-4851-b1dc-7beb67f74189)

2.2
    for our client and server components, our database will be our server-side component using MySQL and it will connect to our client's Android device which contains our 
    reminders list app.

3.1    
    UML class diagram describing the internal structure of the software components
    ![team_design](https://github.com/qc-se-fall23/370Fall23Sec132Team2/assets/62192247/3bcbcf8f-3d1f-4337-abf2-59aeec8f7fe9)

    
3.2
    sequence diagram describing the flow of the different methods the user can call within the app
    ![sequence_diagram](https://github.com/qc-se-fall23/370Fall23Sec132Team2/assets/62192247/7a317ff5-be26-4783-abed-f03f0be044e6)


4. User Interface Design
    ![image](https://github.com/qc-se-fall23/370Fall23Sec132Team2/assets/47362745/ac77d2f1-15a4-4f6c-b09f-15ee870283dd)
