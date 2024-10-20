package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pvn implements armf {
    public final adje a;
    public final adtn b;
    public final qxr c;

    public pvn(qxr qxrVar, adje adjeVar, adtn adtnVar) {
        this.c = qxrVar;
        this.a = adjeVar;
        this.b = adtnVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [armf, java.lang.Object] */
    @Override // defpackage.armf, defpackage.arme
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pvp b() {
        pvm pvmVar = new pvm();
        Object b = this.c.a.b();
        b.getClass();
        pvmVar.c((Duration) qxr.e(((Number) b).longValue()).orElseGet(new ngq(this, 11)));
        Object b2 = this.c.d.b();
        b2.getClass();
        pvmVar.b((Duration) qxr.e(((Number) b2).longValue()).orElseGet(new ngq(this, 12)));
        return pvmVar.a();
    }
}
