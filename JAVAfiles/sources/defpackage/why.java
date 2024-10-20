package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class why implements whs {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcsdata/carriertos/CarrierTosDataServiceImpl");
    public static final akfc b = new akgc("explicit_carrier_tos_data_source_key");
    public final wul c;
    public final arwe d;
    public final arpi e;
    public final armf f;
    public final armf g;
    public final armf h;
    private final Context i;
    private final armf j;
    private final armf k;

    public why(Context context, wul wulVar, arwe arweVar, arpi arpiVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        context.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.i = context;
        this.c = wulVar;
        this.d = arweVar;
        this.e = arpiVar;
        this.f = armfVar;
        this.j = armfVar2;
        this.g = armfVar3;
        this.k = armfVar4;
        this.h = armfVar5;
    }

    @Override // defpackage.whs
    public final akgr a(String str) {
        str.getClass();
        return new whv(this, str, 0);
    }

    @Override // defpackage.whs
    public final akul b() {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new gcb(this, (arpe) null, 4));
        return c;
    }

    @Override // defpackage.whs
    public final akul c() {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new wht(this, null));
        return c;
    }

    @Override // defpackage.whs
    public final akul d() {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new wio(this, (arpe) null, 1));
        return c;
    }

    @Override // defpackage.whs
    public final akul e(adiv adivVar) {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new vpi(adivVar, this, (arpe) null, 8));
        return c;
    }

    @Override // defpackage.whs
    public final void f(adiv adivVar) {
        qjh.l(this.d, null, new vpi(this, adivVar, (arpe) null, 9, (char[]) null), 3);
    }

    @Override // defpackage.whs
    public final void g(adiv adivVar, acun acunVar) {
        acunVar.getClass();
        qjh.l(this.d, null, new qka(this, adivVar, acunVar, (arpe) null, 20), 3);
    }

    @Override // defpackage.whs
    public final void h(adiv adivVar, acun acunVar) {
        acunVar.getClass();
        this.c.m(new whg(new kjs(adivVar, acunVar, 17, null), 7));
    }

    @Override // defpackage.whs
    public final void i(adiv adivVar, boolean z) {
        this.c.m(new whg(new whx(adivVar, z, 0), 6));
    }

    @Override // defpackage.whs
    public final boolean j(adiv adivVar) {
        return p((wie) this.c.l()).containsKey(adivVar);
    }

    @Override // defpackage.whs
    public final int k(adiv adivVar) {
        adivVar.getClass();
        whj whjVar = (whj) this.k.b();
        int aT = a.aT(((whl) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((whc) whjVar.d.l()).n), adom.n(adivVar).a, whl.a)).b);
        if (aT == 0) {
            return 1;
        }
        return aT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.adiv r10, java.lang.String r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.why.l(adiv, java.lang.String, arpe):java.lang.Object");
    }

    public final Object m(arpe arpeVar) {
        return this.c.c(arpeVar);
    }

    public final Object n(adiv adivVar, arpe arpeVar) {
        return arro.q(this.e, new whw(this, adivVar, null, 2, null), arpeVar);
    }

    public final Object o(adiv adivVar, arpe arpeVar) {
        Object F = arro.F(((whj) this.k.b()).m(adom.n(adivVar).a, 2), arpeVar);
        if (F == arpl.a) {
            return F;
        }
        return arnb.a;
    }

    public final java.util.Map p(wie wieVar) {
        java.util.Map unmodifiableMap = DesugarCollections.unmodifiableMap(wieVar.d);
        unmodifiableMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(aqjn.i(unmodifiableMap.size()));
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            linkedHashMap.put(new adiw((String) key), entry.getValue());
        }
        return linkedHashMap;
    }
}
