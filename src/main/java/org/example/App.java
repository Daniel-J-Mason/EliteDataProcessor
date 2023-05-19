/*
 *  Copyright 2021 The original authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.example;

import org.example.entities.Listing;
import org.example.processors.SystemProcessor;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        //String entityType = args[1];
        
        File input = new File("/home/kal/ReferenceHub/EDDB2 Data/Test/one.json");
        File output = new File("/home/kal/ReferenceHub/EDDB2 Data/Test/output.csv");
        
        SystemProcessor.process(input, output);
        
        Listing temp = Listing.builder()
                .id(40921806L)
                .station_id(1L)
                .commodity_id(360L)
                .supply(0)
                .supply_bracket(0)
                .buy_price(0)
                .sell_price(3703)
                .demand(7)
                .demand_bracket(3)
                .collected_at(new Date(1596986551L * 1000))
                .build();
        
        System.out.println(temp.collected_at());
        
        
    }
}
