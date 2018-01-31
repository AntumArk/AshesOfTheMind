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


}
