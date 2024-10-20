package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvs {
    public static final xze a = xze.g("Bugle", "VideoCalling");
    public final anen b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    private final armf h;
    private final armf i;

    public yvs(anen anenVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.b = anenVar;
        this.h = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.i = armfVar5;
        this.f = armfVar6;
        this.g = armfVar7;
    }

    public static boolean f(int i) {
        if (i != 6 && i != 2 && i != 0) {
            return true;
        }
        return false;
    }

    public static boolean g(int i) {
        if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    public final akul a(ParticipantsTable.BindData bindData) {
        akul c;
        int r = bindData.r();
        if (r != 6) {
            msh q = ((msk) this.g.b()).q(bindData);
            switch (r) {
                case 1:
                case 3:
                case 4:
                case 5:
                case 8:
                case 10:
                    a.p("Launching (DuoKit) via setupDuo()...");
                    c = ((yvf) this.e.b()).c();
                    break;
                case 2:
                    a.p("Launching video call (ViLTE)...");
                    c = aktp.ag(Boolean.valueOf(((yvu) this.d.b()).c(q)));
                    break;
                case 6:
                default:
                    c = aktp.ag(false);
                    break;
                case 7:
                case 9:
                case 11:
                    a.p("Launching (DuoKit) via startCallAsync()...");
                    c = ((yvf) this.e.b()).a(q);
                    break;
            }
            if (h(bindData)) {
                ((ksi) this.f.b()).a();
            }
            return c.h(new ikg(this, r, 19), this.b).e(Throwable.class, new yts(13), this.b);
        }
        throw new IllegalStateException("Video calling: participant in unsupported state");
    }

    public final Optional b() {
        return Optional.of(Integer.valueOf(R.drawable.quantum_gm_ic_meet_vd_theme_24));
    }

    public final void c(int i) {
        ((mbl) this.h.b()).e("Bugle.UI.VideoCallButton.Clicked", i);
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_VIDEO_CALL_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amiw.a.createBuilder();
        int g = yzc.g(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amiw amiwVar = (amiw) createBuilder.b;
        amiwVar.c = g - 1;
        amiwVar.b |= 1;
        amiw amiwVar2 = (amiw) createBuilder.s();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amiwVar2.getClass();
        amfrVar2.W = amiwVar2;
        amfrVar2.c |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        ((maq) this.i.b()).j(amfqVar);
    }

    public final void d(List list) {
        akul i;
        if (!((Boolean) yvr.a.e()).booleanValue()) {
            return;
        }
        List list2 = (List) Collection.EL.stream(list).filter(new xdm(this, 18)).collect(Collectors.toCollection(new yaa(17)));
        int i2 = 11;
        if (((Boolean) yvr.h.e()).booleanValue()) {
            i = ((yvf) this.e.b()).e(alog.n(list2));
        } else {
            i = ((yvu) this.d.b()).a(alog.n(list2)).i(new ytu(this, i2), this.b);
        }
        qiu.h(i.h(new yts(i2), this.b));
    }

    public final boolean e(ParticipantsTable.BindData bindData) {
        int r = bindData.r();
        if (r != 6 && r != 0) {
            return true;
        }
        return false;
    }

    public final boolean h(ParticipantsTable.BindData bindData) {
        int r = bindData.r();
        if (!g(r) && !f(r) && r != 4 && r != 5) {
            return false;
        }
        return true;
    }
}
