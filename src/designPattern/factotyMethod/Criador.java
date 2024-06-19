package designPattern.factotyMethod;
public abstract class Criador {
    public abstract Produto factoryMethod();
    public void algumMetodo() {
        Produto produto = factoryMethod();
        produto.usar();
    }
}
