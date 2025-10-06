// Main.java
// Client Code - Uses the unified interface
public class Main {
    public static void main(String[] args) {
        System.out.println("🎓 === Unified School Management Application ===\n");
        
        // Step 1: Create the existing legacy systems
        System.out.println("1. Initializing existing school systems...");
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();
        
        // Step 2: Create adapters for each system
        System.out.println("2. Creating adapters for system integration...\n");
        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);
        
        // Step 3: Use the unified interface to integrate all systems
        System.out.println("3. Starting system integration process:\n");
        
        System.out.println("─────────────────────────────────────────");
        System.out.println("ATTENDANCE SYSTEM INTEGRATION:");
        System.out.println("─────────────────────────────────────────");
        attendanceAdapter.integrateSystem();
        
        System.out.println("─────────────────────────────────────────");
        System.out.println("GRADING SYSTEM INTEGRATION:");
        System.out.println("─────────────────────────────────────────");
        gradingAdapter.integrateSystem();
        
        System.out.println("─────────────────────────────────────────");
        System.out.println("LIBRARY SYSTEM INTEGRATION:");
        System.out.println("─────────────────────────────────────────");
        libraryAdapter.integrateSystem();
        
        // Step 4: Demonstrate batch processing
        System.out.println("4. Batch processing all systems:\n");
        SchoolManagementApp[] allSystems = {
            attendanceAdapter,
            gradingAdapter,
            libraryAdapter
        };
        
        for (int i = 0; i < allSystems.length; i++) {
            System.out.println("🔧 Processing system " + (i + 1) + " of " + allSystems.length + ":");
            allSystems[i].integrateSystem();
        }
        
        System.out.println("🎉 === All school systems integrated successfully! ===");
        System.out.println("The unified application can now manage:");
        System.out.println("   ✓ Student Attendance");
        System.out.println("   ✓ Grade Management");
        System.out.println("   ✓ Library Resources");
    }
}