package generic;

public class GenericPrinter<T extends Material> {
    
    private T material; // 나중에 T 위치에 실제 사용할 자료형을 입력.

    public void setMaterial (T material) {
        this.material = material;
    }
    public T getMaterial () { 
        return material;
    }
    public String toString() {
        return material.toString();
    }
}
