package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxd extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/restore/pwq/MessagesRestoreWorkItemHandler");
    public final lva b;
    public final armf c;
    public final armf d;
    public final alwo e;
    public final lgg f;
    private final arwe g;

    public lxd(arwe arweVar, lva lvaVar, lgg lggVar, armf armfVar, armf armfVar2) {
        arweVar.getClass();
        lvaVar.getClass();
        lggVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.g = arweVar;
        this.b = lvaVar;
        this.f = lggVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = alwo.o("BugleBackup");
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        return unf.a().a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("MessagesRestoreWorkItemHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        lwy lwyVar = (lwy) apbtVar;
        lwyVar.getClass();
        c = qjh.c(this.g, arpj.a, arwf.a, new lxb(this, lwyVar, null));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = lwy.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }
}
