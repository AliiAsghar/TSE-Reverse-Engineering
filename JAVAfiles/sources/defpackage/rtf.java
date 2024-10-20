package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rtf extends xzs {
    final /* synthetic */ rsr a;
    final /* synthetic */ String b;
    final /* synthetic */ PendingAttachmentData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtf(PendingAttachmentData pendingAttachmentData, long j, rsr rsrVar, String str) {
        super("Bugle.Async.PendingAttachmentData.loadAttachmentForDraft.Duration", j, true);
        this.a = rsrVar;
        this.b = str;
        this.c = pendingAttachmentData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if ("mms".equals(r6) != false) goto L36;
     */
    @Override // defpackage.xzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object a(java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rtf.a(java.lang.Object[]):java.lang.Object");
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
        if (this.c.j == this && !isCancelled()) {
            this.c.j = null;
            if (messagePartCoreData != null) {
                PendingAttachmentData pendingAttachmentData = this.c;
                pendingAttachmentData.i = 2;
                messagePartCoreData.al(pendingAttachmentData.f);
                if (this.a.i(this.b)) {
                    rsr rsrVar = this.a;
                    PendingAttachmentData pendingAttachmentData2 = this.c;
                    for (PendingAttachmentData pendingAttachmentData3 : rsrVar.s) {
                        if (pendingAttachmentData3.bD(pendingAttachmentData2)) {
                            Uri t = pendingAttachmentData3.t();
                            int i = 0;
                            while (true) {
                                if (i < rsrVar.u.size()) {
                                    if (((MessagePartCoreData) rsrVar.u.get(i)).bC(t)) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                } else {
                                    i = -1;
                                    break;
                                }
                            }
                            rsrVar.s.remove(pendingAttachmentData2);
                            if (pendingAttachmentData2.bg()) {
                                messagePartCoreData.aF(pendingAttachmentData2.p());
                                messagePartCoreData.ax(pendingAttachmentData2.X());
                            }
                            rsrVar.q.add(messagePartCoreData);
                            rsrVar.u.set(i, messagePartCoreData);
                            if (rsrVar.af(messagePartCoreData)) {
                                aktp.ah(new rah(rsrVar, messagePartCoreData, 13), (Executor) rsrVar.E.b());
                            }
                            rsrVar.I(1);
                            return;
                        }
                    }
                    messagePartCoreData.aj();
                    return;
                }
                messagePartCoreData.aj();
                return;
            }
            this.c.i = 3;
            if (this.a.i(this.b)) {
                this.a.e.ah();
                this.a.al(this.c);
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final void onCancelled() {
        PendingAttachmentData pendingAttachmentData = this.c;
        if (pendingAttachmentData.j == this) {
            pendingAttachmentData.j = null;
            PendingAttachmentData.g.q("Timeout while retrieving media.");
            this.c.i = 3;
            if (this.a.i(this.b)) {
                this.a.al(this.c);
            }
        }
    }
}
