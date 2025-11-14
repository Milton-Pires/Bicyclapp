package br.com.etecia.biscoiteapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapterVeiculos extends FragmentStateAdapter {
    public ViewPagerAdapterVeiculos(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:return new UsadaFragment();
            case 1: return new NovaFragment();
            default: return new NovaFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
