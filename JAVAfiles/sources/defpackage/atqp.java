package defpackage;

import java.lang.reflect.InvocationHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqp implements InvocationHandler {
    final /* synthetic */ Class a;
    final /* synthetic */ atqq b;
    private final atqj c = atqj.a;
    private final Object[] d = new Object[0];

    public atqp(atqq atqqVar, Class cls) {
        this.a = cls;
        this.b = atqqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0304, code lost:
    
        r5 = r13.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x030a, code lost:
    
        if (r5 == defpackage.asmm.class) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x030e, code lost:
    
        if (r5 == defpackage.atqo.class) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0318, code lost:
    
        if (r1.c.equals("HEAD") == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0320, code lost:
    
        if (java.lang.Void.class.equals(r5) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x032c, code lost:
    
        throw defpackage.atqx.b(r19, "HEAD method must use Void as response type.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0331, code lost:
    
        r5 = r3.a(r5, r19.getAnnotations());
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0335, code lost:
    
        r8 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0337, code lost:
    
        if (r4 != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0339, code lost:
    
        r4 = new defpackage.atpd(r1, r8, r5, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x034c, code lost:
    
        r3.a.put(r19, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x033f, code lost:
    
        if (r6 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0341, code lost:
    
        r4 = new defpackage.atpf(r1, r8, r5, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0347, code lost:
    
        r4 = new defpackage.atpe(r1, r8, r5, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0353, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0361, code lost:
    
        throw defpackage.atqx.c(r19, r0, "Unable to create converter for %s", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x036b, code lost:
    
        throw defpackage.atqx.b(r19, "Response must include generic type (e.g., Response<String>)", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0391, code lost:
    
        throw defpackage.atqx.b(r19, "'" + defpackage.atqx.a(r5).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0396, code lost:
    
        r0 = new java.lang.StringBuilder("Could not locate call adapter for ");
        r0.append(r9);
        r0.append(".\n  Tried:");
        r1 = r3.e.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03a9, code lost:
    
        if (r10 >= r1) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03ab, code lost:
    
        r0.append("\n   * ");
        r0.append(((defpackage.atop) r3.e.get(r10)).getClass().getName());
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03cf, code lost:
    
        throw new java.lang.IllegalArgumentException(r0.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [aslf, java.lang.Object] */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r18, java.lang.reflect.Method r19, java.lang.Object[] r20) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atqp.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
