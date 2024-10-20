package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acdi;
import defpackage.alog;
import defpackage.alsx;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoveGeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoveGeofencingRequest> CREATOR = new acdi(15);
    public final List a;
    public final PendingIntent b;
    public final String c;

    public RemoveGeofencingRequest(List list, PendingIntent pendingIntent, String str) {
        alog n;
        if (list == null) {
            int i = alog.d;
            n = alsx.a;
        } else {
            n = alog.n(list);
        }
        this.a = n;
        this.b = pendingIntent;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.G(parcel, 1, list);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }
}
