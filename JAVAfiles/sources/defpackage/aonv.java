package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aonv extends aoon {
    final /* synthetic */ aoon a;

    public aonv(aoon aoonVar) {
        this.a = aoonVar;
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        ArrayList arrayList = new ArrayList();
        aoroVar.l();
        while (aoroVar.r()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(aoroVar)).longValue()));
        }
        aoroVar.n();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        aorpVar.e();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.a.b(aorpVar, Long.valueOf(atomicLongArray.get(i)));
        }
        aorpVar.g();
    }
}
