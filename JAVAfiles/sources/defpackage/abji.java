package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abji {
    static final String[] a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    private static final Map b = new HashMap(10);

    static {
        for (int i = 0; i < 10; i++) {
            b.put(a[i], Integer.valueOf(i));
        }
    }

    public static String a(int i) {
        if (i >= 0 && i < 10) {
            return a[i];
        }
        return null;
    }
}
