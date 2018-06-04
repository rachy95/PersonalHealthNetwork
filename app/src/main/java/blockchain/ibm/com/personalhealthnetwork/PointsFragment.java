package blockchain.ibm.com.personalhealthnetwork;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by praiseayorinde on 2018-05-29.
 */

public class PointsFragment extends Fragment{

    OnFragmentInteractionListener mListener;
    TextView pointsCounter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.activity_points_accumulated, container, false);

        // NOTE : We are calling the onFragmentInteraction() declared in the MainActivity
        // ie we are sending "Fragment 1" as title parameter when fragment1 is activated
        if (mListener != null) {
            mListener.onFragmentInteraction("Points Summary");
        }

        // Here we will can create click listners etc for all the gui elements on the fragment.
        // For eg: Button btn1= (Button) view.findViewById(R.id.frag1_btn1);
        // btn1.setOnclickListener(...
        pointsCounter = (TextView) view.findViewById(R.id.points_counter);
        return view;
    }

    public interface OnFragmentInteractionListener {
        // NOTE : We changed the Uri to String.
        void onFragmentInteraction(String title);
    }

    public void setPointsCounter(String count){
        String points = String.format(getString(R.string.user_points), count);
        pointsCounter.setText(count);
    }
}
