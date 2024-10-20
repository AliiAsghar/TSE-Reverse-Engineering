package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.manager.LifecycleLifecycle;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ico {
    public final Object a;
    public final Object b;

    public ico(gka gkaVar) {
        this.b = gkaVar;
        this.a = new iba(gkaVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[Catch: IOException -> 0x006c, TryCatch #0 {IOException -> 0x006c, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x003a, B:14:0x003d, B:16:0x0042, B:27:0x0047, B:29:0x004a, B:32:0x0059), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ico J(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6c
            asqx[] r0 = new defpackage.asqx[r0]     // Catch: java.io.IOException -> L6c
            asqu r1 = new asqu     // Catch: java.io.IOException -> L6c
            r1.<init>()     // Catch: java.io.IOException -> L6c
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6c
            if (r3 >= r4) goto L59
            r4 = r12[r3]     // Catch: java.io.IOException -> L6c
            java.lang.String[] r5 = defpackage.hhr.a     // Catch: java.io.IOException -> L6c
            r6 = 34
            r1.M(r6)     // Catch: java.io.IOException -> L6c
            int r7 = r4.length()     // Catch: java.io.IOException -> L6c
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6c
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6c
            if (r10 == 0) goto L42
            goto L38
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.R(r4, r9, r8)     // Catch: java.io.IOException -> L6c
        L3d:
            r1.Z(r10)     // Catch: java.io.IOException -> L6c
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.R(r4, r9, r7)     // Catch: java.io.IOException -> L6c
        L4a:
            r1.M(r6)     // Catch: java.io.IOException -> L6c
            r1.d()     // Catch: java.io.IOException -> L6c
            asqx r4 = r1.s()     // Catch: java.io.IOException -> L6c
            r0[r3] = r4     // Catch: java.io.IOException -> L6c
            int r3 = r3 + 1
            goto La
        L59:
            ico r1 = new ico     // Catch: java.io.IOException -> L6c
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6c
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6c
            aotl r2 = defpackage.asrf.c     // Catch: java.io.IOException -> L6c
            asrf r0 = r2.P(r0)     // Catch: java.io.IOException -> L6c
            r2 = 0
            r1.<init>(r12, r0, r2)     // Catch: java.io.IOException -> L6c
            return r1
        L6c:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ico.J(java.lang.String[]):ico");
    }

    public static final ico L(String... strArr) {
        return new ico((List) null, aqil.p(strArr), 11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    private final synchronized List M(String str) {
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        List list = (List) this.b.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.b.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    private final aevy N(Uri uri, String str, msh mshVar) {
        if (uri != null) {
            return new aevv(uri, null, null, aevs.a, null, 22);
        }
        gqx gqxVar = new gqx(this, yyb.bz(xvc.i(str, mshVar)), 11, null);
        if (str.length() == 0) {
            return new aevx(new gck(gqxVar, 5), aevs.a);
        }
        return new aevu(new gck(gqxVar, 6), str.charAt(0), aevs.a);
    }

    private final aewe O(Uri uri, String str, msh mshVar, boolean z) {
        aevy N = N(uri, str, mshVar);
        int i = 1;
        if (true == z) {
            i = 3;
        }
        return new aewg(N, "", i, null, null, 56);
    }

    public static /* synthetic */ aewe h(ico icoVar, mkl mklVar) {
        mklVar.getClass();
        return icoVar.O(mklVar.a(), mklVar.e(), mklVar.b(), false);
    }

    public static final hpt n(ImageDecoder.Source source, int i, int i2, hnj hnjVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new hsx(i, i2, hnjVar));
        if (cok$$ExternalSyntheticApiModelOutline0.m$2(decodeDrawable)) {
            return new huw(cok$$ExternalSyntheticApiModelOutline0.m137m((Object) decodeDrawable), 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(String.valueOf(decodeDrawable))));
    }

    public static final boolean o(ImageHeaderParser.ImageType imageType) {
        if (imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final Object A(MotionEvent motionEvent) {
        Object obj = this.a.get(motionEvent.getToolType(0));
        if (obj != null) {
            return obj;
        }
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    public final void B(int i, Object obj) {
        boolean z;
        boolean z2 = true;
        if (i >= 0 && i <= 4) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (this.a.get(i) != null) {
            z2 = false;
        }
        dye.f(z2, null);
        this.a.set(i, obj);
    }

    public final boolean C(MotionEvent motionEvent) {
        ggx E = E(motionEvent);
        if (E != null && E.b != -1) {
            return true;
        }
        return false;
    }

    public final boolean D(MotionEvent motionEvent) {
        ggx E;
        if (C(motionEvent) && (E = E(motionEvent)) != null && E.a != null) {
            return true;
        }
        return false;
    }

    public final ggx E(MotionEvent motionEvent) {
        View m = ((RecyclerView) this.b).m(motionEvent.getX(), motionEvent.getY());
        if (m != null) {
            oo j = ((RecyclerView) this.b).j(m);
            if (j instanceof kxl) {
                kzx I = ((kxm) this.a).I(j.b());
                if (I != null) {
                    return new ggx(j.ge(), I.a.l.a());
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    public final void F(Object obj) {
        ?? r0 = this.b;
        r0.f(new armo(Integer.valueOf(((Number) ((armo) r0.c()).a).intValue() + 1), obj));
    }

    public final /* synthetic */ void G(hgi hgiVar) {
        H(hgiVar, null);
    }

    public final void H(hgi hgiVar, mka mkaVar) {
        ((gpx) this.b).b(new faq((Object) this, (Object) hgiVar, (Object) mkaVar, 13, (byte[]) null));
    }

    public final void I(hgi hgiVar, int i) {
        ((gpx) this.b).b(new gzz((gud) this.a, hgiVar, false, i));
    }

    public final ico K(float[] fArr) {
        int S;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            int binarySearch = Arrays.binarySearch((float[]) this.a, f);
            if (binarySearch >= 0) {
                S = ((int[]) this.b)[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                if (i2 == 0) {
                    S = ((int[]) this.b)[0];
                } else {
                    int[] iArr2 = (int[]) this.b;
                    int length = iArr2.length - 1;
                    if (i2 == length) {
                        S = iArr2[length];
                    } else {
                        int i3 = i2 - 1;
                        float[] fArr2 = (float[]) this.a;
                        float f2 = fArr2[i3];
                        S = gvf.S((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                    }
                }
            }
            iArr[i] = S;
        }
        return new ico(fArr, iArr, (short[]) null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    public final synchronized List a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<iji> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (iji ijiVar : list) {
                    if (ijiVar.d(cls, cls2)) {
                        arrayList.add(ijiVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<iji> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (iji ijiVar : list) {
                    if (ijiVar.d(cls, cls2) && !arrayList.contains(ijiVar.c)) {
                        arrayList.add(ijiVar.c);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void c(String str, hnl hnlVar, Class cls, Class cls2) {
        M(str).add(new iji(cls, cls2, hnlVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    public final synchronized void d(List list) {
        ArrayList arrayList = new ArrayList((Collection) this.a);
        this.a.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                this.a.add(str);
            }
        }
    }

    public final aevy e(ChipData chipData) {
        chipData.getClass();
        if (chipData.c == null) {
            Uri c = xvc.c((Context) this.a);
            c.getClass();
            return new aevv(c, null, null, null, null, 30);
        }
        return N(chipData.d, chipData.b, chipData.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [msh, java.lang.Object] */
    public final aewe f(mkh mkhVar, boolean z) {
        alog alogVar = mkhVar.e;
        alogVar.getClass();
        return O(mkhVar.f, mkhVar.d, ((agoe) aqjn.X(alogVar)).b, z);
    }

    public final void g(iha ihaVar) {
        lgb.p((lre) this.a, new geg(this, ihaVar, 5, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [hwg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map, java.lang.Object] */
    public final hls j(Context context, hkz hkzVar, enh enhVar, boolean z) {
        hyv.i();
        hyv.i();
        hls hlsVar = (hls) this.a.get(enhVar);
        if (hlsVar == null) {
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(enhVar);
            hls a = this.b.a(hkzVar, lifecycleLifecycle, new hwd(), context);
            this.a.put(enhVar, a);
            lifecycleLifecycle.a(new hwc(this, enhVar));
            if (!z) {
                return a;
            }
            a.l();
            return a;
        }
        return hlsVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hqa, java.lang.Object] */
    public final void k(Bitmap bitmap) {
        this.b.d(bitmap);
    }

    public final void l(byte[] bArr) {
        Object obj = this.a;
        if (obj == null) {
            return;
        }
        ((hqh) obj).c(bArr);
    }

    public final byte[] m(int i) {
        Object obj = this.a;
        if (obj == null) {
            return new byte[i];
        }
        return (byte[]) ((hqh) obj).a(i, byte[].class);
    }

    public final synchronized List p(Class cls) {
        return ((hsj) this.b).c(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    public final synchronized List q(Class cls) {
        ?? r0;
        hgj hgjVar = (hgj) ((hgj) this.a).a.get(cls);
        if (hgjVar == null) {
            r0 = 0;
        } else {
            r0 = hgjVar.a;
        }
        if (r0 == 0) {
            List unmodifiableList = DesugarCollections.unmodifiableList(((hsj) this.b).b(cls));
            if (((hgj) ((hgj) this.a).a.put(cls, new hgj(unmodifiableList, (byte[]) null))) == null) {
                return unmodifiableList;
            }
            throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
        }
        return r0;
    }

    public final synchronized void r(Class cls, Class cls2, hsf hsfVar) {
        ((hsj) this.b).d(cls, cls2, hsfVar);
        ((hgj) this.a).h();
    }

    public final synchronized void s(Class cls, Class cls2, hsf hsfVar) {
        ((hsj) this.b).e(cls, cls2, hsfVar);
        ((hgj) this.a).h();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ecf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ecf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ecf, java.lang.Object] */
    public final String t(hne hneVar) {
        String str;
        synchronized (this.b) {
            str = (String) ((hyr) this.b).h(hneVar);
        }
        if (str == null) {
            hqy hqyVar = (hqy) this.a.a();
            hwr.i(hqyVar);
            try {
                hneVar.a(hqyVar.a);
                byte[] digest = hqyVar.a.digest();
                synchronized (hyv.b) {
                    char[] cArr = hyv.b;
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i];
                        int i2 = i + i;
                        char[] cArr2 = hyv.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.a.b(hqyVar);
            }
        }
        synchronized (this.b) {
            ((hyr) this.b).i(hneVar, str);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Queue] */
    public final void u(String str) {
        aspp asppVar;
        synchronized (this) {
            asppVar = (aspp) this.a.get(str);
            hwr.i(asppVar);
            int i = asppVar.a;
            if (i > 0) {
                int i2 = i - 1;
                asppVar.a = i2;
                if (i2 == 0) {
                    aspp asppVar2 = (aspp) this.a.remove(str);
                    if (asppVar2.equals(asppVar)) {
                        Object obj = this.b;
                        synchronized (((hgi) obj).a) {
                            if (((hgi) obj).a.size() < 10) {
                                ((hgi) obj).a.offer(asppVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + asppVar.toString() + ", but actually removed: " + String.valueOf(asppVar2) + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + i);
            }
        }
        asppVar.b.unlock();
    }

    public final void v() {
        ((gka) this.b).a();
    }

    public final void w(Bundle bundle) {
        gka gkaVar = (gka) this.b;
        if (!gkaVar.c) {
            gkaVar.a();
        }
        if (!gkaVar.a.N().a().a(eng.STARTED)) {
            if (!gkaVar.e) {
                Bundle bundle2 = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    if (bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                        if (bundle2 == null) {
                            throw new IllegalStateException("Saved state key 'androidx.lifecycle.BundlableSavedStateRegistry.key' was not found");
                        }
                    } else {
                        throw new IllegalStateException("Saved state key 'androidx.lifecycle.BundlableSavedStateRegistry.key' was not found");
                    }
                }
                gkaVar.d = bundle2;
                gkaVar.e = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        eng a = gkaVar.a.N().a();
        Objects.toString(a);
        throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(a)));
    }

    public final void x(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Object obj = this.b;
        gka gkaVar = (gka) obj;
        Bundle bundle3 = gkaVar.d;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        synchronized (gkaVar.g) {
            for (Map.Entry entry : ((gka) obj).b.entrySet()) {
                bundle2.putBundle((String) entry.getKey(), ((gjy) entry.getValue()).a());
            }
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void y() {
        synchronized (this) {
            ((arvc) this.a).a();
            if (((arvc) this.a).b < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean z() {
        synchronized (this) {
            if (((arvb) this.b).b()) {
                return false;
            }
            ((arvc) this.a).b();
            return true;
        }
    }

    public ico(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public ico(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public ico(Object obj, Object obj2, char[] cArr) {
        this.a = obj;
        this.b = obj2;
    }

    public ico(Object obj, Object obj2, short[] sArr) {
        this.a = obj;
        this.b = obj2;
    }

    public ico(Context context, armf armfVar) {
        context.getClass();
        armfVar.getClass();
        this.a = context;
        this.b = armfVar;
    }

    public ico(hwg hwgVar) {
        this.a = new HashMap();
        this.b = hwgVar;
    }

    public /* synthetic */ ico(List list, List list2, int i) {
        list = (i & 1) != 0 ? arnv.a : list;
        arnv arnvVar = (i & 2) != 0 ? arnv.a : null;
        list2 = (i & 4) != 0 ? arnv.a : list2;
        list.getClass();
        arnvVar.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public /* synthetic */ ico(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        ascd a = ascy.a(new armo(Integer.MIN_VALUE, null));
        this.b = a;
        this.a = new fzr(a, 2);
    }

    public ico(arpi arpiVar, iew iewVar) {
        arpiVar.getClass();
        this.b = arpiVar;
        this.a = iewVar;
    }

    public ico(gud gudVar, gpx gpxVar) {
        gudVar.getClass();
        gpxVar.getClass();
        this.a = gudVar;
        this.b = gpxVar;
    }

    public ico(Object obj) {
        this.a = Arrays.asList(null, null, null, null, null);
        d.s(true);
        this.b = obj;
    }

    public ico(byte[] bArr) {
        this.b = new AtomicReference();
        this.a = new tm();
    }

    public ico(String str, String str2, char[] cArr) {
        str2.getClass();
        this.b = str;
        this.a = str2;
    }

    public ico() {
        this.a = new ArrayList();
        this.b = new HashMap();
    }

    public ico(String str, String str2, byte[] bArr) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public ico(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public ico(apwt apwtVar, apwt apwtVar2) {
        apwtVar.getClass();
        apwtVar2.getClass();
        this.a = apwtVar;
        this.b = apwtVar2;
    }

    public ico(gid gidVar) {
        this.b = gidVar;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.getClass();
        this.a = newSetFromMap;
    }

    public ico(hcq hcqVar) {
        this.b = new ArrayList();
        this.a = hcqVar;
    }

    public ico(hlc hlcVar) {
        hko hkoVar = new hko();
        this.b = hlcVar;
        this.a = hkoVar;
    }

    public ico(lre lreVar, Map map) {
        lreVar.getClass();
        this.a = lreVar;
        this.b = map;
    }

    public ico(byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
        this.b = new hgi((byte[]) null, (byte[]) null);
    }

    public ico(byte[] bArr, char[] cArr) {
        this.a = new arvc(0, arvf.a);
        this.b = new arvb(false, arvf.a);
    }

    public ico(char[] cArr) {
        this.b = new hyr(1000L);
        this.a = hzc.a(10, new hqx(0));
    }

    public ico(ecf ecfVar) {
        hsj hsjVar = new hsj(ecfVar);
        this.a = new hgj((char[]) null);
        this.b = hsjVar;
    }
}
