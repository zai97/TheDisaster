/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedisaster;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author C0116168
 */
public class Time {

    Timer timer = new Timer(false);
    TimerTask task = new TimerTask() {

        int cnt = 0;

        @Override
        public void run() {
            System.out.println("てすと");
            cnt++;
            //5回実行で停止
            if (cnt >= 5) {
                timer.cancel();
            }
        }
    };
}
