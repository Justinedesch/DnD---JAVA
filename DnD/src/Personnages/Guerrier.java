package Personnages;

import Personnages.Personnage;

public class Guerrier extends Personnage {

    /**
     *
     * @param nom
     */

    public Guerrier(String nom) {

     super(nom,"Guerrier",50,10);
    }

    public Guerrier(String nom, String type, int pv, int force) {
        super(nom, type, pv, force);
    }

    public Guerrier(int pv, int force) {
        super(pv, force);
    }

    @Override
    public String toString() {
        return "Le nom de votre personnage est: " + getNom() + "" + " Son type est : " + getType() + "\n" + "\n"+
                "//              \"     (\\/__/)\n" +
                "//             \"       (•ㅅ•)     \\n\" +\n" +
                "//             \"    ＿ノヽ ノ＼＿      \\n\" +\n" +
                "//             \"`/　`/ ⌒Ｙ⌒ Ｙ  ヽ \\n\" +\n" +
                "//             \"( 　(三ヽ人　 /　  |\\n\" +\n" +
                "//             \"|　ﾉ⌒＼ ￣￣ヽ   ノ\\n\" +\n" +
                "//             \"ヽ＿＿＿＞､＿_／\\n\" +\n" +
                "//             \"   ｜( 王 ﾉ〈 \\n\" +\n" +
                "//             \"   /ﾐ`ー―彡\\\\ \" +\n" +
                "//             \"   / ╰    ╯ \\\\ / \")";
    }
}