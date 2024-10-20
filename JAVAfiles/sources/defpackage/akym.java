package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akym implements akxm {
    public final akwy a;
    public final atii b;
    private final Optional c;
    private final Object d;
    private final Optional e;
    private final Executor f;

    public akym(atii atiiVar, Optional optional, Object obj, akwy akwyVar, Optional optional2, Executor executor) {
        this.b = atiiVar;
        this.c = optional;
        this.d = obj;
        this.a = akwyVar;
        this.e = optional2;
        this.f = executor;
    }

    @Override // defpackage.akwx
    public final Optional c() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.akxm
    public final alax d() {
        aozy createBuilder = alax.a.createBuilder();
        atii atiiVar = this.b;
        Object obj = atiiVar.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        Object obj2 = this.d;
        ((alax) createBuilder.b).b = (String) obj;
        int i = 17;
        Iterable iterable = (Iterable) Collection.EL.stream(atiiVar.c).map(new akyh(obj2, i)).filter(new adru(i)).map(new akyg(10)).collect(albo.l());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        alax alaxVar = (alax) createBuilder.b;
        apax apaxVar = alaxVar.d;
        if (!apaxVar.c()) {
            alaxVar.d = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, alaxVar.d);
        aozy builder = ((alax) createBuilder.s()).toBuilder();
        if (this.c.isPresent()) {
            String str = (String) this.c.get();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            ((alax) builder.b).c = str;
        }
        if (this.e.isPresent()) {
            aozy createBuilder2 = albj.a.createBuilder();
            Boolean bool = (Boolean) this.e.get();
            bool.booleanValue();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            albj albjVar = (albj) createBuilder2.b;
            albjVar.b = 1;
            albjVar.c = bool;
            if (!builder.b.isMutable()) {
                builder.u();
            }
            alax alaxVar2 = (alax) builder.b;
            albj albjVar2 = (albj) createBuilder2.s();
            albjVar2.getClass();
            apax apaxVar2 = alaxVar2.f;
            if (!apaxVar2.c()) {
                alaxVar2.f = apag.mutableCopy(apaxVar2);
            }
            alaxVar2.f.add(albjVar2);
        }
        return (alax) builder.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.function.Supplier] */
    @Override // defpackage.akxm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.akxn r9, defpackage.akmy r10) {
        /*
            r8 = this;
            java.util.Map r9 = r9.a
            java.util.Set r9 = r9.entrySet()
            j$.util.stream.Stream r9 = j$.util.Collection.EL.stream(r9)
            akyg r0 = new akyg
            r1 = 7
            r0.<init>(r1)
            akyg r1 = new akyg
            r2 = 8
            r1.<init>(r2)
            j$.util.stream.Collector r0 = j$.util.stream.Collectors.toMap(r0, r1)
            akyg r1 = new akyg
            r2 = 12
            r1.<init>(r2)
            j$.util.stream.Collector r0 = j$.util.stream.Collectors.collectingAndThen(r0, r1)
            java.lang.Object r9 = r9.collect(r0)
            java.util.Map r9 = (java.util.Map) r9
            atii r0 = r8.b     // Catch: defpackage.akyk -> Lb3
            java.lang.Object r1 = r0.b     // Catch: defpackage.akyk -> Lb3
            java.lang.Object r1 = defpackage.d$$ExternalSyntheticApiModelOutline0.m324m(r1)     // Catch: defpackage.akyk -> Lb3
            akxo r1 = (defpackage.akxo) r1     // Catch: defpackage.akyk -> Lb3
            java.lang.Object r0 = r0.c     // Catch: defpackage.akyk -> Lb3
            java.util.Iterator r0 = r0.iterator()     // Catch: defpackage.akyk -> Lb3
        L3c:
            boolean r2 = r0.hasNext()     // Catch: defpackage.akyk -> Lb3
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L74
            java.lang.Object r2 = r0.next()     // Catch: defpackage.akyk -> Lb3
            akyt r2 = (defpackage.akyt) r2     // Catch: defpackage.akyk -> Lb3
            java.lang.String r6 = r2.a     // Catch: defpackage.akyk -> Lb3
            java.lang.Object r6 = r9.get(r6)     // Catch: defpackage.akyk -> Lb3
            java.util.List r6 = (java.util.List) r6     // Catch: defpackage.akyk -> Lb3
            if (r6 == 0) goto L3c
            akys r7 = r2.c     // Catch: defpackage.akyk -> L5b
            r7.a(r1, r6)     // Catch: defpackage.akyk -> L5b
            goto L3c
        L5b:
            r9 = move-exception
            akyk r0 = new akyk     // Catch: defpackage.akyk -> Lb3
            java.lang.String r1 = "Failed to parse parameter '%s' from assistant because of failure: %s"
            java.lang.String r2 = r2.a     // Catch: defpackage.akyk -> Lb3
            java.lang.String r6 = r9.getMessage()     // Catch: defpackage.akyk -> Lb3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: defpackage.akyk -> Lb3
            r4[r5] = r2     // Catch: defpackage.akyk -> Lb3
            r4[r3] = r6     // Catch: defpackage.akyk -> Lb3
            java.lang.String r1 = java.lang.String.format(r1, r4)     // Catch: defpackage.akyk -> Lb3
            r0.<init>(r1, r9)     // Catch: defpackage.akyk -> Lb3
            throw r0     // Catch: defpackage.akyk -> Lb3
        L74:
            java.lang.Object r9 = r1.a()     // Catch: java.lang.IllegalStateException -> L9e defpackage.akyk -> Lb3
            akxr r0 = new akxr
            r0.<init>(r5)
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.d.m(r0)
            agpp r1 = new agpp
            r2 = 5
            r3 = 0
            r1.<init>(r8, r9, r2, r3)
            java.util.concurrent.Executor r9 = r8.f
            xpo r2 = new xpo
            r2.<init>(r0, r1, r9, r4)
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.d.m(r2)
            akyl r0 = new akyl
            r0.<init>(r8, r10)
            java.util.concurrent.Executor r10 = r8.f
            defpackage.albo.q(r9, r0, r10)
            return
        L9e:
            r9 = move-exception
            akyk r0 = new akyk     // Catch: defpackage.akyk -> Lb3
            java.lang.String r1 = "Failed to build Argument class because of failure: %s"
            java.lang.String r2 = r9.getMessage()     // Catch: defpackage.akyk -> Lb3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: defpackage.akyk -> Lb3
            r3[r5] = r2     // Catch: defpackage.akyk -> Lb3
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch: defpackage.akyk -> Lb3
            r0.<init>(r1, r9)     // Catch: defpackage.akyk -> Lb3
            throw r0     // Catch: defpackage.akyk -> Lb3
        Lb3:
            r9 = move-exception
            java.lang.String r0 = r9.getMessage()
            if (r0 == 0) goto Lc7
            java.lang.String r9 = r9.getMessage()
            aktp r0 = defpackage.akyu.a
            if (r0 == 0) goto Lc7
            java.lang.String r0 = "ActionCapability"
            android.util.Log.e(r0, r9)
        Lc7:
            r9 = 6
            r10.j(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akym.f(akxn, akmy):void");
    }

    @Override // defpackage.akxm
    public final /* synthetic */ void e() {
    }
}
