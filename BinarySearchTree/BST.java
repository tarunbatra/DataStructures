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
package BinarySearchTree;


/**
 *
 * @author tbking
 */
public class BST {
    private Nod root;
    BST(){}
    void add(int item)
    {
        Nod nEw=new Nod();
        nEw.data=item;
        if(root==null)
            root=nEw;
        else
        {
            Nod tmp=root;
            while(true)
            {
                if(tmp.data<item)
                {
                    if(tmp.right==null)
                    {
                        tmp.right=nEw;
                        break;
                    }
                    else
                        tmp=tmp.right;
                }
                else
                {
                    if(tmp.left==null)
                    {
                        tmp.left=nEw;
                        break;
                    }
                    else
                        tmp=tmp.left;
                }
            }
        }
    }
    boolean search(int item)
    {
        Nod tmp=root;
        while(tmp!=null)
        {
            if(tmp.data==item)
                return true;
            else if(tmp.data>item)
                tmp=tmp.left;
            else
                tmp=tmp.right;
        }
        return false;
    }
    @Override
    public String toString()
    {
        return "";
    }
}
