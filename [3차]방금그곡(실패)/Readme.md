파이썬으로 sort 할때에 다중 조건을 걸기 위해서는 
```
musicinfos.sort(key=lambda x: (-x[0], x[1]))
```
이렇게 튜플로 묶어주면 되고, '-' 부호로 내림차순으로 변경이 가능하다. 그리고오오ㅗ오오오ㅗ오오ㅗ오오오오ㅗㅇ오오오ㅗㅇ 뭐더라<br>
아 sort() 정렬할때에 문제에 나온것처럼 입력순서를 고려하여 처음에 두번째조건으로 입력순서를 두고 정렬을 했었는데, <br>
혹시나 해서 안하고 채점해도 그대로이다. 입력순서가 원래 안바뀌는지 그건 잘 모르겠,,는데 잘모르겠어서 일단은 입력순서를 따로 처리하는게 맞는것 같다.<br>

```
def date_to_time(s,e):
    s = int(s.split(':')[0])*60 + int(s.split(':')[1])
    e = int(e.split(':')[0])*60 + int(e.split(':')[1])
    return e-s

def solution(m, musicinfos):
    m_len = len(m)
    # 대체 = H I J K L
    sharp = {'C#':'H', 'D#':'I', 'F#':'J', 'G#':'K', 'A#':'L'}

    # m 전처리
    for s in sharp.keys():
        m = m.replace(s, sharp[s])

    for i in range(len(musicinfos)):
        splited = musicinfos[i].split(',')

        # 악보 전처리
        sheet = splited[3]
        for s in sharp.keys():
            sheet = sheet.replace(s, sharp[s])

        # [걸린시간(int), 곡명, 악보정보]
        musicinfos[i] = [date_to_time(splited[0],splited[1]), splited[2],sheet]

    # 걸린시간은 내림차순, 그 다음 조건인 입력 순서는 오름차순
    # 입력 순서는 처리 안해줘도 되는걸보니 유지되는듯!?
    musicinfos.sort(key=lambda x: -x[0])
    
    for i in range(len(musicinfos)):
        repeated = ''
    
        # if musicinfos[i][0]<len(musicinfos[i][2]):
        #     repeated = musicinfos[i][2][:musicinfos[i][0]]
        # else:
        #     repeated = musicinfos[i][2] * (int(m_len/len(musicinfos[i][2])) + 1)
        
        repeated = (musicinfos[i][2]*musicinfos[i][0])[:musicinfos[i][0]]
        if m in repeated:
            return musicinfos[i][1]

    return '(None)'
```

```
        # if musicinfos[i][0]<len(musicinfos[i][2]):
        #     repeated = musicinfos[i][2][:musicinfos[i][0]]
        # else:
        #     repeated = musicinfos[i][2] * (int(m_len/len(musicinfos[i][2])) + 1)
```

이부분을

```
repeated = (musicinfos[i][2]*musicinfos[i][0])[:musicinfos[i][0]]
```
이렇게 바꾸자 안풀리던 테스트케이스 25번이 풀리면서 통과가 되었따.;;; <br>
효율적으로 하고자 저렇게 짰던건데 코드를 계속 훑어보면서도 저기서 오류가 났으리라고느 ㄴ생각못했다 <br>
그래서 혹시나해서 +1 하던걸 +2 했는데 통과가 됐다. 다음번엔 고려해야겠다<br>
