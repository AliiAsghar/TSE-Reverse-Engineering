package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbi extends apyn {
    private final apyi b;

    public adbi(armf armfVar, armf armfVar2, apyi apyiVar) {
        super(armfVar2, new apyv(adbi.class), armfVar);
        this.b = apys.c(apyiVar);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Optional optional;
        adcc adccVar = (adcc) obj;
        Optional optional2 = adccVar.b;
        acyz acyzVar = adbf.a;
        if (optional2.isPresent() && adccVar.a.isEmpty()) {
            optional = Optional.ofNullable(((adrc) adccVar.b.get()).N);
        } else {
            optional = adccVar.a;
        }
        return albo.bI(optional);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
