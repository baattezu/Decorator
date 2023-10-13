public class DecoratorPattern
{
    public static void main(String[] args)
    {
        // бэсик дресс как основа но с спорт атрибутами
        Dress sportyDress = new SportyDress(new BasicDress());
        sportyDress.assemble();
        System.out.println();

        // бэсик дресс как основа но с фэнси атрибутами
        Dress fancyDress = new FancyDress(new BasicDress());
        fancyDress.assemble();
        System.out.println();

        // бэсик дресс как основа но с кэжуал атрибутами
        Dress casualDress = new CasualDress(new BasicDress());
        casualDress.assemble();
        System.out.println();

        // бэсик дресс как основа но с фэнси и спорт атрибутами
        Dress sportyFancyDress = new SportyDress(new FancyDress(new BasicDress()));
        sportyFancyDress.assemble();
        System.out.println();
        // бэсик дресс как основа но с фэнси и кэжуал атрибутами
        Dress casualFancyDress = new CasualDress(new FancyDress(new BasicDress()));
        casualFancyDress.assemble();
    }
}
//Component (Dress interface): This is the common interface that both the concrete objects and decorators implement. In your code, it's represented by the Dress interface, which defines the assemble method.
//
//Concrete Component (BasicDress): This is the base class that implements the component interface. In your code, BasicDress is a concrete dress with the basic features.
//
//Decorator (DressDecorator): This is an abstract class that also implements the component interface. It contains a reference to a component (the dress) and has an assemble method, which it delegates to the component. Decorators add additional functionality to the component. In your code, DressDecorator is the base decorator class.
//
//Concrete Decorators (CasualDress, SportyDress, FancyDress): These are concrete classes derived from the decorator base class (DressDecorator). Each concrete decorator adds specific features to the dress by extending the assemble method. For example, CasualDress adds casual features, SportyDress adds sporty features, and FancyDress adds fancy features.
//
//Client Code (main method): In your main method, you create various combinations of dress objects. You can stack multiple decorators on top of a basic dress object to add different sets of features.