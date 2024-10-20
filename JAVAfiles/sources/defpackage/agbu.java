package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbu extends arpw implements arqv {
    int a;
    final /* synthetic */ agbv b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbu(agbv agbvVar, boolean z, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.b = agbvVar;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agbu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            agbv agbvVar = this.b;
            agbt agbtVar = new agbt(agbvVar, this.c, this.d, null);
            this.a = 1;
            if (agbvVar.c.c("KeyboardDataPersistenceProtoDataStore#saveHeightToDataStore", agbtVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new agbu(this.b, this.c, this.d, arpeVar);
    }
}
