package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class airh {
    public final Object a;
    public final Object b;
    public Object c;
    private final Object d;
    private final Object e;

    public airh(Context context, aoda aodaVar, abnr abnrVar, aboj abojVar) {
        this.d = context;
        this.a = aodaVar;
        this.e = abnrVar;
        this.b = abojVar;
    }

    public final void a(aodd aoddVar) {
        if (Log.isLoggable("StickerLogger", 3)) {
            Log.d("StickerLogger", "log: ".concat(String.valueOf(String.valueOf(aoddVar))));
        }
        Object obj = this.e;
        String ag = albo.ag((String) this.c);
        airi airiVar = new airi();
        aozy createBuilder = aodb.a.createBuilder();
        Object obj2 = this.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aodb aodbVar = (aodb) createBuilder.b;
        aodbVar.c = (aoda) obj2;
        aodbVar.b |= 1;
        aozy createBuilder2 = aodd.a.createBuilder(aoddVar);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aodd) createBuilder2.b).c = ag;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aodb aodbVar2 = (aodb) createBuilder.b;
        aodd aoddVar2 = (aodd) createBuilder2.s();
        aoddVar2.getClass();
        aodbVar2.d = aoddVar2;
        aodbVar2.b |= 4;
        abnq g = ((abnr) obj).g(createBuilder.s());
        g.j = "EXPRESSION";
        g.q = aglt.b((Context) this.d, airiVar);
        g.c();
    }

    public final void b(String str, aodc aodcVar, boolean z) {
        int i;
        aozy createBuilder = aodd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        if (true != z) {
            i = 11;
        } else {
            i = 10;
        }
        apag apagVar = createBuilder.b;
        ((aodd) apagVar).b = aode.a(i);
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        str.getClass();
        ((aodd) apagVar2).d = str;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        ((aodd) createBuilder.b).e = aodcVar.a();
        a((aodd) createBuilder.s());
    }

    public final void c(int i) {
        aozy createBuilder = aodd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aodd) createBuilder.b).b = aode.a(i);
        a((aodd) createBuilder.s());
    }

    public final void d(int i) {
        aozy createBuilder = aodd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((aodd) apagVar).b = aode.a(43);
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aodd) createBuilder.b).f = a.aj(i);
        a((aodd) createBuilder.s());
    }

    public final void e(String str) {
        aozy createBuilder = aodd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((aodd) apagVar).b = aode.a(16);
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        aodd aoddVar = (aodd) createBuilder.b;
        str.getClass();
        aoddVar.d = str;
        a((aodd) createBuilder.s());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final agym f() {
        ?? r0 = this.c;
        if (r0 != 0) {
            Object obj = this.d;
            return new agym(r0, (eng) obj, new aiim(((alob) this.a).g(), ((alob) this.b).g(), ((alob) this.e).g()));
        }
        throw new IllegalStateException("callback executor was not provided");
    }

    public airh() {
        this.d = eng.STARTED;
        if (!ahaw.a) {
            boolean z = ahbh.a;
        }
        this.a = new alob();
        this.b = new alob();
        this.e = new alob();
    }
}
