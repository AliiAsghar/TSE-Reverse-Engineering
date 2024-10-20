package com.google.android.gms.auth.frp;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class PersistentDeviceOwnerState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PersistentDeviceOwnerState> CREATOR = new abmm(12);
    public final ComponentName a;
    public final String b;

    public PersistentDeviceOwnerState(ComponentName componentName, String str) {
        this.a = componentName;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, this.a, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.g(parcel, e);
    }
}
