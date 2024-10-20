package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.a;
import defpackage.abhi;
import defpackage.abkq;
import defpackage.tm;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountTransferProgress extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator<AccountTransferProgress> CREATOR = new abkq(11);
    private static final tm g;
    final int a;
    public List b;
    public List c;
    public List d;
    public List e;
    public List f;

    static {
        tm tmVar = new tm();
        g = tmVar;
        tmVar.put("registered", new FastJsonResponse.Field(7, true, 7, true, "registered", 2, null));
        tmVar.put("in_progress", new FastJsonResponse.Field(7, true, 7, true, "in_progress", 3, null));
        tmVar.put("success", new FastJsonResponse.Field(7, true, 7, true, "success", 4, null));
        tmVar.put("failed", new FastJsonResponse.Field(7, true, 7, true, "failed", 5, null));
        tmVar.put("escrowed", new FastJsonResponse.Field(7, true, 7, true, "escrowed", 6, null));
    }

    public AccountTransferProgress() {
        this.a = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object a(FastJsonResponse.Field field) {
        int i = field.g;
        switch (i) {
            case 1:
                return Integer.valueOf(this.a);
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            default:
                throw new IllegalStateException(a.bV(i, "Unknown SafeParcelable id="));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map b() {
        return g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean c(FastJsonResponse.Field field) {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.G(parcel, 2, this.b);
        abhi.G(parcel, 3, this.c);
        abhi.G(parcel, 4, this.d);
        abhi.G(parcel, 5, this.e);
        abhi.G(parcel, 6, this.f);
        abhi.g(parcel, e);
    }

    public AccountTransferProgress(int i, List list, List list2, List list3, List list4, List list5) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }
}
