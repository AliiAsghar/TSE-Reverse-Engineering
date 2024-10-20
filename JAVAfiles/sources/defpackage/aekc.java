package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aekc extends arrp implements arqv {
    final /* synthetic */ amt a;
    final /* synthetic */ aeiy b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aekc(amt amtVar, aeiy aeiyVar, long j, long j2, int i) {
        super(2);
        this.a = amtVar;
        this.b = aeiyVar;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        amt amtVar = this.a;
        aeiy aeiyVar = this.b;
        long j = this.c;
        aeke.i(amtVar, aeiyVar, j, this.d, (bwj) obj, bzh.a(this.e | 1));
        return arnb.a;
    }
}
