package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjg implements wih {
    private wiz a = wiz.TOGGLE_STATE_UNSPECIFIED;
    private final Map b = new LinkedHashMap();
    private final Map c = new LinkedHashMap();

    public wjg() {
        new LinkedHashMap();
    }

    @Override // defpackage.wih
    public final wiz a() {
        return this.a;
    }

    @Override // defpackage.wih
    public final wja b(adiv adivVar) {
        return (wja) Map.EL.getOrDefault(this.b, adivVar, wja.PER_SIM_TOGGLE_STATE_UNSPECIFIED);
    }

    @Override // defpackage.wih
    public final akgr c() {
        return new wjf(1);
    }

    @Override // defpackage.wih
    public final akgr d() {
        return new wjf(0);
    }

    @Override // defpackage.wih
    public final akgr e(enh enhVar) {
        enhVar.getClass();
        return new wjf(0);
    }

    @Override // defpackage.wih
    public final akul f(adiv adivVar) {
        this.c.put(adivVar, Integer.valueOf(((Number) Map.EL.getOrDefault(this.c, adivVar, 0)).intValue() + 1));
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }

    @Override // defpackage.wih
    public final akul g(adiv adivVar, wja wjaVar) {
        wjaVar.getClass();
        l(adivVar, wjaVar);
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }

    @Override // defpackage.wih
    public final akul h(wiz wizVar) {
        wizVar.getClass();
        m(wizVar);
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }

    @Override // defpackage.wih
    public final Object i(arpe arpeVar) {
        return this.a;
    }

    @Override // defpackage.wih
    public final void j() {
        Collection values = this.b.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (((wja) it.next()) == wja.PER_SIM_TOGGLE_STATE_ENABLED) {
                    return;
                }
            }
        }
        this.a = wiz.TOGGLE_STATE_AUTOMATICALLY_DISABLED;
    }

    @Override // defpackage.wih
    public final void l(adiv adivVar, wja wjaVar) {
        wjaVar.getClass();
        this.b.put(adivVar, wjaVar);
    }

    @Override // defpackage.wih
    public final void m(wiz wizVar) {
        wizVar.getClass();
        this.a = wizVar;
    }

    @Override // defpackage.wih
    public final boolean n(adiv adivVar) {
        if (Map.EL.getOrDefault(this.b, adivVar, wja.PER_SIM_TOGGLE_STATE_UNSPECIFIED) == wja.PER_SIM_TOGGLE_STATE_ENABLED) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wih
    public final boolean o() {
        return this.a.equals(wiz.TOGGLE_STATE_ENABLED);
    }

    @Override // defpackage.wih
    public final boolean p(adiv adivVar) {
        if (b(adivVar) == wja.PER_SIM_TOGGLE_STATE_PROVISIONING_RULE_DISABLED) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wih
    public final void k() {
    }
}
