package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysw {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/text/GroupNameValueFilter");

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        mbl ab();

        yst gq();
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        yst gq = ((a) yyb.aL(a.class)).gq();
        mbl ab = ((a) yyb.aL(a.class)).ab();
        if (!d.B(str, gq.a(str))) {
            alvg alvgVar = (alvg) a.i();
            alvgVar.Z(alwk.MEDIUM);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/text/GroupNameValueFilter", "analyzeForBase32GroupName", 64, "GroupNameValueFilter.java")).q("Conversation has a base32-encoded conversation name");
            ab.c("Bugle.Conversations.GroupNameInvalid.Count");
        }
        return str;
    }
}
