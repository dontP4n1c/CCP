import cv2
import numpy as np

img = cv2.imread('j.png',0)
kernel = np.ones((5,5),np.uint8)

dilation = cv2.dilate(img,kernel,iterations = 1)

res1 = np.hstack((img, dilation))

cv2.imshow('Imagem Comum J,  Com Erosão, Com Dilatação', res1)
cv2.imwrite("resultadoDilatacao.png", res1)
cv2.waitKey(0) 
cv2.destroyAllWindows()
