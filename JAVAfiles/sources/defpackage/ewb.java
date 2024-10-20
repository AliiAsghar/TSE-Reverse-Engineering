package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewb implements evg {
    public long a;
    public Uri b = Uri.EMPTY;
    private final evg c;

    public ewb(evg evgVar) {
        this.c = evgVar;
        Collections.emptyMap();
    }

    @Override // defpackage.eqe
    public final int a(byte[] bArr, int i, int i2) {
        int a = this.c.a(bArr, i, i2);
        if (a != -1) {
            this.a += a;
        }
        return a;
    }

    @Override // defpackage.evg
    public final long b(evl evlVar) {
        this.b = evlVar.a;
        Collections.emptyMap();
        long b = this.c.b(evlVar);
        Uri c = c();
        dzg.g(c);
        this.b = c;
        e();
        return b;
    }

    @Override // defpackage.evg
    public final Uri c() {
        return this.c.c();
    }

    @Override // defpackage.evg
    public final void d() {
        this.c.d();
    }

    @Override // defpackage.evg
    public final Map e() {
        return this.c.e();
    }

    @Override // defpackage.evg
    public final void f(ewc ewcVar) {
        dzg.g(ewcVar);
        this.c.f(ewcVar);
    }
}
