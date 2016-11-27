package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;

/**
 * Created by Rishabh on 11/23/16.
 */

public class AsyncTest extends AndroidTestCase {
    public void testResponseNotNull() throws ExecutionException, InterruptedException {
        assert(new EndpointsAsyncTask().execute(getContext()).get() != "");
    }
}
