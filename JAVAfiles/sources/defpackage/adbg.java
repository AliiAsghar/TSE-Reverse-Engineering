package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbg extends apyn {
    private final apyi b;

    public adbg(armf armfVar, armf armfVar2, apyi apyiVar) {
        super(armfVar2, new apyv(adbg.class), armfVar);
        this.b = apys.c(apyiVar);
    }

    @Override // defpackage.apyn
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        return albo.bI(adcx.d((adcc) obj));
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
