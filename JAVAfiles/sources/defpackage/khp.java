package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/replies/ReplyMessageExtensionsKt");
    public static final IllegalArgumentException b = new IllegalArgumentException("Unsupported reply snippet content type");

    public static final String a(mje mjeVar, Context context) {
        if (mjeVar instanceof muk) {
            String r = ((muk) mjeVar).a.r(true);
            r.getClass();
            return r;
        }
        if (mjeVar instanceof mjl) {
            String string = context.getString(R.string.reply_snippet_self_participant_header);
            string.getClass();
            return string;
        }
        if (anfi.a("bugle.handle_unknown_sender_for_replies", "bugle")) {
            String string2 = context.getString(R.string.reply_snippet_unknown_sender_header);
            string2.getClass();
            return string2;
        }
        throw new IllegalArgumentException("Unsupported replied-to-message type");
    }

    public static final aexz b(ndk ndkVar, String str) {
        Uri b2;
        if (!ndkVar.i() && !ndkVar.h() && (b2 = ndkVar.b()) != null) {
            return new aexy(str, ndkVar.g(), new aeyb(b2));
        }
        return null;
    }
}
