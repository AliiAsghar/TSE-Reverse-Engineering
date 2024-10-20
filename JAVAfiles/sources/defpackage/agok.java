package defpackage;

import android.content.ContentValues;
import j$.util.function.Predicate$CC;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agok implements Predicate {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ agok(adwp adwpVar, String str, ContentValues contentValues, int i) {
        this.d = i;
        this.a = adwpVar;
        this.b = str;
        this.c = contentValues;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        if (this.d != 0) {
            return Predicate$CC.$default$and(this, predicate);
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo407negate() {
        if (this.d != 0) {
            return Predicate$CC.$default$negate(this);
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        if (this.d != 0) {
            return Predicate$CC.$default$or(this, predicate);
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Set, java.lang.Object] */
    @Override // java.util.function.Predicate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean test(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L44
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r6 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r6
            mss r0 = new mss
            r3 = 20
            r0.<init>(r3)
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r5.a
            java.lang.Object r3 = r5.c
            rul r3 = (defpackage.rul) r3
            armf r3 = r3.i
            java.lang.Object r3 = r3.b()
            msk r3 = (defpackage.msk) r3
            msh r6 = r3.q(r6)
            alpt r0 = (defpackage.alpt) r0
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L43
            goto L42
        L36:
            java.lang.Object r0 = r5.b
            java.lang.String r6 = r6.O()
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L43
        L42:
            return r1
        L43:
            return r2
        L44:
            agoz r6 = (defpackage.agoz) r6
            java.lang.Object r0 = r5.b
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r6.H(r0)
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r5.c
            java.lang.Object r4 = r5.a
            adwp r4 = (defpackage.adwp) r4
            android.content.ContentValues r3 = (android.content.ContentValues) r3
            boolean r6 = r4.k(r0, r3, r6)
            if (r6 != 0) goto L5f
            return r1
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agok.test(java.lang.Object):boolean");
    }

    public /* synthetic */ agok(rul rulVar, alpt alptVar, Set set, int i) {
        this.d = i;
        this.c = rulVar;
        this.a = alptVar;
        this.b = set;
    }
}
