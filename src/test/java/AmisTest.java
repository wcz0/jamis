import org.junit.Test;

import com.alibaba.fastjson2.JSON;
import com.wcz0.Amis;

public class AmisTest {

    @Test
    public void testAmis()  {
        // String str = JSON.toJSONString(Amis.action().actionType("test"));
        String str2 = Amis.action().actionType("test").toJson();
        // System.out.println(str);
        System.err.println(str2);
    }
}
