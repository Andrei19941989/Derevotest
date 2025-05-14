import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TreeTest {
    @Test
    public void containstest()
    {
        MyTree m=new MyTree();
        m.Append(2);
        m.Append(3);
        m.Append(8);
        Assertions.assertEquals(true,m.Contains(3));
    }
   @Test
    public void containstest2()
    {
        MyTree m=new MyTree();
        m.Append(2);
        m.Append(3);
        m.Append(8);
        Assertions.assertEquals(false,m.Contains(1));
    }
}
