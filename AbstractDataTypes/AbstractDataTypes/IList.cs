using System;

namespace AbstractDataTypes
{
    interface IList<T>
    {
        // Insert() method places one item in the list
        void Insert(T item);
        // Remove() method removes first instance of item in list
        void Remove(T item);
        // Print() method prints all items in list
        void Print();
    }
}
