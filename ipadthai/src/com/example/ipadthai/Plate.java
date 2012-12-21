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
	private int mNumberPiment = 0;
	private int mNumberCorriandre = 0;
	private Context context;
	private final int  width =300;
	private final int height = 300;
	private List<Integer> mXCoord = new ArrayList<Integer>();
	private List<Integer> mYCoord = new ArrayList<Integer>();
	private List<Integer> mRefImage = new ArrayList<Integer>();
	
	public int mNumElementEaten= 0;
	public int mNumElement = 0;
	
	private int[] ressourcePate = new int[4];
	private int[] ressourcePiment = new int[4];
	private int[] ressourceCoriandre = new int[4];
	
	public Plate(int numPate, int numPiment, int numCoriander, Context context){
		this.context = context;
		mNumberPate = numPate;
		mNumberCorriandre = numCoriander;
		mNumberPiment = numPiment;
		mNumElement = mNumberPate+ mNumberCorriandre + mNumberPiment;
		
		
		ressourcePate[0] = R.drawable.pate1;
		ressourcePate[1] = R.drawable.pate1;
		ressourcePate[2] = R.drawable.pate2;
		ressourcePate[3] = R.drawable.pate2;
		ressourcePiment[0] = R.drawable.pate1;
		ressourcePiment[1] = R.drawable.pate1;
		ressourcePiment[2] = R.drawable.pate2;
		ressourcePiment[3] = R.drawable.pate2;
		ressourceCoriandre[0] = R.drawable.pate1;
		ressourceCoriandre[1] = R.drawable.pate1;
		ressourceCoriandre[2] = R.drawable.pate2;
		ressourceCoriandre[3] = R.drawable.pate2;
		
		for(int i=0 ; i<mNumElement;i++){
			mXCoord.add((int) (Math.random()*width));
			mYCoord.add((int) (Math.random()*height));
			
			if(i<mNumberPate){
				mRefImage.add( ressourcePate[ (int) Math.random()*ressourcePate.length    ] );
			}
			else if(i>=mNumberPate&& i<mNumberPiment){
				mRefImage.add( ressourcePiment[ (int) Math.random()*ressourcePiment.length    ] );
			}
			else if(i>=mNumberPiment&& i<mNumberCorriandre){
		//		mRefImage.add( context.getResources().getIdentifier("chicken"+, "drawable", context.getPackageName()))) );
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

}
