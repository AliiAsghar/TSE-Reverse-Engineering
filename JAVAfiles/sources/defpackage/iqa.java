package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqa implements iqh {
    public final Activity a;
    public final mci b;
    public final Context c;
    public final arqg d;
    public final arwe e;
    public final aajt f;
    public final aant g;
    public final zkm h;
    private final arpi i;
    private final arpi j;
    private final Supplier k;
    private final abac l;

    public iqa(Activity activity, mci mciVar, arpi arpiVar, zkm zkmVar, aajt aajtVar, Context context, arqg arqgVar, arpi arpiVar2, Supplier supplier, abac abacVar, aant aantVar, arwe arweVar) {
        this.a = activity;
        this.b = mciVar;
        this.i = arpiVar;
        this.h = zkmVar;
        this.f = aajtVar;
        this.c = context;
        this.d = arqgVar;
        this.j = arpiVar2;
        this.k = supplier;
        this.l = abacVar;
        this.g = aantVar;
        this.e = arweVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (defpackage.arro.q(r1, r5, r2) != r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.net.Uri r18, defpackage.arpe r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.ipy
            if (r2 == 0) goto L17
            r2 = r1
            ipy r2 = (defpackage.ipy) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            ipy r2 = new ipy
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            arpl r3 = defpackage.arpl.a
            int r4 = r2.c
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L49
            if (r4 == r7) goto L43
            if (r4 == r6) goto L3b
            if (r4 != r5) goto L33
            defpackage.aqil.P(r1)
            goto Lac
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            aapn r4 = r2.e
            iqa r6 = r2.d
            defpackage.aqil.P(r1)
            goto L85
        L43:
            iqa r4 = r2.d
            defpackage.aqil.P(r1)
            goto L62
        L49:
            defpackage.aqil.P(r1)
            arpi r1 = r0.i
            gbv r4 = new gbv
            r9 = 13
            r10 = r18
            r4.<init>(r0, r10, r8, r9)
            r2.d = r0
            r2.c = r7
            java.lang.Object r1 = defpackage.arro.q(r1, r4, r2)
            if (r1 == r3) goto Laf
            r4 = r0
        L62:
            aapn r1 = (defpackage.aapn) r1
            arpi r15 = r4.j
            emz r14 = new emz
            r13 = 18
            r16 = 0
            r12 = 0
            r9 = r14
            r10 = r4
            r11 = r1
            r5 = r14
            r14 = r16
            r9.<init>(r10, r11, r12, r13, r14)
            r2.d = r4
            r2.e = r1
            r2.c = r6
            java.lang.Object r5 = defpackage.arro.q(r15, r5, r2)
            if (r5 == r3) goto Laf
            r6 = r4
            r4 = r1
            r1 = r5
        L85:
            java.lang.String r1 = (java.lang.String) r1
            arqg r5 = r6.d
            java.lang.Object r5 = r5.a()
            afkq r5 = (defpackage.afkq) r5
            aflb r5 = r5.a
            r1.getClass()
            r5.c(r1)
            arpi r1 = r6.i
            kfr r5 = new kfr
            r5.<init>(r6, r4, r8, r7)
            r2.d = r8
            r2.e = r8
            r4 = 3
            r2.c = r4
            java.lang.Object r1 = defpackage.arro.q(r1, r5, r2)
            if (r1 != r3) goto Lac
            goto Laf
        Lac:
            arnb r1 = defpackage.arnb.a
            return r1
        Laf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqa.a(android.net.Uri, arpe):java.lang.Object");
    }

    public final Object b(Uri uri, arpe arpeVar) {
        Object obj;
        arpk arpkVar = new arpk(arhi.i(arpeVar));
        obj = this.k.get();
        obj.getClass();
        this.l.c(uri, new aapo(this, arpkVar, 1));
        return arpkVar.a();
    }

    @Override // defpackage.iqh
    public final /* bridge */ /* synthetic */ Object c(Object obj, arpe arpeVar) {
        Uri uri = (Uri) obj;
        arpk arpkVar = new arpk(arhi.i(arpeVar));
        if (uri != null) {
            qjh.l(this.e, null, new ipz(arpkVar, this, uri, (arpe) null, 0), 3);
        } else {
            arpkVar.w(new Integer(0));
        }
        return arpkVar.a();
    }
}
