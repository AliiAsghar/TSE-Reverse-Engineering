package defpackage;

import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class mdy {
    private final mdz a;
    private final Executor b;
    public final armf c;

    /* JADX INFO: Access modifiers changed from: protected */
    public mdy(armf armfVar, mdz mdzVar, Executor executor) {
        this.c = armfVar;
        this.a = mdzVar;
        this.b = executor;
    }

    public abstract BiConsumer a();

    public final akul k(Supplier supplier) {
        return aktp.ai(new haw(this, supplier, 16), this.b);
    }

    public final amfq l(apbt apbtVar) {
        return m(apbtVar, Function$CC.identity());
    }

    public final amfq m(apbt apbtVar, Function function) {
        Object obj;
        Object apply;
        obj = this.a.c().get();
        apply = function.apply((apbs) obj);
        apbs apbsVar = (apbs) apply;
        a().accept(apbsVar, apbtVar);
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp a = this.a.a();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = a.dg;
        amfrVar.b |= 1;
        this.a.b().accept(amfqVar, apbsVar);
        return amfqVar;
    }

    public final void n(Supplier supplier) {
        ((aoia) this.c.b()).f(new mau(this, supplier, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(Supplier supplier, Function function) {
        ((aoia) this.c.b()).f(new mun(this, supplier, function, 1));
    }
}
