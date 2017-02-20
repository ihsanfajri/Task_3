package task3exercise2;


public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301154343 
    // NAMA : Guntur Fatmawan Widodo 
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    //------------------- your code here-----------------------
    private String projectName;
    private Member teamMember[];
    private int nTeam = 0;
    private boolean releaseStatus = false;
    
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : 1301154343 
    // NAMA : Guntur Fatmawan Widodo 
    //
    //------------------- your code here-----------------------
    public void project (String projectName) {
        teamMember = new Member [5];
        this.releaseStatus = false;
    }
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154343 
    // NAMA : Guntur Fatmawan Widodo 
    //
    //------------------- your code here-----------------------
    public boolean isRelease() {
        return releaseStatus;
    }
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154343 
    // NAMA : Guntur Fatmawan Widodo 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
    public void addMember (Member m) {
        this.teamMember[nTeam] = m;
        nTeam ++;
    }
    //---------------------------------------------------------
    
    
    // 5. Declare method releaseApp() here:
    // NIM : 1301154343 
    // NAMA : Guntur Fatmawan Widodo 
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
    public void releaseApp() {
        releaseStatus = true;
    }
    //---------------------------------------------------------
    
    
    // 6. Create method toString() : String here:
    // NIM : 1301154343 
    // NAMA : Guntur Fatmawan Widodo 
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
    //------------------- your code here-----------------------
    if(releaseStatus = true) {
        System.out.println("Progress");
    }
    else
        System.out.println ("Not Onn Progress");
    String project = (projectName+ "Status is in"+ releaseStatus+" with team member of"+nTeam);
    return project;
    
    //---------------------------------------------------------
    }
}