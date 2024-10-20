package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjp {
    private static final xze a = xze.g("BugleDataModel", "PendingMessageChannels");
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels");
    private final armf c;
    private final rji d;
    private final armf e;

    public rjp(armf armfVar, rji rjiVar, armf armfVar2) {
        this.c = armfVar;
        this.d = rjiVar;
        this.e = armfVar2;
    }

    public static int b(MessageCoreData messageCoreData) {
        d.s(!messageCoreData.cw());
        if (messageCoreData.cQ()) {
            return 0;
        }
        if (messageCoreData.cB()) {
            return 1;
        }
        if (messageCoreData.ci()) {
            return 6;
        }
        if (messageCoreData.cJ()) {
            return 4;
        }
        if (messageCoreData.cI()) {
            return 3;
        }
        if (qkf.o()) {
            ((alvg) ((alvg) b.i()).h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForSendMessage", 87, "PendingMessageChannels.java")).t("Invalid channel for send msg protocol: %s", new ahlg(messageCoreData.Q()));
        }
        throw new IllegalStateException("ProcessingPendingMessagesAction: invalid channel for send msg, protocol = ".concat(String.valueOf(messageCoreData.ar())));
    }

    public static boolean f(int i) {
        if (i >= 0 && i < 8) {
            return true;
        }
        return false;
    }

    public final int a(MessageCoreData messageCoreData, wng wngVar) {
        MessageIdType B = messageCoreData.B();
        xze xzeVar = a;
        xyo a2 = xzeVar.a();
        a2.H("getChannelForDownloadMessage");
        a2.c(B);
        a2.H(messageCoreData);
        a2.q();
        d.s(messageCoreData.cw());
        if (messageCoreData.cC()) {
            xyo a3 = xzeVar.a();
            a3.c(B);
            a3.H("is Mms Notification");
            a3.q();
            return 2;
        }
        if (messageCoreData.ci()) {
            xyo a4 = xzeVar.a();
            a4.c(B);
            a4.H("is Cloud Sync");
            a4.q();
            return 7;
        }
        if (messageCoreData.cI()) {
            xyo a5 = xzeVar.a();
            a5.c(B);
            a5.H("is Rcs");
            a5.q();
            return 5;
        }
        if (messageCoreData.cB()) {
            xyo e = xzeVar.e();
            e.H("message is not an MMS notification but still in pending queue. status:");
            e.H(messageCoreData.ay());
            e.q();
            rwd rwdVar = (rwd) this.c.b();
            ConversationIdType z = messageCoreData.z();
            MessageIdType B2 = messageCoreData.B();
            sya syaVar = new sya();
            syaVar.aj("prepareFailRcsFtOrMmsDownload");
            syaVar.L(106);
            rwdVar.J(z, B2, syaVar);
            rjh rjhVar = new rjh(this.d);
            rjhVar.b();
            rjhVar.c();
            rjhVar.a().r(wngVar);
            return -1;
        }
        if (qkf.o()) {
            ((alvg) ((alvg) b.i()).h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", 127, "PendingMessageChannels.java")).D("Invalid channel for download msg protocol: %s, autoDownload: %b", new ahlg(messageCoreData.Q()), new ahld(messageCoreData.cf()));
        }
        throw new IllegalStateException("ProcessingPendingMessagesAction: invalid channel for download msg, protocol = ".concat(String.valueOf(messageCoreData.ar())));
    }

    public final int c(MessageCoreData messageCoreData, wng wngVar) {
        if (messageCoreData.cH()) {
            return b(messageCoreData);
        }
        if (!messageCoreData.cG() && (!((peh) this.e.b()).a() || !messageCoreData.cg())) {
            return -1;
        }
        return a(messageCoreData, wngVar);
    }

    public final int d(MessageCoreData messageCoreData, wng wngVar) {
        if (messageCoreData.cO()) {
            return b(messageCoreData);
        }
        if (messageCoreData.cl()) {
            return a(messageCoreData, wngVar);
        }
        return -1;
    }

    public final int e(MessageCoreData messageCoreData, wng wngVar) {
        int d = d(messageCoreData, wngVar);
        if (d == -1) {
            return c(messageCoreData, wngVar);
        }
        return d;
    }
}
