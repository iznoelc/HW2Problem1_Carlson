# HW2Problem1_Carlson

## Hurricane Prediction System
A Java application that demonstrates the implementation of template pattern and command pattern. Allows for the simulation of different hurricane prediction models (Machine learning -> uses historical and real-time data; Statistical -> uses historical data) or through individual prediction steps (i.e. fetching data or post-processing results). 

### Design Patterns Implemented
#### 1. Template Pattern
Template pattern was used in order to create a base class for the hurricane prediction models. It defines a series of calls to various prediction steps and then a predictHurricane method that calls all steps in order. All methods except predictHurricane are abstract in order to force subclasses (specific prediction models) to implement their own implementation.

#### 2. Command Pattern
Command pattern was used in order to break down the prediction into steps. This allows for as many or as little steps to be called as the user wants. For example, the command portion of this application could be used if the user only wanted to fetch data, but not apply a prediction model or save the results. 

### Resources Used
- Template pattern & Command pattern slides
- Talked with Esperanza Paulino about our UMLs and how we were approaching the classes and their structure. Coded up individually.
- Dr. Roy's Office Hours

### Output
See [output screenshot](https://github.com/iznoelc/HW2Problem1_Carlson/blob/9759082105531a1c37292aa6de6ed95b028bcbe5/OutputScreenshot.PNG)
