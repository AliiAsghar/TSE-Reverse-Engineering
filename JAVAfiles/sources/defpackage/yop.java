package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import com.google.android.apps.messaging.R;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yop {
    static final utz a = uuh.e(uuh.b, "spam_auto_reply_time_seconds", 600);
    static final utz b = uuh.i(uuh.b, "disable_logging_spam_auto_reply_conversation_observer", false);
    public final armf c;
    public final Context d;
    public final riv e;
    public final xnv f;
    public final mbl g;
    public final tqx h;
    public final Object i = new Object();
    public ContentObserver j = null;
    public long k;
    public final Pattern l;

    public yop(armf armfVar, Context context, riv rivVar, xnv xnvVar, mbl mblVar, tqx tqxVar) {
        this.c = armfVar;
        this.d = context;
        this.e = rivVar;
        this.f = xnvVar;
        this.g = mblVar;
        this.h = tqxVar;
        Resources resources = context.getResources();
        this.l = Pattern.compile("(?=.*" + resources.getString(R.string.spam_auto_reply_heuristic_reply) + ")((?=.*" + resources.getString(R.string.spam_auto_reply_heuristic_number) + ")|(?=.*#)).+", 2);
    }

    public final void a(ContentObserver contentObserver) {
        this.d.getContentResolver().unregisterContentObserver(contentObserver);
    }
}
