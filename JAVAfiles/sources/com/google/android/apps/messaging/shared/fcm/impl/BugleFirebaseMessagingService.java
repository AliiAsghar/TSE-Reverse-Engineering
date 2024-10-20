package com.google.android.apps.messaging.shared.fcm.impl;

import android.text.TextUtils;
import defpackage.adjc;
import defpackage.ahka;
import defpackage.ahqe;
import defpackage.akrc;
import defpackage.akrh;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.alor;
import defpackage.amfp;
import defpackage.amfq;
import defpackage.amfr;
import defpackage.aoiq;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apul;
import defpackage.apum;
import defpackage.armf;
import defpackage.arwi;
import defpackage.maq;
import defpackage.mbl;
import defpackage.oku;
import defpackage.qiu;
import defpackage.uun;
import defpackage.uuw;
import defpackage.uyh;
import defpackage.xcq;
import defpackage.xcr;
import defpackage.xcs;
import defpackage.xyo;
import defpackage.xze;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BugleFirebaseMessagingService extends uuw {
    private static final xze i = xze.g("BugleNetwork", "BugleFirebaseMessagingService");
    public Map a;
    public mbl b;
    public aksr c;
    public armf d;
    public armf e;
    public armf f;
    public armf g;

    public BugleFirebaseMessagingService() {
        ahqe.a.d(ahka.b(getClass()));
    }

    private final void h(String str, String str2) {
        akrh e = aktp.e("BugleFirebaseMessagingService::logTickle");
        try {
            aozy createBuilder = apul.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ((apul) apagVar).b = 0;
            if (str != null) {
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((apul) createBuilder.b).c = str;
            }
            aozy createBuilder2 = apum.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            ((apum) apagVar2).f = arwi.I(96);
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar3 = createBuilder2.b;
            ((apum) apagVar3).d = arwi.J(3);
            if (!apagVar3.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar4 = createBuilder2.b;
            ((apum) apagVar4).e = 28;
            if (!apagVar4.isMutable()) {
                createBuilder2.u();
            }
            apum apumVar = (apum) createBuilder2.b;
            apul apulVar = (apul) createBuilder.s();
            apulVar.getClass();
            apumVar.g = apulVar;
            apumVar.b |= 1;
            if (str2 != null) {
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((apum) createBuilder2.b).c = str2;
            }
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.BUGLE_TACHYON_TRANSPORT_EVENT;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b |= 1;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            apum apumVar2 = (apum) createBuilder2.s();
            apumVar2.getClass();
            amfrVar2.O = apumVar2;
            amfrVar2.c |= 262144;
            ((maq) this.d.b()).j(amfqVar);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void a(aoiq aoiqVar) {
        String str;
        xyo e;
        akrc b = this.c.b("BugleFirebaseMessagingService.onMessageReceived");
        try {
            String str2 = "";
            if (aoiqVar.c() == null || !aoiqVar.c().containsKey("event")) {
                str = "";
            } else {
                str = (String) aoiqVar.c().get("event");
            }
            if (aoiqVar.c() != null && aoiqVar.c().containsKey("tickle")) {
                str2 = (String) aoiqVar.c().get("tickle");
            }
            String str3 = (String) aoiqVar.c().get("casp");
            byte[] byteArray = aoiqVar.a.getByteArray("rawData");
            String str4 = (String) aoiqVar.c().get("chm");
            if ((str3 != null && str3.length() != 0) || (byteArray != null && str4 != null && str4.length() != 0)) {
                str = "gnp_chime_message";
            }
            xcs xcsVar = (xcs) this.g.b();
            if (((Boolean) xcs.l.e()).booleanValue() && !((ConcurrentHashMap) xcsVar.u.get(xcr.TACHYGRAM_MESSAGE_ARRIVED.ordinal())).containsKey(str2)) {
                xcsVar.b(xcr.TICKLE_ARRIVED, str2, new xcq(xcsVar));
            }
            if (((oku) this.f.b()).a()) {
                qiu.h(((adjc) this.e.b()).g());
            }
            if (uyh.a() && aoiqVar.c() != null && aoiqVar.c().containsKey("app") && "GMM".equals((String) aoiqVar.c().get("app"))) {
                i.l("Received a lighter notification.");
                str = "lighter_notification";
            }
            armf armfVar = (armf) this.a.get(str);
            if (armfVar != null) {
                e = i.a();
            } else {
                e = i.e();
            }
            e.H("Received firebase message");
            e.z("with event", str);
            e.z("with data", aoiqVar.c());
            e.z("handler", armfVar);
            e.q();
            if (armfVar != null) {
                ((uun) armfVar.b()).c();
                h(str, str2);
                ((uun) armfVar.b()).a(aoiqVar);
            } else {
                h(str, str2);
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void b(String str) {
        xyo b;
        akrc b2 = this.c.b("BugleFirebaseMessagingService.onNewToken");
        try {
            this.b.c("Bugle.Ditto.NewFcmToken.Counts");
            if (TextUtils.isEmpty(str)) {
                i.q("Received empty new token.");
            } else {
                for (armf armfVar : ((alor) this.a).values()) {
                    if (armfVar != null) {
                        b = i.a();
                    } else {
                        b = i.b();
                    }
                    b.H("Received new token");
                    b.z("handler", armfVar);
                    b.q();
                    if (armfVar != null) {
                        ((uun) armfVar.b()).b();
                    }
                }
            }
            b2.close();
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
