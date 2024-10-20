package com.google.android.gms.wallet.firstparty.setupwizard;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SetupWizardInstrumentManagerParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetupWizardInstrumentManagerParams> CREATOR = new acjs(9);
    final Account a;
    final byte[] b;
    final BuyFlowConfig c;
    final String d;
    final byte[] e;
    final boolean f;
    final boolean g;

    public SetupWizardInstrumentManagerParams(Account account, byte[] bArr, BuyFlowConfig buyFlowConfig, String str, byte[] bArr2, boolean z, boolean z2) {
        this.a = account;
        this.b = bArr;
        this.c = buyFlowConfig;
        this.d = str;
        this.e = bArr2;
        this.f = z;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.j(parcel, 2, this.b, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.j(parcel, 5, this.e, false);
        abhi.h(parcel, 6, this.f);
        abhi.h(parcel, 7, this.g);
        abhi.g(parcel, e);
    }
}
