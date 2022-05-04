#

import cv2 as cv
import numpy as np

img = cv.imread("rabisco.jpg")
mask = cv.imread("mascara.jpg",0)

sem_risco = cv.inpaint(img, mask, 3, cv.INPAINT_TELEA)

res = np.concatenate((img, sem_risco), axis=1)

cv.imshow("Tirando o Rabisco", res)

cv.waitKey(0)
cv.destroyAllWindows()
