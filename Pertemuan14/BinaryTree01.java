public class BinaryTree01 {
    node01 root;

    public BinaryTree01() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa01 mahasiswa) {
        node01 newNode = new node01(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            node01 current = root;
            node01 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        node01 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(node01 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(node01 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(node01 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    node01 getSuccessor(node01 del) {
        node01 succesor = del.right;
        node01 succesorParent = del;
        while (succesor.left != null) {
            succesorParent = succesor;
            succesor = succesor.left;
        }
        if (succesor != del.right) {
            succesorParent.left = succesor.right;
            succesor.right = del.right;
        }
        return succesor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        node01 parent = root;
        node01 current = root;
        boolean isLeftChild = true;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if ((current == root)) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                node01 succeesor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                succeesor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = succeesor;
                } else {
                    if (isLeftChild) {
                        parent.left = succeesor;
                    } else {
                        parent.right = succeesor;
                    }
                }
                succeesor.left = current.left;
            }
        }
    }

    public node01 addRekursif(node01 current, Mahasiswa01 mahasiswa) {
        if (current == null) {
            return new node01(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else {
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }

    public void addRekursif(Mahasiswa01 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }

    public void tampilMinMaxIPK() {
        node01 currentMin = root;
        while (currentMin.left != null) {
            currentMin = currentMin.left;
        }

        node01 currentMax = root;
        while (currentMax.right != null) {
            currentMax = currentMax.right;
        }

        System.out.println("IPK Terkecil:");
        System.out.println("Nama: " + currentMin.mahasiswa.nama + ", IPK: " + currentMin.mahasiswa.ipk);
        System.out.println("IPK Terbesar:");
        System.out.println("Nama: " + currentMax.mahasiswa.nama + ", IPK: " + currentMax.mahasiswa.ipk);
    }

    public void tampilMahasiswaIPKdiAtas(node01 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);

            if (node.mahasiswa.ipk > ipkBatas) {
                System.out.println("Nama: " + node.mahasiswa.nama + ", IPK: " + node.mahasiswa.ipk);
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }

}
