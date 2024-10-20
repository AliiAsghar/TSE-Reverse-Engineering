package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ryx {
    public static final long a;
    public final xnv b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final mbl h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final anen l;
    public final anen m;
    public final Object n = new Object();
    public final alib o;
    public final wpp p;

    static {
        uuh.x(180026785, "no_link_preview_fetched_for_untrusted_sender_in_search");
        a = TimeUnit.DAYS.toMillis(29L);
    }

    public ryx(xnv xnvVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, mbl mblVar, wpp wppVar, armf armfVar6, armf armfVar7, armf armfVar8, anen anenVar, anen anenVar2) {
        alig aligVar = new alig();
        aligVar.e(100L);
        aligVar.d(2L, TimeUnit.MINUTES);
        this.o = aligVar.a();
        this.b = xnvVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = mblVar;
        this.p = wppVar;
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = armfVar8;
        this.l = anenVar;
        this.m = anenVar2;
    }

    public static boolean b(apzp apzpVar) {
        if (apzpVar.c.isEmpty() && apzpVar.d.isEmpty() && apzpVar.g.isEmpty() && apzpVar.e.isEmpty() && apzpVar.f.isEmpty()) {
            return false;
        }
        return true;
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        return 4;
    }

    public final akul a(final String str, MessageIdType messageIdType) {
        String valueOf = String.valueOf(String.valueOf(messageIdType));
        Object obj = this.n;
        String concat = String.valueOf(str).concat(valueOf);
        synchronized (obj) {
            akul akulVar = (akul) this.o.l(concat);
            if (akulVar != null) {
                return akulVar;
            }
            final akul aj = aktp.aj(new ikm(this, 17), this.l);
            final akul ai = aktp.ai(new qpk(this, messageIdType, 9, null), this.l);
            akul i = aktp.ap(aj, ai).i(new ancr() { // from class: ryw
                @Override // defpackage.ancr
                public final ListenableFuture a() {
                    akul akulVar2 = ai;
                    ryx ryxVar = ryx.this;
                    aozy S = ryxVar.p.S("Bugle");
                    ypl yplVar = (ypl) albo.bQ(akulVar2);
                    aozy createBuilder = apzn.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apzn apznVar = (apzn) createBuilder.b;
                    aqgb aqgbVar = (aqgb) S.s();
                    aqgbVar.getClass();
                    apznVar.c = aqgbVar;
                    apznVar.b |= 1;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((apzn) createBuilder.b).d = a.am(3);
                    aozy createBuilder2 = apzm.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    String str2 = str;
                    apzm apzmVar = (apzm) createBuilder2.b;
                    str2.getClass();
                    apzmVar.b = 1;
                    apzmVar.c = str2;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apzn apznVar2 = (apzn) createBuilder.b;
                    apzm apzmVar2 = (apzm) createBuilder2.s();
                    apzmVar2.getClass();
                    apznVar2.e = apzmVar2;
                    apznVar2.b |= 2;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((apzn) createBuilder.b).f = a.ak(4);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    ((apzn) apagVar).g = true;
                    String str3 = yplVar.c;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar2 = createBuilder.b;
                    str3.getClass();
                    ((apzn) apagVar2).j = str3;
                    String str4 = yplVar.b;
                    if (!apagVar2.isMutable()) {
                        createBuilder.u();
                    }
                    apzn apznVar3 = (apzn) createBuilder.b;
                    str4.getClass();
                    apznVar3.i = str4;
                    float a2 = yplVar.a.a();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    akul akulVar3 = aj;
                    ((apzn) createBuilder.b).h = a2;
                    Optional optional = (Optional) albo.bQ(akulVar3);
                    if (optional.isPresent()) {
                        aozy createBuilder3 = aqge.a.createBuilder();
                        aozy createBuilder4 = aqgd.a.createBuilder();
                        aozb x = aozb.x((String) optional.get(), StandardCharsets.US_ASCII);
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        ((aqgd) createBuilder4.b).b = x;
                        int intValue = ((Integer) ynr.a.e()).intValue();
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        ((aqgd) createBuilder4.b).c = intValue;
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        aqge aqgeVar = (aqge) createBuilder3.b;
                        aqgd aqgdVar = (aqgd) createBuilder4.s();
                        aqgdVar.getClass();
                        aqgeVar.c = aqgdVar;
                        aqgeVar.b = 1 | aqgeVar.b;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apzn apznVar4 = (apzn) createBuilder.b;
                        aqge aqgeVar2 = (aqge) createBuilder3.s();
                        aqgeVar2.getClass();
                        apznVar4.k = aqgeVar2;
                        apznVar4.b |= 4;
                    }
                    xvz xvzVar = (xvz) ryxVar.c.b();
                    apzn apznVar5 = (apzn) createBuilder.s();
                    long intValue2 = ((Integer) lec.a.e()).intValue();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    aqav a3 = xvzVar.a();
                    if (a3 == null) {
                        return aktp.af(new Exception("Cannot initialize smart messaging stub."));
                    }
                    xvz.a.o("RPC: Fetching link preview");
                    aqav aqavVar = (aqav) a3.h(intValue2, timeUnit);
                    aqrs aqrsVar = aqavVar.a;
                    aqux aquxVar = aqaw.a;
                    if (aquxVar == null) {
                        synchronized (aqaw.class) {
                            aquxVar = aqaw.a;
                            if (aquxVar == null) {
                                aquu a4 = aqux.a();
                                a4.e = aquw.UNARY;
                                a4.a = aqux.c("google.internal.communications.instantmessaging.v1.SmartMessaging", "GetContentDecoration");
                                a4.b();
                                apzn apznVar6 = apzn.a;
                                aozs aozsVar = arkx.a;
                                a4.c = new arkw(apznVar6);
                                a4.d = new arkw(apzo.a);
                                aquxVar = a4.a();
                                aqaw.a = aquxVar;
                            }
                        }
                    }
                    return akul.g(arlj.a(aqrsVar.a(aquxVar, aqavVar.b), apznVar5));
                }
            }, this.m);
            int i2 = 5;
            akul h = i.h(new rgh(i2), andi.a);
            this.o.n(concat, h);
            h.k(new ydv(new rge(this, concat, 4), new rge(this, concat, i2), 0), andi.a);
            return h;
        }
    }

    public final boolean c(ssi ssiVar) {
        if (this.b.f().toEpochMilli() >= ssiVar.h()) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            aktp.ag(null);
        } else {
            aktp.ah(new ryv(this, str, 0), this.l);
        }
    }

    public final void f(MessageCoreData messageCoreData, int i, int i2) {
        aozy createBuilder = amfw.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amfw amfwVar = (amfw) apagVar;
        amfwVar.c = i - 1;
        amfwVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amfw amfwVar2 = (amfw) createBuilder.b;
        amfwVar2.d = a.an(2);
        amfwVar2.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfw amfwVar3 = (amfw) createBuilder.b;
        amfwVar3.e = a.an(2);
        amfwVar3.b |= 4;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfw amfwVar4 = (amfw) createBuilder.b;
        amfwVar4.f = a.an(2);
        amfwVar4.b |= 8;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfw amfwVar5 = (amfw) createBuilder.b;
        amfwVar5.g = a.an(2);
        amfwVar5.b |= 16;
        if (((Boolean) utw.w.e()).booleanValue()) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amfw amfwVar6 = (amfw) createBuilder.b;
            amfwVar6.h = i2 - 1;
            amfwVar6.b |= 32;
        }
        amfw amfwVar7 = (amfw) createBuilder.s();
        aozy createBuilder2 = amem.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        amem amemVar = (amem) apagVar2;
        amemVar.c = aqas.f(5);
        amemVar.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        amem amemVar2 = (amem) createBuilder2.b;
        amfwVar7.getClass();
        amemVar2.g = amfwVar7;
        amemVar2.b |= 16;
        amem amemVar3 = (amem) createBuilder2.s();
        boolean equals = Objects.equals(messageCoreData.aw(), ((SelfIdentityIdImpl) messageCoreData.v()).a);
        if (!((Boolean) lec.b.e()).booleanValue()) {
            if (equals) {
                ((mho) this.g.b()).E(messageCoreData, amemVar3);
            } else {
                ((mho) this.g.b()).D(messageCoreData, amemVar3);
            }
        }
        if (i == 11 && ((Boolean) utw.w.e()).booleanValue() && !((Boolean) lec.c.e()).booleanValue()) {
            this.h.c("Bugle.Share.WebLinkPreview.CreateManualPreviewButton");
        }
    }
}
