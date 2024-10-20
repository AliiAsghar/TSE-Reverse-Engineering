package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abzo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ND4CSettings extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ND4CSettings> CREATOR = new abzo(12);
    boolean a;
    String b;

    public ND4CSettings(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.h(parcel, 2, this.a);
        abhi.q(parcel, 3, this.b, false);
        abhi.g(parcel, e);
    }

    public ND4CSettings() {
        this(true, "");
    }
}
