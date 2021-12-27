package ru.mahach.kafkalearn.dto;

import java.util.Objects;

public class Ship {

    private Long id;
    private String name;
    private String status;
    private String type;
    private int yearBuilt;
    private String homePort;
    private Double lon;
    private Double lat;

    public Ship() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getHomePort() {
        return homePort;
    }

    public void setHomePort(String homePort) {
        this.homePort = homePort;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return yearBuilt == ship.yearBuilt && Objects.equals(id, ship.id) && Objects.equals(name, ship.name) && Objects.equals(status, ship.status) && Objects.equals(type, ship.type) && Objects.equals(homePort, ship.homePort) && Objects.equals(lon, ship.lon) && Objects.equals(lat, ship.lat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, type, yearBuilt, homePort, lon, lat);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", yearBuilt=" + yearBuilt +
                ", homePort='" + homePort + '\'' +
                ", lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}
