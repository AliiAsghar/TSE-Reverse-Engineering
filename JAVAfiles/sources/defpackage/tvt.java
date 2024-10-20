package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvt implements rth {
    public static final xze a = xze.g("BugleEtouffee", "RemoteInstanceSetupImpl");
    public static final utz b = uuh.r(165096879, "remote_instance_setup_passes_up_exception");
    public final apwt c;
    public final tvr d;
    public final ttb e;
    public final anen f;
    public final anen g;
    public final armf h;
    public final armf i;
    public final uac j;
    public final iji k;
    public final iew l;
    public final zai m;
    private final armf n;
    private final armf o;
    private final anen p;

    public tvt(apwt apwtVar, armf armfVar, tvr tvrVar, iji ijiVar, uac uacVar, zai zaiVar, ttb ttbVar, armf armfVar2, anen anenVar, anen anenVar2, anen anenVar3, iew iewVar, armf armfVar3, armf armfVar4) {
        this.c = apwtVar;
        this.n = armfVar;
        this.d = tvrVar;
        this.k = ijiVar;
        this.j = uacVar;
        this.m = zaiVar;
        this.e = ttbVar;
        this.o = armfVar2;
        this.f = anenVar;
        this.p = anenVar2;
        this.g = anenVar3;
        this.l = iewVar;
        this.h = armfVar3;
        this.i = armfVar4;
    }

    private static boolean h(boolean z, qei qeiVar, String str) {
        if (z) {
            if (qeiVar == null || TextUtils.isEmpty(qeiVar.d)) {
                return true;
            }
            return false;
        }
        return TextUtils.isEmpty(str);
    }

    @Override // defpackage.rth
    public final akul a(String str, String str2) {
        return this.e.b(str).h(new raw(this, str2, 14), this.g);
    }

    @Override // defpackage.rth
    public final akul b(String str, qei qeiVar, String str2, qei qeiVar2, amkd amkdVar) {
        alog alogVar;
        if (h(((Boolean) new mss(11).get()).booleanValue(), qeiVar2, str2)) {
            a.q("Missing normalized destination when trying to download remote instance.");
            return aktp.ag(new gsu());
        }
        alog r = alog.r(str2);
        if (((Boolean) new mss(11).get()).booleanValue() && qeiVar2 != null) {
            alogVar = alog.r(qeiVar2);
        } else {
            alogVar = null;
        }
        return c(str, qeiVar, r, alogVar, amkdVar);
    }

    @Override // defpackage.rth
    public final akul c(String str, qei qeiVar, Iterable iterable, Iterable iterable2, amkd amkdVar) {
        String str2;
        boolean booleanValue = ((Boolean) new mss(11).get()).booleanValue();
        if (str != null && !h(booleanValue, qeiVar, str)) {
            ttj ttjVar = (ttj) this.n.b();
            if (booleanValue && qeiVar != null && (qeiVar.b & 2) != 0) {
                str2 = qeiVar.d;
            } else {
                str2 = str;
            }
            return ttjVar.b(str2).i(new qcf(this, str, iterable, amkdVar, iterable2, 6), this.p).f(Throwable.class, new jab(18), this.f);
        }
        a.q("Local phone number is not available when trying to download remote instance.");
        return aktp.ag(new gsu());
    }

    @Override // defpackage.rth
    public final akul d(String str, qei qeiVar, altk altkVar, altk altkVar2, ConversationIdType conversationIdType) {
        boolean booleanValue = ((Boolean) new mss(11).get()).booleanValue();
        if (str != null && !h(booleanValue, qeiVar, str)) {
            akrh e = aktp.e("RemoteInstanceSetupImpl#setupScytaleSessions");
            try {
                akul e2 = aktp.aj(new tvp(this, str, qeiVar, altkVar, altkVar2, 2), this.g).h(new tvs(this, booleanValue, altkVar2, altkVar, conversationIdType, 1), this.g).e(aqwb.class, new tvs(this, booleanValue, altkVar2, altkVar, conversationIdType, 0), this.p);
                e.b(e2);
                e.close();
                return e2;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        a.q("Local phone number is not available when trying to set up Scytale session.");
        return aktp.ag(null);
    }

    @Override // defpackage.rth
    public final void e(String str, qei qeiVar, boolean z, amkd amkdVar) {
        if (true != ((Boolean) new mss(11).get()).booleanValue()) {
            qeiVar = null;
        }
        this.d.e(null, qeiVar, str, z, amkdVar);
    }

    @Override // defpackage.rth
    public final void f(ConversationIdType conversationIdType, int i, uax uaxVar) {
        ((tsa) this.o.b()).j(conversationIdType, i, uaxVar);
    }

    @Override // defpackage.rth
    public final boolean g(String str) {
        return this.d.g(str);
    }
}
