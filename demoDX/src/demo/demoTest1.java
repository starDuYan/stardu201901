package demo;

import java.time.Instant;
import java.util.Date;

/**
 * @author duxing QQ:1013189674
 * @version 1.0
 * @创建日期：2019年9月3日 下午11:51:18
 * @ClassName demoTest1
 */
public class demoTest1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
		// test git 
        Date date = Date.from(Instant.now());
        System.out.println(date);
    }

}
