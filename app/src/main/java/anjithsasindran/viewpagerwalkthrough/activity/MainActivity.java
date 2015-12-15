package anjithsasindran.viewpagerwalkthrough.activity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import anjithsasindran.viewpagerwalkthrough.R;
import anjithsasindran.viewpagerwalkthrough.adapter.CustomPagerAdapter;

public class MainActivity extends AppCompatActivity {

    View decorView;
    ViewPager mViewPager;
    GradientDrawable indicatorOne, indicatorTwo, indicatorThree, indicatorFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        decorView = getWindow().getDecorView();
        setContentView(R.layout.activity_main);

        Typeface boldTypeface = Typeface.createFromAsset(getAssets(), "fonts/System San Francisco Display Bold.ttf");
        Typeface thinTypeface = Typeface.createFromAsset(getAssets(), "fonts/System San Francisco Display Regular.ttf");

        indicatorOne = (GradientDrawable) findViewById(R.id.indicator_1).getBackground();
        indicatorTwo = (GradientDrawable) findViewById(R.id.indicator_2).getBackground();
        indicatorThree = (GradientDrawable) findViewById(R.id.indicator_3).getBackground();
        indicatorFour = (GradientDrawable) findViewById(R.id.indicator_4).getBackground();
        indicatorOne.setColor(Color.BLACK);

        CustomPagerAdapter mPagerAdapter = new CustomPagerAdapter(getSupportFragmentManager(), boldTypeface, thinTypeface);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(mPagerAdapter);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        indicatorOne.setColor(Color.BLACK);
                        indicatorTwo.setColor(Color.TRANSPARENT);
                        break;
                    case 1:
                        indicatorTwo.setColor(Color.BLACK);
                        indicatorOne.setColor(Color.TRANSPARENT);
                        indicatorThree.setColor(Color.TRANSPARENT);
                        break;
                    case 2:
                        indicatorThree.setColor(Color.BLACK);
                        indicatorTwo.setColor(Color.TRANSPARENT);
                        indicatorFour.setColor(Color.TRANSPARENT);
                        break;
                    case 3:
                        indicatorFour.setColor(Color.BLACK);
                        indicatorThree.setColor(Color.TRANSPARENT);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}