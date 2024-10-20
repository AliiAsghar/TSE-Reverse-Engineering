package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablm;
import defpackage.aozb;
import defpackage.d;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RegisteredCredentialData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredCredentialData> CREATOR = new ablm(10);
    final String a;
    final aozb b;
    final boolean c;

    public RegisteredCredentialData(String str, aozb aozbVar, boolean z) {
        d.aC(str, "storage ID shouldn't be null");
        this.a = str;
        this.b = aozbVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisteredCredentialData)) {
            return false;
        }
        RegisteredCredentialData registeredCredentialData = (RegisteredCredentialData) obj;
        if (this.c != registeredCredentialData.c || !Objects.equals(this.a, registeredCredentialData.a) || !Objects.equals(this.b, registeredCredentialData.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.c), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] H;
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        aozb aozbVar = this.b;
        if (aozbVar == null) {
            H = null;
        } else {
            H = aozbVar.H();
        }
        abhi.j(parcel, 2, H, false);
        abhi.h(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
