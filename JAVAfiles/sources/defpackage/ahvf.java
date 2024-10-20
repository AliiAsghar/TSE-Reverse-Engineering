package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahvf<T> implements alhr<T> {
    public static final /* synthetic */ int a = 0;
    private static volatile akip i = new akip(new ahve(0));
    private final String b;
    private final String c;
    private Object d;
    private volatile Object f;
    private final ahuq h;
    private volatile ahmn j;
    private volatile int e = -1;
    private volatile boolean g = true;

    public ahvf(String str, String str2, ahuq ahuqVar, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.h = ahuqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x00e9, TryCatch #2 {, blocks: (B:10:0x0013, B:12:0x0017, B:13:0x002c, B:15:0x0036, B:17:0x0054, B:20:0x0065, B:21:0x006b, B:23:0x0076, B:24:0x007b, B:47:0x00a0, B:50:0x00aa, B:26:0x00b5, B:30:0x00bf, B:32:0x00c3, B:42:0x00e0, B:43:0x00e1, B:44:0x00e3, B:52:0x00e5, B:53:0x00e7, B:34:0x00c4, B:36:0x00c8, B:37:0x00dc), top: B:9:0x0013, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf A[Catch: all -> 0x00e9, TryCatch #2 {, blocks: (B:10:0x0013, B:12:0x0017, B:13:0x002c, B:15:0x0036, B:17:0x0054, B:20:0x0065, B:21:0x006b, B:23:0x0076, B:24:0x007b, B:47:0x00a0, B:50:0x00aa, B:26:0x00b5, B:30:0x00bf, B:32:0x00c3, B:42:0x00e0, B:43:0x00e1, B:44:0x00e3, B:52:0x00e5, B:53:0x00e7, B:34:0x00c4, B:36:0x00c8, B:37:0x00dc), top: B:9:0x0013, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ahvi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object b(defpackage.ahta r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahvf.b(ahta):java.lang.Object");
    }

    public final Object a(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return b(ahta.a(applicationContext));
    }

    @Override // defpackage.alhr
    public final T get() {
        Object obj = ahta.a;
        ahtc.b = true;
        if (ahtc.c == null) {
            ahtc.c = new ahtb();
        }
        Context context = ahta.b;
        if (context != null) {
            return (T) b(ahta.a(context));
        }
        ahtc.a();
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public ahvf(String str, String str2, Object obj, ahuq ahuqVar) {
        this.b = str;
        this.c = str2;
        this.d = obj;
        this.h = ahuqVar;
    }
}
