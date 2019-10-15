package com.company;

import java.util.Comparator;

public class MooreVertex implements Comparable<MooreVertex> {
    public String name;
    public String value;

    public MooreVertex(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public int compareTo(MooreVertex vertex) {
        if (vertex.name.equals(this.name) && this.value.equals(vertex.value))
        {
            return 0;
        }
        int compareResult = vertex.name.compareTo(this.name);
        return compareResult == 0 ? -1 : compareResult;
    }
}
