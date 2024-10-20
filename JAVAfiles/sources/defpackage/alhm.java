package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alhm {
    public final Object a;
    public final Object b;

    public alhm(aegu aeguVar, aneo aneoVar) {
        this.b = aeguVar;
        this.a = aneoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.CharSequence, java.lang.Object] */
    public final void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append(((algs) this.b).a(entry.getKey()));
                sb.append((CharSequence) this.a);
                sb.append(((algs) this.b).a(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ((algs) this.b).c);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(((algs) this.b).a(entry2.getKey()));
                    sb.append((CharSequence) this.a);
                    sb.append(((algs) this.b).a(entry2.getValue()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void b(StringBuilder sb, Iterable iterable) {
        a(sb, iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, aegu] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture c(ancr ancrVar, alpt alptVar) {
        long a = this.b.a();
        HashSet<akpd> hashSet = new HashSet();
        Iterator<E> it = alptVar.iterator();
        while (it.hasNext()) {
            ?? r3 = this.a;
            akpe akpeVar = (akpe) it.next();
            akpeVar.getClass();
            ListenableFuture X = aktp.X(akto.c(new akdj(akpeVar, 17)), r3);
            akat.c(X, "Future Monitor failed", new Object[0]);
            hashSet.add(new akpd(akpeVar, X));
        }
        ListenableFuture X2 = aktp.X(akto.c(ancrVar), andi.a);
        ListenableFuture f = akec.f(X2, akto.k(new ujb(this, a, 5)), andi.a);
        ?? r0 = this.a;
        HashSet hashSet2 = new HashSet();
        for (akpd akpdVar : hashSet) {
            ListenableFuture n = aktp.ar(akpdVar.b, f, X2).n(new akiq(akpdVar, f, 10), r0);
            akat.c(n, "Future Monitor failed", new Object[0]);
            hashSet2.add(n);
        }
        atkn bV = albo.bV(hashSet2);
        int i = 16;
        return aktp.ar(X2, albo.bP(albo.bJ(bV.a(akto.k(new agug(i)), andi.a)), 10L, TimeUnit.SECONDS, this.a)).n(akto.c(new akdj(X2, i)), andi.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final Object d(ajwt ajwtVar) {
        Object obj;
        synchronized (this.b) {
            if (!this.b.containsKey(ajwtVar)) {
                ?? r1 = this.b;
                ngu nguVar = (ngu) this.a.b();
                nguVar.b = ajwtVar;
                r1.put(ajwtVar, new kqp((krv) nguVar.a, (ajwt) nguVar.b));
            }
            obj = this.b.get(ajwtVar);
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    public final aiwu e(aknt akntVar, agcp agcpVar) {
        albo.U(true, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        albo.U(true, "Custom IOExecutor should not be used with a BlockingSafeProtoDataStore config");
        Executor executor = akntVar.g;
        if (executor == null) {
            executor = (Executor) this.a.b();
        }
        ListenableFuture Y = aktp.Y(albo.bI(""), new ajzr(this, akntVar, 4, null), executor);
        aiwu ao = ahmc.ao(akntVar.a, Y, akntVar.b, aozs.a(), executor, akntVar.e, agcpVar);
        if (!akntVar.d.isEmpty()) {
            ao.d(new aiwk(akntVar.d, executor));
        }
        return ao;
    }

    public alhm(armf armfVar, aohs aohsVar) {
        this.a = armfVar;
        this.b = aohsVar;
    }

    public alhm(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public alhm(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public alhm(armf armfVar) {
        this.b = new HashMap();
        this.a = armfVar;
    }
}
