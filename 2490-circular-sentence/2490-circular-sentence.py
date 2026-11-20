class Solution(object):
    def isCircularSentence(self, sentence):
        words= sentence.split(" ")
        for i in range(len(words)):
            current_word = words[i]
            next_word = words[(i + 1) % len(words)]
            if current_word[-1] != next_word[0]:
                return False
        return True