package ru.mirea.pisarevdmitrii.project.entity;

import org.jetbrains.annotations.NotNull;

public enum MedicalSpecialization {
    ObstetricsAndGynecology(MedicalQualificationCategory.none),
    AllergicAndImmunology(MedicalQualificationCategory.none),
    AnesthesiologyIntensiveCare(MedicalQualificationCategory.none),
    Gastroenterology(MedicalQualificationCategory.none),
    Hematology(MedicalQualificationCategory.none),
    Genetics(MedicalQualificationCategory.none),
    Dermatovenerology(MedicalQualificationCategory.none),
    PediatricSurgery(MedicalQualificationCategory.none),
    InfectiousDiseases(MedicalQualificationCategory.none),
    Cardiology(MedicalQualificationCategory.none),
    ClinicalLaboratoryDiagnostics(MedicalQualificationCategory.none),
    ClinicalPharmacology(MedicalQualificationCategory.none),
    MedicalMicrobiology(MedicalQualificationCategory.none),
    Neurology(MedicalQualificationCategory.none),
    Neurosurgery(MedicalQualificationCategory.none),
    Neonatology(MedicalQualificationCategory.none),
    Neuropsychology(MedicalQualificationCategory.none),
    GeneralMedicalPractice(MedicalQualificationCategory.none),
    GeneralHygiene(MedicalQualificationCategory.none),
    Oncology(MedicalQualificationCategory.none),
    HealthOrganization(MedicalQualificationCategory.none),
    Osteopathy(MedicalQualificationCategory.none),
    Otolaryngology(MedicalQualificationCategory.none),
    Ophthalmology(MedicalQualificationCategory.none),
    PathologicalAnatomy(MedicalQualificationCategory.none),
    PlasticSurgery(MedicalQualificationCategory.none),
    Pediatrics(MedicalQualificationCategory.none),
    IndustrialPharmacy(MedicalQualificationCategory.none),
    Psychiatry(MedicalQualificationCategory.none),
    Radiology(MedicalQualificationCategory.none),
    CardiovascularSurgery(MedicalQualificationCategory.none),
    EmergencyMedicalCare(MedicalQualificationCategory.none),
    GeneralPractice(MedicalQualificationCategory.none),
    Dentistry(MedicalQualificationCategory.none),
    SportsMedicine(MedicalQualificationCategory.none),
    ForensicMedicalExamination(MedicalQualificationCategory.none),
    Therapy(MedicalQualificationCategory.none),
    ThoracicSurgery(MedicalQualificationCategory.none),
    TraumatologyAndOrthopedics(MedicalQualificationCategory.none),
    Urology(MedicalQualificationCategory.none),
    PharmacyManagementAndEconomics(MedicalQualificationCategory.none),
    NursingManagement(MedicalQualificationCategory.none),
    PharmaceuticalChemistryAndPharmacology(MedicalQualificationCategory.none),
    PhysicalAndRehabilitationMedicine(MedicalQualificationCategory.none),
    Physiology(MedicalQualificationCategory.none),
    Surgery(MedicalQualificationCategory.none),
    MaxillofacialSurgery(MedicalQualificationCategory.none),
    Endocrinology(MedicalQualificationCategory.none),
    Epidemiolog(MedicalQualificationCategory.none),
    Not(MedicalQualificationCategory.none);

    private MedicalQualificationCategory medicalQualificationCategory;

    MedicalSpecialization() {
    }

    MedicalSpecialization(@NotNull MedicalQualificationCategory medicalQualificationCategory) {
        switch (medicalQualificationCategory) {
            case none:
                this.medicalQualificationCategory = MedicalQualificationCategory.none;
                break;
            case second:
                this.medicalQualificationCategory = MedicalQualificationCategory.second;
                break;
            case first:
                this.medicalQualificationCategory = MedicalQualificationCategory.first;
                break;
            case highest:
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
