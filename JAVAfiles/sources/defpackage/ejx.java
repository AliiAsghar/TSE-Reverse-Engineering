package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejx {
    private static final Object k = new Object();
    private static volatile ejx l;
    public final ReadWriteLock a;
    public final Set b;
    public int c;
    public final Handler d;
    final ejw e;
    public final boolean f;
    final boolean g;
    final int[] h;
    public final ejv i;
    public final ekq j;

    private ejx(eju ejuVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        this.f = ejuVar.b;
        this.g = ejuVar.c;
        this.h = ejuVar.d;
        this.e = ejuVar.a;
        this.i = ejuVar.f;
        this.d = new Handler(Looper.getMainLooper());
        to toVar = new to();
        this.b = toVar;
        Set set = ejuVar.e;
        if (set != null && !set.isEmpty()) {
            toVar.addAll(set);
        }
        ekq ekqVar = new ekq(this);
        this.j = ekqVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.c = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (a() == 0) {
                try {
                    ((ejx) ekqVar.c).e.a(new qdq(ekqVar, null));
                } catch (Throwable th) {
                    ((ejx) ekqVar.c).e(th);
                }
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public static ejx b() {
        boolean z;
        ejx ejxVar;
        synchronized (k) {
            if (l != null) {
                z = true;
            } else {
                z = false;
            }
            dye.f(z, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            ejxVar = l;
        }
        return ejxVar;
    }

    public static void g(eju ejuVar) {
        if (l == null) {
            synchronized (k) {
                if (l == null) {
                    l = new ejx(ejuVar);
                }
            }
        }
    }

    public final int a() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return h(charSequence, length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0188, code lost:
    
        ((defpackage.eko) r17).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x018e, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0167, code lost:
    
        if (((defpackage.ahuq) r10).g(r17, r6, r0, r7.b()) == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8 A[Catch: all -> 0x018f, TryCatch #0 {all -> 0x018f, blocks: (B:110:0x0075, B:113:0x007a, B:115:0x007e, B:117:0x008d, B:27:0x0098, B:29:0x00a2, B:33:0x00a8, B:35:0x00b4, B:37:0x00b7, B:41:0x00c6, B:47:0x00d5, B:48:0x00e3, B:52:0x010b, B:72:0x0117, B:76:0x0126, B:77:0x012b, B:64:0x0135, B:67:0x013c, B:55:0x0141, B:57:0x014d, B:83:0x0153, B:87:0x015d, B:90:0x016b, B:91:0x0171, B:25:0x0093), top: B:109:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015d A[Catch: all -> 0x018f, TryCatch #0 {all -> 0x018f, blocks: (B:110:0x0075, B:113:0x007a, B:115:0x007e, B:117:0x008d, B:27:0x0098, B:29:0x00a2, B:33:0x00a8, B:35:0x00b4, B:37:0x00b7, B:41:0x00c6, B:47:0x00d5, B:48:0x00e3, B:52:0x010b, B:72:0x0117, B:76:0x0126, B:77:0x012b, B:64:0x0135, B:67:0x013c, B:55:0x0141, B:57:0x014d, B:83:0x0153, B:87:0x015d, B:90:0x016b, B:91:0x0171, B:25:0x0093), top: B:109:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016b A[Catch: all -> 0x018f, TryCatch #0 {all -> 0x018f, blocks: (B:110:0x0075, B:113:0x007a, B:115:0x007e, B:117:0x008d, B:27:0x0098, B:29:0x00a2, B:33:0x00a8, B:35:0x00b4, B:37:0x00b7, B:41:0x00c6, B:47:0x00d5, B:48:0x00e3, B:52:0x010b, B:72:0x0117, B:76:0x0126, B:77:0x012b, B:64:0x0135, B:67:0x013c, B:55:0x0141, B:57:0x014d, B:83:0x0153, B:87:0x015d, B:90:0x016b, B:91:0x0171, B:25:0x0093), top: B:109:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence d(java.lang.CharSequence r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejx.d(java.lang.CharSequence, int, int, int, int):java.lang.CharSequence");
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new gwa(arrayList, this.c, th, 1));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final boolean f() {
        if (a() == 1) {
            return true;
        }
        return false;
    }

    public final CharSequence h(CharSequence charSequence, int i) {
        return d(charSequence, 0, i, Integer.MAX_VALUE, 0);
    }

    public final void i(dyl dylVar) {
        d.aC(dylVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            int i = this.c;
            if (i != 1 && i != 2) {
                this.b.add(dylVar);
            }
            Handler handler = this.d;
            d.aC(dylVar, "initCallback cannot be null");
            handler.post(new gwa(Arrays.asList(dylVar), i, (Throwable) null, 1));
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
