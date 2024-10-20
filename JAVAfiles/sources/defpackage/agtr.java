package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agtr {
    public String a;
    public long b;
    public long c;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            sb.append(String.format("Runnable: %s ", this.a));
        }
        sb.append(String.format(Locale.US, "duration: %d", Long.valueOf(this.c)));
        return sb.toString();
    }
}
