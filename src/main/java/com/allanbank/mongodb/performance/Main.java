/*
 * Copyright 2014, Allanbank Consulting, Inc. 
 * 
 * This file is part of MongoDB Asynchronous Driver's Performance Tests.
 *
 * MongoDB Asynchronous Driver's Performance Tests is free software: you 
 * can redistribute it and/or modify it under the terms of version 3 of the 
 * GNU General Public License as published by the Free Software Foundation.
 *
 * MongoDB Asynchronous Driver's Performance Tests is distributed in the hope 
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied 
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MongoDB Asynchronous Driver's Performance Tests. If not, 
 * see <http://www.gnu.org/licenses/>.
 */

package com.allanbank.mongodb.performance;

import java.util.Arrays;

/**
 * Main provides a common launcher for the performance tests.
 * 
 * @copyright 2014, Allanbank Consulting, Inc., All Rights Reserved
 */
public class Main {
    /**
     * The launch point for the tests.
     * 
     * @param args
     *            The command line arguments.
     */
    public static void main(String[] args) {
        if ((args.length > 0) && "bson".equalsIgnoreCase(args[0])) {
            BsonPerformanceITest.main(Arrays.copyOfRange(args, 1, args.length));
        }
        else {
            PerformanceITest.main(args);
        }
    }
}
