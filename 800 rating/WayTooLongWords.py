a=input()
s=len(a)
if s>10:
    c=s-2
    print(a[0]+str(c)+a[-1])
else:
    print(a)