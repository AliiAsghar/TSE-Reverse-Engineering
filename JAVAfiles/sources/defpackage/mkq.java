package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkq implements mkp {
    private static final alwo a = alwo.o("BugleDataModel");
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;

    public mkq(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = armfVar7;
    }

    private final Action j(Optional optional, MessageCoreData messageCoreData, boolean z, long j, MessageUsageStatisticsData messageUsageStatisticsData) {
        String a2;
        messageCoreData.bs(messageUsageStatisticsData);
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(ydl.o, messageCoreData.z().toString());
        alvz alvzVar = ydl.a;
        if (messageCoreData.B() == null) {
            a2 = "";
        } else {
            a2 = messageCoreData.B().a();
        }
        alwlVar.X(alvzVar, a2);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "prepareToSendMessage", 166, "MessageControllerImpl.java")).q("Send Message");
        if (optional.isEmpty()) {
            return ((riv) this.c.b()).a(messageCoreData, z, messageUsageStatisticsData.j(), null, -1, Optional.of(Integer.valueOf(((yjy) this.h.b()).c())), j, false);
        }
        return ((riv) this.c.b()).a(messageCoreData, z, messageUsageStatisticsData.j(), null, ((Integer) optional.get()).intValue(), Optional.empty(), j, false);
    }

    @Override // defpackage.mkp
    public final MessageCoreData a(Resources resources, rry rryVar) {
        MessagePartData c;
        MessageCoreData a2 = ((tqx) this.d.b()).a();
        String d = ((xca) rryVar.j.b()).d(resources, rryVar.E());
        if (!TextUtils.isEmpty(d)) {
            d = resources.getString(R.string.message_fwd, d);
        }
        a2.bt(d);
        for (MessagePartCoreData messagePartCoreData : rryVar.e) {
            uie uieVar = (uie) this.b.b();
            if (!messagePartCoreData.bw() && !messagePartCoreData.bp()) {
                if (gh.h(messagePartCoreData.U())) {
                    c = ((rtg) uieVar.a).c(messagePartCoreData.U(), messagePartCoreData.t(), ameb.FORWARD, messagePartCoreData.X(), messagePartCoreData.p());
                } else if (messagePartCoreData.bu()) {
                    c = ((rtb) uieVar.b).c(messagePartCoreData.V());
                } else {
                    c = ((rtg) uieVar.a).b(messagePartCoreData.U(), messagePartCoreData.t(), ameb.FORWARD);
                }
            } else {
                c = ((rtb) uieVar.b).c(messagePartCoreData.ad());
            }
            a2.aH(c);
        }
        return a2;
    }

    @Override // defpackage.mkp
    public final akul b(List list) {
        return ((wpp) this.g.b()).U(list);
    }

    @Override // defpackage.mkp
    public final void c(List list) {
        ((wpp) this.g.b()).X(list);
    }

    @Override // defpackage.mkp
    public final void d(MessageIdType messageIdType) {
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(ydl.a, messageIdType.a());
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "downloadMessageAsync", 234, "MessageControllerImpl.java")).q("Download Message");
        ((riz) this.e.b()).a(messageIdType);
    }

    @Override // defpackage.mkp
    public final void e(MessageIdType messageIdType, MessageUsageStatisticsData messageUsageStatisticsData) {
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(ydl.a, messageIdType.a());
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/control/MessageControllerImpl", "resendMessageAsync", 243, "MessageControllerImpl.java")).q("Resend Message");
        ((rja) this.f.b()).a(messageIdType, messageUsageStatisticsData);
    }

    @Override // defpackage.mkp
    public final void f(MessageCoreData messageCoreData, long j, MessageUsageStatisticsData messageUsageStatisticsData) {
        j(Optional.empty(), messageCoreData, true, j, messageUsageStatisticsData).t();
    }

    @Override // defpackage.mkp
    public final void g(nfw nfwVar, MessageCoreData messageCoreData, long j, MessageUsageStatisticsData messageUsageStatisticsData) {
        j(Optional.of(Integer.valueOf(nfwVar.b())), messageCoreData, false, j, messageUsageStatisticsData).t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [nzq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.mkp
    public final akul h(List list, int i) {
        wpp wppVar = (wpp) this.g.b();
        if (!wppVar.a.a()) {
            return wppVar.U(list);
        }
        Object obj = wppVar.c;
        aozy createBuilder = uzw.a.createBuilder();
        createBuilder.R((Iterable) Collection.EL.stream(list).map(new uzd(14)).collect(Collectors.toCollection(new uzg(2))));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        uzw uzwVar = (uzw) createBuilder.b;
        uzwVar.e = uzz.b(i);
        uzwVar.b |= 1;
        return ((vjs) obj).D((uzw) createBuilder.s()).i(new uva(4), wppVar.b).h(new uyi(14), wppVar.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nzq, java.lang.Object] */
    @Override // defpackage.mkp
    public final void i(List list, int i) {
        wpp wppVar = (wpp) this.g.b();
        if (!wppVar.a.a()) {
            wppVar.X(list);
            return;
        }
        Object obj = wppVar.c;
        aozy createBuilder = uzw.a.createBuilder();
        createBuilder.R((Iterable) Collection.EL.stream(list).map(new uzd(14)).collect(Collectors.toCollection(new uzg(2))));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        uzw uzwVar = (uzw) createBuilder.b;
        uzwVar.e = uzz.b(8);
        uzwVar.b |= 1;
        ((vjs) obj).E((uzw) createBuilder.s());
    }
}
