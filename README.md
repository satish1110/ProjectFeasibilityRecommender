# ProjectFeasibilityRecommender
Project management, especially in the software industry, requires consideration and analysis of various factors like risk, resources, effort required, etc. To implement these projects, they are generally classified into either the feasible or non-feasible category. But this may lead to the dropping of projects without knowing how much closer they are to the optimal value of being feasible. So, this application uses fuzzy classification as a solution. The user can enter values (within a range) for the components of various factors (like risk, economic, etc.) that affect all the tasks involved. These values are fuzzified, passed through a rule-based fuzzy inference system and then defuzzified to produce a value (within a range) indicating the feasibility level of the project. Comparing this with a threshold value set, the user can determine whether to undertake the project or not. 
