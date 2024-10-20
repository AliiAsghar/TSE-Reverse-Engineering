package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class xyo extends xzx {
    public static final ThreadLocal a = new ThreadLocal();
    private static final alhr e = albo.D(new xyn(0));
    private static final alhr f = albo.D(new xyn(2));

    @Deprecated
    public static String a(String str) {
        return ((Pattern) f.get()).matcher(((Pattern) e.get()).matcher(str).replaceAll("x")).replaceAll("d");
    }

    @Deprecated
    public final void b(ConversationIdType conversationIdType) {
        E("conversation", "id", conversationIdType);
    }

    @Deprecated
    public final void c(MessageIdType messageIdType) {
        E("message", "id", messageIdType);
    }

    @Deprecated
    public final void d(String str) {
        E("part", "id", str);
    }

    @Deprecated
    public final void e(String str) {
        E("participant", "id", str);
    }

    @Deprecated
    public final void f(String str) {
        E("rcsConversation", "id", str);
    }

    @Deprecated
    public final void g(rve rveVar) {
        if (rve.j(rveVar)) {
            return;
        }
        E("rcsMessage", "id", rve.d(rveVar));
    }

    @Deprecated
    public final void h(long j) {
        E("rcsSessionId", "id", Long.valueOf(j));
    }

    @Deprecated
    public final void i(CharSequence charSequence) {
        C("DisplayName", charSequence);
    }

    @Deprecated
    public final void j(String str) {
        if (!this.d) {
            return;
        }
        H("MSISDN{");
        if (Log.isLoggable(this.c, 3)) {
            u(str);
        } else if (str == null) {
            u(null);
        } else {
            u(a(str));
        }
        t('}');
    }

    @Deprecated
    public final void k(Uri uri) {
        if (!this.d) {
            return;
        }
        H("URI{");
        if (Log.isLoggable(this.c, 3)) {
            u(uri);
        } else {
            u(uri.getScheme());
            u("://");
            u(uri.getAuthority());
            u("/...Redacted...");
        }
        t('}');
    }

    @Deprecated
    public final void l(int i) {
        D("subscription", "id", i);
    }

    @Deprecated
    public final void m(xhv xhvVar) {
        E("telephonyThreadId", "id", xhvVar);
    }

    @Deprecated
    public final void n(MessageIdType messageIdType, ConversationIdType conversationIdType) {
        c(messageIdType);
        H("in");
        b(conversationIdType);
    }

    @Deprecated
    public final void o(msh mshVar) {
        String str;
        if (mshVar != null) {
            str = mshVar.toString();
        } else {
            str = null;
        }
        j(str);
    }
}
