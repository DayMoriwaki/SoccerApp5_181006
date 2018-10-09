package com.example.moriw.soccerapp5_181006;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class SampleViewPagerAdapter extends FragmentStatePagerAdapter {


    public SampleViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        Fragment fragment;

        switch (position) {
            case 0:
                fragment = new BlankFragment();
                break;
            case 1:
                fragment = new BlankFragment2();
                break;
            case 2:
                fragment = new BlankFragment3();
                break;
            default:
                fragment = null;
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title;

        switch (position) {
            case 0:
                title = "1番目";
                break;
            case 1:
                title = "2番目";
                break;
            case 2:
                title = "3番目";
                break;
            default:
                title = null;
                break;
        }


        return title;

    }
}
