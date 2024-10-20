package defpackage;

import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arrt {
    public int a;
    public final Object b;
    public final Object c;

    public arrt() {
        this.b = new Object[3];
    }

    public static /* synthetic */ int b(Object obj) {
        return ((byte[]) obj).length;
    }

    public final void a(Object obj) {
        int i = this.a;
        this.a = i + 1;
        ((Object[]) this.b)[i] = obj;
    }

    public final boolean c() {
        if (!((LinkedHashMap) this.b).isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    public final int d(akhz akhzVar) {
        Integer num = (Integer) this.c.get(akhzVar);
        if (num == null) {
            int i = this.a;
            this.a = i + 1;
            Integer valueOf = Integer.valueOf(i);
            this.c.put(akhzVar, valueOf);
            Object obj = this.b;
            valueOf.getClass();
            ((SparseArray) obj).put(i, akhzVar);
            num = valueOf;
        }
        return num.intValue();
    }

    public final akhz e(int i) {
        akhz akhzVar = (akhz) ((SparseArray) this.b).get(i);
        akhzVar.getClass();
        return akhzVar;
    }

    public final void f(ahcr ahcrVar) {
        adwq adwqVar = (adwq) this.b;
        albo.T(!((apaa) adwqVar.a).cs(ahcrVar.a));
        int a = ahcrVar.a.a();
        Object obj = adwqVar.a;
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ahcu ahcuVar = (ahcu) ((apaa) obj).b;
        ahcu ahcuVar2 = ahcu.a;
        apao apaoVar = ahcuVar.d;
        if (!apaoVar.c()) {
            ahcuVar.d = apag.mutableCopy(apaoVar);
        }
        ahcuVar.d.g(a);
        ((apaa) adwqVar.a).ct(ahcrVar.a, ahcrVar.b);
    }

    public final void g(ahcp ahcpVar) {
        ((apaa) this.c).ct(ahcpVar.a, ahcpVar.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:11:0x0049, B:12:0x0069, B:14:0x006f, B:16:0x0077, B:17:0x007a), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.arpe r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.gab
            if (r0 == 0) goto L13
            r0 = r8
            gab r0 = (defpackage.gab) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            gab r0 = new gab
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            asgm r1 = r0.c
            arrt r0 = r0.e
            defpackage.aqil.P(r8)
            goto L49
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.aqil.P(r8)
            java.lang.Object r8 = r7.c
            r0.e = r7
            r2 = r8
            asgm r2 = (defpackage.asgm) r2
            r0.c = r2
            r0.b = r3
            java.lang.Object r0 = r2.b(r0)
            if (r0 == r1) goto L94
            r0 = r7
            r1 = r8
        L49:
            java.lang.Object r8 = r0.b     // Catch: java.lang.Throwable -> L8d
            gad r8 = (defpackage.gad) r8     // Catch: java.lang.Throwable -> L8d
            java.util.List r8 = r8.a()     // Catch: java.lang.Throwable -> L8d
            int r0 = r0.a     // Catch: java.lang.Throwable -> L8d
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L8d
            int r0 = r0 - r2
            int r0 = r0 + r3
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8d
            r3 = 10
            int r3 = defpackage.aqjn.J(r8, r3)     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L8d
            r3 = 0
        L69:
            boolean r4 = r8.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r4 == 0) goto L87
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Throwable -> L8d
            int r5 = r3 + 1
            if (r3 >= 0) goto L7a
            defpackage.aqjn.G()     // Catch: java.lang.Throwable -> L8d
        L7a:
            dyh r4 = (defpackage.dyh) r4     // Catch: java.lang.Throwable -> L8d
            arny r6 = new arny     // Catch: java.lang.Throwable -> L8d
            int r3 = r3 + r0
            r6.<init>(r3, r4)     // Catch: java.lang.Throwable -> L8d
            r2.add(r6)     // Catch: java.lang.Throwable -> L8d
            r3 = r5
            goto L69
        L87:
            asgm r1 = (defpackage.asgm) r1
            r1.d()
            return r2
        L8d:
            r8 = move-exception
            asgm r1 = (defpackage.asgm) r1
            r1.d()
            throw r8
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arrt.h(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[Catch: all -> 0x0168, TryCatch #0 {all -> 0x0168, blocks: (B:11:0x004e, B:13:0x0066, B:21:0x0082, B:22:0x0096, B:23:0x00ae, B:25:0x00b2, B:27:0x00c7, B:28:0x00ec, B:30:0x00f0, B:33:0x010a, B:35:0x0117, B:37:0x0124, B:38:0x012b, B:39:0x012c, B:41:0x0139, B:43:0x0146, B:45:0x014a, B:46:0x0158, B:48:0x0164, B:49:0x0167), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec A[Catch: all -> 0x0168, TryCatch #0 {all -> 0x0168, blocks: (B:11:0x004e, B:13:0x0066, B:21:0x0082, B:22:0x0096, B:23:0x00ae, B:25:0x00b2, B:27:0x00c7, B:28:0x00ec, B:30:0x00f0, B:33:0x010a, B:35:0x0117, B:37:0x0124, B:38:0x012b, B:39:0x012c, B:41:0x0139, B:43:0x0146, B:45:0x014a, B:46:0x0158, B:48:0x0164, B:49:0x0167), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.arny r8, defpackage.arpe r9) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arrt.i(arny, arpe):java.lang.Object");
    }

    public final Object j(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 > 0 && i < ((SparseArray) this.c).keyAt(i2)) {
                this.a--;
            }
        }
        while (this.a < ((SparseArray) this.c).size() - 1) {
            if (i < ((SparseArray) this.c).keyAt(this.a + 1)) {
                break;
            }
            this.a++;
        }
        return ((SparseArray) this.c).valueAt(this.a);
    }

    public final Object k() {
        return ((SparseArray) this.c).valueAt(((SparseArray) this.c).size() - 1);
    }

    public final boolean l() {
        if (((SparseArray) this.c).size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        Object obj;
        if (this.b == null && (obj = this.c) != null && ((ColorStateList) obj).isStateful()) {
            return true;
        }
        return false;
    }

    public final boolean o(int[] iArr) {
        if (n()) {
            ColorStateList colorStateList = (ColorStateList) this.c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.a) {
                this.a = colorForState;
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean p() {
        if (!m() && this.a == 0) {
            return false;
        }
        return true;
    }

    public final ahow q() {
        boolean z;
        if (this.a != 0) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Semantic events must have a semantic ID.");
        aozy createBuilder = anas.a.createBuilder();
        int i = this.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anas anasVar = (anas) createBuilder.b;
        anasVar.b |= 8;
        anasVar.d = i;
        anas anasVar2 = (anas) createBuilder.s();
        Object obj = this.c;
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ahcw ahcwVar = (ahcw) ((apaa) obj).b;
        ahcw ahcwVar2 = ahcw.a;
        anasVar2.getClass();
        ahcwVar.d = anasVar2;
        ahcwVar.b |= 1;
        return new ahow((ahcw) ((aozy) this.c).s(), ((adwq) this.b).k());
    }

    public arrt(Shader shader, ColorStateList colorStateList, int i) {
        this.b = shader;
        this.c = colorStateList;
        this.a = i;
    }

    public arrt(byte[] bArr) {
        this.b = new Object[3];
        this.c = new byte[3];
    }

    public arrt(etm etmVar) {
        this.c = new SparseArray();
        this.b = etmVar;
        this.a = -1;
    }

    public arrt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new gad();
        this.c = new asgm();
        this.a = -1;
    }

    public arrt(hpd hpdVar) {
        this.b = hzc.a(150, new hpc(this, 1));
        this.c = hpdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public arrt(byte[] bArr, byte[] bArr2) {
        this.b = new adwq(2);
        this.c = (apaa) ahcw.a.createBuilder();
    }

    public arrt(PackageManager packageManager) {
        this.c = new HashMap();
        this.a = 0;
        this.b = packageManager;
    }

    public arrt(char[] cArr) {
        this.c = new tm();
        this.b = new SparseArray();
        this.a = 0;
    }

    public arrt(Object obj, int i) {
        this.b = new LinkedHashMap();
        this.c = obj;
        this.a = i;
    }
}
