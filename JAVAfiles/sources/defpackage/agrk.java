package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.NetworkReleasedException;
import android.net.SocketLocalAddressChangedException;
import android.net.SocketNotBoundException;
import android.net.Uri;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieManager;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agrk {
    private static volatile agrk c;
    public final Object a;
    public final Object b;

    public agrk() {
        this.b = new float[2];
        this.a = r0;
        float[] fArr = {1.0f};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[Catch: IllegalStateException -> 0x008a, IllegalArgumentException | IllegalStateException -> 0x008c, all -> 0x009b, TRY_ENTER, TryCatch #5 {, blocks: (B:3:0x0001, B:9:0x0009, B:11:0x0011, B:13:0x0026, B:14:0x0046, B:15:0x004a, B:17:0x0050, B:19:0x005c, B:29:0x0043, B:39:0x0082, B:40:0x0089, B:41:0x0086, B:46:0x008d, B:47:0x0098), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086 A[Catch: IllegalStateException -> 0x008a, IllegalArgumentException | IllegalStateException -> 0x008c, all -> 0x009b, TryCatch #5 {, blocks: (B:3:0x0001, B:9:0x0009, B:11:0x0011, B:13:0x0026, B:14:0x0046, B:15:0x004a, B:17:0x0050, B:19:0x005c, B:29:0x0043, B:39:0x0082, B:40:0x0089, B:41:0x0086, B:46:0x008d, B:47:0x0098), top: B:2:0x0001 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [ahwo, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void K(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.Object r0 = r7.b     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r0.containsKey(r8)     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L99
            java.lang.Class<ahwi> r0 = defpackage.ahwi.class
            java.io.InputStream r0 = r0.getResourceAsStream(r8)     // Catch: java.lang.IllegalStateException -> L8a java.lang.IllegalArgumentException -> L8c java.lang.Throwable -> L9b
            if (r0 != 0) goto L24
            java.util.logging.Logger r1 = defpackage.ahwi.a     // Catch: java.lang.IllegalStateException -> L8a java.lang.IllegalArgumentException -> L8c java.lang.Throwable -> L9b
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch: java.lang.IllegalStateException -> L8a java.lang.IllegalArgumentException -> L8c java.lang.Throwable -> L9b
            java.lang.String r3 = "File %s not found"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.IllegalStateException -> L8a java.lang.IllegalArgumentException -> L8c java.lang.Throwable -> L9b
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.IllegalStateException -> L8a java.lang.IllegalArgumentException -> L8c java.lang.Throwable -> L9b
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.IllegalStateException -> L8a java.lang.IllegalArgumentException -> L8c java.lang.Throwable -> L9b
            r1.log(r2, r3)     // Catch: java.lang.IllegalStateException -> L8a java.lang.IllegalArgumentException -> L8c java.lang.Throwable -> L9b
        L24:
            if (r0 != 0) goto L2b
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.IllegalStateException -> L8a java.lang.IllegalArgumentException -> L8c java.lang.Throwable -> L9b
            goto L46
        L2b:
            r1 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            ahwd r1 = new ahwd     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L70
            r1.readExternal(r2)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L70
            java.util.List r3 = r1.a     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L70
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L70
            if (r3 != 0) goto L63
            java.util.List r0 = r1.a     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L70
            defpackage.ahwj.a(r2)     // Catch: java.lang.IllegalStateException -> L8a java.lang.IllegalArgumentException -> L8c java.lang.Throwable -> L9b
        L46:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L9b
        L4a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L9b
            ahwc r1 = (defpackage.ahwc) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r7.a     // Catch: java.lang.Throwable -> L9b
            r2.a(r1)     // Catch: java.lang.Throwable -> L9b
            goto L4a
        L5c:
            java.lang.Object r0 = r7.b     // Catch: java.lang.Throwable -> L9b
            r0.put(r8, r8)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r7)
            return
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L70
            java.lang.String r3 = "Empty metadata"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L70
            throw r1     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L70
        L6b:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L80
        L70:
            r1 = move-exception
            goto L78
        L72:
            r2 = move-exception
            goto L80
        L74:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L78:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "Unable to parse metadata file"
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L6b
            throw r3     // Catch: java.lang.Throwable -> L6b
        L80:
            if (r1 == 0) goto L86
            defpackage.ahwj.a(r1)     // Catch: java.lang.IllegalStateException -> L8a java.lang.IllegalArgumentException -> L8c java.lang.Throwable -> L9b
            goto L89
        L86:
            defpackage.ahwj.a(r0)     // Catch: java.lang.IllegalStateException -> L8a java.lang.IllegalArgumentException -> L8c java.lang.Throwable -> L9b
        L89:
            throw r2     // Catch: java.lang.IllegalStateException -> L8a java.lang.IllegalArgumentException -> L8c java.lang.Throwable -> L9b
        L8a:
            r0 = move-exception
            goto L8d
        L8c:
            r0 = move-exception
        L8d:
            java.lang.String r1 = "Failed to read file "
            java.lang.String r8 = r1.concat(r8)     // Catch: java.lang.Throwable -> L9b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9b
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> L9b
            throw r1     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r7)
            return
        L9b:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9b
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agrk.K(java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    private final void L(String str) {
        ?? r0 = this.b;
        if (r0 != 0) {
            albo.N(r0.contains(str), "Can't access key outside migration: %s", str);
        }
    }

    public static agrk a(Context context) {
        if (c == null) {
            synchronized (agrk.class) {
                if (c == null) {
                    c = new agrk(agrq.a(context));
                }
            }
        }
        return c;
    }

    public static final String f(InetSocketAddress inetSocketAddress) {
        return anbi.a(inetSocketAddress.getAddress().getHostAddress(), inetSocketAddress.getPort()).toString();
    }

    public static final int h(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return 1;
        }
        return 3;
    }

    public static /* synthetic */ void m(acit acitVar, hkl hklVar) {
        try {
            acitVar.c(ahmc.y(hklVar));
        } catch (Error | RuntimeException e) {
            aico.b(e);
            throw e;
        }
    }

    public static String t(Cursor cursor) {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            String[] columnNames = cursor.getColumnNames();
            sb.append(Arrays.toString(columnNames));
            sb.append('\n');
            while (cursor.moveToNext()) {
                for (int i = 0; i < columnNames.length; i++) {
                    try {
                        str = cursor.getString(i);
                    } catch (Exception unused) {
                        if (cursor.getType(i) != 4) {
                            str = "Unknown";
                        } else {
                            str = "Blob, length " + cursor.getBlob(i).length;
                        }
                    }
                    sb.append("|");
                    sb.append(str);
                }
                sb.append('\n');
            }
            String sb2 = sb.toString();
            if (cursor != null) {
                cursor.close();
            }
            return sb2;
        } catch (Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void u() {
        if (!Thread.interrupted()) {
        } else {
            throw new InterruptedException();
        }
    }

    public final void A(byte[] bArr) {
        ((ArrayList) this.b).add(bArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean B(String str, boolean z) {
        L(str);
        return this.a.getBoolean(str, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final long C(String str) {
        L(str);
        return this.a.getLong(str, -1L);
    }

    public final long D() {
        return ((agcp) this.b).r((Uri) this.a);
    }

    public final void E(InputStream inputStream, long j) {
        aiuw aiwcVar;
        long r = ((agcp) this.b).r((Uri) this.a);
        if (j <= r) {
            if (j > 0) {
                aiwcVar = new aivw(2);
            } else {
                aiwcVar = new aiwc();
            }
            OutputStream outputStream = (OutputStream) ((agcp) this.b).s((Uri) this.a, aiwcVar);
            try {
                amcp.a(inputStream, outputStream);
                if (outputStream != null) {
                    outputStream.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", Long.valueOf(j), Long.valueOf(r)));
    }

    public final aiki F(aior aiorVar, ailf ailfVar) {
        HashSet hashSet = new HashSet();
        Iterator it = anna.g(",").a((String) acqb.c.a()).iterator();
        while (it.hasNext()) {
            hashSet.add((String) it.next());
        }
        Object obj = this.b;
        return new aikl(aiorVar, (advp) this.a, (acqj) obj, ailfVar, alpt.o(hashSet));
    }

    public final void G(agcp agcpVar) {
        u();
        akrh e = aktp.e("DELETE FROM " + ((String) agcpVar.b) + " WHERE " + ((String) agcpVar.a));
        try {
            Object obj = this.b;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            sQLiteDatabase.delete((String) agcpVar.b, (String) agcpVar.a, (String[]) agcpVar.c);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Cursor H(agrk agrkVar) {
        u();
        if (Log.isLoggable("ASQLDB", 2)) {
            Log.v("ASQLDB", t(((SQLiteDatabase) this.b).rawQueryWithFactory(new aixr(agrkVar), "EXPLAIN QUERY PLAN ".concat((String) agrkVar.a), null, null)));
        }
        akrh e = aktp.e("Query: ".concat((String) agrkVar.a));
        try {
            Object obj = this.b;
            aixr aixrVar = new aixr(agrkVar);
            Object obj2 = agrkVar.a;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aixrVar, (String) obj2, null, null, (CancellationSignal) this.a);
            e.close();
            return rawQueryWithFactory;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void I(agrk agrkVar) {
        u();
        akrh e = aktp.e("execSQL: ".concat((String) agrkVar.a));
        try {
            Object obj = this.b;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            sQLiteDatabase.execSQL((String) agrkVar.a, (Object[]) agrkVar.b);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final agrk J() {
        String sb = ((StringBuilder) this.a).toString();
        ArrayList arrayList = (ArrayList) this.b;
        return new agrk(sb, arrayList.toArray(new Object[arrayList.size()]));
    }

    public final String b(String str) {
        try {
            for (Map.Entry<String, List<String>> entry : ((CookieManager) this.b).get(new URI(str), Collections.emptyMap()).entrySet()) {
                if ("Cookie".equalsIgnoreCase(entry.getKey())) {
                    return TextUtils.join(";", entry.getValue());
                }
            }
            return "";
        } catch (IOException | URISyntaxException e) {
            Log.e("HatsCookieManager", "Failed to get cookies", e);
            return "";
        }
    }

    public final void c(String str, Map map) {
        try {
            ((CookieManager) this.b).put(new URI(str), map);
            for (Map.Entry entry : map.entrySet()) {
                if ("Set-Cookie".equalsIgnoreCase((String) entry.getKey())) {
                    ((agrq) this.a).a.edit().putString("SET_COOKIE_URI", str).putStringSet("SET_COOKIE_VALUE", new HashSet((List) entry.getValue())).apply();
                    return;
                }
            }
        } catch (IOException | URISyntaxException e) {
            Log.e("HatsCookieManager", "Failed to store cookies", e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final String d(int i) {
        try {
            ?? r0 = this.b;
            Integer valueOf = Integer.valueOf(i);
            Object obj = this.a;
            obj.getClass();
            return (String) ConcurrentMap.EL.computeIfAbsent(r0, valueOf, new agoq(obj, 2));
        } catch (Resources.NotFoundException | NullPointerException e) {
            ((alwl) ((alwl) ((alwl) agyj.a.h()).g(e)).h("com/google/android/libraries/inputmethod/preferences/PreferenceKeyCache", "get", 37, "PreferenceKeyCache.java")).r("Failed to get key name from id %d: ", i);
            return "";
        }
    }

    public final void e(Exception exc) {
        int i;
        if (exc.getCause() instanceof NetworkReleasedException) {
            i = 2;
        } else if (exc.getCause() instanceof SocketLocalAddressChangedException) {
            i = 5;
        } else if (exc.getCause() instanceof SocketNotBoundException) {
            i = 3;
        } else if (exc.getCause() instanceof UnsupportedOperationException) {
            i = 4;
        } else {
            i = 1;
        }
        aozy createBuilder = apgp.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apgp apgpVar = (apgp) apagVar;
        apgpVar.c = i - 1;
        apgpVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apgp apgpVar2 = (apgp) createBuilder.b;
        apgpVar2.e = 3;
        apgpVar2.b = 4 | apgpVar2.b;
        g((apgp) createBuilder.s(), 3);
    }

    public final void g(apgp apgpVar, int i) {
        aozy createBuilder = apgv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apgv apgvVar = (apgv) apagVar;
        apgvVar.f = 5;
        apgvVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apgv apgvVar2 = (apgv) apagVar2;
        apgvVar2.g = i - 1;
        apgvVar2.b |= 4;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        Object obj = this.b;
        Object obj2 = this.a;
        apgv apgvVar3 = (apgv) createBuilder.b;
        apgpVar.getClass();
        apgvVar3.d = apgpVar;
        apgvVar3.c = 7;
        ((acoc) obj2).h((Context) obj, (apgv) createBuilder.s());
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Set, java.lang.Object] */
    public final boolean i() {
        if (!aiep.b()) {
            return false;
        }
        String a = aiep.a((Context) this.b);
        if (a == null) {
            return true;
        }
        int size = this.a.size();
        if (size != 0) {
            if (size == 1) {
                String a2 = ((aieq) alzz.aP(this.a)).a();
                albo.N(a2.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", a2);
                return a.equals(String.valueOf(((Context) this.b).getPackageName()).concat(String.valueOf(a2)));
            }
            throw new IllegalArgumentException("More than 1 custom main process specified");
        }
        return a.equals(((Context) this.b).getPackageName());
    }

    public final aidl j(int i, int i2, alek alekVar, ales alesVar) {
        String str;
        int i3 = alesVar.g;
        int av = albo.av(i3);
        if (av == 0) {
            av = 1;
        }
        int i4 = av - 2;
        if (i4 != 11) {
            if (i4 != 12) {
                int av2 = albo.av(i3);
                if (av2 != 0 && av2 != 1) {
                    if (av2 != 2) {
                        if (av2 != 22) {
                            if (av2 != 23) {
                                switch (av2) {
                                    case 13:
                                        str = "FLEETWIDE_OCCURRENCE_COUNTS";
                                        break;
                                    case 14:
                                        str = "UNIQUE_DEVICE_COUNTS";
                                        break;
                                    case 15:
                                        str = "UNIQUE_DEVICE_HISTOGRAMS";
                                        break;
                                    case 16:
                                        str = "HOURLY_VALUE_HISTOGRAMS";
                                        break;
                                    case 17:
                                        str = "FLEETWIDE_HISTOGRAMS";
                                        break;
                                    case 18:
                                        str = "FLEETWIDE_MEANS";
                                        break;
                                    case 19:
                                        str = "UNIQUE_DEVICE_NUMERIC_STATS";
                                        break;
                                    case 20:
                                        str = "HOURLY_VALUE_NUMERIC_STATS";
                                        break;
                                    default:
                                        str = "null";
                                        break;
                                }
                            } else {
                                str = "UNIQUE_DEVICE_STRING_COUNTS";
                            }
                        } else {
                            str = "STRING_COUNTS";
                        }
                    } else {
                        str = "REPORT_TYPE_UNSET";
                    }
                } else {
                    str = "UNRECOGNIZED";
                }
                throw new IllegalArgumentException("Unknown generator for report type: ".concat(str));
            }
            krv krvVar = ((kru) ((qdq) this.b).a).a;
            return new aied(krvVar.hv(), krvVar.hu(), (agxw) krvVar.KH(), (SecureRandom) krvVar.AB.b(), i, i2, alekVar, alesVar);
        }
        krv krvVar2 = ((kru) ((qdq) this.a).a).a;
        return new aiee(krvVar2.hv(), krvVar2.hu(), (agxw) krvVar2.KH(), (SecureRandom) krvVar2.AB.b(), i, i2, alekVar, alesVar);
    }

    public final acir k(ahxd ahxdVar, final Class cls) {
        final acit acitVar;
        String b = ahxdVar.b();
        Map c2 = ahxdVar.c();
        adae f = ahxdVar.f();
        if (f != null) {
            acitVar = new acit(f);
        } else {
            acitVar = new acit();
        }
        ahxa ahxaVar = new ahxa(b, new hki() { // from class: ahwy
            @Override // defpackage.hki
            public final void a(Object obj) {
                agrk.this.l(cls, acitVar, (JSONObject) obj);
            }
        }, new ahwz(acitVar, 0), c2);
        if (f != null) {
            f.g(new acdp(ahxaVar, 3));
        }
        ((hkg) this.a).a(ahxaVar);
        return (acir) acitVar.a;
    }

    public final /* synthetic */ void l(Class cls, acit acitVar, JSONObject jSONObject) {
        try {
            try {
                try {
                    acitVar.d((ahxe) ((aonx) ((adze) this.b).a).i(jSONObject.toString(), cls));
                } catch (aook unused) {
                    throw new ahxf("Could not convert JSON string to " + cls.getName() + " due to syntax errors.");
                }
            } catch (ahxf e) {
                acitVar.c(new abra(new Status(8, e.getMessage())));
            }
        } catch (Error | RuntimeException e2) {
            aico.b(e2);
            throw e2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ahwo, java.lang.Object] */
    public final ahwo n(String str) {
        if (!this.b.containsKey(str)) {
            K(str);
        }
        return this.a;
    }

    public final void o(float f) {
        float[] fArr = (float[]) this.a;
        double atan2 = Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d;
        double d = (float) atan2;
        double d2 = f;
        ((float[]) this.b)[0] = (float) (r0[0] + (Math.cos(d) * d2));
        ((float[]) this.b)[1] = (float) (r12[1] + (d2 * Math.sin(d)));
    }

    public final void p(float f) {
        float[] fArr = (float[]) this.a;
        float atan2 = (float) Math.atan2(fArr[1], fArr[0]);
        double d = atan2;
        double d2 = f;
        ((float[]) this.b)[0] = (float) (r2[0] + (Math.cos(d) * d2));
        ((float[]) this.b)[1] = (float) (r14[1] + (d2 * Math.sin(d)));
    }

    public final void q(float f) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f);
        matrix.mapPoints((float[]) this.b);
        matrix.mapPoints((float[]) this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
    public final void r(ValueAnimator valueAnimator) {
        ajgl ajglVar = new ajgl();
        valueAnimator.addListener(this.b);
        ((ArrayList) this.a).add(ajglVar);
    }

    public final boolean s() {
        for (boolean z : (boolean[]) this.a) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void v(String str) {
        u();
        akrh e = aktp.e("execSQL: ".concat(str));
        try {
            ((SQLiteDatabase) this.b).execSQL(str);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void w(String str, ContentValues contentValues, int i) {
        u();
        akrh e = aktp.e("INSERT WITH ON CONFLICT ".concat(str));
        try {
            ((SQLiteDatabase) this.b).insertWithOnConflict(str, null, contentValues, i);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void x(String str) {
        ((StringBuilder) this.a).append(str);
    }

    public final void y(Long l) {
        ((ArrayList) this.b).add(l);
    }

    public final void z(String str) {
        ((ArrayList) this.b).add(str);
    }

    public agrk(Context context, acoc acocVar) {
        this.b = context;
        this.a = acocVar;
    }

    public agrk(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public agrk(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public agrk(agrk agrkVar) {
        Object obj = agrkVar.b;
        Object obj2 = agrkVar.a;
        float[] fArr = new float[2];
        this.b = fArr;
        float[] fArr2 = new float[2];
        this.a = fArr2;
        System.arraycopy(obj, 0, fArr, 0, 2);
        System.arraycopy(obj2, 0, fArr2, 0, 2);
    }

    public agrk(agrq agrqVar) {
        CookieManager cookieManager = new CookieManager();
        this.b = cookieManager;
        this.a = agrqVar;
        String string = agrqVar.a.getString("SET_COOKIE_URI", "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        ArrayList arrayList = new ArrayList(agrqVar.a.getStringSet("SET_COOKIE_VALUE", Collections.emptySet()));
        try {
            URI uri = new URI(string);
            Map<String, List<String>> singletonMap = Collections.singletonMap("Set-Cookie", arrayList);
            CookieManager cookieManager2 = cookieManager;
            cookieManager.put(uri, singletonMap);
        } catch (IOException | URISyntaxException e) {
            Log.e("HatsCookieManager", "Failed to restore cookies from persistence.", e);
        }
    }

    public agrk(Context context, Map map) {
        this.b = context;
        this.a = ((alor) map).keySet();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List, java.lang.Object] */
    public agrk(String str, List list, byte[] bArr) {
        this.a = new ArrayList();
        this.b = str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agrk agrkVar = (agrk) it.next();
            int i = 0;
            while (true) {
                if (i < this.a.size()) {
                    if (((String) ((agrk) this.a.get(i)).b).equals(agrkVar.b)) {
                        this.a.set(i, agrkVar);
                        break;
                    }
                    i++;
                } else {
                    this.a.add(agrkVar);
                    break;
                }
            }
        }
    }

    public agrk(short[] sArr) {
        this.a = new StringBuilder();
        this.b = new ArrayList();
    }

    public agrk(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
        this.a = new CancellationSignal();
    }

    public agrk(byte[] bArr, byte[] bArr2) {
        this.a = new Rect();
        this.b = new Rect();
    }

    public agrk(ajfh ajfhVar, ajfh ajfhVar2) {
        d.s(ajfhVar.a <= ajfhVar2.a);
        this.b = ajfhVar;
        this.a = ajfhVar2;
    }

    public agrk(agzz agzzVar, Class cls, Executor executor) {
        Class<?> cls2 = agzzVar.getClass();
        String aM = ahji.aM(ahji.aL(cls) + "->" + ahji.aL(cls2));
        ahab ahabVar = (ahab) ahab.a.get(executor);
        ahabVar = ahabVar == null ? new ahab(executor, false) : ahabVar;
        this.a = aM;
        this.b = ahabVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List, java.lang.Object] */
    public agrk(String str, List list) {
        this.a = new ArrayList();
        this.b = str;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aivh aivhVar = (aivh) it.next();
            int i = 0;
            while (true) {
                if (i < this.a.size()) {
                    if (((aivh) this.a.get(i)).a.equals(aivhVar.a)) {
                        this.a.set(i, aivhVar);
                        break;
                    }
                    i++;
                } else {
                    this.a.add(aivhVar);
                    break;
                }
            }
        }
    }

    public agrk(byte[] bArr) {
        this.a = new ArrayList();
        this.b = new ajia();
    }

    public agrk(Resources resources) {
        this.b = new ConcurrentHashMap();
        this.a = resources;
    }

    public agrk(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public agrk(ahwo ahwoVar) {
        this.a = ahwoVar;
        this.b = new ConcurrentHashMap();
    }

    public agrk(ahwq ahwqVar) {
        agrk agrkVar = new agrk(new ahwk());
        this.b = ahwqVar;
        this.a = agrkVar;
    }

    public agrk(ajna ajnaVar) {
        this.b = ajnaVar;
        this.a = aozb.w(amcn.h.f().k("397a244326452948"));
    }
}
