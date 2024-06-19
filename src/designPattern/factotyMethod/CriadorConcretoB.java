package designPattern.factotyMethod;
public class CriadorConcretoB extends Criador{
    @Override
    public Produto factoryMethod() {
        return new ProdutoConcretoB();
    }
}
