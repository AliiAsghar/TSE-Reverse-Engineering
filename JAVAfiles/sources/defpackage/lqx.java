package defpackage;

import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqx {
    public static final utz a = uuh.n(uuh.b, "disable_popups_for_hawkeye", false);
    public static final xze b = xze.g("Bugle", "PopupHost");
    public static final long c = TimeUnit.DAYS.toMillis(1);
    public final armf d;
    public final xnv e;
    public final armf f;
    public lqv[] g = new lqv[0];
    public int h = -1;
    public int i;
    public lqv j;
    public final ahiy k;
    private final armf l;

    public lqx(armf armfVar, xnv xnvVar, ahiy ahiyVar, armf armfVar2, armf armfVar3) {
        this.d = armfVar;
        this.e = xnvVar;
        this.k = ahiyVar;
        this.f = armfVar2;
        this.l = armfVar3;
    }

    public final akul a(boolean z) {
        if (!z) {
            return aktp.ag(-1);
        }
        int i = 0;
        if (((Boolean) ((Optional) this.l.b()).map(new lcw(11)).orElse(false)).booleanValue()) {
            b.l("Suppressing Popup for retail mode device");
            return aktp.ag(-1);
        }
        int i2 = this.h;
        if (i2 == -100) {
            this.h = -1;
            return aktp.ag(-1);
        }
        if (i2 != -1) {
            this.h = -1;
            return this.g[i2].b().h(new lqw(i2, i), andi.a);
        }
        int i3 = this.i;
        lqv[] lqvVarArr = this.g;
        if (i3 >= lqvVarArr.length) {
            this.i = 0;
            return aktp.ag(-1);
        }
        return lqvVarArr[i3].b().i(new lso(this, 1), andi.a);
    }

    public final void b() {
        this.j = null;
    }

    public final boolean c() {
        if (this.j != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [armf, java.lang.Object] */
    public final void d(int i) {
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        if (!c()) {
            int i2 = 0;
            while (true) {
                lqv[] lqvVarArr = this.g;
                if (i2 < lqvVarArr.length) {
                    if (i == lqvVarArr[i2].h() && !c()) {
                        b.l("triggerPopup : triggering new popup ".concat(lgb.q(i)));
                        this.h = i2;
                        this.k.q(aktp.ag(null), "POPUP_KEY");
                        return;
                    }
                    i2++;
                } else {
                    b.l("triggerPopup : Popup name " + lgb.q(i) + " does not match with any valid popups");
                    return;
                }
            }
        } else {
            b.l("triggerPopup : Can't show " + lgb.q(i) + " popup as another popup is showing");
            lpg lpgVar = (lpg) this.f.b();
            this.j.getClass();
            ((mbl) lpgVar.a.b()).e("Bugle.HomeScreen.PopupHost.Trigger.Suppressed", i - 1);
            ((mbl) lpgVar.a.b()).e("Bugle.HomeScreen.PopupHost.Trigger.Suppressor", r1.h() - 1);
        }
    }
}
