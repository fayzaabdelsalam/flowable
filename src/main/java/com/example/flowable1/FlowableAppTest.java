//package com.example.flowable1;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.flowable.engine.RuntimeService;
//import org.flowable.engine.TaskService;
//import org.flowable.engine.runtime.ProcessInstance;
//import org.flowable.task.api.Task;
//import org.junit.Assert;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.example.flowable1.services.EmailService;
//
//import lombok.extern.log4j.Log4j2;
//
//@Component
//@Log4j2
//public class FlowableAppTest {
//		
//		@Autowired
//		private RuntimeService runtimeService;
//		@Autowired
//		private TaskService taskService;
//		@Autowired
//		private EmailService emailService;
//		
//		public void contextLoad() throws Exception
//		{
//			String customerId = "1";
//			String processInstanceId = this.beginCustomerEnrollmentProcess(customerId, "email@email.com");
//			log.info("process instance ID: " + processInstanceId);
//			Assert.assertNotNull(processInstanceId,"the process instance ID should not be null");
//			
//			List<Task> tasks = this.taskService
//					.createTaskQuery()
//					.taskName("confirm-email-task")
//					.includeProcessVariables()
//					.processVariableValueEquals("customerId",customerId)
//					.list();
//			Assert.assertTrue("there should be one outstanding",!tasks.isEmpty());
//			
//			// complete outstanding tasks
//			
//			tasks.forEach
//				(	task ->
//			{
//			this.taskService.claim(task.getId(), "jlong");
//			this.taskService.complete(task.getId());
//			}
//				);
//			
//			// confirm that the email has been sent
//			Assert.assertEquals(this.emailService.sends.get("email").get(), 1);
//		}
//		
//		String beginCustomerEnrollmentProcess (String customerId, String email)
//		{
//				Map<String,Object> vars = new HashMap<>();
//				vars.put("customerId", customerId);
//				vars.put("email", email);
//				ProcessInstance processInstance = this.runtimeService.startProcessInstanceByKey("signupu-process",vars);
//				return processInstance.getId();
//				
//				
//		}
//		
//}
