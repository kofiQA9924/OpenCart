package com.OpenCart.Utilities;

import com.OpenCart.Base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by RUTHERFORD on 5/30/2021.
 */
public class Capture extends BaseClass {
    public Capture() throws FileNotFoundException {
        super();
    }
    public void errorShot() throws IOException {
        File screenshotsrc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotsrc,new File(System.getProperty("user.dir")+"/Screenshots/"+System.currentTimeMillis()+"OpenCartReport.img"));
    }
}
