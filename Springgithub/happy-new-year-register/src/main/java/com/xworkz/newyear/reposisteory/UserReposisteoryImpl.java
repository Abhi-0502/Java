package com.xworkz.newyear.reposisteory;

import com.xworkz.newyear.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

@Slf4j
@Repository
public class UserReposisteoryImpl implements UserReposisteory{
    @Autowired

    EntityManagerFactory factory;
    private UserEntity UserEntity;

    @Override
    public boolean Save(UserEntity userEntity) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public boolean findByEmail(String email) {
        log.info("find By Email started");
        try {
            EntityManager manager = factory.createEntityManager();
            Query query = manager.createNamedQuery("UserEntity.findByEmail");
            query.setParameter("email", email);
            Long count = (Long) query.getSingleResult();
            return count>0;
        } catch (Exception e) {
            log.info("{}",e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updatePassword(String email, String newPassword,String confirmPwd) {
        try {
            EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            Query query = entityManager.createNamedQuery("updatePassword");
            query.setParameter("password", newPassword);
            query.setParameter("email", email);
            query.setParameter("confirmPwd",confirmPwd);
            int updatedRows = query.executeUpdate();
            entityManager.getTransaction().commit();
            entityManager.close();
            return updatedRows > 0;
        } catch (Exception e) {
            log.error("Error updating password: {}", e.getMessage());
            return false;
        }
    }

    @Override
    public UserEntity findByEmailAndPassword(String email, String password) {
        try {
            EntityManager manager = factory.createEntityManager();
            Query query = manager.createNamedQuery("findByEmailAndPassword", UserEntity.class);
            query.setParameter("email", email);
            query.setParameter("password", password);
            UserEntity userEntity = (UserEntity) query.getSingleResult();
            return userEntity;
        } catch (Exception e) {
            log.error("Error finding email and password: {}", e.getMessage());
        }
         return UserEntity;
    }

    @Override
    public UserEntity checkEmail(String email) {
        try{
            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("findByEmail");
            query.setParameter("email",email);
            UserEntity userEntity = (UserEntity) query.getSingleResult();
            return userEntity;

        }catch (Exception e){
            log.info("{}",e.getMessage());
        }
        return new UserEntity();
    }

    @Override
    public boolean updateDate(com.xworkz.newyear.entity.UserEntity userEntity) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(userEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;

    }

    @Override
    public boolean checkPhone(Long contact) {

        log.info("find By contact started");
        try {
            EntityManager manager = factory.createEntityManager();
            Query query = manager.createNamedQuery("checkPhone");
            query.setParameter("contact", contact);
            Long count = (Long) query.getSingleResult();
            return count>0;
        } catch (Exception e) {
            log.info("{}",e.getMessage());
            return false;
        }
    }

}

