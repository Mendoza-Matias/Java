package com.mmendoza;

import com.mmendoza.models.Client;
import com.mmendoza.models.Invoice;
import com.mmendoza.models.Item;
import com.mmendoza.models.Product;

public class ExampleInvoice {
    public static void main(String[] args) {
        /* create client */
        Client client = new Client();
        client.setName("Matias");

        /* create invoice */
        Invoice invoice = new Invoice(
                "description", client
        );

        Invoice invoiceTwo = new Invoice(
                "description", client
        );

        /* create product */
        Product product = new Product();
        product.setName("product");
        product.setPrice(500f);

        Item item = new Item(2, product);

        invoice.addItem(item);
        invoiceTwo.addItem(item);

        System.out.println(invoice.getId());
        System.out.println(invoice.getDescription());

        System.out.println(invoiceTwo.getId()); /* get id autoincrement */

        System.out.println(invoice.getTotalInvoice()); /* get total */

        System.out.println(invoiceTwo.getDate());
    }
}
