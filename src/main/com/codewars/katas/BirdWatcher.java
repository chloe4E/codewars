package com.codewars.katas;

/**
 * [Bird Watcher]
 * Difficulty: [easy]
 * URL: https://exercism.org/tracks/java/exercises/bird-watcher/edit
 *
 * <p>Instructions: [Brief description]
 */
public class BirdWatcher {

  private final int[] birdsPerDay;

  /** Constructs a BirdWatcher with the given daily bird counts. */
  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
  }

  /** Returns the bird counts for the last week. */
  public int[] getLastWeek() {
    return this.birdsPerDay;
  }

  /** Returns today's bird count. */
  public int getToday() {
    return this.birdsPerDay[birdsPerDay.length - 1];
  }

  /** Increments today's bird count by one. */
  public void incrementTodaysCount() {
    this.birdsPerDay[birdsPerDay.length - 1] = this.birdsPerDay[birdsPerDay.length - 1] + 1;
  }

  /** Returns true if any day had zero birds. */
  public boolean hasDayWithoutBirds() {
    for (int day : birdsPerDay) {
      if (day == 0) {
        return true;
      }
    }
    return false;
  }

  /** Returns the total bird count for the first numberOfDays days. */
  public int getCountForFirstDays(int numberOfDays) {
    int sum = 0;
    for (int i = 0; i < numberOfDays; i++) {
      sum = sum + this.birdsPerDay[i];
    }
    return sum;
  }

  /** Returns the number of days with 5 or more birds. */
  public int getBusyDays() {
    int busyDays = 0;
    for (int i = 0; i < this.birdsPerDay.length; i++) {
      if (this.birdsPerDay[i] >= 5) {
        busyDays = busyDays + 1;
      }
    }
    return busyDays;
  }
}
