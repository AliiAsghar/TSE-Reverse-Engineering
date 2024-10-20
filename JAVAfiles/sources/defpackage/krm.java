package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krm implements rrr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public krm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rrr
    public final rrq a(qei qeiVar) {
        if (this.b != 0) {
            krg krgVar = (krg) this.a;
            krv krvVar = krgVar.a;
            return new rrq(krgVar.b.h, krvVar.cF, krvVar.dA, (arpi) krvVar.dj.b(), qeiVar);
        }
        krv krvVar2 = ((kru) this.a).a;
        return new rrq(krvVar2.dw, krvVar2.cF, krvVar2.dA, (arpi) krvVar2.dj.b(), qeiVar);
    }
}
