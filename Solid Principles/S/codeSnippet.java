package S;
//Violation of SRP

class Report {
    public void generateReport() {
        //generates Report
    }

    public void saveReport() {
        //saves report
    }
}



// Adhering to SRP
class ReportGeneration {
    public void generateReport() {
        // Generate report logic
    }
}

class ReportSaver {
    public void saveToFile(Report report) {
        // Save report to file logic
    }
}

//The Report class is now only responsible for generating reports, and the ReportSaver class handles saving the report to a file.