package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("donald knuth")) {
            return "Donald Ervin Knuth is an American computer scientist, mathematician, and professor emeritus at " +
                "Stanford University. He is the 1974 recipient of the ACM Turing Award, informally considered the " +
                "Nobel Prize of computer science. Knuth has been called the \"father of the analysis of algorithms.";
        }

        if (query.toLowerCase().contains("joe biden")) {
            return "Joseph Robinette Biden Jr. is an American politician who is the 46th president of the United " +
                "States. A member of the Democratic Party, he served as the 47th vice president from 2009 to 2017 under " +
                "Barack Obama and represented Delaware in the United States Senate from 1973 to 2009.";
        }

        return "";
    }
}
