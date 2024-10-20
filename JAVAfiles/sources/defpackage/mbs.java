package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbs implements mce, xzm, xzh {
    public static final xze a = xze.g("BugleUsageStatistics", "TimerEventLoggerImpl");
    public static final uuf b = uuh.c(uuh.b, "action_breakdown_timer_percent", 0.0d);
    public final armf d;
    public final xnv e;
    private final armf f;
    private final alhr g;
    private final armf h;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    private boolean i = false;

    public mbs(armf armfVar, armf armfVar2, xnv xnvVar, alhr alhrVar, armf armfVar3) {
        this.f = armfVar;
        this.d = armfVar2;
        this.e = xnvVar;
        this.g = alhrVar;
        this.h = armfVar3;
    }

    private final mbm p(String str, mbm mbmVar) {
        if (!this.i) {
            a.l("Clearcut loggings are disabled.");
            return mbw.a;
        }
        mbm mbmVar2 = (mbm) this.c.get(str);
        if (mbmVar2 != null) {
            return mbmVar2;
        }
        mbm mbmVar3 = (mbm) this.c.putIfAbsent(str, mbmVar);
        if (mbmVar3 != null) {
            return mbmVar3;
        }
        return mbmVar;
    }

    private static String q(String str, String str2) {
        xyl.f(TextUtils.isEmpty(str));
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return String.valueOf(str).concat(String.valueOf(str2));
    }

    @Override // defpackage.mce
    public final mbm a(String str, amdy amdyVar, String str2) {
        if (utw.a((Random) this.g.get(), b)) {
            String q = q(str, str2);
            return p(q, new mbp(this, str, amdyVar, q, this.e.a()));
        }
        return mbw.a;
    }

    @Override // defpackage.mce
    public final mbm b(String str) {
        return d(str, null, this.e.a());
    }

    @Override // defpackage.mce
    public final mbm c(String str, String str2) {
        return d(str, str2, this.e.a());
    }

    @Override // defpackage.mce
    public final mbm d(String str, String str2, long j) {
        String q = q(str, str2);
        return p(q, new mbr(this, str, q, j));
    }

    @Override // defpackage.mce
    public final void e(String str) {
        f(str, null);
    }

    @Override // defpackage.mce
    public final void f(String str, String str2) {
        this.c.remove(q(str, str2));
    }

    @Override // defpackage.mce
    public final void g() {
        h(null);
    }

    @Override // defpackage.mce
    public final void h(String str) {
        i(str, this.e.a() - 900000);
    }

    public final void i(String str, long j) {
        for (Map.Entry entry : this.c.entrySet()) {
            if (((mbm) entry.getValue()).a() < j) {
                xyo d = a.d();
                d.L("dropping timer", ((mbm) entry.getValue()).b());
                d.H("(age)");
                d.q();
                this.c.remove(entry.getKey(), entry.getValue());
            } else if (str != null && ((String) entry.getKey()).startsWith(str)) {
                xyo d2 = a.d();
                d2.z("dropping timer", entry.getValue());
                d2.H("(match)");
                d2.q();
                this.c.remove(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // defpackage.mce
    public final void j() {
        this.i = ((yep) this.f.b()).i("bugle_enable_analytics", true);
    }

    @Override // defpackage.xzm
    public final void k(String str, long j, long j2) {
        ((uub) this.h.b()).a();
        double doubleValue = ((Double) utw.u.e()).doubleValue();
        if (this.i && j >= j2 * doubleValue && str != null && str.startsWith("Bugle.")) {
            ((mbl) this.d.b()).g(str, j);
        }
        if (j <= j2) {
            xyo d = a.d();
            d.H(str);
            d.H("asyncTask took");
            d.G(j);
            d.q();
        }
    }

    @Override // defpackage.xzh
    public final void l(int i) {
        if (i == 15) {
            i(null, 0L);
        } else {
            g();
        }
    }

    @Override // defpackage.mce
    public final mbm m(int i, String str) {
        if (utw.a((Random) this.g.get(), b)) {
            String q = q("Bugle.DataModel.Action.UpdateConversationEncryptionStatusAction.ExecuteAction.DownloadAndProcessRemoteInstanceData.Latency", str);
            return p(q, new mbq(this, i, q, this.e.a()));
        }
        return mbw.a;
    }

    @Override // defpackage.mce
    public final void n(String str) {
        mbm mbmVar = (mbm) this.c.get(q(str, null));
        if (mbmVar != null) {
            mbmVar.c();
        }
    }

    @Override // defpackage.mce
    public final void o(String str, String str2) {
        mbm mbmVar = (mbm) this.c.get(q(str, str2));
        if (mbmVar != null) {
            mbmVar.c();
        }
    }
}
