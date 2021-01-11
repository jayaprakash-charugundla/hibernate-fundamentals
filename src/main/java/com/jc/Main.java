package com.jc;

import com.jc.domain.m01.Airport;
import com.jc.domain.m01.Passenger;
import com.jc.domain.m01.Ticket;
import com.jc.domain.m08.Department;
import com.jc.domain.m09.Payment;
import com.jc.domain.m10.Address;
import com.jc.domain.m12.OneWayTicket;
import com.jc.domain.m12.ReturnTicket;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //m01();
        //m02();
        //m03();
        //m04();
        //m05();
        //m06();
        //m07();
        //m08();
        //m09();
        //m10();
        //m11();
        //m12();
        //m13();
        m14();
    }

    private static void m01() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m01");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Airport airport = new Airport(1, "Henri Coanda");

        com.jc.domain.m01.Passenger john = new com.jc.domain.m01.Passenger(1, "John Smith");
        john.setAirport(airport);

        Passenger mike = new Passenger(2, "Michael Johnson");
        mike.setAirport(airport);

        airport.addPassenger(john);
        airport.addPassenger(mike);

        Ticket ticket1 = new Ticket(1, "AA1234");
        ticket1.setPassenger(john);

        Ticket ticket2 = new Ticket(2, "BB5678");
        ticket2.setPassenger(mike);

        Ticket ticket3 = new Ticket(3, "CC0987");
        ticket3.setPassenger(mike);

        john.addTicket(ticket1);
        mike.addTicket(ticket2);
        mike.addTicket(ticket3);

        em.persist(airport);
        em.persist(john);
        em.persist(mike);
        em.persist(ticket1);
        em.persist(ticket2);
        em.persist(ticket3);

        em.getTransaction().commit();
        emf.close();
    }

    private static void m02() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m02");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        com.jc.domain.m02.Passenger john = new com.jc.domain.m02.Passenger(1, "John Smith", "3 Flowers Street, Boston");
        em.persist(john);

        em.getTransaction().commit();
        emf.close();
    }

    private static void m03() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m03");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        com.jc.domain.m03.Passenger john = new com.jc.domain.m03.Passenger(1, "John Smith");
        john.setCity("Boston");
        john.setStreet("Flowers Street");
        john.setNumber("3");
        john.setZipCode("012345");
        em.persist(john);

        em.getTransaction().commit();
        emf.close();
    }

    private static void m04() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m04");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        com.jc.domain.m04.Passenger john = new com.jc.domain.m04.Passenger(1, "John Smith");
        john.setCity("Boston");
        john.setStreet("Flowers Street");
        john.setNumber("3");
        john.setZipCode("012345");
        john.setAreaCode("302");
        john.setPrefix("231");
        john.setLineNumber("951235");
        em.persist(john);

        em.getTransaction().commit();
        emf.close();
    }

    private static void m05() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m05");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        com.jc.domain.m05.Ticket ticket = new com.jc.domain.m05.Ticket();
        ticket.setNumber("AA");
        ticket.setSeries("1234");
        ticket.setOrigin("Bucharest");
        em.persist(ticket);

        em.getTransaction().commit();
        emf.close();
    }

    private static void m06() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m06");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        com.jc.domain.m06.TicketKey key = new com.jc.domain.m06.TicketKey();
        key.setNumber("AA");
        key.setSeries("1234");

        com.jc.domain.m06.Ticket ticket = new com.jc.domain.m06.Ticket();
        ticket.setId(key);
        ticket.setOrigin("Bucharest");
        em.persist(ticket);

        em.getTransaction().commit();
        emf.close();
    }

    private static void m07() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m07");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        com.jc.domain.m07.Ticket ticket = new com.jc.domain.m07.Ticket();
        ticket.setNumber("AA");
        ticket.setSeries("1234");
        ticket.setOrigin("Bucharest");
        em.persist(ticket);

        em.getTransaction().commit();
        emf.close();
    }

    private static void m08() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m08");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        com.jc.domain.m08.Manager john = new com.jc.domain.m08.Manager("John Smith");
        Department accounting = new Department("Accounting");
        john.setDepartment(accounting);
        em.persist(john);
        em.persist(accounting);

        em.getTransaction().commit();
        emf.close();
    }

    private static void m09() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m09");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        com.jc.domain.m09.Ticket ticket = new com.jc.domain.m09.Ticket();
        ticket.setNumber("AA1234");
        ticket.setOrigin("London");
        ticket.setDestination("Bucharest");

        Payment payment = new Payment();
        payment.setTicket(ticket);
        payment.setAmount(200);

        em.persist(ticket);
        em.persist(payment);

        em.getTransaction().commit();
        emf.close();
    }

    private static void m10() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m10");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        com.jc.domain.m10.Passenger john = new com.jc.domain.m10.Passenger("John Smith");
        Address address = new Address();
        address.setStreet("Flowers Street");
        address.setNumber("3");
        address.setZipCode("012345");
        address.setCity("Boston");
        john.setAddress(address);
        em.persist(john);
        em.getTransaction().commit();
        emf.close();
    }

    private static void m11() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m11");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        com.jc.domain.m11.Passenger john = new com.jc.domain.m11.Passenger("John Smith");
        com.jc.domain.m11.Ticket ticket1 = new com.jc.domain.m11.Ticket("AA1234");
        com.jc.domain.m11.Ticket ticket2 = new com.jc.domain.m11.Ticket("BB5678");
        john.addTicket(ticket1);
        john.addTicket(ticket2);
        john.addAttribute("VIP", "Yes");
        john.addAttribute("FREQUENT_FLYER", "Yes");
        em.persist(john);
        em.getTransaction().commit();
        emf.close();
    }

    private static void m12() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m12");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        OneWayTicket oneWayTicket = new OneWayTicket();
        oneWayTicket.setNumber("AA1234");
        oneWayTicket.setLatestDepartureDate(LocalDate.of(2021, 3, 20));

        ReturnTicket returnTicket = new ReturnTicket();
        returnTicket.setNumber("BB5678");
        returnTicket.setLatestReturnDate(LocalDate.of(2022, 1, 31));

        em.persist(oneWayTicket);
        em.persist(returnTicket);
        em.getTransaction().commit();
        emf.close();
    }

    private static void m13() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m13");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        com.jc.domain.m13.Passenger john = new com.jc.domain.m13.Passenger("John Smith");

        com.jc.domain.m13.OneWayTicket oneWayTicket = new com.jc.domain.m13.OneWayTicket();
        oneWayTicket.setNumber("AA1234");
        oneWayTicket.setLatestDepartureDate(LocalDate.of(2021, 3, 20));
        oneWayTicket.setPassenger(john);

        com.jc.domain.m13.ReturnTicket returnTicket = new com.jc.domain.m13.ReturnTicket();
        returnTicket.setNumber("BB5678");
        returnTicket.setLatestReturnDate(LocalDate.of(2022, 1, 31));
        returnTicket.setPassenger(john);

        em.persist(john);
        em.persist(oneWayTicket);
        em.persist(returnTicket);
        em.getTransaction().commit();
        emf.close();
    }

    private static void m14() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("m14");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        com.jc.domain.m14.OneWayTicket oneWayTicket = new com.jc.domain.m14.OneWayTicket();
        oneWayTicket.setNumber("AA1234");
        oneWayTicket.setLatestDepartureDate(LocalDate.of(2021, 3, 20));

        com.jc.domain.m14.ReturnTicket returnTicket = new com.jc.domain.m14.ReturnTicket();
        returnTicket.setNumber("BB5678");
        returnTicket.setLatestReturnDate(LocalDate.of(2022, 1, 31));

        em.persist(oneWayTicket);
        em.persist(returnTicket);
        em.getTransaction().commit();
        emf.close();
    }

}
