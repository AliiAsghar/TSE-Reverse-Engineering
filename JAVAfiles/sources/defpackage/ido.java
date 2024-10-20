package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ido {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/backup/analytics/D2DEventLogger");
    public final armf b;
    public final arwe c;

    public ido(armf armfVar, arwe arweVar) {
        armfVar.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.c = arweVar;
    }

    public static final amus a(int i, int i2, int i3) {
        aozy createBuilder = amus.a.createBuilder();
        createBuilder.getClass();
        int cG = yyb.cG(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amus amusVar = (amus) createBuilder.b;
        amusVar.c = cG - 1;
        amusVar.b |= 1;
        int cG2 = yyb.cG(i2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amus amusVar2 = (amus) createBuilder.b;
        amusVar2.d = cG2 - 1;
        amusVar2.b |= 2;
        int cG3 = yyb.cG(i3);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amus amusVar3 = (amus) createBuilder.b;
        amusVar3.e = cG3 - 1;
        amusVar3.b |= 4;
        apag s = createBuilder.s();
        s.getClass();
        return (amus) s;
    }

    public static /* synthetic */ void b(ido idoVar, int i, int i2, UUID uuid, abnf abnfVar, int i3) {
        abnf abnfVar2;
        if ((i3 & 64) != 0) {
            abnfVar2 = null;
        } else {
            abnfVar2 = abnfVar;
        }
        qjh.l(idoVar.c, null, new idm(idoVar, i, i2, uuid, abnfVar2, null), 3);
    }

    public static /* synthetic */ void c(ido idoVar, int i, Duration duration, int i2, int i3, int i4, UUID uuid, abnf abnfVar, int i5) {
        abnf abnfVar2;
        int i6;
        int i7;
        int i8;
        uuid.getClass();
        if ((i5 & 64) != 0) {
            abnfVar2 = null;
        } else {
            abnfVar2 = abnfVar;
        }
        if ((i5 & 16) != 0) {
            i6 = 0;
        } else {
            i6 = i4;
        }
        if ((i5 & 8) != 0) {
            i7 = 0;
        } else {
            i7 = i3;
        }
        if ((i5 & 4) != 0) {
            i8 = 0;
        } else {
            i8 = i2;
        }
        qjh.l(idoVar.c, null, new idn(idoVar, i, duration, i8, i7, i6, uuid, abnfVar2, null), 3);
    }
}
