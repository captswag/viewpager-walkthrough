package anjithsasindran.viewpagerwalkthrough.adapter;

import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import anjithsasindran.viewpagerwalkthrough.fragment.LayoutFour;
import anjithsasindran.viewpagerwalkthrough.fragment.LayoutOne;
import anjithsasindran.viewpagerwalkthrough.fragment.LayoutThree;
import anjithsasindran.viewpagerwalkthrough.fragment.LayoutTwo;

/**
 * Created by Anjith Sasindran
 * on 14-Dec-15.
 */
public class CustomPagerAdapter extends FragmentStatePagerAdapter {

    public static final int PAGE_COUNT = 4;
    Typeface boldTypeface;
    Typeface thinTypeface;

    public CustomPagerAdapter(FragmentManager fm, Typeface boldTypeface, Typeface thinTypeface) {
        super(fm);
        this.boldTypeface = boldTypeface;
        this.thinTypeface = thinTypeface;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                LayoutOne layoutOne = new LayoutOne();
                layoutOne.setTypeface(boldTypeface, thinTypeface);
                return layoutOne;
            case 1:
                LayoutTwo layoutTwo = new LayoutTwo();
                layoutTwo.setTypeface(boldTypeface, thinTypeface);
                return layoutTwo;
            case 2:
                LayoutThree layoutThree = new LayoutThree();
                layoutThree.setTypeface(boldTypeface, thinTypeface);
                return layoutThree;
            case 3:
                LayoutFour layoutFour = new LayoutFour();
                layoutFour.setTypeface(boldTypeface, thinTypeface);
                return layoutFour;
        }
        return null;
    }
}
