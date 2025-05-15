package com.example.oracleclouddb.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * LINKAREER 테이블과 매핑되는 엔티티 클래스입니다.
 */
@Entity
@Table(name = "linkareer")
public class Linkareer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가
    @Column(name = "id")
    private Long id;

    @Column(name = "제목", length = 255)
    private String title;

    @Column(name = "기관", length = 255)
    private String organization;

    @Column(name = "마감일", length = 100)
    private String deadline;

    @Column(name = "조회수", length = 50)
    private String viewCount;

    @Column(name = "상세링크", length = 500)
    private String detailLink;

    @Column(name = "썸네일", length = 500)
    private String thumbnail;

    // 기본 생성자 (JPA 필수)
    public Linkareer() {}

    // 전체 필드를 초기화하는 생성자
    public Linkareer(String title, String organization, String deadline, String viewCount, String detailLink, String thumbnail) {
        this.title = title;
        this.organization = organization;
        this.deadline = deadline;
        this.viewCount = viewCount;
        this.detailLink = detailLink;
        this.thumbnail = thumbnail;
    }

    // Getter & Setter

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    public String getDetailLink() {
        return detailLink;
    }

    public void setDetailLink(String detailLink) {
        this.detailLink = detailLink;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
