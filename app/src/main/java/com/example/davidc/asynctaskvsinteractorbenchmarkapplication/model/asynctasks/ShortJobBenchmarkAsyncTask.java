package com.example.davidc.asynctaskvsinteractorbenchmarkapplication.model.asynctasks;

import android.os.AsyncTask;

import com.example.davidc.asynctaskvsinteractorbenchmarkapplication.model.JobCallback;
import com.example.davidc.asynctaskvsinteractorbenchmarkapplication.model.job.Jobs;

public class ShortJobBenchmarkAsyncTask extends AsyncTask<Void, Void, Void> {
    private final JobCallback callback;

    public ShortJobBenchmarkAsyncTask(JobCallback callback) {
        this.callback = callback;
    }

    @Override
    protected Void doInBackground(Void... params) {
        Jobs.shortJob();
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        callback.onFinish();
    }
}
