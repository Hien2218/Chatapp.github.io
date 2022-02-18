package com.example.chatible2.Adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chatible2.Fragments.ChatsFragment;
import com.example.chatible2.Fragments.RequestsFragment;


public class TabsPagerAdapter extends FragmentPagerAdapter {


    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;
            case 1:
                RequestsFragment requestsFragment = new RequestsFragment();
                return requestsFragment;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 2; // 2 is total fragment number (e.x- Chats, Requests)
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "TIN NHẮN"; // ChatsFragment
            case 1:
                return "LỜI MỜI KẾT BẠN"; // ttttRequestsFragment
            default:
                return null;
        }
        //return super.getPageTitle(position);
    }
}
