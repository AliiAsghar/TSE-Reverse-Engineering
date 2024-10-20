package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.Feature;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aquq {
    public final Object a;
    private final Object b;
    private volatile Object c;

    public aquq(aqun aqunVar, Object obj) {
        this.a = aqunVar;
        this.b = obj;
    }

    public static aqun a(aquo aquoVar) {
        Object obj;
        if (aqun.class.isInstance(aquoVar.c)) {
            obj = aqun.class.cast(aquoVar.c);
        } else {
            obj = null;
        }
        return (aqun) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aqun, java.lang.Object] */
    public final InputStream b() {
        return this.a.a(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] c() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = aqut.m(b());
                }
            }
        }
        return (byte[]) this.c;
    }

    public final hlp d() {
        return ((akmt) h()).b();
    }

    public final hlp e(Drawable drawable) {
        return h().d(drawable);
    }

    public final hlp f(Uri uri) {
        return h().e(uri);
    }

    public final hlp g(String str) {
        return h().g(str);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    public final hls h() {
        if (this.c == null) {
            synchronized (this.b) {
                if (this.c == null) {
                    this.c = this.a.b();
                }
            }
        }
        return (hls) this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, acjj] */
    public final ListenableFuture i(Context context, boolean z, boolean z2) {
        Object obj;
        if (!z) {
            return albo.bI(true);
        }
        Boolean bool = (Boolean) ((AtomicReference) this.a).get();
        if (bool == null) {
            Object obj2 = this.c;
            abrc abrcVar = obj2;
            if (obj2 == null) {
                synchronized (this) {
                    Object obj3 = this.c;
                    obj = obj3;
                    if (obj3 == null) {
                        acjj a = acjh.a(context);
                        this.c = a;
                        obj = a;
                    }
                }
                abrcVar = obj;
            }
            if (z2 && !((AtomicBoolean) this.b).getAndSet(true)) {
                abrc abrcVar2 = abrcVar;
                absy g = abhb.g(new acji() { // from class: ahsf
                    @Override // defpackage.acji
                    public final void a() {
                        ((AtomicReference) aquq.this.a).set(null);
                    }
                }, abrcVar2.g, acji.class.getSimpleName());
                acgg acggVar = new acgg(abrcVar2, g, ((acjg) abrcVar2.e).a, 2);
                abot abotVar = new abot(abrcVar, 14);
                abte abteVar = new abte();
                abteVar.a = acggVar;
                abteVar.b = abotVar;
                abteVar.c = g;
                abteVar.d = new Feature[]{acja.a};
                abteVar.e = 4507;
                abrcVar2.v(abteVar.b());
            }
            return ancd.f(ancj.f(anee.o(agkx.f(abrcVar.o())), akto.a(new agui(this, 4)), andi.a), Throwable.class, new ahnx(5), andi.a);
        }
        return albo.bI(bool);
    }

    public aquq(armf armfVar) {
        this.b = new Object();
        this.a = armfVar;
    }

    public aquq() {
        this.a = new AtomicReference();
        this.b = new AtomicBoolean(false);
    }
}
