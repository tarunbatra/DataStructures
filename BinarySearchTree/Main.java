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
public class Main {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        //assert false;
        BST tree=new BST();
        for(int i=0;i<a.length;i++)
        {
            tree.add(a[i]);
        }
        System.out.println(tree.search(4));
        System.out.println(tree.toString());
    }
}
