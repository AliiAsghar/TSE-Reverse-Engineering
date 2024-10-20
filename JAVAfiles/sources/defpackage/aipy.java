package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aipy extends Exception {
    public aipy(Intent intent) {
        super("Intent not registered in manifest: ".concat(String.valueOf(String.valueOf(intent))));
    }
}
