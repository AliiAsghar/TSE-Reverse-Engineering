package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibl implements akgr {
    final /* synthetic */ ibm a;
    final /* synthetic */ Context b;

    public ibl(ibm ibmVar, Context context) {
        this.a = ibmVar;
        this.b = context;
    }

    @Override // defpackage.akgr
    public final /* synthetic */ akfd a() {
        return ibm.a;
    }

    @Override // defpackage.akgr
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        akul c;
        ibm ibmVar = this.a;
        c = qjh.c(ibmVar.f, arpj.a, arwf.a, new emz(ibmVar, this.b, (arpe) null, 4));
        return c;
    }
}
