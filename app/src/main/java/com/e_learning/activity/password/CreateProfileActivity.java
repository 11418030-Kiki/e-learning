package com.e_learning.activity.password;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.e_learning.activity.MainActivity;
import com.e_learning.custom_view.MyTextView;
import com.e_learning.R;


import de.hdodenhof.circleimageview.CircleImageView;


public class CreateProfileActivity extends AppCompatActivity {
    private CircleImageView civProfile;
    private LinearLayout linearHighSchool;
    private LinearLayout linearJuniorHighSchool;
    private MyTextView tvHighSchool;
    private MyTextView tvJuniorHighSchool;
    private ImageView ivUploadImage;
/*    private MyEditText etUsername;
    private MyEditText etFirstname;
    private MyEditText etLastname;*/
    private static final int GALLERY_CONSTANT = 12;
    private static final int CAMERA_CONSTANT = 20;
    public Uri imageuri;
    public Bitmap bitmap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
        //DataBindingUtil.setContentView(this,R.layout.activity_create_profile);
        linearHighSchool = findViewById(R.id.linear_layout_highschool);
        linearJuniorHighSchool = findViewById(R.id.linear_layout_junior_high);
        tvHighSchool = findViewById(R.id.tv_highschool);
        tvJuniorHighSchool = findViewById(R.id.tv_junior_highschool);
        civProfile = findViewById(R.id.civ_profile_pic);
        ivUploadImage = findViewById(R.id.iv_update_profile_pic);
        linearHighSchool.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                selectHighSchool();
            }
        });
        linearJuniorHighSchool.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                selectJuniorHighSchool();
            }
        });
        ivUploadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                captureImage();
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void selectJuniorHighSchool() {
        linearJuniorHighSchool.setBackground(getResources().getDrawable(R.drawable.custom_radio_button_oncheck));
        tvJuniorHighSchool.setTextColor(getResources().getColor(R.color.colorPrimary));
        linearHighSchool.setBackground(getResources().getDrawable(R.drawable.custom_radio_button_onuncheck));
        tvHighSchool.setTextColor(getResources().getColor(R.color.colorAccent));

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void selectHighSchool() {

        linearHighSchool.setBackground(getResources().getDrawable(R.drawable.custom_radio_button_oncheck));
        tvHighSchool.setTextColor(getResources().getColor(R.color.colorPrimary));
        linearJuniorHighSchool.setBackground(getResources().getDrawable(R.drawable.custom_radio_button_onuncheck));
        tvJuniorHighSchool.setTextColor(getResources().getColor(R.color.colorAccent));


    }

    //for getting image from gallery and camera
    private void captureImage() {

        String option[] = {"camera", "gallery"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Complete action using");
        builder.setItems(option, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    openCamera();
                    //Toast.makeText(Ui_Component.this, "openCamera", Toast.LENGTH_SHORT).show();

                } else if (i == 1) {
                    openGallery();
                }

            }
        });

        builder.show();

    }

    private void openCamera() {

        Intent cameraintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraintent, CAMERA_CONSTANT);

    }


    private void openGallery() {

        Intent galleryintent = new Intent(Intent.ACTION_GET_CONTENT);
        galleryintent.setType("image/*");
        startActivityForResult(galleryintent, GALLERY_CONSTANT);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GALLERY_CONSTANT) {
            if (resultCode == RESULT_OK) {
                imageuri = data.getData();
                civProfile.setImageURI(imageuri);

            }
        } else if (requestCode == CAMERA_CONSTANT) {
            if (resultCode == RESULT_OK) {
                bitmap = (Bitmap) data.getExtras().get("data");

                civProfile.setImageBitmap(bitmap);


            }
        }
    }


    public void btnHome(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}
