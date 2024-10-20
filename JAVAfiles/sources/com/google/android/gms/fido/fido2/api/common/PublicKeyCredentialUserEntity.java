package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abhn;
import defpackage.abzf;
import defpackage.aozb;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new abzf(3);
    public final String a;
    public final String b;
    public final String c;
    private final aozb d;

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        abhg.m(bArr);
        this.d = aozb.w(bArr);
        abhg.m(str);
        this.a = str;
        this.b = str2;
        abhg.m(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        if (!d.B(this.d, publicKeyCredentialUserEntity.d) || !d.B(this.a, publicKeyCredentialUserEntity.a) || !d.B(this.b, publicKeyCredentialUserEntity.b) || !d.B(this.c, publicKeyCredentialUserEntity.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a, this.b, this.c});
    }

    public final String toString() {
        return "PublicKeyCredentialUserEntity{\n id=" + abhn.g(this.d.H()) + ", \n name='" + this.a + "', \n icon='" + this.b + "', \n displayName='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aozb aozbVar = this.d;
        int e = abhi.e(parcel);
        abhi.j(parcel, 2, aozbVar.H(), false);
        abhi.q(parcel, 3, this.a, false);
        abhi.q(parcel, 4, this.b, false);
        abhi.q(parcel, 5, this.c, false);
        abhi.g(parcel, e);
    }
}
