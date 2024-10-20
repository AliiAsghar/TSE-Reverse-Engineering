package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgf extends arrp implements arqz {
    final /* synthetic */ obj a;
    final /* synthetic */ ovn b;
    final /* synthetic */ ovq c;
    final /* synthetic */ khl d;
    final /* synthetic */ jat e;
    final /* synthetic */ iji f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgf(obj objVar, ovn ovnVar, ovq ovqVar, jat jatVar, khl khlVar, iji ijiVar) {
        super(6);
        this.a = objVar;
        this.b = ovnVar;
        this.c = ovqVar;
        this.e = jatVar;
        this.d = khlVar;
        this.f = ijiVar;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    @Override // defpackage.arqz
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        aeoo aeooVar;
        boolean z;
        aenr aenrVar = (aenr) obj;
        aeom aeomVar = (aeom) obj2;
        jts jtsVar = (jts) obj3;
        jkz jkzVar = (jkz) obj4;
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        boolean booleanValue2 = ((Boolean) obj6).booleanValue();
        aenrVar.getClass();
        aeomVar.getClass();
        jtsVar.getClass();
        if (booleanValue) {
            aeooVar = aeoo.b;
        } else {
            aeooVar = aeoo.a;
        }
        aeoo aeooVar2 = aeooVar;
        boolean a = this.a.a();
        Object e = ((utz) yig.N.get()).e();
        e.getClass();
        boolean booleanValue3 = ((Boolean) e).booleanValue();
        ovn ovnVar = this.b;
        ovq ovqVar = this.c;
        jat jatVar = this.e;
        ?? r8 = jatVar.e;
        boolean a2 = ovnVar.a();
        boolean a3 = ovqVar.a();
        if (((ovh) r8.b()).a() && ((ovj) jatVar.b.b()).a()) {
            z = true;
        } else {
            z = false;
        }
        return new jgc(new aeoq(aenrVar, aeomVar, jtsVar.b, aeooVar2, brg.a, booleanValue2, new aeop(a, booleanValue3, a2, true, z, a3), 16), jtsVar.a, new ghu(this.d, 5, (boolean[]) null), this.f.c, jkzVar);
    }
}
