package com.example.ipadthai;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;

public class Plate {
	
	private final int mNumberPateVariety =4; 
	private final int mNumberOnionVariety =4; 
	private final int mNumberChickenVariety =4; 
	private final int mNumberPrawnVariety =4; 
	private final int mNumberCorianderVariety =4; 
	private int mNumberPate = 0;
	private int mNumberOnion = 0;
	private int mNumberChicken = 0;
	private int mNumberPrawn = 0;
	private int mNumberCoriander = 0;
	
	private Context context;
	private final int  width =300;
	private final int height = 300;
	private List<Integer> mXCoord = new ArrayList<Integer>();
	private List<Integer> mYCoord = new ArrayList<Integer>();
	private List<Integer> mRefImage = new ArrayList<Integer>();
	
	public int mNumElementEaten= 0;
	public int mNumElement = 0;
	
	public Plate(int numPate, int numOnion,int numChicken,int numPrawn, int numCoriander, Context context){
		this.context = context;
		mNumberPate = numPate;
		mNumberOnion = numOnion;
		mNumberChicken = numChicken;
		mNumberPrawn = numPrawn;
		mNumberCoriander = numCoriander;
		mNumElement = mNumberPate+ mNumberOnion + mNumberChicken+mNumberPrawn+mNumberCoriander;
		
		
		for(int i=0 ; i<mNumElement;i++){
			mXCoord.add((int) (Math.random()*width));
			mYCoord.add((int) (Math.random()*height));
			
			if(i<mNumberPate){
				mRefImage.add( context.getResources().getIdentifier("pate0"+(int)Math.random()*mNumberPateVariety, "drawable", context.getPackageName()) );
			}
			else if(i>=mNumberPate&& i<mNumberOnion){
				mRefImage.add( context.getResources().getIdentifier("onion0"+(int)Math.random()*mNumberOnionVariety, "drawable", context.getPackageName()) );
			}
			else if(i>=mNumberOnion&& i<mNumberChicken){
				mRefImage.add( context.getResources().getIdentifier("chicken0"+(int)Math.random()*mNumberChickenVariety, "drawable", context.getPackageName()) );
			}
			else if(i>=mNumberChicken&& i<mNumberPrawn){
				mRefImage.add( context.getResources().getIdentifier("prawn0"+(int)Math.random()*mNumberPrawnVariety, "drawable", context.getPackageName()) );
			}
			else if(i>=mNumberPrawn&& i<mNumberCoriander){
				mRefImage.add( context.getResources().getIdentifier("coriander0"+(int)Math.random()*mNumberCorianderVariety, "drawable", context.getPackageName()) );
			}
		}
		
		
	}
	
	public boolean isPlateFinnished(){
		if(mNumElementEaten == mNumElement)
			return true;
		else return false;
	}
	
	public void eatElement(){
		mNumElementEaten++;
	}
	
	public int getXCoordElement(int i){
		return mXCoord.get(i);
	}
	public int getYCoordElement(int i){
		return mYCoord.get(i);
	}
	public int getRefElement(int i){
		return mRefImage.get(i);
	}
	
}
