package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xqc {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/transfer/downloads/analytics/FileDownloadEventLogger");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    private final armf g;
    private final armf h;

    public xqc(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.b = armfVar;
        this.c = armfVar2;
        this.g = armfVar3;
        this.d = armfVar4;
        this.e = armfVar6;
        this.h = armfVar5;
        this.f = armfVar7;
    }

    public static String a(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public final void b(MessageCoreData messageCoreData, String str) {
        d.t(messageCoreData.cJ(), "Message logged is not rcs file transfer.");
        MessagePartCoreData G = messageCoreData.G();
        G.getClass();
        ((mbl) this.g.b()).e(str, a.aq(yyb.aR(G.p())));
    }

    public final amfq c(MessageCoreData messageCoreData, int i, Consumer consumer) {
        boolean z;
        int i2;
        int i3;
        int x = lgb.x(messageCoreData.d());
        if (x != 4) {
            z = false;
        } else {
            z = true;
        }
        d.t(z, "Logging file download events supported only for RCS messages.");
        amgl amglVar = (amgl) amgu.a.createBuilder();
        long a2 = ((lzz) this.c.b()).a(messageCoreData.z());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.b |= 1073741824;
        amguVar.G = a2;
        long s = messageCoreData.s();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.b |= 128;
        amguVar2.n = s;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.g = x - 1;
        amguVar3.b |= 1;
        String f = messageCoreData.E().f();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.b |= Integer.MIN_VALUE;
        amguVar4.H = f;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amguVar5.h = i - 1;
        amguVar5.b |= 2;
        amxo n = ((hgj) this.d.b()).n();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        amguVar6.aa = n.h;
        amguVar6.c |= 2097152;
        if (true != messageCoreData.cn()) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar7 = (amgu) amglVar.b;
        amguVar7.S = i2 - 1;
        amguVar7.c |= 16384;
        List<MessagePartCoreData> W = messageCoreData.W();
        aozy createBuilder = amgw.a.createBuilder();
        for (MessagePartCoreData messagePartCoreData : W) {
            String U = messagePartCoreData.U();
            if (U != null) {
                i3 = yyb.aQ(U);
            } else {
                i3 = 2;
            }
            aozy createBuilder2 = amec.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amec amecVar = (amec) createBuilder2.b;
            amecVar.c = a.au(i3);
            amecVar.b |= 1;
            ameb M = messagePartCoreData.M();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amec amecVar2 = (amec) createBuilder2.b;
            amecVar2.d = M.a();
            amecVar2.b |= 4;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amec.a((amec) createBuilder2.b);
            int aR = yyb.aR(messagePartCoreData.p());
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amec amecVar3 = (amec) createBuilder2.b;
            amecVar3.f = a.aq(aR);
            amecVar3.b |= 16;
            createBuilder.bs(createBuilder2);
        }
        amgw amgwVar = (amgw) createBuilder.s();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar8 = (amgu) amglVar.b;
        amgwVar.getClass();
        amguVar8.j = amgwVar;
        amguVar8.b |= 8;
        consumer.q(amglVar);
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_MESSAGE;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        amgu amguVar9 = (amgu) amglVar.s();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amguVar9.getClass();
        amfrVar2.k = amguVar9;
        amfrVar2.b |= 4;
        return amfqVar;
    }

    public final void d(MessageCoreData messageCoreData, int i, String str) {
        ((mbl) this.g.b()).c("Bugle.DataModel.Action.Download.Start.Count.Rcs");
        int aD = a.aD(((Long) this.e.b()).intValue());
        aozy createBuilder = amrk.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amrk amrkVar = (amrk) apagVar;
        amrkVar.c = i - 1;
        amrkVar.b |= 1;
        if (aD == 0) {
            aD = 1;
        }
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amrk amrkVar2 = (amrk) createBuilder.b;
        amrkVar2.e = aD - 1;
        amrkVar2.b |= 4;
        if (((nxq) this.h.b()).a()) {
            String a2 = a(str);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amrk amrkVar3 = (amrk) createBuilder.b;
            a2.getClass();
            amrkVar3.b |= 2;
            amrkVar3.d = a2;
        }
        e(messageCoreData, 15, new xpw(createBuilder, 3));
    }

    public final void e(MessageCoreData messageCoreData, int i, Consumer consumer) {
        ((mbb) this.b.b()).a().b(c(messageCoreData, i, consumer), mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
    }
}
