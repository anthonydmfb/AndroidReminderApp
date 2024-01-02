 Design Information for each Requirement:

1. Added to the design the ReminderList and Reminder class. The ReminderList class can contain Reminder class objects and has the operations add(Reminder), delete(Reminder), and edit(Reminder). The Reminder class has attributes "name"

2. Added to the design the ReminderDatabase class that contains Reminder classes.

3. Added to the Reminder class a string attribute called "type". Added to the ReminderDatabase a string array attribute called "reminderTypes". Added to the ReminderDatabase class the operation findReminderType(reminderType) that checks the ReminderDatabase for the selected reminderType and then returns a list of Reminders that have that type (to create a dropdown menu for the user with).

4. Added to the design a searchReminder(String) operation to the ReminderDatabase class to allow searching for specific reminder names. Added to the design a saveReminder(String type, String name) operation to the ReminderDatabase class to allow saving new reminders and types.

5. Not considered because it does not require adding anything new to the design.

6. Added a boolean attribute to the Reminder class called "checkOffMark" for allowing the user to check-off reminders. Added an operation called toggleCheckOffMark() to the Reminder class for setting the checkOffMark attribute to true/false. 

7. Added an operation called clearCheckOffs() to the Reminderlist class for removing all check-offs.

8. Not considered because it does not require adding anything new to the design. 

9. Added to the design the ability for the add(Reminder)  and edit(Reminder) operations from the ReminderList class to add Reminders into the list sorted by type and then alphabetically by name.

10. Added to the design a name attribute for the ReminderList class. Added to the design a new class called ListManager which can contain ReminderList objects and has the operations createList(String name), renameList(String name), deleteList(String name), and viewList(String name).

11. Added to the design the attributes reminderDay, reminderTime, and reminderRepeat to the Reminder class to allow for time alerts and repetition.

12. Extra Credit: Not considered due to budget and time limitations (pure laziness).

13. Not considered because it does not affect the design directly.

    

