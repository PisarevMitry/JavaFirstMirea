package ru.mirea.pisarevdmitrii.project.service.applicationService;

import ru.mirea.pisarevdmitrii.project.Application;
import ru.mirea.pisarevdmitrii.project.entity.Doctor;
import ru.mirea.pisarevdmitrii.project.entity.Patient;

public class LoginService {

    public void authorization(String surname, String name, String patronymic, String password) {
        try {
            if (patronymic != null) {
                authorizationPatient(surname, name, patronymic, password);
                authorizationDoctor(surname, name, patronymic, password);
                authorizationAdmin(surname, name, patronymic, password);
            } else {
                authorizationPatient(surname, name, password);
                authorizationDoctor(surname, name, password);
                authorizationAdmin(surname, name, password);
            }
            if (Application.getPatient() == null && Application.getDoctor() == null && Application.getAdmin() == null) {
                throw new Exception("not found User");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void authorizationPatient(String surname, String name, String patronymic, String password) {
        try {
            Application.setPatient(Application.getApplicationInitializer().getDatabaseConfig().getPatientController().getPatient(new Patient(surname, name, patronymic, password)));
            if (Application.getPatient() == null) {
                throw new Exception("not found Patient");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void authorizationPatient(String surname, String name, String password) {
        try {
            Application.setPatient(Application.getApplicationInitializer().getDatabaseConfig().getPatientController().getPatient(new Patient(surname, name, password)));
            if (Application.getPatient() == null) {
                throw new Exception("not found Patient");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void authorizationDoctor(String surname, String name, String patronymic, String password) {
        try {
            Application.setDoctor(Application.getApplicationInitializer().getDatabaseConfig().getDoctorController().getDoctor(new Doctor(surname, name, patronymic, password)));
            if (Application.getDoctor() == null) {
                throw new Exception("not found Doctor");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void authorizationDoctor(String surname, String name, String password) {
        try {
            Application.setDoctor(Application.getApplicationInitializer().getDatabaseConfig().getDoctorController().getDoctor(new Doctor(surname, name, password)));
            if (Application.getDoctor() == null) {
                throw new Exception("not found Doctor");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void authorizationAdmin(String surname, String name, String patronymic, String password) {
        if (surname.equals("admin") && password.equals("admin")) {
            Application.setAdmin(new Patient());
        }
    }

    protected void authorizationAdmin(String surname, String name, String password) {
        if (surname.equals("admin") && password.equals("admin")) {
            Application.setAdmin(new Patient());
        }
    }

    public void registration(String surname, String name, String patronymic, String password, String token) {
        try {
            if (patronymic != null) {
                switch (token) {
                    case "PATIENT" -> {
                        registrationPatient(surname, name, patronymic, password);
                    }
                    //можно добавить генерацию токенов для новых врачей
                    case "8ufwXk6@eZmWLTGr%tBAZ0leM|rE~#pS" -> {
                        registrationDoctor(surname, name, patronymic, password);
                    }
                    case "u0mj|RmqbbFKLkkKZ4x%9RRAx?of?fbU" -> {
                        registrationAdmin(surname, name, patronymic, password);
                    }
                }
            } else {
                switch (token) {
                    case "PATIENT" -> {
                        registrationPatient(surname, name, password);
                    }
                    //можно добавить генерацию токенов для новых врачей и администраторов
                    case "8ufwXk6@eZmWLTGr%tBAZ0leM|rE~#pS" -> {
                        registrationDoctor(surname, name, password);
                    }
                    case "u0mj|RmqbbFKLkkKZ4x%9RRAx?of?fbU" -> {
                        registrationAdmin(surname, name, password);
                    }
                }
            }
            authorization(surname, name, patronymic, password);
            if (Application.getPatient() == null && Application.getDoctor() == null && Application.getAdmin() == null) {
                throw new Exception("database error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void registrationPatient(String surname, String name, String patronymic, String password) {
        Application.getApplicationInitializer().getDatabaseConfig().getPatientController().postPatient(new Patient(surname, name, patronymic, password));
    }

    protected void registrationPatient(String surname, String name, String password) {
        Application.getApplicationInitializer().getDatabaseConfig().getPatientController().postPatient(new Patient(surname, name, password));
    }

    protected void registrationDoctor(String surname, String name, String patronymic, String password) {
        Application.getApplicationInitializer().getDatabaseConfig().getDoctorController().postDoctor(new Doctor(surname, name, patronymic, password));
    }

    protected void registrationDoctor(String surname, String name, String password) {
        Application.getApplicationInitializer().getDatabaseConfig().getDoctorController().postDoctor(new Doctor(surname, name, password));
    }

    protected void registrationAdmin(String surname, String name, String patronymic, String password) {
        //добавить таблицу базы данных
       /* try {
            Application.getApplicationInitializer().getDatabaseConfig().getAdminController().postAdmin(new Admin(surname, name, patronymic, password));
            Application.setPatient(Application.getApplicationInitializer().getDatabaseConfig().getAdminController().getAdmin(new Admin(surname, name, patronymic, password));
            if (Application.getAdmin() == null) {
                throw new Exception("database error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    protected void registrationAdmin(String surname, String name, String password) {
        /* try {
            Application.getApplicationInitializer().getDatabaseConfig().getAdminController().postAdmin(new Admin(surname, name, password));
            Application.setPatient(Application.getApplicationInitializer().getDatabaseConfig().getAdminController().getAdmin(new Admin(surname, name, password));
            if (Application.getAdmin() == null) {
                throw new Exception("database error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
