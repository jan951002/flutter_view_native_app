package com.example.flutternativeapp

import android.os.AsyncTask
import android.util.Log

class TestAsyncTask : AsyncTask<String, String, String>() {
    override fun doInBackground(vararg params: String?): String {
        return "Test Message"
    }

    override fun onPostExecute(result: String?) {
        Log.i("TEST-TASK", result)
    }
}