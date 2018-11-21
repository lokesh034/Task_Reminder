
package Reminder;

import java.io.Serializable;

public class CollectionUrl implements Serializable {
    private int flag=0;
    private String path;

    @Override
    public String toString() {
        return "CollectionUrl{" + "flag=" + flag + ", path=" + path + '}';
    }

    public int getFlag() {
        return flag;
    }

    public String getPath() {
        return path;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
