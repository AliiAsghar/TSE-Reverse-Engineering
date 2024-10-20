package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbm extends apyn {
    private final apyi b;
    private final apyi c;

    public adbm(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2) {
        super(armfVar2, new apyv(adbm.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, aegu] */
    @Override // defpackage.apyn
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        Optional optional = (Optional) list.get(0);
        adqg adqgVar = (adqg) list.get(1);
        if (((Boolean) adbf.b.a()).booleanValue() && optional.isPresent()) {
            wcv wcvVar = (wcv) optional.get();
            aozy createBuilder = wcr.a.createBuilder();
            wbk wbkVar = wcvVar.d;
            if (wbkVar == null) {
                wbkVar = wbk.a;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            wcr wcrVar = (wcr) apagVar;
            wbkVar.getClass();
            wcrVar.e = wbkVar;
            wcrVar.b = 1 | wcrVar.b;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            wcr wcrVar2 = (wcr) apagVar2;
            wcrVar2.d = wcvVar;
            wcrVar2.c = 2;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            wcr wcrVar3 = (wcr) createBuilder.b;
            wcrVar3.b |= 8;
            wcrVar3.h = 0;
            apct j = aotl.j(adqgVar.c.f());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wcr wcrVar4 = (wcr) createBuilder.b;
            j.getClass();
            wcrVar4.f = j;
            wcrVar4.b |= 2;
            return adqgVar.g((wcr) createBuilder.s());
        }
        return albo.bI(wcs.a);
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        return albo.bF(this.b.d(), this.c.d());
    }
}
