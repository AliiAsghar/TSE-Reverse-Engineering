package com.google.android.gms.mdh.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acfe;
import defpackage.acff;
import defpackage.acfj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ByteArraySafeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ByteArraySafeParcelable> CREATOR = new acfj(new acfe(6));
    public final byte[] a;

    public ByteArraySafeParcelable(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        acfj.a(this, parcel, new acff(0));
    }
}
