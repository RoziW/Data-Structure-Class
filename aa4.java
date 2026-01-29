
int memo = {}

def fib_fast(n):
   
    if n == 0: return 0
    if n == 1: return 1
    

    if n in memo:
        return memo[n]  
    
   
    result = fib_fast(n - 1) + fib_fast(n - 2)
    

    memo[n] = result
    
    return result

print(fib_fast(50)) 