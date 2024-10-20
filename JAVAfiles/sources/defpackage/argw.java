package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class argw extends araw {
    final /* synthetic */ aqsf a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ aqut c;
    final /* synthetic */ arhd d;
    final /* synthetic */ argt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public argw(aqsf aqsfVar, SettableFuture settableFuture, aqut aqutVar, arhd arhdVar, argt argtVar) {
        super(aqsfVar);
        this.a = aqsfVar;
        this.b = settableFuture;
        this.c = aqutVar;
        this.d = arhdVar;
        this.e = argtVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aqvs, java.lang.Object] */
    @Override // defpackage.araw
    public final void a() {
        int i = armc.a;
        arhe arheVar = argz.c;
        if (this.b.isCancelled()) {
            return;
        }
        try {
            asmb asmbVar = (asmb) albo.bQ(this.b);
            apzj a = asmbVar.a.a((aqvr) asmbVar.b, this.c);
            Object obj = asmbVar.b;
            this.e.g(new argn((argo) obj, a, ((argo) obj).b));
            this.a.d(new argm(this.d, 2), andi.a);
        } finally {
        }
    }
}
