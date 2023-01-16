package Projeto;
/*links pra saber mais sobre os assunto:
 *  https://www.baeldung.com/java-binary-tree <- este foi o mais utilizado
 *  https://www.devmedia.com.br/entendendo-e-aplicando-heranca-em-java/24544
 *  Livro: Estrutura de dados e algoritmos em java
 */
public class ArvoreProjeto {
    protected Pessoa rootPessoa;
    
    
    private void updateHeight(Pessoa n) {
        n.height = 1 + Math.max(height(n.left), height(n.right));
    }

    public int height(Pessoa n) {
        return n == null ? -1 : n.height;
    }

    int getBalance(Pessoa n) {
        return (n == null) ? 0 : height(n.right) - height(n.left);
    }
    
    private Pessoa rotateRight(Pessoa y) {
        Pessoa x = y.left;
        Pessoa z = x.right;
        x.right = y;
        y.left = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private Pessoa rotateLeft(Pessoa y) {
        Pessoa x = y.right;
        Pessoa z = x.left;
        x.left = y;
        y.right = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private Pessoa rebalance(Pessoa z) {
        updateHeight(z);
        int balance = getBalance(z);
        if (balance > 1) {
            if (height(z.right.right) > height(z.right.left)) {
                z = rotateLeft(z);
            } else {
                z.right = rotateRight(z.right);
                z = rotateLeft(z);
            }
        } else if (balance < -1) {
            if (height(z.left.left) > height(z.left.right))
                z = rotateRight(z);
            else {
                z.left = rotateLeft(z.left);
                z = rotateRight(z);
            }
        }
        return z;
    }

    public void insertIn(int idCell) {
        rootPessoa = insert(rootPessoa, idCell);
    }
    private Pessoa insert(Pessoa node, int idCell) {
        /*Semana treinos = new Semana();
        treinos = Semana.criarRotina();
        String titulo = Integer.toString(idCell);
        Mjson.criarArquivo(treinos, titulo);*/

        if (node == null) {
            return new Pessoa(idCell, null);
        } else if (node.idCell > idCell) {
            node.left = insert(node.left, idCell);
        } else if (node.idCell < idCell) {
            node.right = insert(node.right, idCell);
        } else {
            throw new RuntimeException("duplicate id!");
        }
        return rebalance(node);
    }


    public void deleteThis(int id){
        rootPessoa = delete(rootPessoa, id);
    }

    public Pessoa delete(Pessoa node, int idCell) {
        if (node == null) {
            return node;
        } else if (node.idCell > idCell) {
            node.left = delete(node.left, idCell);
        } else if (node.idCell < idCell) {
            node.right = delete(node.right, idCell);
        } else {
            if (node.left == null || node.right == null) {
                node = (node.left == null) ? node.right : node.left;
            } else {
                Pessoa mostLeftChild = acharMenorValor(node.right);
                //System.out.println(node.idCell);
                //System.out.println(mostLeftChild.idCell);
                node.idCell = mostLeftChild.idCell;
                node.right = delete(node.right, node.idCell);
            }
        }
        if (node != null) {
            node = rebalance(node);
        }
        return node;
    }

    //acha o menor valor de forma recursiva
    private Pessoa acharMenorValor(Pessoa root) {
        return root.left == null ? root : acharMenorValor(root.left);
    }
    
    //acha o menor valor 
    public Pessoa mostLeftChild(Pessoa no){
        while (no != null) {
            if (no.left == null) {
                return no;
            }
            no = no.left;
        }
        return no;
    }    

    private boolean achouEssaTabaca(Pessoa pessoa, int id) {
        //String titulo = Integer.toString(id);
        if (pessoa == null) {
            return false;
        }
        if (id == pessoa.idCell) {
            //Mjson.lerArquivo(titulo);
            return true;
        }
        return id < pessoa.idCell ? achouEssaTabaca(pessoa.left, id) : achouEssaTabaca(pessoa.right, id);

    }

    public boolean achou(int id) {
        return achouEssaTabaca(rootPessoa, id);
    }
    
}
