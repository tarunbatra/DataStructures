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
package Graph;

/**
 *
 * @author tbking
 */
// this class only exists to show the usage of the Graph class
public class Main {
    public static void main(String[] args) {
        Graph obj=new Graph();
        obj.createLink(1, 2);
        obj.createLink(2, 6);
        obj.createLink(2, 5);
        obj.createLink(5, 6);
        System.out.println(obj.toString());
        System.out.println(obj.isLinked(1, 6));
        System.out.println(obj.isLinked(6, 1));
        System.out.println(obj.isLinked(1, 4));
        System.out.println(obj.getShortestPath(1, 3));
    }
}
