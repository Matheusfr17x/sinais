package src;

import java.util.concurrent.Semaphore;
//matheus Faria Ribeiro 01/11
public class Lock {
	// Semaforo Mutex
	public final static Semaphore semCon = new Semaphore(0); 
	public final static Semaphore semProd = new Semaphore(1);
}
