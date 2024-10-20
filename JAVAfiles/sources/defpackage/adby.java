package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adby extends apyn {
    private final apyi b;

    public adby(armf armfVar, armf armfVar2, apyi apyiVar) {
        super(armfVar2, new apyv(adby.class), armfVar);
        this.b = apys.c(apyiVar);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Optional aC;
        adcc adccVar = (adcc) obj;
        advp advpVar = adbs.a;
        if (!adaa.t()) {
            aC = Optional.empty();
        } else {
            d.t(adccVar.b.isPresent(), "Session is not present");
            d.t(!((adoz) adccVar.b.get()).p, "Session is originating");
            aC = ((adrc) adccVar.b.get()).aC();
        }
        return albo.bI(aC);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
