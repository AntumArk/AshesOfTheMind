package Databases;

/**
 * Created by Linas on 2018-01-24.
 */

public class HState {
    public int id;
    /**State
     * States will be used to describe how are you feeling.
     * This will be used to analyse what causes those states, and how often do you have them.
     * For example:
     *      Hunger, lonely, happy, and so on.
     *
     * As there is a huge amount of available states, this will not be classified yet. It would take
     * faster just to simply enter the state instead of selecting it.
     */
    public String state;
    /**Duh!
     *
     */
    public String stateDescription;
    /**Caused by ID.
     * This thingy defines what actually caused that state. Although it can be blank.
     * Upon creation of the state, you should be asked if you want to select what caused it.
     */
    public int causedByID;
    /**Caused by not ID
     * This thingy is used to define if the state was induced because an event did NOT happen.
     * For example:
     *          State "Hungry" would be induced by activity "Not eating". Obviously this kind of reporting
     *          would be kind of stupid. So instead you can select an activity "Eating" for not happening
     *          as a cause for "Hunger".
     */
    public int causedByNOTID;

    /**Created date
     * Date of creation.
     */

    public String createdDate;
    /**Started date
     * An actual date of the change of state. On default it would be equal to creation date.
     *
     */
    public String startedDate;

}
