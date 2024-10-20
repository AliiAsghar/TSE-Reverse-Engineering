package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zeh {
    public final Context a;
    public final ConversationId b;
    public final zbk c;
    public final armf d;
    public final armf e;
    public final ascv f;
    public final ascv g;
    public final ascv h;
    public final zeq i;
    public final zen j;
    private final arwe k;
    private final armf l;
    private final zdx m;
    private final zea n;
    private final zbu o;
    private final ahmv p;

    /* JADX WARN: Type inference failed for: r1v12, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [asai, java.lang.Object] */
    public zeh(Context context, arwe arweVar, ConversationId conversationId, zen zenVar, zbu zbuVar, zbk zbkVar, zeq zeqVar, ahmv ahmvVar, lkd lkdVar, ahmv ahmvVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        boolean z;
        Object aghwVar;
        context.getClass();
        arweVar.getClass();
        zenVar.getClass();
        zbuVar.getClass();
        zbkVar.getClass();
        zeqVar.getClass();
        ahmvVar.getClass();
        lkdVar.getClass();
        ahmvVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.a = context;
        this.k = arweVar;
        this.b = conversationId;
        this.j = zenVar;
        this.o = zbuVar;
        this.c = zbkVar;
        this.i = zeqVar;
        this.p = ahmvVar;
        this.l = armfVar;
        this.d = armfVar2;
        this.e = armfVar4;
        byte[] bArr = null;
        zdx zdxVar = new zdx(new aept(bArr), new zcx(bArr));
        this.m = zdxVar;
        if (((pny) armfVar4.b()).a()) {
            z = lkdVar.f(llg.a);
        } else if (!zeqVar.a) {
            z = true;
        } else {
            z = false;
        }
        aehz a = a(z, new zdh(this, lkdVar, 8));
        String string = context.getString(R.string.start_chat_top_app_bar_title_single);
        string.getClass();
        zea zeaVar = new zea(new afaw(new afas(string, null, null, false, null, null, null, 254), a, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 116), false);
        this.n = zeaVar;
        ?? r1 = ahmvVar2.c;
        int i = ascp.a;
        this.f = arrn.T(r1, arweVar, asco.a(0L, 3), zdxVar);
        if (((okf) armfVar2.b()).a()) {
            aghwVar = ((zeo) armfVar.b()).e;
        } else {
            aghwVar = new aghw(null, 9);
        }
        this.g = arrn.T(new jdn(aghwVar, zenVar.e, new zee(this, lkdVar, null), 17, null), arweVar, asco.a(0L, 3), zeaVar);
        this.h = arrn.T(ahmvVar.i, arweVar, asco.a(0L, 3), new zec());
    }

    public final aehz a(boolean z, arqg arqgVar) {
        Context context = this.a;
        aerb aerbVar = aerb.n;
        String string = context.getString(R.string.start_chat_top_app_bar_back);
        string.getClass();
        return new aehz(string, aerbVar, false, false, false, z, null, null, arqgVar, 988);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:14:0x0061 BREAK  A[LOOP:0: B:18:0x0050->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.zed
            if (r0 == 0) goto L13
            r0 = r6
            zed r0 = (defpackage.zed) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zed r0 = new zed
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r6)
            zbu r6 = r4.o
            r0.c = r3
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 == r1) goto L66
        L3c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r5 = r6 instanceof java.util.Collection
            if (r5 == 0) goto L4c
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4c
            goto L61
        L4c:
            java.util.Iterator r5 = r6.iterator()
        L50:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r5.next()
            zbm r6 = (defpackage.zbm) r6
            boolean r6 = r6.b
            if (r6 != 0) goto L50
            r3 = 0
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zeh.b(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0108, code lost:
    
        if (((java.lang.Boolean) r14).booleanValue() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ff, code lost:
    
        if (r14 == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (((java.lang.Boolean) r14).booleanValue() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        if (r14 != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.nfw r12, defpackage.zem r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zeh.c(nfw, zem, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r9 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (r9 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.zem r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.zeg
            if (r0 == 0) goto L13
            r0 = r9
            zeg r0 = (defpackage.zeg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zeg r0 = new zeg
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2132017992(0x7f140348, float:1.9674278E38)
            r4 = 2132017994(0x7f14034a, float:1.9674282E38)
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3c
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            defpackage.aqil.P(r9)
            goto L8a
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            defpackage.aqil.P(r9)
            goto L5b
        L3c:
            defpackage.aqil.P(r9)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r9 = r7.b
            if (r9 != 0) goto La4
            zep r9 = r8.d
            zep r2 = defpackage.zep.b
            if (r9 != r2) goto L74
            java.util.List r9 = r8.e
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L6b
            java.util.List r8 = r8.e
            r0.c = r6
            java.lang.Object r9 = r7.b(r8, r0)
            if (r9 == r1) goto L9a
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r6 == r8) goto L64
            goto L65
        L64:
            r3 = r4
        L65:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r3)
            return r8
        L6b:
            java.lang.Integer r8 = new java.lang.Integer
            r9 = 2132021689(0x7f1411b9, float:1.9681776E38)
            r8.<init>(r9)
            return r8
        L74:
            zep r2 = defpackage.zep.c
            if (r9 != r2) goto L9b
            java.util.List r9 = r8.e
            int r9 = r9.size()
            if (r9 <= r6) goto L9b
            java.util.List r8 = r8.e
            r0.c = r5
            java.lang.Object r9 = r7.b(r8, r0)
            if (r9 == r1) goto L9a
        L8a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r6 == r8) goto L93
            goto L94
        L93:
            r3 = r4
        L94:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r3)
            return r8
        L9a:
            return r1
        L9b:
            java.lang.Integer r8 = new java.lang.Integer
            r9 = 2132021690(0x7f1411ba, float:1.9681778E38)
            r8.<init>(r9)
            return r8
        La4:
            java.lang.Integer r8 = new java.lang.Integer
            r9 = 2132017991(0x7f140347, float:1.9674276E38)
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zeh.d(zem, arpe):java.lang.Object");
    }
}
