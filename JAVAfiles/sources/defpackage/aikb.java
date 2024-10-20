package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aikb {
    public volatile aijv b;
    public String c;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final ArrayList f = new ArrayList();
    public final ArrayList d = new ArrayList();
    public Optional e = Optional.empty();
    private final asqc g = new asqc(this, null);

    public static final String v() {
        return String.format(Locale.US, "%s", UUID.randomUUID());
    }

    private final void x(aiom aiomVar) {
        String a;
        if (!aiomVar.x()) {
            aion aionVar = (aion) aiomVar;
            if (!aionVar.z().equals("SUBSCRIBE") && !aionVar.z().equals("PUBLISH")) {
                aiks w = ((aini) aiomVar.a).w();
                String d = w.d();
                if ("sip".equals(d) || "sips".equals(d)) {
                    aikp aikpVar = (aikp) w;
                    String e = aikpVar.e();
                    String b = aikpVar.b();
                    if (e != null && b != null) {
                        if (agkx.ab(o(), e) && agkx.ab(j(), b)) {
                            throw new aijz();
                        }
                    } else {
                        return;
                    }
                }
                if ("tel".equals(d)) {
                    aikq aikqVar = (aikq) w;
                    if (aikqVar.e()) {
                        a = "+".concat(String.valueOf(aikqVar.a()));
                    } else {
                        a = aikqVar.a();
                    }
                    if (o().equals(a)) {
                        throw new aijz();
                    }
                }
            }
        }
    }

    public int a() {
        return h().a();
    }

    public int b() {
        return h().b();
    }

    public abstract advp c();

    public aikh d(aiom aiomVar, aikm aikmVar) {
        x(aiomVar);
        aikh a = f().a(aiomVar, aikmVar);
        if (a != null) {
            r(aiomVar);
            return a;
        }
        throw new aild("SipTransactionContext is null");
    }

    public aikh e(aiom aiomVar) {
        return d(aiomVar, null);
    }

    public abstract aiki f();

    public abstract ailh g();

    public final aior h() {
        return f().b();
    }

    public abstract alog i();

    public abstract String j();

    public String k() {
        return h().e();
    }

    public String l() {
        return h().f();
    }

    public String m() {
        return g().d;
    }

    public abstract String n();

    public abstract String o();

    public final ArrayList p() {
        return new ArrayList(this.f);
    }

    public final void q(aijx aijxVar) {
        advr.d(c(), "Add a SIP listener", new Object[0]);
        this.a.add(aijxVar);
    }

    public void r(aiom aiomVar) {
        String str;
        x(aiomVar);
        try {
            alog i = i();
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((aijy) i.get(i2)).a(aiomVar);
            }
            f().d(aiomVar.a);
            if (aiomVar.x()) {
                aioo aiooVar = (aioo) aiomVar;
                str = "Sent SIP response with code: " + aiooVar.y() + " and callid: " + aiooVar.d();
            } else {
                aion aionVar = (aion) aiomVar;
                str = "Sent SIP request with method: " + aionVar.z() + " and callid: " + aionVar.d();
            }
            advr.w(26, 3, "%s", str);
            if (((Boolean) acpy.h.a()).booleanValue()) {
                advr.c("\n%s", aiomVar.n());
            }
        } catch (aild e) {
            advr.j(e, c(), "Can't send SIP message", new Object[0]);
            throw e;
        } catch (Exception e2) {
            advr.j(e2, c(), "Can't send SIP message", new Object[0]);
            throw new aild(e2.getMessage(), e2);
        }
    }

    public final void s(ArrayList arrayList) {
        this.f.clear();
        this.f.addAll(arrayList);
    }

    public final void t() {
        f().e(this.g);
    }

    public boolean u() {
        return false;
    }

    public abstract void w();
}
