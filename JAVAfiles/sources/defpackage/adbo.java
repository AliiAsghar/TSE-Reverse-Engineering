package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbo extends apyn {
    private final apyi b;

    public adbo(armf armfVar, armf armfVar2, apyi apyiVar) {
        super(armfVar2, new apyv(adbo.class), armfVar);
        this.b = apys.c(apyiVar);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Optional aC;
        adcc adccVar = (adcc) obj;
        acyz acyzVar = adbf.a;
        if (!adaa.t()) {
            aC = Optional.empty();
        } else if (adccVar.b.isEmpty()) {
            aC = Optional.empty();
        } else {
            Object obj2 = adccVar.b.get();
            if (((adoz) obj2).p) {
                aC = Optional.empty();
            } else {
                aC = ((adrc) obj2).aC();
            }
        }
        return albo.bI(aC);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
