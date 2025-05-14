public class Node {//класс описывет узел дерева
    public int Value;//значение узла
    public Node Left;//ссылка на левую ветвь
    public Node Right;//ссылка на правую ветвь
    public Node(int Value, Node Left, Node Right)
    {
     this.Value=Value;
     this.Left=Left;
     this.Right=Right;
    }

    @Override
    public String toString() {
        return String.valueOf((Value));//преврашение числа в строку
    }
}
