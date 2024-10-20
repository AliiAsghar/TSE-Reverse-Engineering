package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ICertData;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.abhi;
import defpackage.abos;
import defpackage.abqg;
import defpackage.abqh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesQuery> CREATOR = new abos(13);
    public final String a;
    public final boolean b;
    public final boolean c;
    private final abqg d;

    public GoogleCertificatesQuery(String str, abqg abqgVar, boolean z, boolean z2) {
        this.a = str;
        this.d = abqgVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abqg abqgVar = this.d;
        if (abqgVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abqgVar = null;
        }
        abhi.x(parcel, 2, abqgVar);
        abhi.h(parcel, 3, this.b);
        abhi.h(parcel, 4, this.c);
        abhi.g(parcel, e);
    }

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        abqh abqhVar = null;
        if (iBinder != null) {
            try {
                IObjectWrapper bytesWrapped = ICertData.Stub.asInterface(iBinder).getBytesWrapped();
                byte[] bArr = bytesWrapped == null ? null : (byte[]) ObjectWrapper.unwrap(bytesWrapped);
                if (bArr != null) {
                    abqhVar = new abqh(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = abqhVar;
        this.b = z;
        this.c = z2;
    }
}
