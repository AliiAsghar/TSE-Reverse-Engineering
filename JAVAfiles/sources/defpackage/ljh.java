package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljh {
    public static final xze a = xze.g("BugleMultiShare", "SuggestionsAdapterImpl");
    public final Context b;
    public final armf c;
    public final armf d;
    public final lih e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final amwf k;
    public final lix l;
    public final ascv m;
    public final lgd n;
    private final arwe o;
    private final armf p;
    private final ascv q;
    private final ascv r;
    private final ascv s;
    private final ascv t;
    private final ascv u;
    private final ifq v;

    public ljh(arwe arweVar, Context context, armf armfVar, armf armfVar2, lih lihVar, ifq ifqVar, lgd lgdVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, amwf amwfVar) {
        ascv T;
        arweVar.getClass();
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        lihVar.getClass();
        ifqVar.getClass();
        lgdVar.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        amwfVar.getClass();
        this.o = arweVar;
        this.b = context;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = lihVar;
        this.v = ifqVar;
        this.n = lgdVar;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.p = armfVar7;
        this.j = armfVar8;
        this.k = amwfVar;
        byte[] bArr = null;
        lix lixVar = new lix(bArr);
        this.l = lixVar;
        kdp kdpVar = new kdp(lihVar.b(), this, 11);
        int i = ascp.a;
        ascv T2 = arrn.T(kdpVar, arweVar, asco.a(0L, 3), new liw(bArr));
        this.q = T2;
        ascv T3 = arrn.T(new jdn(new kdp(T2, this, 12), lgdVar.c, new liz(this, 0), 17, null), arweVar, asco.a(0L, 3), lixVar);
        this.r = T3;
        ascv T4 = arrn.T(new jdn(new kdp(T2, this, 13), lgdVar.c, new igb(this, (arpe) null, 15, (byte[]) null), 17, null), arweVar, asco.a(0L, 3), arnv.a);
        this.s = T4;
        ascv T5 = arrn.T(new jdn(new kdp(T2, this, 14), lgdVar.c, new igb(this, (arpe) null, 14), 17, null), arweVar, asco.a(0L, 3), arnv.a);
        this.t = T5;
        ascv ascvVar = ((lit) armfVar7.b()).j;
        this.u = ascvVar;
        if (((pku) armfVar8.b()).a()) {
            T = arrn.T(arrn.Q(T3, T4, T5, ascvVar, new zca(this, 1, (byte[]) null)), arweVar, asco.a(0L, 3), lixVar);
        } else {
            T = arrn.T(arrn.P(T3, T4, T5, new liy(this, 0)), arweVar, asco.a(0L, 3), lixVar);
        }
        this.m = T;
    }

    public final lji a() {
        String string = this.b.getString(R.string.multi_share_contact_work_directory_header);
        string.getClass();
        return new lio("work_header", new aesl(string));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r6, java.util.regex.Pattern r7, defpackage.arpe r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.lja
            if (r0 == 0) goto L13
            r0 = r8
            lja r0 = (defpackage.lja) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lja r0 = new lja
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            java.lang.String r3 = "query"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.util.regex.Pattern r7 = r0.e
            java.lang.String r6 = r0.d
            defpackage.aqil.P(r8)
            goto L70
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.aqil.P(r8)
            int r8 = r6.length()
            if (r8 != 0) goto L45
            lin r6 = new lin
            r7 = 0
            r6.<init>(r7)
            return r6
        L45:
            xze r8 = defpackage.ljh.a
            xyo r8 = r8.a()
            r8.L(r3, r6)
            java.lang.String r2 = "searching corp contacts"
            r8.H(r2)
            r8.q()
            ifq r8 = r5.v
            mkd r8 = r8.b()
            akul r8 = r8.a(r6)
            r8.getClass()
            r0.d = r6
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = defpackage.arro.F(r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            alog r8 = (defpackage.alog) r8
            xze r0 = defpackage.ljh.a
            xyo r0 = r0.a()
            r0.L(r3, r6)
            java.lang.String r1 = "finished searching corp contacts"
            r0.H(r1)
            r0.q()
            lin r0 = new lin
            r8.getClass()
            r0.<init>(r6, r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljh.b(java.lang.String, java.util.regex.Pattern, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r7, java.util.regex.Pattern r8, defpackage.arpe r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ljb
            if (r0 == 0) goto L13
            r0 = r9
            ljb r0 = (defpackage.ljb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ljb r0 = new ljb
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            java.lang.String r3 = "query"
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            ahqq r7 = r0.f
            java.util.regex.Pattern r8 = r0.e
            java.lang.String r0 = r0.d
            defpackage.aqil.P(r9)
            r5 = r9
            r9 = r7
            r7 = r0
            r0 = r5
            goto L83
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            defpackage.aqil.P(r9)
            int r9 = r7.length()
            if (r9 != 0) goto L4b
            liv r7 = new liv
            r8 = 0
            r7.<init>(r8)
            return r7
        L4b:
            xze r9 = defpackage.ljh.a
            xyo r9 = r9.a()
            r9.L(r3, r7)
            java.lang.String r2 = "searching personal contacts"
            r9.H(r2)
            r9.q()
            armf r9 = r6.f
            java.lang.Object r9 = r9.b()
            ahqr r9 = (defpackage.ahqr) r9
            ahqq r9 = r9.d()
            ifq r2 = r6.v
            mkd r2 = r2.b()
            akul r2 = r2.b(r7)
            r2.getClass()
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.c = r4
            java.lang.Object r0 = defpackage.arro.F(r2, r0)
            if (r0 == r1) goto L9e
        L83:
            alog r0 = (defpackage.alog) r0
            xze r1 = defpackage.ljh.a
            xyo r1 = r1.a()
            r1.L(r3, r7)
            java.lang.String r2 = "finished searching personal contacts"
            r1.H(r2)
            r1.q()
            liv r1 = new liv
            r0.getClass()
            r1.<init>(r7, r0, r8, r9)
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljh.c(java.lang.String, java.util.regex.Pattern, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r6, java.util.regex.Pattern r7, defpackage.arpe r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ljc
            if (r0 == 0) goto L13
            r0 = r8
            ljc r0 = (defpackage.ljc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ljc r0 = new ljc
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            java.lang.String r3 = "query"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.util.regex.Pattern r7 = r0.e
            java.lang.String r6 = r0.d
            defpackage.aqil.P(r8)
            goto L70
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.aqil.P(r8)
            int r8 = r6.length()
            if (r8 != 0) goto L45
            lin r6 = new lin
            r7 = 0
            r6.<init>(r7)
            return r6
        L45:
            xze r8 = defpackage.ljh.a
            xyo r8 = r8.a()
            r8.L(r3, r6)
            java.lang.String r2 = "searching work contacts"
            r8.H(r2)
            r8.q()
            ifq r8 = r5.v
            mkd r8 = r8.b()
            akul r8 = r8.c(r6)
            r8.getClass()
            r0.d = r6
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = defpackage.arro.F(r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            alog r8 = (defpackage.alog) r8
            xze r0 = defpackage.ljh.a
            xyo r0 = r0.a()
            r0.L(r3, r6)
            java.lang.String r1 = "finished searching work contacts"
            r0.H(r1)
            r0.q()
            lin r0 = new lin
            r8.getClass()
            r0.<init>(r6, r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljh.d(java.lang.String, java.util.regex.Pattern, arpe):java.lang.Object");
    }

    public final liu e(mkl mklVar, String str, lge lgeVar, Pattern pattern) {
        return new liu(str, new rqe(mklVar, this, lgeVar, pattern, str, 1));
    }

    public final List f(Pattern pattern, String str, int i, int i2) {
        if (pattern == null) {
            return arnv.a;
        }
        Locale b = yhx.b(this.b);
        b.getClass();
        String lowerCase = str.toLowerCase(b);
        lowerCase.getClass();
        Matcher matcher = pattern.matcher(lowerCase);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (matcher.find(i3)) {
            int start = matcher.start();
            int end = matcher.end();
            arrayList.add(new aesi(1, i, start + i2, end + i2));
            i3 = end;
        }
        if (i == 2) {
            arrayList.add(new aesi(2, 2, i2, str.length() + i2));
        }
        return arrayList;
    }
}
