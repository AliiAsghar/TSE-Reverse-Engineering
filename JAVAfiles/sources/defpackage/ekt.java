package defpackage;

import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekt {
    public static final Object a = new Object();
    public static volatile ekt b;
    public final ReadWriteLock c;
    public final Set d;
    public volatile int e;
    public final ekq f;
    final boolean g;
    final boolean h;
    final int[] i;
    public final eks j;
    final elc k;
    public final dym l;

    public ekt(ekr ekrVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock;
        this.e = 3;
        this.g = ekrVar.a;
        this.h = ekrVar.b;
        this.i = ekrVar.c;
        this.k = ekrVar.f;
        this.j = ekrVar.e;
        to toVar = new to();
        this.d = toVar;
        this.l = new dym();
        Set set = ekrVar.d;
        if (set != null && !set.isEmpty()) {
            toVar.addAll(set);
        }
        ekq ekqVar = new ekq(this);
        this.f = ekqVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.e = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (b() == 0) {
                try {
                    qdq qdqVar = new qdq(ekqVar, null);
                    final elc elcVar = ((ekt) ekqVar.c).k;
                    synchronized (elcVar.c) {
                        elcVar.f = qdqVar;
                    }
                    synchronized (elcVar.c) {
                        if (elcVar.f == null) {
                            return;
                        }
                        if (elcVar.d == null) {
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new euk(1));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            elcVar.e = threadPoolExecutor;
                            elcVar.d = elcVar.e;
                        }
                        elcVar.d.execute(new Runnable() { // from class: elb
                            @Override // java.lang.Runnable
                            public final void run() {
                                long j;
                                Set e;
                                elc elcVar2 = elc.this;
                                synchronized (elcVar2.c) {
                                    if (elcVar2.f == null) {
                                        return;
                                    }
                                    try {
                                        try {
                                            atal l = dzn.l(elcVar2.a, elcVar2.b);
                                            if (l.a == 0) {
                                                ebv[] s = l.s();
                                                if (s != null && s.length != 0) {
                                                    ebv ebvVar = s[0];
                                                    int i = ebvVar.e;
                                                    if (i == 2) {
                                                        synchronized (elcVar2.c) {
                                                        }
                                                        i = 2;
                                                    }
                                                    if (i == 0) {
                                                        try {
                                                            int i2 = ebl.a;
                                                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                            Typeface b2 = dzn.b(elcVar2.a, new ebv[]{ebvVar});
                                                            ByteBuffer l2 = dyy.l(elcVar2.a, ebvVar.a);
                                                            if (l2 != null && b2 != null) {
                                                                try {
                                                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                                    ByteBuffer duplicate = l2.duplicate();
                                                                    duplicate.order(ByteOrder.BIG_ENDIAN);
                                                                    dyq.g(4, duplicate);
                                                                    char c = (char) duplicate.getShort();
                                                                    if (c <= 'd') {
                                                                        dyq.g(6, duplicate);
                                                                        int i3 = 0;
                                                                        while (true) {
                                                                            if (i3 < c) {
                                                                                int i4 = duplicate.getInt();
                                                                                dyq.g(4, duplicate);
                                                                                j = dyq.f(duplicate);
                                                                                dyq.g(4, duplicate);
                                                                                if (i4 == 1835365473) {
                                                                                    break;
                                                                                } else {
                                                                                    i3++;
                                                                                }
                                                                            } else {
                                                                                j = -1;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (j != -1) {
                                                                            dyq.g((int) (j - duplicate.position()), duplicate);
                                                                            dyq.g(12, duplicate);
                                                                            long f = dyq.f(duplicate);
                                                                            for (int i5 = 0; i5 < f; i5++) {
                                                                                int i6 = duplicate.getInt();
                                                                                long f2 = dyq.f(duplicate);
                                                                                dyq.f(duplicate);
                                                                                if (i6 != 1164798569 && i6 != 1701669481) {
                                                                                }
                                                                                duplicate.position((int) (f2 + j));
                                                                                fjl fjlVar = new fjl((char[]) null);
                                                                                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                                                                                fjlVar.A(duplicate.getInt(duplicate.position()) + duplicate.position(), duplicate);
                                                                                euu euuVar = new euu(b2, fjlVar);
                                                                                Trace.endSection();
                                                                                synchronized (elcVar2.c) {
                                                                                    qdq qdqVar2 = elcVar2.f;
                                                                                    if (qdqVar2 != null) {
                                                                                        Object obj = qdqVar2.a;
                                                                                        ((ekq) obj).b = euuVar;
                                                                                        Object obj2 = ((ekq) obj).b;
                                                                                        Object obj3 = ((ekq) obj).c;
                                                                                        dym dymVar = ((ekt) obj3).l;
                                                                                        eks eksVar = ((ekt) obj3).j;
                                                                                        boolean z = ((ekt) obj3).h;
                                                                                        int[] iArr = ((ekt) obj3).i;
                                                                                        if (Build.VERSION.SDK_INT >= 34) {
                                                                                            e = dyp.e();
                                                                                        } else {
                                                                                            e = dyp.e();
                                                                                        }
                                                                                        ((ekq) obj).a = new ekz((euu) obj2, dymVar, eksVar, z, iArr, e);
                                                                                        Object obj4 = ((ekq) obj).c;
                                                                                        Set set2 = ((ekt) obj4).d;
                                                                                        ArrayList arrayList = new ArrayList(((to) set2).c);
                                                                                        ((ekt) obj4).c.writeLock().lock();
                                                                                        try {
                                                                                            ((ekt) obj4).e = 1;
                                                                                            arrayList.addAll(set2);
                                                                                            set2.clear();
                                                                                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                                                                                ((fvq) arrayList.get(i7)).i();
                                                                                            }
                                                                                        } finally {
                                                                                            ((ekt) obj4).c.writeLock().unlock();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                elcVar2.a();
                                                                                return;
                                                                            }
                                                                        }
                                                                        throw new IOException("Cannot read metadata.");
                                                                    }
                                                                    throw new IOException("Cannot read metadata.");
                                                                } finally {
                                                                    Trace.endSection();
                                                                }
                                                            }
                                                            throw new RuntimeException("Unable to open file.");
                                                        } catch (Throwable th) {
                                                            int i8 = ebl.a;
                                                            throw th;
                                                        }
                                                    }
                                                    throw new RuntimeException(a.cb(i, "fetchFonts result is not OK. (", ")"));
                                                }
                                                throw new RuntimeException("fetchFonts failed (empty result)");
                                            }
                                            throw new RuntimeException("fetchFonts failed (" + l.a + ")");
                                        } catch (PackageManager.NameNotFoundException e2) {
                                            throw new RuntimeException("provider not found", e2);
                                        }
                                    } catch (Throwable th2) {
                                        synchronized (elcVar2.c) {
                                            qdq qdqVar3 = elcVar2.f;
                                            if (qdqVar3 != null) {
                                                ((ekt) ((ekq) qdqVar3.a).c).e(th2);
                                            }
                                            elcVar2.a();
                                        }
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    ((ekt) ekqVar.c).e(th);
                }
            }
        } catch (Throwable th2) {
            this.c.writeLock().unlock();
            throw th2;
        }
    }

    public static ekt c() {
        ekt ektVar;
        boolean z;
        synchronized (a) {
            ektVar = b;
            if (ektVar != null) {
                z = true;
            } else {
                z = false;
            }
            dye.f(z, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return ektVar;
    }

    public static boolean g() {
        if (b != null) {
            return true;
        }
        return false;
    }

    public final int a(CharSequence charSequence, int i) {
        dye.f(h(), "Not initialized yet");
        d.aC(charSequence, "charSequence cannot be null");
        Object obj = this.f.a;
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            ela[] elaVarArr = (ela[]) spanned.getSpans(i, i + 1, ela.class);
            if (elaVarArr.length > 0) {
                return spanned.getSpanStart(elaVarArr[0]);
            }
        }
        return ((ekw) ((ekz) obj).a(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new ekw(i))).a;
    }

    public final int b() {
        this.c.readLock().lock();
        try {
            return this.e;
        } finally {
            this.c.readLock().unlock();
        }
    }

    public final CharSequence d(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return i(charSequence, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(Throwable th) {
        Set set = this.d;
        ArrayList arrayList = new ArrayList(((to) set).c);
        this.c.writeLock().lock();
        try {
            this.e = 2;
            arrayList.addAll(set);
            set.clear();
            this.c.writeLock().unlock();
            for (int i = 0; i < arrayList.size(); i++) {
                ((fvq) arrayList.get(i)).h(th);
            }
        } catch (Throwable th2) {
            this.c.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(EditorInfo editorInfo) {
        int i;
        if (h() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            ekq ekqVar = this.f;
            Bundle bundle = editorInfo.extras;
            fjl fjlVar = (fjl) ((euu) ekqVar.b).d;
            int x = fjlVar.x(4);
            if (x != 0) {
                i = ((ByteBuffer) fjlVar.c).getInt(x + fjlVar.b);
            } else {
                i = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", ((ekt) ekqVar.c).g);
        }
    }

    public final boolean h() {
        if (b() == 1) {
            return true;
        }
        return false;
    }

    public final CharSequence i(CharSequence charSequence, int i) {
        return j(charSequence, 0, i, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
    
        ((defpackage.elf) r11).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ef, code lost:
    
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:60:0x0066, B:63:0x006b, B:65:0x006f, B:67:0x007e, B:25:0x008e, B:27:0x0098, B:30:0x009d, B:32:0x00a9, B:34:0x00ac, B:39:0x00bb, B:42:0x00c2, B:44:0x00db, B:23:0x0084), top: B:59:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:60:0x0066, B:63:0x006b, B:65:0x006f, B:67:0x007e, B:25:0x008e, B:27:0x0098, B:30:0x009d, B:32:0x00a9, B:34:0x00ac, B:39:0x00bb, B:42:0x00c2, B:44:0x00db, B:23:0x0084), top: B:59:0x0066 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence j(java.lang.CharSequence r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekt.j(java.lang.CharSequence, int, int, int):java.lang.CharSequence");
    }

    public final void k(dyp dypVar) {
        Executor e = dym.e();
        d.aC(dypVar, "initCallback cannot be null");
        fvq fvqVar = new fvq(e, dypVar);
        this.c.writeLock().lock();
        try {
            if (this.e == 1) {
                fvqVar.i();
            } else if (this.e == 2) {
                fvqVar.h(new IllegalStateException("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause."));
            } else {
                this.d.add(fvqVar);
            }
        } finally {
            this.c.writeLock().unlock();
        }
    }
}
