/*
 * Copyright 2015 tbking.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package LinkedList;

/**
 *
 * @author tbking
 */
public final class LinkedList
{
    private Nod head,last;
    //make an ampty linked list
    public LinkedList(){}
    
    // make a linked list with d as head
    public <T>LinkedList(T d)
    {
        head=new Nod();
        head.data= d;
        head.next=null;
    }
    
    // make a linked list with array arr
    public <T> LinkedList(T arr[])
    {
        head=new Nod();
        Nod temp=head;
        for(int i=0;i<arr.length;i++)
        {
            insert(arr[i],i); // just inserts each element of the array according to their index
        }
    }
    
    // calculate size of linked list
    public int getSize()
    {
        int size=0;
        Nod temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        return size;
    }
    
    // insert a node at index
    public <T> void insert(T d,int index)
    {
        // if trying to insert a node out of the bounds of the linkedlist, append at the end
        if(index>getSize())
        {
            index=getSize();
        }
        Nod nEw=new Nod();
        nEw.data= d;
        // if inserting at first place
        if(index==0)
        {
            nEw.next=head;
            head=nEw;
        }
        else
        {
            // if inserting at any other place
            int pos=1;
            Nod temp=head;
            while(pos++<index)
            {
                if(temp.next==null)
                    break;
                temp=temp.next;
            }
            nEw.next=temp.next;
            temp.next=nEw;
        }
    }
    
    // delete a node at index
    public void delete(int index)
    {
        // if trying to delete a node which doesn't exist
        if(index>=getSize())
            return;
        if(index==0)
        {
            head=head.next;
        }
        else
        {
            int pos=1;
            Nod temp=head;
            while(pos++<index)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    
    // return the data stored in the linked list
    public String getData(int index)
    {
        // if trying to get data of a  node out of the bounds of the linked list
        if(index>=getSize())
            return null;
        int pos=0;
        Nod temp=head;
        String a=temp.data.toString();
        while(pos++<=index)
        {
            a=temp.data.toString();
            temp=temp.next;
        }
        return a;
    }
    
    //to reverse the linked list
    public void reverse()
    {
        extract(head);
        head.next=null;
        head=last;
    }
    //extracts the node start from the linked list and makes it the next node of it's next recursively
    Nod extract(Nod start)
    {
        if(start.next!=null)
        {
            
            return extract(start.next).next=start;
        }
        else
        {
            return last=start;
        }
    }
    
    //isEmpty method
    public boolean isEmpty()
    {
        return getSize()==0;
    }
    // toString method
    @Override
    public String toString()
    {
        if(head==null)
            return null;
        Nod temp=head;
        String ret="[ "+temp.data;
        while(temp.next!=null)
        {
            ret+=" -> "+temp.next;
            temp=temp.next;
        }
        return ret+" ]";
    }
}