package Day15;

interface K{
    void abc();
}
interface R{
    void xxx();
}
class YOU implements K,R{
    public void abc(){

    }
    public void xxx(){

    }
}

interface X extends K{
    void def();
}

abstract class Y implements X{
    public void def(){

    }
    abstract void kor();
}

class KOR extends Y{
    public void abc(){

    }
    void kor(){

    }
}

public class InterfaceTest {
}
