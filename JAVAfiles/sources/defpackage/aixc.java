package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aixc implements Callable {
    volatile boolean a;
    final /* synthetic */ aixs b;
    final /* synthetic */ aixe c;
    final /* synthetic */ agrk d;

    public aixc(aixe aixeVar, aixs aixsVar, agrk agrkVar) {
        this.b = aixsVar;
        this.d = agrkVar;
        this.c = aixeVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        albo.U(!this.c.a.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        this.c.a.beginTransactionWithListener(new aixb(this));
        try {
            this.a = true;
            Object a = this.b.a(this.d);
            agrk.u();
            this.c.a.setTransactionSuccessful();
            this.a = false;
            return a;
        } finally {
            this.c.a.endTransaction();
        }
    }
}
