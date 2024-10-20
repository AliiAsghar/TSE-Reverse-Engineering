package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akju {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public akju(hkl hklVar) {
        this.a = false;
        this.d = null;
        this.c = null;
        this.b = hklVar;
    }

    public static void e(float[] fArr, float[] fArr2) {
        ett.w(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / sqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3 / sqrt;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final boolean a() {
        Collection values = this.d.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((asqe) it.next()).q()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        if (this.b == null) {
            return true;
        }
        return false;
    }

    public final boolean c(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.d;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                Object obj = this.c;
                long j = ((long[]) obj)[i];
                ((long[]) obj)[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.a = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean d(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.d;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                Object obj = this.c;
                long j = ((long[]) obj)[i];
                ((long[]) obj)[i] = (-1) + j;
                if (j == 1) {
                    z = true;
                    this.a = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public akju(Object obj, hjs hjsVar) {
        this.a = false;
        this.d = obj;
        this.c = hjsVar;
        this.b = null;
    }

    public akju(byte[] bArr, byte[] bArr2) {
        this.c = new float[16];
        this.b = new float[16];
        this.d = new fxg((byte[]) null);
    }

    public akju(hyp hypVar, hvt hvtVar) {
        this.c = new hwn(this);
        this.d = hypVar;
        this.b = hvtVar;
    }

    public akju(byte[] bArr) {
        this.d = new ReentrantLock();
        this.c = new long[7];
        this.b = new boolean[7];
    }

    public akju() {
        this.b = new HashSet();
        this.c = new HashSet();
        this.d = new HashMap();
    }
}
