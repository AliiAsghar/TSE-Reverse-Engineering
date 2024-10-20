package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.abhi;
import defpackage.aced;
import defpackage.adae;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PinConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PinConfig> CREATOR = new aced(15);
    public final int a;
    public final int b;
    public final Glyph c;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static class Glyph extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Glyph> CREATOR = new aced(9);
        public final String a;
        public int b;
        public int c;
        public final adae d;

        public Glyph(String str, IBinder iBinder, int i, int i2) {
            adae adaeVar;
            this.b = -5041134;
            this.c = -16777216;
            this.a = str;
            if (iBinder == null) {
                adaeVar = null;
            } else {
                adaeVar = new adae(IObjectWrapper.Stub.asInterface(iBinder));
            }
            this.d = adaeVar;
            this.b = i;
            this.c = i2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Glyph)) {
                return false;
            }
            Glyph glyph = (Glyph) obj;
            if (this.b != glyph.b || !Objects.equals(this.a, glyph.a) || this.c != glyph.c) {
                return false;
            }
            adae adaeVar = this.d;
            if ((adaeVar == null && glyph.d != null) || (adaeVar != null && glyph.d == null)) {
                return false;
            }
            adae adaeVar2 = glyph.d;
            if (adaeVar == null || adaeVar2 == null) {
                return true;
            }
            return Objects.equals(ObjectWrapper.unwrap(adaeVar.a), ObjectWrapper.unwrap(adaeVar2.a));
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.d, Integer.valueOf(this.b));
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            IBinder asBinder;
            String str = this.a;
            int e = abhi.e(parcel);
            abhi.q(parcel, 2, str, false);
            adae adaeVar = this.d;
            if (adaeVar == null) {
                asBinder = null;
            } else {
                asBinder = adaeVar.a.asBinder();
            }
            abhi.x(parcel, 3, asBinder);
            abhi.m(parcel, 4, this.b);
            abhi.m(parcel, 5, this.c);
            abhi.g(parcel, e);
        }
    }

    public PinConfig(int i, int i2, Glyph glyph) {
        this.a = i;
        this.b = i2;
        this.c = glyph;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, i2);
        abhi.m(parcel, 3, this.b);
        abhi.o(parcel, 4, this.c, i, false);
        abhi.g(parcel, e);
    }
}
