package donnees;

public class ComparateurAlbum implements ComparateurCD{
    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        if (cd1.getNomCD().compareTo(cd2.getNomCD()) == -1) {
            return true;
        }
        return false;
    }

}
