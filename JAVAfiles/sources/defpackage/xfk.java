package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xfk implements xfe {
    public final xgj a;
    public final armf b;
    public final anen c;
    public final armf d;
    public final wpp e;
    private final armf f;
    private final psz g;
    private final msk h;
    private final psw i;
    private final armf j;
    private final armf k;

    public xfk(xgj xgjVar, armf armfVar, armf armfVar2, anen anenVar, psz pszVar, msk mskVar, wpp wppVar, psw pswVar, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.a = xgjVar;
        this.b = armfVar;
        this.f = armfVar2;
        this.c = anenVar;
        this.g = pszVar;
        this.h = mskVar;
        this.e = wppVar;
        this.i = pswVar;
        this.j = armfVar3;
        this.d = armfVar4;
        this.k = armfVar5;
    }

    private static String c(qel qelVar) {
        return ((ContentType) new pwb().fu(qelVar)).toString();
    }

    private static boolean j(qft qftVar) {
        qfs b = qfs.b(qftVar.c);
        if (b == null) {
            b = qfs.UNKNOWN_MESSAGE_SOURCE;
        }
        if (b.equals(qfs.USER)) {
            qfr b2 = qfr.b(qftVar.d);
            if (b2 == null) {
                b2 = qfr.UNKNOWN_MESSAGE_PRIORITY;
            }
            if (b2.equals(qfr.HIGH) && !qftVar.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.xfe
    public final /* synthetic */ qei a(Object obj) {
        qei qeiVar = ((qgf) obj).d;
        if (qeiVar == null) {
            return qei.a;
        }
        return qeiVar;
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ qei b(Object obj) {
        qgf qgfVar = (qgf) obj;
        boolean z = true;
        if (1 != (qgfVar.b & 1)) {
            z = false;
        }
        d.t(z, "Self identity is missing in SendChatMessageRequest");
        qei qeiVar = qgfVar.c;
        if (qeiVar == null) {
            return qei.a;
        }
        return qeiVar;
    }

    @Override // defpackage.xfe
    public final /* synthetic */ akul d(Object obj) {
        boolean z;
        int i;
        akul h;
        qgf qgfVar = (qgf) obj;
        if ((qgfVar.b & 512) != 0) {
            qgr qgrVar = qgfVar.l;
            if (qgrVar == null) {
                qgrVar = qgr.a;
            }
            this.e.l(qgrVar, rve.a(qgfVar.f), 10);
        }
        akrh e = aktp.e("TachyramSendMessage::convert");
        try {
            xeb xebVar = new xeb();
            qej qejVar = qgfVar.i;
            if (qejVar == null) {
                qejVar = qej.a;
            }
            anja anjaVar = (anja) xebVar.fu(qejVar);
            e.close();
            boolean z2 = false;
            if (1 != (qgfVar.b & 1)) {
                z = false;
            } else {
                z = true;
            }
            d.s(z);
            int i2 = 2;
            if ((qgfVar.b & 2) != 0) {
                z2 = true;
            }
            d.s(z2);
            qei qeiVar = qgfVar.c;
            if (qeiVar == null) {
                qeiVar = qei.a;
            }
            qei qeiVar2 = qgfVar.d;
            alwl alwlVar = (alwl) xfl.a.g();
            alwlVar.X(ydl.a, qgfVar.f);
            alwlVar.X(ydl.o, qgfVar.g);
            alvz alvzVar = ydl.w;
            qej qejVar2 = qgfVar.i;
            if (qejVar2 == null) {
                qejVar2 = qej.a;
            }
            qel qelVar = qejVar2.c;
            if (qelVar == null) {
                qelVar = qel.a;
            }
            alwlVar.X(alvzVar, c(qelVar));
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "executeRequest", 208, "TachygramSendMessageWorkHandler.java")).q("Sending message.");
            e = aktp.e("TachygramSendMessage::createMessageMetadata_v2");
            try {
                anjv ay = albo.ay();
                int i3 = vzo.a;
                qft qftVar = qgfVar.k;
                if (qftVar == null) {
                    qftVar = qft.a;
                }
                qfr b = qfr.b(qftVar.d);
                if (b == null) {
                    b = qfr.UNKNOWN_MESSAGE_PRIORITY;
                }
                int ordinal = b.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            i = 1;
                        } else {
                            throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(b))));
                        }
                    } else {
                        i = 3;
                    }
                } else {
                    i = 2;
                }
                ay.g(i);
                qft qftVar2 = qgfVar.k;
                if (qftVar2 == null) {
                    qftVar2 = qft.a;
                }
                qfr b2 = qfr.b(qftVar2.d);
                if (b2 == null) {
                    b2 = qfr.UNKNOWN_MESSAGE_PRIORITY;
                }
                if (b2.equals(qfr.LOW)) {
                    i2 = 4;
                } else {
                    qfr b3 = qfr.b(qftVar2.d);
                    if (b3 == null) {
                        b3 = qfr.UNKNOWN_MESSAGE_PRIORITY;
                    }
                    if (!b3.equals(qfr.NORMAL)) {
                        qfs b4 = qfs.b(qftVar2.c);
                        if (b4 == null) {
                            b4 = qfs.UNKNOWN_MESSAGE_SOURCE;
                        }
                        int ordinal2 = b4.ordinal();
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(b4))));
                            }
                        }
                    }
                    i2 = 3;
                }
                ay.h(i2);
                apwq apwqVar = qgfVar.h;
                if (apwqVar == null) {
                    apwqVar = apwq.a;
                }
                alob alobVar = new alob();
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(apwqVar.b).entrySet()) {
                    String str = (String) entry.getKey();
                    for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((apws) entry.getValue()).b).entrySet()) {
                        String str2 = (String) entry2.getKey();
                        String str3 = (String) entry2.getValue();
                        str.getClass();
                        str2.getClass();
                        str3.getClass();
                        alobVar.h(new anju(str, str2, str3));
                    }
                }
                ay.b(alobVar.g());
                xei xeiVar = new xei();
                qei qeiVar3 = qgfVar.c;
                if (qeiVar3 == null) {
                    qeiVar3 = qei.a;
                }
                ay.f((aqfn) xeiVar.fu(qeiVar3));
                ay.d(qgfVar.f);
                if ((qgfVar.b & 512) != 0) {
                    qgr qgrVar2 = qgfVar.l;
                    if (qgrVar2 == null) {
                        qgrVar2 = qgr.a;
                    }
                    ay.a = new anix(qgrVar2.c);
                    ay.b = (byte) (ay.b | Byte.MIN_VALUE);
                }
                if (((Boolean) ((utz) yig.U.get()).e()).booleanValue()) {
                    Iterator it = ((Set) ((apxx) this.k).a).iterator();
                    while (it.hasNext()) {
                        ((xeh) it.next()).a();
                    }
                }
                if ((qgfVar.b & 4) != 0) {
                    xei xeiVar2 = new xei();
                    qei qeiVar4 = qgfVar.e;
                    if (qeiVar4 == null) {
                        qeiVar4 = qei.a;
                    }
                    ay.e((aqfn) xeiVar2.fu(qeiVar4));
                    h = ((wpp) this.f.b()).g(qgfVar.g).h(new xeu(ay, 9), this.c);
                } else {
                    wpp wppVar = (wpp) this.f.b();
                    qei qeiVar5 = qgfVar.d;
                    if (qeiVar5 == null) {
                        qeiVar5 = qei.a;
                    }
                    h = wppVar.f(qeiVar5, qgfVar.g).h(new xeu(ay, 10), this.c);
                }
                akul h2 = h.h(new xdh(13), this.c);
                e.b(h2);
                e.close();
                return h2.i(new vwx(this, qeiVar, anjaVar, 15), this.c);
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ akul e(Object obj, qeg qegVar) {
        qgf qgfVar = (qgf) obj;
        alwl alwlVar = (alwl) xfl.a.i();
        alwlVar.X(ydl.a, qgfVar.f);
        alwlVar.X(ydl.o, qgfVar.g);
        alvz alvzVar = qas.b;
        qef b = qef.b(qegVar.c);
        if (b == null) {
            b = qef.UNKNOWN_STATUS;
        }
        alwlVar.X(alvzVar, b);
        alvz alvzVar2 = ydl.w;
        qej qejVar = qgfVar.i;
        if (qejVar == null) {
            qejVar = qej.a;
        }
        qel qelVar = qejVar.c;
        if (qelVar == null) {
            qelVar = qel.a;
        }
        alwlVar.X(alvzVar2, c(qelVar));
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "onFailure", 277, "TachygramSendMessageWorkHandler.java")).q("TachygramTransport has failed to send the message.");
        this.e.i(qgfVar);
        qco qcoVar = (qco) this.b.b();
        aozb aozbVar = qgfVar.j;
        aozy createBuilder = qgg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qgg qggVar = (qgg) apagVar;
        aozbVar.getClass();
        qggVar.b |= 2;
        qggVar.d = aozbVar;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar2 = (qgg) createBuilder.b;
        qegVar.getClass();
        qggVar2.c = qegVar;
        qggVar2.b |= 1;
        amgu cL = yyb.cL();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar3 = (qgg) createBuilder.b;
        cL.getClass();
        qggVar3.h = cL;
        qggVar3.b |= 32;
        return qcoVar.i((qgg) createBuilder.s()).h(new whh(this, qgfVar, 16), this.c);
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ akul f(Object obj, Object obj2) {
        akul h;
        qgf qgfVar = (qgf) obj;
        anks anksVar = (anks) obj2;
        alwl alwlVar = (alwl) xfl.a.g();
        alwlVar.X(ydl.a, qgfVar.f);
        alwlVar.X(ydl.o, qgfVar.g);
        alvz alvzVar = ydl.w;
        qej qejVar = qgfVar.i;
        if (qejVar == null) {
            qejVar = qej.a;
        }
        qel qelVar = qejVar.c;
        if (qelVar == null) {
            qelVar = qel.a;
        }
        alwlVar.X(alvzVar, c(qelVar));
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "onSuccess", 240, "TachygramSendMessageWorkHandler.java")).q("TachygramTransport has successfully processed message sending.");
        this.e.i(qgfVar);
        boolean z = false;
        if (this.i.a()) {
            qei qeiVar = qgfVar.d;
            if (qeiVar == null) {
                qeiVar = qei.a;
            }
            qeh b = qeh.b(qeiVar.c);
            if (b == null) {
                b = qeh.UNKNOWN_TYPE;
            }
            if (!b.equals(qeh.PHONE)) {
                alwl alwlVar2 = (alwl) xfl.a.g();
                alwlVar2.X(qas.c, b);
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "revocationSupportedAsync", 448, "TachygramSendMessageWorkHandler.java")).q("Message revocation not supported. We are not talking to a one to one recipient.");
                h = aktp.ag(false);
            } else {
                qft qftVar = qgfVar.k;
                if (qftVar == null) {
                    qftVar = qft.a;
                }
                if (j(qftVar)) {
                    h = aktp.ag(true);
                } else {
                    qsa qsaVar = (qsa) this.j.b();
                    qei qeiVar2 = qgfVar.d;
                    if (qeiVar2 == null) {
                        qeiVar2 = qei.a;
                    }
                    h = qsaVar.c(qeiVar2).h(new xdh(12), this.c);
                }
            }
            return h.h(new whh(qgfVar, anksVar, 19, null), this.c).i(new wgb(this, 17), this.c).h(new whh(this, qgfVar, 17), this.c);
        }
        qco qcoVar = (qco) this.b.b();
        aozy createBuilder = qgg.a.createBuilder();
        aozb aozbVar = qgfVar.j;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar = (qgg) createBuilder.b;
        aozbVar.getClass();
        qggVar.b |= 2;
        qggVar.d = aozbVar;
        aozy createBuilder2 = qeg.a.createBuilder();
        qef qefVar = qef.OK;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qeg qegVar = (qeg) createBuilder2.b;
        qegVar.c = qefVar.f;
        qegVar.b |= 1;
        qeg qegVar2 = (qeg) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar2 = (qgg) createBuilder.b;
        qegVar2.getClass();
        qggVar2.c = qegVar2;
        qggVar2.b |= 1;
        apct j = aotl.j(anksVar.a);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar3 = (qgg) createBuilder.b;
        j.getClass();
        qggVar3.e = j;
        qggVar3.b |= 4;
        amgu cL = yyb.cL();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar4 = (qgg) createBuilder.b;
        cL.getClass();
        qggVar4.h = cL;
        qggVar4.b |= 32;
        qei qeiVar3 = qgfVar.d;
        if (qeiVar3 == null) {
            qeiVar3 = qei.a;
        }
        qeh b2 = qeh.b(qeiVar3.c);
        if (b2 == null) {
            b2 = qeh.UNKNOWN_TYPE;
        }
        if (!qeh.PHONE.equals(b2)) {
            alwl alwlVar3 = (alwl) xfl.a.g();
            alwlVar3.X(qas.c, b2);
            ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "revocationSupported", 486, "TachygramSendMessageWorkHandler.java")).q("Message revocation not supported. We are not talking to a one to one recipient.");
        } else {
            qft qftVar2 = qgfVar.k;
            if (qftVar2 == null) {
                qftVar2 = qft.a;
            }
            if (j(qftVar2)) {
                z = true;
            } else {
                try {
                    psz pszVar = this.g;
                    msk mskVar = this.h;
                    qei qeiVar4 = qgfVar.d;
                    if (qeiVar4 == null) {
                        qeiVar4 = qei.a;
                    }
                    Optional f = pszVar.f(mskVar.b(qeiVar4));
                    if (f.isEmpty()) {
                        ((alwl) ((alwl) xfl.a.i()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "revocationSupported", 508, "TachygramSendMessageWorkHandler.java")).q("Unable to determine whether message revocation is supported because there is no cached capabilities for the remote party.");
                    } else {
                        z = ((psv) f.get()).j();
                        ((alwl) ((alwl) xfl.a.g()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "revocationSupported", 515, "TachygramSendMessageWorkHandler.java")).t("Is message revocation supported based on remote party's capabilities: %b", Boolean.valueOf(z));
                    }
                } catch (psx e) {
                    ((alwl) ((alwl) ((alwl) xfl.a.i()).g(e)).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "revocationSupported", (char) 501, "TachygramSendMessageWorkHandler.java")).q("Unable to determine whether message revocation is supported because we could not retrieve cached capabilities for remote party.");
                }
            }
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar5 = (qgg) createBuilder.b;
        qggVar5.b |= 8;
        qggVar5.f = z;
        return qcoVar.i((qgg) createBuilder.s()).h(new whh(this, qgfVar, 18), this.c);
    }

    @Override // defpackage.xfe
    public final /* bridge */ /* synthetic */ String g(Object obj) {
        qgf qgfVar = (qgf) obj;
        qei qeiVar = qgfVar.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        albo.U(b.equals(qeh.GROUP), "getRcsGroupId called on a non-group operation.");
        return qgfVar.g;
    }

    @Override // defpackage.xfe
    public final String h() {
        return "TachygramSendMessageOperation";
    }

    @Override // defpackage.xfe
    public final boolean i() {
        return true;
    }
}
