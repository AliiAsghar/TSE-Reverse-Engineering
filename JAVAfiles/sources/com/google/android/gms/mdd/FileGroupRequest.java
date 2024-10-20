package com.google.android.gms.mdd;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FileGroupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FileGroupRequest> CREATOR = new acfd(9);
    public final String a;
    public final String b;

    @Deprecated
    public final Account c;

    public FileGroupRequest(String str, String str2, Account account) {
        this.a = str;
        this.b = str2;
        this.c = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.g(parcel, e);
    }
}
