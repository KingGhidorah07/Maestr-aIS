
input("MATEMATICAS DISCRETAS \n 1.-Resta insico A \n 2.-Resta insico B \n 3.-Resta insico C \n 4.-Metodo de 9s \n 0.-Salir")
opc=int(input("Ingrese una opción:"))

while opc!=0:

  n= input("Ingrese un número: ")
  m= input("Ingrese otro número: ")
  
  N=[]
  M=[]
  R=[]

  for i in n:
      N.append(i)
  for i in m:
      M.append(i)

  if opc==1: #----------------------------------------------------------------
    
    if len(M)<len(N):
      dc=len(N)-len(M)
      #print(dc)
      p=0
      while p<dc:
        M.insert(0,0)
        p=p+1

    print(N)
    print(M)    


    print("METODO A")
    i=len(N)-1
    while i>=0:

      if int(N[i])<int(M[i]):
        N[i]=int(N[i])+10
        N[i-1]=int(N[i-1])-1
      
      aux=int(N[i])-int(M[i]) 
      R.append(aux)
      i=i-1
    print(R[::-1])
  
  if opc==2: #----------------------------------------------
    if len(M)<len(N):
      dc=len(N)-len(M)
      #print(dc)
      p=0
      while p<dc:
        M.insert(0,0)
        p=p+1
    
    print("METODO B")
    i=len(N)-1
    while i>=0:

      if int(N[i])<int(M[i]):
        N[i]=int(N[i])+10
        M[i-1]=int(M[i-1])+1
      
      aux=int(N[i])-int(M[i]) 
      R.append(aux)
      i=i-1
    print(R[::-1])

  if opc==3: #------------------------------------------------
    auxi=0
    a=" "
    j=0
    while j<len(N):
      a=a+"9"
      j=j+1
    
    res=(int(n)+((int(a)-int(m))+1))-(int(a)+1)
    print(res)

  if opc==4: #------------------------------------------------
   l=len(N)
   while l>1:
    suma=0
    for i in N:
      suma=suma+int(i)  
    print(suma)    
    l=len(str(suma))
    N=str(suma)

   if suma%9==0:
      print("Es multiplo de 9")
   else:
      print("No es multiplo de 9")
   if suma%3==0:
      print("Es multiplo de 3")
   else:
      print("No es multiplo de 3")
  
  print("\n \n")
  input("MATEMATICAS DISCRETAS \n 1.-Resta insico A \n 2.-Resta insico B \n 3.-Resta insico C \n 4.-Metodo de 9s \n 0.-Salir")
  opc=int(input("Ingrese una opción:"))

