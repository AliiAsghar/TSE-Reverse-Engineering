package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acju;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new acju(4);
    public final byte[] a;
    public final String b;
    public final ParcelFileDescriptor c;
    public final Uri d;

    public Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.a = bArr;
        this.b = str;
        this.c = parcelFileDescriptor;
        this.d = uri;
    }

    public static Asset a(ParcelFileDescriptor parcelFileDescriptor) {
        abhg.m(parcelFileDescriptor);
        return new Asset(null, null, parcelFileDescriptor, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        if (Arrays.equals(this.a, asset.a) && d.B(this.b, asset.b) && d.B(this.c, asset.c) && d.B(this.d, asset.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.b == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(this.b);
        }
        if (this.a != null) {
            sb.append(", size=");
            byte[] bArr = this.a;
            abhg.m(bArr);
            sb.append(bArr.length);
        }
        if (this.c != null) {
            sb.append(", fd=");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append(", uri=");
            sb.append(this.d);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        abhg.m(parcel);
        byte[] bArr = this.a;
        int e = abhi.e(parcel);
        abhi.j(parcel, 2, bArr, false);
        abhi.q(parcel, 3, this.b, false);
        int i2 = i | 1;
        abhi.o(parcel, 4, this.c, i2, false);
        abhi.o(parcel, 5, this.d, i2, false);
        abhi.g(parcel, e);
    }
}
