using System;

namespace AbstractDataTypes
{
    abstract class LinkedList<T> : IList<T> where T : IComparable
    {
        protected Node head, tail;

        public abstract void Insert(T i);
        public abstract void Remove(T i);

        public void Print()
        {
            Node p = head;
            while (p != null)
            {
                Console.WriteLine(p.data);
                p = p.next;
            }
            Console.WriteLine();
        }

        public class Node
        {
            public Node next;      //Pointer
            public T data;       //Data

            public Node(T data)
            {
                this.data = data;
                next = null;        //Initialized as null
            }
        }

        protected static void Clear()
        {
            Clear();
        }
    }
}
