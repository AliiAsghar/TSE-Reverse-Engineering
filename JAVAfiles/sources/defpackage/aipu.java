package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aipu extends aiqa {
    @Override // defpackage.aiqa
    protected final int a(Context context, agrk agrkVar, boolean z) {
        if (((Uri) agrkVar.a).getAuthority().lastIndexOf(64) >= 0 && dyi.c(context, "android.permission.INTERACT_ACROSS_USERS") == 0) {
            return 2;
        }
        return 3;
    }
}
