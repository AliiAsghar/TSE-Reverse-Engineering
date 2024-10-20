package defpackage;

import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djs {
    public static final boolean a(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }
}
