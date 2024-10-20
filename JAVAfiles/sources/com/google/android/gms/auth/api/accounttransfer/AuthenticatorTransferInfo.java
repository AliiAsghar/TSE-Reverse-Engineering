package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.a;
import defpackage.abhi;
import defpackage.abkq;
import defpackage.to;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthenticatorTransferInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator<AuthenticatorTransferInfo> CREATOR = new abkq(13);
    private static final HashMap h;
    final Set a;
    final int b;
    public String c;
    public int d;
    public byte[] e;
    public PendingIntent f;
    public DeviceMetaData g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("accountType", new FastJsonResponse.Field(7, false, 7, false, "accountType", 2, null));
        hashMap.put("status", new FastJsonResponse.Field(0, false, 0, false, "status", 3, null));
        hashMap.put("transferBytes", new FastJsonResponse.Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public AuthenticatorTransferInfo(Set set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = bArr;
        this.f = pendingIntent;
        this.g = deviceMetaData;
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
                return Integer.valueOf(this.d);
            }
            return this.c;
        }
        return Integer.valueOf(this.b);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map b() {
        return h;
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
            abhi.q(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            abhi.m(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            abhi.j(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            abhi.o(parcel, 5, this.f, i, true);
        }
        if (set.contains(6)) {
            abhi.o(parcel, 6, this.g, i, true);
        }
        abhi.g(parcel, e);
    }

    public AuthenticatorTransferInfo() {
        this.a = new to(3);
        this.b = 1;
    }
}
