package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abmi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WebSetupConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebSetupConfigRequest> CREATOR = new abmi(10);
    final int a;
    public final AppDescription b;

    public WebSetupConfigRequest(int i, AppDescription appDescription) {
        this.a = i;
        abhg.m(appDescription);
        this.b = appDescription;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.g(parcel, e);
    }
}
