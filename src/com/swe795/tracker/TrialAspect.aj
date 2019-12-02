/**
 * 
 */
package com.swe795.tracker;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.FieldSignature;

/**
 * @author kesin
 *
 */
public aspect TrialAspect {
	

	 
	  
	//  pointcut fonction(int x):call(void come.swe795.tracker.Employee.setMasonID(..)) && args(x);
	
	
/*	void around(MasonPerson e): set(int MasonPerson.*) && target(e){
		FieldSignature fieldSignature = (FieldSignature) thisJoinPoint.getSignature();
        Field field = fieldSignature.getField();
        try {
            Object oldValue = field.getInt(e);
            Object newValue = thisJoinPoint.getArgs()[0];
            proceed(e);
            Object actualNewValue = field.get(e);

            Map<Integer, Integer> innerMap= new HashMap<>();
            Map<String, Map<Integer, Integer>> outerMap= new HashMap<>();

            String fieldName = field.getName();
            innerMap.put((Integer)oldValue,(Integer)newValue);
            outerMap.put(fieldName, innerMap);
            Test.logger.add(outerMap);

          
            System.out.printf("changed field %s: old value=%d, new value=%d, "
                    + "actual new value=%d\n", 
                    field, oldValue, newValue, actualNewValue);
            
            
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
        
	}*/
	
	void around(Calculate e): set(int Calculate.*) && target(e){
		FieldSignature fieldSignature = (FieldSignature) thisJoinPoint.getSignature();
        Field field = fieldSignature.getField();
        try {
            Object oldValue = field.getInt(e);
            Object newValue = thisJoinPoint.getArgs()[0];
            proceed(e);
            Object actualNewValue = field.get(e);

            Map<Integer, Integer> innerMap= new HashMap<>();
            Map<String, Map<Integer, Integer>> outerMap= new HashMap<>();

            String fieldName = field.getName();
            innerMap.put((Integer)oldValue,(Integer)newValue);
            outerMap.put(fieldName, innerMap);
            Calculate.logger.add(outerMap);
    
            
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
        
	}
	
	
	

	  
	
	
}
