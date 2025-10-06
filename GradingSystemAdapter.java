// GradingSystemAdapter.java
// Adapter Class - Bridges the GradingSystem to SchoolManagementApp
public class GradingSystemAdapter implements SchoolManagementApp {
    private GradingSystem gradingSystem;
    
    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }
    
    @Override
    public void integrateSystem() {
        System.out.println("🔄 Adapter: Converting integrateSystem() → recordGrades()");
        gradingSystem.recordGrades();
        System.out.println("   ✅ Grading system integrated successfully!\n");
    }
}