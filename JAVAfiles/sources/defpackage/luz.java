package defpackage;

import android.content.Context;
import j$.time.Instant;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class luz {
    public static final lgc g = new lgc();
    private static final alwo h = alwo.o("BugleBackup");
    public final arpi a;
    public final armf b;
    public final xnv c;
    public final arwe d;
    public final Context e;
    public final armf f;
    private final armf i;
    private final armf j;

    public luz(arpi arpiVar, armf armfVar, xnv xnvVar, arwe arweVar, Context context, armf armfVar2, armf armfVar3, armf armfVar4, arwe arweVar2) {
        arpiVar.getClass();
        armfVar.getClass();
        xnvVar.getClass();
        arweVar.getClass();
        context.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        arweVar2.getClass();
        this.a = arpiVar;
        this.b = armfVar;
        this.c = xnvVar;
        this.d = arweVar;
        this.e = context;
        this.i = armfVar2;
        this.f = armfVar3;
        this.j = armfVar4;
    }

    public static final long n(UUID uuid) {
        tim a = tip.a();
        a.c(new lut(uuid, 1));
        tie tieVar = (tie) ((tij) a.b().n()).cO();
        if (tieVar != null) {
            return tieVar.h();
        }
        throw new IllegalArgumentException(a.cc(uuid, "restore execution with sessionId [", "] does not exist"));
    }

    public static final luq o(tie tieVar) {
        tieVar.ao(1, "session_id");
        Object orElseThrow = tieVar.b.orElseThrow();
        orElseThrow.getClass();
        lwr l = tieVar.l();
        l.getClass();
        tieVar.ao(2, "feature");
        lwz lwzVar = tieVar.c;
        lwzVar.getClass();
        tieVar.ao(4, "start_time");
        Instant instant = tieVar.e;
        instant.getClass();
        tieVar.ao(5, "finish_time");
        Instant instant2 = tieVar.f;
        lwp k = tieVar.k();
        tieVar.ao(7, "initial_messages_version");
        long j = tieVar.h;
        tieVar.ao(8, "status_timestamp");
        Instant instant3 = tieVar.i;
        instant3.getClass();
        tieVar.ao(9, "last_attachment_request_timestamp");
        Instant instant4 = tieVar.j;
        instant4.getClass();
        return new luq((UUID) orElseThrow, lwzVar, l, instant, instant2, k, j, instant3, instant4);
    }

    public static final boolean q(tie tieVar) {
        if (tieVar.l().compareTo(lwr.COMPLETE_SUCCESS) < 0) {
            return true;
        }
        return false;
    }

    public static final void r(tio tioVar) {
        int i;
        lwr lwrVar = lwr.COMPLETE_SUCCESS;
        if (lwrVar == null) {
            i = 0;
        } else {
            i = lwrVar.p;
        }
        tioVar.U(new agoi("restore_workflow_executions.status", 9, Integer.valueOf(i)));
    }

    public final Object a(UUID uuid, lwq lwqVar, arpe arpeVar) {
        if (lwqVar.c == 3) {
            Object q = arro.q(this.a, new gci(this, uuid, lwqVar, (arpe) null, 16), arpeVar);
            if (q == arpl.a) {
                return q;
            }
            return arnb.a;
        }
        throw new IllegalArgumentException("attachmentMetadata must contain field AttachmentMetadata");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.Set r12, defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luz.b(java.util.Set, arpe):java.lang.Object");
    }

    public final Object c(UUID uuid, lwr lwrVar, arpe arpeVar) {
        if (lwrVar.compareTo(lwr.COMPLETE_SUCCESS) >= 0) {
            Object q = arro.q(this.a, new gci(this, uuid, lwrVar, (arpe) null, 17), arpeVar);
            if (q == arpl.a) {
                return q;
            }
            return arnb.a;
        }
        throw new IllegalArgumentException(a.cc(lwrVar, "status [", "] is not a completed status"));
    }

    public final Object d(arpe arpeVar) {
        return arro.q(this.a, new leb(this, (arpe) null, 5), arpeVar);
    }

    public final Object e(arpe arpeVar) {
        return arro.q(this.a, new leb(this, (arpe) null, 6, (byte[]) null), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.util.UUID r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.luv
            if (r0 == 0) goto L13
            r0 = r8
            luv r0 = (defpackage.luv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            luv r0 = new luv
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.aqil.P(r8)
            arpi r8 = r6.a
            leb r2 = new leb
            r4 = 8
            r5 = 0
            r2.<init>(r7, r5, r4, r5)
            r0.c = r3
            java.lang.Object r8 = defpackage.arro.q(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luz.f(java.util.UUID, arpe):java.lang.Object");
    }

    public final Object g(UUID uuid, arpe arpeVar) {
        return arro.q(this.a, new leb(uuid, (arpe) null, 9, (char[]) null), arpeVar);
    }

    public final Object h(UUID uuid, arpe arpeVar) {
        return arro.q(this.a, new kca(this, uuid, (arpe) null, 16), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.arpe r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.luw
            if (r0 == 0) goto L13
            r0 = r13
            luw r0 = (defpackage.luw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            luw r0 = new luw
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.a
            java.util.Iterator r2 = (java.util.Iterator) r2
            luz r4 = r0.e
            defpackage.aqil.P(r13)
            goto Lbb
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L39:
            j$.time.Duration r2 = r0.f
            java.lang.Object r4 = r0.a
            j$.time.Instant r4 = (j$.time.Instant) r4
            luz r5 = r0.e
            defpackage.aqil.P(r13)
            r11 = r5
            r5 = r4
            r4 = r11
            goto L75
        L48:
            defpackage.aqil.P(r13)
            xnv r13 = r12.c
            armf r2 = r12.j
            j$.time.Instant r13 = r13.f()
            java.lang.Object r2 = r2.b()
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            j$.time.Duration r2 = j$.time.Duration.ofDays(r5)
            r0.e = r12
            r0.a = r13
            r0.f = r2
            r0.d = r4
            java.lang.Object r4 = r12.d(r0)
            if (r4 == r1) goto Lde
            r5 = r13
            r13 = r4
            r4 = r12
        L75:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r13 = r13.iterator()
        L80:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto La6
            java.lang.Object r7 = r13.next()
            r8 = r7
            luq r8 = (defpackage.luq) r8
            lwr r9 = r8.c
            lwr r10 = defpackage.lwr.WAITING_ON_APP_UPDATE_INITIAL_PROMPT_SHOWN
            if (r9 != r10) goto L80
            r5.getClass()
            j$.time.Instant r8 = r8.g
            j$.time.Duration r8 = defpackage.albo.ca(r5, r8)
            int r8 = r8.compareTo(r2)
            if (r8 < 0) goto L80
            r6.add(r7)
            goto L80
        La6:
            alwo r13 = defpackage.luz.h
            alvw r13 = r13.g()
            alwl r13 = (defpackage.alwl) r13
            int r2 = r6.size()
            java.lang.String r5 = "Marking %s executions with initial prompt shown as ready for reprompt"
            r13.r(r5, r2)
            java.util.Iterator r2 = r6.iterator()
        Lbb:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto Ldb
            java.lang.Object r13 = r2.next()
            luq r13 = (defpackage.luq) r13
            java.util.UUID r13 = r13.a
            lwr r5 = defpackage.lwr.WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT
            r0.e = r4
            r0.a = r2
            r6 = 0
            r0.f = r6
            r0.d = r3
            java.lang.Object r13 = r4.l(r13, r5, r0)
            if (r13 != r1) goto Lbb
            return r1
        Ldb:
            arnb r13 = defpackage.arnb.a
            return r13
        Lde:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luz.i(arpe):java.lang.Object");
    }

    public final Object j(long j, arpe arpeVar) {
        Object q = arro.q(this.a, new lux(j, null), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (defpackage.arro.q(r11, r12, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.util.UUID r11, defpackage.lwz r12, defpackage.arpe r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.luy
            if (r0 == 0) goto L13
            r0 = r13
            luy r0 = (defpackage.luy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            luy r0 = new luy
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.aqil.P(r13)
            goto L97
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            lwz r12 = r0.f
            java.util.UUID r11 = r0.e
            luz r2 = r0.d
            defpackage.aqil.P(r13)
            r5 = r11
            r6 = r12
            r7 = r2
            goto L54
        L40:
            defpackage.aqil.P(r13)
            r0.d = r10
            r0.e = r11
            r0.f = r12
            r0.c = r4
            java.lang.Object r13 = r10.h(r11, r0)
            if (r13 == r1) goto L9a
            r7 = r10
            r5 = r11
            r6 = r12
        L54:
            luq r13 = (defpackage.luq) r13
            if (r13 == 0) goto L7c
            lwr r11 = r13.c
            lwr r12 = defpackage.lwr.COMPLETE_SUCCESS
            int r11 = r11.compareTo(r12)
            java.lang.String r12 = "] already exists"
            if (r11 >= 0) goto L70
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "active restore execution with sessionId ["
            java.lang.String r12 = defpackage.a.cc(r5, r13, r12)
            r11.<init>(r12)
            throw r11
        L70:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r13 = "completed restore execution with sessionId ["
            java.lang.String r12 = defpackage.a.cc(r5, r13, r12)
            r11.<init>(r12)
            throw r11
        L7c:
            arpi r11 = r7.a
            gci r12 = new gci
            r8 = 0
            r9 = 18
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r13 = 0
            r0.d = r13
            r0.e = r13
            r0.f = r13
            r0.c = r3
            java.lang.Object r11 = defpackage.arro.q(r11, r12, r0)
            if (r11 != r1) goto L97
            goto L9a
        L97:
            arnb r11 = defpackage.arnb.a
            return r11
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luz.k(java.util.UUID, lwz, arpe):java.lang.Object");
    }

    public final Object l(UUID uuid, lwr lwrVar, arpe arpeVar) {
        Object q = arro.q(this.a, new gci(this, uuid, lwrVar, (arpe) null, 19, (byte[]) null), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    public final void m(UUID uuid, lwq lwqVar) {
        uuid.getClass();
        int i = 2;
        if (lwqVar.c == 2) {
            tim a = tip.a();
            a.c(new lut(uuid, i));
            tie tieVar = (tie) ((tij) a.b().n()).cO();
            if (tieVar != null) {
                if (q(tieVar)) {
                    if (tieVar.k() == null) {
                        ((agnq) this.b.b()).e("setDatabaseFileMetadataSync", new itl(lwqVar, uuid, tieVar, 5, (char[]) null));
                        return;
                    }
                    throw new IllegalStateException(a.cc(uuid, "restore execution [", "] already has database metadata"));
                }
                throw new IllegalStateException(a.cc(uuid, "restore execution [", "] already is not active"));
            }
            throw new IllegalArgumentException(a.cc(uuid, "restore execution with sessionId [", "] does not exist"));
        }
        throw new IllegalArgumentException("databaseMetadata must contain field BackupDatabaseMetadata");
    }

    public final Object p(UUID uuid) {
        Integer valueOf;
        Integer valueOf2;
        Instant f = this.c.f();
        tin tinVar = new tin();
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 60330) {
            agnc.t("last_attachment_request_timestamp", intValue2);
        }
        if (intValue >= 60330) {
            if (f == null) {
                tinVar.a.putNull("last_attachment_request_timestamp");
            } else {
                tinVar.a.put("last_attachment_request_timestamp", Long.valueOf(uzz.k(f)));
            }
        }
        tinVar.b(Optional.of(uuid));
        return arnb.a;
    }
}
