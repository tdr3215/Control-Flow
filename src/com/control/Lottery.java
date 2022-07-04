package com.control;

import java.util.*;

public class Lottery {

	private double rand;
	private String quartNum;
	private String luckyNum;
//	

	final int MIN_NUM = 1;
	final int MAX_RAND = 65;
	final int MAX_MAGIC = 75;

	public double calcRandNum() {
		return Math.floor(Math.random() * (MAX_RAND - MIN_NUM + 1) + MIN_NUM);

	}

	double newNum = calcRandNum();

	public String getLuckyNum() {
		return luckyNum;
	}

	public void setLuckyNum(String string) {
		this.luckyNum = string;
	}

	public void setRand() {
		this.rand = newNum;
	}

	public double getRand() {

		return rand;
	}

	public String getQuartNum() {
		return quartNum;
	}

	public void setQuartNum(String quartNum) {
		this.quartNum = quartNum;
	}



	public double magicBall(double rand, String quartNum, String luckyNum) {
		double ball;

		Integer newQuartNum = Integer.parseInt(quartNum);
		Integer newLuckyNum = Integer.parseInt(luckyNum);
		if (newQuartNum > MAX_MAGIC) {
			newQuartNum -= MAX_MAGIC;
		} else if (newLuckyNum > MAX_MAGIC) {
			newLuckyNum -= MAX_MAGIC;
		}

		if (newQuartNum == -1) {
			ball = newLuckyNum * rand;

		} else {
			ball = newQuartNum * rand;
		}

		return ball;
	}

	public Lottery(String luckyNum, String quartNum) {

		setLuckyNum(luckyNum);
		setQuartNum(quartNum);

		this.quartNum = getQuartNum();
		this.luckyNum = getLuckyNum();
		setRand();
		this.rand = getRand();
		double magicNum = magicBall(rand, quartNum, luckyNum);
		
		System.out.println(magicNum);

	}

	@Override
	public String toString() {
		return "Lottery [rand=" + rand + ", MIN_NUM=" + MIN_NUM + ", MAX_RAND=" + MAX_RAND + ", MAX_MAGIC=" + MAX_MAGIC
				+ ", newNum=" + newNum + "]";
	}

}
