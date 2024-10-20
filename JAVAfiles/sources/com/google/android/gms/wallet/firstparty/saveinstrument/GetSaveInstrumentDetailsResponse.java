package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetSaveInstrumentDetailsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSaveInstrumentDetailsResponse> CREATOR = new acjs(6);
    String[] a;
    int[] b;
    RemoteViews c;
    byte[] d;

    private GetSaveInstrumentDetailsResponse() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.F(parcel, 1, this.a);
        abhi.y(parcel, 2, this.b);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.j(parcel, 4, this.d, false);
        abhi.g(parcel, e);
    }

    public GetSaveInstrumentDetailsResponse(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.a = strArr;
        this.b = iArr;
        this.c = remoteViews;
        this.d = bArr;
    }
}
