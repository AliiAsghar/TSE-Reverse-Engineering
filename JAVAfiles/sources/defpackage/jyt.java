package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyt extends arpw implements arqv {
    int a;
    /* synthetic */ int b;
    final /* synthetic */ jxt c;
    final /* synthetic */ jym d;
    final /* synthetic */ aov e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyt(jxt jxtVar, jym jymVar, aov aovVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = jxtVar;
        this.d = jymVar;
        this.e = aovVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jyt) c(Integer.valueOf(((Number) obj).intValue()), (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            int i2 = this.b;
            jxt jxtVar = this.c;
            this.a = 1;
            if (jxtVar.b(i2, this) == arplVar) {
                return arplVar;
            }
        }
        hwr.K(this.d, this.e);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        jyt jytVar = new jyt(this.c, this.d, this.e, arpeVar);
        jytVar.b = ((Number) obj).intValue();
        return jytVar;
    }
}
