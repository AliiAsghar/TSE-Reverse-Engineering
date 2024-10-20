package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwn {
    public final Context a;
    public final Executor b;
    public String c;
    public Set d;
    public asqc e;

    public aiwn(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public final aiwp a() {
        boolean z;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Must specify either forKeys(...) or forAllKeys() before calling build().");
        return new aiwp(this);
    }

    public final void b(String... strArr) {
        boolean z = true;
        d.t(true, "Cannot call forKeys() with null argument");
        alpr alprVar = new alpr();
        alprVar.i(strArr);
        alpt g = alprVar.g();
        if (g.size() != strArr.length) {
            z = false;
        }
        d.t(z, "Duplicate keys specified");
        this.d = g;
    }

    public final void c() {
        this.c = "bugle";
    }

    public final void d(aiwo aiwoVar) {
        this.e = new asqc(aiwoVar);
    }
}
