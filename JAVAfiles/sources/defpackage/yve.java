package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yve {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/video/BugleVideoCallingReachabilityUpdater");
    public final armf b;
    private final arwe c;
    private final armf d;
    private final armf e;
    private final xnv f;
    private final osz g;
    private final armf h;
    private final armf i;
    private final afxz j;

    public yve(afxz afxzVar, arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, xnv xnvVar, osz oszVar, armf armfVar4, armf armfVar5) {
        afxzVar.getClass();
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        xnvVar.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.j = afxzVar;
        this.c = arweVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.b = armfVar3;
        this.f = xnvVar;
        this.g = oszVar;
        this.h = armfVar4;
        this.i = armfVar5;
    }

    private final void d(List list, int i, Iterable iterable) {
        ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ParticipantsTable.BindData) it.next()).M());
        }
        Set aE = aqjn.aE(arrayList);
        tbb f = ParticipantsTable.f();
        f.aj("updateAvailabilityInDb");
        f.K(i);
        f.M(new yuq(aE, iterable, 4));
        f.a().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.yvc
            if (r0 == 0) goto L13
            r0 = r10
            yvc r0 = (defpackage.yvc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            yvc r0 = new yvc
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r9 = r0.a
            yve r0 = r0.e
            defpackage.aqil.P(r10)
            goto L6a
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.a
            yve r2 = r0.e
            defpackage.aqil.P(r10)
            goto L51
        L3f:
            defpackage.aqil.P(r10)
            afxz r10 = r8.j
            r0.e = r8
            r0.a = r9
            r0.d = r5
            java.lang.Object r10 = defpackage.yvm.a(r10, r0)
            if (r10 == r1) goto Lb0
            r2 = r8
        L51:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 == 0) goto Laf
            if (r10 == r5) goto L92
            if (r10 == r4) goto L92
            r0.e = r2
            r0.a = r9
            r0.d = r4
            java.lang.Object r10 = r2.b(r9, r0)
            if (r10 == r1) goto L91
            r0 = r2
        L6a:
            java.lang.Integer r10 = new java.lang.Integer
            r1 = 11
            r10.<init>(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r2 = 12
            r1.<init>(r2)
            java.lang.Integer r2 = new java.lang.Integer
            r6 = 7
            r2.<init>(r6)
            r7 = 3
            java.lang.Integer[] r7 = new java.lang.Integer[r7]
            r7[r3] = r10
            r7[r5] = r1
            r7[r4] = r2
            java.util.List r10 = defpackage.aqjn.B(r7)
            r0.d(r9, r6, r10)
            arnv r9 = defpackage.arnv.a
            goto Laf
        L91:
            return r1
        L92:
            java.lang.Integer r10 = new java.lang.Integer
            r0 = 10
            r10.<init>(r0)
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 8
            r0.<init>(r1)
            java.lang.Integer[] r4 = new java.lang.Integer[r4]
            r4[r3] = r10
            r4[r5] = r0
            java.util.List r10 = defpackage.aqjn.B(r4)
            r2.d(r9, r1, r10)
            arnv r9 = defpackage.arnv.a
        Laf:
            return r9
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yve.a(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a7 -> B:12:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yve.b(java.util.List, arpe):java.lang.Object");
    }

    public final void c(List list) {
        list.getClass();
        if (!((Boolean) yvr.a.e()).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((msk) this.e.b()).q((ParticipantsTable.BindData) obj).q()) {
                arrayList.add(obj);
            }
        }
        qjh.l(this.c, null, new yqs(arrayList, this, (arpe) null, 11), 3);
    }
}
