package Assigment_7;

public class MyTable {
    private Entry[] entries = new Entry[26];


    public String get(char c) {
        int index = c - 'a';
        if (index >= 0 && index < entries.length && entries[index] != null) {
            return entries[index].str;
        }
        return null;
    }


    public void add(char c, String s) {
        int index = c - 'a';
        if (index >= 0 && index < entries.length) {
            entries[index] = new Entry(c, s);
        }
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                sb.append(entry.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }

        public String toString() {
            return ch + "->" + str;
        }
    }

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        System.out.println(t);
    }

}
