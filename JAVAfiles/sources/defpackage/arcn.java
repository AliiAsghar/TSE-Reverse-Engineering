package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arcn extends arbu {
    public final aqzx a;
    private final arau b;

    public arcn(arau arauVar, aqzx aqzxVar) {
        this.b = arauVar;
        this.a = aqzxVar;
    }

    @Override // defpackage.arbu
    protected final arau a() {
        return this.b;
    }

    @Override // defpackage.arbu, defpackage.aram
    public final araj b(aqux aquxVar, aqut aqutVar, aqrr aqrrVar, aqrx[] aqrxVarArr) {
        return new arcm(this, this.b.b(aquxVar, aqutVar, aqrrVar, aqrxVarArr));
    }
}
