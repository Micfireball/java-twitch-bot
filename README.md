# java-twitch-bot
A private java project using PircBotX library to control a twitch IRC bot

This is meant only to act as a portfolio project. The main library from this code is PircBotX,
which can be found here: https://github.com/TheLQ/pircbotx

Files of interest are:
BaseGUI.java      - Displays basic GUI configuration
Commands.java     - Handles a message event and runs necessary functions
Elo.java          - Parses HTML from a URL request in order to find specific data from the website
FileRead.java     - Reads and writes data to local directory .txt files
Preferences.java  - Stores user preferences as a serialized object in a persistent .dat file
RunBot.java       - The driver function for this project, contains main
ThreadRunner.java - Handles thread requests
UrlRead.java      - Uses API requests and parses url .json responses for specific data
Vote.java         - Keeps track of a poll and each user that votes
