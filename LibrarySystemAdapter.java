// LibrarySystemAdapter.java
// Adapter Class - Bridges the LibrarySystem to SchoolManagementApp
public class LibrarySystemAdapter implements SchoolManagementApp {
    private LibrarySystem librarySystem;
    
    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }
    
    @Override
    public void integrateSystem() {
        System.out.println("🔄 Adapter: Converting integrateSystem() → manageBooks()");
        librarySystem.manageBooks();
        System.out.println("   ✅ Library system integrated successfully!\n");
    }
}