package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajya {
    public static final alvi a = alvi.m("com/google/apps/tiktok/account/api/controller/AccountIntents");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Intent intent) {
        return intent.hasExtra("$tiktok$for_requirement_activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Intent intent) {
        intent.putExtra("$tiktok$for_requirement_activity", true);
    }

    public static void c(Intent intent, ajwt ajwtVar) {
        boolean z;
        if (ajwtVar.a != -1) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        intent.putExtra("account_id", ajwtVar.a);
        intent.putExtra("$tiktok$account_id_owned", true);
    }

    public static boolean d(Intent intent) {
        return intent.hasExtra("account_id");
    }
}
