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

/**
 *
 * @author tbking
 */
// this class only exists to show the usage of the Stackclass
public class Main {
    public static void main(String[] args) {
        Queue q=new Queue();
        System.out.println(q.toString());    // printing empty queue
        q.add(1);                           // pushing an int to queue
        q.add('c');                         // pushing a character to queue
        q.add("string");                    // pushing a string to queue
        System.out.println(q.toString());    // printing the queue
        System.out.println(q.peek().toString());        // peeking from queue
        System.out.println(q.remove().toString());         // popping from queue
        System.out.println(q.toString());    //printing the queue
    }
}

/*
output:
null
[ 1 , c , string ]
1
1
[ c , string ]
*/
