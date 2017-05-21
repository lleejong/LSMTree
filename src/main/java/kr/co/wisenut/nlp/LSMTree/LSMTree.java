package kr.co.wisenut.nlp.LSMTree;

import com.indeed.lsmtree.core.Store;

/**
 * Created by lleejong on 2017-05-18.
 */
public class LSMTree <K,V>{
    Store<K,V> index;
    public LSMTree(){
    
    }
    
    public static void main(String args[]){
        LSMTree<String, Integer> lsmTree = new LSMTree<String, Integer>();
    }
}
