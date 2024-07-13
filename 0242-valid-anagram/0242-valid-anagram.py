#optimized approach
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # Convert both strings to lowercase to ignore case match
        s = s.lower()
        t = t.lower()

        # Strip off all the white spaces
        s = s.replace(" ", "")
        t = t.replace(" ", "")

        # Initialize the bucket array
        counts = [0] * 26

        # Fill in the buckets
        for char in s:
            counts[ord(char) - ord('a')] += 1 #ord(char) is used to get the ASCII value of the character char. 

        # Empty the buckets
        for char in t:
            counts[ord(char) - ord('a')] -= 1

        # Check if all buckets are empty
        for count in counts:
            if count != 0:
                return False

        return True
