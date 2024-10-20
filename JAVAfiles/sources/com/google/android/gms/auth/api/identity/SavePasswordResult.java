package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablq;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new ablq(12);
    public final PendingIntent a;

    public SavePasswordResult(PendingIntent pendingIntent) {
        abhg.m(pendingIntent);
        this.a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordResult)) {
            return false;
        }
        return d.B(this.a, ((SavePasswordResult) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, pendingIntent, i, false);
        abhi.g(parcel, e);
    }
}
