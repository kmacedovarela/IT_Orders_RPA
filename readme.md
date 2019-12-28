IT Orders
=======

This is a sample application that replaces a human task with BluePrism RPA digital workforce. It shows two ways of using BluePrism Task:
1. maintaining a user task, and completing the work by using an RPA Robot. The bot that can interact with a web browser to execute the task;
2. fully replacing a human task with a digital worker invocation.

A package named `1.0.0.bprelease` is available in the `extra` folder of this repository. It can be imported to BluePrism 6, and contains two BluePrism Processes and the used Objects. 
- The HardwareSpec process completes a human task by opening the browser, accessing the system page, logging in, selecting the respective task, inserting a comment and uploading a file, and finally, submiting the form and closing the browser. 
- The Ship Order process replaces a human task and based on the input data, it generates the output and sends the response back to RHPAM. 

Notes: 
- This application is deployed on Kie Server running on by https://github.com/jbossdemocentral/rhpam7-order-it-hw-demo-springboot-app.
- This application consumes an external rest service: https://github.com/jbossdemocentral/rhpam7-order-it-hw-demo-vertx-app 	
- It considers that the BluePrism Task is up and running;
  - BluePrism Task and Guide can be found at: https://github.com/kmacedovarela/blueprism-wih
- It considers that BluePrism 6 is installed and the services are deployed and exposed using literal encoding.

