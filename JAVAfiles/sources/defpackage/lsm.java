package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsm extends Exception {
    private lsm(String str) {
        super(str);
    }

    public static void a(Intent intent, String str) {
        String action = intent.getAction();
        if (action != null && action.equals(str)) {
        } else {
            throw new lsm(String.format("Action %s is not recognized. %s was expected", action, str));
        }
    }

    public static void b(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        if (extras != null && !extras.isEmpty()) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null && extras2.containsKey(str)) {
                return;
            } else {
                throw new lsm(String.format("%s intent is missing an expected extra: %s", intent.getAction(), str));
            }
        }
        throw new lsm(String.format("%s intent is missing extras.", intent.getAction()));
    }
}
