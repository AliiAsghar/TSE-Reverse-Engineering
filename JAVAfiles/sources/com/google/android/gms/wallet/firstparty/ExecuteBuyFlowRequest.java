package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExecuteBuyFlowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExecuteBuyFlowRequest> CREATOR = new acjq(14);
    final byte[] a;
    final byte[] b;
    final WalletCustomTheme c;

    public ExecuteBuyFlowRequest(byte[] bArr, byte[] bArr2, WalletCustomTheme walletCustomTheme) {
        this.a = bArr;
        this.b = bArr2;
        this.c = walletCustomTheme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int e = abhi.e(parcel);
        abhi.j(parcel, 2, bArr, false);
        abhi.j(parcel, 3, this.b, false);
        abhi.o(parcel, 4, this.c, i, false);
        abhi.g(parcel, e);
    }
}
