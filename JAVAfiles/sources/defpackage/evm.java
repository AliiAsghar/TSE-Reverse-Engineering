package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evm implements evf {
    private final Context a;
    private final evf b;

    public evm(Context context) {
        evo evoVar = new evo();
        this.a = context.getApplicationContext();
        this.b = evoVar;
    }

    public final evn a() {
        return new evn(this.a, ((evo) this.b).a());
    }
}
