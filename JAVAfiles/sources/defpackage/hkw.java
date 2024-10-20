package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkw {
    final /* synthetic */ Context a;
    private File b = null;

    public hkw(Context context) {
        this.a = context;
    }

    public final File a() {
        if (this.b == null) {
            this.b = new File(this.a.getCacheDir(), "volley");
        }
        return this.b;
    }
}
