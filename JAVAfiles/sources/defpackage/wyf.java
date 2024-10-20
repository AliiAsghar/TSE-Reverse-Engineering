package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wyf {
    public static final String[] a = {"_id", "mid", "chset", "ct", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "name"};
    public String b;
    public long c;
    public long d;
    public String e;
    public String f;
    public int g;
    public long h;
    public String i;
    private final Context j;
    private final ydk k;

    public wyf(Context context, ydk ydkVar) {
        this.j = context;
        this.k = ydkVar;
    }

    public final Uri a() {
        return Uri.parse("content://mms/part/" + this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.database.Cursor r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyf.b(android.database.Cursor, boolean):void");
    }

    public final boolean c() {
        return gh.p(this.e);
    }

    public final boolean d() {
        return RbmSpecificMessage.CONTENT_TYPE.equals(this.e);
    }

    public final boolean e() {
        if (!"text/plain".equals(this.e) && !"text/html".equals(this.e) && !"application/vnd.wap.xhtml+xml".equals(this.e)) {
            return false;
        }
        return true;
    }
}
