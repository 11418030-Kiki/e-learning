package com.e_learning.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class TabAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragmentArrayList = new ArrayList<Fragment>();
    private ArrayList<String> tabTileArrayList = new ArrayList<String>();


    public void addTabs(Fragment fragment, String tabTitle) {
        fragmentArrayList.add(fragment);
        tabTileArrayList.add(tabTitle);
    }

    public TabAdapter(FragmentManager fm) {
        super(fm);
        fragmentArrayList=new ArrayList<Fragment>();
        tabTileArrayList=new ArrayList<String>();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return tabTileArrayList.size();
    }
    public CharSequence getPageTitle(int position){
        return tabTileArrayList.get(position);
    }
}