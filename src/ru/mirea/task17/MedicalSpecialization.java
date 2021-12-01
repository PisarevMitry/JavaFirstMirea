package ru.mirea.task17;

public enum MedicalSpecialization {
    ObstetricsAndGynecology("NONE"),
    AllergicAndImmunology("NONE"),
    AnesthesiologyIntensiveCare("NONE"),
    Gastroenterology("NONE"),
    Hematology("NONE"),
    Genetics("NONE"),
    Dermatovenerology("NONE"),
    PediatricSurgery("NONE"),
    InfectiousDiseases("NONE"),
    Cardiology("NONE"),
    ClinicalLaboratoryDiagnostics("NONE"),
    ClinicalPharmacology("NONE"),
    MedicalMicrobiology("NONE"),
    Neurology("NONE"),
    Neurosurgery("NONE"),
    Neonatology("NONE"),
    Neuropsychology("NONE"),
    GeneralMedicalPractice("NONE"),
    GeneralHygiene("NONE"),
    Oncology("NONE"),
    HealthOrganization("NONE"),
    Osteopathy("NONE"),
    Otolaryngology("NONE"),
    Ophthalmology("NONE"),
    PathologicalAnatomy("NONE"),
    PlasticSurgery("NONE"),
    Pediatrics("NONE"),
    IndustrialPharmacy("NONE"),
    Psychiatry("NONE"),
    Radiology("NONE"),
    CardiovascularSurgery("NONE"),
    EmergencyMedicalCare("NONE"),
    GeneralPractice("NONE"),
    Dentistry("NONE"),
    SportsMedicine("NONE"),
    ForensicMedicalExamination("NONE"),
    Therapy("NONE"),
    ThoracicSurgery("NONE"),
    TraumatologyAndOrthopedics("NONE"),
    Urology("NONE"),
    PharmacyManagementAndEconomics("NONE"),
    NursingManagement("NONE"),
    PharmaceuticalChemistryAndPharmacology("NONE"),
    PhysicalAndRehabilitationMedicine("NONE"),
    Physiology("NONE"),
    Surgery("NONE"),
    MaxillofacialSurgery("NONE"),
    Endocrinology("NONE"),
    Epidemiolog("NONE");

    private MedicalQualificationCategory medicalQualificationCategory;

    MedicalSpecialization(String medicalQualificationCategory) {
        switch (medicalQualificationCategory) {
            case ("NONE"):
                this.medicalQualificationCategory = MedicalQualificationCategory.none;
                break;
            case ("SECOND"):
                this.medicalQualificationCategory = MedicalQualificationCategory.second;
                break;
            case ("FIRST"):
                this.medicalQualificationCategory = MedicalQualificationCategory.first;
                break;
            case ("HIGHEST"):
                this.medicalQualificationCategory = MedicalQualificationCategory.highest;
                break;
            default:
                break;
        }
    }

    public MedicalQualificationCategory getMedicalQualificationCategory() {
        return medicalQualificationCategory;
    }

    public void setMedicalQualificationCategory(MedicalQualificationCategory medicalQualificationCategory) {
        this.medicalQualificationCategory = medicalQualificationCategory;
    }
}
