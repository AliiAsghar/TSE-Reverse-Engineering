package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wbc extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/messaging/handler/PostIncomingMessageToChatApiHandler");
    public final vzh b;
    public final qco c;
    private final armf d;
    private final armf e;
    private final arwe f;

    public wbc(qco qcoVar, armf armfVar, armf armfVar2, arwe arweVar, vzh vzhVar) {
        qcoVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        this.c = qcoVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = arweVar;
        this.b = vzhVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        armf armfVar = this.d;
        une a2 = unf.a();
        a2.d((int) ((Number) armfVar.b()).longValue());
        Object b = this.e.b();
        b.getClass();
        a2.h(((Number) b).longValue());
        a2.g(gry.EXPONENTIAL);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("PostIncomingMessageToChatApiHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        qfo qfoVar = (qfo) apbtVar;
        qfoVar.getClass();
        c = qjh.c(this.f, arpj.a, arwf.a, new wbb(qfoVar, this, null));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = qfo.b.getParserForType();
        parserForType.getClass();
        return parserForType;
    }
}
