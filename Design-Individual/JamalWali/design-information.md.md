The reminderList is a class consist of id, reminderType, and reminderName. This is a child class of the user this will have access to user class
The Database has all the reminder information saved and is needed to interact with older reminders.
The add method is used to add reminder with reminderType and reminderName and reminder time and day can also be used
In the reminder class the user will be allowed to access the Database and search by reminderName and if the reminder isn’t present they will be prompted to add the reminder if not found in the database
No action is needed the autoSave() functions gets triggered and  reminders will be saved automatically 
The checkOff() method is used to check off a reminder
The clearAll() method is used to uncheck all the reminder list
The clicking the checkbox it will trigger an autoSaveAfterCheck() function
The groupByType() is a type boolean which groups the reminders by reminderType when true
remindeScope() is used with reminderLength to determine the view of the reminder list 
When creating the reminder user will be asked to enter reminder date and time if they want they can add and then the function alert() will repeat the reminder if true
 The reminderLocation and userLocation if matched will call the function reminderLocation() and send location based reminder to user 
 The reminder monthly, weekly, will have to responsive if selected 
