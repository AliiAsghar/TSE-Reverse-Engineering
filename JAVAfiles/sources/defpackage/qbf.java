package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbf implements qby {
    private final xnv a;

    public qbf(xnv xnvVar) {
        this.a = xnvVar;
    }

    @Override // defpackage.qby
    public final /* bridge */ /* synthetic */ qfl a(Object obj, qbs qbsVar) {
        aozy createBuilder = qfl.a.createBuilder();
        String str = ((qez) obj).d;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfl qflVar = (qfl) createBuilder.b;
        str.getClass();
        qflVar.b |= 1;
        qflVar.c = str;
        aozy createBuilder2 = qfc.a.createBuilder();
        apct b = apds.b(this.a.f().toEpochMilli());
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qfc qfcVar = (qfc) createBuilder2.b;
        b.getClass();
        qfcVar.c = b;
        qfcVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfl qflVar2 = (qfl) createBuilder.b;
        qfc qfcVar2 = (qfc) createBuilder2.s();
        qfcVar2.getClass();
        qflVar2.j = qfcVar2;
        qflVar2.b |= 128;
        return (qfl) createBuilder.s();
    }
}
