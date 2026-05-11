package donnees;

public class ComparateurArtiste implements ComparateurCD {
    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        if (cd1.getNomArtiste().compareTo(cd2.getNomArtiste()) == -1) {
            return true;
        }
        return false;
    }

}
