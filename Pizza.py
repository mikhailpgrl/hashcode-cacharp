# -*- coding: utf-8 -*-
from nt import lstat
import numpy as np


new_line =[]
data = []

def import_file():
    data = [line.rstrip(' ').rstrip('\n') for line in open('small.in')]
    first_line = [line.rstrip(' ') for line in data[0]]
    for x in first_line:
        if x.isdigit():
            new_line.append(x)
 
def infosFromFirstLine():
	R=new_line[0]
	C=new_line[1]
	L=new_line[2]
	H=new_line[3]  

def listToMatrix():
	data = np.array(data)
	data.reshape(R,C)


def hasTandH(lst):
    if 'T' in lst and 'M' in lst:
        return True
        

import_file()  
infosFromFirstLine()

print new_line[0]
