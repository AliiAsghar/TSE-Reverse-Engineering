package com.google.android.gms.wallet.firstparty.setupwizard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetSetupWizardIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSetupWizardIntentRequest> CREATOR = new acjs(8);
    final int a;
    final SetupWizardInstrumentManagerParams b;

    public GetSetupWizardIntentRequest(int i, SetupWizardInstrumentManagerParams setupWizardInstrumentManagerParams) {
        this.a = i;
        this.b = setupWizardInstrumentManagerParams;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.g(parcel, e);
    }
}
