n= int (input("how many terms"))
sequence = []
a,b = 0,1

for _ in range (n):
    sequence.append(a)
    a,b = b,a+b
   

   
    print("fibonacci:", sequence)