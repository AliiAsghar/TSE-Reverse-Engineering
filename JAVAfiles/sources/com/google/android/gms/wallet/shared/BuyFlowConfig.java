package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BuyFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BuyFlowConfig> CREATOR = new acjs(14);
    String a;
    ApplicationParameters b;
    String c;
    String d;
    String e;
    String f;
    int g;

    BuyFlowConfig() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, this.a, false);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.q(parcel, 4, this.c, false);
        abhi.q(parcel, 5, this.d, false);
        if (TextUtils.isEmpty(this.e)) {
            str = this.c;
        } else {
            str = this.e;
        }
        abhi.q(parcel, 6, str, false);
        abhi.q(parcel, 7, this.f, false);
        abhi.m(parcel, 8, this.g);
        abhi.g(parcel, e);
    }

    public BuyFlowConfig(String str, ApplicationParameters applicationParameters, String str2, String str3, String str4, String str5, int i) {
        this.a = str;
        this.b = applicationParameters;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
    }
}
