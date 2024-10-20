package com.google.android.gms.mdd;

import android.accounts.Account;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OverrideFileGroupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OverrideFileGroupRequest> CREATOR = new acfd(13);
    public final String a;
    public final String b;
    public final String[] c;
    public final String[] d;
    public final ParcelFileDescriptor[] e;
    public final Account f;

    public OverrideFileGroupRequest(String str, String str2, String[] strArr, String[] strArr2, ParcelFileDescriptor[] parcelFileDescriptorArr, Account account) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = strArr2;
        this.e = parcelFileDescriptorArr;
        this.f = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.F(parcel, 3, this.c);
        abhi.F(parcel, 4, this.d);
        abhi.H(parcel, 5, this.e, i);
        abhi.o(parcel, 6, this.f, i, false);
        abhi.g(parcel, e);
    }
}
