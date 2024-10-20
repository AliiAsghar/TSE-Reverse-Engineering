package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.aced;
import defpackage.adae;
import defpackage.brg;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new aced(5);
    private static final String c = "Cap";
    public final int a;
    public final Float b;
    private final adae d;

    /* JADX INFO: Access modifiers changed from: protected */
    public Cap(int i) {
        this(i, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Cap a() {
        boolean z;
        int i = this.a;
        if (i != 0) {
            boolean z2 = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Log.w(c, a.bV(i, "Unknown Cap type: "));
                        return this;
                    }
                    if (this.d != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    abhg.i(z, "bitmapDescriptor must not be null");
                    if (this.b == null) {
                        z2 = false;
                    }
                    abhg.i(z2, "bitmapRefWidth must not be null");
                    return new CustomCap(this.d, this.b.floatValue());
                }
                return new RoundCap();
            }
            return new SquareCap();
        }
        return new ButtCap();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        if (this.a == cap.a && d.B(this.d, cap.d) && d.B(this.b, cap.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.d, this.b});
    }

    public String toString() {
        return "[Cap: type=" + this.a + "]";
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, i2);
        adae adaeVar = this.d;
        if (adaeVar == null) {
            asBinder = null;
        } else {
            asBinder = adaeVar.a.asBinder();
        }
        abhi.x(parcel, 3, asBinder);
        abhi.w(parcel, 4, this.b);
        abhi.g(parcel, e);
    }

    public Cap(int i, adae adaeVar, Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > brg.a;
        if (i == 3) {
            z = adaeVar != null && z2;
            i = 3;
        } else {
            z = true;
        }
        d.t(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), adaeVar, f));
        this.a = i;
        this.d = adaeVar;
        this.b = f;
    }
}
