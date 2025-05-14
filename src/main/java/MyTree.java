public class MyTree {//дерево которое состоит из нодов
    public Node FirstNode;//ссылка на первый элемент дерева
    public MyTree()
    {
    FirstNode=null;
    }
    public void Append(int Element)//добавление нового элемента
    {
        if(FirstNode==null)//проверка что дерерво пустое
        {
         FirstNode=new Node(Element,null,null);//создаем первый элемент дерева
        }
        else//когда элемент в дереве уже существует
        {
            Node Carent=FirstNode;//текущий элемент
            Node Prev=null;//предыдущий элемент
            while(Carent!=null)//пока не найдем нужную ветвь
            {
                if(Carent.Value>Element)//если текущий элемент больше чем тот который мы добавляем то идем влево
                {
                    Prev=Carent;
                    Carent=Carent.Left;
                }
                else
                {
                    Prev=Carent;
                    Carent=Carent.Right;
                }
            }
            Carent=new Node(Element,null,null);//создаем новый элемент
            if(Prev.Value> Carent.Value)//меньше текущий предыдущегото значит записываем в левую ветвь
            {
              Prev.Left=Carent;
            }
            else
            {
             Prev.Right=Carent;
            }
        }
    }

    /*@Override
    public String toString() {

    }*/

    public boolean Contains(int c) {//метод который проверяет есть ли такой элемент
        Node Carent = FirstNode;
        while (Carent != null) {
            if (Carent.Value == c) {
                return true;
            } else if (Carent.Value > c) {
                Carent = Carent.Left;
            }
            else
                    {
                      Carent=Carent.Right;
                    }
        }
        return false;
    }

}
