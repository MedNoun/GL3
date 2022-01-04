package com.codewithmosh.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList();
    public void push(String url){
        urls.add(url);
    }
    public String pop(){
        return urls.remove(urls.size() - 1);
    }
   
    public Iterator createIterator(){
        return new ArrayIterator(this);
    }
    public class ArrayIterator implements Iterator<String> {
        private BrowseHistory hist;
        private int index;
        public ArrayIterator(BrowseHistory browseHistory) {
            hist= browseHistory;
            index=0;
        }

        @Override
        public String current() {
            return hist.urls.get(index);
        }
    
        @Override
        public Boolean hasNext() {
            
            return (hist.urls.size()>index);
        }
    
        @Override
        public void next() {
            index++;
            
        }
        
    
        
        
    }
    
}
