Reminder Application Requirements

User:
    Allows users to create a list of reminders they want to be aware of.
    Allows users to delete a list of reminders
    Allows users to rename a list of reminders
    Allows users to select a list of reminders from the reminders database


Reminder List Management:
    Enable users to add reminders to the list.
    Allow users to delete reminders from the list.
    Allow users to edit existing reminders in the list.

Database Integration:
    Implement a database (DB) to store reminders and associated data.

Hierarchical Reminder Creation:
    Allow users to add reminders by selecting from a hierarchical list using the reminders type clas:
    First level: Reminder type (e.g., Appointment).
    Second level: Name of the specific reminder (e.g., Dentist Appointment).

Custom Reminder Entry:
    Enable users to manually specify a reminder's name.
    Implement a feature to search for similar reminders in the DB.
    Prompt the user if a matching or similar reminder is found.
    Allow the user to select the reminder type or add a new one.
    Save the new reminder and its type in the DB.

Auto-Save Functionality:
    Automatically and immediately save reminders after any modification using the save private function in the remindersList class.

Check-Off Reminders:
    Allow users to mark reminders as completed without deleting them.

Clear Check-Off Marks:
    Provide an option to clear all check-off marks in the reminder list at once.

Persistent Check-Off Marks:
    Ensure that check-off marks are persistent and saved immediately.

Group Reminders by Type:
    Present reminders grouped by their types for easy navigation.

Support for Multiple Reminder Lists:
    Enable users to create, rename, select, and delete multiple reminder lists (e.g., "Weekly," "Monthly," "Kid’s Reminders").

Set Day and Time Reminders:
    Provide an option for users to set up reminders with specific day and time alerts.
    Optionally, allow users to set up recurring reminders.