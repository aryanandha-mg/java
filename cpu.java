class CPU { 
double price; 
public CPU(double price) { 
this.price = price; 
} 
class Processor { 
int cores; 
String manufacturer; 
Processor(int cores, String manufacturer) { 
this.cores=cores;
this.manufacturer=manufacturer;
} 
void displayProcessorInfo() { 
System.out.println("Processor Cores: " + cores); 
System.out.println("Processor Manufacturer: " +manufacturer); 
}
}
static class RAM { 
int size; 
String type;
RAM(int size, String type) { 
this.size = size; 
this.type = type; 
} 
void displayRAMInfo() { 
System.out.println("RAM Size: " + size + "GB"); 
System.out.println("RAM Type: " + type); 
} 
} 
void displayCPUInfo() { 
System.out.println("CPU Price: $" + price); 
} 
public static void main(String[] args) { 
CPU myCPU = new CPU(250.00); 
CPU.Processor myProcessor = myCPU.new Processor(8, "Intel"); 
CPU.RAM myRAM = new CPU.RAM(16, "DDR4"); 
myCPU.displayCPUInfo();  
myProcessor.displayProcessorInfo(); 
myRAM.displayRAMInfo(); 
}
}
