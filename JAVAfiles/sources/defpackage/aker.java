package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aker extends ContentObserver {
    private final aksr a;
    private final String b;
    private final Executor c;

    /* JADX INFO: Access modifiers changed from: protected */
    public aker(aksr aksrVar, String str, Executor executor) {
        super(null);
        this.a = aksrVar;
        this.b = str;
        this.c = executor;
    }

    private final void b(boolean z, Uri uri) {
        this.c.execute(akto.j(new ldv(this, z, uri, 6)));
    }

    public abstract void a(boolean z, Uri uri);

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (akqj.u()) {
            b(z, null);
            return;
        }
        akrc d = this.a.d(this.b);
        try {
            b(z, null);
            d.close();
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        if (akqj.u()) {
            b(z, uri);
            return;
        }
        akrc d = this.a.d(this.b);
        try {
            b(z, uri);
            d.close();
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
