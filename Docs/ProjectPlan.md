```
# Project Plan

**Author**: Team 2

## 1 Introduction

The goal of this project is to create an application called Reminders where users can create, store, and update reminders. The reminders can be stored in separate lists and will alert users at a specified date, time, or location.

## 2 Process Description

Activity 1
- Create List:
-  Description: Allows the user to create a new reminder list. Internally this will accomplished by taking in a name specified by the user, setting up a new list, and saving this data in the database. The lists will be implemented using a database. On the users side, they will simply click/tap on a button and be prompted to enter a name for the new list.
-  Entrance criteria: Takes in a name for the list.
-  Exit criteria: The user receives a confirmation that a new list has been created.

Activity 2
- Update List:
-  Description: Allows the user to update an existing reminder list. On the users side, they will simply click/tap on a list and then click the edit button which will allow them to modify the reminder in the list. Internally once the user has completed their edits, the information will be modified in the database. 
-  Entrance criteria: Takes in the values that the user wishes to change or add to the list.
-  Exit criteria: The user receives a confirmation that a list has been modified.

Activity 3
- Delete List:
-  Description: Allows the user to delete an existing reminder list. On the users side, they will simply click/tap on a list and then click the delete button which will allow them to remove the reminder from the list. Internally once the user has comfirmed deletion, the information will be removed from the database. 
-  Entrance criteria: Takes in the ID of the list that the user wishes to delete from the list.
-  Exit criteria: The user receives a confirmation that a list has been deleted.

Activity 4
- Search List:
-  Description: Allows the user to search for an existing reminder through their lists. On the users side, they will simply click/tap on a search bar and enter the name of the reminder or list they are looking for and be returned a list of reminders or lists that match their input. Internally once the user has input their string and clicked search, the database will be searched for strings that contain the users input. 
-  Entrance criteria: Takes in a string of the reminder or list that the user wishes to search for.
-  Exit criteria: The user receives a list of reminders or reminder lists that fit the criteria.

Activity 5
- Create/Search/Edit/Delete Reminder:
-  Description: Allows the user to create, modify, view, or remove reminders. The users can navigate through the user interface to select the reminder list they wish to use, and then can select to create reminders to be added to the list or select reminders for modification/deletion. Internally once the user has selected to create a reminder and entered the name, time, date, location, etc for the reminder, the reminder will be created, associated with the selected list, and saved in the database. If the user selected to modify or remove a reminder, the new data will be saved in the database or the reminder will be deleted from the database respectively.
-  Entrance criteria: Takes in the name, time, date, and location of the reminder the user wishes to create or modify. Alternatively, takes in the ID of the reminder the user wishes to view or delete.
-  Exit criteria: The user receives a confirmation that a reminder has been created/modified/deleted.


## 3 Team

- Team Members: Luis Begazo, Marc Brown, Jamal Wali, Anthony Feliciano, Sourov Ghosh
- Roles: 
Front End: Creating the GUI for the application.
Back End: Creating the java and kotlin code to be run in the background.
Database: Setting up the database and tables to allow for easy storing and retrieving data.
   
Front End: Luis Begazo, Sourov Ghosh
Back End: Marc Brown, Anthony Feliciano
Database: Jamal Wali

```

