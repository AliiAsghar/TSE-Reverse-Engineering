package com.google.android.gms.droidguard;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abqa;
import defpackage.abuz;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DroidGuardResultsRequest extends AbstractSafeParcelable {
    public final Bundle a;
    private static final int b = (int) TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator<DroidGuardResultsRequest> CREATOR = new abuz(12);

    public DroidGuardResultsRequest() {
        String str;
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putInt("clientVersion", abqa.b);
        try {
            str = System.getProperty("os.arch");
        } catch (Exception unused) {
            str = "?";
        }
        this.a.putString("appArchitecture", str);
    }

    public final int a() {
        return this.a.getInt("timeoutMs", b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.t(parcel, 2, this.a);
        abhi.g(parcel, e);
    }

    public DroidGuardResultsRequest(Bundle bundle) {
        new Bundle();
        this.a = bundle;
    }
}
