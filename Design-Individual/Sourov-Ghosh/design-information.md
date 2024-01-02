1. A list consisting of reminders the users want to be aware of. The application must allow
users to add reminders to a list, delete reminders from a list, and edit the reminders in
the list.

A. All of the reminder(s) will be contained in a list in the reminder class. Inside the class, there are methods that allow the user to add , delete, and edit reminders. The following are implemented through the GroupRem class: addReminder, deleteReminder, and editReminder.

2. The application must contain a database (DB) of reminders and corresponding data.

A. There is no Database explicity, but the SpecialRem and GroupRem class are responsible for storage.

3. Users must be able to add reminders to a list by picking them from a hierarchical list.

A. RemType class shows the heirarchical list through an association of the GroupRem class. Like an appointment and then the specific type of appointment (vet appointment)

4. Users must also be able to specify a reminder by typing its name. In this case, the
application must look in its DB for reminders with similar names and ask the user
whether that is the item they intended to add. If a match (or nearby match) cannot be
found, the application must ask the user to select a reminder type for the reminder, or
add a new one, and then save the new reminder, together with its type, in the DB. 

A. Users will be able find a reminder by searching for its name in the final logic of the app. This is not specified in UML.

5. The reminders must be saved automatically and immediately after they are modified.

A. This feature, automatically saving modified reminders, is not represented in the UML. This will be in the final rendition of the app and its logic.

6. Users must be able to check off reminders in the list (without deleting them).

A. The Check-off feature, without deleting is implemented  through the GroupRem class using the checkOff function in both the SpecialRem and GroupRem class.

7. Users must also be able to clear all the check-off marks in the reminder list at once.

A. The GroupRem class has the ability to check-off multiple items (and all) through the allClear function.

8. Check-off marks for the reminder list are persistent and must also be saved immediately.

A. This is not considered as it does not affect the design directly.

9. The application must present the reminders grouped by type.

A. Reminders will be categorized using the RemType class. The actual presentation is not represented in the UML as it does not affect app functionality

10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”,
“Kid’s Reminders”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete reminder lists.

A. This UML differentiates reminders in the GroupRem and SpecialRem class. The reminder are reminders that are a part of the reminder and is a part of a list. The SpecialRem class is supposed to represent individual reminders that may be considered its own reminder list.

11. The application should have the option to set up reminders with day and time alert. If this
option is selected allow option to repeat the behavior.

A. Not considered as it does not affect the design directly. Day and time alerts can be considered regular reminders that are a part of the GroupRem class in a list.
Day and Time will be implemented through the GroupRem and SpecialRem class using the datetime feaure in both.

12. Extra Credit: Option to set up reminder based on location.

A. The LocationRem class is utilized by the SpecialRem and GroupRem class to set up reminders based on location using the location function of the locationrem class. The manner in which the app pulls the location is not relevant to the UML and initial logic. The SpecialRem and GroupRem class contains an association and function call to the LocationRem class using setLocation.

13. The User Interface (UI) must be intuitive and responsive.

A. Not considered as it does not affect the design directly.
