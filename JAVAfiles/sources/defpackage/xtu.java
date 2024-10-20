package defpackage;

import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtu implements xtl {
    private final armf a;
    private final pop b;
    private final znj c;

    public xtu(armf armfVar, znj znjVar, pop popVar) {
        znjVar.getClass();
        popVar.getClass();
        this.a = armfVar;
        this.c = znjVar;
        this.b = popVar;
    }

    @Override // defpackage.xtl
    public final Object a(Set set, arpe arpeVar) {
        if (!this.b.a()) {
            xfw xfwVar = (xfw) this.a.b();
            ArrayList arrayList = new ArrayList(aqjn.J(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(this.c.G(((xtq) it.next()).a));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = (String) obj;
                str.getClass();
                if (str.length() > 0) {
                    arrayList2.add(obj);
                }
            }
            Set aE = aqjn.aE(arrayList2);
            znj znjVar = (znj) xfwVar.d.b();
            aiwl a = wus.a();
            a.i(wuk.TACHYON_PHONE);
            a.k(vee.a);
            a.g(true);
            Object F = arro.F(znjVar.ab(a.f()).g().i(new xfv(xfwVar, aE, 3), xfwVar.b), arpeVar);
            if (F == arpl.a) {
                return F;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.xtl
    public final Object b(xtq xtqVar, arpe arpeVar) {
        akul h;
        String G = this.c.G(xtqVar.a);
        if (G.length() > 0) {
            xfw xfwVar = (xfw) this.a.b();
            if (TextUtils.isEmpty(G)) {
                h = aktp.af(new IllegalStateException("Cannot determine if Tachygram is active. No msisdn available"));
            } else {
                h = xfwVar.g.D(G).b().h(new xdh(20), xfwVar.b);
            }
            Object F = arro.F(h.i(new xfv(xfwVar, G, 2), xfwVar.b).e(vbc.class, new xdh(18), xfwVar.b), arpeVar);
            if (F == arpl.a) {
                return F;
            }
            return arnb.a;
        }
        throw new IllegalArgumentException("Msisdn in ACS configuration is empty.");
    }

    @Override // defpackage.xtl
    public final boolean c(xtq xtqVar) {
        xtqVar.getClass();
        akrh e = aktp.e("TachygramChatTransportRegistrar#isTransportEligible");
        try {
            Configuration configuration = xtqVar.a;
            boolean z = false;
            if (configuration.tachygramEnabled) {
                if (this.c.G(configuration).length() > 0) {
                    z = true;
                }
            }
            armd.i(e, null);
            return z;
        } finally {
        }
    }
}
