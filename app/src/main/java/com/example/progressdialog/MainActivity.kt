package com.example.progressdialog

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Assign variable
    private lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener {
            //Initialize progress dialog
            progressDialog = ProgressDialog(this)
            //Show Dialog
            progressDialog.show()
            //Set content view
            progressDialog.setContentView(R.layout.progress_dialog)
            //Set transparent background
            if (progressDialog.window == null) {
                Toast.makeText(this, "Windows from progressDialog is NULL", Toast.LENGTH_SHORT).show()
            } else {
                progressDialog.window!!.setBackgroundDrawableResource(
                    android.R.color.transparent
                )
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        progressDialog.dismiss()
    }
}