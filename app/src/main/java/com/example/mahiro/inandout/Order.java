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
    private int mTotalItems;
    private double mSubtotal;
    private double mTotal;
    private double mTax;
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


    public void calculateSubtotal()
    {
        mSubtotal = (mDoubleDouble * 3.60) + (mCheeseburger * 2.15) + (mFrenchFries * 1.65) +
                (mShakes *2.20) + (mSmallDrink * 1.45) + (mMediumDrink * 1.55) + (mLargeDrink * 1.75);

    }

    public void calculateTaxAmount()
    {
        mTax = (mSubtotal * TAX_RATE);
    }

    public void calculateTotalAmount()
    {
        mTotal = mSubtotal + mTax;

    }
    public void calculateTotalItems()
    {
        mTotalItems=  mDoubleDouble + mCheeseburger + mFrenchFries +
                mShakes + mSmallDrink + mMediumDrink + mLargeDrink;
    }

    public void recalculate()
    {
        calculateSubtotal();
        calculateTaxAmount();
        calculateTotalAmount();
        calculateTotalItems();
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

    public void setSubtotal(double mSubtotal) {
        this.mSubtotal = mSubtotal;
    }

    public double getTotal() {
        return mTotal;
    }

    public void setTotal(double mTotal) {
        this.mTotal = mTotal;
    }

    public double getTax() {
        return mTax;
    }

    public void setTax(double mTax) {
        this.mTax = mTax;
    }

    public int getTotalItems() {
        return mTotalItems;
    }
}
