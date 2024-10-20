package com.google.android.ims.jibe.service.contactsmanager;

import android.content.Context;
import android.os.Binder;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.IContactsManagement;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import defpackage.adps;
import defpackage.adta;
import defpackage.adtw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ContactsManager extends IContactsManagement.Stub {
    private final Context a;
    private final adps b;

    public ContactsManager(Context context, adps adpsVar) {
        this.a = context;
        this.b = adpsVar;
    }

    @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
    public ContactsServiceResult forceRefreshCapabilities(String str) {
        adtw.d(this.a, Binder.getCallingUid());
        return this.b.a(str);
    }

    @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
    public ImsCapabilities getCachedCapabilities(String str) {
        adtw.d(this.a, Binder.getCallingUid());
        return adta.f(this.b.c(str));
    }

    @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
    public ContactsServiceResult refreshCapabilities(String str) {
        adtw.d(this.a, Binder.getCallingUid());
        return this.b.b(str, 0);
    }
}
