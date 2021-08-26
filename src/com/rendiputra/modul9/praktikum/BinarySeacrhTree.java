package com.rendiputra.modul9.praktikum;

public class BinarySeacrhTree {
    Node root;

    public boolean isEmpty() {
        return (root == null);
    }

    public void insert(Node input) {
        boolean flag = false;
        if (isEmpty()) {
            root = input;
        } else {
            Node temp = root;
            Node parent = null;
            while (temp != null) {
                parent = temp;
                if (input.data < temp.data) {
                    temp = temp.left;
                    flag = true;
                } else if (input.data > temp.data) {
                    temp = temp.right;
                    flag = true;
                } else {
                    System.out.println("Duplikasi data! data tidak boleh masuk !");
                    break;
                }
            }
            if (flag) {
                if (input.data > parent.data) {
                    parent.right = input;
                } else if (input.data < parent.data) {
                    parent.left = input;
                }
            }
        }
    }

    public void find(int cari) {
        Node temp = root;
        boolean cek = false;
        while (temp != null) {
            if (cari < temp.data) {
                temp = temp.left;
            } else if (cari > temp.data) {
                temp = temp.right;
            } else if (cari == temp.data) {
                cek = true;
                break;
            }
        }
        if (cek) {
            System.out.println("Data " + cari + " ketemu !");
        } else
            System.out.println("Data tidak ketemu !");
    }

    public Node findMax() {
        Node temp = root;
        if (isEmpty()) {
            return null;
        } else {
            while (temp.right != null) {
                temp = temp.right;
            }
            return temp;
        }
    }

    public Node findMin() {
        Node temp = root;
        if (isEmpty()) {
            return null;
        } else {
            while (temp.left != null) {
                temp = temp.left;
            }
            return temp;
        }
    }

    public void remove(int input) {
        if (this.remove(input, root) == null) {
            System.out.println("Data " + input + " tidak ada dalam tree !");
        } else
            root = remove(input, root);
    }

    private Node remove(int input, Node temp) {
        if (temp == null) {
            return null;
        } else {
            if (this.checking(input) == true) {
                if (input < temp.data) {
                    temp.left = remove(input, temp.left);
                } else {
                    if (input > temp.data) {
                        temp.right = remove(input, temp.right);
                    } else {
                        if (temp.left != null && temp.right != null) {
                            temp.data = temp.right.data;
                            this.findMin();
                            temp.right = remove(temp.data,
                                    temp.right);
                        } else {
                            temp = (temp.left != null) ?
                                    temp.left : temp.right;
                            System.out.println("Data " + input + " sudah dihapus");
                        }
                    }
                }
            } else {
                return null;
            }
            return temp;
        }
    }

    void removeAll() {
        if (isEmpty())
            System.out.println("Tree masih kosong !");
        else {
            root = null;
            System.out.println("Data berhasil dihapus semua !");
        }
    }

    public void findDirectory(int input) {
        if (isEmpty()) {
            System.out.println("Tree kosong!");
        } else {
            if (this.checking(input) == true) {
                Node temp = root;
                while (temp != null) {
                    if (input > temp.data) {
                        System.out.print(temp.data + " , ");
                        temp = temp.right;
                    } else if (input < temp.data) {
                        System.out.print(temp.data + " , ");
                        temp = temp.left;
                    } else if (input == temp.data) {
                        System.out.println(input);
                        break;
                    }
                }
            } else
                System.out.println("Data tidak ada dalam tree !");
        }
    }

    public boolean checking(int input) {
        Node temp = root;
        while (temp != null) {
            if (input < temp.data) {
                temp = temp.left;
            } else if (input > temp.data) {
                temp = temp.right;
            } else if (input == temp.data) {
                return true;
            }
        }
        return false;
    }

    public int getLeafCount() {
        return this.getLeafCountHelper(root);
    }

    public int getLeafCountHelper(Node data) {
        if (data == null) {
            return 0;
        } else if (data.left == null && data.right == null) {
            return 1;
        } else {
            return this.getLeafCountHelper(data.left) +
                    this.getLeafCountHelper(data.right);
        }
    }


    public void preOrder(Node data) {
        if(data != null) {
            System.out.print(data.data + " ");
            preOrder(data.left);
            preOrder(data.right);
        }
    }

    public void inOrder(Node data) {
        if(data != null) {
            preOrder(data.left);
            System.out.print(data.data + " ");
            preOrder(data.right);
        }
    }

    public void postOrder(Node data) {
        if(data != null) {
            preOrder(data.left);
            preOrder(data.right);
            System.out.print(data.data + " ");
        }
    }


}
