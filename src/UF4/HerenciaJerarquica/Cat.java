package UF4.HerenciaJerarquica;

public class Cat extends Animal{
    private void meow() {
        System.out.println("Aleix '" + getId() + "' is meow");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        meow();
    }
}
