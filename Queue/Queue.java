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
package Queue;

import LinkedList.LinkedList;



/**
 *
 * @author tbking
 */
public class Queue {
    private int capacity=-1;
    private LinkedList list=null;
    public Queue()
    {
        list=new LinkedList();
    }
    public Queue(int capacity)
    {
        if(capacity>0)
            this.capacity=capacity;
    }
    public <T> Queue(T[] data)
    {
        list=new LinkedList(data);
    }
    public <T> void add(T data)
    {
        list.insert(data,list.getSize());
    }
    public String peek()
    {
        return list.getData(0);
    }
    public String remove()
    {
        String ret=list.getData(0);
        list.delete(0);
        return ret;
    }
    public boolean isEmpty()
    {
        return list.getSize()==0;
    }
    @Override
    public String toString()
    {
        if(this.isEmpty())
            return null;
        return list.toString().replace("->", ",");
    }
}