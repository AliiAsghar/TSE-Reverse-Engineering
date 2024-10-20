package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablq;
import defpackage.alog;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VerifyWithGoogleResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VerifyWithGoogleResult> CREATOR = new ablq(17);
    public final String a;
    public final String b;
    public final alog c;
    public final PendingIntent d;

    public VerifyWithGoogleResult(String str, String str2, List list, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        abhg.m(list);
        this.c = alog.n(list);
        this.d = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VerifyWithGoogleResult)) {
            return false;
        }
        VerifyWithGoogleResult verifyWithGoogleResult = (VerifyWithGoogleResult) obj;
        if (!d.B(this.a, verifyWithGoogleResult.a) || !d.B(this.b, verifyWithGoogleResult.b) || !d.B(this.c, verifyWithGoogleResult.c) || !d.B(this.d, verifyWithGoogleResult.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.G(parcel, 3, this.c);
        abhi.o(parcel, 4, this.d, i, false);
        abhi.g(parcel, e);
    }
}
