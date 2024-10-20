package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hod implements hnu {
    public final huj a;

    public hod(InputStream inputStream, hqh hqhVar) {
        huj hujVar = new huj(inputStream, hqhVar);
        this.a = hujVar;
        hujVar.mark(5242880);
    }

    @Override // defpackage.hnu
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.hnu
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a() {
        this.a.reset();
        return this.a;
    }
}
