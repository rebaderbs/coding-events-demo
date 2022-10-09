package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    // need a place to put events (data structure of some type)
    // static so there's only going to be one of these
    // of type Map (interface) with Integer, Event pairs - Map object is going to store Integer: Event pairs
    // using Ids as the Key will allow us to easily retrieve the events
    // final b/c Map itself can't change, but data inside CAN change
    private static final Map<Integer, Event> events = new HashMap<>();

    // get all events (all events listed out in a table)
    // don't need to return the keys, just the values
    // collection is an interface, extends the Iterable interface (has behaviors that relate to iterating over a collection)
    public static Collection<Event> getAll() {
        return events.values();
    }

    // get a single event
    // caller will pass in an id to retrieve the item with the specific id that matches
    public static Event getById(Integer id) {
        return events.get(id);
    }

    // add an event to our collection
    public static void add(Event event) {
        events.put(event.getId(), event);
    }

    // remove an event
    // need to know id in order to remove it, so single parameter for the id
    public static void remove(Integer id) {
        if (events.containsKey(id)) {
                events.remove(id);
        }
    }
}
