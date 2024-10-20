package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qop {
    public qop() {
    }

    public static PendingIntent a(Context context, Intent intent, int i) {
        dzx dzxVar = new dzx(context);
        dzxVar.d(intent);
        return dzxVar.a(i, 201326592);
    }

    public static void b(Context context, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId) {
        Intent intent = new Intent("conversation_self_id_change");
        intent.putExtra("conversation_id", conversationIdType.a());
        if (!conversationIdType.b()) {
            intent.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
        }
        intent.putExtra("conversation_self_id", lga.Y(selfIdentityId));
        epw.a(context).d(intent);
    }

    public static final akcx c() {
        akct a = akcx.a(qob.class);
        gry gryVar = gry.EXPONENTIAL;
        Object e = qlb.g.e();
        e.getClass();
        a.f(gryVar, new akcv(((Number) e).longValue(), TimeUnit.MILLISECONDS));
        a.e(new akcw("DELETED_CONTACTS_OBSERVER", 4));
        gsd gsdVar = new gsd();
        Uri uri = ContactsContract.DeletedContacts.CONTENT_URI;
        uri.getClass();
        gsdVar.b(uri, false);
        a.b(gsdVar.a());
        return a.a();
    }

    public static void d(Context context, Intent intent) {
        intent.setPackage("com.google.android.apps.wearable.numbersync");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.SECURITY_PENDING_INTENT", PendingIntent.getBroadcast(context, 0, new Intent(), yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)));
        context.sendBroadcast(intent);
    }

    public static final amgc e(qic qicVar) {
        qicVar.getClass();
        switch (qicVar.ordinal()) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
                return amgc.NOT_ENABLED;
            case 1:
                return amgc.ENABLED;
            case 2:
                return amgc.IN_INITIAL_SYNC;
            default:
                throw new armm();
        }
    }

    public static final boolean f(qid qidVar) {
        qig b = qig.b(qidVar.e);
        if (b == null) {
            b = qig.INITIAL_SYNC_STATUS_NOT_SET;
        }
        b.getClass();
        if (b != qig.RESTORE && b != qig.RESTORE_KEYS) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ String g(int i) {
        if (i != 1) {
            return "ERROR";
        }
        return "HTTP_HEADERS";
    }

    public static boolean h() {
        return anfi.a("bugle.enable_wear_for_kids_on_watch", "bugle");
    }

    public qop(qif qifVar) {
        qifVar.getClass();
        aqil.r(new qig[]{qig.INITIAL_SYNC_STATUS_NOT_SET, qig.STARTED, qig.RESTORE_KEYS});
    }
}
