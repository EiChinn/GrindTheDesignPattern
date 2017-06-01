package com.eichinn.chain_of_responsibility.practical;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ProjectManager();
        Handler h2 = new DepManager();
        Handler h3 = new GeneralManager();

        h1.setNexthandler(h2);
        h2.setNexthandler(h3);

        String request = h1.handleFeeRequest("xiaoli", 300);
        System.out.println(request);
        request = h1.handleFeeRequest("xiaozhang", 300);
        System.out.println(request);

        request = h1.handleFeeRequest("xiaoli", 600);
        System.out.println(request);
        request = h1.handleFeeRequest("xiaozhang", 600);
        System.out.println(request);

        request = h1.handleFeeRequest("xiaoli", 1200);
        System.out.println(request);
        request = h1.handleFeeRequest("xiaozhang", 1200);
        System.out.println(request);
    }
}
