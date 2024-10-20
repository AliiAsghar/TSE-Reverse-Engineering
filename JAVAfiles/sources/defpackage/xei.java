package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xei extends xdy {
    @Override // defpackage.xdy
    public final void c(aqfn aqfnVar, aozy aozyVar) {
        asku b = asku.b(aqfnVar.b);
        if (b == null) {
            b = asku.UNRECOGNIZED;
        }
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 10) {
                if (ordinal != 41) {
                    asku b2 = asku.b(aqfnVar.b);
                    if (b2 == null) {
                        b2 = asku.UNRECOGNIZED;
                    }
                    throw new IllegalArgumentException("Unknown enum value: " + b2.a());
                }
                qeh qehVar = qeh.UNKNOWN_TYPE;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                qei qeiVar = (qei) aozyVar.b;
                qei qeiVar2 = qei.a;
                qeiVar.c = qehVar.e;
                qeiVar.b |= 1;
                return;
            }
            qeh qehVar2 = qeh.BOT;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            qei qeiVar3 = (qei) aozyVar.b;
            qei qeiVar4 = qei.a;
            qeiVar3.c = qehVar2.e;
            qeiVar3.b |= 1;
            return;
        }
        qeh qehVar3 = qeh.PHONE;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        qei qeiVar5 = (qei) aozyVar.b;
        qei qeiVar6 = qei.a;
        qeiVar5.c = qehVar3.e;
        qeiVar5.b |= 1;
    }

    @Override // defpackage.xdy
    public final void d(qei qeiVar, aozy aozyVar) {
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 3) {
                    qeh b2 = qeh.b(qeiVar.c);
                    if (b2 == null) {
                        b2 = qeh.UNKNOWN_TYPE;
                    }
                    throw new IllegalArgumentException("Unknown enum value: " + b2.e);
                }
                asku askuVar = asku.RCS_BOT;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aqfn aqfnVar = (aqfn) aozyVar.b;
                aqfn aqfnVar2 = aqfn.a;
                aqfnVar.b = askuVar.a();
                return;
            }
            asku askuVar2 = asku.PHONE_NUMBER;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            aqfn aqfnVar3 = (aqfn) aozyVar.b;
            aqfn aqfnVar4 = aqfn.a;
            aqfnVar3.b = askuVar2.a();
            return;
        }
        asku askuVar3 = asku.UNSET;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqfn aqfnVar5 = (aqfn) aozyVar.b;
        aqfn aqfnVar6 = aqfn.a;
        aqfnVar5.b = askuVar3.a();
    }

    @Override // defpackage.xdy
    public final aozy e() {
        return yyb.cJ();
    }
}
