package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ackc;
import defpackage.ackd;
import defpackage.ackp;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DataItemParcelable extends AbstractSafeParcelable implements ackc {
    public static final Parcelable.Creator<DataItemParcelable> CREATOR = new ackp(13);
    public final Uri a;
    public byte[] b;
    private final Map c;

    public DataItemParcelable(Uri uri, Bundle bundle, byte[] bArr) {
        this.a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        abhg.m(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            abhg.m(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.c = hashMap;
        this.b = bArr;
    }

    @Override // defpackage.ackc
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.ackc
    public final Map b() {
        return this.c;
    }

    @Override // defpackage.ackc
    public final byte[] c() {
        return this.b;
    }

    public final String toString() {
        Object valueOf;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.b;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        sb.append(",dataSz=".concat(valueOf.toString()));
        sb.append(", numAssets=" + this.c.size());
        sb.append(", uri=".concat(String.valueOf(String.valueOf(this.a))));
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.c.keySet()) {
            sb.append("\n    " + str + ": " + String.valueOf(this.c.get(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, uri, i, false);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        abhg.m(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.c.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((ackd) entry.getValue()));
        }
        abhi.t(parcel, 4, bundle);
        abhi.j(parcel, 5, this.b, false);
        abhi.g(parcel, e);
    }

    @Override // defpackage.abtr
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
