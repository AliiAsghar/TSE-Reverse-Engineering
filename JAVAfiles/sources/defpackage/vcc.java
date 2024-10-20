package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class vcc implements vcd {
    public final vax a;
    public final veo b;
    public final vbs c;
    public final Object d = new Object();
    public final Map e = new HashMap();
    public final mbl f;
    public final wpp g;
    private final anen h;
    private final mce i;
    private final wpp j;

    public vcc(anen anenVar, veo veoVar, vax vaxVar, vbs vbsVar, mbl mblVar, wpp wppVar, mce mceVar, wpp wppVar2) {
        this.h = anenVar;
        this.b = veoVar;
        this.i = mceVar;
        this.j = wppVar2;
        this.a = vaxVar;
        this.c = vbsVar;
        this.f = mblVar;
        this.g = wppVar;
    }

    @Override // defpackage.vcd
    public final akul a(vgq vgqVar) {
        return b(vgqVar, vdh.b());
    }

    public final akul b(vgq vgqVar, vdh vdhVar) {
        mbm b;
        akul q;
        String str = vdhVar.b.a;
        if (str == null) {
            b = mbw.a;
        } else {
            b = this.i.b(str);
        }
        mbm mbmVar = b;
        wpp wppVar = this.j;
        vdd vddVar = vdhVar.a;
        vgp b2 = vgqVar.b();
        int ordinal = b2.a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    q = this.c.a((vgm) b2).i(new uva(7), andi.a);
                } else {
                    throw new UnsupportedOperationException("unknown registration type ".concat(b2.toString()));
                }
            } else {
                q = this.a.q();
            }
            int i = 12;
            akul i2 = wppVar.Q(vddVar, c(vgqVar, q)).f(Throwable.class, new vbl(this, vgqVar, i, null), this.h).i(new vbn(vgqVar, i), andi.a);
            aktp.aa(i2, new vce(this, mbmVar, vdhVar, vgqVar, 1), this.h);
            return i2;
        }
        throw new UnsupportedOperationException("UNREGISTERED support not implemented");
    }

    public final akul c(vgq vgqVar, akul akulVar) {
        String str;
        if (vgqVar.b().a() == vgo.PHONE_NUMBER) {
            str = "RCS";
        } else {
            str = "Bugle";
        }
        return akulVar.i(new ukk((Object) this, str, (Object) vgqVar, 7), this.h).i(new vbl(this, vgqVar, 11, null), this.h);
    }
}
