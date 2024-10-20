package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RecordConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecordConsentRequest> CREATOR = new achm(8);
    final int a;
    public final Account b;
    public final Scope[] c;
    public final String d;

    public RecordConsentRequest(int i, Account account, Scope[] scopeArr, String str) {
        this.a = i;
        this.b = account;
        this.c = scopeArr;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.H(parcel, 3, this.c, i);
        abhi.q(parcel, 4, this.d, false);
        abhi.g(parcel, e);
    }
}
