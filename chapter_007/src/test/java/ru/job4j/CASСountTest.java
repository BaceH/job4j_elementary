package ru.job4j;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class CASСountTest {
    @Test
    public void when3Increment() {
        CASСount<Integer> c = new CASСount<>();
        c.increment();
        c.increment();
        c.increment();
        assertThat(c.get(), is(3));
    }

    @Test
    public void when3IncrementInThread() throws InterruptedException {
        CASСount<Integer> c = new CASСount<>();
        Thread first = new Thread(c::increment);
        Thread second = new Thread(c::increment);
        first.start();
        second.start();
        first.join();
        second.join();
        assertThat(c.get(), is(2));

    }

}
