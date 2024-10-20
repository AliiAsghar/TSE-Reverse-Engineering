package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SaveInstrumentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SaveInstrumentRequest> CREATOR = new acjs(7);
    Card a;
    ArrayList b;
    byte[] c;

    private SaveInstrumentRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.r(parcel, 2, this.b, false);
        abhi.j(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }

    public SaveInstrumentRequest(Card card, ArrayList arrayList, byte[] bArr) {
        this.a = card;
        this.b = arrayList;
        this.c = bArr;
    }
}
