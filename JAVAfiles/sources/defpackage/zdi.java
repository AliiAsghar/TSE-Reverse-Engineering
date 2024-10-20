package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdi {
    private static final alvi j = alvi.m("com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl");
    public final Context a;
    public final zdy b;
    public final armf c;
    public final zbk d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final ascv i;
    private final arwe k;
    private final armf l;
    private final armf m;
    private final zcx n;
    private final ascv o;
    private final ascv p;
    private final ascv q;
    private final ascv r;
    private final ascv s;
    private final ascv t;
    private final zen u;
    private final ifq v;

    public zdi(arwe arweVar, Context context, @oqd armf armfVar, zdy zdyVar, ifq ifqVar, zen zenVar, armf armfVar2, zbk zbkVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        ascv T;
        arweVar.getClass();
        context.getClass();
        armfVar.getClass();
        zdyVar.getClass();
        ifqVar.getClass();
        zenVar.getClass();
        armfVar2.getClass();
        zbkVar.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        this.k = arweVar;
        this.a = context;
        this.b = zdyVar;
        this.v = ifqVar;
        this.u = zenVar;
        this.c = armfVar2;
        this.d = zbkVar;
        this.l = armfVar3;
        this.m = armfVar4;
        this.e = armfVar5;
        this.f = armfVar6;
        this.g = armfVar7;
        this.h = armfVar8;
        zcx zcxVar = new zcx(null);
        this.n = zcxVar;
        qkk qkkVar = new qkk(zdyVar.b(), this, 13);
        int i = ascp.a;
        ascv T2 = arrn.T(qkkVar, arweVar, asco.a(0L, 3), new zdu(null));
        this.o = T2;
        ascv ascvVar = ((zdt) armfVar3.b()).k;
        this.p = ascvVar;
        ascv ascvVar2 = ((zdo) armfVar4.b()).i;
        this.q = ascvVar2;
        ascv T3 = arrn.T(new jdn(new qkk(T2, this, 14), zenVar.e, new liz(this, 5, (boolean[]) null), 17, null), arweVar, asco.a(0L, 3), zcxVar);
        this.r = T3;
        ascv T4 = arrn.T(new jdn(new qkk(T2, this, 15), zenVar.e, new igb(this, (arpe) null, 18, (byte[]) null), 17, null), arweVar, asco.a(0L, 3), arnv.a);
        this.s = T4;
        ascv T5 = arrn.T(new jdn(new qkk(T2, this, 16), zenVar.e, new igb(this, (arpe) null, 17), 17, null), arweVar, asco.a(0L, 3), arnv.a);
        this.t = T5;
        if (((osb) armfVar6.b()).a()) {
            T = arrn.T(arrn.R(ascvVar, T3, T4, T5, ascvVar2, new zcy(this)), arweVar, asco.a(0L, 3), zcxVar);
        } else {
            T = arrn.T(arrn.Q(ascvVar, T3, T4, T5, new zca(this, 2, (char[]) null)), arweVar, asco.a(0L, 3), zcxVar);
        }
        this.i = T;
    }

    public static /* synthetic */ List g(zdi zdiVar, Pattern pattern, String str) {
        return zdiVar.f(pattern, str, 1, 0);
    }

    private final zdj h() {
        String string = this.a.getString(R.string.group_directory_header);
        string.getClass();
        return new zdj("group_header", new aesl(string));
    }

    public final zcx a(zdr zdrVar, zcx zcxVar, List list, List list2, List list3) {
        List x;
        if (((CharSequence) this.b.a().a()).length() != 0) {
            if (zdrVar.b == null && list.isEmpty() && list2.isEmpty()) {
                aron aronVar = new aron((byte[]) null);
                aronVar.addAll(zcxVar.b);
                if (!list3.isEmpty()) {
                    aronVar.add(h());
                    aronVar.addAll(list3);
                }
                x = aqjn.x(aronVar);
            } else {
                aron aronVar2 = new aron((byte[]) null);
                alvw d = j.d();
                d.X(alwp.a, "BugleContacts");
                ((alvg) d.h("com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl", "transformWithGroupChats", 264, "ContactSuggestionsAdapterImpl.kt")).q("combining personal, work and corp contact and group chat suggestions");
                if (zdrVar.a != null && zcxVar.b.isEmpty()) {
                    zdv zdvVar = zdrVar.a;
                    zdvVar.getClass();
                    aronVar2.add((zdj) zdvVar);
                } else {
                    zdv zdvVar2 = zdrVar.b;
                    if (zdvVar2 != null) {
                        aronVar2.add((zdj) zdvVar2);
                    }
                }
                aronVar2.addAll(zcxVar.b);
                if (!list3.isEmpty()) {
                    aronVar2.add(h());
                    aronVar2.addAll(list3);
                }
                if (!list.isEmpty() || !list2.isEmpty()) {
                    String string = this.a.getString(R.string.work_directory_header);
                    string.getClass();
                    aronVar2.add(new zdj("work_header", new aesl(string)));
                }
                aronVar2.addAll(list);
                aronVar2.addAll(list2);
                x = aqjn.x(aronVar2);
            }
            return new zcx(zcxVar.a, x, new kdt((Object) zcxVar, (Object) this, (Object) list3, 15, (byte[]) null), this.a.getString(R.string.a11y_contact_suggestions));
        }
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r9, java.util.regex.Pattern r10, defpackage.arpe r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.zcz
            if (r0 == 0) goto L13
            r0 = r11
            zcz r0 = (defpackage.zcz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zcz r0 = new zcz
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            java.lang.String r3 = "queryCorp"
            java.lang.String r4 = "com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl"
            java.lang.String r5 = "ContactSuggestionsAdapterImpl.kt"
            java.lang.String r6 = "BugleContacts"
            r7 = 1
            if (r2 == 0) goto L3b
            if (r2 != r7) goto L33
            java.util.regex.Pattern r10 = r0.e
            java.lang.String r9 = r0.d
            defpackage.aqil.P(r11)
            goto L84
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            defpackage.aqil.P(r11)
            int r11 = r9.length()
            if (r11 != 0) goto L4b
            zcv r9 = new zcv
            r10 = 0
            r9.<init>(r10)
            return r9
        L4b:
            alvi r11 = defpackage.zdi.j
            alvw r11 = r11.d()
            alvz r2 = defpackage.alwp.a
            r11.X(r2, r6)
            alvg r11 = (defpackage.alvg) r11
            alvz r2 = defpackage.ydl.D
            r11.X(r2, r9)
            r2 = 176(0xb0, float:2.47E-43)
            alvw r11 = r11.h(r4, r3, r2, r5)
            alvg r11 = (defpackage.alvg) r11
            java.lang.String r2 = "searching corp contacts"
            r11.q(r2)
            ifq r11 = r8.v
            mkd r11 = r11.b()
            akul r11 = r11.a(r9)
            r11.getClass()
            r0.d = r9
            r0.e = r10
            r0.c = r7
            java.lang.Object r11 = defpackage.arro.F(r11, r0)
            if (r11 != r1) goto L84
            return r1
        L84:
            alog r11 = (defpackage.alog) r11
            alvi r0 = defpackage.zdi.j
            alvw r0 = r0.d()
            alvz r1 = defpackage.alwp.a
            r0.X(r1, r6)
            alvg r0 = (defpackage.alvg) r0
            alvz r1 = defpackage.ydl.D
            r0.X(r1, r9)
            r1 = 179(0xb3, float:2.51E-43)
            alvw r0 = r0.h(r4, r3, r1, r5)
            alvg r0 = (defpackage.alvg) r0
            java.lang.String r1 = "finished searching corp contacts"
            r0.q(r1)
            zcv r0 = new zcv
            r11.getClass()
            r0.<init>(r9, r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdi.b(java.lang.String, java.util.regex.Pattern, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r10, java.util.regex.Pattern r11, defpackage.arpe r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.zda
            if (r0 == 0) goto L13
            r0 = r12
            zda r0 = (defpackage.zda) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zda r0 = new zda
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            java.lang.String r3 = "queryPersonal"
            java.lang.String r4 = "com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl"
            java.lang.String r5 = "ContactSuggestionsAdapterImpl.kt"
            java.lang.String r6 = "BugleContacts"
            r7 = 1
            if (r2 == 0) goto L41
            if (r2 != r7) goto L39
            ahqq r10 = r0.f
            java.util.regex.Pattern r11 = r0.e
            java.lang.String r0 = r0.d
            defpackage.aqil.P(r12)
            r8 = r12
            r12 = r10
            r10 = r0
            r0 = r8
            goto L97
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            defpackage.aqil.P(r12)
            int r12 = r10.length()
            if (r12 != 0) goto L51
            zdq r10 = new zdq
            r11 = 0
            r10.<init>(r11)
            return r10
        L51:
            alvi r12 = defpackage.zdi.j
            alvw r12 = r12.d()
            alvz r2 = defpackage.alwp.a
            r12.X(r2, r6)
            alvg r12 = (defpackage.alvg) r12
            alvz r2 = defpackage.ydl.D
            r12.X(r2, r10)
            r2 = 153(0x99, float:2.14E-43)
            alvw r12 = r12.h(r4, r3, r2, r5)
            alvg r12 = (defpackage.alvg) r12
            java.lang.String r2 = "searching personal contacts"
            r12.q(r2)
            armf r12 = r9.c
            java.lang.Object r12 = r12.b()
            ahqr r12 = (defpackage.ahqr) r12
            ahqq r12 = r12.d()
            ifq r2 = r9.v
            mkd r2 = r2.b()
            akul r2 = r2.b(r10)
            r2.getClass()
            r0.d = r10
            r0.e = r11
            r0.f = r12
            r0.c = r7
            java.lang.Object r0 = defpackage.arro.F(r2, r0)
            if (r0 == r1) goto Lc0
        L97:
            alog r0 = (defpackage.alog) r0
            alvi r1 = defpackage.zdi.j
            alvw r1 = r1.d()
            alvz r2 = defpackage.alwp.a
            r1.X(r2, r6)
            alvg r1 = (defpackage.alvg) r1
            alvz r2 = defpackage.ydl.D
            r1.X(r2, r10)
            r2 = 157(0x9d, float:2.2E-43)
            alvw r1 = r1.h(r4, r3, r2, r5)
            alvg r1 = (defpackage.alvg) r1
            java.lang.String r2 = "finished searching personal contacts"
            r1.q(r2)
            zdq r1 = new zdq
            r0.getClass()
            r1.<init>(r10, r0, r11, r12)
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdi.c(java.lang.String, java.util.regex.Pattern, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r9, java.util.regex.Pattern r10, defpackage.arpe r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.zdb
            if (r0 == 0) goto L13
            r0 = r11
            zdb r0 = (defpackage.zdb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zdb r0 = new zdb
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            java.lang.String r3 = "queryWork"
            java.lang.String r4 = "com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl"
            java.lang.String r5 = "ContactSuggestionsAdapterImpl.kt"
            java.lang.String r6 = "BugleContacts"
            r7 = 1
            if (r2 == 0) goto L3b
            if (r2 != r7) goto L33
            java.util.regex.Pattern r10 = r0.e
            java.lang.String r9 = r0.d
            defpackage.aqil.P(r11)
            goto L84
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            defpackage.aqil.P(r11)
            int r11 = r9.length()
            if (r11 != 0) goto L4b
            zcv r9 = new zcv
            r10 = 0
            r9.<init>(r10)
            return r9
        L4b:
            alvi r11 = defpackage.zdi.j
            alvw r11 = r11.d()
            alvz r2 = defpackage.alwp.a
            r11.X(r2, r6)
            alvg r11 = (defpackage.alvg) r11
            alvz r2 = defpackage.ydl.D
            r11.X(r2, r9)
            r2 = 165(0xa5, float:2.31E-43)
            alvw r11 = r11.h(r4, r3, r2, r5)
            alvg r11 = (defpackage.alvg) r11
            java.lang.String r2 = "searching work contacts"
            r11.q(r2)
            ifq r11 = r8.v
            mkd r11 = r11.b()
            akul r11 = r11.c(r9)
            r11.getClass()
            r0.d = r9
            r0.e = r10
            r0.c = r7
            java.lang.Object r11 = defpackage.arro.F(r11, r0)
            if (r11 != r1) goto L84
            return r1
        L84:
            alog r11 = (defpackage.alog) r11
            alvi r0 = defpackage.zdi.j
            alvw r0 = r0.d()
            alvz r1 = defpackage.alwp.a
            r0.X(r1, r6)
            alvg r0 = (defpackage.alvg) r0
            alvz r1 = defpackage.ydl.D
            r0.X(r1, r9)
            r1 = 168(0xa8, float:2.35E-43)
            alvw r0 = r0.h(r4, r3, r1, r5)
            alvg r0 = (defpackage.alvg) r0
            java.lang.String r1 = "finished searching work contacts"
            r0.q(r1)
            zcv r0 = new zcv
            r11.getClass()
            r0.<init>(r9, r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdi.d(java.lang.String, java.util.regex.Pattern, arpe):java.lang.Object");
    }

    public final zdp e(mkl mklVar, String str, zem zemVar, Pattern pattern) {
        return new zdp(str, new rqe(mklVar, zemVar, this, pattern, str, 3));
    }

    public final List f(Pattern pattern, String str, int i, int i2) {
        if (pattern == null) {
            return arnv.a;
        }
        Locale b = yhx.b(this.a);
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
