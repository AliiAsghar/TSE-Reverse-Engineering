package defpackage;

import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifq {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ifq(agnq agnqVar, Optional optional, lqn lqnVar, armf armfVar, anen anenVar) {
        this.e = agnqVar;
        this.d = optional;
        this.b = lqnVar;
        this.c = armfVar;
        this.a = anenVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul a() {
        if (((Boolean) this.c.b()).booleanValue()) {
            ((uof) ((lqn) this.b).a.b()).f("create_or_update_lighter_conversation");
        }
        if (((Optional) this.d).isPresent()) {
            return ((uyy) ((Optional) this.d).get()).a().i(new lso(this, 14), this.a);
        }
        throw new IllegalStateException("Tried to clear notification but LighterNotifications didn't exist");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final mkd b() {
        return (mkd) this.e.b();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul c() {
        akrh e = aktp.e("BugleContactRepository#getContactHeaderSections");
        try {
            akul ai = aktp.ai(new kli(8), this.a);
            e.b(ai);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul d(int i, int i2) {
        akrh e = aktp.e("BugleContactRepository#getContacts");
        try {
            akul ai = aktp.ai(new ktb(this, i, i2, 2), this.a);
            e.b(ai);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul e() {
        akrh e = aktp.e("BugleContactRepository#getTotalContactsCount");
        try {
            akul ai = aktp.ai(new kli(7), this.a);
            e.b(ai);
            e.close();
            return ai;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [alhr, java.lang.Object] */
    public final void f() {
        mkb.a.o("cleaning up favorite contacts preloaded state");
        ((mkb) this.b).c.set(Optional.empty());
        ((mjx) this.c.get()).b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    public final void g(Boolean bool) {
        f();
        mjx mjxVar = (mjx) this.c.get();
        atkv atkvVar = new atkv((byte[]) null);
        atkvVar.a = ((Integer) yyv.d.e()).intValue();
        xyo c = mjx.a.c();
        c.H("starting preloading contacts");
        c.x("limit", atkvVar.a);
        c.q();
        atkvVar.b = mjxVar.a(mjxVar.c.d(0, atkvVar.a), mjxVar.c.e(), 0);
        albo.T(((Optional) mjxVar.b.getAndSet(Optional.of(atkvVar))).isEmpty());
        if (bool.booleanValue()) {
            Object obj = this.b;
            mka mkaVar = new mka();
            xyo c2 = mkb.a.c();
            c2.H("starting preloading favorite contacts");
            c2.q();
            mkb mkbVar = (mkb) obj;
            mkaVar.a = mkbVar.a();
            albo.T(((Optional) mkbVar.c.getAndSet(Optional.of(mkaVar))).isEmpty());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[Catch: all -> 0x010b, TRY_LEAVE, TryCatch #0 {all -> 0x010b, blocks: (B:11:0x0062, B:13:0x0070), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.atok r7, int r8, defpackage.mix r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifq.h(atok, int, mix, arpe):java.lang.Object");
    }

    public ifq(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, ifb ifbVar) {
        this.b = armfVar;
        this.e = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.a = ifbVar;
    }

    public ifq(arpi arpiVar, xxh xxhVar, armf armfVar, aksr aksrVar, arwe arweVar) {
        this.a = arpiVar;
        this.b = xxhVar;
        this.c = armfVar;
        this.d = aksrVar;
        this.e = arweVar;
    }

    public ifq(het hetVar, heu heuVar, heu heuVar2, heu heuVar3, heu heuVar4) {
        this.b = hetVar;
        this.a = heuVar;
        this.d = heuVar2;
        this.c = heuVar3;
        this.e = heuVar4;
    }

    public ifq(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
    }

    public ifq(arwe arweVar, arpi arpiVar, mgu mguVar) {
        arweVar.getClass();
        arpiVar.getClass();
        mguVar.getClass();
        this.a = arweVar;
        this.c = arpiVar;
        this.d = mguVar;
        this.b = new ConcurrentHashMap();
        this.e = new asgm();
    }

    public ifq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        agmi a = agmk.a();
        a.d = 1;
        a.j(true);
        a.i(true);
        a.f(true);
        a.c(true);
        a.d(true);
        a.a = "conversation_to_participants.conversation_id";
        a.e(true);
        a.c = new wsy();
        smi smiVar = new smi(a.a());
        this.a = smiVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.j(true);
        a2.i(true);
        a2.f(true);
        a2.c(true);
        a2.d(true);
        a2.a = "conversation_to_participants.participant_id";
        a2.e(true);
        a2.c = new wsy();
        smi smiVar2 = new smi(a2.a());
        this.c = smiVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.i(true);
        a3.a = "conversation_to_participants.rcs_group_join_status";
        a3.c = new wsy();
        smi smiVar3 = new smi(a3.a());
        this.d = smiVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "conversation_to_participants.last_modified_by_key";
        a4.c = new wsy();
        smi smiVar4 = new smi(a4.a());
        this.b = smiVar4;
        this.e = new smi[]{smiVar, smiVar2, smiVar3, smiVar4};
    }

    public ifq(lpg lpgVar, anen anenVar, mkb mkbVar, kor korVar, armf armfVar) {
        this.a = anenVar;
        this.b = mkbVar;
        this.d = korVar;
        this.c = albo.D(new fgh(this, lpgVar, 8));
        this.e = armfVar;
    }

    public ifq(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
    }

    public ifq(char[] cArr, byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "events._id";
        a.c = new wsy();
        spx spxVar = new spx(a.a());
        this.d = spxVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.a = "events.timestamp";
        a2.c = new wsy();
        spx spxVar2 = new spx(a2.a());
        this.c = spxVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "events.event";
        a3.c = new wsy();
        spx spxVar3 = new spx(a3.a());
        this.b = spxVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "events.data";
        a4.c = new wsy();
        spx spxVar4 = new spx(a4.a());
        this.a = spxVar4;
        this.e = new spx[]{spxVar, spxVar2, spxVar3, spxVar4};
    }

    public ifq(byte[] bArr, char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "message_classifications_table._id";
        a.c = new wsy();
        stv stvVar = new stv(a.a());
        this.d = stvVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.b = new ssv(11);
        a2.a = "message_classifications_table.message_id";
        a2.c = new wsy();
        stv stvVar2 = new stv(a2.a());
        this.c = stvVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.a = "message_classifications_table.classification_type";
        a3.c = new wsy();
        stv stvVar3 = new stv(a3.a());
        this.b = stvVar3;
        agmi a4 = agmk.a();
        a4.d = 5;
        a4.a = "message_classifications_table.classification_details";
        a4.c = new wsy();
        stv stvVar4 = new stv(a4.a());
        this.a = stvVar4;
        this.e = new stv[]{stvVar, stvVar2, stvVar3, stvVar4};
    }

    public ifq(short[] sArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "message_destinations._id";
        a.c = new wsy();
        sud sudVar = new sud(a.a());
        this.d = sudVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.i(true);
        a2.c(true);
        a2.d(true);
        a2.b = new ssv(15);
        a2.a = "message_destinations.message_send_receive_attempt_id";
        a2.c = new wsy();
        sud sudVar2 = new sud(a2.a());
        this.c = sudVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.i(true);
        a3.a = "message_destinations.message_destination_type";
        a3.c = new wsy();
        sud sudVar3 = new sud(a3.a());
        this.b = sudVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.i(true);
        a4.a = "message_destinations.message_destination_raw";
        a4.c = new wsy();
        sud sudVar4 = new sud(a4.a());
        this.a = sudVar4;
        this.e = new sud[]{sudVar, sudVar2, sudVar3, sudVar4};
    }

    public ifq(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.i(true);
        a.c(true);
        a.d(true);
        a.b = new svc(13);
        a.a = "message_replies.message_id";
        a.e(true);
        a.c = new wsy();
        svs svsVar = new svs(a.a());
        this.a = svsVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.b = new svc(14);
        a2.a = "message_replies.replied_to_message_id";
        a2.c = new wsy();
        svs svsVar2 = new svs(a2.a());
        this.b = svsVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "message_replies.replied_to_message_id_null_reason";
        a3.c = new wsy();
        svs svsVar3 = new svs(a3.a());
        this.c = svsVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.c(true);
        a4.a = "message_replies.replied_to_rcs_message_id";
        a4.c = new wsy();
        svs svsVar4 = new svs(a4.a());
        this.d = svsVar4;
        this.e = new svs[]{svsVar, svsVar2, svsVar3, svsVar4};
    }

    public ifq(char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "pii_hash._id";
        a.c = new wsy();
        tct tctVar = new tct(a.a());
        this.d = tctVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.a = "pii_hash.timestamp";
        a2.c = new wsy();
        tct tctVar2 = new tct(a2.a());
        this.c = tctVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "pii_hash.hash_value";
        a3.c = new wsy();
        tct tctVar3 = new tct(a3.a());
        this.b = tctVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "pii_hash.hash_key";
        a4.c = new wsy();
        tct tctVar4 = new tct(a4.a());
        this.a = tctVar4;
        this.e = new tct[]{tctVar, tctVar2, tctVar3, tctVar4};
    }

    public ifq(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "rbm_business_verifier_info.verifier_id";
        a.c = new wsy();
        tej tejVar = new tej(a.a());
        this.a = tejVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.i(true);
        a2.a = "rbm_business_verifier_info.verifier_name";
        a2.c = new wsy();
        tej tejVar2 = new tej(a2.a());
        this.d = tejVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.i(true);
        a3.a = "rbm_business_verifier_info.verifier_logo_image_remote_url";
        a3.c = new wsy();
        tej tejVar3 = new tej(a3.a());
        this.c = tejVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.i(true);
        a4.a = "rbm_business_verifier_info.verifier_logo_image_local_uri";
        a4.c = new wsy();
        tej tejVar4 = new tej(a4.a());
        this.b = tejVar4;
        this.e = new tej[]{tejVar, tejVar2, tejVar3, tejVar4};
    }

    public ifq() {
        agmi a = agmk.a();
        a.d = 1;
        a.c(true);
        a.a = "restore_workflow_scratch_timestamps.which_database";
        a.e(true);
        a.c = new wsy();
        tjt tjtVar = new tjt(a.a());
        this.d = tjtVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.c(true);
        a2.a = "restore_workflow_scratch_timestamps.message_id";
        a2.e(true);
        a2.c = new wsy();
        tjt tjtVar2 = new tjt(a2.a());
        this.a = tjtVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.a = "restore_workflow_scratch_timestamps.timestamp_in_seconds";
        a3.c = new wsy();
        tjt tjtVar3 = new tjt(a3.a());
        this.b = tjtVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.a = "restore_workflow_scratch_timestamps.timestamp_mod_1000";
        a4.c = new wsy();
        tjt tjtVar4 = new tjt(a4.a());
        this.c = tjtVar4;
        this.e = new tjt[]{tjtVar, tjtVar2, tjtVar3, tjtVar4};
    }
}
