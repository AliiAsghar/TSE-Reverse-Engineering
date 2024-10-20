package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anev implements Runnable {
    Runnable a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public anev(Object obj, int i) {
        this.c = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d7, code lost:
    
        r0 = r0 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d8, code lost:
    
        r11.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0112, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e5, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
    
        defpackage.anew.a.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r11.a), (java.lang.Throwable) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010d, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0051, code lost:
    
        r4 = r4 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0052, code lost:
    
        r11.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x005d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0060, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0044 A[Catch: all -> 0x006e, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x006e, blocks: (B:64:0x0007, B:86:0x0044, B:102:0x0066, B:103:0x006d, B:67:0x000c, B:68:0x0012, B:73:0x004d, B:77:0x0057, B:80:0x005e, B:81:0x0060, B:92:0x0063, B:94:0x0015, B:97:0x0021, B:70:0x002b, B:83:0x003b, B:84:0x0041, B:72:0x004c, B:76:0x0052), top: B:63:0x0007, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anev.run():void");
    }

    public final String toString() {
        String str = "null";
        if (this.c != 0) {
            Runnable runnable = this.a;
            if (runnable != null) {
                return a.bX(runnable, "SequentialExecutorWorker{running=", "}");
            }
            int i = ((akbl) this.b).b;
            if (i == 1) {
                str = "IDLE";
            } else if (i == 2) {
                str = "QUEUED";
            } else if (i == 3) {
                str = "RUNNING";
            }
            return a.bW(str, "SequentialExecutorWorker{state=", "}");
        }
        Runnable runnable2 = this.a;
        if (runnable2 != null) {
            return a.bX(runnable2, "SequentialExecutorWorker{running=", "}");
        }
        int i2 = ((anew) this.b).d;
        if (i2 == 1) {
            str = "IDLE";
        } else if (i2 != 2) {
            if (i2 == 3) {
                str = "QUEUED";
            } else if (i2 == 4) {
                str = "RUNNING";
            }
        } else {
            str = "QUEUING";
        }
        return a.bW(str, "SequentialExecutorWorker{state=", "}");
    }
}
