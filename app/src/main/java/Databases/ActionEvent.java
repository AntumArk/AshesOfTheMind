package Databases;

import java.io.File;
import java.util.Date;

/**
 * Created by Linas on 2017-12-21.
 */

public class ActionEvent {

    public int id;
    /**Event Type
     * It will be used to define what the hell are doing and what will you do.
     * Types include:
     *
     * Action - Hooray! You have decided to do something about your life! Action - short activity which you have initiated.
     * For example: "Locking your door" or "Kissing a girl you like" ... Yeah... Wise decisions...
     *
     * Activity - Duh... An activity. You do this thing for a period of time. Upon creation it is considered started.
     * You should be also able either predict the duration, or end it.
     * For example:
     *          Travelling by bus. - That is an activity which duration is predetermined ( if nothing else happens).
     *          Preparing dinner. - An activity which duration is highly unpredictable, then you should consider either keeping it running,
     *          until you finish, or adjust the duration prediction later.
     *
     *Happening - A short event which is out of your control. It may or may not have consequences.
     * For example:
     *          Lost my keys.
     *          Failed an exam.
     *          A girl confessed that she likes you........
     *
     *Event - A lasting event which is out of your control.
     * For example:
     *          The war.
     *          Holidays.
     */
    public String eventType;
    /**Event name
     *  A couple of words to describe your event/action
     */
    public String eventName;
    /**Event description
     * An extended essay on what the hell is happening.
     */
    public String eventDescription;
    /**Created date
     *Date when an event was created. Not necessary means that it happen then. It is just for the measure.
     */
    public String createdDate;
    /**Started date
     * Duh!
     */
    public String startedDate;
    /**Finished date
     * Almost duh. Actions will have same started and finished date, because their duration is so short that it is basically
     * not worth it to measure.
     */
    public String finishedDate;

}
