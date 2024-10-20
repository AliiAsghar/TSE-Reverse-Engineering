package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqg extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        ArrayList arrayList = new ArrayList();
        aoroVar.l();
        while (aoroVar.r()) {
            try {
                arrayList.add(Integer.valueOf(aoroVar.c()));
            } catch (NumberFormatException e) {
                throw new aook(e);
            }
        }
        aoroVar.n();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        aorpVar.e();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            aorpVar.k(r6.get(i));
        }
        aorpVar.g();
    }
}
