

package com.example.android.basicandroidaccessibility;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class ExpandTouchAreaFragment extends Fragment {

    private boolean mPlaying = false;
    private ImageButton mToggleImageButton;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_expand_touch_area, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) requireActivity()).setSupportActionBar(toolbar);

        mToggleImageButton = view.findViewById(R.id.play_pause_toggle_view);
        if (mToggleImageButton != null) {
            setUI();
            mToggleImageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mPlaying = !mPlaying;
                    setUI();
                }
            });
        }
    }

    private void setUI(){
        if (mPlaying) {
            mToggleImageButton.setImageResource(R.drawable.ic_cancel);
            mToggleImageButton.setContentDescription("Cancel");
        } else {
            mToggleImageButton.setImageResource(R.drawable.ic_play_circle_outline);
            mToggleImageButton.setContentDescription("Refresh");
        }
    }
}
