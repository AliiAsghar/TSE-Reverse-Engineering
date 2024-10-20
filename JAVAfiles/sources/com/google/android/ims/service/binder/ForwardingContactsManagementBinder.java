package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.IContactsManagement;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import defpackage.adom;
import defpackage.adud;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ForwardingContactsManagementBinder extends IContactsManagement.Stub implements adud<IContactsManagement> {
    private IContactsManagement a;
    private final Context b;

    public ForwardingContactsManagementBinder(Context context) {
        this.b = context;
    }

    @Override // defpackage.adud
    public synchronized void clear() {
        this.a = null;
    }

    @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
    public ContactsServiceResult forceRefreshCapabilities(String str) {
        return ((IContactsManagement) getDelegate()).forceRefreshCapabilities(str);
    }

    @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
    public ImsCapabilities getCachedCapabilities(String str) {
        return ((IContactsManagement) getDelegate()).getCachedCapabilities(str);
    }

    @Override // defpackage.adud
    public Context getContext() {
        return this.b;
    }

    public /* synthetic */ IInterface getDelegate() {
        return adom.v(this);
    }

    @Override // defpackage.adud
    public synchronized IContactsManagement getInterface() {
        return this.a;
    }

    @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
    public ContactsServiceResult refreshCapabilities(String str) {
        return ((IContactsManagement) getDelegate()).refreshCapabilities(str);
    }

    @Override // defpackage.adud
    public synchronized void set(IBinder iBinder) {
        this.a = (IContactsManagement) iBinder;
    }
}
