# EclipseDebugging
Keynotes for a quick recap.

## Debug Shell
Use this area to Write, Run and inspect Java expressions in the context of a debug session.
Write a piece of code in debug shell (Window->Show View->Debug Shell   
Select the written code-> Execute Selected Text will be enabled to execute it.  
Also, a display of the result will be enabled to check the result.  The result will be displayed in the console window(Auto switches from debug shell to Console) 
## Detail Formatter
This is used to view the objects while inspecting with explicit values and not object references.  
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
The code will pause right at the line about to through the exception.  
Note: Right Click -> Breakpoint properties ->Select "SubClasses of this exception"

## Method Breakpoint
Right-click on the breakpoint placed at the method signature -> Breakpoint properties->Select Entry or Exit check boxes based on where you want your code to pause.

## Drop To Frame
This allows you to drop to a previous frame in the call stack seen in debug pane. It is like reverting to an earlier stack by stopping the program and re-running it.

## Step Filtering
This is used to avoid stepping into the standard libraries.  
Windows->Preferences->Debug->StepFiltering->Checkbox (Use Step Filters)
## References
https://eclipsetutorial.sourceforge.net/debugger.html
https://www.youtube.com/playlist?list=PLUGinutrSzN-ALgaL0mSyPDHi3VhUCcuV
