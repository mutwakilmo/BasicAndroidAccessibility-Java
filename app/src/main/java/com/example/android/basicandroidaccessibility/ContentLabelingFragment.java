
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


public class ContentLabelingFragment extends Fragment {

    private boolean mPlaying = false;
    private ImageButton mPlayPauseToggleImageView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_content_labeling, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) requireActivity()).setSupportActionBar(toolbar);

        mPlayPauseToggleImageView = view.findViewById(R.id.play_pause_toggle_view);
        if (mPlayPauseToggleImageView != null) {
            updateImageButton();
            mPlayPauseToggleImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mPlaying = !mPlaying;
                    updateImageButton();
                }
            });
        }
    }

    private void updateImageButton() {
        if (mPlaying) {
            mPlayPauseToggleImageView.setImageResource(R.drawable.ic_pause);
        } else {
            mPlayPauseToggleImageView.setImageResource(R.drawable.ic_play_arrow);
        }
    }
}