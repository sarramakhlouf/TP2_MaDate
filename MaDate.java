public class MaDate
{
    private int jour;
    private int mois;
    private int annee;
    public MaDate (int j, int m,int a)
    {
        jour=j;
        mois=m;
        annee=a;
    }
    public MaDate (int a)
    {
        this.jour=1;
        this.mois=1;
        this.annee=a;
    }
    int Getjour()
    {
        return jour;
    }
    int Getmois ()
    {
        return mois;
    }
    int Getannee()
    {
        return annee;
    }
    void Setjour(int j)
    {
        this.jour=j;
    }
    void Setannee (int a) 
    {
        this.annee=a;
    }
    /*Void Setmois (int m)
    {
        this.mois=m;
    }*/
  
    public String ToString () 
    {
        return jour+"/"+mois+"/"+annee;
    }
    private int NombreJoursDansMois()
    {
        switch (mois)
        {
            case 2:
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default :
                return 31;
        }
    }
    public void ajouterUnJour()
    {
        jour++;
        if (jour>NombreJoursDansMois())
        {
            jour=1;
            ajouterUnMois();
        }
    }
    public void ajouterPlusieursJours (int n)
    {
        for(int i=1;i<n;i++)
        {
            ajouterUnJour();
        }
    }
    public void ajouterUnMois()
    {
        mois++;
        if (mois>12)
        {
            mois=1;
            ajouterUnAn();
        }
    }
    public void ajouterUnAn()
    {
        annee++;
    }
}