/**
 * Arquivo: HelloWorld/src/helloworld/HelloWorld.java
 */

package helloworld;
public class HelloWorld {
	public static void main(String[] args) {
		if(args.length > 0){
			System.out.println("Ola, " + args[0]);
		}else{
			System.out.println("Ola, Mundo");
		}
	}
}