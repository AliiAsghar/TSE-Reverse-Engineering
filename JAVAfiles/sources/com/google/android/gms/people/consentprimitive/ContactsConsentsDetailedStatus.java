package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;
import defpackage.alok;
import defpackage.alor;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContactsConsentsDetailedStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContactsConsentsDetailedStatus> CREATOR = new acfp(1);
    public final int a;
    public final Bundle b;

    public ContactsConsentsDetailedStatus(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final alor a() {
        alok alokVar = new alok();
        for (String str : this.b.keySet()) {
            alokVar.h(new Account(str, "com.google"), Integer.valueOf(this.b.getInt(str)));
        }
        return alokVar.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsDetailedStatus)) {
            return false;
        }
        ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) obj;
        if (this.a == contactsConsentsDetailedStatus.a && d.B(a(), contactsConsentsDetailedStatus.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.t(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
