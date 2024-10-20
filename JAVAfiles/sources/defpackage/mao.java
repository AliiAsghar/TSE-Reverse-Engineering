package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mao {
    private final armf a;
    private volatile String b;
    private final Object c = new Object();

    public mao(armf armfVar) {
        this.a = armfVar;
    }

    public final String a() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        synchronized (this.c) {
            if (this.b != null) {
                return this.b;
            }
            String f = ((ykw) this.a.b()).f("usage_stats_hash_salt", "");
            if (TextUtils.isEmpty(f)) {
                this.b = UUID.randomUUID().toString();
                ((ykw) this.a.b()).l("usage_stats_hash_salt", this.b);
            } else {
                this.b = f;
            }
            return this.b;
        }
    }
}
