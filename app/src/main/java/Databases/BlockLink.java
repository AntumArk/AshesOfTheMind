package Databases;

/**
 * Created by Linas on 2018-01-24.
 */

public class BlockLink {

    public int id;
    /**Possible link types:
     * Sure - an event or action is sure to happen
     * Highly likely - Possibility 70-99%
     * Likely - 50-70%
     * Unlikely - 20-50%
     * Highly unlikely - 1-20%
     * Uncertain - You are not sure how to measure possibility
     *
     */
    public String linkType;
    public int possibility;
    public int parentID;
    public int childID;

    public BlockLink(int id, String linkType, int possibility, int parentID, int childID) {
        this.id = id;
        this.linkType = linkType;
        this.possibility = possibility;
        this.parentID = parentID;
        this.childID = childID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public int getPossibility() {
        return possibility;
    }

    public void setPossibility(int possibility) {
        this.possibility = possibility;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public int getChildID() {
        return childID;
    }

    public void setChildID(int childID) {
        this.childID = childID;
    }
}
