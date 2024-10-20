package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qiz implements akfb {
    private final xnv a;
    private final Object b;
    private final Object c = "ImmediateDataSource";

    public qiz(xnv xnvVar, Object obj) {
        this.a = xnvVar;
        this.b = obj;
    }

    @Override // defpackage.akfb
    public final andc a() {
        akrh e = aktp.e("MessageDataSource#ImmediateDataSource#LoadData");
        try {
            andc andcVar = new andc(aktp.ag(akfa.a(this.b, this.a.f())));
            armd.i(e, null);
            return andcVar;
        } finally {
        }
    }

    @Override // defpackage.akfb
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        return aktp.ag(null);
    }

    @Override // defpackage.akfb
    public final Object c() {
        return this.c;
    }
}
