package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablq;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new ablq(9);
    public final PendingIntent a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final int f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i) {
        this.a = pendingIntent;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        if (this.d.size() != saveAccountLinkingTokenRequest.d.size() || !this.d.containsAll(saveAccountLinkingTokenRequest.d) || !d.B(this.a, saveAccountLinkingTokenRequest.a) || !d.B(this.b, saveAccountLinkingTokenRequest.b) || !d.B(this.c, saveAccountLinkingTokenRequest.c) || !d.B(this.e, saveAccountLinkingTokenRequest.e) || this.f != saveAccountLinkingTokenRequest.f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, pendingIntent, i, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.G(parcel, 4, this.d);
        abhi.q(parcel, 5, this.e, false);
        abhi.m(parcel, 6, this.f);
        abhi.g(parcel, e);
    }
}
