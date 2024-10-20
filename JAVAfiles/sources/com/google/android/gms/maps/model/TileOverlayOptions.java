package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.internal.ITileProviderDelegate;
import defpackage.abhi;
import defpackage.acfd;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new acfd(7);
    public boolean a;
    public float b;
    public boolean c;
    public float d;
    private ITileProviderDelegate e;

    public TileOverlayOptions() {
        this.a = true;
        this.c = true;
        this.d = brg.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int e = abhi.e(parcel);
        ITileProviderDelegate iTileProviderDelegate = this.e;
        if (iTileProviderDelegate == null) {
            asBinder = null;
        } else {
            asBinder = iTileProviderDelegate.asBinder();
        }
        abhi.x(parcel, 2, asBinder);
        abhi.h(parcel, 3, this.a);
        abhi.l(parcel, 4, this.b);
        abhi.h(parcel, 5, this.c);
        abhi.l(parcel, 6, this.d);
        abhi.g(parcel, e);
    }

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.a = true;
        this.c = true;
        this.d = brg.a;
        this.e = ITileProviderDelegate.Stub.asInterface(iBinder);
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = f2;
    }
}
