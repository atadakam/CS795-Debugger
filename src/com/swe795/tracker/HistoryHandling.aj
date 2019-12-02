/**
 * 
 */
package com.swe795.tracker;

import java.lang.reflect.Field;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.FieldSignature;

/**
 * @author kesin
 *
 */
public privileged aspect HistoryHandling

{
    private Map<HistoryVariable, Deque<Object>> history = new HashMap<>();

    before() : execution(HistoryVariable.new(..))
    {
        history.put((HistoryVariable) thisJoinPoint.getTarget(), new LinkedList<>());
    }
 
    after() : execution(void HistoryVariable.dispose())
    {
        history.remove(thisJoinPoint.getTarget());
    }
 
    before(Object v) : execution(void HistoryVariable.update(Object)) && args(v)
    {
        final HistoryVariable hv = (HistoryVariable) thisJoinPoint.getThis();
        history.get(hv).add(hv.value);
    }
 
    after() : execution(Object HistoryVariable.undo())
    {
        final HistoryVariable hv = (HistoryVariable) thisJoinPoint.getThis();
        final Deque<Object> q = history.get(hv);
        if (!q.isEmpty())
            hv.value = q.pollLast();
    }
 
    String around() : this(HistoryVariable) && execution(String toString())
    {
        final HistoryVariable hv = (HistoryVariable) thisJoinPoint.getThis();
        final Deque<Object> q = history.get(hv);
        if (q == null)
            return "<disposed>";
        else
            return "current: "+ hv.value + ", previous: " + q.toString();
    }
    
    private static Map<String, Object> emp = new HashMap<>();

    
    before(Employee p, int x): target(p)
    && args(x)
    && call(void setX(int)) {
//if (!p.assertX(x)) {
    	System.out.println("Illegal value for x"); return;
//}
}
    
    
    // @AfterReturning("setMasonID()")
     //(Employee sample): set(int Sample.masonID) && target(sample) && execution(Sample setMasonID()){
    // public void test() {
    	/*System.out.println("HERE!!!!");
        FieldSignature fieldSignature = (FieldSignature) thisJoinPoint.getSignature();
        Field field = fieldSignature.getField();

        int oldValue = sample.masonID;
        String newValue = (thisJoinPoint.getArgs()[0]).toString();
       proceed(sample);
        String actualNewValue = sample.x;

        System.out.printf("changed field %s: old value=%d, new value=%d, "
                + "actual new value=%d\n", 
                field, oldValue, newValue, actualNewValue);*/
    	
    
     
//     @Pointcut("call(* setMasonID(..)) && args(i)")
//     void setAge(String i) {}
//     
//     @Around("setAge(i)")
//     public Object twiceAsOld(ProceedingJoinPoint thisJoinPoint, String i) {
//    	 System.out.println("HERE HERE");
//       try {
//		return i;
//	} catch (Throwable e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} //using Java 5 autoboxing
//	return i;
//     }
     
     pointcut setAge(int i): call(* setAge(..)) && args(i);

     Object around(int i): setAge(i) {
    	 System.out.println("HERE HER");
       return proceed(i*2);
     
   }
     
   
    
 


}
