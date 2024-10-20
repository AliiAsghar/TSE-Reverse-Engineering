package com.google.android.gms.maps.model;

import defpackage.adae;
import defpackage.brg;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CustomCap extends Cap {
    public final float c;
    public final adae d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCap(adae adaeVar, float f) {
        super(3, adaeVar, Float.valueOf(f));
        d.aC(adaeVar, "bitmapDescriptor must not be null");
        if (f > brg.a) {
            this.d = adaeVar;
            this.c = f;
            return;
        }
        throw new IllegalArgumentException("refWidth must be positive");
    }

    @Override // com.google.android.gms.maps.model.Cap
    public final String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.d) + " refWidth=" + this.c + "]";
    }
}
