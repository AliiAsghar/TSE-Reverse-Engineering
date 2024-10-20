package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gik extends env {
    public final gid g;
    public final arpi i;
    private final ght k;
    private final Callable n;
    private final ico o;
    private final boolean j = true;
    public final AtomicBoolean h = new AtomicBoolean(true);
    private final AtomicBoolean l = new AtomicBoolean(false);
    private final AtomicBoolean m = new AtomicBoolean(false);

    public gik(gid gidVar, ico icoVar, String[] strArr, Callable callable) {
        arpi arpiVar;
        this.g = gidVar;
        this.o = icoVar;
        this.k = new gii(strArr, this);
        if (gidVar.p()) {
            arpiVar = gidVar.c;
            if (arpiVar == null) {
                arro.b("transactionContext");
                arpiVar = null;
            }
        } else {
            arpiVar = arpj.a;
        }
        this.i = arpiVar;
        this.n = callable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.env
    public final void f() {
        this.o.a.add(this);
        arrn.J(this.g.i(), this.i, null, new eie(this, (arpe) null, 10, (byte[]) null), 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.env
    public final void g() {
        this.o.a.remove(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf A[Catch: all -> 0x002e, Exception -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0031, blocks: (B:12:0x0029, B:16:0x00bf), top: B:11:0x0029, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x0029, B:14:0x00b7, B:16:0x00bf, B:25:0x00dc, B:37:0x00d2, B:38:0x00d9), top: B:7:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b4 -> B:13:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ec -> B:24:0x00ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gik.l(arpe):java.lang.Object");
    }
}
