package defpackage;

import android.content.Context;
import android.net.Uri;
import android.telephony.ims.ImsException;
import android.telephony.ims.ImsManager;
import android.telephony.ims.ImsRcsManager;
import android.telephony.ims.RcsContactPresenceTuple;
import android.telephony.ims.RcsContactUceCapability;
import android.telephony.ims.RcsUceAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnf implements acnh {
    static final acyz a = acyy.b("log_uce_callback_timeout");
    public final anen c;
    public final anca d;
    public volatile Instant e;
    public final acnc g;
    private final Context h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final adwp l;
    private final adta m;
    public final acyz b = aczd.a(189930238);
    public final Random f = new Random();

    public acnf(Context context, anen anenVar, acnc acncVar, anca ancaVar, armf armfVar, armf armfVar2, armf armfVar3, adwp adwpVar, adta adtaVar) {
        this.h = context;
        this.c = anenVar;
        this.d = ancaVar;
        this.e = ancaVar.a();
        this.g = acncVar;
        this.i = armfVar;
        this.j = armfVar2;
        this.k = armfVar3;
        this.l = adwpVar;
        this.m = adtaVar;
    }

    private static boolean h(RcsContactUceCapability rcsContactUceCapability) {
        if (rcsContactUceCapability.getCapabilityMechanism() == 1) {
            return true;
        }
        return false;
    }

    public final RcsUceAdapter a(int i) {
        ImsRcsManager imsRcsManager;
        RcsUceAdapter uceAdapter;
        ImsManager m69m = anf$$ExternalSyntheticApiModelOutline0.m69m(this.h.getSystemService(anf$$ExternalSyntheticApiModelOutline0.m77m()));
        if (m69m != null) {
            imsRcsManager = m69m.getImsRcsManager(i);
            uceAdapter = imsRcsManager.getUceAdapter();
            return uceAdapter;
        }
        throw new acng("[SR] Unable to get uce adapter from platform.");
    }

    public final adpo b(RcsContactUceCapability rcsContactUceCapability, long j) {
        String str;
        adxo adxoVar;
        if (true != h(rcsContactUceCapability)) {
            str = "OPTIONS";
        } else {
            str = "PRESENCE";
        }
        advr.k("[SR]: Received %s capabilities of %s id[%d] from platform: %s", str, advq.URI.c(rcsContactUceCapability.getContactUri()), Long.valueOf(j), rcsContactUceCapability);
        if (h(rcsContactUceCapability)) {
            adxr adxrVar = (adxr) this.i.b();
            for (RcsContactPresenceTuple rcsContactPresenceTuple : rcsContactUceCapability.getCapabilityTuples()) {
                if (rcsContactPresenceTuple != null) {
                    List b = adxrVar.b();
                    adxu adxuVar = (adxu) this.j.b();
                    adxt adxtVar = (adxt) this.k.b();
                    if ("open".equals(rcsContactPresenceTuple.getStatus())) {
                        adxoVar = adxo.OPEN;
                    } else {
                        adxoVar = adxo.CLOSED;
                    }
                    adxtVar.a = adxoVar;
                    adxuVar.b = adxtVar;
                    adxuVar.c = this.l.j(rcsContactPresenceTuple.getServiceId(), rcsContactPresenceTuple.getServiceVersion(), rcsContactPresenceTuple.getServiceDescription());
                    RcsContactPresenceTuple.ServiceCapabilities serviceCapabilities = rcsContactPresenceTuple.getServiceCapabilities();
                    ArrayList arrayList = new ArrayList();
                    if (serviceCapabilities != null) {
                        if (serviceCapabilities.isAudioCapable()) {
                            arrayList.add(adxi.AUDIO);
                        }
                        if (serviceCapabilities.isVideoCapable()) {
                            arrayList.add(adxi.VIDEO);
                        }
                    }
                    adxuVar.g = arrayList;
                    Uri contactUri = rcsContactPresenceTuple.getContactUri();
                    if (contactUri != null) {
                        adxuVar.d = new adxp(contactUri.toString());
                    }
                    b.add(adxuVar);
                }
            }
            adpo e = this.m.e(adxrVar, adpo.a);
            advr.o("[SR] Converted platform capabilities of %s to RcsEngine capabilities: %s", advq.URI.c(rcsContactUceCapability.getContactUri()), e);
            return e;
        }
        adpo adpoVar = new adpo(adpo.a);
        advr.q("[SR] Received options capabilities from provider, but expected presence instead.", new Object[0]);
        Iterator it = rcsContactUceCapability.getFeatureTags().iterator();
        while (it.hasNext()) {
            adpoVar.t((String) it.next(), true);
        }
        return adpoVar;
    }

    public final akul c(int i, Uri uri, long j) {
        if (!((Boolean) this.b.a()).booleanValue()) {
            return aktp.af(new UnsupportedOperationException());
        }
        if (g()) {
            advr.k("[SR] Capabilities backoff period, ignored for: %s", advq.URI.c(uri));
            return aktp.af(new acng("[SR] Cannot retry uce call yet. Still within backoff period."));
        }
        try {
            RcsUceAdapter a2 = a(i);
            alog r = alog.r(uri);
            advr.k("[SR] Querying system for capabilities for: %s id[%d]", advq.URI.c(uri), Long.valueOf(j));
            return akul.g(d.m(new acnd(this, j, a2, r, 0))).h(new tti(this, j, 8), this.c);
        } catch (acng e) {
            return aktp.af(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    @Override // defpackage.acnh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.Optional d(int r11, android.net.Uri r12) {
        /*
            r10 = this;
            acyz r0 = r10.b
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            j$.util.Optional r11 = j$.util.Optional.empty()
            return r11
        L13:
            advq r0 = defpackage.advq.URI
            java.lang.String r0 = r0.c(r12)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "[SR] Getting cached capabilities for: %s"
            defpackage.advr.c(r0, r1)
            java.util.Random r0 = r10.f
            long r4 = r0.nextLong()
            akul r11 = r10.c(r11, r12, r4)     // Catch: java.lang.InterruptedException -> L4e java.util.concurrent.ExecutionException -> L50 java.util.concurrent.TimeoutException -> L75
            aczf r12 = defpackage.aczf.o()     // Catch: java.lang.InterruptedException -> L4e java.util.concurrent.ExecutionException -> L50 java.util.concurrent.TimeoutException -> L75
            acze r12 = r12.a     // Catch: java.lang.InterruptedException -> L4e java.util.concurrent.ExecutionException -> L50 java.util.concurrent.TimeoutException -> L75
            acza r12 = r12.k     // Catch: java.lang.InterruptedException -> L4e java.util.concurrent.ExecutionException -> L50 java.util.concurrent.TimeoutException -> L75
            java.lang.Object r12 = r12.a()     // Catch: java.lang.InterruptedException -> L4e java.util.concurrent.ExecutionException -> L50 java.util.concurrent.TimeoutException -> L75
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.InterruptedException -> L4e java.util.concurrent.ExecutionException -> L50 java.util.concurrent.TimeoutException -> L75
            int r12 = r12.intValue()     // Catch: java.lang.InterruptedException -> L4e java.util.concurrent.ExecutionException -> L50 java.util.concurrent.TimeoutException -> L75
            long r0 = (long) r12     // Catch: java.lang.InterruptedException -> L4e java.util.concurrent.ExecutionException -> L50 java.util.concurrent.TimeoutException -> L75
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L4e java.util.concurrent.ExecutionException -> L50 java.util.concurrent.TimeoutException -> L75
            java.lang.Object r11 = r11.get(r0, r12)     // Catch: java.lang.InterruptedException -> L4e java.util.concurrent.ExecutionException -> L50 java.util.concurrent.TimeoutException -> L75
            adpo r11 = (defpackage.adpo) r11     // Catch: java.lang.InterruptedException -> L4e java.util.concurrent.ExecutionException -> L50 java.util.concurrent.TimeoutException -> L75
            j$.util.Optional r11 = j$.util.Optional.of(r11)     // Catch: java.lang.InterruptedException -> L4e java.util.concurrent.ExecutionException -> L50 java.util.concurrent.TimeoutException -> L75
            return r11
        L4e:
            r11 = move-exception
            goto L51
        L50:
            r11 = move-exception
        L51:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.String r0 = "[SR] Failed to get cached capabilities."
            defpackage.advr.s(r11, r0, r12)
            acyz r11 = defpackage.acnf.a
            java.lang.Object r11 = r11.a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L70
            acnc r3 = r10.g
            r7 = 1002(0x3ea, float:1.404E-42)
            r8 = -1
            r6 = 2
            r3.a(r4, r6, r7, r8)
        L70:
            j$.util.Optional r11 = j$.util.Optional.empty()
            return r11
        L75:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.String r12 = "[SR] Timeout on getting the cached capabilities."
            defpackage.advr.c(r12, r11)
            acyz r11 = defpackage.acnf.a
            java.lang.Object r11 = r11.a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L94
            acnc r3 = r10.g
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = -1
            r6 = 2
            r3.a(r4, r6, r7, r8)
        L94:
            j$.util.Optional r11 = j$.util.Optional.empty()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acnf.d(int, android.net.Uri):j$.util.Optional");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object e(long j, Uri uri, RcsUceAdapter rcsUceAdapter, dtq dtqVar) {
        try {
            this.g.b(j, 3);
            advr.k("[SR] Requesting capabilities id[%d] for %s from platform", Long.valueOf(j), advq.URI.c(uri));
            rcsUceAdapter.requestAvailability(uri, this.c, new acne(this, j, 3, dtqVar));
            return "SingleRegistrationUceProvider.forceNetworkExchange";
        } catch (ImsException | SecurityException e) {
            dtqVar.d(new acng("[SR] Failed to force the platform to make a network exchange", e));
            return "SingleRegistrationUceProvider.forceNetworkExchange";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object f(long j, RcsUceAdapter rcsUceAdapter, List list, dtq dtqVar) {
        try {
            this.g.b(j, 2);
            rcsUceAdapter.requestCapabilities(list, this.c, new acne(this, j, 2, dtqVar));
            return "SingleRegistrationUceProvider.getCapabilities";
        } catch (ImsException | SecurityException e) {
            dtqVar.d(new acng("[SR] Failed to request capabilities from platform", e));
            return "SingleRegistrationUceProvider.getCapabilities";
        }
    }

    public final boolean g() {
        return this.d.a().isBefore(this.e);
    }
}
