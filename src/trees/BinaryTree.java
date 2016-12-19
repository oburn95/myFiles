/*
code written by Professor Greci to implement a BinaryTree class and to
be able to add things to said BinaryTree
 */
package trees;

/**
 *
 * @author Sean
 */
public class BinaryTree<K, V> implements BinaryTreeADT<K, V> {

    private K key;
    private V value;
    private BinaryTree<K, V> lchild;
    private BinaryTree<K, V> rchild;

    public BinaryTree() {
        key = null;
    }

    
    public V value() {
        return value;
    }

    @Override
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean empty() {
        return key == null;
    }

    @Override
    public int height() {
        if (empty()) {
            return 0;
        } else {
            return 1 + max(lchild.height(), rchild.height());

        }
    }

    @Override
    public void preorder() {
        if (!empty()) {
            visit();
            lchild.preorder();
            rchild.preorder();
        }
    }

    @Override
    public void inorder() {
        if (!empty()) {
            lchild.inorder();
            visit();
            rchild.inorder();
        }
    }

    @Override
    public void postorder() {
        if (!empty()) {
            lchild.preorder();
            rchild.preorder();
            visit();
        }
    }

    @Override
    public void addLR(K key, V value, String dir) throws BinaryTreeCreationException {
        try {
            if(dir.equals("")){
                sprout(key,value);
            } else if(dir.substring(0, 1).equalsIgnoreCase("L")){
                lchild.addLR(key, value, dir.substring(1));
            } else if(dir.substring(0, 1).equalsIgnoreCase("R")){
                rchild.addLR(key, value, dir.substring(1));
            } else {
                throw new BinaryTreeCreationException("### strange directional indicator: " + dir.substring(0,1));
            }
        } catch (BinaryTreeCreationException e){
            throw new BinaryTreeCreationException("### no such location in the tree");
        }
    }

    @Override
    public void addND(K key, V value) {
        if(empty()){
            sprout(key,value);
        } else if (Math.random()< 0.5){
            lchild.addND(key, value);
        } else {
            rchild.addND(key, value);
        }
    }

    @Override
    public void addST(K key, V value) throws BinaryTreeCreationException {
        if (empty()) {
            sprout(key,value);
        }else{
            Comparable cey = (Comparable) key;
            Comparable t = (Comparable) this.key;
            if (cey.compareTo(t)<0) {
                lchild.addST(key, value);
                
            }else if(cey.compareTo(t)>0){
                rchild.addST(key, value);
            }else{
                throw new BinaryTreeCreationException("### can't have equality in bst");
            }
        }
    }

    @Override
    public V get(K key) {
       BinaryTree<K,V> t = find(key);
       return t.value;
    }

    @Override
    public BinaryTree<K, V> find(K key) {
        if (empty()) {
            return null;
        } else if(this.key.equals(key)){
            return this;
        } else {
            BinaryTree<K,V> l =lchild.find(key);
            if(l != null) {return l;}
            BinaryTree<K,V> r = rchild.find(key);
            if( r !=null) {return r;}
            return null;
        }
    }

    @Override
    public boolean member(K key) {
        if( empty()){
            return false;
        } else if (this.key.equals(key)){
            return true;
        } else{
            return ( lchild.member(key)| rchild.member(key));
        }
    }

    @Override
    public void visit() {
        String rep;
        if (value == null){
            rep = "---";
        } else{
            rep = value.toString();
        }
        String s = "[" + key + ":" + rep + "]";
        System.out.println(s);
    }

    @Override
    public void sprout(K key, V value) {
        this.key = key;
        this.value = value;
        this.lchild = new BinaryTree<K,V>();
        this.rchild = new BinaryTree<K,V>();
    }

    private int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
