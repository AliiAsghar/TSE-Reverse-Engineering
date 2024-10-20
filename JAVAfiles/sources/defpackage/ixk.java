package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixk implements akvz {
    final /* synthetic */ ixd a;
    private final /* synthetic */ int b;

    public ixk(ixd ixdVar, int i) {
        this.b = i;
        this.a = ixdVar;
    }

    @Override // defpackage.akvz
    public final /* synthetic */ akwa a(akvv akvvVar) {
        int i = 4;
        int i2 = 12;
        int i3 = 6;
        int i4 = 14;
        int i5 = 17;
        byte[] bArr = null;
        int i6 = 2;
        int i7 = 0;
        switch (this.b) {
            case 0:
                ixd ixdVar = this.a;
                aabr.W(ixdVar.q(), new irs(ixdVar, (abdf) akvvVar, i3, bArr));
                return akwa.a;
            case 1:
                jal jalVar = (jal) akvvVar;
                int i8 = jalVar.a().a;
                ixd ixdVar2 = this.a;
                if (ixdVar2.bi(i8)) {
                    ixdVar2.U(jalVar.a().a);
                    return akwa.a;
                }
                if (((adjc) ixdVar2.bA.b()).w(jalVar.a().a) && ixdVar2.be()) {
                    ijw ijwVar = ixdVar2.cz;
                    ConversationIdType conversationIdType = ixdVar2.L;
                    rti a = jalVar.a();
                    ujv ujvVar = (ujv) ijwVar.n.b();
                    armf armfVar = ujvVar.k;
                    SelfIdentityId selfIdentityId = a.b;
                    ((nfx) armfVar.b()).c(selfIdentityId).h(new tul(ujvVar, conversationIdType, selfIdentityId, 4), ujvVar.l).e(Throwable.class, new ezr(14), ijwVar.d).k(qiu.b(), andi.a);
                    return akwa.a;
                }
                ixdVar2.Q(new ivh(jalVar, i7), new ivh(jalVar, i6));
                ixdVar2.cB.F();
                ixdVar2.aN((rsr) ixdVar2.cl.a());
                return akwa.a;
            case 2:
                this.a.V.ifPresent(new ivh((aaet) akvvVar, i5));
                return akwa.a;
            case 3:
                this.a.an();
                return akwa.a;
            case 4:
                this.a.V(((Boolean) ipe.p.e()).booleanValue());
                return akwa.a;
            case 5:
                aktp.Q(this.a.M, new Intent(((lzl) akvvVar).a()));
                return akwa.a;
            case 6:
                yyd yydVar = (yyd) akvvVar;
                String c = yydVar.c();
                String b = yydVar.b();
                ivl ivlVar = new ivl(yydVar, 6);
                yydVar.d();
                this.a.aD(c, b, ivlVar, false);
                return akwa.a;
            case 7:
                isa isaVar = new isa(i2);
                isa isaVar2 = new isa(13);
                ixd ixdVar3 = this.a;
                if (((Boolean) ixdVar3.G(isaVar, isaVar2)).booleanValue()) {
                    Snackbar p = Snackbar.p(ixdVar3.u(), R.string.error_text_scheduled_send_with_draft_reply, 0);
                    p.t(android.R.string.ok, new ili(2));
                    p.i();
                } else {
                    ixdVar3.aC();
                }
                return akwa.a;
            case 8:
                this.a.Q(new ivn(i7), new ivn(i6));
                return akwa.a;
            case 9:
                this.a.aC();
                return akwa.a;
            case 10:
                this.a.ax.ifPresent(new ivh((abaq) akvvVar, i4));
                return akwa.a;
            case 11:
                MessageIdType a2 = ((zvr) akvvVar).a();
                ixd ixdVar4 = this.a;
                itb itbVar = ixdVar4.bX;
                int i9 = 1;
                if (((Boolean) abal.e.e()).booleanValue()) {
                    itbVar.e().ifPresent(new ivb(((Integer) abal.h.e()).intValue(), i9));
                }
                itbVar.aB = true;
                itbVar.C.j(new ahlp(itbVar.aq.b(a2)), new ahlp(a2), itbVar.Y);
                ixdVar4.aA.ifPresent(new ivg(i4));
                return akwa.a;
            case 12:
                this.a.bu();
                return akwa.a;
            case 13:
                zwn zwnVar = (zwn) akvvVar;
                String c2 = zwnVar.c();
                String b2 = zwnVar.b();
                Runnable a3 = zwnVar.a();
                ixd ixdVar5 = this.a;
                Snackbar q = Snackbar.q(ixdVar5.bR, c2, 0);
                q.n();
                q.m(ixdVar5.u());
                q.s(b2, new jh(a3, 17, null));
                q.i();
                return akwa.a;
            case 14:
                this.a.aT.ifPresent(new ivh((lyf) akvvVar, i2));
                return akwa.a;
            case 15:
                this.a.aT.ifPresent(new ivc((lyl) akvvVar, i));
                return akwa.a;
            case 16:
                ivg ivgVar = new ivg(16);
                ixd ixdVar6 = this.a;
                ixdVar6.aT.ifPresent(ivgVar);
                ixdVar6.aO.ifPresent(new ivh((lyk) akvvVar, 18));
                return akwa.a;
            case 17:
                lyp lypVar = (lyp) akvvVar;
                ivk ivkVar = new ivk(i7);
                ivk ivkVar2 = new ivk(i6);
                ixd ixdVar7 = this.a;
                if (((Boolean) (ixdVar7.aV() ? ivkVar.apply(ixdVar7.w()) : ivkVar2.apply(ixdVar7.bV))).booleanValue()) {
                    ixdVar7.aT.ifPresent(new ivp(lypVar, i7));
                    return akwa.a;
                }
                ixdVar7.T(lypVar.a());
                return akwa.a;
            case 18:
                this.a.T(((lyo) akvvVar).a());
                return akwa.a;
            case 19:
                isb isbVar = new isb(11);
                ixd ixdVar8 = this.a;
                ixdVar8.aT.ifPresent(isbVar);
                ixdVar8.aO.ifPresent(new ilf(ixdVar8, (lyq) akvvVar, 8));
                return akwa.a;
            default:
                ixd ixdVar9 = this.a;
                ixdVar9.Q(null, new ilf(ixdVar9, (zoi) akvvVar, i5));
                return akwa.a;
        }
    }
}
