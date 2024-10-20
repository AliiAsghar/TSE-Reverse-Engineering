package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahvb {
    static {
        new ConcurrentHashMap();
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("PhenotypeStickyAccount", 0);
    }
}
