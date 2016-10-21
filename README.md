# Billing Engine Test

##Background

MediHealth is a private medical centre. They provide following services:

 - Diagnosis
 - X-Ray
 - Blood Test
 - ECG
 - Vaccine
 
Each of the services has an associated default cost:

| Service    | Service price | for each price |
| ---------- | ------------- | -------------- |
| Diagnosis  | £60  		 | £0             |
| X-Ray      | £150  		 | £0 			  |
| Blood Test | £78  		 | £0 			  |
| ECG  		 | £200.40  	 | £0 			  |
| Vaccine  	 | £27.50   	 | £15			  |

 
Discounts are applied for services based on the following criteria:

 - Senior citizens (between 65 and 70) receive a 60% discount
 - Senior citizens (over 70) receive a 90% discount
 - Children under 5 receive 40% discount
 - Patients with "MediHealth Health insurance" get additional 15% discount on Blood test when they are diagnosed by a MediHealth practitioner


##Exercise
 
The medical centre requires you to implement the basis of a new billing engine using the rules detailed above. MediHealth is expecting the solution to be written in a TDD style using Java or Scala.