package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krl implements rsw {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public krl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rsw
    public final /* synthetic */ tuk a(qei qeiVar, ConversationIdType conversationIdType) {
        if (this.b != 0) {
            apwt a = apxv.a(((krg) this.a).a.lL);
            krg krgVar = (krg) this.a;
            kqp kqpVar = krgVar.b;
            krv krvVar = krgVar.a;
            apya apyaVar = krvVar.ds;
            apya apyaVar2 = kqpVar.i;
            apya apyaVar3 = krvVar.lJ;
            apya apyaVar4 = krvVar.lM;
            apya apyaVar5 = krvVar.lZ;
            apya apyaVar6 = krvVar.lO;
            apya apyaVar7 = kqpVar.r;
            arpi arpiVar = (arpi) krvVar.dN.b();
            arpi arpiVar2 = (arpi) ((krg) this.a).a.bP.b();
            arpi arpiVar3 = (arpi) ((krg) this.a).a.dj.b();
            krv krvVar2 = ((krg) this.a).a;
            return new tuk(a, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, apyaVar7, arpiVar, arpiVar2, arpiVar3, krvVar2.ma, krvVar2.me, krvVar2.cp, qeiVar, conversationIdType);
        }
        apwt a2 = apxv.a(((kru) this.a).a.lL);
        krv krvVar3 = ((kru) this.a).a;
        apya apyaVar8 = krvVar3.ds;
        apya apyaVar9 = krvVar3.lR;
        apya apyaVar10 = krvVar3.lJ;
        apya apyaVar11 = krvVar3.lM;
        apya apyaVar12 = krvVar3.lZ;
        apya apyaVar13 = krvVar3.lO;
        apya apyaVar14 = krvVar3.lV;
        arpi arpiVar4 = (arpi) krvVar3.dN.b();
        arpi arpiVar5 = (arpi) ((kru) this.a).a.bP.b();
        arpi arpiVar6 = (arpi) ((kru) this.a).a.dj.b();
        krv krvVar4 = ((kru) this.a).a;
        return new tuk(a2, apyaVar8, apyaVar9, apyaVar10, apyaVar11, apyaVar12, apyaVar13, apyaVar14, arpiVar4, arpiVar5, arpiVar6, krvVar4.ma, krvVar4.me, krvVar4.cp, qeiVar, conversationIdType);
    }
}
