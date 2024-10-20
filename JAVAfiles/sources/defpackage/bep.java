package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bep extends arrp implements arqr<dra, arnb> {
    final /* synthetic */ dqv a;
    final /* synthetic */ byn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bep(dqv dqvVar, byn bynVar) {
        super(1);
        this.a = dqvVar;
        this.b = bynVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        float b = dra.b(((dra) obj).a);
        dqv dqvVar = this.a;
        this.b.h(new dri((dqvVar.eo(b) << 32) | (dqvVar.eo(dra.a(r0)) & 4294967295L)));
        return arnb.a;
    }
}
