package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class umh extends unp {
    private final anen a;
    private final armf b;
    private final armf c;

    public umh(anen anenVar, armf armfVar, armf armfVar2) {
        this.a = anenVar;
        this.b = armfVar;
        this.c = armfVar2;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("LogMessageSentOrReceivedHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return aktp.ai(new ulo(this, (umi) apbtVar, 7), this.a);
    }

    @Override // defpackage.unx
    public final apca e() {
        return umi.a.getParserForType();
    }

    public final void j(umi umiVar) {
        amgu amguVar;
        amgu amguVar2;
        MessageCoreData q = ((rwd) this.c.b()).q(rvc.b(umiVar.c));
        if (q != null) {
            amgu amguVar3 = umiVar.f;
            if (amguVar3 == null) {
                amguVar3 = amgu.a;
            }
            int Y = a.Y(amguVar3.Y);
            if (Y == 0) {
                Y = 1;
            }
            amgu amguVar4 = umiVar.f;
            if (amguVar4 == null) {
                amguVar4 = amgu.a;
            }
            amgl amglVar = (amgl) amguVar4.toBuilder();
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar5 = (amgu) amglVar.b;
            amguVar5.Y = Y - 1;
            amguVar5.c |= 524288;
            amgu amguVar6 = umiVar.f;
            if (amguVar6 == null) {
                amguVar6 = amgu.a;
            }
            atok atokVar = amguVar6.o;
            if (atokVar == null) {
                atokVar = atok.a;
            }
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar7 = (amgu) amglVar.b;
            atokVar.getClass();
            amguVar7.o = atokVar;
            amguVar7.b |= 1024;
            amgu amguVar8 = umiVar.f;
            if (amguVar8 == null) {
                amguVar = amgu.a;
            } else {
                amguVar = amguVar8;
            }
            amgn b = amgn.b(amguVar.ak);
            if (b == null) {
                b = amgn.UNKNOWN_FORMAT_TYPE;
            }
            if (amguVar8 == null) {
                amguVar2 = amgu.a;
            } else {
                amguVar2 = amguVar8;
            }
            amgq b2 = amgq.b(amguVar2.al);
            if (b2 == null) {
                b2 = amgq.UNKNOWN_IS_IMS;
            }
            if (amguVar8 == null) {
                amguVar8 = amgu.a;
            }
            amgo b3 = amgo.b(amguVar8.am);
            if (b3 == null) {
                b3 = amgo.UNKNOWN_HANDLED_BY;
            }
            if (b != amgn.UNKNOWN_FORMAT_TYPE) {
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar9 = (amgu) amglVar.b;
                amguVar9.ak = b.d;
                amguVar9.c |= Integer.MIN_VALUE;
            }
            if (b2 != amgq.UNKNOWN_IS_IMS) {
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar10 = (amgu) amglVar.b;
                amguVar10.al = b2.d;
                amguVar10.d = 1 | amguVar10.d;
            }
            if (b3 != amgo.UNKNOWN_HANDLED_BY) {
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar11 = (amgu) amglVar.b;
                amguVar11.am = b3.d;
                amguVar11.d |= 2;
            }
            mho mhoVar = (mho) this.b.b();
            int i = umiVar.d;
            long j = umiVar.e;
            mhoVar.aZ(q, i, new mbh(umiVar.g, umiVar.h), amglVar);
        }
    }
}
