package com.google.android.gms.people.contactssync.model;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AccountWithDataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountWithDataSet> CREATOR = new acfp(3);
    public final Account a;
    public final String b;

    @Deprecated
    private final boolean c;

    public AccountWithDataSet(Account account, String str, boolean z) {
        this.a = account;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountWithDataSet)) {
            return false;
        }
        AccountWithDataSet accountWithDataSet = (AccountWithDataSet) obj;
        if (this.c == accountWithDataSet.c && d.B(this.a, accountWithDataSet.a) && d.B(this.b, accountWithDataSet.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int e = abhi.e(parcel);
        boolean z = true;
        abhi.o(parcel, 1, account, i, false);
        abhi.q(parcel, 2, this.b, false);
        if (this.a != null) {
            z = false;
        }
        abhi.h(parcel, 3, z);
        abhi.g(parcel, e);
    }
}
