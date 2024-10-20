package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rxc {
    private static final xze d = xze.g("BugleDataModel", "MessagePartDatabaseOperations");
    public final armf a;
    public final armf b;
    public final armf c;
    private final armf e;
    private final armf f;

    public rxc(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.e = armfVar;
        this.a = armfVar2;
        this.b = armfVar3;
        this.f = armfVar4;
        this.c = armfVar5;
    }

    public final MessagePartCoreData a(String str) {
        Object obj;
        akrh e = aktp.e("MessagePartDatabaseOperations#readMessagePartData partId");
        try {
            rxb rxbVar = new rxb(this, 4);
            PartsTable.BindData a = PartsTable.a(str);
            if (a == null) {
                obj = null;
            } else {
                obj = rxbVar.apply(a);
            }
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
            e.close();
            return messagePartCoreData;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(MessageCoreData messageCoreData, boolean z) {
        akrh e = aktp.e("MessagePartDatabaseOperationsImpl#readMessagePartData message");
        try {
            tbs d2 = PartsTable.d();
            d2.w("readMessagePartData");
            d2.g(new rwb(messageCoreData, 19));
            Stream map = Collection.EL.stream(d2.b().t()).map(new rwb(this, 20));
            int i = alog.d;
            List<MessagePartCoreData> list = (List) map.collect(alls.a);
            akrh e2 = aktp.e("MessagePartDatabaseOperationsImpl#addMessageParts");
            try {
                ContentResolver contentResolver = ((Context) this.e.b()).getContentResolver();
                for (MessagePartCoreData messagePartCoreData : list) {
                    Uri t = messagePartCoreData.t();
                    if (z && messagePartCoreData.aV() && t != null && !ydk.s(t)) {
                        try {
                            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(t, "r");
                            if (openFileDescriptor != null) {
                                openFileDescriptor.close();
                                messageCoreData.aH(messagePartCoreData);
                            }
                        } catch (IOException unused) {
                        } catch (SecurityException unused2) {
                            xyo a = d.a();
                            a.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, t);
                            a.q();
                        }
                    } else {
                        messageCoreData.aH(messagePartCoreData);
                    }
                }
                e2.close();
                e.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(MessagePartCoreData messagePartCoreData, String str) {
        Integer valueOf;
        Integer valueOf2;
        agnw d2;
        String O = messagePartCoreData.O();
        if ((albo.ah(str) && albo.ah(O)) || ytd.g(str, O)) {
            return;
        }
        akrh e = aktp.e("MessagePartDatabaseOperationsImpl#resetBlobUploadMetadataOnGaiaEmailChange");
        try {
            tbt tbtVar = new tbt();
            tbtVar.aj("resetBlobUploadMetadataOnGaiaEmailChange");
            valueOf = Integer.valueOf(a.bp().c());
            int intValue = valueOf.intValue();
            valueOf2 = Integer.valueOf(a.bp().c());
            int intValue2 = valueOf2.intValue();
            if (intValue2 < 59570) {
                agnc.t("blob_gaia_email", intValue2);
            }
            if (intValue >= 59570) {
                agnc.r(tbtVar.a, "blob_gaia_email", str);
            }
            tbtVar.d();
            tbtVar.a.putNull("blob_upload_timestamp");
            tbtVar.a.putNull("blob_upload_permanent_failure");
            tbtVar.a.putNull("media_encryption_key");
            tbtVar.a.putNull("compressed_blob_id");
            tbtVar.a.putNull("compressed_blob_upload_timestamp");
            tbtVar.a.putNull("compressed_media_encryption_key");
            tbtVar.a.putNull("compressed_blob_upload_permanent_failure");
            tbtVar.ah();
            tbtVar.v(new rxb(messagePartCoreData, 1));
            agpr a = tbtVar.a();
            d2 = agnc.d("$primary");
            alog alogVar = (alog) d2.s("updateAndReturnUpdatedRowsAfterUpdate-txn-parts", new tbm(a, 2));
            if (alogVar.size() == 1) {
                messagePartCoreData.aK((PartsTable.BindData) alogVar.get(0));
            } else {
                d.q("Unexpected bindData size returned in resetBlobUploadMetadataOnGaiaEmailChange");
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(MessageCoreData messageCoreData, MessagePartCoreData messagePartCoreData, Uri uri, Uri uri2) {
        boolean z = true;
        if (!messagePartCoreData.A().b() && !messageCoreData.B().equals(messagePartCoreData.A())) {
            z = false;
        }
        d.s(z);
        if (((Boolean) ((agnq) this.c.b()).c("MessagePartDatabaseOperations#updatePartContentUriAndClearCache", new rka(this, messageCoreData, messagePartCoreData, uri2, 5))).booleanValue()) {
            if (messagePartCoreData.M() != ameb.GIF_CHOOSER) {
                uhl.j((Context) this.e.b(), uri);
            }
        } else {
            xyo e = d.e();
            e.H("Failed to update part content uri");
            e.c(messageCoreData.B());
            e.q();
        }
    }

    public final boolean e(ConversationIdType conversationIdType, MessageIdType messageIdType, String str, tbt tbtVar) {
        akrh e = aktp.e("MessagePartDatabaseOperationsImpl#updatePartRowIfExists");
        try {
            xyl.h();
            tbtVar.ah();
            tbtVar.v(new rwb(str, 18));
            boolean z = false;
            byte b = 0;
            if (tbtVar.a().e() != 0) {
                if (str != null) {
                    ((agnq) this.c.b()).h(new rxa(b == true ? 1 : 0), null, new rah(this, str, 19));
                }
                uhj uhjVar = (uhj) this.f.b();
                String[] strArr = PartsTable.a;
                uhjVar.j(conversationIdType, messageIdType, "parts");
                z = true;
            }
            e.close();
            return z;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
