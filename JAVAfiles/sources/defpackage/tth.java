package defpackage;

import android.text.TextUtils;
import com.google.android.rcs.client.profile.RcsProfileService;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tth extends xcf implements ajoa {
    public final apwt b;
    public final armf c;
    public final armf d;
    public final anen e;
    public final apwt f;
    public final armf g;
    public final armf h;
    public final ttj i;
    private final armf l;
    private final armf m;
    private final armf n;
    private final anen o;
    private final armf p;
    private final armf q;
    private boolean r;
    private final AtomicBoolean s = new AtomicBoolean(false);
    private static final String k = RcsProfileService.class.getName();
    public static final xze a = xze.g("BugleEtouffee", "E2eeStartupTask");

    public tth(apwt apwtVar, apwt apwtVar2, armf armfVar, armf armfVar2, ttj ttjVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, anen anenVar, anen anenVar2, armf armfVar8, armf armfVar9) {
        this.b = apwtVar;
        this.f = apwtVar2;
        this.m = armfVar;
        this.c = armfVar2;
        this.l = armfVar4;
        this.i = ttjVar;
        this.n = armfVar3;
        this.g = armfVar5;
        this.h = armfVar6;
        this.d = armfVar7;
        this.e = anenVar;
        this.o = anenVar2;
        this.p = armfVar8;
        this.q = armfVar9;
    }

    private final void e(String str) {
        ttj.a.o("Ensuring state machine consistency");
        ttj ttjVar = this.i;
        int i = 17;
        byte[] bArr = null;
        akul i2 = ((vbs) ttjVar.c.b()).d(str, 7).h(new rgh(i), ttjVar.l).i(new jab(i), ttjVar.l).i(new tsm(ttjVar, str, 10, bArr), ttjVar.l).i(new tsm(this, str, 7, bArr), this.e).i(new tsm(this, str, 8, bArr), this.e);
        akul i3 = ((vbs) this.m.b()).d(str, 6).h(new rgh(14), this.o).i(new jab(16), this.o);
        yyb.aO(aktp.an(i3, i2).h(new imh((Object) this, i3, (Object) str, (Object) i2, 5), andi.a), "BugleEtouffee", "Failed to schedule prekey upload.");
    }

    @Override // defpackage.xny
    public final akrh a() {
        return aktp.e("E2eeStartupTask");
    }

    @Override // defpackage.xcf
    public final akul b() {
        return aktp.ah(new rui(this, 7), this.e);
    }

    public final synchronized void d() {
        if (((okg) this.q.b()).a()) {
            if (!this.s.getAndSet(true)) {
                Set e = ((xtj) this.p.b()).e();
                if (e.isEmpty()) {
                    a.q("No identities to perform prekey checking for.");
                    ((mbl) this.n.b()).e("Bugle.Etouffee.StartupTask.Failure.Reason", 5);
                }
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    e(((qei) it.next()).d);
                }
            }
        } else if (!this.r) {
            String str = (String) ((vbu) this.l.b()).e().map(new tgn(18)).orElse("");
            if (TextUtils.isEmpty(str)) {
                a.q("Skip prekey checking because MSISDN is empty.");
            } else {
                this.r = true;
                e(str);
            }
        }
    }

    @Override // defpackage.ajoa
    public final void fH(String str) {
        akrh e = aktp.e("E2eeStartupTask#handleServiceConnected");
        try {
            if (k.equals(str)) {
                this.b.b();
                aktp.ah(new rui(this, 6), this.e).k(qiu.b(), this.e);
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.xck
    public final boolean fI() {
        return true;
    }

    @Override // defpackage.ajoa
    public final void c(String str) {
    }

    @Override // defpackage.ajoa
    public final void fG(String str, ajnz ajnzVar) {
    }
}
