package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.ChromeOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablm;
import defpackage.aozb;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BrowserOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BrowserOptions> CREATOR = new ablm(7);
    public final String a;
    public final ChromeOptions b;
    private final aozb c;

    public BrowserOptions(String str, aozb aozbVar, ChromeOptions chromeOptions) {
        abhg.m(str);
        this.a = str;
        this.c = aozbVar;
        this.b = chromeOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserOptions)) {
            return false;
        }
        BrowserOptions browserOptions = (BrowserOptions) obj;
        if (!d.B(this.a, browserOptions.a) || !d.B(this.c, browserOptions.c) || !d.B(this.b, browserOptions.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] H;
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        aozb aozbVar = this.c;
        if (aozbVar == null) {
            H = null;
        } else {
            H = aozbVar.H();
        }
        abhi.j(parcel, 3, H, false);
        abhi.o(parcel, 4, this.b, i, false);
        abhi.g(parcel, e);
    }
}
