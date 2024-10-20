package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abrm;
import defpackage.achm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthAccountResult extends AbstractSafeParcelable implements abrm {
    public static final Parcelable.Creator<AuthAccountResult> CREATOR = new achm(4);
    final int a;
    public int b;
    public Intent c;

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.abrm
    public final Status a() {
        if (this.b == 0) {
            return Status.a;
        }
        return Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.m(parcel, 2, this.b);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.g(parcel, e);
    }

    public AuthAccountResult() {
        this(2, 0, null);
    }
}
