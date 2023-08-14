# EclipseDebugging
Key notes for a quick recap.
## Detail Formatter
This is used to view the objects while inspecting with clear values and not object references.  
In the example for DebugPersonDetailsIteration.java  
Right-click on the person in expressions->New Detail Formatter  
```java
String description = "Name:"+this.name+";Age:"+ this.age + " ;Country:" + this.country;
return description;
```

## Conditional BreakPoint
In the debug mode, when the breakpoint is hit for the first time  
Right-click on the breakpoint->Breakpoint Properties--> Checkbox (Conditional BreakPoint) and add below condition
```java
if(p.getName()!=null && p.getName().equalsIgnoreCase("Marco")) {
	return true;
}else {
	return false;
}
```
## Hit Count
In the debug mode, when the breakpoint is hit for the first time, Right-click on the breakpoint->Breakpoint Properties--> checkbox (HitCount)-->Enter a number.  
The breakpoint will be hit when the iteration count matches the given number

## Exception Breakpoint
In the debug mode, breakpoints tab click on   
Add Java Exception breakpoint -> Choose an Exception (Arithmetic Exception) -> Click OK  
The code will pause right at the line that is about to through the exception.  
Note: Right Click -> Breakpoint properties ->Select "SubClasses of this exception"
