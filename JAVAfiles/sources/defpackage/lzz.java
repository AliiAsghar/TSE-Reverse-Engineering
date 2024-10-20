package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lzz {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/analytics/AnalyticsIdHelper");
    public final armf a;
    private final armf c;

    public lzz(armf armfVar, armf armfVar2) {
        this.a = armfVar;
        this.c = armfVar2;
    }

    public static String f(String str) {
        try {
            return d.al(i(str, MessageDigest.getInstance("SHA-256"), 16));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            alvw h = b.h();
            h.X(alwp.a, "BugleDataModel");
            ((alvg) ((alvg) ((alvg) ((alvg) h).g(e)).g(e)).h("com/google/android/apps/messaging/shared/analytics/AnalyticsIdHelper", "getSha256String", 168, "AnalyticsIdHelper.java")).q("Exception while getting SHA string for message");
            return "";
        }
    }

    public static final long g(String str, String str2, long j, String str3, rve rveVar) {
        return h(str + str2 + j + str3 + rve.e(rveVar));
    }

    private static long h(String str) {
        try {
            return ByteBuffer.wrap(i(str, MessageDigest.getInstance("SHA-1"), 8)).getLong();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            alvw h = b.h();
            h.X(alwp.a, "BugleDataModel");
            ((alvg) ((alvg) ((alvg) ((alvg) h).g(e)).g(e)).h("com/google/android/apps/messaging/shared/analytics/AnalyticsIdHelper", "getSha1Value", 157, "AnalyticsIdHelper.java")).q("Exception while getting SHA value for message");
            return -1L;
        }
    }

    private static byte[] i(String str, MessageDigest messageDigest, int i) {
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        byte[] digest = messageDigest.digest();
        if (digest.length >= i) {
            byte[] bArr = new byte[i];
            System.arraycopy(digest, 0, bArr, 0, i);
            return bArr;
        }
        return digest;
    }

    public final long a(ConversationIdType conversationIdType) {
        String a;
        if (conversationIdType.b()) {
            a = null;
        } else {
            a = conversationIdType.a();
        }
        return b(a);
    }

    public final long b(String str) {
        if (str == null) {
            return -1L;
        }
        return h(str.concat(String.valueOf(((mao) this.a.b()).a())));
    }

    public final long c(MessageCoreData messageCoreData) {
        if (messageCoreData.cw()) {
            return d(messageCoreData);
        }
        return e();
    }

    public final long d(MessageCoreData messageCoreData) {
        String str;
        Uri t = messageCoreData.t();
        if (t != null) {
            str = t.toString();
        } else {
            str = null;
        }
        return g(str, messageCoreData.ao(), messageCoreData.n(), messageCoreData.ad(), messageCoreData.E());
    }

    public final long e() {
        return ((SecureRandom) ((vyv) this.c.b()).a).nextLong();
    }
}
