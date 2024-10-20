package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDeliveryReportAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rbq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ rbq(ProcessDeliveryReportAction processDeliveryReportAction, int i, Uri uri, long j, int i2) {
        this.e = i2;
        this.c = processDeliveryReportAction;
        this.a = i;
        this.d = uri;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.lang.Runnable
    public final void run() {
        MessagesTable.BindData bindData;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                ?? r1 = this.c;
                MessageIdType B = r1.B();
                sxy d = MessagesTable.d();
                d.w("readStatusAndTimestamp");
                d.g(new rbw(B, 18));
                d.d(new rhr(14));
                alog t = d.b().t();
                if (t.isEmpty()) {
                    bindData = null;
                } else {
                    bindData = (MessagesTable.BindData) t.get(0);
                }
                if (bindData == null) {
                    alvw i2 = rjq.a.i();
                    i2.X(alwp.a, "BugleDataModel");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "uploadLocalDatabaseForSendingRcs", 1047, "SendMessageActionQueuer.java")).q("Message was deleted while sending. Sending might have completed.");
                    return;
                }
                int i3 = this.a;
                if (i3 != bindData.q()) {
                    long j = this.b;
                    alvw g = rjq.a.g();
                    g.X(alwp.a, "BugleDataModel");
                    alvg alvgVar = (alvg) g;
                    alvgVar.X(ydl.b, r1.B());
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "uploadLocalDatabaseForSendingRcs", 1061, "SendMessageActionQueuer.java")).N("Fast path sending modified message status. oldStatus: %s, newStatus: %s, timestamp: %s, oldReceivedTimestamp: %s, newReceivedTimestamp: %s, oldSentTimestamp: %s, newSentTimestamp: %s", Integer.valueOf(i3), Integer.valueOf(bindData.q()), Long.valueOf(j), Long.valueOf(r1.n()), Long.valueOf(bindData.t()), Long.valueOf(r1.q()), Long.valueOf(bindData.v()));
                    r1.bI(bindData.q());
                    r1.bz(bindData.t());
                    r1.bE(bindData.v());
                }
                ((rjq) this.d).b(r1, null, false, Optional.empty());
                return;
            }
            alwo alwoVar = mat.a;
            ((aboj) this.d).d((String) this.c).a(this.a, this.b, aboj.b);
            return;
        }
        xze xzeVar = xca.a;
        ProcessDeliveryReportAction processDeliveryReportAction = (ProcessDeliveryReportAction) this.c;
        rwd rwdVar = (rwd) processDeliveryReportAction.a.b();
        Uri uri = (Uri) this.d;
        MessageCoreData t2 = rwdVar.t(uri);
        if (t2 != null) {
            int i4 = this.a;
            long j2 = this.b;
            xyl.k(uri.equals(t2.t()));
            rwd rwdVar2 = (rwd) processDeliveryReportAction.a.b();
            ConversationIdType z = t2.z();
            MessageIdType B2 = t2.B();
            sya syaVar = new sya();
            syaVar.aj("ProcessDeliveryReportAction#executeAction");
            syaVar.L(xca.b(true, 2, i4));
            syaVar.G(j2);
            rwdVar2.J(z, B2, syaVar);
            processDeliveryReportAction.c.aq(t2, Optional.empty(), amxo.NOT_RCS, lgb.L(processDeliveryReportAction.b));
        }
    }

    public /* synthetic */ rbq(Object obj, Object obj2, int i, long j, int i2) {
        this.e = i2;
        this.d = obj;
        this.c = obj2;
        this.a = i;
        this.b = j;
    }
}
