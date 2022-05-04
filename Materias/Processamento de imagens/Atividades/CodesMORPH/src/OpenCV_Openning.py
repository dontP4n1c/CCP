import cv2
import numpy as np

img = cv2.imread('opening.png',0)
kernel = np.ones((5,5),np.uint8)

opening = cv2.morphologyEx(img, cv2.MORPH_OPEN, kernel)

res1 = np.hstack((img, opening))

cv2.imshow('Imagem Comum J,  Com Erosão, Com Dilatação', res1)
cv2.waitKey(0) 
cv2.destroyAllWindows()
