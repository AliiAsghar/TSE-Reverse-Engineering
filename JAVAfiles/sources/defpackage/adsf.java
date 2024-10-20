package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsf extends adui {
    private static final advp f = new advp("RcsImsServiceDispatcher");
    private final acqj g;

    public adsf(adov adovVar, armf armfVar, adwe adweVar, acqj acqjVar, ansy ansyVar) {
        super(adovVar, armfVar, adweVar, acqjVar, ansyVar);
        this.g = acqjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x012c, code lost:
    
        if (defpackage.adwf.A(r1, r4) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0132, code lost:
    
        if (r17.j("Referred-By") != null) goto L56;
     */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, acyz] */
    @Override // defpackage.adui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.aion r17) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adsf.a(aion):void");
    }

    /* JADX WARN: Type inference failed for: r12v12, types: [com.google.android.ims.network.common.RcsEngine, java.lang.Object] */
    @Override // defpackage.adui
    public final void b(aion aionVar) {
        String j;
        if (aczf.F() && (j = aionVar.j("Accept-Contact")) != null && aczf.F() && j.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.msg")) {
            i(aionVar, 488, 24);
            return;
        }
        String h = aionVar.h();
        if ("application/end-user-confirmation-request+xml".equals(h)) {
            adqk adqkVar = (adqk) this.d.b(adqk.class);
            if (!adqkVar.r(aionVar)) {
                adqkVar.q(aionVar);
                return;
            }
            aiok c = aionVar.c("application/end-user-confirmation-request+xml");
            if (c != null) {
                InputStream a = c.a();
                adtg adtgVar = new adtg();
                try {
                    adtgVar.a = adqj.a(adqkVar.a.c().mT1 * 64, a);
                    adqkVar.g.put(((adqn) adtgVar.a).f, adtgVar);
                    if (((adqj) adtgVar.a).e == 2) {
                        try {
                            adqkVar.p(aionVar);
                        } catch (adql e) {
                            advr.i(e, "Error while sending confirmation request response: %s", e.getMessage());
                        }
                    }
                    aday adayVar = adqkVar.h;
                    if (adayVar != null) {
                        Object obj = adtgVar.a;
                        Intent intent = new Intent(RcsIntents.ACTION_END_USER_CONFIRMATION_REQUEST);
                        intent.setFlags(805306368);
                        intent.putExtra(RcsIntents.EXTRA_REQUEST_ID, ((adqn) obj).f);
                        intent.putExtra(RcsIntents.EXTRA_SUBJECT, ((adqn) obj).b());
                        intent.putExtra(RcsIntents.EXTRA_TEXT, ((adqn) obj).c());
                        intent.putExtra(RcsIntents.EXTRA_BUTTON_POSITIVE, adqj.d(((adqj) obj).a));
                        intent.putExtra(RcsIntents.EXTRA_BUTTON_NEGATIVE, adqj.d(((adqj) obj).b));
                        intent.putExtra(RcsIntents.EXTRA_PIN_REQUIRED, ((adqj) obj).d);
                        intent.putExtra(RcsIntents.EXTRA_TIMEOUT, ((adqj) obj).c);
                        ((Context) adayVar.a).startActivity(intent);
                        return;
                    }
                    return;
                } catch (IOException unused) {
                    advr.g("Error while parsing request", new Object[0]);
                    return;
                }
            }
            return;
        }
        if ("application/end-user-confirmation-ack+xml".equals(h)) {
            adqk adqkVar2 = (adqk) this.d.b(adqk.class);
            if (!adqkVar2.r(aionVar)) {
                adqkVar2.q(aionVar);
                return;
            }
            try {
                adqkVar2.p(aionVar);
            } catch (Exception e2) {
                advr.i(e2, "Error while sending confirmation ack response: %s", e2.getMessage());
            }
            aiok c2 = aionVar.c("application/end-user-confirmation-ack+xml");
            if (c2 != null) {
                try {
                    adqn adqnVar = new adqn(c2.a());
                    aday adayVar2 = adqkVar2.h;
                    if (adayVar2 != null) {
                        Intent intent2 = new Intent(RcsIntents.ACTION_END_USER_CONFIRMATION_ACK);
                        intent2.setFlags(805306368);
                        intent2.putExtra(RcsIntents.EXTRA_REQUEST_ID, adqnVar.f);
                        intent2.putExtra(RcsIntents.EXTRA_SUBJECT, adqnVar.b());
                        intent2.putExtra(RcsIntents.EXTRA_TEXT, adqnVar.c());
                        ((Context) adayVar2.a).startActivity(intent2);
                        return;
                    }
                    return;
                } catch (IOException unused2) {
                    advr.g("Error while parsing confirmation ack request", new Object[0]);
                    return;
                }
            }
            return;
        }
        if ("application/end-user-notification-request+xml".equals(h)) {
            adqk adqkVar3 = (adqk) this.d.b(adqk.class);
            if (!adqkVar3.r(aionVar)) {
                adqkVar3.q(aionVar);
                return;
            }
            try {
                adqkVar3.p(aionVar);
            } catch (Exception e3) {
                advr.i(e3, "Error while sending notification request response: %s", e3.getMessage());
            }
            aiok c3 = aionVar.c("application/end-user-notification-request+xml");
            if (c3 != null) {
                try {
                    adqm a2 = adqm.a(c3.a());
                    aday adayVar3 = adqkVar3.h;
                    if (adayVar3 != null) {
                        Intent intent3 = new Intent(RcsIntents.ACTION_END_USER_NOTIFICATION_REQUEST);
                        intent3.setFlags(805306368);
                        intent3.putExtra(RcsIntents.EXTRA_REQUEST_ID, a2.f);
                        intent3.putExtra(RcsIntents.EXTRA_SUBJECT, a2.b());
                        intent3.putExtra(RcsIntents.EXTRA_TEXT, a2.c());
                        intent3.putExtra(RcsIntents.EXTRA_BUTTON_POSITIVE, adqm.d(a2.a));
                        ((Context) adayVar3.a).startActivity(intent3);
                        return;
                    }
                    return;
                } catch (IOException e4) {
                    advr.i(e4, "Error while parsing notification request", new Object[0]);
                    return;
                }
            }
            return;
        }
        if ("application/system-request+xml".equals(h)) {
            adqk adqkVar4 = (adqk) this.d.b(adqk.class);
            if (!adqkVar4.r(aionVar)) {
                adqkVar4.q(aionVar);
                return;
            }
            try {
                adqkVar4.p(aionVar);
            } catch (Exception e5) {
                advr.i(e5, "Error while sending system request response to : %s", e5.getMessage());
            }
            aiok c4 = aionVar.c("application/system-request+xml");
            if (c4 != null) {
                try {
                    arjs d = arjs.d(c4.a());
                    aday adayVar4 = adqkVar4.h;
                    if (adayVar4 != null) {
                        int i = d.a;
                        int i2 = i - 1;
                        if (i != 0) {
                            if (i2 == 0) {
                                adayVar4.b.onReconfigurationRequested();
                                return;
                            }
                            return;
                        }
                        throw null;
                    }
                    return;
                } catch (IOException e6) {
                    advr.i(e6, "Error while procesing system request: %s", e6.getMessage());
                    return;
                }
            }
            return;
        }
        adrh adrhVar = (adrh) this.d.b(adrh.class);
        advr.l(adrh.g, "Receive an instant message", new Object[0]);
        if (aionVar.z().equals("NOTIFY")) {
            advr.w(6, 3, "Received a pager message", new Object[0]);
        }
        try {
            aioo n = adrhVar.e.n(aionVar);
            n.r("P-Preferred-Identity: " + adrhVar.a.e());
            adrhVar.q().r(n);
        } catch (aild e7) {
            advr.j(e7, adrh.g, "Can't send 200 OK for MESSAGE: %s", e7.getMessage());
        }
        String j2 = aionVar.j(assi.a);
        if (Objects.isNull(j2)) {
            advr.h(adrh.g, "Ignoring message with null content type.", new Object[0]);
            return;
        }
        advr.d(adrh.g, "Checking incoming message content type [%s]", j2);
        aiks b = adwf.b(aionVar, adrhVar.i);
        b.getClass();
        adqu adquVar = new adqu(null, Objects.toString(aionVar.g(), "").getBytes(StandardCharsets.UTF_8), j2);
        adquVar.c = b.toString();
        adrhVar.o.f(adquVar);
    }
}
