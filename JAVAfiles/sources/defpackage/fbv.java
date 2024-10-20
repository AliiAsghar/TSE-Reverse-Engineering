package defpackage;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbv implements fbx {
    private static final Random d = new Random();
    public fbw c;
    private String g;
    public final ery a = new ery();
    public final erx b = new erx();
    private final HashMap e = new HashMap();
    private erz f = erz.a;
    private long h = -1;

    public static String b() {
        byte[] bArr = new byte[12];
        d.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.fbu i(int r14, defpackage.fgv r15) {
        /*
            r13 = this;
            java.util.HashMap r0 = r13.e
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
        L10:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r0.next()
            fbu r4 = (defpackage.fbu) r4
            long r5 = r4.c
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L38
            int r5 = r4.b
            if (r14 != r5) goto L38
            if (r15 == 0) goto L38
            fbv r5 = r4.g
            long r5 = r5.a()
            long r9 = r15.d
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 < 0) goto L38
            r4.c = r9
        L38:
            if (r15 != 0) goto L3f
            int r5 = r4.b
            if (r14 != r5) goto L10
            goto L67
        L3f:
            fgv r5 = r4.d
            if (r5 != 0) goto L52
            boolean r5 = r15.b()
            if (r5 != 0) goto L10
            long r5 = r15.d
            long r9 = r4.c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 == 0) goto L67
            goto L10
        L52:
            long r9 = r15.d
            long r11 = r5.d
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 != 0) goto L10
            int r6 = r15.b
            int r9 = r5.b
            if (r6 != r9) goto L10
            int r6 = r15.c
            int r5 = r5.c
            if (r6 == r5) goto L67
            goto L10
        L67:
            long r5 = r4.c
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L80
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 >= 0) goto L72
            goto L80
        L72:
            if (r7 != 0) goto L10
            int r5 = defpackage.eul.a
            fgv r5 = r3.d
            if (r5 == 0) goto L10
            fgv r5 = r4.d
            if (r5 == 0) goto L10
            r3 = r4
            goto L10
        L80:
            r3 = r4
            r1 = r5
            goto L10
        L83:
            if (r3 != 0) goto L94
            java.lang.String r0 = b()
            fbu r1 = new fbu
            r1.<init>(r13, r0, r14, r15)
            java.util.HashMap r14 = r13.e
            r14.put(r0, r1)
            return r1
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbv.i(int, fgv):fbu");
    }

    private final void j(fbu fbuVar) {
        long j = fbuVar.c;
        if (j != -1) {
            this.h = j;
        }
        this.g = null;
    }

    private final void k(fbk fbkVar) {
        fgv fgvVar;
        if (fbkVar.b.q()) {
            String str = this.g;
            if (str != null) {
                fbu fbuVar = (fbu) this.e.get(str);
                dzg.g(fbuVar);
                j(fbuVar);
                return;
            }
            return;
        }
        fbu fbuVar2 = (fbu) this.e.get(this.g);
        this.g = i(fbkVar.c, fbkVar.d).a;
        f(fbkVar);
        fgv fgvVar2 = fbkVar.d;
        if (fgvVar2 != null && fgvVar2.b()) {
            if (fbuVar2 != null) {
                if (fbuVar2.c == fgvVar2.d && (fgvVar = fbuVar2.d) != null) {
                    if (fgvVar.b == fgvVar2.b && fgvVar.c == fgvVar2.c) {
                        return;
                    }
                }
            }
            i(fbkVar.c, new fgv(fgvVar2.a, fgvVar2.d));
        }
    }

    public final long a() {
        fbu fbuVar = (fbu) this.e.get(this.g);
        if (fbuVar != null) {
            long j = fbuVar.c;
            if (j != -1) {
                return j;
            }
        }
        return this.h + 1;
    }

    @Override // defpackage.fbx
    public final synchronized String c() {
        return this.g;
    }

    @Override // defpackage.fbx
    public final synchronized String d(erz erzVar, fgv fgvVar) {
        return i(erzVar.o(fgvVar.a, this.b).c, fgvVar).a;
    }

    @Override // defpackage.fbx
    public final synchronized void e(fbk fbkVar) {
        fbw fbwVar;
        String str = this.g;
        if (str != null) {
            fbu fbuVar = (fbu) this.e.get(str);
            dzg.g(fbuVar);
            j(fbuVar);
        }
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            fbu fbuVar2 = (fbu) it.next();
            it.remove();
            if (fbuVar2.e && (fbwVar = this.c) != null) {
                fbwVar.g(fbkVar, fbuVar2.a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r0.b == r9.c) goto L16;
     */
    @Override // defpackage.fbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f(defpackage.fbk r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            fbw r0 = r8.c     // Catch: java.lang.Throwable -> Ld7
            defpackage.dzg.g(r0)     // Catch: java.lang.Throwable -> Ld7
            erz r0 = r9.b     // Catch: java.lang.Throwable -> Ld7
            boolean r0 = r0.q()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L10
            goto Ld5
        L10:
            fgv r0 = r9.d     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L38
            long r1 = r8.a()     // Catch: java.lang.Throwable -> Ld7
            long r3 = r0.d     // Catch: java.lang.Throwable -> Ld7
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Ld5
            java.util.HashMap r0 = r8.e     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r1 = r8.g     // Catch: java.lang.Throwable -> Ld7
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Ld7
            fbu r0 = (defpackage.fbu) r0     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L38
            long r1 = r0.c     // Catch: java.lang.Throwable -> Ld7
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L38
            int r0 = r0.b     // Catch: java.lang.Throwable -> Ld7
            int r1 = r9.c     // Catch: java.lang.Throwable -> Ld7
            if (r0 != r1) goto Ld5
        L38:
            int r0 = r9.c     // Catch: java.lang.Throwable -> Ld7
            fgv r1 = r9.d     // Catch: java.lang.Throwable -> Ld7
            fbu r0 = r8.i(r0, r1)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r1 = r8.g     // Catch: java.lang.Throwable -> Ld7
            if (r1 != 0) goto L48
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> Ld7
            r8.g = r1     // Catch: java.lang.Throwable -> Ld7
        L48:
            fgv r1 = r9.d     // Catch: java.lang.Throwable -> Ld7
            if (r1 == 0) goto L8e
            boolean r2 = r1.b()     // Catch: java.lang.Throwable -> Ld7
            if (r2 == 0) goto L8e
            java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> Ld7
            long r3 = r1.d     // Catch: java.lang.Throwable -> Ld7
            int r1 = r1.b     // Catch: java.lang.Throwable -> Ld7
            fgv r5 = new fgv     // Catch: java.lang.Throwable -> Ld7
            r5.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> Ld7
            int r1 = r9.c     // Catch: java.lang.Throwable -> Ld7
            fbu r1 = r8.i(r1, r5)     // Catch: java.lang.Throwable -> Ld7
            boolean r2 = r1.e     // Catch: java.lang.Throwable -> Ld7
            if (r2 != 0) goto L8e
            defpackage.fbu.b(r1)     // Catch: java.lang.Throwable -> Ld7
            erz r1 = r9.b     // Catch: java.lang.Throwable -> Ld7
            fgv r2 = r9.d     // Catch: java.lang.Throwable -> Ld7
            erx r3 = r8.b     // Catch: java.lang.Throwable -> Ld7
            java.lang.Object r2 = r2.a     // Catch: java.lang.Throwable -> Ld7
            r1.o(r2, r3)     // Catch: java.lang.Throwable -> Ld7
            erx r1 = r8.b     // Catch: java.lang.Throwable -> Ld7
            fgv r2 = r9.d     // Catch: java.lang.Throwable -> Ld7
            int r2 = r2.b     // Catch: java.lang.Throwable -> Ld7
            r1.g(r2)     // Catch: java.lang.Throwable -> Ld7
            erx r1 = r8.b     // Catch: java.lang.Throwable -> Ld7
            r2 = 0
            long r4 = defpackage.eul.z(r2)     // Catch: java.lang.Throwable -> Ld7
            long r6 = r1.f()     // Catch: java.lang.Throwable -> Ld7
            long r4 = r4 + r6
            java.lang.Math.max(r2, r4)     // Catch: java.lang.Throwable -> Ld7
        L8e:
            boolean r1 = r0.e     // Catch: java.lang.Throwable -> Ld7
            if (r1 != 0) goto L95
            defpackage.fbu.b(r0)     // Catch: java.lang.Throwable -> Ld7
        L95:
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = r8.g     // Catch: java.lang.Throwable -> Ld7
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Ld7
            if (r1 == 0) goto Ld5
            boolean r1 = r0.f     // Catch: java.lang.Throwable -> Ld7
            if (r1 != 0) goto Ld5
            r1 = 1
            r0.f = r1     // Catch: java.lang.Throwable -> Ld7
            fbw r1 = r8.c     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r0.a     // Catch: java.lang.Throwable -> Ld7
            fgv r2 = r9.d     // Catch: java.lang.Throwable -> Ld7
            if (r2 == 0) goto Lb4
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> Ld7
            if (r2 != 0) goto Ld5
        Lb4:
            r1.b()     // Catch: java.lang.Throwable -> Ld7
            r1.g = r0     // Catch: java.lang.Throwable -> Ld7
            android.media.metrics.PlaybackMetrics$Builder r0 = new android.media.metrics.PlaybackMetrics$Builder     // Catch: java.lang.Throwable -> Ld7
            r0.<init>()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = "AndroidXMedia3"
            android.media.metrics.PlaybackMetrics$Builder r0 = defpackage.aej$$ExternalSyntheticApiModelOutline0.m(r0, r2)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = "1.5.0-alpha01"
            android.media.metrics.PlaybackMetrics$Builder r0 = defpackage.aej$$ExternalSyntheticApiModelOutline0.m$1(r0, r2)     // Catch: java.lang.Throwable -> Ld7
            r1.h = r0     // Catch: java.lang.Throwable -> Ld7
            erz r0 = r9.b     // Catch: java.lang.Throwable -> Ld7
            fgv r9 = r9.d     // Catch: java.lang.Throwable -> Ld7
            r1.c(r0, r9)     // Catch: java.lang.Throwable -> Ld7
            monitor-exit(r8)
            return
        Ld5:
            monitor-exit(r8)
            return
        Ld7:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld7
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbv.f(fbk):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r2 != false) goto L15;
     */
    @Override // defpackage.fbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(defpackage.fbk r5, int r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            fbw r0 = r4.c     // Catch: java.lang.Throwable -> L4a
            defpackage.dzg.g(r0)     // Catch: java.lang.Throwable -> L4a
            java.util.HashMap r0 = r4.e     // Catch: java.lang.Throwable -> L4a
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4a
        L10:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4a
            fbu r1 = (defpackage.fbu) r1     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r1.a(r5)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L10
            r0.remove()     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r1.e     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L10
            java.lang.String r2 = r1.a     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = r4.g     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L4a
            if (r6 != 0) goto L38
            if (r2 == 0) goto L3d
            boolean r2 = r1.f     // Catch: java.lang.Throwable -> L4a
            goto L3a
        L38:
            if (r2 == 0) goto L3d
        L3a:
            r4.j(r1)     // Catch: java.lang.Throwable -> L4a
        L3d:
            fbw r2 = r4.c     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r1.a     // Catch: java.lang.Throwable -> L4a
            r2.g(r5, r1)     // Catch: java.lang.Throwable -> L4a
            goto L10
        L45:
            r4.k(r5)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r4)
            return
        L4a:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbv.g(fbk, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r4 >= r3.c()) goto L10;
     */
    @Override // defpackage.fbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h(defpackage.fbk r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            fbw r0 = r7.c     // Catch: java.lang.Throwable -> L9b
            defpackage.dzg.g(r0)     // Catch: java.lang.Throwable -> L9b
            erz r0 = r7.f     // Catch: java.lang.Throwable -> L9b
            erz r1 = r8.b     // Catch: java.lang.Throwable -> L9b
            r7.f = r1     // Catch: java.lang.Throwable -> L9b
            java.util.HashMap r1 = r7.e     // Catch: java.lang.Throwable -> L9b
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L9b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L9b
        L16:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L96
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L9b
            fbu r2 = (defpackage.fbu) r2     // Catch: java.lang.Throwable -> L9b
            erz r3 = r7.f     // Catch: java.lang.Throwable -> L9b
            int r4 = r2.b     // Catch: java.lang.Throwable -> L9b
            int r5 = r0.c()     // Catch: java.lang.Throwable -> L9b
            r6 = -1
            if (r4 < r5) goto L35
            int r5 = r3.c()     // Catch: java.lang.Throwable -> L9b
            if (r4 < r5) goto L62
        L33:
            r4 = r6
            goto L62
        L35:
            fbv r5 = r2.g     // Catch: java.lang.Throwable -> L9b
            ery r5 = r5.a     // Catch: java.lang.Throwable -> L9b
            r0.p(r4, r5)     // Catch: java.lang.Throwable -> L9b
            fbv r4 = r2.g     // Catch: java.lang.Throwable -> L9b
            ery r4 = r4.a     // Catch: java.lang.Throwable -> L9b
            int r4 = r4.n     // Catch: java.lang.Throwable -> L9b
        L42:
            fbv r5 = r2.g     // Catch: java.lang.Throwable -> L9b
            ery r5 = r5.a     // Catch: java.lang.Throwable -> L9b
            int r5 = r5.o     // Catch: java.lang.Throwable -> L9b
            if (r4 > r5) goto L33
            java.lang.Object r5 = r0.f(r4)     // Catch: java.lang.Throwable -> L9b
            int r5 = r3.a(r5)     // Catch: java.lang.Throwable -> L9b
            if (r5 == r6) goto L5f
            fbv r4 = r2.g     // Catch: java.lang.Throwable -> L9b
            erx r4 = r4.b     // Catch: java.lang.Throwable -> L9b
            erx r4 = r3.n(r5, r4)     // Catch: java.lang.Throwable -> L9b
            int r4 = r4.c     // Catch: java.lang.Throwable -> L9b
            goto L62
        L5f:
            int r4 = r4 + 1
            goto L42
        L62:
            r2.b = r4     // Catch: java.lang.Throwable -> L9b
            if (r4 != r6) goto L67
            goto L7a
        L67:
            fgv r4 = r2.d     // Catch: java.lang.Throwable -> L9b
            if (r4 != 0) goto L6c
            goto L74
        L6c:
            java.lang.Object r4 = r4.a     // Catch: java.lang.Throwable -> L9b
            int r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L9b
            if (r3 == r6) goto L7a
        L74:
            boolean r3 = r2.a(r8)     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L16
        L7a:
            r1.remove()     // Catch: java.lang.Throwable -> L9b
            boolean r3 = r2.e     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L16
            java.lang.String r3 = r2.a     // Catch: java.lang.Throwable -> L9b
            java.lang.String r4 = r7.g     // Catch: java.lang.Throwable -> L9b
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L8e
            r7.j(r2)     // Catch: java.lang.Throwable -> L9b
        L8e:
            fbw r3 = r7.c     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r2.a     // Catch: java.lang.Throwable -> L9b
            r3.g(r8, r2)     // Catch: java.lang.Throwable -> L9b
            goto L16
        L96:
            r7.k(r8)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r7)
            return
        L9b:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9b
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbv.h(fbk):void");
    }
}
