class Factorial(object):
    def FactorialClass(self, n):
        if n == 0:
            return 1
        else:
            return n * self.FactorialClass(n - 1)
        
Factorial = Factorial()
print(Factorial.FactorialClass(5))