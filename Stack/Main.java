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
package Stack;

/**
 *
 * @author tbking
 */
// this class only exists to show the usage of the Stack class
public class Main {
    public static void main(String[] args) {
        Stack stck=new Stack();
        System.out.println(stck.toString());    // printing empty stack
        stck.push(1);                           // pushing an int to stack
        stck.push('c');                         // pushing a character to stack
        stck.push("string");                    // pushing a string to stack
        System.out.println(stck.toString());    // printing the stack
        System.out.println(stck.peek());        // peeking from stack
        System.out.println(stck.pop());         // popping from stack
        System.out.println(stck.toString());    //printing the stack
    }
}
/*
output:
null
[ string | c | 1 ]
string
string
[ c | 1 ]
*/
