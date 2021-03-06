/*
 * Copyright 2014-2016 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the “License”);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.openddal.route.algorithm;

import java.util.List;

import com.openddal.route.rule.ObjectNode;
import com.openddal.route.rule.RoutingArgument;

/**
 * @author <a href="mailto:jorgie.mail@gmail.com">jorgie li</a>
 */
public interface MultColumnPartitioner {

    /**
     * calling after the properties hash been set.
     *
     * @param tableNodes
     */
    void initialize(ObjectNode[] tableNodes);
    
    /**
     * args is order by column
     *
     * @param args
     * @return
     */
    Integer[] partition(List<RoutingArgument> args);


}
