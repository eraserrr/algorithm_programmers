```
def solution(bridge_length, weight, truck_weights):
    answer = 0
    idx = 0
    weight_sum = 0
    
    for i in range(len(truck_weights)-1):
        weight_sum += truck_weights[i]
        
        if (weight_sum+truck_weights[i+1])>weight:
            # if bridge_length >= i-idx+1:
            #     answer = answer + (i-idx+1)*2-1
            # else:
            #     answer = answer + bridge_length-(i-idx+1)+1
            answer = answer + bridge_length-(i-idx+1)+1 + (i-idx)*2
            idx = i+1
            weight_sum = 0
        print(answer)
        
    answer = answer + bridge_length-(len(truck_weights)-idx+1)+1 + (len(truck_weights)-idx)*2
    
    
    if len(truck_weights)==1:
        answer = bridge_length + 1
    
            
        
    return answer
```
실패
