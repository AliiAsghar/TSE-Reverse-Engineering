package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qoz {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/conversation/deleter/ConversationDeleterPwqImpl");
    public final armf b;
    public final armf c;
    public final armf d;
    private final anen e;
    private final armf f;

    public qoz(anen anenVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.e = anenVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.f = armfVar4;
    }

    public final akul a(qoy qoyVar) {
        return aktp.ah(new nan(this, qoyVar, 18, null), this.e);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    public final void b(qoy qoyVar) {
        long j;
        if (qoyVar.e) {
            j = 0;
        } else {
            j = qoyVar.b;
        }
        uli uliVar = (uli) this.f.b();
        aozy createBuilder = ulx.a.createBuilder();
        String a2 = qoyVar.a.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        a2.getClass();
        ((ulx) apagVar).b = a2;
        int i = qoyVar.c.t;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ((ulx) apagVar2).e = i;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        ((ulx) apagVar3).c = j;
        int i2 = qoyVar.d.i;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        ((ulx) apagVar4).f = i2;
        boolean z = qoyVar.e;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        ((ulx) createBuilder.b).d = z;
        ((uof) uliVar.a.b()).a(upk.a("delete_conversation_handler", (ulx) createBuilder.s()));
    }
}
