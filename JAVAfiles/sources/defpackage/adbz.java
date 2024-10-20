package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbz extends apyn {
    private final apyi b;
    private final apyi c;

    public adbz(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2) {
        super(armfVar2, new apyv(adbz.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Optional ofNullable;
        List list = (List) obj;
        adcc adccVar = (adcc) list.get(0);
        yjr yjrVar = (yjr) list.get(1);
        Optional optional = adccVar.a;
        advp advpVar = adbs.a;
        if (optional.isPresent()) {
            Object obj2 = adccVar.a.get();
            String k = adwf.k(((adqu) adccVar.a.get()).c, yjrVar);
            if (!adwf.w(k)) {
                k = adwf.n(((adqu) obj2).c, yjrVar);
            }
            ofNullable = Optional.ofNullable(k);
        } else if (adccVar.b.isPresent()) {
            ofNullable = Optional.ofNullable(((adoz) adccVar.b.get()).o);
        } else {
            throw new IllegalArgumentException("Request doesn't not contain message or session!");
        }
        return albo.bI(ofNullable);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return albo.bF(this.b.d(), this.c.d());
    }
}
