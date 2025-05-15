package com.example.oracleclouddb.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * JOBS 테이블과 매핑되는 엔티티 클래스입니다.
 */
@Entity
@Table(name = "jobs")
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가
    @Column(name = "id")
    private Long id;

    @Column(name = "회사명", length = 255)
    private String companyName;

    @Column(name = "채용 제목", length = 255)
    private String jobTitle;

    @Column(name = "급여", length = 100)
    private String salary;

    @Column(name = "경력", length = 100)
    private String career;

    @Column(name = "학력", length = 100)
    private String education;

    @Column(name = "근무형태", length = 100)
    private String workType;

    @Column(name = "근무지역", length = 100)
    private String workLocation;

    @Column(name = "마감일", length = 100)
    private String deadline;

    @Column(name = "등록일", length = 100)
    private String registrationDate;

    @Column(name = "D-day", length = 50)
    private String dDay;

    @Column(name = "회사로고", length = 400)
    private String companyLogo;

    @Column(name = "직무", length = 255)
    private String position;

    // 기본 생성자 (JPA 필수)
    public Jobs() {}

    // 전체 필드를 초기화하는 생성자
    public Jobs(String companyName, String jobTitle, String salary, String career, String education,
                String workType, String workLocation, String deadline, String registrationDate,
                String dDay, String companyLogo, String position) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.career = career;
        this.education = education;
        this.workType = workType;
        this.workLocation = workLocation;
        this.deadline = deadline;
        this.registrationDate = registrationDate;
        this.dDay = dDay;
        this.companyLogo = companyLogo;
        this.position = position;
    }

    // Getter & Setter

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getDDay() {
        return dDay;
    }

    public void setDDay(String dDay) {
        this.dDay = dDay;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
