package defpackage;

import android.content.Context;
import defpackage.agnc;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zer extends xcf {
    public static final alwo a = alwo.o("BugleStartup");
    public final Context b;
    public final anen c;
    public final armf d;
    public final xnv e;
    public final armf f;
    public final Optional g;
    private final armf h;
    private final armf i;
    private final armf k;
    private final armf l;

    public zer(Context context, armf armfVar, armf armfVar2, anen anenVar, armf armfVar3, armf armfVar4, xnv xnvVar, armf armfVar5, armf armfVar6, Optional optional) {
        this.b = context;
        this.h = armfVar;
        this.i = armfVar2;
        this.c = anenVar;
        this.k = armfVar3;
        this.d = armfVar4;
        this.e = xnvVar;
        this.l = armfVar5;
        this.f = armfVar6;
        this.g = optional;
    }

    @Override // defpackage.xny
    public final akrh a() {
        return aktp.e("PhoneAsyncAppCreateStartupTask");
    }

    @Override // defpackage.xcf
    public final akul b() {
        if (agnc.c.l) {
            ((agnc.a) akec.w(agnc.b, agnc.a.class)).Lc();
            if (((yjv) this.f.b()).e()) {
                this.l.b();
                acqo.b(this.b);
                acqo.a(this.b);
            }
            icm icmVar = (icm) this.k.b();
            icmVar.a(((ykw) this.i.b()).a(), ich.a(icmVar.a, new altx(icmVar.b)));
            lzq lzqVar = (lzq) this.h.b();
            int i = 13;
            return aktp.ah(new kut(lzqVar, i), lzqVar.n).i(new ytu(this, 12), this.c).i(new ytu(this, i), this.c);
        }
        throw new IllegalStateException("do not use the bugle database on non-primary processes");
    }

    @Override // defpackage.xck
    public final boolean fI() {
        return false;
    }
}
