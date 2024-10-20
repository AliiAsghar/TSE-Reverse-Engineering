package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvv {
    private static final alwo a = alwo.o("Bugle");
    private final String b;
    private final arqg c;
    private boolean d;
    private boolean e;

    public xvv(String str, arqg arqgVar) {
        this.b = str;
        this.c = arqgVar;
    }

    public final void a(Bundle bundle) {
        bundle.getClass();
        if (this.e) {
            bundle.putBoolean(this.b, this.d);
        } else {
            ((alwl) a.i()).t("Didn't read using savedInstanceState first for %s, use default value instead", this.b);
            bundle.putBoolean(this.b, ((Boolean) this.c.a()).booleanValue());
        }
    }

    public final boolean b() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Must read using savedInstanceState first");
    }

    public final boolean c(Bundle bundle) {
        boolean booleanValue;
        if (this.e) {
            return this.d;
        }
        if (bundle != null && bundle.containsKey(this.b)) {
            booleanValue = bundle.getBoolean(this.b);
            this.d = booleanValue;
        } else {
            booleanValue = ((Boolean) this.c.a()).booleanValue();
            this.d = booleanValue;
        }
        this.e = true;
        return booleanValue;
    }

    public final void d() {
        this.d = true;
        this.e = true;
    }
}
