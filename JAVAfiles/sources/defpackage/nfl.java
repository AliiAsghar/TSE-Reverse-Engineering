package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfl {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactDataServiceImpl");
    private static final ahka f = new ahka("RecipientSyncDestinationMatchLatency");
    public final armf b;
    public final armf c;
    public final arwe d;
    public final armf e;
    private final msk g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;

    public nfl(msk mskVar, armf armfVar, armf armfVar2, @oqd armf armfVar3, armf armfVar4, arwe arweVar, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10) {
        mskVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        arweVar.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        this.g = mskVar;
        this.b = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.c = armfVar4;
        this.d = arweVar;
        this.e = armfVar5;
        this.j = armfVar6;
        this.k = armfVar7;
        this.l = armfVar8;
        this.m = armfVar9;
        this.n = armfVar10;
    }

    public static final String h(qlr qlrVar) {
        String str = qlrVar.j;
        if (str == null) {
            return qlrVar.l;
        }
        return str;
    }

    public static final List i(Collection collection) {
        return aqjn.au(collection, new lvh(7));
    }

    public static final List j(List list, int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                tbb f2 = ParticipantsTable.f();
                f2.aj("updateContactInfo");
                f2.M(new nfc(list, 6));
                f2.i(-2L);
                f2.x();
                f2.h();
                f2.K(0);
                f2.l(-1L);
                f2.r();
                f2.p();
                f2.z(vox.PROFILE_UNSPECIFIED_SOURCE);
                f2.C(vox.PROFILE_UNSPECIFIED_SOURCE);
                f2.k();
                f2.E();
                f2.j();
                f2.ah();
                alog a2 = f2.a().a();
                a2.getClass();
                return a2;
            }
            tbb f3 = ParticipantsTable.f();
            f3.aj("updateContactInfo");
            f3.M(new nfc(list, 5));
            f3.i(-2L);
            f3.x();
            f3.h();
            f3.K(0);
            f3.l(-1L);
            f3.r();
            f3.p();
            f3.z(vox.PROFILE_UNSPECIFIED_SOURCE);
            f3.k();
            f3.j();
            f3.ah();
            alog a3 = f3.a().a();
            a3.getClass();
            return a3;
        }
        tbb f4 = ParticipantsTable.f();
        f4.aj("updateContactInfo");
        f4.M(new nfc(list, 4));
        f4.i(-2L);
        f4.ah();
        alog a4 = f4.a().a();
        a4.getClass();
        return a4;
    }

    private static final Uri k(qlr qlrVar) {
        Uri uri = qlrVar.p;
        Uri uri2 = null;
        if (uri != null) {
            Integer num = qlrVar.q;
            if (num != null) {
                uri2 = uri.buildUpon().appendQueryParameter("photoIdTag", String.valueOf(num.intValue())).build();
            }
            if (uri2 == null) {
                return uri;
            }
        }
        return uri2;
    }

    private final void l(int i, int i2) {
        ((mbl) this.c.b()).f("Bugle.Recipient.Sync.Result.Count", i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfl.a(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.Set r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.nfg
            if (r0 == 0) goto L13
            r0 = r6
            nfg r0 = (defpackage.nfg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            nfg r0 = new nfg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r6)
            r0.c = r3
            java.lang.Object r6 = r4.d(r5, r0)
            if (r6 == r1) goto L70
        L3a:
            java.util.List r6 = (java.util.List) r6
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L45:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r1 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r1
            long r1 = r1.s()
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            java.lang.Object r1 = r5.get(r3)
            if (r1 != 0) goto L69
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.put(r3, r1)
        L69:
            java.util.List r1 = (java.util.List) r1
            r1.add(r0)
            goto L45
        L6f:
            return r5
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfl.b(java.util.Set, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6 A[Catch: all -> 0x003e, TryCatch #5 {all -> 0x003e, blocks: (B:11:0x0037, B:13:0x00d1, B:14:0x00e0, B:16:0x00e6, B:17:0x0105, B:19:0x010b, B:21:0x0123, B:23:0x0129, B:24:0x012d, B:26:0x0133), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0133 A[Catch: all -> 0x003e, LOOP:2: B:24:0x012d->B:26:0x0133, LOOP_END, TRY_LEAVE, TryCatch #5 {all -> 0x003e, blocks: (B:11:0x0037, B:13:0x00d1, B:14:0x00e0, B:16:0x00e6, B:17:0x0105, B:19:0x010b, B:21:0x0123, B:23:0x0129, B:24:0x012d, B:26:0x0133), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.alog r17, java.util.Map r18, java.util.List r19, defpackage.arpe r20) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfl.c(alog, java.util.Map, java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.Set r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.nfi
            if (r0 == 0) goto L13
            r0 = r7
            nfi r0 = (defpackage.nfi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            nfi r0 = new nfi
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L58
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.aqil.P(r7)
            taz r7 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.e()
            java.lang.String r2 = "getRecipientsByContactIdsQuery"
            r7.w(r2)
            nfc r2 = new nfc
            r4 = 3
            r2.<init>(r6, r4)
            r7.g(r2)
            tay r6 = r7.b()
            akul r6 = r6.s()
            r6.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.arro.F(r6, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfl.d(java.util.Set, arpe):java.lang.Object");
    }

    public final Object e(alog alogVar, alog alogVar2, arpe arpeVar) {
        ArrayList arrayList = new ArrayList();
        ((lgg) this.j.b()).g(new iqp(alogVar, alogVar2, arrayList, 5, (char[]) null));
        ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(qjh.e((akul) it.next()));
        }
        Object j = arrj.j(arrayList2, arpeVar);
        if (j == arpl.a) {
            return j;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.util.Map r18, defpackage.nfe r19, defpackage.arpe r20) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfl.f(java.util.Map, nfe, arpe):java.lang.Object");
    }

    public final void g(nfe nfeVar) {
        int i = nfeVar.d;
        if (i > 0) {
            l(5, i);
            if (nfeVar.d >= ((int) ((Number) this.k.b()).longValue())) {
                l(6, 1);
            }
        }
        int i2 = nfeVar.c;
        if (i2 > 0) {
            l(4, i2);
        }
        int i3 = nfeVar.a;
        if (i3 > 0) {
            l(3, i3);
        }
        int i4 = nfeVar.b;
        if (i4 > 0) {
            int i5 = ((nfeVar.c + nfeVar.a) + i4) - nfeVar.e;
            int i6 = i4 - i5;
            if (i6 > 0) {
                l(2, i6);
            }
            if (i5 > 0) {
                l(1, i5);
            }
        }
        int i7 = nfeVar.f;
        if (i7 > 0) {
            l(7, i7);
        }
        int i8 = nfeVar.g;
        if (i8 > 0) {
            l(8, i8);
        }
    }
}
