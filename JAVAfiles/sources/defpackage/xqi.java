package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.gms.feedback.FileTeleporter;
import defpackage.xzo;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xqi implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xqi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        xzm ge;
        xzm ge2;
        switch (this.b) {
            case 0:
                return new xqj((Uri) this.a, (Uri) obj);
            case 1:
                alwo alwoVar = xoa.a;
                return ((xow) this.a).m();
            case 2:
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                xrf.i((xrf) this.a, messageCoreData);
                return messageCoreData;
            case 3:
                alwo alwoVar2 = xrf.a;
                return this.a;
            case 4:
                MessageCoreData messageCoreData2 = (MessageCoreData) obj;
                xrf.i((xrf) this.a, messageCoreData2);
                return messageCoreData2;
            case 5:
                Boolean bool = (Boolean) obj;
                alwo alwoVar3 = xrf.a;
                boolean booleanValue = bool.booleanValue();
                ?? r1 = this.a;
                if (booleanValue) {
                    alwl alwlVar = (alwl) xrf.a.g();
                    alwlVar.X(ydl.f, r1.E());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendBestEffortDeliveryReport", 1589, "IncomingFileTransferProcessor.java")).q("Best-effort delivery report sent.");
                } else {
                    alwl alwlVar2 = (alwl) xrf.a.i();
                    alwlVar2.X(ydl.f, r1.E());
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendBestEffortDeliveryReport", 1596, "IncomingFileTransferProcessor.java")).q("Failed to send best-effort delivery report.");
                }
                return bool;
            case 6:
                MessageCoreData messageCoreData3 = (MessageCoreData) obj;
                Iterator it = ((Set) ((xrf) this.a).w.b()).iterator();
                while (it.hasNext()) {
                    ((rwo) it.next()).d(messageCoreData3);
                }
                return messageCoreData3;
            case 7:
                xpr xprVar = (xpr) obj;
                alwl alwlVar3 = (alwl) xrf.a.g();
                alwlVar3.X(ydl.b, this.a.B());
                alwlVar3.X(xod.a, xprVar.a);
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadFile", 1417, "IncomingFileTransferProcessor.java")).q("File successfully queued for download");
                return Optional.of(xprVar);
            case 8:
                alwo alwoVar4 = xrf.a;
                if (!((Boolean) obj).booleanValue()) {
                    ?? r14 = this.a;
                    alwl alwlVar4 = (alwl) xrf.a.i();
                    alwlVar4.X(ydl.a, r14.B().a());
                    alwlVar4.X(ydl.e, r14.E().b);
                    ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertFileTransferTableEntry", 1468, "IncomingFileTransferProcessor.java")).q("Fail to insert/upsert the FileTransfer table for manual download");
                }
                return Optional.empty();
            case 9:
                alwo alwoVar5 = xrf.a;
                return this.a;
            case 10:
                alwo alwoVar6 = xse.a;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (booleanValue2) {
                    alwl alwlVar5 = (alwl) xse.a.g();
                    alwlVar5.X(xod.a, obj2);
                    ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "queueFileUpload", 155, "FileUploadWorkScheduler.java")).q("File upload is queued.");
                    return vqh.a;
                }
                alwl alwlVar6 = (alwl) xse.a.i();
                alwlVar6.X(xod.a, obj2);
                ((alwl) alwlVar6.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "queueFileUpload", 158, "FileUploadWorkScheduler.java")).q("Failed to queue file upload.");
                return vqh.a(3, 0).a();
            case 11:
                alwl alwlVar7 = (alwl) xse.a.g();
                alwlVar7.X(xod.a, this.a);
                ((alwl) alwlVar7.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "queueFileUpload", 170, "FileUploadWorkScheduler.java")).q("Not queuing file upload as it is already scheduled.");
                return vqh.a;
            case 12:
                pwq a = pwr.a();
                a.f(xoc.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_GET_FILE_SIZE);
                a.g(((aqhu) this.a).c);
                return new xta(a.a());
            case 13:
                return Boolean.valueOf(((ArrayList) this.a).addAll((List) obj));
            case 14:
                xze xzeVar = xwj.a;
                return this.a;
            case 15:
                ((xxe) this.a).a(true);
                return null;
            case 16:
                byte[] bArr = (byte[]) obj;
                alvi alviVar = xyy.a;
                ?? r0 = this.a;
                if (bArr != null) {
                    try {
                    } catch (IllegalArgumentException e) {
                        alvw i = xyy.a.i();
                        i.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/util/common/LogFeedbackDataProvider", "providePsbdData", 't', "LogFeedbackDataProvider.java")).q("Failed to include flogger bugle logs in user feedback");
                    }
                    if (bArr.length > 0) {
                        r0.add(new FileTeleporter(bArr, "Messages Flogger log"));
                        return r0;
                    }
                }
                alvw g = xyy.a.g();
                g.X(alwp.a, "Bugle");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/util/common/LogFeedbackDataProvider", "providePsbdData", 113, "LogFeedbackDataProvider.java")).q("No bugle flogger logs attached to feedback.");
                return r0;
            case 17:
                Object[] objArr = (Object[]) obj;
                Object obj3 = this.a;
                xzs xzsVar = (xzs) obj3;
                xyl.k(xzsVar.j);
                if (xzsVar.i) {
                    xzw.a.postDelayed(new xzr(xzsVar), xzsVar.h);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Object a2 = ((xzs) obj3).a(objArr);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    synchronized (xzs.f) {
                        xzs.f.remove(obj3);
                    }
                    String str = xzsVar.g;
                    if (str != null && str.startsWith("Bugle.") && (ge2 = ((xzo.a) yyb.aL(xzo.a.class)).ge()) != null) {
                        ge2.k(xzsVar.g, elapsedRealtime2, xzsVar.h);
                    }
                    if (elapsedRealtime2 > xzsVar.h) {
                        alvw i2 = xzs.d.i();
                        i2.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncTask", "doInternal", 122, "SafeAsyncTask.java")).C("%s took %dms", obj3, elapsedRealtime2);
                    }
                    return a2;
                } catch (Throwable th) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    synchronized (xzs.f) {
                        xzs.f.remove(obj3);
                        String str2 = xzsVar.g;
                        if (str2 != null && str2.startsWith("Bugle.") && (ge = ((xzo.a) yyb.aL(xzo.a.class)).ge()) != null) {
                            ge.k(xzsVar.g, elapsedRealtime3, xzsVar.h);
                        }
                        if (elapsedRealtime3 > xzsVar.h) {
                            alvw i3 = xzs.d.i();
                            i3.X(alwp.a, "Bugle");
                            ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncTask", "doInternal", 122, "SafeAsyncTask.java")).C("%s took %dms", obj3, elapsedRealtime3);
                        }
                        throw th;
                    }
                }
            case 18:
                ((xzs) this.a).d(obj);
                return null;
            case 19:
                this.a.q(obj);
                return null;
            default:
                this.a.q((Throwable) obj);
                return null;
        }
    }
}
