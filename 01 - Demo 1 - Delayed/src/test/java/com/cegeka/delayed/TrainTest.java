package com.cegeka.delayed;

import com.cegeka.delayed.Train;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TrainTest {

    @Test
    public void getHoursDelayed_givenTrainAndHoursDelayed_correctHoursDelayedReturned() {
        Train train = new Train(2);

        assertThat(train.getHoursDelayed()).isEqualTo(2);
    }
}
