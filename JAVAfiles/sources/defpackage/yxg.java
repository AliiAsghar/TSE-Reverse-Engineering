package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxg {
    private static final xze a = xze.g("BugleDataModel", "MmsSendPreconditionsChecker");
    private final xbf b;
    private final vag c;
    private final yck d;

    public yxg(xbf xbfVar, vag vagVar, yck yckVar) {
        this.b = xbfVar;
        this.c = vagVar;
        this.d = yckVar;
    }

    public final Optional a(int i, Uri uri, long j) {
        if (this.d.k) {
            xyo e = a.e();
            e.H("emulate MMS send failure for debugging.");
            e.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            e.v(j);
            e.q();
            vqg a2 = vqh.a(1, 0);
            a2.c = uri;
            a2.b(8);
            return Optional.of(a2.a());
        }
        if (!this.b.a(i).r()) {
            xyo e2 = a.e();
            e2.H("MMS is not enabled by carrier.");
            e2.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            e2.v(j);
            e2.q();
            vqg a3 = vqh.a(3, 0);
            a3.c = uri;
            a3.b(7);
            return Optional.of(a3.a());
        }
        if (!this.c.b()) {
            xyo e3 = a.e();
            e3.H("Outgoing MMS is not enabled by Knox policy.");
            e3.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            e3.v(j);
            e3.q();
            vqg a4 = vqh.a(3, 0);
            a4.c = uri;
            a4.b(7);
            return Optional.of(a4.a());
        }
        return Optional.empty();
    }
}
