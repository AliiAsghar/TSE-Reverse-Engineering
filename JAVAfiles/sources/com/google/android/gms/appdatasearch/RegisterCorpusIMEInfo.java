package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjj;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RegisterCorpusIMEInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterCorpusIMEInfo> CREATOR = new abjj(2);
    public final int a;
    public final String[] b;
    public final String c;
    public final String d;
    public final String[] e;
    public final String f;

    public RegisterCorpusIMEInfo(int i, String[] strArr, String str, String str2, String[] strArr2, String str3) {
        this.a = i;
        this.b = strArr;
        this.c = str;
        this.d = str2;
        this.e = strArr2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCorpusIMEInfo)) {
            return false;
        }
        RegisterCorpusIMEInfo registerCorpusIMEInfo = (RegisterCorpusIMEInfo) obj;
        if (this.a == registerCorpusIMEInfo.a && Arrays.equals(this.b, registerCorpusIMEInfo.b) && d.B(this.c, registerCorpusIMEInfo.c) && d.B(this.d, registerCorpusIMEInfo.d) && Arrays.equals(this.e, registerCorpusIMEInfo.e) && d.B(this.f, registerCorpusIMEInfo.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e)), this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.F(parcel, 2, this.b);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.q(parcel, 6, this.f, false);
        abhi.F(parcel, 7, this.e);
        abhi.g(parcel, e);
    }
}
