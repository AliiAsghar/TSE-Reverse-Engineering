package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.a;
import defpackage.abhi;
import defpackage.abkq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthenticatorAnnotatedData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator<AuthenticatorAnnotatedData> CREATOR = new abkq(12);
    private static final HashMap g;
    final Set a;
    final int b;
    public AuthenticatorTransferInfo c;
    public String d;
    public String e;
    public String f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("authenticatorInfo", new FastJsonResponse.Field(11, false, 11, false, "authenticatorInfo", 2, AuthenticatorTransferInfo.class));
        hashMap.put("signature", new FastJsonResponse.Field(7, false, 7, false, "signature", 3, null));
        hashMap.put("package", new FastJsonResponse.Field(7, false, 7, false, "package", 4, null));
    }

    public AuthenticatorAnnotatedData(Set set, int i, AuthenticatorTransferInfo authenticatorTransferInfo, String str, String str2, String str3) {
        this.a = set;
        this.b = i;
        this.c = authenticatorTransferInfo;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object a(FastJsonResponse.Field field) {
        int i = field.g;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return this.e;
                    }
                    throw new IllegalStateException(a.bV(i, "Unknown SafeParcelable id="));
                }
                return this.d;
            }
            return this.c;
        }
        return Integer.valueOf(this.b);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map b() {
        return g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean c(FastJsonResponse.Field field) {
        return this.a.contains(Integer.valueOf(field.g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int e = abhi.e(parcel);
        if (set.contains(1)) {
            abhi.m(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            abhi.o(parcel, 2, this.c, i, true);
        }
        if (set.contains(3)) {
            abhi.q(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            abhi.q(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            abhi.q(parcel, 5, this.f, true);
        }
        abhi.g(parcel, e);
    }

    public AuthenticatorAnnotatedData() {
        this.a = new HashSet(3);
        this.b = 1;
    }
}
