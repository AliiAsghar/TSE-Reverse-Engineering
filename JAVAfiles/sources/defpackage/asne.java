package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asne implements Runnable {
    public volatile AtomicInteger a = new AtomicInteger(0);
    final /* synthetic */ asnh b;
    private final atpk c;

    public asne(asnh asnhVar, atpk atpkVar) {
        this.b = asnhVar;
        this.c = atpkVar;
    }

    public final String a() {
        return this.b.b.a.c;
    }

    public final void b(ExecutorService executorService) {
        byte[] bArr = asmt.a;
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                this.b.b(interruptedIOException);
                this.c.a(interruptedIOException);
                this.b.a.c.b(this);
            }
        } catch (Throwable th) {
            this.b.a.c.b(this);
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:20|(9:25|26|27|28|29|30|31|32|33)|44|28|29|30|31|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        defpackage.atqx.m(r4);
        r4.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0129 A[Catch: all -> 0x012d, IOException -> 0x0149, TRY_ENTER, TryCatch #12 {IOException -> 0x0149, all -> 0x012d, blocks: (B:6:0x0022, B:11:0x0073, B:84:0x0129, B:85:0x012c), top: B:5:0x0022 }] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, ator] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, atoo] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asne.run():void");
    }
}
