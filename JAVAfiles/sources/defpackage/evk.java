package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evk {
    public Uri a;
    public int b;
    public byte[] c;
    public Map d;
    public long e;
    public int f;

    public evk(evl evlVar) {
        this.a = evlVar.a;
        this.b = evlVar.b;
        this.c = evlVar.c;
        this.d = evlVar.d;
        this.e = evlVar.e;
        this.f = evlVar.g;
    }

    public final evl a() {
        dzg.i(this.a, "The uri must be set.");
        return new evl(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void b(String str) {
        this.a = Uri.parse(str);
    }

    public evk() {
        this.b = 1;
        this.d = Collections.emptyMap();
    }
}
