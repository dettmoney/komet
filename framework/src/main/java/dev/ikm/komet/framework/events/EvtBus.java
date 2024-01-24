/*
 * Copyright © 2015 Integrated Knowledge Management (support@ikm.dev)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.ikm.komet.framework.events;


import java.util.*;

/**
 * Event Bus. Allow components in the Komet Application to communicate
 * events to other components in a decoupled way
 */
public interface EvtBus {

    static final Map<String, EvtBus> evtBusMap = new HashMap<>();

    <T extends Evt> void publish(Enum topic, T evt);

    /**
     * subscribe to a topic
     * @param topic the topic name
     * @param subscriber subscriber to the topic
     */
    void subscribe(Enum topic, Subscriber subscriber);

    /**
     * unsubscribe to the topic
     * @param topic the topic name
     * @param subscriber the subscriber to the topic
     */
    void unsubscribe(Enum topic, Subscriber subscriber);

}
