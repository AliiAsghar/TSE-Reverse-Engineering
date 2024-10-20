package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axg extends arrp implements arqw<Integer, Integer, Boolean, Boolean> {
    final /* synthetic */ dob a;
    final /* synthetic */ boolean b;
    final /* synthetic */ doj c;
    final /* synthetic */ bfb d;
    final /* synthetic */ ayd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axg(dob dobVar, boolean z, doj dojVar, bfb bfbVar, ayd aydVar) {
        super(3);
        this.a = dobVar;
        this.b = z;
        this.c = dojVar;
        this.d = bfbVar;
        this.e = aydVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        if (!booleanValue) {
            intValue = this.a.b(intValue);
        }
        if (!booleanValue) {
            intValue2 = this.a.b(intValue2);
        }
        boolean z = false;
        if (this.b && (intValue != djc.e(this.c.b) || intValue2 != djc.a(this.c.b))) {
            if (Math.min(intValue, intValue2) >= 0 && Math.max(intValue, intValue2) <= this.c.a.a()) {
                if (!booleanValue && intValue != intValue2) {
                    this.d.j(true);
                } else {
                    this.d.k();
                }
                ayd aydVar = this.e;
                doj dojVar = this.c;
                aydVar.q.a(new doj(dojVar.a, djd.a(intValue, intValue2)));
                z = true;
            } else {
                this.d.k();
            }
        }
        return Boolean.valueOf(z);
    }
}
