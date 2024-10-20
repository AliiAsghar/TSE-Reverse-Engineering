package defpackage;

import com.android.ex.photo.views.PhotoView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hik implements Runnable {
    public final PhotoView a;
    public float b;
    public float c;
    public boolean d;
    public float e;
    public float f;
    public float g;
    public long h;
    public boolean i;
    public boolean j;

    public hik(PhotoView photoView) {
        this.a = photoView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r4 == r1) goto L12;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
            boolean r0 = r6.j
            if (r0 == 0) goto L5
            goto L42
        L5:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.h
            long r0 = r0 - r2
            float r2 = r6.f
            float r3 = r6.g
            float r0 = (float) r0
            float r3 = r3 * r0
            float r2 = r2 + r3
            com.android.ex.photo.views.PhotoView r0 = r6.a
            float r1 = r6.b
            float r3 = r6.c
            r0.c(r2, r1, r3)
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            boolean r4 = r6.d
            if (r1 > 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r4 != r1) goto L39
        L2c:
            com.android.ex.photo.views.PhotoView r1 = r6.a
            float r4 = r6.b
            float r5 = r6.c
            r1.c(r0, r4, r5)
            r6.i = r3
            r6.j = r2
        L39:
            boolean r0 = r6.j
            if (r0 != 0) goto L42
            com.android.ex.photo.views.PhotoView r0 = r6.a
            r0.post(r6)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hik.run():void");
    }
}
