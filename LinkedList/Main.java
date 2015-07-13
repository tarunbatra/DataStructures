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

// this class only exists to show the usage of the LinkedList class
public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList list=new LinkedList();         // create an empty linked list
        System.out.println(list.toString());    // printing empty list
        list.insert(1, 0);                      // inserting an int to linked list
        list.insert('c', 0);                    // inserting a character to linked list
        list.insert("string", 1);               // inserting a string to linked list
        System.out.println(list.toString());    // printing the linked list
        list.delete(1);                         // deleting node at index 1
        System.out.println(list.toString());    //printing the linked list
        list.reverse();                         //reversing the linked list
        System.out.println(list.toString());    //printing the linked list
        
    }
}

/*
output :
null
[ c -> string -> 1 ]
[ c -> 1 ]
[ 1 -> c ]
*/
