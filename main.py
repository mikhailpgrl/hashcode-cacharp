from sys import argv
class tmp(Object):
    video=[]
    endpoint={}
    request={}
    
    def get_data_from_file(self,filename):
        
        f=open(filename,'r')
        ligne = f.readline()
        data = ligne.split(" ")
        print(data)
        
        
        
                
if len(argv) == 2:
    le = tmp()
    tmp.get_data_from_file(argv[1])
else:
    print "yo"    
