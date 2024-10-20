package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vcf implements vcd {
    public final vby a;
    public final veo b;
    public final vbs c;
    public final mbl d;
    public final wpp e;
    private final anen f;
    private final Optional g;
    private final mce h;
    private final wpp i;

    public vcf(anen anenVar, veo veoVar, vby vbyVar, Optional optional, vbs vbsVar, mbl mblVar, wpp wppVar, mce mceVar, wpp wppVar2) {
        this.f = anenVar;
        this.b = veoVar;
        this.g = optional;
        this.h = mceVar;
        this.i = wppVar2;
        this.a = vbyVar;
        this.c = vbsVar;
        this.d = mblVar;
        this.e = wppVar;
    }

    private static boolean c(vgp vgpVar) {
        if (odx.a() && (vgpVar instanceof vgl) && Objects.equals(((vgl) vgpVar).a, "CMS")) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vcd
    public final akul a(vgq vgqVar) {
        mbm b;
        akul q;
        vdh b2 = vdh.b();
        String str = b2.b.a;
        if (str == null) {
            b = mbw.a;
        } else {
            b = this.h.b(str);
        }
        mbm mbmVar = b;
        wpp wppVar = this.i;
        vdd vddVar = b2.a;
        vgp b3 = vgqVar.b();
        int ordinal = b3.a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4) {
                        throw new UnsupportedOperationException("unknown registration type ".concat(b3.toString()));
                    }
                    if (c(b3)) {
                        this.g.isPresent();
                        q = ((vby) this.g.get()).k();
                    }
                } else {
                    q = this.c.a((vgm) b3).i(new uva(10), andi.a);
                }
                akul i = wppVar.Q(vddVar, b(vgqVar, q)).f(Throwable.class, new vbl(this, vgqVar, 14, null), this.f).i(new vbn(vgqVar, 13), andi.a);
                aktp.aa(i, new vce(this, mbmVar, b2, vgqVar, 0), this.f);
                return i;
            }
            q = this.a.q();
            akul i2 = wppVar.Q(vddVar, b(vgqVar, q)).f(Throwable.class, new vbl(this, vgqVar, 14, null), this.f).i(new vbn(vgqVar, 13), andi.a);
            aktp.aa(i2, new vce(this, mbmVar, b2, vgqVar, 0), this.f);
            return i2;
        }
        throw new UnsupportedOperationException("UNREGISTERED support not implemented");
    }

    public final akul b(vgq vgqVar, akul akulVar) {
        String str;
        vgp b = vgqVar.b();
        int ordinal = b.a().ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                str = "Bugle";
            } else if (c(b)) {
                str = "CMS";
            } else {
                str = "GDitto";
            }
        } else {
            str = "RCS";
        }
        return akulVar.i(new ukk((Object) this, str, (Object) vgqVar, 8), this.f).i(new vbl(this, vgqVar, 13, null), this.f);
    }
}
