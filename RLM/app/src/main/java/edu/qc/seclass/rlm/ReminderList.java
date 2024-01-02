package edu.qc.seclass.rlm;

import java.util.ArrayList;
import java.util.Date;

public class ReminderList {
    ArrayList<Reminder> reminderlist = new ArrayList<Reminder>();
    ArrayList<String> reminderTypes = new ArrayList<String>();


    int ListID = 0;
    String ListName;


    public ReminderList(String name) {
        ListName = name;
        reminderlist = new ArrayList<Reminder>();
        ListID++;

    }

    public void add(String reminderType , String reminderName , String reminderDate , String reminderLocation) {
        if(!doesExist(reminderType)){
            addReminderType(reminderType);
        }

        Reminder item = new Reminder(reminderType,reminderName,reminderDate,reminderLocation);



        reminderlist.add(item);


    }

    public void delete(int reminderId) {
         reminderlist.remove(reminderId);
    }

    public void edit(int reminderId, String reminderType , String reminderName , String reminderDate , String reminderLocation) {
          Reminder item = new Reminder(reminderType,reminderName,reminderDate,reminderLocation);
          reminderlist.set(reminderId, item);
    }

    public void reminderCompleted(){

    }

    public void checkOff(int reminderId) {
     reminderlist.get(reminderId).toggleReminderCheck();
    }
    public void clearAll() {
        for(Reminder item : reminderlist){
            if(item.reminderCheck == true)
             item.toggleReminderCheck();
        }
    }

    public void reminderScope() {

    }

    public void autoSaveAfterCheck() {

    }


    public void groupByType() {

    }

    public boolean doesExist(String reminderType) {
       for(String str : reminderTypes){
           if(reminderType == str) return true;
       }

       return false;
    }

    private void addReminderType(String reminderType) {
       reminderTypes.add(reminderType);
    }

    public String getName() {
        return ListName;
    }


}
