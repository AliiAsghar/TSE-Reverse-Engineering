package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class araz extends araw {
    final /* synthetic */ arbc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public araz(arbd arbdVar, arbc arbcVar) {
        super(arbdVar.a);
        this.a = arbcVar;
    }

    @Override // defpackage.araw
    public final void a() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            arbc arbcVar = this.a;
            synchronized (arbcVar) {
                if (arbcVar.b.isEmpty()) {
                    arbcVar.b = null;
                    arbcVar.a = true;
                    return;
                } else {
                    list = arbcVar.b;
                    arbcVar.b = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
