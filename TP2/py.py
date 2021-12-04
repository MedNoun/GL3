import numpy as np
import scipy
def convolution2d(image, kernel, bias=0):
    m, n = kernel.shape
    if (m == n):
        y, x = image.shape
        y = y - m + 1
        x = x - m + 1
        new_image = np.zeros((y,x))
        for i in range(y):
            for j in range(x):
                new_image[i][j] = np.sum(image[i:i+m, j:j+m]*kernel) + bias
    return new_image

# a simple parser for python. use get_number() and get_word() to read
def parser():
    while 1:
        data = list(input().split(' '))
        for number in data:
            if len(number) > 0:
                yield(number)   

input_parser = parser()

def get_word():
    global input_parser
    return next(input_parser)

def get_number():
    data = get_word()
    try:
        return int(data)
    except ValueError:
        return float(data)
def split(word):
    return [char for char in word]
def convert(lista):
    li = []
    for el in lista:
        if el == "#":
            li.append(1)
        else :
            li.append(0)
    return li
def pad_with(vector, pad_width, iaxis, kwargs):
        pad_value = kwargs.get('padder', 10)
        vector[:pad_width[0]] = pad_value
        vector[-pad_width[1]:] = pad_value
 
 
def symm(a):
    for el in a:
        j=0
        for i in range(int(np.floor(len(el)/2))):
           c = el[j]
           el[j] = el[len(el)-1-j]
           el[len(el)-1-j] = c
           j+=1
    return a
def rotate(m) :
    return np.rot90(m)
def shiftup(a):
    return np.roll(a, -1, axis=0)
def shiftright(a):
    return np.roll(a, 2, axis=1)

def options(a):
    li = []
    print("this is a.shape : ")
    print(a.shape)
    for i in range(4):
        a=rotate(a)
        
        for j in range(2):
            a=symm(a)
            
            for k in range(max(a.shape[0],a.shape[1])):
                a=shiftup(a)
                
                for m in range(max(a.shape[0],a.shape[1])):
                    a=shiftright(a)
                    li.append(a)
    return np.array(li)
    
def solve(m1 , m2):
    matrix = m2
    mat = m1
    if m1.shape[0]<m2.shape[0] :
        matrix = m1
        mat = m2
    op = options(matrix)
    max = 0
    for o in op:
        a= convolution2d(np.pad(mat, 30, pad_with, padder=0),o)
        m = np.max(a)
        if m>max:
            max = m
    print(max)
    

# numpy and scipy are available for use


t = get_number()
for i in range(t):
    mat1 = []
    mat2 = []
    
    r = get_number()
    c = get_number()
        
    for k in range(r):
        line = get_word()
        s = split(line)
        lista = convert(s)
        mat1.append(lista)
    
    r = get_number()
    c = get_number()
    
    for k in range(r):
        line = get_word()
        s = split(line)
        lista = convert(s)
        mat2.append(lista)
    solve(np.array(mat1),np.array(mat2))
    
    
    
            
            
    
