public class CasualDress extends DressDecorator
{
    public CasualDress(Dress c)
    {
        super(c);
    }
    @Override
    public void assemble()
    {
        super.assemble();
        System.out.println("Adding Casual Dress Features");
    }
}
// Create specific decorator classes that add additional features to the dress.
