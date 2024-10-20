package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ahtp {
    public static final /* synthetic */ int e = 0;
    private static volatile ahto f = null;
    private static volatile boolean g = false;
    final ahtn b;
    final String c;
    public volatile int d = -1;
    private Object j;
    private volatile Object k;
    private final boolean l;
    private volatile boolean m;
    private static final Object a = new Object();
    private static final AtomicReference h = new AtomicReference();
    private static final akip n = new akip(new ahve(1));
    private static final AtomicInteger i = new AtomicInteger();

    public ahtp(ahtn ahtnVar, String str, Object obj, boolean z) {
        String str2 = ahtnVar.a;
        if (str2 == null && ahtnVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && ahtnVar.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.b = ahtnVar;
        this.c = str;
        this.j = obj;
        this.l = z;
        this.m = false;
    }

    public static void e() {
        i.incrementAndGet();
    }

    public static void f(Context context) {
        if (f == null && context != null) {
            Object obj = a;
            synchronized (obj) {
                if (f == null) {
                    synchronized (obj) {
                        ahto ahtoVar = f;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (ahtoVar == null || ahtoVar.a != context) {
                            if (ahtoVar != null) {
                                ahsp.b();
                                ahtr.b();
                                ahsv.c();
                            }
                            f = new ahto(context, albo.D(new ahsz(context, 4)));
                            e();
                        }
                    }
                }
            }
        }
    }

    private final String h(String str) {
        if (str.isEmpty()) {
            return this.c;
        }
        return str.concat(String.valueOf(this.c));
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Can't wrap try/catch for region: R(11:97|(8:99|(1:101)(1:110)|102|(1:104)|106|107|108|109)|111|112|113|114|(4:116|107|108|109)|106|107|108|109) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00d8, code lost:
    
        if ("com.google.android.gms".equals(r9.packageName) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0146, code lost:
    
        if (defpackage.agqa.e(r1) != false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0131 A[Catch: all -> 0x0209, TryCatch #5 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0037, B:18:0x0053, B:20:0x005e, B:22:0x006e, B:25:0x0191, B:27:0x019b, B:29:0x01a3, B:31:0x01a9, B:32:0x01ad, B:43:0x01ca, B:46:0x01d8, B:48:0x01de, B:49:0x01d2, B:53:0x01e5, B:56:0x01e8, B:58:0x01ee, B:61:0x01f6, B:62:0x01fb, B:63:0x01ff, B:65:0x007f, B:67:0x0087, B:69:0x0105, B:70:0x0113, B:88:0x012d, B:89:0x0095, B:90:0x0097, B:109:0x00f7, B:121:0x0130, B:122:0x0131, B:126:0x014c, B:144:0x0206, B:145:0x0142, B:149:0x0207, B:34:0x01ae, B:36:0x01b2, B:38:0x01ba, B:39:0x01c5, B:40:0x01c0, B:41:0x01c7, B:42:0x01c9, B:128:0x014d, B:130:0x0157, B:135:0x0175, B:136:0x0180, B:139:0x018a, B:140:0x018d, B:141:0x018e, B:132:0x015d, B:134:0x0165, B:137:0x0179, B:72:0x0114, B:78:0x011e, B:80:0x0123, B:74:0x0129, B:92:0x0098, B:94:0x00a0, B:95:0x00ac, B:97:0x00ae, B:99:0x00ba, B:102:0x00ca, B:104:0x00d0, B:107:0x00ec, B:108:0x00f6, B:111:0x00da, B:113:0x00de, B:114:0x00e4), top: B:7:0x001e, inners: #0, #1, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[Catch: all -> 0x0209, TryCatch #5 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0037, B:18:0x0053, B:20:0x005e, B:22:0x006e, B:25:0x0191, B:27:0x019b, B:29:0x01a3, B:31:0x01a9, B:32:0x01ad, B:43:0x01ca, B:46:0x01d8, B:48:0x01de, B:49:0x01d2, B:53:0x01e5, B:56:0x01e8, B:58:0x01ee, B:61:0x01f6, B:62:0x01fb, B:63:0x01ff, B:65:0x007f, B:67:0x0087, B:69:0x0105, B:70:0x0113, B:88:0x012d, B:89:0x0095, B:90:0x0097, B:109:0x00f7, B:121:0x0130, B:122:0x0131, B:126:0x014c, B:144:0x0206, B:145:0x0142, B:149:0x0207, B:34:0x01ae, B:36:0x01b2, B:38:0x01ba, B:39:0x01c5, B:40:0x01c0, B:41:0x01c7, B:42:0x01c9, B:128:0x014d, B:130:0x0157, B:135:0x0175, B:136:0x0180, B:139:0x018a, B:140:0x018d, B:141:0x018e, B:132:0x015d, B:134:0x0165, B:137:0x0179, B:72:0x0114, B:78:0x011e, B:80:0x0123, B:74:0x0129, B:92:0x0098, B:94:0x00a0, B:95:0x00ac, B:97:0x00ae, B:99:0x00ba, B:102:0x00ca, B:104:0x00d0, B:107:0x00ec, B:108:0x00f6, B:111:0x00da, B:113:0x00de, B:114:0x00e4), top: B:7:0x001e, inners: #0, #1, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0191 A[Catch: all -> 0x0209, TRY_ENTER, TryCatch #5 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0037, B:18:0x0053, B:20:0x005e, B:22:0x006e, B:25:0x0191, B:27:0x019b, B:29:0x01a3, B:31:0x01a9, B:32:0x01ad, B:43:0x01ca, B:46:0x01d8, B:48:0x01de, B:49:0x01d2, B:53:0x01e5, B:56:0x01e8, B:58:0x01ee, B:61:0x01f6, B:62:0x01fb, B:63:0x01ff, B:65:0x007f, B:67:0x0087, B:69:0x0105, B:70:0x0113, B:88:0x012d, B:89:0x0095, B:90:0x0097, B:109:0x00f7, B:121:0x0130, B:122:0x0131, B:126:0x014c, B:144:0x0206, B:145:0x0142, B:149:0x0207, B:34:0x01ae, B:36:0x01b2, B:38:0x01ba, B:39:0x01c5, B:40:0x01c0, B:41:0x01c7, B:42:0x01c9, B:128:0x014d, B:130:0x0157, B:135:0x0175, B:136:0x0180, B:139:0x018a, B:140:0x018d, B:141:0x018e, B:132:0x015d, B:134:0x0165, B:137:0x0179, B:72:0x0114, B:78:0x011e, B:80:0x0123, B:74:0x0129, B:92:0x0098, B:94:0x00a0, B:95:0x00ac, B:97:0x00ae, B:99:0x00ba, B:102:0x00ca, B:104:0x00d0, B:107:0x00ec, B:108:0x00f6, B:111:0x00da, B:113:0x00de, B:114:0x00e4), top: B:7:0x001e, inners: #0, #1, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a3 A[Catch: all -> 0x0209, TryCatch #5 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0037, B:18:0x0053, B:20:0x005e, B:22:0x006e, B:25:0x0191, B:27:0x019b, B:29:0x01a3, B:31:0x01a9, B:32:0x01ad, B:43:0x01ca, B:46:0x01d8, B:48:0x01de, B:49:0x01d2, B:53:0x01e5, B:56:0x01e8, B:58:0x01ee, B:61:0x01f6, B:62:0x01fb, B:63:0x01ff, B:65:0x007f, B:67:0x0087, B:69:0x0105, B:70:0x0113, B:88:0x012d, B:89:0x0095, B:90:0x0097, B:109:0x00f7, B:121:0x0130, B:122:0x0131, B:126:0x014c, B:144:0x0206, B:145:0x0142, B:149:0x0207, B:34:0x01ae, B:36:0x01b2, B:38:0x01ba, B:39:0x01c5, B:40:0x01c0, B:41:0x01c7, B:42:0x01c9, B:128:0x014d, B:130:0x0157, B:135:0x0175, B:136:0x0180, B:139:0x018a, B:140:0x018d, B:141:0x018e, B:132:0x015d, B:134:0x0165, B:137:0x0179, B:72:0x0114, B:78:0x011e, B:80:0x0123, B:74:0x0129, B:92:0x0098, B:94:0x00a0, B:95:0x00ac, B:97:0x00ae, B:99:0x00ba, B:102:0x00ca, B:104:0x00d0, B:107:0x00ec, B:108:0x00f6, B:111:0x00da, B:113:0x00de, B:114:0x00e4), top: B:7:0x001e, inners: #0, #1, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahtp.b():java.lang.Object");
    }

    public final Object c() {
        if (this.m) {
            synchronized (this) {
                if (this.m) {
                    Object a2 = a(this.j);
                    a2.getClass();
                    this.j = a2;
                    this.m = false;
                }
            }
        }
        return this.j;
    }

    public final String d() {
        return h(this.b.d);
    }

    public final void g(Object obj) {
        this.k = obj;
        this.d = Integer.MAX_VALUE;
        AtomicReference atomicReference = h;
        if (atomicReference.get() == null) {
            a.bE(atomicReference, new ArrayList());
        }
        ((Collection) atomicReference.get()).add(this);
    }

    public ahtp(ahtn ahtnVar) {
        String str = ahtnVar.a;
        if (str == null && ahtnVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str != null && ahtnVar.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.b = ahtnVar;
        this.c = "getTokenRefactor__blocked_packages";
        this.j = "ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n";
        this.l = true;
        this.m = true;
    }
}
