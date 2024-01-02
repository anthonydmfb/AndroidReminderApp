Design 1(Anthony):


![design1](https://github.com/qc-se-fall23/370Fall23Sec132Team2/assets/47362745/b0ca50e8-e9e0-41dd-a746-33a309686c4d)


Cons:
    1. No visual representation of the Database
        2. timeAlert() is an int but it should a string to represent time 
        3. The alert based on location functionality might not work since users/device location attribute is missing


Pros: 
    1. Navigable desgin
    2. groupDisplay() can represent the list more cohesively 
    3. ListSeletion class represents requirement 11 in a detail manner

Design 2(Jamal Wali):

![design2](https://github.com/qc-se-fall23/370Fall23Sec132Team2/assets/47362745/54d886db-9273-4021-86ec-d069e0cca58a)


Cons: 
    1. The design needed to have most functions as public and not private 
        2. The design had to alter the database implementation
        3. Adding, delteing and editing the list was not represented

Pros: 
    1. The design had all the necessary classes 
    2. The design had the relationship represented between each class 
    3. It had the location functionality based on the users location and the reminder's loaction

Design 3(Marc Brown):

![design3](https://github.com/qc-se-fall23/370Fall23Sec132Team2/assets/47362745/2d063eda-c7ae-4b74-82cf-f1ed04acdea5)


Cons:
    1. The database is represented as a class
    2. The design doesn't have reminder ID 
    3. Incorrectly implemented reminder Type

Pros: 
    1. The design is intiutive and easy to implement
    2. The design has a ListManager that has access to list methods
    3. All the classes are represented in rightly manner

Design 4(Sorov Ghosh):

![design4](https://github.com/qc-se-fall23/370Fall23Sec132Team2/assets/47362745/d752d937-20a7-4900-8452-3526279b7f65)


Cons: 
    1. The design looks complicated 
    2. Design doesn't have list manager and its methods
    3. Class Naming is not intuitive 

Pros:
    1. The relationship between classes are represented 
    2. The design represented location based reminders functionality
    3. Has a unique design approach different than other team member

Design 5 (Luis Begazo):

![design5](https://github.com/qc-se-fall23/370Fall23Sec132Team2/assets/47362745/72de1409-0088-45b7-a1a3-3174dc20a105)


Cons: 
    1. The relationship between classes is incorrect 
    2. Over complicated approach to the iplementation of alerts 
    3. reminderType class is a subclass not many functionality so it would've been better if it was incorporated within reminder class

Pros: 
    1. The database is represented clean manner 
    2. The design is easier to read and understand 
    3. The naming of attributes and classes are  intuitive 



Team Design: 

![team_design](https://github.com/qc-se-fall23/370Fall23Sec132Team2/assets/47362745/26f05c4e-f922-44d0-9a95-e35badb1ee34)


​    We all essentially have the similar classes with similar distribution of functionality and attributes. For example, we all have a form of list manager with access to the database. We have user with the access to all of the functionality in the program. We had different representation of the database, we all came to the agreement that the database shouldn't be define with it's own class, instead it should be represented as collection of tables with the necessary data. We had representation of alert functionality and came to the conclusion that alert should be represented in the Reminder class. We decided to have some fundtions like autoSaveAfterCheck() and autosave() as private since they needed to be accessed just within that class.





Summary:
     We learned to create a solution by incorporating ideas from each other's design/idea into one team design. We came to conclusion on ideas by being able to take cosntructive critisism, so we can agree on specific idea. We were alse able to research new strategies to use within our designs. 
