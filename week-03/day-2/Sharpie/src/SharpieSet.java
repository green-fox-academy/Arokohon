import java.util.List;

public class SharpieSet {

  List<Sharpie> newList;

  public int countUsable () {
    int countUsable = 0;
    for (int i = 0; i < newList.size(); i++) {
      if (Sharpie.inkAmount > 0) {
        countUsable++;
      }
    }
    return countUsable;
  }

  public void removeTrash () {
    for (int i = 0; i < newList.size(); i++) {
      if (Sharpie.inkAmount == 0) {
        newList.remove(i);
      }
    }
  }
}
