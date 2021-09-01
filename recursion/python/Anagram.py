def permute(str,remaining,final_set):
    if(remaining == ""):
        final_set.add(str)
    else:
        for c in remaining:
            new_str = str + c
            index = remaining.index(c)
            new_remaining = remaining[0:index:] + remaining[index+1::]
            permute(new_str, new_remaining,final_set)

if(__name__ == "__main__"):
    final_set = set()
    permute("","master",final_set)
    for str in final_set:
        print(str)