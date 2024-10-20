package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aow extends arpw implements arqv<ahv, arpe<? super arnb>, Object> {
    final /* synthetic */ aov a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aow(aov aovVar, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.a = aovVar;
        this.b = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aow) c((ahv) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        this.a.m(this.b);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new aow(this.a, this.b, arpeVar);
    }
}
