package anjithsasindran.viewpagerwalkthrough.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import anjithsasindran.viewpagerwalkthrough.R;

/**
 * Created by Anjith Sasindran
 * on 14-Dec-15.
 */
public class LayoutFour extends Fragment {

    Typeface boldTypeface;
    Typeface thinTypeface;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_4, container, false);

        ((TextView) view.findViewById(R.id.title)).setTypeface(boldTypeface);
        ((TextView) view.findViewById(R.id.desc)).setTypeface(thinTypeface);

        return view;
    }

    public void setTypeface(Typeface boldTypeface, Typeface thinTypeface) {
        this.boldTypeface = boldTypeface;
        this.thinTypeface = thinTypeface;
    }
}
