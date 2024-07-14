class Solution:
    def isPalindrome(self, s: str) -> bool:
        
# Convert string to lowercase
        s = s.lower()
        
        # Initialize pointers
        left = 0
        right = len(s) - 1
        
        while left < right:
            left_char = s[left]
            right_char = s[right]
            
            # Skip non-alphanumeric characters
            if not left_char.isalnum():
                left += 1
            elif not right_char.isalnum():
                right -= 1
            else:
                # Compare characters
                if left_char != right_char:
                    return False
                left += 1
                right -= 1
        
        return True
