// AttendanceSystemAdapter.java
// Adapter Class - Bridges the AttendanceSystem to SchoolManagementApp
public class AttendanceSystemAdapter implements SchoolManagementApp {
    private AttendanceSystem attendanceSystem;
    
    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }
    
    @Override
    public void integrateSystem() {
        System.out.println("🔄 Adapter: Converting integrateSystem() → markAttendance()");
        attendanceSystem.markAttendance();
        System.out.println("   ✅ Attendance system integrated successfully!\n");
    }
}