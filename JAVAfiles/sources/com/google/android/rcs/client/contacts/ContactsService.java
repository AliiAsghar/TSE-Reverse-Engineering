package com.google.android.rcs.client.contacts;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.IContactsManagement;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import defpackage.advr;
import defpackage.adwi;
import defpackage.ajnv;
import defpackage.ajnw;
import defpackage.ajny;
import defpackage.ajoa;
import defpackage.apfi;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ContactsService extends ajnv<IContactsManagement> {
    public ContactsService(Context context, ajoa ajoaVar, Optional<ajnw> optional) {
        super(IContactsManagement.class, context, ajoaVar, 1, optional);
    }

    public ContactsServiceResult forceRefreshCapabilities(String str) {
        b();
        if (adwi.k(this.e) && !adwi.g(this.e, getRcsServiceMetaDataKey(), 2)) {
            advr.q("CSApk version does not force refresh capabilities.", new Object[0]);
            return refreshCapabilities(str);
        }
        if (TextUtils.isEmpty(str)) {
            return new ContactsServiceResult(11, "Invalid destination");
        }
        try {
            return ((IContactsManagement) a()).forceRefreshCapabilities(str);
        } catch (Exception e) {
            throw new ajny(e.getMessage(), e);
        }
    }

    public ImsCapabilities getCachedCapabilities(String str) {
        b();
        try {
            return ((IContactsManagement) a()).getCachedCapabilities(str);
        } catch (Exception e) {
            throw new ajny(e.getMessage(), e);
        }
    }

    @Override // defpackage.ajnv
    public String getRcsServiceMetaDataKey() {
        return "ContactsServiceVersions";
    }

    @Override // defpackage.ajnv
    public apfi getServiceNameLoggingEnum() {
        return apfi.CONTACTS_SERVICE;
    }

    public ContactsServiceResult refreshCapabilities(String str) {
        b();
        if (TextUtils.isEmpty(str)) {
            return new ContactsServiceResult(11, "Invalid destination");
        }
        try {
            return ((IContactsManagement) a()).refreshCapabilities(str);
        } catch (Exception e) {
            throw new ajny(e.getMessage(), e);
        }
    }
}
