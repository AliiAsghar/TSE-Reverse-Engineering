package defpackage;

import com.google.android.gms.phenotype.internal.IFlagUpdateListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgj extends IFlagUpdateListener.Stub {
    final /* synthetic */ absy a;

    public acgj(absy absyVar) {
        this.a = absyVar;
    }

    @Override // com.google.android.gms.phenotype.internal.IFlagUpdateListener
    public final void onFlagUpdate(byte[] bArr) {
        this.a.b(new acdz(bArr, 4));
    }
}
