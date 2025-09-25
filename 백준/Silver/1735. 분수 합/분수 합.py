import sys

# repeat = int(sys.stdin.readline())
# for _ in range(repeat):
n1,m1 =map(int, sys.stdin.readline().split())
n2,m2 =map(int, sys.stdin.readline().split())
m_r = m1*m2
n_r = n1 * m2 +n2*m1

if m1<m2:
    m1,m2=m2,m1
while m2>0:
    m1,m2 = m2,m1%m2
n_3 = n_r// m1
m_3 = m_r//m1
m3 = n_3
m4 = m_3
if m3<m4:
    m3,m4=m4,m3
while m4>0:
    m3,m4 = m4,m3%m4

print(str(n_3// m3) +" "+str(m_3//m3))