package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RecoveryRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecoveryRequest> CREATOR = new abmm(5);
    public String a;
    public String b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;

    private RecoveryRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecoveryRequest) {
            RecoveryRequest recoveryRequest = (RecoveryRequest) obj;
            if (d.B(this.a, recoveryRequest.a) && d.B(this.b, recoveryRequest.b) && Arrays.equals(this.c, recoveryRequest.c) && Arrays.equals(this.d, recoveryRequest.d) && Arrays.equals(this.e, recoveryRequest.e) && Arrays.equals(this.f, recoveryRequest.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.j(parcel, 3, this.c, false);
        abhi.j(parcel, 4, this.d, false);
        abhi.j(parcel, 5, this.e, false);
        abhi.j(parcel, 6, this.f, false);
        abhi.g(parcel, e);
    }

    public RecoveryRequest(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
    }
}
