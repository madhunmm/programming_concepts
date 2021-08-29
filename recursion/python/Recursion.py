def factorial(n):
    if(n == 0):
        return 1
    else:
        return n * factorial(n-1)

def factorial_with_label(label,n):
    if(n == 0):
        return [label + "=",1]
    else:
        if(label == ""):
            new_label = str(n)
        else:
            new_label = label + "x" + str(n)
        data = factorial_with_label(new_label,n-1)
        ret_val = [data[0],n*data[1]]
        return ret_val

if __name__ == "__main__":
    #print(factorial(10))
    val = factorial_with_label("",10)
    print(val[0] + str(val[1]))