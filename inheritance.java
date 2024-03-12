Class Calc 
{
    Public int add (int a,int b){
        return a+b;
    }
}
Class advance Calc.extend Calc
{
    Public double power (double x, double y)
    {
        return math power(x,y);
    }
}
Public static void main (string[]args)
{
Calc new calc = new Calc ();
S.O.P (new Calc.add (1,2));
Calc Calc = new advance Calc ()
S.O.P(Calcl.power(2,3));
S.O.P(Calcl.add(2,3));
}
