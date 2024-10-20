package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxa {
    public static final alwo a = alwo.o("BugleBackup");
    private final uof b;

    public lxa(uof uofVar) {
        uofVar.getClass();
        this.b = uofVar;
    }

    public final void a(lwy lwyVar) {
        this.b.a(upk.a("MessagesRestoreWorkItemHandler", lwyVar));
    }

    public final void b(UUID uuid, int i) {
        uuid.getClass();
        ((alwl) a.g()).w("Queueing work to restore attachment workflowVersion:[%s] sessionId:[%s]", i, uuid);
        aozy createBuilder = lwy.a.createBuilder();
        createBuilder.getClass();
        lgc.k(yyb.bX(uuid), createBuilder);
        lgc.j(i, createBuilder);
        aozy createBuilder2 = lwx.a.createBuilder();
        createBuilder2.getClass();
        apag s = createBuilder2.s();
        s.getClass();
        lwx lwxVar = (lwx) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        lwy lwyVar = (lwy) createBuilder.b;
        lwyVar.d = lwxVar;
        lwyVar.c = 3;
        a(lgc.i(createBuilder));
    }

    public final void c(UUID uuid, int i) {
        uuid.getClass();
        ((alwl) a.g()).w("Queueing work to restore the database workflowVersion:[%s] sessionId:[%s]", i, uuid);
        aozy createBuilder = lwy.a.createBuilder();
        createBuilder.getClass();
        lgc.k(yyb.bX(uuid), createBuilder);
        lgc.j(i, createBuilder);
        aozy createBuilder2 = lws.a.createBuilder();
        createBuilder2.getClass();
        apag s = createBuilder2.s();
        s.getClass();
        lws lwsVar = (lws) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        lwy lwyVar = (lwy) createBuilder.b;
        lwyVar.d = lwsVar;
        lwyVar.c = 2;
        a(lgc.i(createBuilder));
    }

    public final void d(UUID uuid, lwr lwrVar) {
        uuid.getClass();
        lwrVar.getClass();
        ((alwl) a.g()).t("Queueing work to finalize restore [%s]", uuid);
        aozy createBuilder = lwy.a.createBuilder();
        createBuilder.getClass();
        lgc.k(yyb.bX(uuid), createBuilder);
        aozy createBuilder2 = lwt.a.createBuilder();
        createBuilder2.getClass();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        lwt lwtVar = (lwt) createBuilder2.b;
        lwtVar.b |= 1;
        lwtVar.c = lwrVar.p;
        apag s = createBuilder2.s();
        s.getClass();
        lwt lwtVar2 = (lwt) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        lwy lwyVar = (lwy) createBuilder.b;
        lwyVar.d = lwtVar2;
        lwyVar.c = 5;
        a(lgc.i(createBuilder));
    }

    public final void e(UUID uuid) {
        uuid.getClass();
        ((alwl) a.g()).t("Queueing work to notify listeners [%s]", uuid);
        aozy createBuilder = lwy.a.createBuilder();
        createBuilder.getClass();
        lgc.k(yyb.bX(uuid), createBuilder);
        aozy createBuilder2 = lwv.a.createBuilder();
        createBuilder2.getClass();
        apag s = createBuilder2.s();
        s.getClass();
        lwv lwvVar = (lwv) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        lwy lwyVar = (lwy) createBuilder.b;
        lwyVar.d = lwvVar;
        lwyVar.c = 4;
        a(lgc.i(createBuilder));
    }
}
