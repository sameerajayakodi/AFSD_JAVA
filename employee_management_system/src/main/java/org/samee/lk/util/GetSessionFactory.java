package org.samee.lk.util;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.samee.lk.entity.Department;
import org.samee.lk.entity.Employee;

public class GetSessionFactory {

    public static org.hibernate.SessionFactory getSessionFactory() {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder()
                        .build();
        try {
            return new MetadataSources(registry)
                    .addAnnotatedClass(Department.class)
                    .addAnnotatedClass(Employee.class)
                    .buildMetadata()
                    .buildSessionFactory();
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we
            // had trouble building the SessionFactory so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
        }
        return null;
    }
}