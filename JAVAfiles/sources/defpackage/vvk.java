package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vvk implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vvk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [msh, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        Integer valueOf;
        Integer valueOf2;
        switch (this.b) {
            case 0:
                ConversationIdType conversationIdType = (ConversationIdType) this.a;
                Integer n = zap.n(conversationIdType);
                if (n != null) {
                    int intValue = n.intValue();
                    sng sngVar = new sng();
                    sngVar.aj("MmsGroupUpgradeDatabaseOperations#incrementMmsGroupUpgradeRetries");
                    int i = intValue + 1;
                    valueOf = Integer.valueOf(a.bp().c());
                    int intValue2 = valueOf.intValue();
                    valueOf2 = Integer.valueOf(a.bp().c());
                    int intValue3 = valueOf2.intValue();
                    if (intValue3 < 60050) {
                        agnc.t("mms_group_upgrade_retries", intValue3);
                    }
                    if (intValue2 >= 60050) {
                        sngVar.a.put("mms_group_upgrade_retries", Integer.valueOf(i));
                    }
                    return Boolean.valueOf(sngVar.e(conversationIdType));
                }
                return false;
            case 1:
                return ((smr) this.a).x();
            case 2:
                return "_id:".concat(String.valueOf(((wta) this.a).getString(0)));
            case 3:
                return "message_id:".concat(String.valueOf(((wta) this.a).getString(1)));
            case 4:
                return "conversation_id:".concat(String.valueOf(((wta) this.a).getString(2)));
            case 5:
                return "scheduled_time:".concat(String.valueOf(((wta) this.a).getString(3)));
            case 6:
                return "status:".concat(String.valueOf(((wta) this.a).getString(4)));
            case 7:
                return "creation_time:".concat(String.valueOf(((wta) this.a).getString(5)));
            case 8:
                xze xzeVar = xac.c;
                return new CopyOnWriteArraySet((Collection) this.a.b());
            case 9:
                alob alobVar = new alob();
                Iterator it = ((yjy) this.a).l().iterator();
                while (it.hasNext()) {
                    Optional l = ((ykb) it.next()).l(true);
                    if (!l.isEmpty() && !TextUtils.isEmpty(l.get().m())) {
                        alobVar.h(l.get().m());
                    }
                }
                return alobVar.g();
            case 10:
                alwo alwoVar = xoi.a;
                xpc c = xpf.c();
                c.w("readMessageIdForFileTransferFromBugleDatabase");
                Object obj = this.a;
                c.e(new xgt(obj, 19));
                xoz xozVar = (xoz) c.b().m((agmh) xpf.d.h);
                try {
                    alob alobVar2 = new alob();
                    while (xozVar.moveToNext()) {
                        xozVar.g();
                        alobVar2.h(xozVar.g());
                    }
                    alog g = alobVar2.g();
                    xozVar.close();
                    if (g.isEmpty()) {
                        alwl alwlVar = (alwl) xoi.a.i();
                        alwlVar.X(xod.a, obj);
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "readMessageIdForFileTransferFromBugleDatabase", 145, "FileTransferProgressCallbackHandler.java")).q("Transfer progress update is called but the file transfer entry is not present in database.");
                        return rvc.a;
                    }
                    MessageIdType messageIdType = (MessageIdType) g.get(0);
                    if (((alsx) g).c > 1) {
                        alwl alwlVar2 = (alwl) xoi.a.i();
                        alwlVar2.X(xod.a, obj);
                        alwlVar2.X(ydl.b, messageIdType);
                        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "readMessageIdForFileTransferFromBugleDatabase", 157, "FileTransferProgressCallbackHandler.java")).q("There are multiple entries for a single file transferId of a message.");
                        return messageIdType;
                    }
                    return messageIdType;
                } catch (Throwable th) {
                    try {
                        xozVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 11:
                return "message_id:".concat(String.valueOf(((xoz) this.a).getString(0)));
            case 12:
                return "transfer_id:".concat(String.valueOf(((xoz) this.a).getString(1)));
            case 13:
                return "transfer_type:".concat(String.valueOf(((xoz) this.a).getString(2)));
            case 14:
                return "attachment_upload_response:".concat(String.valueOf(((xoz) this.a).getString(3)));
            case 15:
                return "file_information:".concat(String.valueOf(((xoz) this.a).getString(4)));
            case 16:
                return "thumbnail_information:".concat(String.valueOf(((xoz) this.a).getString(5)));
            case 17:
                return "transfer_handle:".concat(String.valueOf(((xoz) this.a).getString(6)));
            case 18:
                return "opaque_data:".concat(String.valueOf(((xoz) this.a).getString(7)));
            case 19:
                return new ahjj((yav) this.a);
            default:
                boolean u = adom.u(((yav) this.a).e);
                alvw d = yav.d.d();
                d.X(alwp.a, "BugleConnectivity");
                alvg alvgVar = (alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "<init>", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "ConnectivityUtilImpl.java");
                Boolean valueOf3 = Boolean.valueOf(u);
                alvgVar.t("cached wifi connection %s", valueOf3);
                return valueOf3;
        }
    }
}
