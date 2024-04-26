package com.romexample.rom.view.activities.display;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.romexample.rom.common.Common;
import com.romexample.rom.R;
import com.romexample.rom.databinding.ActivityViewImageBinding;

public class ViewImageActivity extends AppCompatActivity {


        private ActivityViewImageBinding binding;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = DataBindingUtil.setContentView(this,R.layout.activity_view_image);
            binding.imageView.setImageBitmap(Common.IMAGE_BITMAP);

        }
    }