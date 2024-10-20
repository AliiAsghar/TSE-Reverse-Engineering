package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qoi extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientDeletedSyncHandler");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    private final arwe g;
    private final armf h;
    private final armf i;

    public qoi(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        this.g = arweVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.h = armfVar3;
        this.i = armfVar4;
        this.d = armfVar5;
        this.e = armfVar6;
        this.f = armfVar7;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        armf armfVar = this.h;
        une a2 = unf.a();
        a2.d((int) ((Number) armfVar.b()).longValue());
        a2.g(gry.EXPONENTIAL);
        Object b = this.i.b();
        b.getClass();
        a2.h(((Number) b).longValue());
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("ContactRecipientDeletedSyncHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        qoj qojVar = (qoj) apbtVar;
        qojVar.getClass();
        c = qjh.c(this.g, arpj.a, arwf.a, new qoh(this, unsVar, qojVar, null));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = qoj.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }
}
