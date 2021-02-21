package advanced.generics.generic_class.example1;

public class GenericBox<T> {
    //Kuriama klasė, kuri gali laikyti bet kokį duomenų tipą,
    // tam reikia prie klasės pavadinimo parašyti <> ir juose
    //T raidę, kuri reiškia type. Tada vietoj duomenų tipo parašom T
    private T item;

    public GenericBox(T item){
        this.item = item;
    }
    //sukuriamas konstruktorius be parametrų ir getteris
    public GenericBox(){

    }
    public T getItem(){
        return item;
    }
    public void setItem(T item){
        this.item = item;
    }
}
