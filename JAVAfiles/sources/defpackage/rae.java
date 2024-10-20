package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rae {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public rae(armf armfVar, armf armfVar2, psw pswVar, anen anenVar, anen anenVar2, okf okfVar, ocb ocbVar, armf armfVar3, armf armfVar4) {
        this.g = armfVar2;
        this.f = armfVar;
        this.a = pswVar;
        this.b = anenVar;
        this.c = anenVar2;
        this.d = okfVar;
        this.e = ocbVar;
        this.h = armfVar3;
        this.i = armfVar4;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [arpi, java.lang.Object] */
    private final void i(gbb gbbVar, gdg gdgVar) {
        arrn.J(this.a, this.d, null, new hmp(this, gdgVar, gbbVar, (arpe) null, 1), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul a(boolean z) {
        return aktp.ah(new hwm(this, z, 3, null), this.f).h(new itk(this, 14), this.g).i(new led(this, z, 0), this.g);
    }

    public final void b() {
        ((ahiy) this.h).q(aktp.ag(null), "richcardsettings");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r9v2, types: [asai, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.kcz
            if (r0 == 0) goto L13
            r0 = r9
            kcz r0 = (defpackage.kcz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            kcz r0 = new kcz
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            rae r0 = r0.d
            defpackage.aqil.P(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            defpackage.aqil.P(r9)
            java.lang.Object r9 = r8.g
            r0.d = r8
            r0.b = r3
            java.lang.Object r9 = defpackage.arrn.U(r9, r0)
            if (r9 == r1) goto La0
            r0 = r8
        L41:
            alog r9 = (defpackage.alog) r9
            int r1 = r9.size()
            if (r1 != r3) goto L50
            java.lang.Object r9 = defpackage.aqjn.X(r9)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r9 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r9
            goto L51
        L50:
            r9 = 0
        L51:
            if (r9 == 0) goto L63
            msh r1 = r9.f()
            if (r1 == 0) goto L63
            msf r1 = r1.G(r3)
            if (r1 == 0) goto L63
            java.lang.String r1 = r1.a
            if (r1 != 0) goto L65
        L63:
            java.lang.String r1 = ""
        L65:
            r2 = 0
            r4 = 2
            if (r9 == 0) goto L89
            java.lang.String r9 = r9.p()
            if (r9 == 0) goto L89
            java.lang.Object r5 = r0.e
            java.lang.Object r6 = r0.d
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r2] = r9
            r7[r3] = r1
            r7[r4] = r6
            android.content.Context r5 = (android.content.Context) r5
            r9 = 2132020701(0x7f140ddd, float:1.9679773E38)
            java.lang.String r9 = r5.getString(r9, r7)
            if (r9 != 0) goto L88
            goto L89
        L88:
            return r9
        L89:
            java.lang.Object r9 = r0.e
            java.lang.Object r0 = r0.d
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r1
            r4[r3] = r0
            android.content.Context r9 = (android.content.Context) r9
            r0 = 2132020700(0x7f140ddc, float:1.967977E38)
            java.lang.String r9 = r9.getString(r0, r4)
            r9.getClass()
            return r9
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rae.c(arpe):java.lang.Object");
    }

    public final void d() {
        ((AtomicBoolean) this.b).set(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r3.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b6, code lost:
    
        r9 = r9.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bb, code lost:
    
        if (r9 == 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (r9 != 2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        throw new java.lang.IllegalStateException("Can only fetch more during append/prepend");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cc, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
    
        if (r3.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.gbb r9, defpackage.gdj r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rae.e(gbb, gdj):void");
    }

    public final void f() {
        Object obj;
        gcm gcmVar = (gcm) this.g;
        if (gcmVar.e && gcmVar.c <= 0) {
            obj = null;
        } else {
            obj = ((gdj) aqjn.ac(gcmVar.a)).d;
        }
        if (obj == null) {
            gbb gbbVar = gbb.APPEND;
            gdj gdjVar = gdj.a;
            e(gbbVar, dyi.d());
        } else {
            ((gch) this.h).b(gbb.APPEND, gax.a);
            i(gbb.APPEND, new gdd(obj, ((akrq) this.e).b, true));
        }
    }

    public final void g() {
        Object obj;
        gcm gcmVar = (gcm) this.g;
        if (gcmVar.e && gcmVar.b + gcmVar.d <= 0) {
            obj = null;
        } else {
            obj = ((gdj) aqjn.X(gcmVar.a)).c;
        }
        if (obj == null) {
            gbb gbbVar = gbb.PREPEND;
            gdj gdjVar = gdj.a;
            e(gbbVar, dyi.d());
        } else {
            ((gch) this.h).b(gbb.PREPEND, gax.a);
            i(gbb.PREPEND, new gde(obj, ((akrq) this.e).b, true));
        }
    }

    public final boolean h() {
        return ((AtomicBoolean) this.b).get();
    }

    public rae(arwe arweVar, akrq akrqVar, gdk gdkVar, arwb arwbVar, arwb arwbVar2, fzw fzwVar, gcm gcmVar) {
        gdkVar.getClass();
        this.a = arweVar;
        this.e = akrqVar;
        this.f = gdkVar;
        this.c = arwbVar;
        this.d = arwbVar2;
        this.i = fzwVar;
        this.g = gcmVar;
        this.b = new AtomicBoolean(false);
        this.h = new gar(this);
    }

    public rae(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((kkc) obj).c instanceof Integer) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj2 = ((kkc) it.next()).c;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Object obj3 = ((kkc) it2.next()).c;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Object obj4 = ((kkc) it3.next()).c;
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            Object obj5 = ((kkc) it4.next()).c;
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            Object obj6 = ((kkc) it5.next()).c;
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            Object obj7 = ((kkc) it6.next()).c;
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            Object obj8 = ((kkc) it7.next()).c;
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Object obj9 = ((kkc) it8.next()).c;
        }
        this.b = arrayList;
        this.d = arrayList2;
        this.g = arrayList3;
        this.c = arrayList4;
        this.h = arrayList5;
        this.f = arrayList6;
        this.a = arrayList7;
        this.i = arrayList8;
        this.e = arrayList9;
    }

    public rae(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.f = armfVar3;
        armfVar4.getClass();
        this.h = armfVar4;
        armfVar5.getClass();
        this.d = armfVar5;
        armfVar6.getClass();
        this.i = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
        armfVar8.getClass();
        this.c = armfVar8;
        armfVar9.getClass();
        this.a = armfVar9;
    }

    public rae(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.h = armfVar4;
        armfVar5.getClass();
        this.i = armfVar5;
        armfVar6.getClass();
        this.e = armfVar6;
        armfVar7.getClass();
        this.c = armfVar7;
        armfVar8.getClass();
        this.f = armfVar8;
        armfVar9.getClass();
        this.g = armfVar9;
    }

    public rae(Context context, arwe arweVar, arpi arpiVar, asai asaiVar, mjg mjgVar, lkd lkdVar, lre lreVar, armf armfVar) {
        context.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        asaiVar.getClass();
        mjgVar.getClass();
        lkdVar.getClass();
        lreVar.getClass();
        armfVar.getClass();
        this.e = context;
        this.i = arweVar;
        this.a = arpiVar;
        this.g = asaiVar;
        this.b = mjgVar;
        this.h = lkdVar;
        this.f = lreVar;
        this.c = armfVar;
        String bs = yyb.bs(context);
        bs.getClass();
        this.d = bs;
    }

    public rae(ykw ykwVar, zxy zxyVar, Context context, ansy ansyVar, anen anenVar, anen anenVar2, ahiy ahiyVar, kkc kkcVar, armf armfVar) {
        this.d = ykwVar;
        this.a = zxyVar;
        this.c = context.getResources();
        this.b = ansyVar;
        this.f = anenVar;
        this.g = anenVar2;
        this.h = ahiyVar;
        this.e = kkcVar;
        this.i = armfVar;
    }

    public rae(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.h = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.f = armfVar5;
        armfVar6.getClass();
        this.g = armfVar6;
        armfVar7.getClass();
        this.i = armfVar7;
        this.d = armfVar8;
        armfVar9.getClass();
        this.a = armfVar9;
    }

    public rae(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.g = armfVar2;
        armfVar3.getClass();
        this.h = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.d = armfVar7;
        armfVar8.getClass();
        this.i = armfVar8;
        armfVar9.getClass();
        this.b = armfVar9;
    }
}
