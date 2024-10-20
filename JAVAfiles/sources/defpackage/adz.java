package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adz extends arpw implements arqw<ahq, cjn, arpe<? super arnb>, Object> {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ aeb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adz(aeb aebVar, arpe arpeVar) {
        super(3, arpeVar);
        this.c = aebVar;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((cjn) obj2).a;
        adz adzVar = new adz(this.c, (arpe) obj3);
        adzVar.d = (ahq) obj;
        adzVar.b = j;
        return adzVar.b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, ahq] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ?? r6 = this.d;
            long j = this.b;
            aeb aebVar = this.c;
            if (((ada) aebVar).c) {
                this.a = 1;
                if (aebVar.d(r6, j, this) == arplVar) {
                    return arplVar;
                }
            }
        }
        return arnb.a;
    }
}
