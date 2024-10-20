package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiaw {
    public List A;
    public List B;
    public aibc C;
    public Integer D;
    public String E;
    public String F;
    public String G;
    public Double H;
    public List I;
    public List J;
    public List K;
    public Integer L;
    public Integer M;
    public Integer N;
    public LatLngBounds O;
    public Uri P;
    public Uri Q;
    public ahyt R;
    public aiaq S;
    public aiar T;
    public aiad U;
    public List V;
    public aiaf W;
    private aiav X;
    private aiav Y;
    private aiav Z;
    public String a;
    private aiav aa;
    private aiav ab;
    private aiav ac;
    private aiav ad;
    private aiav ae;
    private aiav af;
    private aiav ag;
    private aiav ah;
    private aiav ai;
    private aiav aj;
    private aiav ak;
    private aiav al;
    private aiav am;
    private aiav an;
    private aiav ao;
    private aiav ap;
    private aiav aq;
    private aiav ar;
    private aiav as;
    private aiav at;
    private aiav au;
    public String b;
    public String c;
    public String d;
    public ahyv e;
    public List f;
    public aiax g;
    public aiao h;
    public String i;
    public String j;
    public Integer k;
    public String l;
    public String m;
    public String n;
    public LatLng o;
    public LatLng p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public aiao v;
    public String w;
    public String x;
    public String y;
    public List z;

    public final aiba a() {
        aiba b = b();
        List list = b.f;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d.t(!TextUtils.isEmpty((String) it.next()), "Attributions must not contain null or empty values.");
            }
        }
        Integer num = b.G;
        if (num != null) {
            albo.R(alst.d(0, 4).a(num), "Price Level must not be out-of-range: %s to %s, but was: %s.", 0, 4, num);
        }
        Double d = b.K;
        if (d != null) {
            Double valueOf = Double.valueOf(1.0d);
            Double valueOf2 = Double.valueOf(5.0d);
            albo.R(alst.d(valueOf, valueOf2).a(d), "Rating must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, d);
        }
        Integer num2 = b.X;
        if (num2 != null) {
            albo.N(new alst(new almo(0), alml.a).a(num2), "User Ratings Total must not be < 0, but was: %s.", num2);
        }
        if (list != null) {
            this.f = alog.n(list);
        }
        List list2 = b.C;
        if (list2 != null) {
            this.z = alog.n(list2);
        }
        List list3 = b.E;
        if (list3 != null) {
            this.B = alog.n(list3);
        }
        List list4 = b.W;
        if (list4 != null) {
            this.K = alog.n(list4);
        }
        List list5 = b.M;
        if (list5 != null) {
            this.I = alog.n(list5);
        }
        List list6 = b.D;
        if (list6 != null) {
            this.A = alog.n(list6);
        }
        return b();
    }

    public final aiba b() {
        aiav aiavVar;
        aiav aiavVar2;
        aiav aiavVar3;
        aiav aiavVar4;
        aiav aiavVar5;
        aiav aiavVar6;
        aiav aiavVar7;
        aiav aiavVar8;
        aiav aiavVar9;
        aiav aiavVar10;
        aiav aiavVar11;
        aiav aiavVar12;
        aiav aiavVar13;
        aiav aiavVar14;
        aiav aiavVar15;
        aiav aiavVar16;
        aiav aiavVar17;
        aiav aiavVar18;
        aiav aiavVar19;
        aiav aiavVar20;
        aiav aiavVar21;
        aiav aiavVar22;
        aiav aiavVar23;
        aiav aiavVar24 = this.X;
        if (aiavVar24 != null && (aiavVar = this.Y) != null && (aiavVar2 = this.Z) != null && (aiavVar3 = this.aa) != null && (aiavVar4 = this.ab) != null && (aiavVar5 = this.ac) != null && (aiavVar6 = this.ad) != null && (aiavVar7 = this.ae) != null && (aiavVar8 = this.af) != null && (aiavVar9 = this.ag) != null && (aiavVar10 = this.ah) != null && (aiavVar11 = this.ai) != null && (aiavVar12 = this.aj) != null && (aiavVar13 = this.ak) != null && (aiavVar14 = this.al) != null && (aiavVar15 = this.am) != null && (aiavVar16 = this.an) != null && (aiavVar17 = this.ao) != null && (aiavVar18 = this.ap) != null && (aiavVar19 = this.aq) != null && (aiavVar20 = this.ar) != null && (aiavVar21 = this.as) != null && (aiavVar22 = this.at) != null && (aiavVar23 = this.au) != null) {
            return new ahzr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, aiavVar24, this.h, aiavVar, aiavVar2, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, aiavVar3, this.I, this.J, aiavVar4, aiavVar5, aiavVar6, aiavVar7, aiavVar8, aiavVar9, aiavVar10, aiavVar11, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, aiavVar12, this.R, this.S, this.T, this.U, aiavVar13, aiavVar14, aiavVar15, aiavVar16, aiavVar17, aiavVar18, aiavVar19, aiavVar20, aiavVar21, aiavVar22, aiavVar23, this.V, this.W);
        }
        StringBuilder sb = new StringBuilder();
        if (this.X == null) {
            sb.append(" curbsidePickup");
        }
        if (this.Y == null) {
            sb.append(" delivery");
        }
        if (this.Z == null) {
            sb.append(" dineIn");
        }
        if (this.aa == null) {
            sb.append(" reservable");
        }
        if (this.ab == null) {
            sb.append(" servesBeer");
        }
        if (this.ac == null) {
            sb.append(" servesBreakfast");
        }
        if (this.ad == null) {
            sb.append(" servesBrunch");
        }
        if (this.ae == null) {
            sb.append(" servesDinner");
        }
        if (this.af == null) {
            sb.append(" servesLunch");
        }
        if (this.ag == null) {
            sb.append(" servesVegetarianFood");
        }
        if (this.ah == null) {
            sb.append(" servesWine");
        }
        if (this.ai == null) {
            sb.append(" takeout");
        }
        if (this.aj == null) {
            sb.append(" wheelchairAccessibleEntrance");
        }
        if (this.ak == null) {
            sb.append(" outdoorSeating");
        }
        if (this.al == null) {
            sb.append(" liveMusic");
        }
        if (this.am == null) {
            sb.append(" menuForChildren");
        }
        if (this.an == null) {
            sb.append(" servesCocktails");
        }
        if (this.ao == null) {
            sb.append(" servesDessert");
        }
        if (this.ap == null) {
            sb.append(" servesCoffee");
        }
        if (this.aq == null) {
            sb.append(" goodForChildren");
        }
        if (this.ar == null) {
            sb.append(" allowsDogs");
        }
        if (this.as == null) {
            sb.append(" restroom");
        }
        if (this.at == null) {
            sb.append(" goodForGroups");
        }
        if (this.au == null) {
            sb.append(" goodForWatchingSports");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(aiav aiavVar) {
        if (aiavVar != null) {
            this.ar = aiavVar;
            return;
        }
        throw new NullPointerException("Null allowsDogs");
    }

    public final void d(aiav aiavVar) {
        if (aiavVar != null) {
            this.X = aiavVar;
            return;
        }
        throw new NullPointerException("Null curbsidePickup");
    }

    public final void e(aiav aiavVar) {
        if (aiavVar != null) {
            this.Y = aiavVar;
            return;
        }
        throw new NullPointerException("Null delivery");
    }

    public final void f(aiav aiavVar) {
        if (aiavVar != null) {
            this.Z = aiavVar;
            return;
        }
        throw new NullPointerException("Null dineIn");
    }

    public final void g(aiav aiavVar) {
        if (aiavVar != null) {
            this.aq = aiavVar;
            return;
        }
        throw new NullPointerException("Null goodForChildren");
    }

    public final void h(aiav aiavVar) {
        if (aiavVar != null) {
            this.at = aiavVar;
            return;
        }
        throw new NullPointerException("Null goodForGroups");
    }

    public final void i(aiav aiavVar) {
        if (aiavVar != null) {
            this.au = aiavVar;
            return;
        }
        throw new NullPointerException("Null goodForWatchingSports");
    }

    public final void j(aiav aiavVar) {
        if (aiavVar != null) {
            this.al = aiavVar;
            return;
        }
        throw new NullPointerException("Null liveMusic");
    }

    public final void k(aiav aiavVar) {
        if (aiavVar != null) {
            this.am = aiavVar;
            return;
        }
        throw new NullPointerException("Null menuForChildren");
    }

    public final void l(aiav aiavVar) {
        if (aiavVar != null) {
            this.ak = aiavVar;
            return;
        }
        throw new NullPointerException("Null outdoorSeating");
    }

    public final void m(aiav aiavVar) {
        if (aiavVar != null) {
            this.aa = aiavVar;
            return;
        }
        throw new NullPointerException("Null reservable");
    }

    public final void n(aiav aiavVar) {
        if (aiavVar != null) {
            this.as = aiavVar;
            return;
        }
        throw new NullPointerException("Null restroom");
    }

    public final void o(aiav aiavVar) {
        if (aiavVar != null) {
            this.ab = aiavVar;
            return;
        }
        throw new NullPointerException("Null servesBeer");
    }

    public final void p(aiav aiavVar) {
        if (aiavVar != null) {
            this.ac = aiavVar;
            return;
        }
        throw new NullPointerException("Null servesBreakfast");
    }

    public final void q(aiav aiavVar) {
        if (aiavVar != null) {
            this.ad = aiavVar;
            return;
        }
        throw new NullPointerException("Null servesBrunch");
    }

    public final void r(aiav aiavVar) {
        if (aiavVar != null) {
            this.an = aiavVar;
            return;
        }
        throw new NullPointerException("Null servesCocktails");
    }

    public final void s(aiav aiavVar) {
        if (aiavVar != null) {
            this.ap = aiavVar;
            return;
        }
        throw new NullPointerException("Null servesCoffee");
    }

    public final void t(aiav aiavVar) {
        if (aiavVar != null) {
            this.ao = aiavVar;
            return;
        }
        throw new NullPointerException("Null servesDessert");
    }

    public final void u(aiav aiavVar) {
        if (aiavVar != null) {
            this.ae = aiavVar;
            return;
        }
        throw new NullPointerException("Null servesDinner");
    }

    public final void v(aiav aiavVar) {
        if (aiavVar != null) {
            this.af = aiavVar;
            return;
        }
        throw new NullPointerException("Null servesLunch");
    }

    public final void w(aiav aiavVar) {
        if (aiavVar != null) {
            this.ag = aiavVar;
            return;
        }
        throw new NullPointerException("Null servesVegetarianFood");
    }

    public final void x(aiav aiavVar) {
        if (aiavVar != null) {
            this.ah = aiavVar;
            return;
        }
        throw new NullPointerException("Null servesWine");
    }

    public final void y(aiav aiavVar) {
        if (aiavVar != null) {
            this.ai = aiavVar;
            return;
        }
        throw new NullPointerException("Null takeout");
    }

    public final void z(aiav aiavVar) {
        if (aiavVar != null) {
            this.aj = aiavVar;
            return;
        }
        throw new NullPointerException("Null wheelchairAccessibleEntrance");
    }
}
