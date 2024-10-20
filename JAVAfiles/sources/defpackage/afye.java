package defpackage;

import android.app.Activity;
import android.os.Bundle;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afye implements afxy, ageo {
    static final /* synthetic */ artm[] a;
    public static final alvi b;
    public final agak c;
    public final agdq d;
    public final ascd e;
    public final ascd f;
    public final ascd g;
    public final ascd h;
    public final agdo i;
    public final asai j;
    public final arsn k;
    private final ageo l;
    private final arqg m;
    private final arml n;
    private final ascd o;
    private final ascd p;
    private final asai q;
    private final afyb r;
    private final agcp s;

    static {
        arrr arrrVar = new arrr(afye.class, "activeEntryPoint", "getActiveEntryPoint()Lcom/google/android/libraries/compose/ui/entrypoint/ComposeEntryPoint;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
        b = alvi.m("com/google/android/libraries/compose/ui/HugoManagerImpl");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [armf, java.lang.Object] */
    public afye(Activity activity, agak agakVar, agcp agcpVar, apwt apwtVar, apwt apwtVar2, arwe arweVar, ageo ageoVar, da daVar, arqg arqgVar, agdq agdqVar) {
        da daVar2;
        this.c = agakVar;
        this.s = agcpVar;
        this.l = ageoVar;
        this.m = arqgVar;
        this.d = agdqVar;
        armd.a(new afww(apwtVar, 14));
        this.n = armd.a(new afww(apwtVar2, 15));
        ascd a2 = ascy.a(agdp.d);
        this.e = a2;
        ascd a3 = ascy.a(agaq.d);
        this.f = a3;
        ascd a4 = ascy.a(agfg.a);
        this.g = a4;
        ascd a5 = ascy.a(agfa.a);
        this.o = a5;
        ascd a6 = ascy.a(0);
        this.h = a6;
        ascd a7 = ascy.a(null);
        this.p = a7;
        asai a8 = asar.a(new jdn(a4, a7, new jdy((arpe) null, 7, (byte[][]) null), 17, null));
        this.q = a8;
        this.j = arrn.R(a2, a3, a8, a5, a6, new afyd(this, null));
        if (activity instanceof cj) {
            cj cjVar = (cj) activity;
            cjVar.N().c(new agaf(1));
            if (daVar == null) {
                daVar2 = cjVar.a();
            } else {
                daVar2 = daVar;
            }
            agdq agdqVar2 = new agdq(agdqVar.a, agdqVar.b, agdqVar.c, new adoj(this, 16), agdqVar.e, agdqVar.f, agdqVar.g, agdqVar.h, agdqVar.j, agdqVar.k, agdqVar.m, agdqVar.n);
            afya afyaVar = new afya(this, 0);
            anca ancaVar = (anca) agcpVar.b.b();
            ancaVar.getClass();
            aday adayVar = (aday) agcpVar.a.b();
            adayVar.getClass();
            aday adayVar2 = (aday) agcpVar.c.b();
            adayVar2.getClass();
            this.i = new agdo(ancaVar, adayVar, adayVar2, daVar2, arqgVar, agdqVar2, agakVar, this, afyaVar);
            arrn.J(arweVar, null, null, new afmg(this, (arpe) null, 13), 3);
            this.k = new afyc(this);
            this.r = new afyb(this, 0);
            return;
        }
        throw new IllegalStateException("HugoManager requires " + activity.getLocalClassName() + " to extend FragmentActivity.");
    }

    public static /* synthetic */ void q(afye afyeVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = afyeVar.c.c((agaq) afyeVar.f.c());
        }
        if ((i3 & 2) != 0) {
            i2 = afyeVar.i.a((agdp) afyeVar.e.c());
        }
        ascd ascdVar = afyeVar.h;
        agdp agdpVar = (agdp) afyeVar.e.c();
        agaq agaqVar = agaq.a;
        int ordinal = agdpVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        i2 = afyeVar.c.b();
                    } else {
                        throw new armm();
                    }
                } else {
                    i2 = Math.max(i, i2);
                }
            } else {
                i2 += i;
            }
        }
        ascdVar.f(Integer.valueOf(i2));
    }

    private final agem r(agek agekVar, Bundle bundle) {
        agai c = this.i.c(agekVar);
        if (c != null) {
            c.ak(bundle);
        } else {
            agae agaeVar = (agae) ((Map) this.n.a()).get(agekVar);
            if (agaeVar != null) {
                c = agaeVar.a(bundle);
            } else {
                Objects.toString(agekVar);
                throw new IllegalStateException("Cannot find a factory for screen category ".concat(String.valueOf(agekVar)));
            }
        }
        return (agem) c;
    }

    @Override // defpackage.ageo
    public final void a(agek agekVar, int i, Duration duration) {
        agekVar.getClass();
        ageo ageoVar = this.l;
        if (ageoVar != null) {
            ageoVar.a(agekVar, i, duration);
        }
        this.o.f(new agey(i, duration));
    }

    @Override // defpackage.ageo
    public final void b(agek agekVar, int i, Duration duration) {
        agekVar.getClass();
        this.o.f(new agez(i, duration));
        ageo ageoVar = this.l;
        if (ageoVar != null) {
            ageoVar.b(agekVar, i, duration);
        }
        this.o.f(new agfb(i));
    }

    @Override // defpackage.afxy
    public final agdp c() {
        return (agdp) this.e.c();
    }

    @Override // defpackage.afxy
    public final void d() {
        this.c.k(this.r);
        this.i.e();
    }

    @Override // defpackage.afxy
    public final void e() {
        this.i.g();
    }

    @Override // defpackage.afxy
    public final void f() {
        this.c.n(this.r);
        this.i.h();
    }

    @Override // defpackage.afxy
    public final void g() {
        this.c.g();
        agdo agdoVar = this.i;
        if (agdo.p(agdoVar)) {
            agdq agdqVar = agdoVar.c;
            agak agakVar = agdoVar.d;
            aged agedVar = agdoVar.f;
            int a2 = agdqVar.a();
            int a3 = agakVar.a();
            agedVar.j(arrn.r(arrn.u(agedVar.b(), a3, arrn.r(a2, a3)), ((Number) agedVar.g.c()).intValue()));
        }
    }

    @Override // defpackage.afxy
    public final void h() {
        afkq afkqVar = (afkq) this.m.a();
        afkqVar.a.g();
        afkqVar.b.e();
    }

    @Override // defpackage.afxy
    public final void i(Bundle bundle) {
        agdo agdoVar;
        agdp agdpVar;
        agem c;
        arng arngVar = new arng(agek.k);
        while (true) {
            agdoVar = this.i;
            if (!arngVar.hasNext()) {
                break;
            }
            agem c2 = agdoVar.c((agek) arngVar.next());
            if (c2 != null) {
                agdoVar.f(c2);
                if (agdoVar.c.n) {
                    agdoVar.f.g(c2);
                }
            }
        }
        if (agdoVar.c.j) {
            Object obj = bundle.get("current_screen_category");
            if (obj != null && (c = agdoVar.c((agek) obj)) != null) {
                agdoVar.n(c);
            }
            Object obj2 = bundle.get("current_screen_state");
            Integer num = null;
            if (obj2 instanceof agdp) {
                agdpVar = (agdp) obj2;
            } else {
                agdpVar = null;
            }
            if (agdpVar != null) {
                agdoVar.o(agdpVar);
            }
            Integer valueOf = Integer.valueOf(bundle.getInt("current_rendered_height", 0));
            int intValue = valueOf.intValue();
            if (agdoVar.c.h || intValue > 0) {
                num = valueOf;
            }
            if (num != null) {
                agdoVar.f.i(arrn.s(num.intValue(), agdoVar.c.a()), false);
            }
        }
    }

    @Override // defpackage.afxy
    public final void j(Bundle bundle) {
        agek agekVar;
        agdo agdoVar = this.i;
        agem d = agdoVar.d();
        if (d != null) {
            agekVar = d.aM();
        } else {
            agekVar = null;
        }
        bundle.putSerializable("current_screen_category", agekVar);
        bundle.putSerializable("current_screen_state", agdoVar.b());
        bundle.putInt("current_rendered_height", agdoVar.f.b());
    }

    @Override // defpackage.afxy
    public final void k(agek agekVar) {
        agekVar.getClass();
        ((alvg) b.g().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "open", 337, "HugoManagerImpl.kt")).t("Opening directly %s", agekVar);
        this.o.f(agfa.a);
        this.i.k(r(agekVar, new Bundle()));
    }

    @Override // defpackage.afxy
    public final void l(int i) {
        ((alvg) b.g().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "openShortcut", 344, "HugoManagerImpl.kt")).t("Opening directly %s", agek.e);
        agek agekVar = agek.e;
        afxi afxiVar = new afxi(Integer.valueOf(i));
        Bundle bundle = new Bundle();
        Integer num = afxiVar.a;
        if (num != null) {
            num.intValue();
            bundle.putInt("auto_launch_shortcut", afxiVar.a.intValue());
        }
        agem r = r(agekVar, bundle);
        if (r.br()) {
            r.getClass();
            ((afxh) r).aW(i);
        }
        this.i.k(r);
    }

    @Override // defpackage.afxy
    public final void m(Iterable iterable, agek agekVar, String str) {
        iterable.getClass();
        ((alvg) b.g().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "openWithSearch", 363, "HugoManagerImpl.kt")).t("Opening directly with search %s", iterable);
        agek agekVar2 = agek.d;
        afvy afvyVar = new afvy(aqjn.ax(iterable), agekVar, str);
        Bundle bundle = new Bundle();
        List list = afvyVar.a;
        ArrayList<String> arrayList = new ArrayList<>(aqjn.J(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((agek) it.next()).name());
        }
        bundle.putStringArrayList("categories", arrayList);
        bundle.putString("initial_search_term", afvyVar.c);
        agek agekVar3 = afvyVar.b;
        if (agekVar3 != null) {
            bundle.putInt("initial_screen", agekVar3.ordinal());
        }
        agem r = r(agekVar2, bundle);
        r.getClass();
        afvx afvxVar = (afvx) r;
        afvxVar.e = this.p;
        this.i.k(afvxVar);
        if (agekVar != null && afvxVar.br()) {
            if (!this.d.m || this.p.c() != agekVar) {
                afvxVar.q(agekVar);
            }
            if (((afwa) afvxVar.bj()).e && str != null) {
                afwt afwtVar = afvxVar.c;
                if (afwtVar == null) {
                    arro.b("searchController");
                    afwtVar = null;
                }
                afwtVar.j(str);
            }
        }
    }

    @Override // defpackage.afxy
    public final void n(agek agekVar, agen agenVar) {
        agekVar.getClass();
        this.i.g.put(agekVar, agenVar);
    }

    @Override // defpackage.afxy
    public final boolean o() {
        agdo agdoVar = this.i;
        agdp b2 = agdoVar.b();
        agaq agaqVar = agaq.a;
        if (b2.ordinal() != 3) {
            agem d = agdoVar.d();
            if (d != null && d.gE()) {
                return true;
            }
            agdoVar.g();
            return true;
        }
        return false;
    }

    public final agcc p(agaq agaqVar) {
        int c = this.c.c(agaqVar);
        agaq agaqVar2 = agaq.a;
        int ordinal = agaqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return agbx.a;
                    }
                    throw new armm();
                }
                return new agby(c);
            }
            return new agca(c, this.c.a());
        }
        return new agbz(c);
    }
}
