package de.telran;

import de.telran.operation.OperationContext;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        private static final String INPUT = "input.txt";
        private static final String OUTPUT = "output.txt";
        public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, InterruptedException {
            ConfigReader configReader = new ConfigReader("config.props");
            List<String> operationPaths = configReader.getOperationPaths();
            OperationContext operationContext = new OperationContext(operationPaths);
            BufferedReader br = new BufferedReader(new FileReader(INPUT));
            PrintWriter writer = new PrintWriter(new FileOutputStream(OUTPUT));
            ExecutorService executor = Executors.newFixedThreadPool(17);
            Supplier supplier = new Supplier(br, writer, executor, operationContext);
            Thread supplierThread = new Thread(supplier);
            supplierThread.start();
            supplierThread.join();
            executor.shutdown();// stops consuming tasks from the queue
            executor.awaitTermination(10, TimeUnit.SECONDS);// waits for the tasks from the queue to be executed
            writer.close();

        }
    }

