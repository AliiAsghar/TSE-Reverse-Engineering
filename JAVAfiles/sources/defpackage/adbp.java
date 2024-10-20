package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbp extends apyn {
    private final apyi b;
    private final apyi c;

    public adbp(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2) {
        super(armfVar2, new apyv(adbp.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
    }

    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Optional empty;
        List list = (List) obj;
        adcc adccVar = (adcc) list.get(0);
        yjr yjrVar = (yjr) list.get(1);
        Optional optional = adccVar.b;
        acyz acyzVar = adbf.a;
        if (optional.isPresent() && !((adrc) adccVar.b.get()).F) {
            empty = Optional.ofNullable(((adoz) adccVar.b.get()).o);
        } else if (adccVar.a.isPresent()) {
            Object obj2 = adccVar.a.get();
            String k = adwf.k(((adqu) adccVar.a.get()).c, yjrVar);
            if (!adwf.w(k)) {
                k = adwf.n(((adqu) obj2).c, yjrVar);
            }
            empty = Optional.ofNullable(k);
        } else {
            empty = Optional.empty();
        }
        return albo.bI(empty);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return albo.bF(this.b.d(), this.c.d());
    }
}
