import numpy as np
import matplotlib.pyplot as plt
import pandas as pd

data=pd.read_csv("sign_mnist_test.csv")
data.head()
data.describe()

#Create Fig. 1  (using plt.scatter)
plt.scatter(data[0], data[1])
plt.xlabel("Population of city in 10,000s ")
plt.ylabel("Profit in $10,000")
plt.title("Profit Predication")