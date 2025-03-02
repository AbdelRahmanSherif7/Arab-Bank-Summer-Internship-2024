import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier, plot_tree
from sklearn.metrics import accuracy_score, classification_report
import matplotlib.pyplot as plt
# Define the data
data = {
"money_added_to_balance": [True, True, True, True, False, False, False, False],
"loan_payment_due": [True, True, False, False, False, True, False, False],
"balance_below_threshold": [False, True, True, False, False, False, True, False],
"credit_card_used": [False, False, True, True, False, False, True, False],
"has_credit_card": [True, True, True, True, True, False, False, True],
"recommendation": [
"Loan Reminder", "Offer Salary Plus", "Offer Salary Plus",
"Offer EPP for CC", "Suggest CCII", "System Check",
"System Checking Steps", "Suggest CCII if No CC"
]}
df = pd.DataFrame(data)
# Separate the features and the target variable
X = df.drop("recommendation", axis=1)
y = df["recommendation"]
# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)
# Initialize the DecisionTreeClassifier
clf = DecisionTreeClassifier(random_state=42)
clf.fit(X_train, y_train)
# Make predictions on the test set
predictions = clf.predict(X_test)
# Evaluate the accuracy of the model
accuracy = accuracy_score(y_test, predictions)
print("Accuracy:", accuracy)
# Generate classification report
# Use labels that match the classes in predictions and y_test
report_str = classification_report(y_test, predictions, labels=clf.classes_, zero_division=1)
print(report_str)
# Plot the decision tree
plt.figure(figsize=(20, 12))
plot_tree(clf, feature_names=X.columns, class_names=clf.classes_, filled=True, rounded=True) 
plt.show()


from sklearn.tree import DecisionTreeClassifier
import numpy as np

# Sample dataset
# 0 = No, 1 = Yes
data = {
"has_child": [0, 1, 1, 1, 1, 1, 1, 1],
"child_age": [0, 10, 12, 14, 15, 16, 17, 18],
"program": ["Proceed", "Junior Program", "Junior Program", "Junior Program",
"Junior Program", "Shabab Program", "Shabab Program", "Shabab Program"]
}

# Convert to numpy arrays for sklearn
X = np.array([data["has_child"], data["child_age"]]).T
y = np.array(data["program"])

# Create and train the decision tree
clf = DecisionTreeClassifier()
clf.fit(X, y)

# Predict for a new sample
sample = np.array([[1, 13]]) # Example: has a child aged 13
prediction = clf.predict(sample)
print("Predicted Program:", prediction[0])

# Output the structure of the tree
from sklearn import tree
import matplotlib.pyplot as plt

plt.figure(figsize=(12, 8))
tree.plot_tree(clf, feature_names=["Has Child", "Child Age"], class_names=["Proceed", "Junior Program", "Shabab Program"],
filled=True)
plt.show()