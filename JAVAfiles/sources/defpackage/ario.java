package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ario implements Runnable {
    final /* synthetic */ arip b;

    public ario(arip aripVar) {
        this.b = aripVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.b.f != null) {
                a();
                return;
            }
            throw new IOException("Unable to perform write due to unavailable sink.");
        } catch (Exception e) {
            this.b.c.a(e);
        }
    }
}
