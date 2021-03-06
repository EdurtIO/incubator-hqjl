package io.edurt.hqjl.aggregator; /**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * <p> AggregatorFactory </p>
 * <p> Description : AggregatorFactory </p>
 * <p> Author : qianmoQ </p>
 * <p> Version : 1.0 </p>
 * <p> Create Time : 2020-01-04 18:29 </p>
 * <p> Author Eamil: <a href="mailTo:shichengoooo@163.com">qianmoQ</a> </p>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes(value = {
        @JsonSubTypes.Type(name = "longSum", value = AggregatorLongSumFactory.class),
        @JsonSubTypes.Type(name = "longMax", value = AggregatorLongMaxFactory.class),
        @JsonSubTypes.Type(name = "longMin", value = AggregatorLongMinFactory.class),
        @JsonSubTypes.Type(name = "doubleSum", value = AggregatorDoubleSumFactory.class),
        @JsonSubTypes.Type(name = "doubleMax", value = AggregatorDoubleMaxFactory.class),
        @JsonSubTypes.Type(name = "doubleMin", value = AggregatorDoubleMinFactory.class)
})
public interface AggregatorFactory {

    String getName();

}
