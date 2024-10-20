package defpackage;

import j$.util.Map;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wxe implements wwn {
    private final Map a = new LinkedHashMap();
    private final Map b = new LinkedHashMap();
    private final Map c = new LinkedHashMap();
    private final Map d = new LinkedHashMap();

    public wxe() {
        ascy.a(yyb.db(wxb.a.createBuilder()).h());
    }

    private final adiv A(wwm wwmVar) {
        return (adiv) Map.EL.getOrDefault(this.b, wwmVar, new adiw(""));
    }

    @Override // defpackage.wwn
    public final wwz a() {
        aozy createBuilder = wwz.a.createBuilder();
        createBuilder.getClass();
        wcm.x(adom.n(A(wwm.a)).a, createBuilder);
        wcm.A(adom.n(A(wwm.b)).a, createBuilder);
        wcm.y(adom.n(A(wwm.c)).a, createBuilder);
        return wcm.w(createBuilder);
    }

    @Override // defpackage.wwn
    public final akul b() {
        akul ag = aktp.ag(m());
        ag.getClass();
        return ag;
    }

    @Override // defpackage.wwn
    public final akul c() {
        akul ag = aktp.ag(n());
        ag.getClass();
        return ag;
    }

    @Override // defpackage.wwn
    public final akul d() {
        akul ag = aktp.ag(o());
        ag.getClass();
        return ag;
    }

    @Override // defpackage.wwn
    public final akul e(wwm wwmVar) {
        wwmVar.getClass();
        akul ag = aktp.ag(h(wwmVar));
        ag.getClass();
        return ag;
    }

    @Override // defpackage.wwn
    public final Optional f() {
        return h(wwm.a);
    }

    @Override // defpackage.wwn
    public final /* bridge */ /* synthetic */ Optional g(int i, boolean z) {
        adiv adivVar = (adiv) this.d.get(new adix(i));
        if (adivVar != null) {
            return Optional.of(adivVar);
        }
        Optional i2 = i(i);
        if (i2.isEmpty()) {
            return Optional.empty();
        }
        String str = ((wxb) i2.get()).c;
        str.getClass();
        return Optional.of(new adiw(str));
    }

    @Override // defpackage.wwn
    public final Optional h(wwm wwmVar) {
        wxb wxbVar;
        wwmVar.getClass();
        adiv adivVar = (adiv) this.b.get(wwmVar);
        if (adivVar != null) {
            wxbVar = (wxb) this.a.get(adivVar);
        } else {
            wxbVar = null;
        }
        return Optional.ofNullable(wxbVar);
    }

    @Override // defpackage.wwn
    public final Optional j(adiv adivVar) {
        adivVar.getClass();
        return Optional.ofNullable(this.a.get(adivVar));
    }

    @Override // defpackage.wwn
    public final Object k(arpe arpeVar) {
        return aqjn.aE(this.a.values());
    }

    @Override // defpackage.wwn
    public final Object l(wwm wwmVar, arpe arpeVar) {
        return h(wwmVar).orElse(null);
    }

    @Override // defpackage.wwn
    public final Set m() {
        return aqjn.aE(this.a.keySet());
    }

    @Override // defpackage.wwn
    public final Set n() {
        return aqjn.aE(this.a.keySet());
    }

    @Override // defpackage.wwn
    public final Set o() {
        return aqjn.aE(this.a.values());
    }

    @Override // defpackage.wwn
    public final Set p() {
        return aqjn.aE(this.a.values());
    }

    @Override // defpackage.wwn
    public final Set q(adiv adivVar) {
        adivVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.d.entrySet()) {
            if (d.F((adiv) entry.getValue(), adivVar)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        if (keySet.isEmpty()) {
            Optional j = j(adivVar);
            if (j.isEmpty()) {
                return arnx.a;
            }
            return aqjn.e(new adix(((wxb) j.get()).d));
        }
        return keySet;
    }

    @Override // defpackage.wwn
    public final /* bridge */ /* synthetic */ boolean r(int i, int i2) {
        Integer num = (Integer) this.c.get(Integer.valueOf(i));
        if (num != null && num.intValue() == i2) {
            return true;
        }
        Integer num2 = (Integer) this.c.get(Integer.valueOf(i2));
        if (num2 != null && num2.intValue() == i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wwn
    public final /* bridge */ /* synthetic */ boolean s(int i) {
        Set aE = aqjn.aE(this.a.values());
        ArrayList arrayList = new ArrayList(aqjn.J(aE, 10));
        Iterator it = aE.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((wxb) it.next()).d));
        }
        return arrayList.contains(Integer.valueOf(i));
    }

    @Override // defpackage.wwn
    public final boolean t() {
        return true;
    }

    @Override // defpackage.wwn
    public final Object u() {
        return n();
    }

    @Override // defpackage.wwn
    public final Object v() {
        return aqjn.aE(this.a.values());
    }

    @Override // defpackage.wwn
    public final Object w(adiv adivVar) {
        String str;
        adivVar.getClass();
        wxb wxbVar = (wxb) this.a.get(adivVar);
        if (wxbVar != null) {
            str = wxbVar.p;
        } else {
            str = null;
        }
        return Optional.ofNullable(str).orElse(null);
    }

    @Override // defpackage.wwn
    public final Object x(adiv adivVar) {
        return this.a.get(adivVar);
    }

    @Override // defpackage.wwn
    public final Object y(int i) {
        return i(i).orElse(null);
    }

    @Override // defpackage.wwn
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final Optional i(int i) {
        Object obj;
        Iterator it = aqjn.aE(this.a.values()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((wxb) obj).d == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return Optional.ofNullable(obj);
    }
}
