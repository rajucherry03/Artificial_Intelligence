graph={'1':['2','3'],
       '2':['1','4','5'],
       '3':['6'],
       '4':['2'],
       '5':['2'],
       '6':['3']}
visited=[]
queue=[]
def bfs(visited,graph,node):
    visited.append(node)
    queue.append(node)
    while queue:
        m=queue.pop(0)
        print(m,end=" ")

        for i in graph[m]:
            if i not in visited:
                visited.append(i)
                queue.append(i)

bfs(visited,graph,'1')
        
