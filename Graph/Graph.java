package Graph;

import java.util.Arrays;

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

/**
 *
 * @author tbking
 */
public class Graph {
    final private int size;
    final private int[][] matrix;
    Graph(int size)
    {
        this.size=size;
        matrix=new int[size][size];
    }
    Graph()
    {
        size=10;
        matrix=new int[size][size];
    }
    
    public void createLink(int a,int b)
    {
        try
        {
            matrix[a][b]=1;
            matrix[b][a]=1;
        }
        catch(Exception e)
        {
            System.out.println("ERROR: Link creation failed: "+a+","+b);
        }
    }
    @Override
    public String toString()
    {
        String ret="";
        int v=0;
        for(int[]i:matrix)
        {
            ret+=v+++": "+Arrays.toString(i)+"\n";
        }
        return ret;
    }
    
    public boolean isLinked(int a,int b)
    {
        System.out.println("a="+a+" b="+b);
        if(a>size || b>size)
            return false;
        if(matrix[a][b]!=0 ||matrix[b][a]!=0)
            return true;
        for(int i=a+1;i<size;i++)
        {
            //System.out.println("i="+i);
            if(matrix[a][i]!=0)
            {
                if(isLinked(i,b))
                    return true;
            }
        }
        return false;
    }
    public int getShortestPath(int a,int b)
    {
        int len=0;
        int r=getLen(a,b,len);
        return (r==Integer.MAX_VALUE)?-1:r;
    }
    private int getLen(int a,int b,int len)
    {
        //System.out.println("a="+a+" b="+b+" len="+len);
        if(matrix[a][b]!=0)
            return len+matrix[a][b];
        int ret=Integer.MAX_VALUE;
        for(int i=a+1;i<size;i++)
        {
            if(matrix[a][i]!=0)
            {
               int tmp=getLen(i,b,len+matrix[a][i]);
               if(tmp!=Integer.MAX_VALUE)
               {
                   if(tmp<ret)
                       ret=tmp;
               }
            }
        }
        return ret;
    }
}
