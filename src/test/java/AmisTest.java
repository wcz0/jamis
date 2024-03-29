import org.junit.Test;

import com.alibaba.fastjson2.JSON;
import com.wcz0.Amis;

public class AmisTest {

    @Test
    public void testAmis()  {

        String str2 = JSON.toJSONString(Amis.Page().title("这是标题").body(new Object[]{
            Amis.Action().className("Test").toJson(),
        }).toJson());
        System.out.println(str2);
    }
}
