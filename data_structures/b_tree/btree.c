#include <stdio.h>
#define m 10

typedef struct node
{
    struct node *fils[2 * m];
    int cle[2 * m - 1];
    int nombre;
} noeud;

typedef noeud *btree;

btree creer()
{
    btree b = (btree)malloc(sizeof(noeud));
    b->nombre = 0;
    for (int i = 0; i < m; i++)
        b->fils[i] = NULL;
}

btree rechercher(btree b, int cle)
{
    if (!b)
        return NULL;
    for (int i = 0; i < b->nombre; i++)
    {
        if (b->cle[i] == cle)
            return b;

        else if (b->cle[i] > cle)
            return rechercher(b->fils[i], cle);
    }
    return rechercher(b->fils[b->nombre], cle);
}

void partager_fils(btree x, int i /* indice du fils qu'on va partager */)
{
    btree y = x->fils[i];
    btree z = creer();
    for (int j = 0; j < m - 1; j++)
    {
        z->cle[j] = y->cle[j + m];
    }
    if (y->fils[0] != NULL)
    {
        for (int j = 0; j < m; j++)
        {
            z->fils[j] = y->fils[j + m];
        }
    }
    z->nombre = m - 1;
    y->nombre = m - 1;
    for (int j = x->nombre; j > i; j--)
    {
        x->cle[j] = x->cle[j - 1];
    }
    x->cle[i] = y->cle[m - 1];
    for (int j = x->nombre + 1; j > i; j--)
    {
        x->fils[j] = x->fils[j - 1];
    }
    x->fils[i + 1] = z;
    x->nombre++;
}

void inserer_(btree x, int cle)
{
    int index = x->nombre - 1;
    if (x->fils[0] == NULL)
    {
        while (index >= 0 && x->cle[index] > cle)
        {
            x->cle[index + 1] = x->cle[index];
            index--;
        }
        x->cle[index + 1] = cle;
        x->nombre++;
    }
    else
    {
        while (index >= 0 && x->cle[index] > cle)
            index--;
        if((x->fils[index+1])->nombre == 2 * m - 1){
            partager_fils(x, index+1);
            if(cle > x->cle[index+1]){
                inserer(x->fils[index+2], cle);
            }
        }else{
            inserer(x->fils[index+1], cle);
        }
        
    }
}

void inserer(btree a, int cle){
    if(a->nombre == 2 * m - 1){
        btree newRoot = creer();
        newRoot->fils[0] = a;
        partager_fils(newRoot, 0);
        inserer_(newRoot, cle);
    }
    inserer_(a, cle);
}