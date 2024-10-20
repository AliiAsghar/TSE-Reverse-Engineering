package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContactsConsentsStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContactsConsentsStatus> CREATOR = new acfp(0);
    public final ContactsConsentsCoarseStatus a;
    public final ContactsConsentsDetailedStatus b;
    public final ContactsConsentsConfig c;

    public ContactsConsentsStatus(ContactsConsentsCoarseStatus contactsConsentsCoarseStatus, ContactsConsentsDetailedStatus contactsConsentsDetailedStatus, ContactsConsentsConfig contactsConsentsConfig) {
        this.a = contactsConsentsCoarseStatus;
        this.b = contactsConsentsDetailedStatus;
        this.c = contactsConsentsConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsStatus)) {
            return false;
        }
        ContactsConsentsStatus contactsConsentsStatus = (ContactsConsentsStatus) obj;
        if (d.B(this.a, contactsConsentsStatus.a) && d.B(this.b, contactsConsentsStatus.b) && d.B(this.c, contactsConsentsStatus.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, contactsConsentsCoarseStatus, i, false);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.g(parcel, e);
    }
}
