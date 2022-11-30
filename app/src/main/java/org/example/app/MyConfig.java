package org.example.app;

import org.example.service.EmployeeService;
import org.example.service.WorkerService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({EmployeeService.class, WorkerService.class})
@PropertySource("example.properties")
public class MyConfig {
}
