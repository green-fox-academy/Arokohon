package com.greenfox.redditclone.service;

import java.util.Date;

public class DateService {

  public static String timeSinceCreation(Date date) {
    Date currentTime = new Date();
    long currentTimeInLong = currentTime.getTime();

    long timeSinceCreation = (currentTimeInLong - date.getTime()) / 100;

    if (timeSinceCreation > 31556926) {  // 31 556 926 seconds is 1 year
      int years = (int) timeSinceCreation / 31556926;
      return "created " + years + " years ago";
    } else if (timeSinceCreation > 2629743 && timeSinceCreation < 31556926) {
      int months = (int) timeSinceCreation / 2629743;
      return "created " + months + " months ago";
    } else if (timeSinceCreation > 86400 && timeSinceCreation < 2629743) {
      int days = (int) timeSinceCreation / 86400;
      return  "created " + days + " days ago";
    } else if (timeSinceCreation > 3600 && timeSinceCreation < 86400) {
      int hours = (int) timeSinceCreation / 3600;
      return "created " + hours + " hours ago";
    } else if (timeSinceCreation > 60 && timeSinceCreation < 3600) {
      int minutes = (int) timeSinceCreation / 60;
      return "created " + minutes + " minutes ago";
    } else {
      int seconds = (int) timeSinceCreation;
      return "created " + seconds + " seconds ago";
    }
  }
}
