package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acju;
import defpackage.d;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PutDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PutDataRequest> CREATOR = new acju(10);
    private static final long e = TimeUnit.MINUTES.toMillis(30);
    public final Uri a;
    public final Bundle b;
    public byte[] c;
    public long d;

    static {
        new SecureRandom();
    }

    public PutDataRequest(Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.a = uri;
        this.b = bundle;
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        abhg.m(classLoader);
        bundle.setClassLoader(classLoader);
        this.c = bArr;
        this.d = j;
    }

    public static PutDataRequest a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("/")) {
                if (!str.startsWith("//")) {
                    return b(new Uri.Builder().scheme("wear").path(str).build());
                }
                throw new IllegalArgumentException("A path must start with a single / .");
            }
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        throw new IllegalArgumentException("An empty path was supplied.");
    }

    public static PutDataRequest b(Uri uri) {
        d.aC(uri, "uri must not be null");
        return new PutDataRequest(uri, new Bundle(), null, e);
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        for (String str : this.b.keySet()) {
            hashMap.put(str, (Asset) this.b.getParcelable(str));
        }
        return DesugarCollections.unmodifiableMap(hashMap);
    }

    public final void d(String str, Asset asset) {
        abhg.m(str);
        abhg.m(asset);
        this.b.putParcelable(str, asset);
    }

    public final String toString() {
        Object valueOf;
        boolean isLoggable = Log.isLoggable("DataMap", 3);
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        sb.append("dataSz=".concat(valueOf.toString()));
        sb.append(", numAssets=" + this.b.size());
        sb.append(", uri=".concat(String.valueOf(String.valueOf(this.a))));
        sb.append(", syncDeadline=" + this.d);
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.b.keySet()) {
            sb.append("\n    " + str + ": " + String.valueOf(this.b.getParcelable(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d.aC(parcel, "dest must not be null");
        Uri uri = this.a;
        int e2 = abhi.e(parcel);
        abhi.o(parcel, 2, uri, i, false);
        abhi.t(parcel, 4, this.b);
        abhi.j(parcel, 5, this.c, false);
        abhi.n(parcel, 6, this.d);
        abhi.g(parcel, e2);
    }
}
