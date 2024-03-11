package com.voya.doctor.service;

import com.voya.doctor.exception.DoctorNotfoundException;
import com.voya.doctor.exception.IdNotfoundException;
import com.voya.doctor.model.Doctor;

import java.util.List;

public interface IDoctorService {
    void addDoctor(Doctor doctor);

    void updateDoctor(int doctorId,double fees);

    void deleteDoctor(int doctorId);

    Doctor getById(int doctorId) throws IdNotfoundExceptionxception;

    List<Doctor> getAll();

    List<Doctor> getBySpeciality(String speciality) throws DoctorNotfoundExceptionotFoundException;

    List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException;

    List<Doctor> getBySpecialityAndLessFees(String speciality, double fees)throws DoctorNotFoundException;

    List<Doctor> getBySpecialityAndRatings(String speciality, int ratings)throws DoctorNotFoundException;

    List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName)throws DoctorNotFoundException;
}
