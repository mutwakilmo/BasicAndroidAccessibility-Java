
package com.example.android.basicandroidaccessibility;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button buttonContentLabeling = view.findViewById(R.id.content_labeling_button);
        buttonContentLabeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_contentLabelingFragment, null);
            }
        });

        Button buttonContentGrouping = view.findViewById(R.id.content_grouping_button);
        buttonContentGrouping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_contentGroupingFragment, null);
            }
        });

        Button buttonLiveRegion = view.findViewById(R.id.live_region_button);
        buttonLiveRegion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_liveRegionFragment, null);
            }
        });

        Button buttonExpandTouchArea = view.findViewById(R.id.expand_touch_area_button);
        buttonExpandTouchArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_expandTouchAreaFragment, null);
            }
        });

        Button buttonInsufficientContrast = view.findViewById(R.id.insufficient_contrast_button);
        buttonInsufficientContrast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_insufficientContrastFragment, null);
            }
        });

    }
}
