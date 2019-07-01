/**
 * Copyright:   Copyright (c)2016
 * Company:     YvesHe
 * @version:    1.0
 * Create at:   2019年7月1日
 * Description:
 *
 * Author       YvesHe
 */
package com.yveshe.tool.pom;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class PomsTest {

    @Test
    public void test() {
        String path = "F:/springmvc/springmvc-chapter2/WebContent/WEB-INF/lib";
        try {
            Poms.getPomXMl(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
