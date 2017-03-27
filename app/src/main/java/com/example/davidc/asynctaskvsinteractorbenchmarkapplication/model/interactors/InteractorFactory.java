package com.example.davidc.asynctaskvsinteractorbenchmarkapplication.model.interactors;

import com.example.davidc.interactorlibrary.TaskScheduler;

public class InteractorFactory {
    private final TaskScheduler taskScheduler;

    public InteractorFactory(TaskScheduler taskScheduler) {
        this.taskScheduler = taskScheduler;
    }

    public ShortJobBenchmarkInteractor createShortBenchmarkInteractor() {
        return new ShortJobBenchmarkInteractor(taskScheduler);
    }

    public LongJobBenchmarkInteractor createLongBenchmarkInteractor() {
        return new LongJobBenchmarkInteractor(taskScheduler);
    }
}
