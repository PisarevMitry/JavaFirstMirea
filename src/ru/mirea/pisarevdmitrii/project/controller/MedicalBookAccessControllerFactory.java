package ru.mirea.pisarevdmitrii.project.controller;

import ru.mirea.pisarevdmitrii.project.entity.MedicalBook;

enum AccessType {
    AccessDenied,
    ReadAccess,
    ReadWriteAccess
}

public class MedicalBookAccessControllerFactory {
    public MedicalBook medicalBook;

    public void createFactory(MedicalBook medicalBook, AccessType type) {
        this.medicalBook = medicalBook;
        switch (type) {
            case ReadAccess:
                this.medicalBook = new ReadAccess();
                break;
            case ReadWriteAccess:
                this.medicalBook = new ReadWriteAccess();
                break;
            case AccessDenied:
                this.medicalBook = new DeniedAccess();
                break;
        }
    }
}

class DeniedAccess extends MedicalBook {
}

class ReadAccess extends MedicalBook {
}

class ReadWriteAccess extends MedicalBook {
}