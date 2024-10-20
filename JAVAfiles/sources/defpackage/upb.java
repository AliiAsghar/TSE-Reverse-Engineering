package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class upb {
    public static final /* synthetic */ upc a(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (upc) s;
    }

    public static final /* synthetic */ void b(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        upc upcVar = (upc) aozyVar.b;
        upc upcVar2 = upc.a;
        apax apaxVar = upcVar.b;
        if (!apaxVar.c()) {
            upcVar.b = apag.mutableCopy(apaxVar);
        }
        upcVar.b.add(str);
    }

    public static final void c(aozy aozyVar) {
        DesugarCollections.unmodifiableList(((upc) aozyVar.b).b).getClass();
    }

    public static final boolean d(String str) {
        upy a = uqb.a();
        a.w("hasScheduledWork");
        a.d(new uol(str, 2));
        return a.b().K();
    }

    public static final upn e() {
        return new upn(aktp.ag(upm.d()), aktp.ag(false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, apbt] */
    public static boolean f(unx unxVar, byte[] bArr) {
        try {
            return unxVar.h(unxVar.e().d(bArr));
        } catch (apba e) {
            alvw i = unw.a.i();
            i.X(alwp.a, "BugleWorkQueue");
            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkItemHandler", "preflightRaw", 2417, "WorkItemHandler.java")).B("got InvalidProtocol %s for data %d", e, bArr.length);
            return false;
        }
    }

    public static unf g() {
        return unf.a().a();
    }

    public static Uri h(Context context, ConversationIdType conversationIdType) {
        Uri.Builder buildUpon = Uri.parse(s(context).concat("conversation_images")).buildUpon();
        buildUpon.appendPath(conversationIdType.a());
        return buildUpon.build();
    }

    public static Uri i(Context context, ConversationIdType conversationIdType) {
        return j(context, conversationIdType, rvc.a, new String[0]);
    }

    public static Uri j(Context context, ConversationIdType conversationIdType, MessageIdType messageIdType, String... strArr) {
        if (conversationIdType.b()) {
            conversationIdType = ruy.a;
        }
        Uri.Builder buildUpon = o(context).buildUpon();
        buildUpon.appendPath(conversationIdType.a());
        if (!messageIdType.b()) {
            buildUpon.appendPath(messageIdType.a());
        }
        buildUpon.encodedQuery(TextUtils.join("&", strArr));
        return buildUpon.build();
    }

    public static Uri k(Context context, ConversationId conversationId) {
        if (conversationId == null) {
            return l(context, ruy.a);
        }
        Uri.Builder buildUpon = q(context).buildUpon();
        buildUpon.appendPath(conversationId.b());
        return buildUpon.build();
    }

    public static Uri l(Context context, ConversationIdType conversationIdType) {
        Uri.Builder buildUpon = q(context).buildUpon();
        buildUpon.appendPath(conversationIdType.a());
        return buildUpon.build();
    }

    public static Uri m(Context context, ConversationIdType conversationIdType) {
        Uri.Builder buildUpon = Uri.parse(s(context).concat("draft_images")).buildUpon();
        buildUpon.appendPath(conversationIdType.a());
        return buildUpon.build();
    }

    public static Uri n(Uri.Builder builder, ConversationIdType conversationIdType) {
        if (!conversationIdType.b()) {
            builder.appendPath(conversationIdType.a());
        }
        return builder.build();
    }

    public static Uri o(Context context) {
        return Uri.parse(s(context).concat("messages/conversation"));
    }

    public static Uri p(Context context) {
        return Uri.parse(s(context).concat("participants/conversation"));
    }

    public static Uri q(Context context) {
        return Uri.parse(s(context).concat("conversations"));
    }

    public static Uri r(Context context) {
        return Uri.parse(s(context).concat("desktops"));
    }

    public static String s(Context context) {
        return "content://" + riw.l(context) + "/";
    }

    public static agmh[] t() {
        return (agmh[]) rmq.e.c;
    }
}
