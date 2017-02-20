package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301154343
    // NAMA : Guntur Fatmawan Widodo
    // 
    //------------------- your code here-----------------------
    private Application[] appList = new Application [10];
    private int totalApp, memory, n;
    //---------------------------------------------------------

    
    // 
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154343 
    // NAMA : Guntur Fatmawan Widodo 
    // 
    //------------------- your code here-----------------------
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public int getTotalApp() {
        return totalApp;
    }

    public void setTotalApp(int totalApp) {
        this.totalApp = totalApp;
    }
    
    public Application[] getAppList() {
        return appList;
    }
    
    public void setAppList (Application[] AppList) {
        this.appList = appList;
    }
    //---------------------------------------------------------
    
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : 1301154343
    // NAMA : Guntur Fatmawan Widodo 
    //
    // get an Application object from array appList of an appStore
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    //------------------- your code here-----------------------
    public void addApplication (Appstore appStore, int appId) {
        if (n < 10) {
            this.applist[n] = appStore.getApp(appId)
            n++;
        }
    }
    //---------------------------------------------------------
    
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : 1301154343
    // NAMA : Guntur Fatmawan Widodo 
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
    //---------------------------------------------------------
    public int getRemainingSize () {
        return memory-appList.length;
    }
    
    // 
    // 5. Create method toString() : String here:
    // NIM : ..........................,
    // NAMA : .........................,
    //
    // returns String that contains the smart phone total memory size,
    // number of application installed, and remaining memory size
    //
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
        //------------------- your code here-----------------------
        return "Memory Size" +memory+ "," +getTotalApp() + "Application Installed, Remaining memory Size: " + getRemainingSize();
        
        //---------------------------------------------------------
    }
}
