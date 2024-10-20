package defpackage;

import android.content.Intent;
import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rte extends rtu {
    public final Uri a;
    public final String b;
    private final String d;
    private final long e;
    private final String f;
    private final long g;
    private final msh h;
    private final boolean i;
    private final Optional j = Optional.empty();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rte(defpackage.qya r4, defpackage.msk r5, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r6) {
        /*
            r3 = this;
            j$.util.Optional r0 = j$.util.Optional.empty()
            r3.<init>()
            r3.j = r0
            android.net.Uri r4 = r4.a(r6)
            r3.a = r4
            long r0 = r6.s()
            r3.e = r0
            java.lang.String r4 = r6.N()
            r3.f = r4
            long r0 = r6.t()
            r3.g = r0
            msh r4 = r5.q(r6)
            r3.h = r4
            boolean r5 = defpackage.vcp.k(r6)
            r3.i = r5
            r6.A()
            java.lang.String r0 = r6.L()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L7e
            boolean r0 = defpackage.oez.a()
            if (r0 == 0) goto L6c
            java.lang.String r0 = "profiles_table_join_tag"
            boolean r2 = r6.as(r0)
            if (r2 == 0) goto L66
            java.lang.Class<com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable$BindData> r2 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable.BindData.class
            aglz r0 = r6.al(r0, r2)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable$BindData r0 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable.BindData) r0
            if (r0 == 0) goto L66
            java.lang.String r2 = r0.l()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L66
            java.lang.String r0 = r0.l()
            java.lang.String r0 = defpackage.vom.b(r0)
            goto L67
        L66:
            r0 = r1
        L67:
            if (r0 == 0) goto L6c
            r3.d = r0
            goto L6e
        L6c:
            r3.d = r1
        L6e:
            if (r5 == 0) goto L77
            msf r4 = r4.F()
            java.lang.String r4 = r4.a
            goto L7b
        L77:
            java.lang.String r4 = defpackage.rxn.m(r6)
        L7b:
            r3.b = r4
            return
        L7e:
            java.lang.String r4 = r6.L()
            r3.b = r4
            boolean r4 = defpackage.rxn.p(r6)
            if (r4 == 0) goto L8b
            goto L8f
        L8b:
            java.lang.String r1 = r6.P()
        L8f:
            r3.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rte.<init>(qya, msk, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData):void");
    }

    @Override // defpackage.rtu
    public final long a() {
        return this.e;
    }

    @Override // defpackage.rtu
    public final long b() {
        return this.g;
    }

    @Override // defpackage.rtu
    public final Intent c() {
        return null;
    }

    @Override // defpackage.rtu
    public final Uri d() {
        return this.a;
    }

    @Override // defpackage.rtu
    public final Optional j() {
        return Optional.of(this.h);
    }

    @Override // defpackage.rtu
    public final Optional k() {
        return this.j;
    }

    @Override // defpackage.rtu
    public final String l() {
        return this.d;
    }

    @Override // defpackage.rtu
    public final String m() {
        return this.b;
    }

    @Override // defpackage.rtu
    public final String n() {
        return this.f;
    }
}
