// CrapsAnalysisTest class for executing the craps game simulation.
package ntou.cs.java2024;
import ntou.cs.java2024.CrapsAnalysis;
//java ntou.cs.java2024.CrapsAnalysisTest
public class CrapsAnalysisTest {
    public static void main(String[] args) {
        CrapsAnalysis analysis = new CrapsAnalysis();
        analysis.runSimulation(1000); // Run 1000 games of craps
        analysis.printStatistics(); // Display the simulation results
    }
}
