1. A list consisting of reminders the users want to be aware of. The application must allow
users to add reminders to a list, delete reminders from a list, and edit the reminders in
the list.
- Add two classes, Class List with attributes Reminder and operations addReminder(Reminder), deleteReminder(Reminder), and editReminder(Reminder).
Class Reminder with attributes String Text.

2. The application must contain a database (DB) of reminders and corresponding data.

-When the user configures its reminders it will directly do it to the database

3. Users must be able to add reminders to a list by picking them from a hierarchical list,
where the first level is the reminder type (e.g., Appointment), and the second level is the
name of the actual reminder (e.g., Dentist Appointment).

-Change attribute of Class reminder to two attributes named String reminderType and String actualReminder.
Add a method to ReminderList named displayList() that displays all remindertypes available and if clicked it will show actualReminder

4. Users must also be able to specify a reminder by typing its name. In this case, the
application must look in its DB for reminders with similar names and ask the user
whether that is the item they intended to add. If a match (or nearby match) cannot be
found, the application must ask the user to select a reminder type for the reminder, or
add a new one, and then save the new reminder, together with its type, in the DB.

- We will add an attribute named reminderPresets to ReminderList that holds a list of preset reminderTypes determined by developer like "Appointment" "Meeting" "To Do" etc.
Then add the functionality to addReminder() where it will now search reminderPresets when a user tries to add a reminder.

5. The reminders must be saved automatically and immediately after they are modified.

Reminders will be saved after editing them at all in the database.

6. Users must be able to check off reminders in the list (without deleting them).

- Add an attribute named boolean check to Reminder class. displayList should show the if a reminder is checked or not.

7. Users must also be able to clear all the check-off marks in the reminder list at once.

- Add method to reminderList named clearChecks() that will clear every checkmark in every reminder.

8. Check-off marks for the reminder list are persistent and must also be saved immediately.

- As soon as clearChecks() clears the check it will save the information to the database.

9. The application must present the reminders grouped by type.

- Add method named groupDisplay() that displays each reminder in groups based off reminderType.

10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”,
“Kid’s Reminders”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete reminder lists.

- Create a class named listSelection with attributes listSelection which holds an array of reminderlists, and has methods createList(), renameList(), selectList(), and deleteList().
  Also add an attribute to ReminderList class named listName.

11. The application should have the option to set up reminders with day and time alert. If this
option is selected allow option to repeat the behavior.

- Add attributes to the Reminder class named timeAlert and repeatReminder.
  Add method named Repeat() to Reminder class that will detect if timeAlert is being used and if repeatReminder is true and then repeats the alert based off the time.

12. Extra Credit: Option to set up reminder based on location.

- Add attribute to Reminder class named Location.
  Add method named alertLocation() that will alert user when they enter a certain location.

13. The User Interface (UI) must be intuitive and responsive.

- Doesn't affect design