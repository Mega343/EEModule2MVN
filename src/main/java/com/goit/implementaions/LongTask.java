package com.goit.implementaions;

import com.goit.interfaces.Task;

public class LongTask implements Task<Long> {

    private Long result;

    public LongTask(Long result) {
        this.result = result;
    }

    @Override
    public void execute() {

    }

    @Override
    public Long getResult() {
        return result;
    }
}