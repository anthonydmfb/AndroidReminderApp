Author: Team 2

1 Use Case Diagram
![UseCase](https://github.com/qc-se-fall23/370Fall23Sec132Team2/assets/47362745/67c68369-f5c9-4d5f-a79e-732d33d3a3ee)
 
 
## 2 Use Case Descriptions:

Create List:
- *Requirements: Allows the user to create a new list for reminders.
- *Pre-conditions: User must be on the main app screen.
- *Post-conditions: User must have a new empty reminder list and be returned to the main screen.
- *Scenarios: User will open the app and be presented the main screen. From the main screen the user will select Create New List and be prompted to enter a name for the new list. The list will be created, saved to the database, and the user can begin adding new reminders. Alternatively, the user can select Cancel to avoid making a new list.

Edit List:
- *Requirements: Allows the user to modify information in an existing list of reminders.
- *Pre-conditions: There must be an existing list available and the user must have it selected.
- *Post-conditions: The list information must be modified according to what the user specified.
- *Scenarios: User will open the app and be presented the main screen. From the main screen the user will select a list and then be allowed to select an edit button. The user will specify the information to be changed. The list will be modified, saved to the database, and the user can begin adding new reminders. Alternatively, the user can select Cancel to avoid changing the list.


Delete List:
- *Requirements: Allows a user to remove a list.
- *Pre-conditions: There must be an existing list available and the user must have it selected.
- *Post-conditions: The selected list must be removed from the database and the GUI.
- *Scenarios: User will open the app and be presented the main screen. From the main screen the user will select a list and then be allowed to select a delete button. The user will confirm deletion of the list. The list will be removed from the screen and the database. Alternatively, the user can select Cancel to keep the list.

Search:
- *Requirements: Allows the user to quickly find a specified reminder or list.
- *Pre-conditions: There must be existing reminders and/or lists.
- *Post-conditions: The user must be presented a list of results or be notified if nothing in the database matches their specified string.
- *Scenarios: User will open the app and be presented the main screen. From the main screen the user will tap the search bar and input a string. The user will be presented search results or be told that there were no matches.

Add Reminder:
- *Requirements: Allows the user to create a new reminder to be added to a list.
- *Pre-conditions: There must be existing list to add the reminder to.
- *Post-conditions: The reminder must added to the specified list and the reminder must be saved in the database.
- *Scenarios: User will open the app and be presented the main screen. From the main screen the user will select or create a list, then tap the Add Reminder button and input the reminder data. The user will be informed that a new reminder was successfully created. Alternatively, the user can select Cancel to not create a reminder.

Edit Reminder:
- *Requirements: Allows the user to edit an existing reminder.
- *Pre-conditions: There must be existing reminders.
- *Post-conditions: The user must notified that the reminder was updated and the reminder must be saved in the database.
- *Scenarios: User will open the app and be presented the main screen. From the main screen the user will select a list, then tap a Reminder, then tap the edit button and input the reminder data to be changed. The user will be informed that a reminder was successfully updated. Alternatively, the user can select Cancel to not edit the reminder.

Delete Reminder:
- *Requirements: Allows the user to delete an existing reminder.
- *Pre-conditions: There must be existing reminder.
- *Post-conditions: The user must notified that the reminder was deleted and the reminder must be removed from the database.
- *Scenarios: User will open the app and be presented the main screen. From the main screen the user will select a list, then tap a Reminder, then tap the delete button and then tap a confirmation button. The user will be informed that a reminder was successfully deleted. Alternatively, the user can select Cancel to not delete the reminder.

CheckOffAll Reminders:
- *Requirements: Allows the user to set a check mark next to all of the reminders in a list.
- *Pre-conditions: There must be existing reminders and/or lists.
- *Post-conditions: The user must see that all the reminders in a list now have a checkmark next to them and the reminder must be updated in the database.
- *Scenarios: User will open the app and be presented the main screen. From the main screen the user will select a list, then tap a CheckOffAll Reminders button and checkmarks should appear next to every reminder in the list.

SetReminderCheck:
- *Requirements: Allows the user to set a check mark next to a reminder in a list.
- *Pre-conditions: There must be existing reminders and/or lists.
- *Post-conditions: The user must see that the reminder in the list now has a checkmark next to it and the reminder must be updated in the database.
- *Scenarios: User will open the app and be presented the main screen. From the main screen the user will select a list, then tap a Reminder, then tap the check box next to the reminder. Alternatively, the user can uncheck the reminder.



```
