package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ascx extends asdg implements ascd, asai, asdv {
    private final arve a;
    private int b;

    public ascx(Object obj) {
        this.a = new arve(obj, arvf.a);
    }

    private final boolean i(Object obj, Object obj2) {
        int i;
        asdi[] asdiVarArr;
        asfn asfnVar;
        synchronized (this) {
            Object obj3 = this.a.a;
            if (obj != null && !d.F(obj3, obj)) {
                return false;
            }
            if (d.F(obj3, obj2)) {
                return true;
            }
            this.a.c(obj2);
            int i2 = this.b;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.b = i3;
                asdi[] asdiVarArr2 = this.d;
                while (true) {
                    ascz[] asczVarArr = (ascz[]) asdiVarArr2;
                    if (asczVarArr != null) {
                        for (ascz asczVar : asczVarArr) {
                            if (asczVar != null) {
                                while (true) {
                                    Object obj4 = asczVar.a.get();
                                    if (obj4 != null && obj4 != (asfnVar = ascy.b)) {
                                        asfn asfnVar2 = ascy.a;
                                        if (obj4 == asfnVar2) {
                                            if (a.bC(asczVar.a, obj4, asfnVar)) {
                                                break;
                                            }
                                        } else if (a.bC(asczVar.a, obj4, asfnVar2)) {
                                            ((arvp) obj4).w(arnb.a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.b;
                        if (i == i3) {
                            this.b = i3 + 1;
                            return true;
                        }
                        asdiVarArr = this.d;
                    }
                    asdiVarArr2 = asdiVarArr;
                    i3 = i;
                }
            } else {
                this.b = i2 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if (defpackage.d.F(r13, r14) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fd, code lost:
    
        if (defpackage.arnb.a != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r14 == r1) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x008b, B:16:0x0091, B:18:0x0096, B:20:0x00b6, B:22:0x00c7, B:24:0x00e9, B:25:0x00ee, B:27:0x00f6, B:29:0x00fb, B:34:0x009c, B:37:0x00a3, B:45:0x004d, B:47:0x0057, B:48:0x007c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x008b, B:16:0x0091, B:18:0x0096, B:20:0x00b6, B:22:0x00c7, B:24:0x00e9, B:25:0x00ee, B:27:0x00f6, B:29:0x00fb, B:34:0x009c, B:37:0x00a3, B:45:0x004d, B:47:0x0057, B:48:0x007c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x008b, B:16:0x0091, B:18:0x0096, B:20:0x00b6, B:22:0x00c7, B:24:0x00e9, B:25:0x00ee, B:27:0x00f6, B:29:0x00fb, B:34:0x009c, B:37:0x00a3, B:45:0x004d, B:47:0x0057, B:48:0x007c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [arxm] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, arxm] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00c5 -> B:14:0x008b). Please report as a decompilation issue!!! */
    @Override // defpackage.ascg, defpackage.asai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.asaj r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ascx.a(asaj, arpe):java.lang.Object");
    }

    @Override // defpackage.ascd, defpackage.ascv
    public final Object c() {
        asfn asfnVar = asdy.a;
        Object obj = this.a.a;
        if (obj == asfnVar) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.ascg
    public final List d() {
        return aqjn.y(c());
    }

    @Override // defpackage.ascc
    public final void e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.ascd
    public final void f(Object obj) {
        if (obj == null) {
            obj = asdy.a;
        }
        i(null, obj);
    }

    @Override // defpackage.ascc, defpackage.asaj
    public final Object fv(Object obj, arpe arpeVar) {
        f(obj);
        return arnb.a;
    }

    @Override // defpackage.ascd
    public final boolean g(Object obj, Object obj2) {
        if (obj == null) {
            obj = asdy.a;
        }
        if (obj2 == null) {
            obj2 = asdy.a;
        }
        return i(obj, obj2);
    }

    @Override // defpackage.ascc
    public final boolean h(Object obj) {
        f(obj);
        return true;
    }

    @Override // defpackage.asdv
    public final asai hp(arpi arpiVar, int i, int i2) {
        return ascy.b(this, arpiVar, i, i2);
    }

    @Override // defpackage.asdg
    public final /* synthetic */ asdi j() {
        return new ascz();
    }

    @Override // defpackage.asdg
    public final /* bridge */ /* synthetic */ asdi[] m() {
        return new ascz[2];
    }
}
