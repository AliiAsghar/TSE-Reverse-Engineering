package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acfy;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ParcelableLoadImageOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableLoadImageOptions> CREATOR = new acfy(4);
    public final int a;
    public final int b;
    public final boolean c;

    public ParcelableLoadImageOptions(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        abhg.q("imageSize", Integer.valueOf(this.a), arrayList);
        abhg.q("avatarOptions", Integer.valueOf(this.b), arrayList);
        abhg.q("useLargePictureForCp2Images", Boolean.valueOf(this.c), arrayList);
        return abhg.p(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.m(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
