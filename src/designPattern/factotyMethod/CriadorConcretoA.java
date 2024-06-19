package designPattern.factotyMethod;
public class CriadorConcretoA extends Criador{
    @Override
    public Produto factoryMethod() {
        return new ProdutoConcretoA();
    }
}
