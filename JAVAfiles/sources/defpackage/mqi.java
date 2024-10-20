package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqi implements mpy {
    public static final /* synthetic */ int c = 0;
    private static final uuf d = uuh.n(uuh.b, "use_guessed_min_match_value", false);
    public final armf a;
    public final armf b;
    private final Context e;
    private final arwe f;
    private final arwe g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final Locale l;
    private final alwo m;

    public mqi(Context context, arwe arweVar, arwe arweVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        context.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        this.e = context;
        this.f = arweVar;
        this.g = arweVar2;
        this.a = armfVar;
        this.b = armfVar2;
        this.h = armfVar3;
        this.i = armfVar4;
        this.j = armfVar5;
        this.k = armfVar6;
        this.l = yhx.b(context);
        this.m = alwo.o("BugleConversation");
    }

    private final akul f(alog alogVar, Optional optional, boolean z, boolean z2, Integer num) {
        akul c2;
        akrh e = aktp.e("ConversationSearcherImpl#findConversationExactMatch");
        try {
            ArrayList arrayList = new ArrayList(aqjn.J(alogVar, 10));
            Iterator<E> it = alogVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((Recipient) it.next()).f());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String m = ((msh) it2.next()).m();
                if (m != null) {
                    arrayList2.add(m);
                }
            }
            alog aZ = alzz.aZ(arrayList2);
            ((alwl) this.m.d()).u("requiredDestination size is: %s, requiredRecipient size is: %s", aZ.size(), alogVar.size());
            if (!aZ.isEmpty()) {
                c2 = qjh.c(this.f, arpj.a, arwf.a, new mqe(this, aZ, optional, z, z2, num, null));
                armd.i(e, null);
                return c2;
            }
            ((alwl) this.m.i()).q("Unable to findConversationExactMatch: Empty destination list.");
            akul af = aktp.af(new IllegalArgumentException("Unable to findConversationExactMatch: Empty destination list."));
            af.getClass();
            armd.i(e, null);
            return af;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.mpy
    public final akul a(mqy mqyVar) {
        akrh e;
        akul c2;
        akul c3;
        int i = mqyVar.f - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return f(mqyVar.a, mqyVar.c, mqyVar.d, false, null);
                }
                alog alogVar = mqyVar.a;
                e = aktp.e("ConversationSearcherImpl#findConversationBestMatch");
                try {
                    if (alogVar.isEmpty()) {
                        ((alwl) this.m.i()).q("Unable to findConversationBestMatch: Empty recipient list.");
                        akul af = aktp.af(new IllegalArgumentException("Unable to findConversationBestMatch: Empty recipient list."));
                        af.getClass();
                        armd.i(e, null);
                        return af;
                    }
                    ArrayList arrayList = new ArrayList(aqjn.J(alogVar, 10));
                    Iterator<E> it = alogVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Recipient) it.next()).f());
                    }
                    List ak = aqjn.ak(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : ak) {
                        ((msh) obj).n();
                        arrayList2.add(obj);
                    }
                    c3 = qjh.c(this.g, arpj.a, arwf.a, new lgp(((qpj) this.h.b()).i(alzz.aZ(arrayList2)), (arpe) null, 20));
                    armd.i(e, null);
                    return c3;
                } finally {
                }
            } else {
                alog alogVar2 = mqyVar.a;
                alog alogVar3 = mqyVar.b;
                Optional optional = mqyVar.c;
                boolean z = mqyVar.d;
                Integer num = mqyVar.e;
                e = aktp.e("ConversationSearcherImpl#findConversationPartialMatch");
                try {
                    ArrayList arrayList3 = new ArrayList(aqjn.J(alogVar2, 10));
                    Iterator<E> it2 = alogVar2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((Recipient) it2.next()).f());
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        String m = ((msh) it3.next()).m();
                        if (m != null) {
                            arrayList4.add(m);
                        }
                    }
                    alog aZ = alzz.aZ(arrayList4);
                    ArrayList arrayList5 = new ArrayList(aqjn.J(alogVar3, 10));
                    Iterator<E> it4 = alogVar3.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(((Recipient) it4.next()).f());
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        String m2 = ((msh) it5.next()).m();
                        if (m2 != null) {
                            arrayList6.add(m2);
                        }
                    }
                    alog aZ2 = alzz.aZ(arrayList6);
                    ((alwl) this.m.d()).K("requiredDestination size is: %s, requiredRecipient size is: %s, optionalDestination size is: %s, optionalRecipient size is: %s", Integer.valueOf(aZ.size()), Integer.valueOf(alogVar2.size()), Integer.valueOf(aZ2.size()), Integer.valueOf(alogVar3.size()));
                    if (!aZ.isEmpty() || !aZ2.isEmpty() || optional.isPresent()) {
                        c2 = qjh.c(this.f, arpj.a, arwf.a, new mqf(this, aZ, aZ2, optional, z, num, null));
                        armd.i(e, null);
                        return c2;
                    }
                    ((alwl) this.m.i()).q("Unable to findConversationPartialMatch: Empty destination list and name.");
                    akul af2 = aktp.af(new IllegalArgumentException("Unable to findConversationPartialMatch: Empty destination list and name."));
                    af2.getClass();
                    armd.i(e, null);
                    return af2;
                } finally {
                }
            }
        } else {
            return f(mqyVar.a, mqyVar.c, mqyVar.d, true, mqyVar.e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r6 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        if (r6 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.mqg
            if (r0 == 0) goto L13
            r0 = r6
            mqg r0 = (defpackage.mqg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mqg r0 = new mqg
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r6)
            goto L9d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.aqil.P(r6)
            goto L61
        L36:
            defpackage.aqil.P(r6)
            uuf r6 = defpackage.mqi.d
            java.lang.Object r6 = r6.e()
            r6.getClass()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L8e
            armf r6 = r5.k
            java.lang.Object r6 = r6.b()
            qqx r6 = (defpackage.qqx) r6
            akul r6 = r6.a()
            r6.getClass()
            r0.c = r4
            java.lang.Object r6 = defpackage.arro.F(r6, r0)
            if (r6 == r1) goto La1
        L61:
            r6.getClass()
            j$.util.Optional r6 = (j$.util.Optional) r6
            boolean r0 = r6.isPresent()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r6.get()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 6
            if (r0 < r1) goto L84
            java.lang.Object r6 = r6.get()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L88
        L84:
            int r6 = defpackage.qqs.a()
        L88:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r6)
            return r0
        L8e:
            akul r6 = defpackage.qqs.b()
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.arro.F(r6, r0)
            if (r6 == r1) goto La1
        L9d:
            r6.getClass()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqi.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (defpackage.d.F(r6, r7) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003d, code lost:
    
        if (r5 == r10.size()) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r5, defpackage.alpt r6, java.lang.String r7, int r8, boolean r9, defpackage.alog r10, j$.util.Optional r11, int r12, boolean r13) {
        /*
            r4 = this;
            java.lang.String r0 = "ConversationSearcherImpl#isExactMatch"
            akrh r0 = defpackage.aktp.e(r0)
            j$.util.stream.Stream r1 = j$.util.Collection.EL.stream(r10)     // Catch: java.lang.Throwable -> L89
            mqh r2 = new mqh     // Catch: java.lang.Throwable -> L89
            r3 = 0
            r2.<init>(r4, r6, r12, r3)     // Catch: java.lang.Throwable -> L89
            isg r6 = new isg     // Catch: java.lang.Throwable -> L89
            r12 = 12
            r6.<init>(r2, r12)     // Catch: java.lang.Throwable -> L89
            boolean r6 = r1.allMatch(r6)     // Catch: java.lang.Throwable -> L89
            armf r12 = r4.b     // Catch: java.lang.Throwable -> L89
            java.lang.Object r12 = r12.b()     // Catch: java.lang.Throwable -> L89
            okf r12 = (defpackage.okf) r12     // Catch: java.lang.Throwable -> L89
            boolean r12 = r12.a()     // Catch: java.lang.Throwable -> L89
            r1 = 1
            if (r12 == 0) goto L37
            r12 = 2
            if (r8 != r12) goto L37
            if (r6 == 0) goto L41
            int r6 = r10.size()     // Catch: java.lang.Throwable -> L89
            int r6 = r6 + r1
            if (r5 != r6) goto L41
            goto L3f
        L37:
            if (r6 == 0) goto L41
            int r6 = r10.size()     // Catch: java.lang.Throwable -> L89
            if (r5 != r6) goto L41
        L3f:
            r5 = r1
            goto L42
        L41:
            r5 = r3
        L42:
            if (r13 != 0) goto L46
        L44:
            r9 = r1
            goto L7f
        L46:
            java.lang.String r6 = ""
            java.lang.Object r6 = r11.orElse(r6)     // Catch: java.lang.Throwable -> L89
            r6.getClass()     // Catch: java.lang.Throwable -> L89
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Throwable -> L89
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L89
            if (r6 <= 0) goto L7f
            if (r7 == 0) goto L7e
            java.util.Locale r6 = r4.l     // Catch: java.lang.Throwable -> L89
            r6.getClass()     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = r7.toLowerCase(r6)     // Catch: java.lang.Throwable -> L89
            r6.getClass()     // Catch: java.lang.Throwable -> L89
            java.lang.Object r7 = r11.get()     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L89
            java.util.Locale r8 = r4.l     // Catch: java.lang.Throwable -> L89
            r8.getClass()     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = r7.toLowerCase(r8)     // Catch: java.lang.Throwable -> L89
            r7.getClass()     // Catch: java.lang.Throwable -> L89
            boolean r6 = defpackage.d.F(r6, r7)     // Catch: java.lang.Throwable -> L89
            if (r6 == 0) goto L7e
            goto L44
        L7e:
            r9 = r3
        L7f:
            if (r5 == 0) goto L84
            if (r9 == 0) goto L84
            r3 = r1
        L84:
            r5 = 0
            defpackage.armd.i(r0, r5)
            return r3
        L89:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L8b
        L8b:
            r6 = move-exception
            defpackage.armd.i(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqi.c(int, alpt, java.lang.String, int, boolean, alog, j$.util.Optional, int, boolean):boolean");
    }

    public final boolean d(alpt alptVar, String str, alog alogVar, alog alogVar2, Optional optional, int i) {
        akrh e = aktp.e("ConversationSearcherImpl#isPartiallMatch");
        try {
            if (Collection.EL.stream(alogVar).allMatch(new isg(new mqh(this, alptVar, i, 2), 10))) {
                if (alogVar2.isEmpty() && optional.isEmpty()) {
                    armd.i(e, null);
                    return true;
                }
                if (!alogVar2.isEmpty() && Collection.EL.stream(alogVar2).anyMatch(new isg(new mqh(this, alptVar, i, 3), 11))) {
                    armd.i(e, null);
                    return true;
                }
                if (optional.isPresent() && str != null) {
                    Locale locale = this.l;
                    locale.getClass();
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    String str2 = (String) optional.get();
                    Locale locale2 = this.l;
                    locale2.getClass();
                    String lowerCase2 = str2.toLowerCase(locale2);
                    lowerCase2.getClass();
                    if (arsd.O(lowerCase, lowerCase2)) {
                        armd.i(e, null);
                        return true;
                    }
                }
            }
            armd.i(e, null);
            return false;
        } finally {
        }
    }

    public final boolean e(alpt alptVar, String str, int i) {
        akrh e = aktp.e("ConversationSearcherImpl#isParticipantsIncluding");
        try {
            aluq listIterator = alptVar.listIterator();
            while (listIterator.hasNext()) {
                if (((qqs) this.j.b()).f((String) listIterator.next(), str, i, ((yjs) this.i.b()).a()) != 4) {
                    armd.i(e, null);
                    return true;
                }
            }
            armd.i(e, null);
            return false;
        } finally {
        }
    }
}
