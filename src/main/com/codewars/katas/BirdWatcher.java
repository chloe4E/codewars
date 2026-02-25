package com.codewars.katas;

/**
 * [Bird Watcher]
 * Difficulty: [easy]
 * URL: https://exercism.org/tracks/java/exercises/bird-watcher/edit
 * <p>
 * Instructions:
 * [Brief description]
 */
public class BirdWatcher {
	private final int[] birdsPerDay;

	public BirdWatcher(int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay.clone();
	}

	public int[] getLastWeek() {
		return this.birdsPerDay;
	}

	public int getToday() {
		return this.birdsPerDay[birdsPerDay.length-1];
	}

	public void incrementTodaysCount() {
		this.birdsPerDay[birdsPerDay.length-1] = this.birdsPerDay[birdsPerDay.length-1] +1;
	}

	public boolean hasDayWithoutBirds() {
		for ( int day : birdsPerDay) {
			if(day == 0) {
				return true;
			}
		}
		return false;
	}


public int getCountForFirstDays(int numberOfDays) {
	int sum = 0 ;
	int end = Math.min(this.birdsPerDay.length, numberOfDays);
	for (int i = 0 ; i < numberOfDays; i++ ) {
		sum = sum + this.birdsPerDay[i];
	}
	return sum;
}

public int getBusyDays() {
	int busyDays = 0;
	for (int i = 0 ; i < this.birdsPerDay.length ; i ++){
		if (this.birdsPerDay[i] >= 5){
			busyDays = busyDays+1;
		}
	}
	return busyDays;
}
}