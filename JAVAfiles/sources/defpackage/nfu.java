package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfu implements nfx {
    public final arwe a;
    public final nfv b;
    public final osp c;
    public final tay d;
    public final lig e;
    public final jat f;
    private final anen g;
    private final arwe h;
    private final armf i;
    private final armf j;
    private final Optional k;
    private final armf l;
    private final ncq m;
    private final ncq n;
    private final tay o;
    private final ncq p;

    public nfu(anen anenVar, arwe arweVar, arwe arweVar2, nfv nfvVar, kor korVar, lig ligVar, armf armfVar, armf armfVar2, Optional optional, @oqd armf armfVar3, armf armfVar4, jat jatVar, osp ospVar) {
        ncq ncsVar;
        anenVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        korVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        jatVar.getClass();
        ospVar.getClass();
        this.g = anenVar;
        this.a = arweVar;
        this.h = arweVar2;
        this.b = nfvVar;
        this.e = ligVar;
        this.i = armfVar;
        this.j = armfVar2;
        this.k = optional;
        this.l = armfVar3;
        this.f = jatVar;
        this.c = ospVar;
        taz e = ParticipantsTable.e();
        e.w("selfParticipantsQuery");
        e.q();
        e.g(new ndz(16));
        tar tarVar = ParticipantsTable.c;
        e.h(new atkn((Object) tarVar.m, true), new atkn((Object) tarVar.g, true));
        this.d = e.b();
        nco u = korVar.u(((ndm) armfVar.b()).a(eif.s, new nfr(this, 0)));
        u.getClass();
        this.m = u;
        if (((oqa) armfVar4.b()).a()) {
            Object b = armfVar3.b();
            b.getClass();
            if (((Boolean) b).booleanValue()) {
                ncsVar = korVar.u(((ndm) armfVar2.b()).a(eif.r, new nfr(this, 1)));
                ncsVar.getClass();
                this.n = ncsVar;
                taz e2 = ParticipantsTable.e();
                e2.w("selfParticipantsQueryWithProfiles");
                e2.q();
                e2.g(new ndz(17));
                tar tarVar2 = ParticipantsTable.c;
                e2.h(new atkn((Object) tarVar2.m, true), new atkn((Object) tarVar2.g, true));
                agog b2 = agoh.b(ProfilesTable.a().b(), (agmh) ProfilesTable.c.b, ParticipantsTable.c.a);
                b2.f = "profiles_table_join_tag";
                e2.D(b2.a());
                e2.t(ParticipantsTable.c.a);
                this.o = e2.b();
                nco u2 = korVar.u(new ncs(u, new ndd(this, 9), anenVar));
                u2.getClass();
                this.p = u2;
                u2.a(new mmb(4));
            }
        }
        ncsVar = new ncs(u, new ndd(this, 8), anenVar);
        this.n = ncsVar;
        taz e22 = ParticipantsTable.e();
        e22.w("selfParticipantsQueryWithProfiles");
        e22.q();
        e22.g(new ndz(17));
        tar tarVar22 = ParticipantsTable.c;
        e22.h(new atkn((Object) tarVar22.m, true), new atkn((Object) tarVar22.g, true));
        agog b22 = agoh.b(ProfilesTable.a().b(), (agmh) ProfilesTable.c.b, ParticipantsTable.c.a);
        b22.f = "profiles_table_join_tag";
        e22.D(b22.a());
        e22.t(ParticipantsTable.c.a);
        this.o = e22.b();
        nco u22 = korVar.u(new ncs(u, new ndd(this, 9), anenVar));
        u22.getClass();
        this.p = u22;
        u22.a(new mmb(4));
    }

    @Override // defpackage.nfx
    public final ncq a() {
        return this.p;
    }

    @Override // defpackage.nfx
    public final ncq b() {
        return this.n;
    }

    @Override // defpackage.nfx
    public final akul c(SelfIdentityId selfIdentityId) {
        akul c;
        selfIdentityId.getClass();
        akrh e = aktp.e("SelfIdentityRepository#getSelfIdentityById");
        try {
            c = qjh.c(this.h, arpj.a, arwf.a, new naw(this, selfIdentityId, (arpe) null, 5));
            armd.i(e, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.nfx
    public final akul d() {
        akul c;
        akrh e = aktp.e("SelfIdentityRepository#getSelfIdentityForCreatingNewConversationsOrPreservingLegacyBugsNoOtherReason");
        try {
            c = qjh.c(this.a, arpj.a, arwf.a, new mwv(this, (arpe) null, 6, (byte[]) null));
            armd.i(e, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.nfx
    public final akul e(SelfIdentityId selfIdentityId, msh mshVar) {
        akul c;
        selfIdentityId.getClass();
        mshVar.getClass();
        akrh e = aktp.e("SelfIdentityRepository#setMsisdn");
        try {
            c = qjh.c(this.h, arpj.a, arwf.a, new jyw(this, selfIdentityId, mshVar, (arpe) null, 20));
            armd.i(e, null);
            return c;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.nfs
            if (r0 == 0) goto L13
            r0 = r8
            nfs r0 = (defpackage.nfs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            nfs r0 = new nfs
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r8)
            goto L43
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.aqil.P(r8)
            ncq r8 = r7.p
            akul r8 = r8.b()
            r8.getClass()
            r0.c = r3
            java.lang.Object r8 = defpackage.arro.F(r8, r0)
            if (r8 == r1) goto L76
        L43:
            alog r8 = (defpackage.alog) r8
            r8.getClass()
            java.util.Iterator r0 = r8.iterator()
            r1 = 0
            r2 = 0
            r4 = r1
        L4f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r0.next()
            r6 = r5
            nfw r6 = (defpackage.nfw) r6
            boolean r6 = r6.p()
            if (r6 == 0) goto L4f
            if (r2 == 0) goto L65
            goto L6c
        L65:
            r2 = r3
            r4 = r5
            goto L4f
        L68:
            if (r2 != 0) goto L6b
            goto L6c
        L6b:
            r1 = r4
        L6c:
            nfw r1 = (defpackage.nfw) r1
            if (r1 == 0) goto L71
            return r1
        L71:
            java.lang.Object r8 = defpackage.aqjn.Z(r8)
            return r8
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfu.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:12:0x0034, B:13:0x00cf, B:14:0x00d9, B:15:0x0083, B:17:0x008a, B:19:0x0096, B:21:0x00a0, B:23:0x00a4, B:25:0x00ac, B:30:0x00d5, B:32:0x00e6, B:39:0x0048, B:40:0x006c, B:42:0x0055), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:12:0x0034, B:13:0x00cf, B:14:0x00d9, B:15:0x0083, B:17:0x008a, B:19:0x0096, B:21:0x00a0, B:23:0x00a4, B:25:0x00ac, B:30:0x00d5, B:32:0x00e6, B:39:0x0048, B:40:0x006c, B:42:0x0055), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00cb -> B:13:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfu.g(arpe):java.lang.Object");
    }
}
