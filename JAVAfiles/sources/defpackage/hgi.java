package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.net.ConnectivityManager;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgi {
    public final Object a;

    public hgi(Context context) {
        this.a = new hqs(context);
    }

    public static String c(String str, hgh hghVar, boolean z) {
        String replaceAll = str.replaceAll("\\W+", "");
        String str2 = hghVar.c;
        if (z) {
            str2 = ".temp".concat(String.valueOf(str2));
        }
        return "lottie_cache_" + replaceAll + str2;
    }

    public static final void v(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af A[Catch: all -> 0x00bf, TryCatch #1 {all -> 0x00bf, blocks: (B:5:0x0011, B:7:0x0015, B:29:0x00af, B:30:0x00b4, B:37:0x009c, B:9:0x0023, B:11:0x002c, B:13:0x0032, B:15:0x003a, B:17:0x0040, B:19:0x0048, B:21:0x0068, B:23:0x0078, B:26:0x0080, B:27:0x0095, B:33:0x005f, B:34:0x0064), top: B:4:0x0011, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.hgi w(android.content.Context r10) {
        /*
            java.lang.String r0 = "EmbeddingBackend"
            r10.getClass()
            arqr r1 = defpackage.gpn.a
            gqc r2 = defpackage.gqc.a
            r3 = 0
            if (r2 != 0) goto Lc4
            java.util.concurrent.locks.ReentrantLock r2 = defpackage.gqc.b
            r2.lock()
            gqc r4 = defpackage.gqc.a     // Catch: java.lang.Throwable -> Lbf
            if (r4 != 0) goto Lbb
            android.content.Context r10 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> Lbf
            r10.getClass()     // Catch: java.lang.Throwable -> Lbf
            xzg r4 = new xzg     // Catch: java.lang.Throwable -> Lbf
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lbf
            int r4 = r4.a     // Catch: java.lang.Throwable -> Lbf
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L9b
            r5.getClass()     // Catch: java.lang.Throwable -> L9b
            if (r4 <= 0) goto L99
            boolean r5 = defpackage.gvf.aR()     // Catch: java.lang.Throwable -> L9b
            if (r5 == 0) goto L99
            java.lang.Class<gpo> r5 = defpackage.gpo.class
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L9b
            if (r5 == 0) goto L99
            boolean r6 = defpackage.gvf.aR()     // Catch: java.lang.Throwable -> L9b
            if (r6 == 0) goto L64
            java.lang.Class<gpx> r6 = defpackage.gpx.class
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Throwable -> L9b
            if (r6 == 0) goto L5f
            gpx r7 = new gpx     // Catch: java.lang.Throwable -> L9b
            goq r8 = new goq     // Catch: java.lang.Throwable -> L9b
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L9b
            androidx.window.extensions.WindowExtensions r9 = defpackage.ry$$ExternalSyntheticApiModelOutline0.m()     // Catch: java.lang.Throwable -> L9b
            r9.getClass()     // Catch: java.lang.Throwable -> L9b
            r7.<init>(r6, r8, r9)     // Catch: java.lang.Throwable -> L9b
            androidx.window.extensions.embedding.ActivityEmbeddingComponent r6 = r7.c()     // Catch: java.lang.Throwable -> L9b
            if (r6 != 0) goto L68
        L5f:
            androidx.window.extensions.embedding.ActivityEmbeddingComponent r6 = defpackage.gvf.aQ()     // Catch: java.lang.Throwable -> L9b
            goto L68
        L64:
            androidx.window.extensions.embedding.ActivityEmbeddingComponent r6 = defpackage.gvf.aQ()     // Catch: java.lang.Throwable -> L9b
        L68:
            gph r7 = new gph     // Catch: java.lang.Throwable -> L9b
            r7.<init>()     // Catch: java.lang.Throwable -> L9b
            gpx r8 = new gpx     // Catch: java.lang.Throwable -> L9b
            goq r9 = new goq     // Catch: java.lang.Throwable -> L9b
            r9.<init>(r5)     // Catch: java.lang.Throwable -> L9b
            r5 = 8
            if (r4 < r5) goto L7d
            gqg r5 = new gqg     // Catch: java.lang.Throwable -> L9b
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L9b
        L7d:
            r5 = 6
            if (r4 < r5) goto L95
            r6.getClass()     // Catch: java.lang.Throwable -> L9b
            java.util.concurrent.locks.ReentrantLock r4 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L9b
            r4.<init>()     // Catch: java.lang.Throwable -> L9b
            android.util.ArrayMap r4 = new android.util.ArrayMap     // Catch: java.lang.Throwable -> L9b
            r4.<init>()     // Catch: java.lang.Throwable -> L9b
            xzg r4 = new xzg     // Catch: java.lang.Throwable -> L9b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L9b
            r4.a(r5)     // Catch: java.lang.Throwable -> L9b
        L95:
            r8.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> L9b
            goto Lad
        L99:
            r8 = r3
            goto Lad
        L9b:
            r4 = move-exception
            java.lang.String r5 = "Failed to load embedding extension: "
            r4.toString()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = r5.concat(r4)     // Catch: java.lang.Throwable -> Lbf
            android.util.Log.d(r0, r4)     // Catch: java.lang.Throwable -> Lbf
            goto L99
        Lad:
            if (r8 != 0) goto Lb4
            java.lang.String r4 = "No supported embedding extension found"
            android.util.Log.d(r0, r4)     // Catch: java.lang.Throwable -> Lbf
        Lb4:
            gqc r0 = new gqc     // Catch: java.lang.Throwable -> Lbf
            r0.<init>(r10, r8)     // Catch: java.lang.Throwable -> Lbf
            defpackage.gqc.a = r0     // Catch: java.lang.Throwable -> Lbf
        Lbb:
            r2.unlock()
            goto Lc4
        Lbf:
            r10 = move-exception
            r2.unlock()
            throw r10
        Lc4:
            gqc r10 = defpackage.gqc.a
            r10.getClass()
            java.lang.Object r10 = r1.a(r10)
            hgi r0 = new hgi
            r0.<init>(r10, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgi.w(android.content.Context):hgi");
    }

    public final boolean A() {
        return ((ParticipantsTable.BindData) this.a).T();
    }

    public final boolean B() {
        if (A() && yyb.G(((ParticipantsTable.BindData) this.a).m()).c()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C(defpackage.alog r6, defpackage.arqr r7, defpackage.arpe r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.neo
            if (r0 == 0) goto L13
            r0 = r8
            neo r0 = (defpackage.neo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            neo r0 = new neo
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            jld r7 = r0.c
            defpackage.aqil.P(r8)
            goto L9b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.aqil.P(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.aqjn.J(r6, r2)
            r8.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L44:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r6.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r2 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r2
            msh r2 = r2.f()
            j$.util.Optional r2 = r2.e()
            r2.getClass()
            java.lang.Object r2 = defpackage.arsd.k(r2)
            qei r2 = (defpackage.qei) r2
            r8.add(r2)
            goto L44
        L65:
            boolean r6 = r8.isEmpty()
            if (r6 == 0) goto L6c
            goto L7f
        L6c:
            java.util.Iterator r6 = r8.iterator()
        L70:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r6.next()
            qei r2 = (defpackage.qei) r2
            if (r2 != 0) goto L70
            goto Ld5
        L7f:
            java.lang.Object r6 = r5.a
            java.lang.Object r6 = r6.b()
            puu r6 = (defpackage.puu) r6
            akul r6 = r6.a(r8)
            r6.getClass()
            r8 = r7
            jld r8 = (defpackage.jld) r8
            r0.c = r8
            r0.b = r4
            java.lang.Object r8 = defpackage.arro.F(r6, r0)
            if (r8 == r1) goto Lda
        L9b:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Collection r6 = r8.values()
            boolean r8 = r6 instanceof java.util.Collection
            if (r8 == 0) goto Lad
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto Lad
        Lab:
            r3 = r4
            goto Ld5
        Lad:
            java.util.Iterator r6 = r6.iterator()
        Lb1:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lab
            java.lang.Object r8 = r6.next()
            pto r8 = (defpackage.pto) r8
            ptz r8 = r8.a()
            qry r8 = defpackage.qrz.a(r8)
            nfb r8 = defpackage.lga.aa(r8)
            java.lang.Object r8 = r7.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto Lb1
        Ld5:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        Lda:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgi.C(alog, arqr, arpe):java.lang.Object");
    }

    public final mzv D(String str, agoz agozVar, mzu mzuVar) {
        return new mzv((wfh) this.a, str, agozVar, mzuVar);
    }

    public final CoreBugleMessageId E() {
        boolean z;
        long incrementAndGet = ((AtomicInteger) this.a).incrementAndGet();
        if (incrementAndGet < 0) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        return new CoreBugleMessageId(new MessageIdType(incrementAndGet), -1L);
    }

    public final mvw F() {
        return new mvw(((lzz) this.a).e());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final /* bridge */ /* synthetic */ lgc G() {
        ((arwe) this.a.b()).getClass();
        return new lgc();
    }

    public final File a() {
        File file = new File(((Context) ((qdq) this.a).a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File b(String str, InputStream inputStream, hgh hghVar) {
        File file = new File(a(), c(str, hghVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void d(hcq hcqVar) {
        this.a.add(hcqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final void e(Path path) {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                hcq hcqVar = (hcq) this.a.get(size);
                ThreadLocal threadLocal = hid.a;
                if (hcqVar != null && !hcqVar.a) {
                    hid.e(path, ((hda) hcqVar.b).k() / 100.0f, ((hda) hcqVar.c).k() / 100.0f, ((hda) hcqVar.d).k() / 360.0f);
                }
            } else {
                return;
            }
        }
    }

    public final Object f(Object obj, int i, int i2) {
        Object obj2 = this.a;
        hsd a = hsd.a(obj, i, i2);
        Object h = ((hyr) obj2).h(a);
        a.b();
        return h;
    }

    public final void g(Object obj, int i, int i2, Object obj2) {
        ((hyr) this.a).i(hsd.a(obj, i, i2), obj2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Iterable] */
    public final asai h(gys gysVar) {
        gysVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((gwt) obj).b(gysVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gwt) it.next()).a(gysVar.l));
        }
        return asar.a(new fzr((asai[]) aqjn.ax(arrayList2).toArray(new asai[0]), 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Iterable] */
    public final boolean i(gys gysVar) {
        gysVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((gwt) obj).c(gysVar)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            gsy.a().c(gwp.a, "Work " + gysVar.c + " constrained by " + aqjn.aK(arrayList, null, null, null, gvj.c, 31));
        }
        return arrayList.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final gsi j() {
        gsi gsiVar = new gsi((Map) this.a);
        gvf.av(gsiVar);
        return gsiVar;
    }

    public final void k(gsi gsiVar) {
        gsiVar.getClass();
        l(gsiVar.b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    public final void l(Map map) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            ?? r2 = this.a;
            if (value == null) {
                value = null;
            } else {
                int i = arsc.a;
                arrh arrhVar = new arrh(value.getClass());
                if (!d.F(arrhVar, new arrh(Boolean.TYPE)) && !d.F(arrhVar, new arrh(Byte.TYPE)) && !d.F(arrhVar, new arrh(Integer.TYPE)) && !d.F(arrhVar, new arrh(Long.TYPE)) && !d.F(arrhVar, new arrh(Float.TYPE)) && !d.F(arrhVar, new arrh(Double.TYPE)) && !d.F(arrhVar, new arrh(String.class)) && !d.F(arrhVar, new arrh(Boolean[].class)) && !d.F(arrhVar, new arrh(Byte[].class)) && !d.F(arrhVar, new arrh(Integer[].class)) && !d.F(arrhVar, new arrh(Long[].class)) && !d.F(arrhVar, new arrh(Float[].class)) && !d.F(arrhVar, new arrh(Double[].class)) && !d.F(arrhVar, new arrh(String[].class))) {
                    int i2 = 0;
                    if (d.F(arrhVar, new arrh(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        String str2 = gsj.a;
                        objArr = new Boolean[length];
                        while (i2 < length) {
                            objArr[i2] = Boolean.valueOf(zArr[i2]);
                            i2++;
                        }
                    } else if (d.F(arrhVar, new arrh(byte[].class))) {
                        value = gsj.a((byte[]) value);
                    } else if (d.F(arrhVar, new arrh(int[].class))) {
                        int[] iArr = (int[]) value;
                        int length2 = iArr.length;
                        String str3 = gsj.a;
                        objArr = new Integer[length2];
                        while (i2 < length2) {
                            objArr[i2] = Integer.valueOf(iArr[i2]);
                            i2++;
                        }
                    } else if (d.F(arrhVar, new arrh(long[].class))) {
                        long[] jArr = (long[]) value;
                        int length3 = jArr.length;
                        String str4 = gsj.a;
                        objArr = new Long[length3];
                        while (i2 < length3) {
                            objArr[i2] = Long.valueOf(jArr[i2]);
                            i2++;
                        }
                    } else if (d.F(arrhVar, new arrh(float[].class))) {
                        float[] fArr = (float[]) value;
                        int length4 = fArr.length;
                        String str5 = gsj.a;
                        objArr = new Float[length4];
                        while (i2 < length4) {
                            objArr[i2] = Float.valueOf(fArr[i2]);
                            i2++;
                        }
                    } else if (d.F(arrhVar, new arrh(double[].class))) {
                        double[] dArr = (double[]) value;
                        int length5 = dArr.length;
                        String str6 = gsj.a;
                        objArr = new Double[length5];
                        while (i2 < length5) {
                            objArr[i2] = Double.valueOf(dArr[i2]);
                            i2++;
                        }
                    } else {
                        throw new IllegalArgumentException(a.ci(arrhVar, str, "Key ", " has invalid type "));
                    }
                    value = objArr;
                }
            }
            r2.put(str, value);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void m(String str, byte[] bArr) {
        bArr.getClass();
        this.a.put(str, gsj.a(bArr));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void n(String str, Object obj) {
        this.a.put(str, obj);
    }

    public final void o(String str, boolean z) {
        n(str, Boolean.valueOf(z));
    }

    public final void p(String str, int i) {
        n(str, Integer.valueOf(i));
    }

    public final void q(String str, long j) {
        n(str, Long.valueOf(j));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gpo, java.lang.Object] */
    public final boolean r(Activity activity) {
        activity.getClass();
        return this.a.a(activity);
    }

    public final Class s() {
        Class<?> loadClass = ((ClassLoader) this.a).loadClass("androidx.window.extensions.WindowExtensions");
        loadClass.getClass();
        return loadClass;
    }

    public final boolean t() {
        if (gvf.ay(new rd(this, 20)) && gvf.ax("WindowExtensionsProvider#getWindowExtensions is not valid", new gov(this, 1))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final List u() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        throw null;
    }

    public final /* synthetic */ ngd x() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (ngd) s;
    }

    public final boolean y() {
        return ((ParticipantsTable.BindData) this.a).A().a();
    }

    public final boolean z() {
        if (A() && yyb.G(((ParticipantsTable.BindData) this.a).m()).d()) {
            return true;
        }
        return false;
    }

    public hgi(Object obj) {
        this.a = obj;
    }

    public hgi(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public hgi(long j) {
        this.a = new hsc(j);
    }

    public hgi(byte[] bArr, char[] cArr) {
        this.a = new CopyOnWriteArrayList();
    }

    public hgi(char[] cArr) {
        this.a = new LinkedHashMap();
    }

    public hgi(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hgi(gyg gygVar) {
        gygVar.getClass();
        this.a = gygVar;
    }

    public hgi(gqg gqgVar) {
        gwl gwlVar;
        gwt[] gwtVarArr = new gwt[8];
        gwtVarArr[0] = new gwr((gxg) gqgVar.a);
        gwtVarArr[1] = new gws((gxb) gqgVar.d);
        gwtVarArr[2] = new gwy((gxg) gqgVar.b);
        gxg gxgVar = (gxg) gqgVar.c;
        gwtVarArr[3] = new gwu(gxgVar);
        gwtVarArr[4] = new gwx(gxgVar);
        gwtVarArr[5] = new gww((gxg) gqgVar.c);
        gwtVarArr[6] = new gwv((gxg) gqgVar.c);
        if (Build.VERSION.SDK_INT >= 28) {
            Object obj = gqgVar.e;
            String str = gwp.a;
            Object systemService = ((Context) obj).getSystemService("connectivity");
            systemService.getClass();
            gwlVar = new gwl((ConnectivityManager) systemService, gwp.b);
        } else {
            gwlVar = null;
        }
        gwtVarArr[7] = gwlVar;
        this.a = aqil.o(gwtVarArr);
    }

    public hgi(lzz lzzVar) {
        lzzVar.getClass();
        this.a = lzzVar;
    }

    public hgi(armf armfVar, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hgi(char[] cArr, byte[] bArr) {
        this.a = new aluj(new alln());
    }

    public hgi(byte[] bArr, short[] sArr) {
        this.a = new AtomicInteger(Integer.MIN_VALUE);
    }

    public hgi(short[] sArr) {
        this.a = new AtomicBoolean(false);
    }

    public hgi(WorkDatabase workDatabase, byte[] bArr) {
        workDatabase.getClass();
        this.a = workDatabase;
    }

    public hgi(armf armfVar, short[] sArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hgi() {
        this.a = new ArrayList();
    }

    public hgi(armf armfVar, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hgi(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hgi(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayDeque();
    }

    public hgi(jat jatVar, Optional optional, ykb ykbVar) {
        this.a = albo.D(new mri(jatVar, optional, ykbVar, 14, null));
    }

    public hgi(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
