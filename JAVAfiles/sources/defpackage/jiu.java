package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jiu {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver");
    public final Context b;
    public final arpi c;
    public final arpi d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final orj h;
    public final jjl i;
    public final oxc j;
    public final obm k;
    public final pcm l;
    public final armf m;
    public final asai n;
    public final asai o;
    public final asai p;
    public final asai q;
    public final asai r;
    private final asai s;
    private final asai t;
    private final asai u;
    private final asai v;
    private final asai w;

    public jiu(Context context, asai asaiVar, asai asaiVar2, jxv jxvVar, arpi arpiVar, arpi arpiVar2, armf armfVar, armf armfVar2, @oqd armf armfVar3, armf armfVar4, orj orjVar, jjl jjlVar, oxc oxcVar, obm obmVar, pcm pcmVar, armf armfVar5) {
        asai aghwVar;
        asai a2;
        context.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        jxvVar.getClass();
        arpiVar.getClass();
        arpiVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        orjVar.getClass();
        obmVar.getClass();
        armfVar5.getClass();
        this.b = context;
        this.c = arpiVar;
        this.d = arpiVar2;
        this.e = armfVar;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = orjVar;
        this.i = jjlVar;
        this.j = oxcVar;
        this.k = obmVar;
        this.l = pcmVar;
        this.m = armfVar5;
        asai a3 = asar.a(new ifm(asaiVar2, 13));
        this.s = a3;
        if (((Boolean) ((utz) yig.U.get()).e()).booleanValue()) {
            Object b = armfVar2.b();
            b.getClass();
            a2 = asar.a(new jdn(a3, (asai) b, new jrw((arpe) null, 1, (byte[]) null), 17, null));
        } else {
            if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
                aghwVar = (asai) armfVar2.b();
            } else {
                aghwVar = new aghw(false, 9);
            }
            aghwVar.getClass();
            a2 = asar.a(aghwVar);
        }
        this.t = a2;
        asai a4 = asar.a(new ifm(asaiVar2, 14));
        this.u = a4;
        asai a5 = asar.a(new ifm(asaiVar, 15));
        this.v = a5;
        this.n = asar.a(new idx(armd.m(arrn.P(asar.a(new ifm(asaiVar, 16)), asar.a(new ifm(asaiVar, 17)), asar.a(new ifm(jxvVar.a, 18)), new jid(null))), this, 11));
        asai a6 = asar.a(new asdn(new idw((arpe) null, this, 6), asar.a(arrn.P(a5, a4, asar.a(new ifm(jxvVar.a, 19)), new jit(this, (arpe) null, 0)))));
        this.w = a6;
        asai a7 = asar.a(arrn.R(a5, a4, a6, asar.a(new ifm(jxvVar.a, 20)), a2, new jis(this, null)));
        this.o = a7;
        this.p = asar.a(new ifm(new jdn(a7, jxvVar.a, new igb(this, (arpe) null, 6), 17, null), 12));
        this.q = asar.a(new jdn(a4, a5, new idw(this, (arpe) null, 5), 17, null));
        this.r = asar.a(new asaa(new gbz(asaiVar, this, (arpe) null, 5)));
    }

    public static final jjd a(mit mitVar, jht jhtVar, jjk jjkVar) {
        if (!jjkVar.a && !jjkVar.b) {
            boolean z = jjkVar.c;
            mjq mjqVar = jhtVar.c;
            int i = jhtVar.e;
            if (mjqVar.g) {
                if (i == 3 && z) {
                    alvw f = a.f();
                    f.X(alwp.a, "BugleComposeRow2");
                    ((alvg) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForRichTransportFeatureSet", 555, "MapiTransportCapabilityResolver.kt")).q("Forcing MMS since media attachments not supported in RCS and draft contains attachments.");
                    return jiy.b;
                }
                alvw f2 = a.f();
                f2.X(alwp.a, "BugleComposeRow2");
                ((alvg) f2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForRichTransportFeatureSet", 563, "MapiTransportCapabilityResolver.kt")).t("Using RCS due to its best available transport feature set %s.", mjqVar);
                return jiy.a;
            }
            if (mjqVar == mjq.SATELLITE) {
                return new jiz((byte[]) null);
            }
            if (mjqVar == mjq.SIMPLE) {
                if (z) {
                    alvw f3 = a.f();
                    f3.X(alwp.a, "BugleComposeRow2");
                    ((alvg) f3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForSimpleTransportFeatureSet", 578, "MapiTransportCapabilityResolver.kt")).q("Upgrading to MMS since draft contains attachments.");
                    return jiy.b;
                }
                mit mitVar2 = mit.GROUP;
                if (mitVar == mitVar2 && i == 2) {
                    alvw f4 = a.f();
                    f4.X(alwp.a, "BugleComposeRow2");
                    ((alvg) f4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForSimpleTransportFeatureSet", 582, "MapiTransportCapabilityResolver.kt")).q("Using SMS since we are sending as mass sms.");
                    return new jja((byte[]) null);
                }
                if (mitVar != mitVar2) {
                    return null;
                }
                alvw f5 = a.f();
                f5.X(alwp.a, "BugleComposeRow2");
                ((alvg) f5.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForSimpleTransportFeatureSet", 586, "MapiTransportCapabilityResolver.kt")).q("Upgrading to MMS since its a group conversation.");
                return jiy.b;
            }
            throw new IllegalStateException("Check failed.");
        }
        alvw f6 = a.f();
        f6.X(alwp.a, "BugleComposeRow2");
        ((alvg) f6.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "calculateTransportBeforeSimpleMessageProperties", BasePaymentResult.ERROR_REQUEST_FAILED, "MapiTransportCapabilityResolver.kt")).q("Forcing MMS since draft contains subject or is urgent.");
        return jiy.b;
    }

    public static final asai b(jjd jjdVar, asai asaiVar) {
        if (!d.F(jjdVar, jiy.b) && !d.F(jjdVar, jiy.a)) {
            if (jjdVar instanceof jiz) {
                return new ifm(asaiVar, 11);
            }
            if (!(jjdVar instanceof jjc) && jjdVar != null) {
                throw new armm();
            }
            return new jdn(asaiVar, new arsb(), jjdVar, 3, null);
        }
        return new aghw(jjdVar, 9);
    }
}
