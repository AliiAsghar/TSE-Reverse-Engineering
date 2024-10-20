package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akuf implements Runnable {
    public final akte a;
    public final UUID b;
    public final boolean c;
    public final aktq d;
    public final AtomicReference e;
    public ListenableFuture f;
    private final aegu h;
    private final long i;
    private final Set j = new HashSet();
    int g = 0;
    private final boolean k = false;

    public akuf(akte akteVar, UUID uuid, aktq aktqVar, akue akueVar, long j, boolean z, boolean z2, aegu aeguVar) {
        this.a = akteVar;
        this.b = uuid;
        this.d = aktqVar;
        this.i = j;
        this.c = z;
        this.h = aeguVar;
        this.e = new AtomicReference(akueVar);
    }

    public final long a() {
        return this.h.b() - this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bf A[Catch: all -> 0x01c7, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:8:0x0017, B:10:0x001c, B:12:0x002e, B:14:0x003e, B:18:0x004a, B:22:0x005c, B:24:0x0065, B:26:0x006a, B:29:0x0079, B:30:0x007f, B:31:0x0085, B:33:0x008b, B:36:0x0098, B:38:0x00a1, B:40:0x00a9, B:42:0x00b1, B:44:0x00b5, B:46:0x00bb, B:50:0x00c2, B:54:0x00cf, B:59:0x00de, B:61:0x00f3, B:63:0x00f5, B:70:0x0101, B:72:0x0105, B:73:0x0125, B:75:0x012e, B:77:0x0130, B:82:0x0112, B:83:0x011b, B:85:0x0133, B:87:0x0138, B:89:0x014e, B:90:0x0151, B:92:0x016b, B:93:0x016e, B:95:0x018b, B:96:0x018e, B:97:0x019d, B:100:0x01af, B:101:0x01b5, B:104:0x01b7, B:105:0x01be, B:106:0x01bf, B:107:0x01c6), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0138 A[Catch: all -> 0x01c7, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:8:0x0017, B:10:0x001c, B:12:0x002e, B:14:0x003e, B:18:0x004a, B:22:0x005c, B:24:0x0065, B:26:0x006a, B:29:0x0079, B:30:0x007f, B:31:0x0085, B:33:0x008b, B:36:0x0098, B:38:0x00a1, B:40:0x00a9, B:42:0x00b1, B:44:0x00b5, B:46:0x00bb, B:50:0x00c2, B:54:0x00cf, B:59:0x00de, B:61:0x00f3, B:63:0x00f5, B:70:0x0101, B:72:0x0105, B:73:0x0125, B:75:0x012e, B:77:0x0130, B:82:0x0112, B:83:0x011b, B:85:0x0133, B:87:0x0138, B:89:0x014e, B:90:0x0151, B:92:0x016b, B:93:0x016e, B:95:0x018b, B:96:0x018e, B:97:0x019d, B:100:0x01af, B:101:0x01b5, B:104:0x01b7, B:105:0x01be, B:106:0x01bf, B:107:0x01c6), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akts b() {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akuf.b():akts");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ff  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akuf.run():void");
    }

    public final String toString() {
        return "UnfinishedTrace@" + Integer.toHexString(System.identityHashCode(this)) + "[" + b().a + "]";
    }
}
