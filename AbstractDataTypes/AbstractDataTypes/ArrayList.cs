using System;

namespace AbstractDataTypes
{
    abstract class ArrayList<T>: IList<T>
    {
        protected T[] list;
        protected int next;

        public ArrayList()
        {
            list = new T[100];
            next = 0;
        }

        public abstract void Insert(T item);

        public abstract void RemoveAll(T item);

        public abstract void Min();
        public abstract void Max();

        public void Remove(T item)
        {
            if (next != 0)
            {
                //find value, if it exists
                for (int i = 0; i < next; i++)
                {
                    if (item.Equals(list[i]))
                    {
                        for (int j = i; j < next; j++) list[j] = list[j + 1];
                        next--;
                        break;
                    }
                }
            }
        }

        public void Print()
        {
            for (int i = 0; i < next; i++)
            {
                Console.WriteLine(list[i]);
            }
        }
    }
}
