import cv2
import numpy as np

img = cv2.imread('closing.png',0)
kernel = np.ones((5,5),np.uint8)

closing = cv2.morphologyEx(img, cv2.MORPH_CLOSE, kernel)

res1 = np.hstack((img, closing))

cv2.imshow('Imagem Comum J,  Com Erosão, Com Dilatação', res1)
cv2.waitKey(0) 
cv2.destroyAllWindows()
