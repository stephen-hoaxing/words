# Longest and shortest word - task

The task write two methods which deals with word lengths.

The two methods are
- getLongestWord(String) - gets the longest word and its length from a string / sentence
- getShortestWord(String) - gets the shortest word and its length from the string / sentence
- Class Word is a wrapper which contains the word and the word's length

Assumptions on the input sentence:
- it accepts a string
- it can be empty or null, in this case the result will be "" and length 0 for both cases (longest, shortest)
- it can be lowercase or uppercase
- . ? and ! are treated as sentence-terminating characters, they does not belong to any words in the sentence\
  e.g. really? -> the selected word will be "really", not "really?"
- punctuations are not part of a given word, e.g. word; -> the selected word is "word" not "word;"
- words can contain any number of dashes or underscores. This makes sense in real-world scenarios
- words can contain numbers as well
