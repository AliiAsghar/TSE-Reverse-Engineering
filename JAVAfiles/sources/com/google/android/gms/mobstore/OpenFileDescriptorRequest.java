package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OpenFileDescriptorRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OpenFileDescriptorRequest> CREATOR = new acfe(14);
    public final Uri a;
    public final int b;

    public OpenFileDescriptorRequest(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.m(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
