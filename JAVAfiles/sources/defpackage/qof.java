package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qof extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientChangeSyncHandler");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    private final arwe j;
    private final armf k;
    private final armf l;

    public qof(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        this.j = arweVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.k = armfVar3;
        this.l = armfVar4;
        this.d = armfVar5;
        this.e = armfVar6;
        this.f = armfVar7;
        this.g = armfVar8;
        this.h = armfVar9;
        this.i = armfVar10;
    }

    public static final boolean j(qog qogVar) {
        int i = qogVar.d;
        if (i > 0 && i == qogVar.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        armf armfVar = this.k;
        une a2 = unf.a();
        a2.d((int) ((Number) armfVar.b()).longValue());
        a2.g(gry.EXPONENTIAL);
        Object b = this.l.b();
        b.getClass();
        a2.h(((Number) b).longValue());
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("ContactRecipientChangeSyncHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        qog qogVar = (qog) apbtVar;
        qogVar.getClass();
        c = qjh.c(this.j, arpj.a, arwf.a, new qoe(qogVar, this, unsVar, null));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = qog.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }
}
