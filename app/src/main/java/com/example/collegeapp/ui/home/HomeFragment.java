package com.example.collegeapp.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.example.collegeapp.R;
/*
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;
*/

public class HomeFragment extends Fragment {
 /*  private SliderLayout sliderLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_home, container, false);

        sliderLayout = view.findViewById(R.id.slider);

        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();

        return view;
    }

    private void setSliderViews() {
        for (int i=0;i<5;i++){
            DefaultSliderView sliderView = new DefaultSliderView(getContext());

            switch (i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/instagram-96af2.appspot.com/o/rgit.png?alt=media&token=d47961bc-7bb2-418e-add9-c3a249190899");
                    break;
                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/instagram-96af2.appspot.com/o/fac.png?alt=media&token=72d596b4-d529-46ac-bba7-1fc46d3248c0");
                    break;
                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/instagram-96af2.appspot.com/o/rgit.jpg?alt=media&token=7a955df9-c88a-435b-97f8-b0cc08f17ed6");
                    break;
                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/instagram-96af2.appspot.com/o/fecu.png?alt=media&token=26c4aa19-a266-40aa-98d8-a7507bddad4a");
                    break;
                case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/instagram-96af2.appspot.com/o/alumini.png?alt=media&token=a9cbbc47-01d8-47dc-9b8c-b47ab08a00a1");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);

            sliderLayout.addSliderView(sliderView);
        }
    }*/
}

//HomeFragment
/*
public class HomeFragment extends SliderViewAdapter<HomeFragment.Holder> {

    int[] images;

    public HomeFragment(int[] images){
        this.images = images;

    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_home,parent, false);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder viewHolder, int position) {

        viewHolder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getCount() {
        return images.length;
    }

    public class Holder extends SliderViewAdapter.ViewHolder{
        ImageView imageView;
        public Holder(View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.image_view);

        }


    }
}
*/
