package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoey implements aogn, aogm {
    private final Executor c;
    private final Map b = new HashMap();
    public Queue a = new ArrayDeque();

    public aoey(Executor executor) {
        this.c = executor;
    }

    public final synchronized Set a() {
        throw null;
    }

    @Override // defpackage.aogn
    public final void b(Class cls, asqc asqcVar) {
        c(cls, this.c, asqcVar);
    }

    public final synchronized void c(Class cls, Executor executor, asqc asqcVar) {
        aode.aq(asqcVar);
        aode.aq(executor);
        if (!this.b.containsKey(cls)) {
            this.b.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.b.get(cls)).put(asqcVar, executor);
    }
}
