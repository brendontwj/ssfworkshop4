package vttp2022.batch2.ssfworkshop4.service;

import vttp2022.batch2.ssfworkshop4.model.Contact;

public interface ContactsRepo {
    public void save(final Contact ctc);
    
    public Contact findById(final String contactId);
}
