package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.AccountInterruptControls;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abkq;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ResolutionData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ResolutionData> CREATOR = new abkq(7);
    final int a;
    public final String b;
    public final int c;
    public final String d;
    public final BrowserResolutionCookie[] e;
    public final boolean f;
    public final NotificationParams g;
    public final AccountInterruptControls h;

    public ResolutionData(int i, String str, int i2, String str2, BrowserResolutionCookie[] browserResolutionCookieArr, boolean z, NotificationParams notificationParams, AccountInterruptControls accountInterruptControls) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = browserResolutionCookieArr;
        this.f = z;
        this.g = notificationParams;
        this.h = accountInterruptControls;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ResolutionData)) {
            return false;
        }
        ResolutionData resolutionData = (ResolutionData) obj;
        if (!TextUtils.equals(this.b, resolutionData.b) || this.c != resolutionData.c || !TextUtils.equals(this.d, resolutionData.d) || !Arrays.equals(this.e, resolutionData.e) || this.f != resolutionData.f || !d.B(this.g, resolutionData.g) || !d.B(this.h, resolutionData.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.e)), Boolean.valueOf(this.f), this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.m(parcel, 3, this.c);
        abhi.q(parcel, 4, this.d, false);
        abhi.H(parcel, 5, this.e, i);
        abhi.h(parcel, 6, this.f);
        abhi.o(parcel, 7, this.g, i, false);
        abhi.o(parcel, 8, this.h, i, false);
        abhi.g(parcel, e);
    }
}
