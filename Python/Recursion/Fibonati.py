class Fibonati(object):
    def FibonatiClass(self, n):
        if n == 0:
            return 0
        if n == 1:
            return 1
        return self.FibonatiClass(n - 1) + self.FibonatiClass(n - 2)
    
Fibonati = Fibonati()

print(Fibonati.FibonatiClass(6))