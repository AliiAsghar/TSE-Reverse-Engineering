package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jys extends arrp implements arqr {
    final /* synthetic */ jxu a;
    final /* synthetic */ boolean b;
    final /* synthetic */ jym c;
    final /* synthetic */ cas d;
    final /* synthetic */ jxt e;
    final /* synthetic */ aov f;
    final /* synthetic */ zj g;
    final /* synthetic */ cas h;
    final /* synthetic */ float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jys(jxu jxuVar, boolean z, jym jymVar, cas casVar, jxt jxtVar, aov aovVar, zj zjVar, cas casVar2, float f) {
        super(1);
        this.a = jxuVar;
        this.b = z;
        this.c = jymVar;
        this.d = casVar;
        this.e = jxtVar;
        this.f = aovVar;
        this.g = zjVar;
        this.h = casVar2;
        this.i = f;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aos aosVar = (aos) obj;
        aosVar.getClass();
        aor.a(aosVar, null, new cdj(1143991142, true, new jjs(this.c, 3)), 3);
        aor.a(aosVar, null, new cdj(507629341, true, new jjs(this.c, 4)), 3);
        kgk kgkVar = (kgk) this.d.a();
        if (!kgkVar.a.isEmpty()) {
            aor.a(aosVar, null, new cdj(-557483322, true, new jjs(kgkVar, 6)), 3);
        }
        aor.b(aosVar, kgkVar.a.size(), null, new cdj(744985368, true, new jle(kgkVar, 2)), 6);
        jym jymVar = this.c;
        jxu jxuVar = this.a;
        jpi jpiVar = new jpi(jymVar, jxuVar, 9);
        aosVar.b(jxuVar.a.b(), jpiVar, jyp.a, new cdj(302556975, true, new aeoc(this.e, this.c, this.f, this.g, 1)));
        if (this.b) {
            aor.a(aosVar, null, new cdj(-1085384895, true, new jjs(this.h, 5)), 3);
        }
        aor.a(aosVar, null, new cdj(2060716702, true, new jyr(this.i)), 3);
        return arnb.a;
    }
}
