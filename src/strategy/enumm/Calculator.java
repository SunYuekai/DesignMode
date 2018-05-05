package strategy.enumm;

/**
 * ����ģʽ���ö��
 *
 */
public enum Calculator {




    PIUS
            {  @Override
                public double cacl(int x,int y)
                {
                    return x+y;
                }
            }
    ,
    MINUS
            {  @Override
                public double cacl(int x,int y)
                {
                    return x-y;
                }
            }
    ,
    TIMES
            {     @Override
                public double cacl(int x,int y)
                {
                    return x*y;
                }
            }
    ,
    DIVIDE
            {   @Override
                public double cacl(int x,int y)
                {
                    return x/y;
                }
            }
    ;
    public abstract double cacl(int x,int y);


}
