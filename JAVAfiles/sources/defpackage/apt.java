package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apt extends arrp implements arqw<Integer, Integer, arqr<? super cvc.a, ? extends arnb>, cuf> {
    final /* synthetic */ asb a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apt(asb asbVar, long j, int i, int i2) {
        super(3);
        this.a = asbVar;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int i = intValue + this.c;
        int i2 = intValue2 + this.d;
        asb asbVar = this.a;
        long j = this.b;
        return asbVar.et(dqt.c(j, i), dqt.b(j, i2), arnw.a, (arqr) obj3);
    }
}
