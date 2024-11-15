n = int(input())

list1 = list(map(int,input().split()))

list1.sort()

print(" ".join(map(str,list1)))
list1.sort(reverse=True)
print(" ".join(map(str,list1)))