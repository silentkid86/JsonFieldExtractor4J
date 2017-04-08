JSONFieldExtractor4J
===================

Does your Java project has problem dealing with JSON , but does not need the whole JSON information instead focusing some known fields? This module aims to support Java projects for easy , fast , safe way of accessing certain fields in JSON.


Use Case
-------------

Imagine you are accessing third party REST api and the response comes with a large JSON and you just need not more than 10% of the JSON. But you have to cast the whole JSON into memory and accessing the **nested property** is a pain.


Feature Roadmap
----------------
 - ThreadSafe implementation
 - Pattern find JSON field
 - POJO casting
 - JSON dimension reduction 
 - Externalization of extraction properties
 
 
 This is not meant to cast JSON to POJO, but aim to support this feature in the future as a convenience.