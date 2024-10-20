package defpackage;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkc {
    public static kkc d;
    public final Object a;
    public final Object b;
    public final Object c;

    public kkc(Context context, LocationManager locationManager) {
        this.a = new fx();
        this.b = context;
        this.c = locationManager;
    }

    private final boolean M() {
        return gvf.ax("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new gqu(this, 0));
    }

    public static final fzu n(fzu fzuVar, gba gbaVar) {
        gaz gazVar;
        gaz gazVar2;
        gaz gazVar3;
        if (fzuVar != null) {
            gazVar = fzuVar.a;
        } else {
            gazVar = gay.b;
        }
        gaz gazVar4 = gbaVar.b;
        if (fzuVar != null) {
            gazVar2 = fzuVar.b;
        } else {
            gazVar2 = gay.b;
        }
        gaz N = N(gazVar2, gazVar4, gbaVar.c, null);
        if (fzuVar != null) {
            gazVar3 = fzuVar.c;
        } else {
            gazVar3 = gay.b;
        }
        return new fzu(N(gazVar, gazVar4, gazVar4, null), N, N(gazVar3, gazVar4, gbaVar.d, null), gbaVar);
    }

    public final void A(Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((da) ((qdq) it.next()).a).X(menu);
        }
    }

    public final boolean B(MenuItem menuItem) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            if (((da) ((qdq) it.next()).a).W(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void C(dwd dwdVar) {
        ((ArrayList) this.b).clear();
        int size = dwdVar.aL.size();
        for (int i = 0; i < size; i++) {
            dwc dwcVar = (dwc) dwdVar.aL.get(i);
            if (dwcVar.W() == 3 || dwcVar.X() == 3) {
                ((ArrayList) this.b).add(dwcVar);
            }
        }
        dwdVar.c();
    }

    public final boolean D(dwm dwmVar, dwc dwcVar, int i) {
        boolean z;
        boolean z2;
        ((dwl) this.a).i = dwcVar.W();
        ((dwl) this.a).j = dwcVar.X();
        ((dwl) this.a).a = dwcVar.j();
        dwl dwlVar = (dwl) this.a;
        dwlVar.b = dwcVar.h();
        dwlVar.g = false;
        dwlVar.h = i;
        int i2 = dwlVar.i;
        int i3 = dwlVar.j;
        if (i2 == 3 && dwcVar.ah > brg.a) {
            z = true;
        } else {
            z = false;
        }
        if (i3 == 3 && dwcVar.ah > brg.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && dwcVar.E[0] == 4) {
            dwlVar.i = 1;
        }
        if (z2 && dwcVar.E[1] == 4) {
            dwlVar.j = 1;
        }
        dwmVar.b(dwcVar, dwlVar);
        dwcVar.M(((dwl) this.a).c);
        dwcVar.B(((dwl) this.a).d);
        dwl dwlVar2 = (dwl) this.a;
        dwcVar.P = dwlVar2.f;
        dwcVar.x(dwlVar2.e);
        dwl dwlVar3 = (dwl) this.a;
        dwlVar3.h = 0;
        return dwlVar3.g;
    }

    public final void E(dwd dwdVar, int i, int i2, int i3) {
        int i4 = dwdVar.am;
        int i5 = dwdVar.an;
        dwdVar.J(0);
        dwdVar.I(0);
        dwdVar.M(i2);
        dwdVar.B(i3);
        dwdVar.J(i4);
        dwdVar.I(i5);
        Object obj = this.c;
        ((dwd) obj).b = i;
        ((dwk) obj).ae();
    }

    public final float F(Object obj) {
        if (obj instanceof dvc) {
            String v = ((dvc) obj).v();
            if (((HashMap) this.c).containsKey(v)) {
                return ((dvg) ((HashMap) this.c).get(v)).a();
            }
            if (((HashMap) this.a).containsKey(v)) {
                return ((Integer) ((HashMap) this.a).get(v)).floatValue();
            }
            return brg.a;
        }
        if (obj instanceof duy) {
            return ((duy) obj).t();
        }
        return brg.a;
    }

    public final void G(String str, int i) {
        ((HashMap) this.a).put(str, Integer.valueOf(i));
    }

    public final void H(String str, ArrayList arrayList) {
        ((HashMap) this.b).put(str, arrayList);
    }

    public final duw I() {
        Object obj = this.b;
        if (obj != null) {
            return new duy(((dqy) obj).a);
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return dvc.a((String) obj2);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + ((String) this.c) + ". Using WrapContent.");
        return dvc.a("wrap");
    }

    public final boolean J() {
        if (this.b == null && this.a == null) {
            return true;
        }
        return false;
    }

    public final Location K(String str) {
        try {
            if (((LocationManager) this.c).isProviderEnabled(str)) {
                return ((LocationManager) this.c).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    public final kkc L(int i) {
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            iArr[i3] = ((Random) this.a).nextInt(((int[]) this.c).length + 1);
            int i4 = i3 + 1;
            int nextInt = ((Random) this.a).nextInt(i4);
            iArr2[i3] = iArr2[nextInt];
            iArr2[nextInt] = i3;
            i3 = i4;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[((int[]) this.c).length + i];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr4 = (int[]) this.c;
            if (i2 < iArr4.length + i) {
                if (i5 < i && i6 == iArr[i5]) {
                    iArr3[i2] = iArr2[i5];
                    i5++;
                } else {
                    int i7 = i6 + 1;
                    int i8 = iArr4[i6];
                    iArr3[i2] = i8;
                    if (i8 >= 0) {
                        iArr3[i2] = i8 + i;
                    }
                    i6 = i7;
                }
                i2++;
            } else {
                return new kkc(iArr3, new Random(((Random) this.a).nextLong()));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final boolean a() {
        return ((zxy) this.b.b()).p(((zxy) this.b.b()).m());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [arwe, java.lang.Object] */
    public final akul b() {
        return qjh.i(this.a, new leb(this, (arpe) null, 0));
    }

    public final boolean c(Class cls, Class cls2) {
        if (((Class) this.c).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.a)) {
            return true;
        }
        return false;
    }

    public final boolean d(Class cls) {
        return ((Class) this.a).isAssignableFrom(cls);
    }

    public final String e() {
        String uuid = ((UUID) this.a).toString();
        uuid.getClass();
        return uuid;
    }

    public final WindowLayoutComponent f() {
        WindowExtensions windowExtensions;
        WindowLayoutComponent windowLayoutComponent;
        if (!((hgi) this.a).t() || !gvf.ax("WindowExtensions#getWindowLayoutComponent is not valid", new gqu(this, 4)) || !gvf.ax("FoldingFeature class is not valid", new gov(this, 20))) {
            return null;
        }
        int i = gor.a;
        int a = gor.a();
        if (a <= 0) {
            return null;
        }
        boolean z = true;
        if (a == 1) {
            z = M();
        } else if (a < 5) {
            z = j();
        } else if (!j() || !gvf.ax("DisplayFoldFeature is not valid", new gov(this, 19)) || !gvf.ax("SupportedWindowFeatures is not valid", new gqu(this, 3)) || !gvf.ax("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new gqu(this, 1))) {
            z = false;
        }
        if (!z) {
            return null;
        }
        try {
            windowExtensions = WindowExtensionsProvider.getWindowExtensions();
            windowLayoutComponent = windowExtensions.getWindowLayoutComponent();
            return windowLayoutComponent;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final Class g() {
        Class<?> loadClass = ((ClassLoader) this.c).loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
        loadClass.getClass();
        return loadClass;
    }

    public final Class h() {
        Class<?> loadClass = ((ClassLoader) this.c).loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
        loadClass.getClass();
        return loadClass;
    }

    public final Class i() {
        Class<?> loadClass = ((ClassLoader) this.c).loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        loadClass.getClass();
        return loadClass;
    }

    public final boolean j() {
        if (M()) {
            if (gvf.ax("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new gqu(this, 2))) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void k(ghg ghgVar) {
        this.c.add(ghgVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void l() {
        for (ghg ghgVar : this.c) {
            if (ghgVar.b()) {
                ghgVar.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Iterable] */
    public final void m(arqr arqrVar) {
        ?? r0;
        Object c;
        fzu fzuVar;
        do {
            r0 = this.b;
            c = r0.c();
            fzu fzuVar2 = (fzu) c;
            fzuVar = (fzu) arqrVar.a(fzuVar2);
            if (d.F(fzuVar2, fzuVar)) {
                return;
            }
        } while (!r0.g(c, fzuVar));
        if (fzuVar != null) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((arqr) it.next()).a(fzuVar);
            }
        }
    }

    public final void o(gba gbaVar) {
        m(new rh(gbaVar, 14));
    }

    public final ByteBuffer p() {
        long j = ((AtomicLong) this.a).get();
        if (!((ByteBuffer) this.c).hasRemaining()) {
            ((ByteBuffer) this.c).clear();
            if (j < ((ByteBuffer) this.c).capacity()) {
                ((ByteBuffer) this.c).limit((int) j);
            }
            ((AtomicLong) this.a).addAndGet(-((ByteBuffer) this.c).remaining());
        }
        return (ByteBuffer) this.c;
    }

    public final boolean q() {
        if (!((ByteBuffer) this.c).hasRemaining() && ((AtomicLong) this.a).get() <= 0) {
            return false;
        }
        return true;
    }

    public final void r(long j, euf eufVar) {
        ((fqf) this.a).a(j, eufVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    public final void s(flw flwVar, fuq fuqVar) {
        for (int i = 0; i < ((fmq[]) this.c).length; i++) {
            fuqVar.c();
            fmq p = flwVar.p(fuqVar.a(), 3);
            eqn eqnVar = (eqn) this.b.get(i);
            String str = eqnVar.o;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            d.t(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String str2 = eqnVar.a;
            if (str2 == null) {
                str2 = fuqVar.b();
            }
            eqm eqmVar = new eqm();
            eqmVar.a = str2;
            eqmVar.b(str);
            eqmVar.e = eqnVar.e;
            eqmVar.d = eqnVar.d;
            eqmVar.G = eqnVar.I;
            eqmVar.p = eqnVar.r;
            p.h(new eqn(eqmVar));
            ((fmq[]) this.c)[i] = p;
        }
    }

    public final void t() {
        ((fqf) this.a).b();
    }

    public final void u(int i) {
        ((fqf) this.a).c(i);
    }

    public final int v() {
        return ((int[]) this.c).length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r7 != r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [asgm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(defpackage.arqr r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.eix
            if (r0 == 0) goto L13
            r0 = r7
            eix r0 = (defpackage.eix) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eix r0 = new eix
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.a
            asgm r6 = (defpackage.asgm) r6
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r7 = move-exception
            goto L6c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            asgm r6 = r0.d
            java.lang.Object r2 = r0.a
            arqr r2 = (defpackage.arqr) r2
            defpackage.aqil.P(r7)
            goto L58
        L42:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r5.a
            r0.a = r6
            r2 = r7
            asgm r2 = (defpackage.asgm) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 == r1) goto L72
            r2 = r6
            r6 = r7
        L58:
            r0.a = r6     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            r0.d = r7     // Catch: java.lang.Throwable -> L2e
            r0.c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r2.a(r0)     // Catch: java.lang.Throwable -> L2e
            if (r7 != r1) goto L66
            goto L72
        L66:
            asgm r6 = (defpackage.asgm) r6
            r6.d()
            return r7
        L6c:
            asgm r6 = (defpackage.asgm) r6
            r6.d()
            throw r7
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkc.w(arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(defpackage.arqv r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.eiy
            if (r0 == 0) goto L13
            r0 = r8
            eiy r0 = (defpackage.eiy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eiy r0 = new eiy
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r7 = r0.a
            asgm r0 = r0.d
            defpackage.aqil.P(r8)     // Catch: java.lang.Throwable -> L2b
            goto L57
        L2b:
            r8 = move-exception
            goto L64
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.aqil.P(r8)
            java.lang.Object r8 = r6.a
            r2 = r8
            asgm r2 = (defpackage.asgm) r2
            boolean r2 = r2.c()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L60
            r5 = r8
            asgm r5 = (defpackage.asgm) r5     // Catch: java.lang.Throwable -> L60
            r0.d = r5     // Catch: java.lang.Throwable -> L60
            r0.a = r2     // Catch: java.lang.Throwable -> L60
            r0.c = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = r7.a(r4, r0)     // Catch: java.lang.Throwable -> L60
            if (r7 == r1) goto L5f
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5e
            asgm r0 = (defpackage.asgm) r0
            r0.d()
        L5e:
            return r8
        L5f:
            return r1
        L60:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L64:
            if (r7 == 0) goto L6b
            asgm r0 = (defpackage.asgm) r0
            r0.d()
        L6b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkc.x(arqv, arpe):java.lang.Object");
    }

    public final Object y() {
        return new Integer(((AtomicInteger) ((efu) this.b).a).get());
    }

    public final void z(Menu menu, MenuInflater menuInflater) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((da) ((qdq) it.next()).a).V(menu, menuInflater);
        }
    }

    public kkc(Context context, Optional optional, vjs vjsVar) {
        this.b = context;
        this.c = optional;
        this.a = vjsVar;
    }

    public kkc(Pair pair, Pair pair2, Pair pair3) {
        this.c = pair;
        this.b = pair2;
        this.a = pair3;
    }

    public kkc(dqy dqyVar, String str) {
        this.a = new kkc(dqyVar, str, "base", (byte[]) null);
        this.c = new kkc((Object) null, (Object) null, "min", (byte[]) null);
        this.b = new kkc((Object) null, (Object) null, "max", (byte[]) null);
    }

    public kkc(fgx fgxVar, fgw fgwVar, Object obj) {
        this.a = fgxVar;
        this.b = fgwVar;
        this.c = obj;
    }

    public kkc(Class cls, Class cls2, hvq hvqVar) {
        this.c = cls;
        this.a = cls2;
        this.b = hvqVar;
    }

    public kkc(ClassLoader classLoader, goq goqVar) {
        this.c = classLoader;
        this.b = goqVar;
        this.a = new hgi(classLoader, (byte[]) null);
    }

    public kkc(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public kkc(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public kkc(Object obj, Object obj2, Object obj3, char[] cArr) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public kkc(qan qanVar, qap qapVar, kkg kkgVar) {
        this.a = qanVar;
        this.c = qapVar;
        this.b = kkgVar;
    }

    public kkc(View view, Window window) {
        view.getClass();
        this.b = view;
        this.c = window;
        this.a = window != null ? new efu(window, view) : null;
    }

    public kkc(arpi arpiVar, arpi arpiVar2) {
        arpiVar.getClass();
        arpiVar2.getClass();
        this.c = arpiVar;
        this.b = arpiVar2;
        this.a = new qip(arpiVar, arpiVar2);
    }

    public kkc(gcn gcnVar) {
        this.b = gcnVar;
        this.c = new asgm();
        this.a = new gcd(gcnVar);
    }

    public kkc(gsz gszVar) {
        this(gszVar.b, gszVar.c, gszVar.d);
    }

    public kkc(String str) {
        this((dqy) null, str);
    }

    public kkc(xcs xcsVar, mjg mjgVar, mgu mguVar) {
        xcsVar.getClass();
        mjgVar.getClass();
        mguVar.getClass();
        this.c = xcsVar;
        this.a = mjgVar;
        this.b = mguVar;
    }

    public kkc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new HashMap();
        this.c = new HashMap();
        this.b = new HashMap();
    }

    public kkc(esr... esrVarArr) {
        fdb fdbVar = new fdb();
        esw eswVar = new esw();
        esr[] esrVarArr2 = new esr[2];
        this.a = esrVarArr2;
        System.arraycopy(esrVarArr, 0, esrVarArr2, 0, 0);
        this.b = fdbVar;
        this.c = eswVar;
        esr[] esrVarArr3 = esrVarArr2;
        esrVarArr3[0] = fdbVar;
        esrVarArr3[1] = eswVar;
    }

    public kkc() {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.f(true);
        a.c(true);
        a.d(true);
        a.b = new qqe(7);
        a.a = "group_members.group_token";
        a.c = new wsy();
        qtt qttVar = new qtt(a.a());
        this.c = qttVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.j(true);
        a2.f(true);
        a2.c(true);
        a2.d(true);
        a2.b = new qqe(8);
        a2.a = "group_members.destination_token";
        a2.c = new wsy();
        qtt qttVar2 = new qtt(a2.a());
        this.b = qttVar2;
        this.a = new qtt[]{qttVar, qttVar2};
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [asai, java.lang.Object] */
    public kkc(Optional optional, arwe arweVar, gpx gpxVar, khb khbVar, lfl lflVar, jxv jxvVar) {
        arweVar.getClass();
        khbVar.getClass();
        lflVar.getClass();
        jxvVar.getClass();
        this.b = optional;
        this.a = arweVar;
        asai a = asbm.a(asar.a(new jxj(jxvVar.a, 16)), new icw(gpxVar, this, khbVar, lflVar, (arpe) null, 3));
        int i = ascp.a;
        this.c = arrn.T(a, arweVar, asco.a(0L, 3), null);
    }

    public kkc(UUID uuid, gys gysVar, Set set) {
        uuid.getClass();
        gysVar.getClass();
        this.a = uuid;
        this.b = gysVar;
        this.c = set;
    }

    public kkc(armf armfVar, armf armfVar2, armf armfVar3, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List, java.lang.Object] */
    public kkc(List list) {
        this.c = list;
        this.b = new ArrayList(list.size());
        this.a = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.b.add(((hfa) ((anna) list.get(i)).c).a());
            this.a.add(((hew) ((anna) list.get(i)).d).a());
        }
    }

    public kkc(byte[] bArr) {
        this.c = new ArrayList();
        this.a = new ghe(this, 0);
        this.b = new ghf(this);
    }

    public kkc(char[] cArr) {
        this(new Random());
    }

    public kkc(dwd dwdVar) {
        this.b = new ArrayList();
        this.a = new dwl();
        this.c = dwdVar;
    }

    public kkc(Random random) {
        this(new int[0], random);
    }

    public kkc(Runnable runnable) {
        this.b = new CopyOnWriteArrayList();
        this.a = new HashMap();
        this.c = runnable;
    }

    public kkc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new asgm();
        this.b = new efu((char[]) null, (byte[]) null, (byte[]) null);
        this.c = new asaa(new fzs((arpe) null, 1, (byte[]) null));
    }

    public kkc(arwe arweVar, kjf kjfVar) {
        arweVar.getClass();
        kjfVar.getClass();
        this.a = arweVar;
        this.b = kjfVar;
        jdn jdnVar = new jdn(kjfVar.b(), kjfVar.a(), new igb(this, (arpe) null, 10), 17, null);
        int i = ascp.a;
        this.c = arrn.T(jdnVar, arweVar, asco.a(0L, 3), null);
    }

    public kkc(int[] iArr, Random random) {
        this.c = iArr;
        this.a = random;
        this.b = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            ((int[]) this.b)[iArr[i]] = i;
        }
    }

    public kkc(Object obj, heo heoVar, Object obj2) {
        heoVar.getClass();
        gsh gshVar = new gsh(obj2, 3);
        this.c = obj;
        this.b = heoVar;
        this.a = gshVar;
    }

    public kkc(List list, byte[] bArr) {
        this.b = list;
        this.c = new fmq[list.size()];
        this.a = new fqf(new fuj(this, 0));
    }

    public kkc(hne hneVar, hns hnsVar) {
        List emptyList = Collections.emptyList();
        hwr.i(hneVar);
        this.c = hneVar;
        hwr.i(emptyList);
        this.a = emptyList;
        hwr.i(hnsVar);
        this.b = hnsVar;
    }

    public kkc(esp espVar) {
        this.b = espVar;
        ByteBuffer order = ByteBuffer.allocateDirect(espVar.e * 1024).order(ByteOrder.nativeOrder());
        this.c = order;
        order.flip();
        this.a = new AtomicLong();
    }

    public kkc(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
    }

    public kkc(uac uacVar, adji adjiVar, msk mskVar) {
        adjiVar.getClass();
        mskVar.getClass();
        this.c = uacVar;
        this.a = adjiVar;
        this.b = mskVar;
        if (((qvo) uacVar.b).b != qvn.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public kkc(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [asai, java.lang.Object] */
    public kkc(arwe arweVar, gpx gpxVar) {
        gpxVar.getClass();
        this.a = arweVar;
        this.b = gpxVar;
        this.c = new gqg((asai) gpxVar.d, arweVar);
    }

    public kkc(byte[] bArr, byte[] bArr2) {
        this.c = new CopyOnWriteArrayList();
        ascd a = ascy.a(null);
        this.b = a;
        this.a = new ascf(a);
    }

    public kkc(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr) {
        this.c = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
    }

    public kkc(Context context, anen anenVar) {
        this.b = alwo.o("Bugle");
        this.c = context;
        this.a = anenVar;
    }

    public kkc(armf armfVar, arwe arweVar, xnv xnvVar) {
        armfVar.getClass();
        arweVar.getClass();
        xnvVar.getClass();
        this.b = armfVar;
        this.a = arweVar;
        this.c = xnvVar;
    }

    private static final gaz N(gaz gazVar, gaz gazVar2, gaz gazVar3, gaz gazVar4) {
        return gazVar3;
    }
}
