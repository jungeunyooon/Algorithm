def solution(arr, delete_list):
    answer = []
    rm_arr = []
    for i in arr:        
        for j in delete_list:
            if i==j:
                rm_arr.append(i)    
                arr = [x for x in arr if x not in rm_arr]                    
    answer = arr
    return answer