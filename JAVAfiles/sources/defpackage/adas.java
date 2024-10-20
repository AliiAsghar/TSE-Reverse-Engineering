package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.rcs.client.messaging.data.AutoValue_Conversation;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adas extends adqp implements adpg {
    private final anen f;
    private final adov g;
    private final yjr h;
    private final aikc i;
    private final armf j;
    private final adrc k;
    private acop l;
    private adpe m;
    public static final acyz a = acyy.b("ignore_group_notifications_with_state_deleted");
    private static final acyz c = aczd.a(177836135);
    private static final acyz d = aczd.a(160405329);
    public static final acyz b = acyy.b("ignore_group_notifications_after_leaving");
    private static final alpt e = new altx("application/conference-info+xml");

    public adas(anen anenVar, adov adovVar, yjr yjrVar, aikc aikcVar, armf armfVar, adrc adrcVar) {
        this.f = anenVar;
        this.g = adovVar;
        this.h = yjrVar;
        this.i = aikcVar;
        this.j = armfVar;
        this.k = adrcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, acyz] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object, java.lang.Iterable] */
    private final addl w() {
        String str;
        ajqi ajqiVar;
        Optional map;
        Conversation w = adcx.w(this.k);
        acop acopVar = this.l;
        acopVar.getClass();
        AutoValue_Conversation autoValue_Conversation = (AutoValue_Conversation) w;
        String a2 = autoValue_Conversation.a.a();
        if (((Boolean) c.a()).booleanValue()) {
            str = (String) acopVar.a.flatMap(new acpr(16)).orElse(this.k.q);
        } else if (acopVar.a.isPresent()) {
            str = albo.ag((String) ((acom) acopVar.a.get()).b.orElse(null));
        } else {
            str = "";
        }
        anzh anzhVar = new anzh((byte[]) null, (byte[]) null);
        anzhVar.f(autoValue_Conversation.b);
        anzhVar.d(a2);
        anzhVar.g(str);
        acopVar.a.flatMap(new acpr(17)).ifPresent(new acsa(anzhVar, 12));
        acpl acplVar = acopVar.d;
        int size = acplVar.size();
        for (int i = 0; i < size; i++) {
            acpk acpkVar = (acpk) acplVar.get(i);
            ajqh f = GroupMember.f();
            f.b(albo.ag(acpkVar.a));
            f.c(adcx.x(acpkVar.g));
            if (acpkVar.b().filter(new ytt(20)).isPresent()) {
                ajqiVar = ajqi.PENDING;
            } else if (acpkVar.g()) {
                ajqiVar = ajqi.PRESENT;
            } else {
                ajqiVar = ajqi.ABSENT;
            }
            f.f(ajqiVar);
            if (((Boolean) aczt.a().a.a.a()).booleanValue()) {
                if (acpkVar.f.isEmpty()) {
                    map = Optional.empty();
                } else {
                    map = ((acox) acpkVar.f.get(0)).b.map(new acpr(15));
                }
                map.ifPresent(new acsa(f, 11));
            }
            GroupMember a3 = f.a();
            if (anzhVar.g == null) {
                if (anzhVar.a == null) {
                    anzhVar.g = new alob();
                } else {
                    anzhVar.g = new alob();
                    ((alob) anzhVar.g).j(anzhVar.a);
                    anzhVar.a = null;
                }
            }
            ((alob) anzhVar.g).h(a3);
        }
        if (((Boolean) d.a()).booleanValue()) {
            alpt aB = this.k.aB();
            Optional map2 = acopVar.a.map(new acpr(18));
            ajqj ajqjVar = new ajqj((byte[]) null);
            ajqjVar.d(false);
            ajqjVar.c(false);
            ajqjVar.b(false);
            ajqj ajqjVar2 = new ajqj(ajqjVar.a());
            if (map2.isPresent()) {
                if (((String) map2.get()).contains("rem-admin")) {
                    ajqjVar2.b(true);
                } else if (((String) map2.get()).contains("rem-all")) {
                    ajqjVar2.c(true);
                }
            }
            ajqjVar2.d(aB.contains(GroupManagementContentType.CONTENT_TYPE));
            anzhVar.e(ajqjVar2.a());
        }
        arbj arbjVar = new arbj((byte[]) null, (byte[]) null, (char[]) null);
        arbjVar.z(w);
        arbjVar.B(anzhVar.c());
        return new addl(arbjVar.y());
    }

    private final Optional x(acop acopVar, String str, byte[] bArr) {
        Optional of;
        if (((Boolean) a.a()).booleanValue()) {
            acop g = actx.g(bArr);
            if (acpg.DELETED.equals(g.h)) {
                advr.c("Ignoring conference info with status deleted.", new Object[0]);
                of = Optional.empty();
            } else {
                of = Optional.of(actx.h(Optional.ofNullable(acopVar), g, this.h));
            }
        } else {
            of = Optional.of(actx.i(Optional.ofNullable(acopVar), str, bArr, this.h));
        }
        if (!aczt.d()) {
            of.ifPresent(new aavc(4));
        }
        return of;
    }

    private final void y(ListenableFuture listenableFuture) {
        albo.bR(listenableFuture, new pum(10), this.f);
    }

    private final void z() {
        if (aczr.d() && this.k.ba()) {
            return;
        }
        adrh adrhVar = (adrh) this.g.a(adrh.class);
        adrhVar.getClass();
        try {
            adpe adpeVar = this.m;
            if (adpeVar != null) {
                adpeVar.j(this);
                this.m = null;
            }
            adpe adpeVar2 = new adpe(adrhVar.a, this.i, this.k.J, "conference", adrhVar.c, adrhVar.d, adrhVar.e);
            adpeVar2.e = "application/conference-info+xml";
            if (aczf.F()) {
                adpeVar2.i = (String[]) Collection.EL.toArray(this.k.X.b(), new adak(2));
            } else {
                adpeVar2.i = adwf.C(adrhVar.x());
            }
            adpeVar2.d(this);
            adpeVar2.o();
            this.m = adpeVar2;
        } catch (aild e2) {
            throw new IllegalStateException("Can't subscribe to conference event.", e2);
        }
    }

    @Override // defpackage.adqp, defpackage.adqy
    public final void c(adqu adquVar) {
        byte[] H;
        Optional x;
        if (aczr.d()) {
            String str = adquVar.h;
            if ("message/cpim".equals(str)) {
                try {
                    ajpz j = ajki.j(adquVar.f);
                    str = (String) j.c.b().orElse(str);
                    H = j.c.b.H();
                } catch (IOException e2) {
                    advr.g("Can't parse CPIM message: %s", e2);
                    return;
                }
            } else {
                H = adquVar.f;
            }
            if (e.contains(str)) {
                try {
                    x = x(null, str, H);
                } catch (acoo e3) {
                    advr.i(e3, "Error while updating conference: %s", e3.getMessage());
                } catch (IOException e4) {
                    e = e4;
                    advr.i(e, "Error while reading conference subscription: %s", e.getMessage());
                } catch (XmlPullParserException e5) {
                    e = e5;
                    advr.i(e, "Error while reading conference subscription: %s", e.getMessage());
                }
                if (!x.isEmpty()) {
                    this.l = (acop) x.get();
                    y(((adaz) ((apxx) this.j).a).a(w()));
                }
            }
        }
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void h() {
        z();
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void j() {
        adpe adpeVar;
        if (aczx.x() && (adpeVar = this.m) != null) {
            adpeVar.p();
        }
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void k(adug adugVar) {
        adpe adpeVar;
        if (aczx.x() && (adpeVar = this.m) != null) {
            adpeVar.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.adqp, defpackage.adpb
    public final void l() {
        adpe adpeVar;
        if (aczx.x() && (adpeVar = this.m) != null) {
            adpeVar.p();
        }
        if (aczt.n() && this.k.ay() == adpi.GONE) {
            adrh adrhVar = (adrh) this.g.a(adrh.class);
            adrhVar.getClass();
            String e2 = adrhVar.a.e();
            ajqh f = GroupMember.f();
            f.b(e2);
            f.c(adcx.x(e2));
            f.f(ajqi.ABSENT);
            f.d(true);
            String str = this.k.I;
            if (str != null) {
                f.e(adcx.x(str));
            }
            arbj arbjVar = new arbj((byte[]) null, (byte[]) null, (char[]) null);
            arbjVar.z(adcx.w(this.k));
            ajur ajurVar = new ajur(null);
            GroupMember a2 = f.a();
            if (ajurVar.b == null) {
                if (ajurVar.a == null) {
                    ajurVar.b = new alob();
                } else {
                    ajurVar.b = new alob();
                    ((alob) ajurVar.b).j(ajurVar.a);
                    ajurVar.a = null;
                }
            }
            ((alob) ajurVar.b).h(a2);
            arbjVar.A(ajurVar.k());
            y(((adaz) ((apxx) this.j).a).a(new addl(arbjVar.y())));
        }
    }

    @Override // defpackage.adpg
    public final void p(adpe adpeVar, String str, byte[] bArr) {
        int i = 1;
        if (((Boolean) a.a()).booleanValue() && !actx.j(str, bArr)) {
            advr.g("Received invalid conference information contentType:{%s} content:{%s}", str, bArr);
            return;
        }
        if (((Boolean) b.a()).booleanValue() && this.k.q() && this.k.ay().equals(adpi.LEAVE)) {
            advr.k("Received conference info after leaving.", new Object[0]);
            return;
        }
        try {
            Optional x = x(this.l, str, bArr);
            if (x.isEmpty()) {
                return;
            }
            this.l = (acop) x.get();
            if (((Boolean) aczx.a().b.u.a()).booleanValue()) {
                acop acopVar = this.l;
                acopVar.getClass();
                adrh adrhVar = (adrh) this.g.a(adrh.class);
                adrhVar.getClass();
                String e2 = adrhVar.a.e();
                if (!TextUtils.isEmpty(e2)) {
                    Collection.EL.stream(acopVar.d).filter(new addf(i)).forEach(new acsa(e2, 10));
                }
            }
            y(((adaz) ((apxx) this.j).a).a(w()));
        } catch (acoo e3) {
            advr.i(e3, "Error while updating conference: %s", e3.getMessage());
            z();
        } catch (IOException e4) {
            e = e4;
            advr.i(e, "Error while reading conference subscription: %s", e.getMessage());
        } catch (XmlPullParserException e5) {
            e = e5;
            advr.i(e, "Error while reading conference subscription: %s", e.getMessage());
        }
    }

    @Override // defpackage.adpg
    public final void t() {
    }

    @Override // defpackage.adpg
    public final void u() {
    }

    @Override // defpackage.adpg
    public final void s(aduf adufVar) {
    }

    @Override // defpackage.adpg
    public final void v(aduf adufVar) {
    }

    @Override // defpackage.adpg
    public final void r(int i, String str) {
    }
}
