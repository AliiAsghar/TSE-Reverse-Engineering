package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfe;
import defpackage.alog;
import defpackage.alsx;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContactsConsentsCoarseStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContactsConsentsCoarseStatus> CREATOR = new acfe(19);
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    private final List e;
    private final List f;
    private final List g;

    public ContactsConsentsCoarseStatus(boolean z, boolean z2, List list, List list2, String str, boolean z3, List list3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.e = list;
        this.f = list2;
        this.d = z3;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsCoarseStatus)) {
            return false;
        }
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) obj;
        if (this.a == contactsConsentsCoarseStatus.a && this.b == contactsConsentsCoarseStatus.b && d.B(this.f, contactsConsentsCoarseStatus.f) && d.B(this.e, contactsConsentsCoarseStatus.e) && d.B(this.c, contactsConsentsCoarseStatus.c) && this.d == contactsConsentsCoarseStatus.d && d.B(this.g, contactsConsentsCoarseStatus.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.e, this.f, this.c, Boolean.valueOf(this.d), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        alog n;
        alog n2;
        alog n3;
        boolean z = this.a;
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, z);
        abhi.h(parcel, 2, this.b);
        List list = this.e;
        if (list == null) {
            int i2 = alog.d;
            n = alsx.a;
        } else {
            n = alog.n(list);
        }
        abhi.r(parcel, 3, n, false);
        List list2 = this.f;
        if (list2 == null) {
            n2 = alsx.a;
        } else {
            n2 = alog.n(list2);
        }
        abhi.r(parcel, 4, n2, false);
        abhi.q(parcel, 5, this.c, false);
        abhi.h(parcel, 6, this.d);
        List list3 = this.g;
        if (list3 == null) {
            n3 = alsx.a;
        } else {
            n3 = alog.n(list3);
        }
        abhi.r(parcel, 7, n3, false);
        abhi.g(parcel, e);
    }
}
