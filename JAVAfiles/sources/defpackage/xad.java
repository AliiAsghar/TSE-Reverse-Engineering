package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xad {
    public static final Uri a = Uri.parse("content://mms-sms/threadID");
    public static final Pattern b = Pattern.compile("\\s*(\"[^\"]*\"|[^<>\"]+)\\s*<([^<>]+)>\\s*");
    public final xca c;

    public xad(xca xcaVar) {
        this.c = xcaVar;
    }
}
