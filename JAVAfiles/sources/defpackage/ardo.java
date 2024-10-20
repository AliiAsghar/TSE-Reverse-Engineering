package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ardo extends aqrs {
    public final String b;
    final /* synthetic */ ardr c;
    public final AtomicReference a = new AtomicReference(ardr.e);
    private final aqrs d = new ardk(this);

    public ardo(ardr ardrVar, String str) {
        this.c = ardrVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.aqrs
    public final aqru a(aqux aquxVar, aqrr aqrrVar) {
        if (this.a.get() != ardr.e) {
            return c(aquxVar, aqrrVar);
        }
        ardr ardrVar = this.c;
        ardrVar.m.execute(new arbg(this, 19));
        if (this.a.get() != ardr.e) {
            return c(aquxVar, aqrrVar);
        }
        if (this.c.B.get()) {
            return new ardl();
        }
        ardn ardnVar = new ardn(this, aqsm.k(), aquxVar, aqrrVar);
        ardr ardrVar2 = this.c;
        ardrVar2.m.execute(new ardm(this, ardnVar, 0));
        return ardnVar;
    }

    @Override // defpackage.aqrs
    public final String b() {
        return this.b;
    }

    public final aqru c(aqux aquxVar, aqrr aqrrVar) {
        aqtd aqtdVar = (aqtd) this.a.get();
        if (aqtdVar == null) {
            return this.d.a(aquxVar, aqrrVar);
        }
        if (aqtdVar instanceof arec) {
            areb b = ((arec) aqtdVar).b.b(aquxVar);
            if (b != null) {
                aqrrVar = aqrrVar.e(areb.a, b);
            }
            return this.d.a(aquxVar, aqrrVar);
        }
        return new arde(aqtdVar, this.d, this.c.k, aquxVar, aqrrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(aqtd aqtdVar) {
        Collection collection;
        aqtd aqtdVar2 = (aqtd) this.a.get();
        this.a.set(aqtdVar);
        if (aqtdVar2 == ardr.e && (collection = this.c.x) != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((ardn) it.next()).j();
            }
        }
    }
}
