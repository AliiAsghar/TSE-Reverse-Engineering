package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aclr extends aclo {
    public aclr(abrz abrzVar) {
        super(abrzVar);
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onDataHolderReady(DataHolder dataHolder) {
        a(new acke(dataHolder, 0));
    }
}
