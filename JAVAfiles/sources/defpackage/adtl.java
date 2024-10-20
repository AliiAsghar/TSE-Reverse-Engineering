package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.security.GeneralSecurityException;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtl {
    public final Object a;
    public final Object b;
    public final Object c;

    public adtl(adtm adtmVar, adtg adtgVar, adtn adtnVar) {
        this.a = adtmVar;
        this.b = adtgVar;
        this.c = adtnVar;
    }

    private static final boolean A() {
        return ((Integer) aduv.h.d()).equals(1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [adtm, java.lang.Object] */
    public final int a(Context context) {
        return this.a.f(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [adtm, java.lang.Object] */
    public final int b() {
        return this.a.h();
    }

    public final Intent c() {
        return ((adtg) this.b).b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [adtm, java.lang.Object] */
    public final String d() {
        return this.a.j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [adtm, java.lang.Object] */
    public final String e() {
        return this.a.k();
    }

    public final String f() {
        return ((adtn) this.c).l();
    }

    public final String g() {
        return ((adtn) this.c).m();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [adtm, java.lang.Object] */
    public final void h() {
        this.a.n(-1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [adtm, java.lang.Object] */
    public final synchronized void i() {
        this.a.o();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [adtm, java.lang.Object] */
    public final synchronized void j() {
        this.a.q();
    }

    public final boolean k() {
        return ((adtn) this.c).u();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [adtm, java.lang.Object] */
    public final boolean l(Context context) {
        return this.a.r(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, aedw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.aecj r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aeas
            if (r0 == 0) goto L13
            r0 = r6
            aeas r0 = (defpackage.aeas) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeas r0 = new aeas
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r6)
            java.lang.Object r6 = r4.a
            aeak r6 = (defpackage.aeak) r6
            boolean r6 = r6.d
            if (r6 != 0) goto L4e
            java.lang.Object r6 = r4.b
            aday r5 = r6.a(r5)
            r0.b = r3
            java.lang.Object r6 = defpackage.aday.O(r5, r0)
            if (r6 == r1) goto L4d
        L48:
            if (r6 != 0) goto L4b
            goto L4e
        L4b:
            r3 = 0
            goto L4e
        L4d:
            return r1
        L4e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtl.m(aecj, arpe):java.lang.Object");
    }

    public final Object n(aecj aecjVar, arpe arpeVar) {
        Object d = arwi.d(new adzx(this, aecjVar, (arpe) null, 2), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(android.webkit.WebView r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.afck
            if (r0 == 0) goto L13
            r0 = r8
            afck r0 = (defpackage.afck) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            afck r0 = new afck
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2b:
            defpackage.aqil.P(r8)
            goto L47
        L2f:
            defpackage.aqil.P(r8)
            arwb r8 = defpackage.arws.a
            arya r8 = defpackage.asfh.a
            adzx r2 = new adzx
            r4 = 0
            r5 = 10
            r2.<init>(r6, r7, r4, r5)
            r0.b = r3
            java.lang.Object r7 = defpackage.arro.q(r8, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            armj r7 = new armj
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtl.o(android.webkit.WebView, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [byn, java.lang.Object] */
    public final void p(boolean z) {
        this.c.h(Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [byn, java.lang.Object] */
    public final void q(boolean z) {
        this.b.h(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:25:0x0061, B:27:0x006b, B:31:0x008c, B:32:0x0093), top: B:24:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[Catch: all -> 0x0094, TRY_ENTER, TryCatch #0 {all -> 0x0094, blocks: (B:25:0x0061, B:27:0x006b, B:31:0x008c, B:32:0x0093), top: B:24:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(defpackage.aecj r7, defpackage.aech r8, defpackage.arpe r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.aedn
            if (r0 == 0) goto L13
            r0 = r9
            aedn r0 = (defpackage.aedn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aedn r0 = new aedn
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.a
            asgm r7 = (defpackage.asgm) r7
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L2e
            goto L84
        L2e:
            r8 = move-exception
            goto L97
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            asgm r7 = r0.f
            aech r8 = r0.e
            aecj r2 = r0.d
            java.lang.Object r4 = r0.a
            adtl r4 = (defpackage.adtl) r4
            defpackage.aqil.P(r9)
            r9 = r7
            r7 = r2
            goto L61
        L48:
            defpackage.aqil.P(r9)
            java.lang.Object r9 = r6.a
            r0.a = r6
            r0.d = r7
            r0.e = r8
            r2 = r9
            asgm r2 = (defpackage.asgm) r2
            r0.f = r2
            r0.c = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 == r1) goto L9d
            r4 = r6
        L61:
            java.lang.Object r2 = r4.b     // Catch: java.lang.Throwable -> L94
            java.lang.Object r7 = r2.get(r7)     // Catch: java.lang.Throwable -> L94
            aedu r7 = (defpackage.aedu) r7     // Catch: java.lang.Throwable -> L94
            if (r7 == 0) goto L8c
            r0.a = r9     // Catch: java.lang.Throwable -> L94
            r2 = 0
            r0.d = r2     // Catch: java.lang.Throwable -> L94
            r0.e = r2     // Catch: java.lang.Throwable -> L94
            r0.f = r2     // Catch: java.lang.Throwable -> L94
            r0.c = r3     // Catch: java.lang.Throwable -> L94
            aedt r3 = new aedt     // Catch: java.lang.Throwable -> L94
            r3.<init>(r7, r8, r2)     // Catch: java.lang.Throwable -> L94
            java.lang.Object r7 = defpackage.arwi.d(r3, r0)     // Catch: java.lang.Throwable -> L94
            if (r7 == r1) goto L9d
            r5 = r9
            r9 = r7
            r7 = r5
        L84:
            aedm r9 = (defpackage.aedm) r9     // Catch: java.lang.Throwable -> L2e
            asgm r7 = (defpackage.asgm) r7
            r7.d()
            return r9
        L8c:
            java.lang.String r7 = "setProtections must be called before classify"
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L94
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L94
            throw r8     // Catch: java.lang.Throwable -> L94
        L94:
            r7 = move-exception
            r8 = r7
            r7 = r9
        L97:
            asgm r7 = (defpackage.asgm) r7
            r7.d()
            throw r8
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtl.r(aecj, aech, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x004e, B:13:0x0058), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(defpackage.aecj r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aedo
            if (r0 == 0) goto L13
            r0 = r6
            aedo r0 = (defpackage.aedo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aedo r0 = new aedo
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            asgm r5 = r0.d
            aecj r1 = r0.c
            adtl r0 = r0.f
            defpackage.aqil.P(r6)
            r6 = r5
            r5 = r1
            goto L4e
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.aqil.P(r6)
            java.lang.Object r6 = r4.a
            r0.f = r4
            r0.c = r5
            r2 = r6
            asgm r2 = (defpackage.asgm) r2
            r0.d = r2
            r0.b = r3
            java.lang.Object r0 = r2.b(r0)
            if (r0 == r1) goto L6a
            r0 = r4
        L4e:
            java.lang.Object r0 = r0.b     // Catch: java.lang.Throwable -> L63
            java.lang.Object r5 = r0.remove(r5)     // Catch: java.lang.Throwable -> L63
            aedu r5 = (defpackage.aedu) r5     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L5b
            r5.close()     // Catch: java.lang.Throwable -> L63
        L5b:
            asgm r6 = (defpackage.asgm) r6
            r6.d()
            arnb r5 = defpackage.arnb.a
            return r5
        L63:
            r5 = move-exception
            asgm r6 = (defpackage.asgm) r6
            r6.d()
            throw r5
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtl.s(aecj, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(defpackage.aecj r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aedp
            if (r0 == 0) goto L13
            r0 = r6
            aedp r0 = (defpackage.aedp) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aedp r0 = new aedp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            asgm r5 = r0.d
            aecj r1 = r0.c
            adtl r0 = r0.f
            defpackage.aqil.P(r6)
            r6 = r5
            r5 = r1
            goto L4e
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.aqil.P(r6)
            java.lang.Object r6 = r4.a
            r0.f = r4
            r0.c = r5
            r2 = r6
            asgm r2 = (defpackage.asgm) r2
            r0.d = r2
            r0.b = r3
            java.lang.Object r0 = r2.b(r0)
            if (r0 == r1) goto L69
            r0 = r4
        L4e:
            java.lang.Object r0 = r0.b     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L57
            goto L58
        L57:
            r3 = 0
        L58:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L62
            asgm r6 = (defpackage.asgm) r6
            r6.d()
            return r5
        L62:
            r5 = move-exception
            asgm r6 = (defpackage.asgm) r6
            r6.d()
            throw r5
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtl.t(aecj, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:11:0x0052, B:13:0x005c, B:14:0x005f), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(defpackage.aecj r5, defpackage.aedb r6, defpackage.arpe r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.aedq
            if (r0 == 0) goto L13
            r0 = r7
            aedq r0 = (defpackage.aedq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aedq r0 = new aedq
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            asgm r5 = r0.e
            aedb r6 = r0.d
            aecj r1 = r0.c
            adtl r0 = r0.g
            defpackage.aqil.P(r7)
            r7 = r5
            r5 = r1
            goto L52
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r4.a
            r0.g = r4
            r0.c = r5
            r0.d = r6
            r2 = r7
            asgm r2 = (defpackage.asgm) r2
            r0.e = r2
            r0.b = r3
            java.lang.Object r0 = r2.b(r0)
            if (r0 == r1) goto L82
            r0 = r4
        L52:
            java.lang.Object r1 = r0.b     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L7b
            aedu r1 = (defpackage.aedu) r1     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.lang.Throwable -> L7b
        L5f:
            java.lang.Object r1 = r0.b     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r0.c     // Catch: java.lang.Throwable -> L7b
            r5.getClass()     // Catch: java.lang.Throwable -> L7b
            r6.getClass()     // Catch: java.lang.Throwable -> L7b
            aedu r0 = new aedu     // Catch: java.lang.Throwable -> L7b
            aruy r2 = defpackage.aruy.a     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r2, r6)     // Catch: java.lang.Throwable -> L7b
            r1.put(r5, r0)     // Catch: java.lang.Throwable -> L7b
            arnb r5 = defpackage.arnb.a     // Catch: java.lang.Throwable -> L7b
            asgm r7 = (defpackage.asgm) r7
            r7.d()
            return r5
        L7b:
            r5 = move-exception
            asgm r7 = (defpackage.asgm) r7
            r7.d()
            throw r5
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtl.u(aecj, aedb, arpe):java.lang.Object");
    }

    public final Configuration.Token v() {
        xzb.c("RcsProvisioning", "Retrieving backup token");
        adut y = y();
        for (int i = 0; !y.f && i < 20; i++) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = 100 + currentTimeMillis;
                while (currentTimeMillis < j) {
                    try {
                        wait(j - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (!y.f) {
            xzb.n("RcsProvisioning", "Unable to retrieve backup token!");
            return Configuration.a;
        }
        String c = y.c("token_value", "");
        long a = y.a("token_expiration", 0L);
        if (TextUtils.isEmpty(c)) {
            xzb.c("RcsProvisioning", "No backup token found");
            return Configuration.a;
        }
        xzb.c("RcsProvisioning", "Backup token found");
        return new Configuration.Token(c, TimeUnit.MILLISECONDS.toSeconds(a - System.currentTimeMillis()));
    }

    public final Configuration w() {
        String str;
        Cipher b;
        FileInputStream openFileInput;
        Configuration configuration = null;
        try {
            Object obj = this.c;
            boolean A = A();
            int i = adjx.a;
            String str2 = "new";
            if (true != A) {
                str2 = "old";
            }
            advr.c("Loading configuration with %s key", str2);
            if (A) {
                str = adjx.a((Context) obj);
            } else {
                try {
                    try {
                        str = adwt.g((Context) obj).a.getDeviceId();
                    } catch (SecurityException e) {
                        throw new adwk("READ_PRIVILEGED_PHONE_STATE permission is missing.", e);
                    }
                } catch (adwk unused) {
                    advr.g("No permissions to get device id", new Object[0]);
                    str = null;
                }
            }
            b = adjx.b(2, str);
            openFileInput = ((Context) obj).openFileInput("rcsconfig");
        } catch (FileNotFoundException e2) {
            xzb.k("RcsProvisioning", "Failed to read config: no config found %s", e2.getMessage());
        } catch (StreamCorruptedException unused2) {
            xzb.j("RcsProvisioning", "Failed to read configuration: obsolete encryption");
        } catch (Exception e3) {
            xzb.p("RcsProvisioning", e3, "Failed to read configuration: ".concat(String.valueOf(e3.getMessage())));
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new CipherInputStream(openFileInput, b));
            Object readObject = objectInputStream.readObject();
            objectInputStream.close();
            if (openFileInput != null) {
                openFileInput.close();
            }
            configuration = (Configuration) readObject;
            if (configuration == null) {
                Configuration.Token v = v();
                Configuration configuration2 = new Configuration();
                configuration2.j(v);
                return configuration2;
            }
            if (!A()) {
                xzb.j("RcsProvisioning", "Migrating RCS config encryption key...");
                try {
                    Object obj2 = this.c;
                    Cipher b2 = adjx.b(1, adjx.a((Context) obj2));
                    FileOutputStream openFileOutput = ((Context) obj2).openFileOutput("rcsconfig", 0);
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new CipherOutputStream(openFileOutput, b2));
                        objectOutputStream.writeObject(configuration);
                        objectOutputStream.flush();
                        objectOutputStream.close();
                        if (openFileOutput != null) {
                            openFileOutput.close();
                        }
                        aduv.h.e(1);
                        return configuration;
                    } finally {
                    }
                } catch (IOException | GeneralSecurityException e4) {
                    xzb.p("RcsProvisioning", e4, "Failed to migrate encryption key: ".concat(String.valueOf(e4.getMessage())));
                    return configuration;
                }
            }
            return configuration;
        } catch (Throwable th) {
            if (openFileInput != null) {
                try {
                    openFileInput.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final Configuration x(InputStream inputStream) {
        Configuration configuration = new Configuration();
        ((adnb) this.b).a(inputStream, configuration, false);
        return configuration;
    }

    public final adut y() {
        String str;
        String str2 = "default";
        try {
            str = ((yjy) this.a).k().A((Context) this.c);
        } catch (Exception unused) {
            xzb.c("RcsProvisioning", "Exception while getting subscriber Id. Using default");
            str = "default";
        }
        if (true != TextUtils.isEmpty(str)) {
            str2 = str;
        }
        return new adut((Context) this.c, String.valueOf(str2).concat(".tbak"));
    }

    public final Optional z(Configuration configuration) {
        configuration.getClass();
        if (configuration.mType == 0) {
            ((alwl) adjs.a.g()).q("Could not retrieve MSISDN from configuration. Configuration is empty.");
            return Optional.empty();
        }
        adju c = configuration.c();
        if (c == null) {
            ((alwl) adjs.a.g()).q("Could not retrieve MSISDN from configuration. ImsConfiguration is null.");
            return Optional.empty();
        }
        String str = c.l;
        if (str != null && str.length() != 0) {
            String k = adwf.k(str, (yjr) this.c);
            if (k == null) {
                return Optional.empty();
            }
            if (((ansy) ((acuy) this.a).a.b()).e("cslib.check_phone_number_validity_in_configuration_utils") && k.length() > 0 && !((yjr) this.c).A(k)) {
                ((alwl) adjs.a.i()).t("Phone number is not in canonical format. Phone number: %s", advq.PHONE_NUMBER.c(k));
                throw new IllegalArgumentException("Phone number is not in canonical format.");
            }
            return Optional.ofNullable(((adae) this.b).d(k));
        }
        ((alwl) adjs.a.g()).q("Could not retrieve MSISDN from configuration. Public identity is null/empty.");
        return Optional.empty();
    }

    public adtl(Context context, adnb adnbVar, yjy yjyVar) {
        this.c = context;
        this.b = adnbVar;
        this.a = yjyVar;
    }

    public adtl(String str, String str2, String str3) {
        this.a = str;
        this.c = str2;
        this.b = str3;
    }

    public adtl(aeak aeakVar, aedw aedwVar, aeal aealVar) {
        aedwVar.getClass();
        this.a = aeakVar;
        this.b = aedwVar;
        this.c = aealVar;
    }

    public adtl(Object obj, admc admcVar) {
        obj.getClass();
        admcVar.getClass();
        this.b = obj;
        this.c = admcVar;
        this.a = new AtomicBoolean(false);
    }

    public adtl(yjr yjrVar, adae adaeVar, acwp acwpVar) {
        yjrVar.getClass();
        adaeVar.getClass();
        this.c = yjrVar;
        this.b = adaeVar;
        this.a = acwpVar;
    }

    public adtl(adcx adcxVar) {
        this.c = adcxVar;
        this.b = new LinkedHashMap();
        this.a = new asgm();
    }

    public adtl(arwe arweVar) {
        arweVar.getClass();
        this.a = asck.e(0, 0, 0, 7);
        this.c = new byu(false, cav.a);
        this.b = new byu(false, cav.a);
    }
}
