package com.example.mahiro.inandout;

/**
 * Created by Mahiro on 2016/09/18.
 */
public class Order {

    private int mDoubleDouble;
    private int mCheeseburger;
    private int mFrenchFries;
    private int mShakes;
    private int mSmallDrink;
    private int mMediumDrink;
    private int mLargeDrink;
    private double mSubtotal;
    private double TAX_RATE = 0.08;


    public Order()
    {
        mDoubleDouble = 0;
        mCheeseburger = 0;
        mFrenchFries = 0;
        mShakes = 0;
        mSmallDrink = 0;
        mMediumDrink =0;
        mLargeDrink =0;
        mSubtotal =0.0;
    }


    public double calculateSubtotal()
    {
        mSubtotal = (mCheeseburger * 3.60) + (mCheeseburger * 2.15) + (mFrenchFries * 1.65) +
                (mShakes *2.20) + (mSmallDrink + 1.45) + (mMediumDrink + 1.55) + (mLargeDrink * 1.75);

        return mSubtotal;
    }

    public double calculateTaxAmount()
    {
        return (mSubtotal * TAX_RATE);
    }

    public double calculateTotalAmount()
    {
        return mSubtotal + calculateTaxAmount();

    }



    public int getDoubleDouble() {
        return mDoubleDouble;
    }

    public int getCheeseburger() {
        return mCheeseburger;
    }

    public int getFrenchFries() {
        return mFrenchFries;
    }

    public int getShakes() {
        return mShakes;
    }

    public int getSmallDrink() {
        return mSmallDrink;
    }

    public int getMediumDrink() {
        return mMediumDrink;
    }

    public int getLargeDrink() {
        return mLargeDrink;
    }

    public double getSubtotal() {
        return mSubtotal;
    }

    public double getTAX_RATE() {
        return TAX_RATE;
    }

    public void setDoubleDouble(int mDoubleDouble) {
        this.mDoubleDouble = mDoubleDouble;
    }

    public void setCheeseburger(int mCheeseburger) {
        this.mCheeseburger = mCheeseburger;
    }

    public void setFrenchFries(int mFrenchFries) {
        this.mFrenchFries = mFrenchFries;
    }

    public void setShakes(int mShakes) {
        this.mShakes = mShakes;
    }

    public void setSmallDrink(int mSmallDrink) {
        this.mSmallDrink = mSmallDrink;
    }

    public void setMediumDrink(int mMediumDrink) {
        this.mMediumDrink = mMediumDrink;
    }

    public void setLargeDrink(int mLargeDrink) {
        this.mLargeDrink = mLargeDrink;
    }
}
