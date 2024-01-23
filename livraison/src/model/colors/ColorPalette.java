package model.colors;

/**
 * Class représentant une palette de couleurs pour les pièces Tetris
 */
public class ColorPalette {

    // Tableau de couleurs prédéfinies
    private String[] colorPalette = new String[]{"#63145b","#EC8F5E","#80014d","#f23553","#005169","#569fb1","#F0DBAF","#B06161","#C683D7","#860A35","#FFE3BB"};
    public String randomColor(){
        int choice = (int) (Math.random()* colorPalette.length -1);
        return colorPalette[choice];
    }
}
