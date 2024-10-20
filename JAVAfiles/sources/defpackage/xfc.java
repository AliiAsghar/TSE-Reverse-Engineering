package defpackage;

import j$.util.StringJoiner;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xfc implements pss {
    public static final qeg a;
    public static final alwo b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final anen k;
    public final armf l;
    public final armf m;
    public final armf n;
    private final armf o;
    private final aneo p;

    static {
        aozy createBuilder = qeg.a.createBuilder();
        qef qefVar = qef.PENDING;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qeg qegVar = (qeg) createBuilder.b;
        qegVar.c = qefVar.f;
        qegVar.b |= 1;
        a = (qeg) createBuilder.s();
        b = alwo.o("BugleTachygram");
    }

    public xfc(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, aneo aneoVar, anen anenVar, armf armfVar12) {
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = armfVar6;
        this.i = armfVar7;
        this.o = armfVar8;
        this.k = anenVar;
        this.l = armfVar10;
        this.j = armfVar9;
        this.m = armfVar11;
        this.p = aneoVar;
        this.n = armfVar12;
    }

    public static uta i(String str) {
        return new uta(str, null, null, null, null, null);
    }

    @Override // defpackage.pss
    public final akul a(qec qecVar) {
        return aktp.ai(new vze(this, qecVar, 20, null), this.k);
    }

    @Override // defpackage.pss
    public final akul b(qen qenVar) {
        return aktp.ai(new xfb(this, qenVar, 0), this.k);
    }

    @Override // defpackage.pss
    public final akul c(qfy qfyVar) {
        return aktp.ai(new xfb(this, qfyVar, 1), this.k);
    }

    @Override // defpackage.pss
    public final akul d(qgb qgbVar) {
        return aktp.ai(new vze(this, qgbVar, 17, null), this.k);
    }

    @Override // defpackage.pss
    public final akul e(qgf qgfVar) {
        akrh e = aktp.e("TachygramOutgoingChatApi::sendMessage");
        try {
            wpp wppVar = (wpp) this.j.b();
            if ((qgfVar.b & 512) != 0) {
                qgr qgrVar = qgfVar.l;
                if (qgrVar == null) {
                    qgrVar = qgr.a;
                }
                wppVar.l(qgrVar, rve.a(qgfVar.f), 5);
            }
            akul ai = aktp.ai(new xfb(this, qgfVar, 2), this.p);
            e.b(ai);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.pss
    public final akul f(qgt qgtVar) {
        return aktp.ai(new vze(this, qgtVar, 19, null), this.k);
    }

    @Override // defpackage.pss
    public final akul g(qgw qgwVar) {
        return aktp.ai(new vze(this, qgwVar, 18, null), this.k);
    }

    public final uta h(qgf qgfVar) {
        StringJoiner stringJoiner = new StringJoiner(",");
        qei qeiVar = qgfVar.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        StringJoiner add = stringJoiner.add("conversation: ".concat(String.valueOf(j(qeiVar, qgfVar.g))));
        qft qftVar = qgfVar.k;
        if (qftVar == null) {
            qftVar = qft.a;
        }
        qfs b2 = qfs.b(qftVar.c);
        if (b2 == null) {
            b2 = qfs.UNKNOWN_MESSAGE_SOURCE;
        }
        StringJoiner add2 = add.add("messageSource: " + b2.d);
        qft qftVar2 = qgfVar.k;
        if (qftVar2 == null) {
            qftVar2 = qft.a;
        }
        qfr b3 = qfr.b(qftVar2.d);
        if (b3 == null) {
            b3 = qfr.UNKNOWN_MESSAGE_PRIORITY;
        }
        return new uta(add2.add("messagePriority: " + b3.e).toString(), "sendMessage-pwq-dedupe-tag:".concat(String.valueOf(qgfVar.f)), null, null, null, null);
    }

    public final String j(qei qeiVar, String str) {
        qeh b2 = qeh.b(qeiVar.c);
        if (b2 == null) {
            b2 = qeh.UNKNOWN_TYPE;
        }
        if (b2.equals(qeh.GROUP)) {
            return str;
        }
        return Long.toString(((lzz) this.o.b()).b(qeiVar.d));
    }
}
