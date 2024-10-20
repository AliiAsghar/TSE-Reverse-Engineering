package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Log;
import android.widget.ListView;
import com.google.android.apps.messaging.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apuv {
    public final int a;
    public final Object b;
    public final Object c;

    public apuv(int i, apuu apuuVar, InputStream inputStream) {
        this.a = i;
        this.b = apuuVar;
        this.c = inputStream;
    }

    private static float[] F(int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = 1.0f;
        }
        return fArr;
    }

    private static int[] G(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = 0;
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [fdq, java.lang.Object] */
    public final void A(Exception exc) {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            fdx fdxVar = (fdx) it.next();
            ?? r2 = fdxVar.a;
            eul.ak((Handler) fdxVar.b, new faq(this, (fdq) r2, exc, 4));
        }
    }

    public final void B() {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            fdx fdxVar = (fdx) it.next();
            Object obj = fdxVar.a;
            eul.ak((Handler) fdxVar.b, new ewq(this, obj, 20));
        }
    }

    public final ListView C() {
        return ((nd) this.c).e;
    }

    public final apuv D(fgv fgvVar) {
        return new apuv((CopyOnWriteArrayList) this.c, fgvVar);
    }

    public final apuv E(fgv fgvVar) {
        return new apuv((CopyOnWriteArrayList) this.c, fgvVar);
    }

    public final String a() {
        String concat;
        String a = ((apuu) this.b).a("X-GUploader-UploadID");
        String valueOf = String.valueOf(this.b);
        if (a == null) {
            concat = "\n No upload id.";
        } else {
            concat = "\n Upload id: ".concat(a);
        }
        return "HttpResponse:\n   " + this.a + "  " + valueOf + concat;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arqg] */
    public final long b() {
        Object a = this.b.a();
        a.getClass();
        return ((Long) a).longValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arqg] */
    public final apbt c() {
        Object a = this.b.a();
        a.getClass();
        return (apbt) a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arqg] */
    public final String d() {
        Object a = this.b.a();
        a.getClass();
        return (String) a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arqg] */
    public final boolean e() {
        Object a = this.b.a();
        a.getClass();
        return ((Boolean) a).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r1v0, types: [algk, java.lang.Object] */
    public final void f() {
        while (true) {
            Object poll = this.b.poll();
            if (poll != null) {
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Deque] */
    public final boolean g() {
        return this.b.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v6, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Deque] */
    public final boolean h(Object obj) {
        ArrayDeque arrayDeque = new ArrayDeque(this.b.size());
        while (this.b.peek() != null && this.b.peek() != obj) {
            arrayDeque.add(this.b.poll());
        }
        if (this.b.peek() != obj) {
            while (true) {
                Object pollLast = arrayDeque.pollLast();
                if (pollLast != null) {
                    this.b.addFirst(pollLast);
                } else {
                    return false;
                }
            }
        } else {
            this.b.poll();
            while (true) {
                Object poll = arrayDeque.poll();
                if (poll != null) {
                } else {
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r2v2, types: [algk, java.lang.Object] */
    public final void i(Object obj) {
        ArrayDeque arrayDeque = new ArrayDeque(this.b.size());
        while (true) {
            Object poll = this.b.poll();
            if (poll == null) {
                break;
            } else if (arrayDeque.size() < this.a - 1) {
                arrayDeque.add(poll);
            }
        }
        while (true) {
            Object poll2 = arrayDeque.poll();
            if (poll2 != null) {
                this.b.add(poll2);
            } else {
                this.b.add(obj);
                return;
            }
        }
    }

    protected final String j(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return ((String) this.c).concat(str);
    }

    public final void k(String str, Object... objArr) {
        if (this.a <= 3) {
            Log.d((String) this.b, j(str, objArr));
        }
    }

    public final void l(String str, Object... objArr) {
        Log.e((String) this.b, j(str, objArr));
    }

    public final void m(String str, Throwable th, Object... objArr) {
        Log.e((String) this.b, j(str, objArr), th);
    }

    public final void n(String str, Object... objArr) {
        Log.w((String) this.b, j(str, objArr));
    }

    public final void o(String str, Throwable th, Object... objArr) {
        Log.w((String) this.b, j(str, objArr), th);
    }

    public final void p(String str, Object... objArr) {
        if (Log.isLoggable((String) this.b, 3)) {
            k(str, objArr);
        }
    }

    public final boolean q() {
        return ((esf) this.c).c(this.a);
    }

    public final void r(etm etmVar) {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            fvq fvqVar = (fvq) it.next();
            Object obj = fvqVar.a;
            eul.ak((Handler) fvqVar.b, new fhh(etmVar, obj, 1));
        }
    }

    public final void s(final fgr fgrVar) {
        r(new etm() { // from class: fgy
            @Override // defpackage.etm
            public final void a(Object obj) {
                ((fhb) obj).eA(0, (fgv) apuv.this.b, fgrVar);
            }
        });
    }

    public final void t(fgm fgmVar, fgr fgrVar) {
        r(new fgz(this, fgmVar, fgrVar, 2));
    }

    public final void u(fgm fgmVar, fgr fgrVar) {
        r(new fgz(this, fgmVar, fgrVar, 0));
    }

    public final void v(final fgm fgmVar, final fgr fgrVar, final IOException iOException, final boolean z) {
        r(new etm() { // from class: fha
            @Override // defpackage.etm
            public final void a(Object obj) {
                ((fhb) obj).i(0, (fgv) apuv.this.b, fgmVar, fgrVar, iOException, z);
            }
        });
    }

    public final void w(fgm fgmVar, fgr fgrVar) {
        r(new fgz(this, fgmVar, fgrVar, 1));
    }

    public final void x() {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            fdx fdxVar = (fdx) it.next();
            Object obj = fdxVar.a;
            eul.ak((Handler) fdxVar.b, new ewq(this, obj, 19));
        }
    }

    public final void y() {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            fdx fdxVar = (fdx) it.next();
            Object obj = fdxVar.a;
            eul.ak((Handler) fdxVar.b, new ewq(this, obj, 18));
        }
    }

    public final void z(int i) {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            fdx fdxVar = (fdx) it.next();
            Object obj = fdxVar.a;
            eul.ak((Handler) fdxVar.b, new qq(this, obj, i, 6, (char[]) null));
        }
    }

    public apuv(int i, List list, eqo eqoVar) {
        this.a = i;
        this.c = list;
        this.b = eqoVar;
    }

    public apuv(abru abruVar, int i, abrc abrcVar) {
        this.b = abruVar;
        this.a = i;
        this.c = abrcVar;
    }

    public apuv(eqn eqnVar, String str) {
        this.b = eqnVar;
        this.a = 0;
        this.c = str;
    }

    public apuv(Object obj, int i, Object obj2) {
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    public apuv(Map map, int i, zbk zbkVar) {
        this.c = map;
        this.a = i;
        this.b = zbkVar;
    }

    public apuv(CopyOnWriteArrayList copyOnWriteArrayList, fgv fgvVar) {
        this.c = copyOnWriteArrayList;
        this.a = 0;
        this.b = fgvVar;
    }

    public apuv(ng ngVar, ij ijVar, int i) {
        this.c = ngVar;
        this.b = ijVar;
        this.a = i;
    }

    public apuv() {
        this.a = 6;
        this.b = F(6);
        this.c = G(6);
    }

    public apuv(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.b = colorStateList;
        this.c = configuration;
        this.a = theme == null ? 0 : theme.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public apuv(esg esgVar, int i, int i2, String str) {
        this.c = (esf) esgVar.b.get(i);
        this.a = i2;
        this.b = str;
    }

    public apuv(Context context) {
        this.c = context;
        this.b = context.getResources();
        this.a = (int) context.getResources().getDimension(R.dimen.audio_attachment_seekbar_thumb_size);
    }

    public apuv(int i, float[] fArr, int[] iArr) {
        this.a = i;
        this.b = fArr == null ? F(i) : fArr;
        this.c = iArr == null ? G(i) : iArr;
    }

    public apuv(int i, algk algkVar) {
        d.t(true, "maxValues must be greater than zero. Were it equal to zero, the queue would unconditionally (and unhelpfully) preempt all added values.");
        this.a = i;
        this.c = algkVar;
        this.b = new ArrayDeque(i);
    }

    public apuv(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            String str2 = strArr[0];
            if (sb2.length() > 1) {
                sb2.append(",");
            }
            sb2.append(str2);
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.c = sb;
        this.b = str;
        new zfm(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.b, i)) {
            i++;
        }
        this.a = i;
    }

    public /* synthetic */ apuv(arqg arqgVar, int i) {
        this(arqgVar, i, (Object) null);
    }

    public apuv(String str) {
        this(str, new String[0]);
    }

    public apuv(alcp alcpVar) {
        this.b = Pattern.compile(alcpVar.b, 64);
        this.a = alcpVar.c;
        String str = alcpVar.d;
        this.c = !str.isEmpty() ? Pattern.compile(str, 64) : null;
    }
}
