package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablm;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new ablm(1);
    final int a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        if (i < 2) {
            this.d = true == z3 ? 3 : 1;
        } else {
            this.d = i2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.b;
        int e = abhi.e(parcel);
        boolean z2 = true;
        abhi.h(parcel, 1, z);
        abhi.h(parcel, 2, this.c);
        if (this.d != 3) {
            z2 = false;
        }
        abhi.h(parcel, 3, z2);
        abhi.m(parcel, 4, this.d);
        abhi.m(parcel, 1000, this.a);
        abhi.g(parcel, e);
    }

    public CredentialPickerConfig() {
        this(2, false, true, false, 1);
    }
}
