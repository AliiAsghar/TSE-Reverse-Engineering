package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arlz extends arlv {
    private final AtomicInteger l;
    private aqtx m;

    public arlz(aqtr aqtrVar) {
        super(aqtrVar);
        this.l = new AtomicInteger(new Random().nextInt());
        this.m = new aqtq(aqtt.a);
    }

    private final aqtx h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((arlt) it.next()).d);
        }
        return new arly(arrayList, this.l);
    }

    private final void i(aqsd aqsdVar, aqtx aqtxVar) {
        if (aqsdVar == this.k && aqtxVar.equals(this.m)) {
            return;
        }
        this.h.f(aqsdVar, aqtxVar);
        this.k = aqsdVar;
        this.m = aqtxVar;
    }

    @Override // defpackage.arlv
    protected final arlt f(Object obj) {
        return new arlx(this, obj, this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arlv
    public final void g() {
        ArrayList arrayList = new ArrayList();
        for (arlt arltVar : this.g) {
            if (arltVar.c == aqsd.READY) {
                arrayList.add(arltVar);
            }
        }
        if (arrayList.isEmpty()) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                aqsd aqsdVar = ((arlt) it.next()).c;
                aqsd aqsdVar2 = aqsd.CONNECTING;
                if (aqsdVar == aqsdVar2 || aqsdVar == aqsd.IDLE) {
                    i(aqsdVar2, new aqtq(aqtt.a));
                    return;
                }
            }
            i(aqsd.TRANSIENT_FAILURE, h(this.g));
            return;
        }
        i(aqsd.READY, h(arrayList));
    }
}
