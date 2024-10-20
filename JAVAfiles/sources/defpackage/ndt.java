package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndt implements nds {
    private final Context a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;

    public ndt(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        this.a = context;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.g = armfVar5;
        this.f = armfVar6;
        this.h = armfVar7;
        this.i = armfVar8;
    }

    static boolean b(tap tapVar, boolean z) {
        String str;
        if (true != z) {
            str = "EMERGENCY+SERVICE+PROVIDER";
        } else {
            str = "EMERGENCY+SERVICE+PROVIDER+DEMO";
        }
        return TextUtils.equals(tapVar.g, str);
    }

    private static tap c(String str) {
        rxt.c(str, 1);
        tap c = ParticipantsTable.c();
        c.S(-2);
        c.R(-1);
        c.Q(d.ap(str));
        c.u(null);
        c.t(null);
        c.M(null);
        c.l(-1L);
        c.C(null);
        c.e(false);
        c.T(0);
        c.U(null);
        return c;
    }

    private final void d(tap tapVar) {
        Resources resources = this.a.getResources();
        if (!TextUtils.equals(tapVar.g, "ʼUNKNOWN_SENDER!ʼ")) {
            if (!TextUtils.equals(tapVar.g, "ʼWAP_PUSH_SI!ʼ")) {
                if (TextUtils.equals(tapVar.g, ((xbf) this.c.b()).a(-1).k())) {
                    tapVar.q(resources.getString(R.string.spam_reporting_from));
                    tapVar.u(tapVar.h);
                    tapVar.l(-2L);
                    return;
                }
                if (((orj) this.d.b()).a() && b(tapVar, false)) {
                    tapVar.q(resources.getString(R.string.recipient_title_satellite));
                    tapVar.u(tapVar.h);
                    tapVar.l(-2L);
                    return;
                }
                if (((orj) this.d.b()).a() && b(tapVar, true)) {
                    tapVar.q(resources.getString(R.string.recipient_title_satellite_demo));
                    tapVar.u(tapVar.h);
                    tapVar.l(-2L);
                    return;
                }
                Optional optional = (Optional) ((apxx) this.f).a;
                if (optional.isPresent() && ((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && ((vni) optional.get()).m().equals(tapVar.g)) {
                    vni vniVar = (vni) ((Optional) ((apxx) this.f).a).get();
                    tapVar.q(vniVar.n());
                    tapVar.u(vniVar.n());
                    tapVar.M(vniVar.e());
                    tapVar.l(-2L);
                    if (((plh) this.b.b()).a()) {
                        tapVar.I(3);
                        return;
                    }
                    return;
                }
                return;
            }
            tapVar.q(resources.getString(R.string.wap_push_from));
            tapVar.u(tapVar.h);
            tapVar.l(-2L);
            return;
        }
        tapVar.q(resources.getString(R.string.unknown_sender));
        tapVar.u(tapVar.h);
        tapVar.l(-2L);
    }

    private final void e(msh mshVar) {
        Optional optional = (Optional) ((apxx) this.e).a;
        Optional optional2 = (Optional) ((apxx) this.g).a;
        if (optional.isPresent() && optional2.isPresent()) {
            uep uepVar = (uep) optional2.get();
            mshVar.m();
            if (uepVar.a()) {
                ueo ueoVar = (ueo) optional.get();
                mshVar.m();
                ueoVar.e();
            }
        }
    }

    @Override // defpackage.nds
    public final ParticipantsTable.BindData a(msh mshVar) {
        String n;
        if (((Boolean) new mst(7).get()).booleanValue()) {
            String m = mshVar.m();
            m.getClass();
            tap c = c(m);
            String k = mshVar.k();
            k.getClass();
            c.H(k);
            c.q(albo.ag(mshVar.F().a));
            d(c);
            if (mshVar.A()) {
                c.I(1);
            }
            if (((Boolean) this.h.b()).booleanValue()) {
                e(mshVar);
            }
            return c.a();
        }
        String i = mshVar.i();
        i.getClass();
        armf armfVar = this.i;
        tap c2 = c(i);
        if (((opa) armfVar.b()).a()) {
            n = mshVar.k();
        } else {
            n = mshVar.n();
        }
        n.getClass();
        c2.H(n);
        c2.q(albo.ag(mshVar.F().a));
        d(c2);
        if (mshVar.A()) {
            c2.I(1);
        }
        if (mshVar.z() && ((Optional) ((apxx) this.f).a).isPresent()) {
            c2.I(3);
            c2.M(((vni) ((Optional) ((apxx) this.f).a).get()).e());
        }
        if (((Boolean) this.h.b()).booleanValue()) {
            e(mshVar);
        }
        return c2.a();
    }
}
