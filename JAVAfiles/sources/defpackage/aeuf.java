package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeuf extends arpw implements arqv {
    int a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeuf(long j, arpe arpeVar) {
        super(2, arpeVar);
        this.b = j;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aeuf) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            long j = this.b;
            this.a = 1;
            if (arwi.m(j, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new aeuf(this.b, arpeVar);
    }
}
