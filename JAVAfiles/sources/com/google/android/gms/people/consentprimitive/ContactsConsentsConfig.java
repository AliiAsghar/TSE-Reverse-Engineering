package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfe;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContactsConsentsConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContactsConsentsConfig> CREATOR = new acfe(20);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Account d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final List h;
    public final boolean i;

    public ContactsConsentsConfig(boolean z, boolean z2, boolean z3, Account account, boolean z4, boolean z5, String str, List list, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = account;
        this.e = z4;
        this.f = z5;
        this.g = str;
        this.h = list;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsConfig)) {
            return false;
        }
        ContactsConsentsConfig contactsConsentsConfig = (ContactsConsentsConfig) obj;
        if (this.a == contactsConsentsConfig.a && this.b == contactsConsentsConfig.b && this.c == contactsConsentsConfig.c && this.e == contactsConsentsConfig.e && this.f == contactsConsentsConfig.f && this.i == contactsConsentsConfig.i && d.B(this.d, contactsConsentsConfig.d) && d.B(this.g, contactsConsentsConfig.g) && d.B(this.h, contactsConsentsConfig.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.i), Boolean.valueOf(this.f), this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, z);
        abhi.h(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.o(parcel, 4, this.d, i, false);
        abhi.h(parcel, 5, this.e);
        abhi.h(parcel, 6, this.f);
        abhi.q(parcel, 7, this.g, false);
        abhi.r(parcel, 8, this.h, false);
        abhi.h(parcel, 9, this.i);
        abhi.g(parcel, e);
    }
}
