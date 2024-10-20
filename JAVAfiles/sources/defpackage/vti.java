package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vti {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public vti(Context context, vjs vjsVar, vjs vjsVar2, msk mskVar, xvc xvcVar, uie uieVar, armf armfVar, wfh wfhVar, yje yjeVar, armf armfVar2, armf armfVar3) {
        this.g = context;
        this.d = vjsVar;
        this.a = vjsVar2;
        this.h = mskVar;
        this.b = xvcVar;
        this.c = uieVar;
        this.k = armfVar;
        this.f = wfhVar;
        this.e = yjeVar;
        this.j = armfVar2;
        this.i = armfVar3;
    }

    public static /* synthetic */ void j(vti vtiVar, String str, qeg qegVar, int i) {
        if ((i & 2) != 0) {
            qegVar = null;
        }
        vtiVar.m(str, qegVar, 2);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v35, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [armf, java.lang.Object] */
    public static /* synthetic */ void n(vti vtiVar, int i, int i2, String str, qgr qgrVar, amfu amfuVar, amxb amxbVar, int i3) {
        amwt f;
        atok atokVar;
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        amgl amglVar = (amgl) amgu.a.createBuilder();
        amglVar.getClass();
        if ((i3 & 8) != 0) {
            qgrVar = null;
        }
        if (qgrVar != null && (atokVar = (atok) ((pvw) vtiVar.j.b()).m().fu(qgrVar)) != null) {
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar = (amgu) amglVar.b;
            amguVar.o = atokVar;
            amguVar.b |= 1024;
        }
        if ((i3 & 32) != 0) {
            amxbVar = null;
        }
        if (amxbVar != null) {
            akec.aQ(amxbVar, amglVar);
        }
        alzz.k(akec.aN(amglVar), amfqVar);
        int Q = ((yyt) vtiVar.c).Q(vqk.s);
        alzz.n(amfp.BUGLE_GROUP, amfqVar);
        aozy createBuilder = amfv.a.createBuilder();
        createBuilder.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        apag apagVar = createBuilder.b;
        amfv amfvVar = (amfv) apagVar;
        amfvVar.c = i - 1;
        amfvVar.b |= 1;
        if (i2 != 0) {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amfv amfvVar2 = (amfv) createBuilder.b;
            amfvVar2.d = i2 - 1;
            amfvVar2.b |= 2;
            if (((oln) vtiVar.f.b()).a()) {
                f = ((adjc) vtiVar.e.b()).d(Q).a;
            } else {
                f = ((vrn) ((xyt) vtiVar.d.b()).a()).f(Q);
            }
            f.getClass();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amfv amfvVar3 = (amfv) createBuilder.b;
            amfvVar3.f = f.E;
            amfvVar3.b |= 8;
            if (qgrVar != null) {
                alzz.g(qgrVar.c, createBuilder);
            } else {
                if ((i3 & 4) != 0) {
                    str = null;
                }
                if (str != null) {
                    alzz.g(str, createBuilder);
                }
            }
            if ((i3 & 16) != 0) {
                amfuVar = null;
            }
            if (amfuVar != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amfv amfvVar4 = (amfv) createBuilder.b;
                amfvVar4.g = amfuVar;
                amfvVar4.b |= 16;
            }
            apag s = createBuilder.s();
            s.getClass();
            amfv amfvVar5 = (amfv) s;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.B = amfvVar5;
            amfrVar.b |= 4194304;
            aozy builder = alzz.h(amfqVar).toBuilder();
            builder.getClass();
            amfq amfqVar2 = (amfq) builder;
            if (((pfz) vtiVar.k.b()).a()) {
                mar a = ((mbb) vtiVar.b.b()).a();
                a.e(amrs.BUGLE_GROUP);
                a.b(amfqVar2, mbt.LOG_SPEC_GROUP_OPERATION_EVENT);
                return;
            }
            ((maq) vtiVar.a.b()).k(amfqVar2, amrs.BUGLE_GROUP);
            return;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final qgr a() {
        atok ba = yyb.ba();
        ba.getClass();
        Object fu = ((pvw) this.j.b()).fu(ba);
        fu.getClass();
        return (qgr) fu;
    }

    public final void b(qed qedVar) {
        qeb qebVar;
        qedVar.getClass();
        String str = null;
        try {
            qebVar = (qeb) apag.parseFrom(qeb.a, qedVar.d, aozs.a());
        } catch (apba unused) {
            qebVar = null;
        }
        if (qebVar != null) {
            str = qebVar.e;
        }
        String str2 = str;
        qeg qegVar = qedVar.c;
        if (qegVar == null) {
            qegVar = qeg.a;
        }
        n(this, 17, 3, str2, null, null, k(3, qegVar), 24);
    }

    public final void c() {
        n(this, 17, 3, null, null, null, k(3, null), 24);
    }

    public final void d(qem qemVar, qeg qegVar) {
        qegVar.getClass();
        if (!qemVar.d) {
            qgr qgrVar = qemVar.e;
            if (qgrVar == null) {
                qgrVar = qgr.a;
            }
            n(this, 3, 3, qemVar.f, qgrVar, null, k(3, qegVar), 16);
        }
    }

    public final void e() {
        n(this, 3, 3, null, null, null, k(3, null), 20);
    }

    public final void f(String str, qeg qegVar) {
        str.getClass();
        qegVar.getClass();
        l(str, qegVar, 2);
    }

    public final void g(String str) {
        str.getClass();
        j(this, str, null, 6);
    }

    public final void h(String str) {
        str.getClass();
        n(this, 21, 2, str, null, null, null, 56);
    }

    public final void i(qgr qgrVar, amwx amwxVar) {
        qgrVar.getClass();
        amwxVar.getClass();
        aozy createBuilder = amxb.a.createBuilder();
        createBuilder.getClass();
        aozy createBuilder2 = amxc.a.createBuilder();
        createBuilder2.getClass();
        aktp.bb(2, createBuilder2);
        aktp.ba(amwy.CHAT_API_FAILED_PERMANENTLY, createBuilder2);
        aktp.aZ(amwxVar, createBuilder2);
        aktp.bd(aktp.aY(createBuilder2), createBuilder);
        n(this, 19, 3, null, qgrVar, null, aktp.bc(createBuilder), 16);
    }

    public final amxb k(int i, qeg qegVar) {
        aozy createBuilder = amxb.a.createBuilder();
        createBuilder.getClass();
        aozy createBuilder2 = amxc.a.createBuilder();
        createBuilder2.getClass();
        aktp.bb(i, createBuilder2);
        if (qegVar != null) {
            qef b = qef.b(qegVar.c);
            if (b == null) {
                b = qef.UNKNOWN_STATUS;
            }
            if (b != null) {
                aktp.ba((amwy) albo.am((algf) this.g, b), createBuilder2);
            }
        }
        if (qegVar != null) {
            qee b2 = qee.b(qegVar.d);
            if (b2 == null) {
                b2 = qee.UNKNOWN_CAUSE;
            }
            if (b2 != null) {
                aktp.aZ((amwx) albo.am((algf) this.h, b2), createBuilder2);
            }
        }
        aktp.bd(aktp.aY(createBuilder2), createBuilder);
        return aktp.bc(createBuilder);
    }

    public final void l(String str, qeg qegVar, int i) {
        str.getClass();
        qegVar.getClass();
        n(this, 23, 3, str, null, null, k(i, qegVar), 24);
    }

    public final void m(String str, qeg qegVar, int i) {
        str.getClass();
        n(this, 21, 3, str, null, null, k(i, qegVar), 24);
    }

    public final CharSequence o(rto rtoVar, rry rryVar) {
        String str;
        String Q = rryVar.Q((Context) this.g);
        boolean S = rtoVar.S();
        if (rtoVar.S()) {
            str = rtoVar.r();
        } else {
            str = null;
        }
        CharSequence charSequence = ((vjs) this.d).t((Context) this.g, rryVar, S, str).b;
        if (charSequence != null) {
            return charSequence;
        }
        return Q;
    }

    public final String p(rto rtoVar, alog alogVar) {
        String r = rtoVar.r();
        if (!rtoVar.S() && !alogVar.isEmpty()) {
            rry rryVar = (rry) Collection.EL.stream(alogVar.a()).filter(new vmc(6)).findFirst().orElse(null);
            if (rryVar == null) {
                return ((wfh) this.f).z(albo.ag(r));
            }
            String M = rryVar.M();
            if (TextUtils.isEmpty(M) && rryVar.au()) {
                if (((Boolean) new mss(3).get()).booleanValue()) {
                    M = rryVar.aZ().a;
                    M.getClass();
                } else {
                    M = rryVar.J();
                }
            }
            String str = (String) Objects.requireNonNullElse(M, r);
            return ((wfh) this.f).z(albo.ag(str));
        }
        return ((wfh) this.f).z(albo.ag(r));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    public final vfl q() {
        Context context = (Context) this.d.b();
        context.getClass();
        xnv xnvVar = (xnv) this.g.b();
        xnvVar.getClass();
        uum uumVar = (uum) this.j.b();
        Optional optional = (Optional) this.e.b();
        optional.getClass();
        Set set = (Set) this.k.b();
        set.getClass();
        Set set2 = (Set) this.h.b();
        set2.getClass();
        Set set3 = (Set) this.b.b();
        set3.getClass();
        ((vht) this.c.b()).getClass();
        anen anenVar = (anen) this.a.b();
        anenVar.getClass();
        anen anenVar2 = (anen) this.i.b();
        anenVar2.getClass();
        ((oua) this.f.b()).getClass();
        return new vfl(context, xnvVar, uumVar, optional, set, set2, set3, anenVar, anenVar2);
    }

    public final lrf r(rto rtoVar) {
        int i;
        if (rtoVar.S()) {
            i = ((yje) this.e).c().a;
        } else {
            i = ((yje) this.e).f;
        }
        return new lrf(Integer.valueOf(i), rtoVar.r(), (String) rtoVar.n().map(new vmd(3)).orElse(null));
    }

    public vti(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, yyt yytVar, apwt apwtVar, pst pstVar, pvx pvxVar, armf armfVar5, armf armfVar6, armf armfVar7) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        yytVar.getClass();
        apwtVar.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        this.i = armfVar3;
        this.j = armfVar4;
        this.c = yytVar;
        this.d = apwtVar;
        this.g = pstVar;
        this.h = pvxVar;
        this.e = armfVar5;
        this.f = armfVar6;
        this.k = armfVar7;
    }

    public vti(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversation_suggestions._id";
        a.c = new wsy();
        slp slpVar = new slp(a.a());
        this.i = slpVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.a = "conversation_suggestions.message_id";
        a2.c = new wsy();
        slp slpVar2 = new slp(a2.a());
        this.f = slpVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "conversation_suggestions.conversation_suggestion_type";
        a3.c = new wsy();
        slp slpVar3 = new slp(a3.a());
        this.a = slpVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "conversation_suggestions.properties";
        a4.c = new wsy();
        slp slpVar4 = new slp(a4.a());
        this.g = slpVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.a = "conversation_suggestions.post_back_data";
        a5.c = new wsy();
        slp slpVar5 = new slp(a5.a());
        this.b = slpVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.a = "conversation_suggestions.post_back_encoding";
        a6.c = new wsy();
        slp slpVar6 = new slp(a6.a());
        this.h = slpVar6;
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "conversation_suggestions.rcs_message_id";
        a7.c = new wsy();
        slp slpVar7 = new slp(a7.a());
        this.e = slpVar7;
        agmi a8 = agmk.a();
        a8.d = 4;
        a8.c(true);
        a8.a = "conversation_suggestions.target_rcs_message_id";
        a8.c = new wsy();
        slp slpVar8 = new slp(a8.a());
        this.j = slpVar8;
        agmi a9 = agmk.a();
        a9.d = 1;
        a9.a = "conversation_suggestions.read";
        a9.c = new wsy();
        slp slpVar9 = new slp(a9.a());
        this.d = slpVar9;
        agmi a10 = agmk.a();
        a10.d = 1;
        a10.a = "conversation_suggestions.received_timestamp";
        a10.c = new wsy();
        slp slpVar10 = new slp(a10.a());
        this.c = slpVar10;
        this.k = new slp[]{slpVar, slpVar2, slpVar3, slpVar4, slpVar5, slpVar6, slpVar7, slpVar8, slpVar9, slpVar10};
    }

    public vti(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "restore_workflow_executions._id";
        a.c = new wsy();
        tih tihVar = new tih(a.a());
        this.i = tihVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.j(true);
        a2.i(true);
        a2.c(true);
        a2.a = "restore_workflow_executions.session_id";
        a2.e(true);
        a2.c = new wsy();
        tih tihVar2 = new tih(a2.a());
        this.d = tihVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.i(true);
        a3.a = "restore_workflow_executions.feature";
        a3.c = new wsy();
        tih tihVar3 = new tih(a3.a());
        this.b = tihVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.i(true);
        a4.a = "restore_workflow_executions.status";
        a4.c = new wsy();
        tih tihVar4 = new tih(a4.a());
        this.f = tihVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.i(true);
        a5.a = "restore_workflow_executions.start_time";
        a5.c = new wsy();
        tih tihVar5 = new tih(a5.a());
        this.c = tihVar5;
        agmi a6 = agmk.a();
        a6.d = 2;
        a6.a = "restore_workflow_executions.finish_time";
        a6.c = new wsy();
        tih tihVar6 = new tih(a6.a());
        this.h = tihVar6;
        agmi a7 = agmk.a();
        a7.d = 5;
        a7.a = "restore_workflow_executions.backup_database_metadata";
        a7.c = new wsy();
        tih tihVar7 = new tih(a7.a());
        this.a = tihVar7;
        agmi a8 = agmk.a();
        a8.d = 2;
        a8.a = "restore_workflow_executions.initial_messages_version";
        a8.c = new wsy();
        tih tihVar8 = new tih(a8.a());
        this.g = tihVar8;
        agmi a9 = agmk.a();
        a9.d = 2;
        a9.a = "restore_workflow_executions.status_timestamp";
        a9.c = new wsy();
        tih tihVar9 = new tih(a9.a());
        this.j = tihVar9;
        agmi a10 = agmk.a();
        a10.d = 2;
        a10.a = "restore_workflow_executions.last_attachment_request_timestamp";
        a10.c = new wsy();
        tih tihVar10 = new tih(a10.a());
        this.e = tihVar10;
        this.k = new tih[]{tihVar, tihVar2, tihVar3, tihVar4, tihVar5, tihVar6, tihVar7, tihVar8, tihVar9, tihVar10};
    }

    public vti() {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "sticker_sets._id";
        a.c = new wsy();
        tmk tmkVar = new tmk(a.a());
        this.i = tmkVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.c(true);
        a2.a = "sticker_sets.sticker_set_id";
        a2.e(true);
        a2.c = new wsy();
        tmk tmkVar2 = new tmk(a2.a());
        this.j = tmkVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "sticker_sets.local_version";
        a3.c = new wsy();
        tmk tmkVar3 = new tmk(a3.a());
        this.d = tmkVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.a = "sticker_sets.download_state";
        a4.c = new wsy();
        tmk tmkVar4 = new tmk(a4.a());
        this.g = tmkVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.a = "sticker_sets.icon_uri";
        a5.c = new wsy();
        tmk tmkVar5 = new tmk(a5.a());
        this.e = tmkVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.a = "sticker_sets.display_name";
        a6.c = new wsy();
        tmk tmkVar6 = new tmk(a6.a());
        this.b = tmkVar6;
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "sticker_sets.preview_image_uri";
        a7.c = new wsy();
        tmk tmkVar7 = new tmk(a7.a());
        this.c = tmkVar7;
        agmi a8 = agmk.a();
        a8.d = 1;
        a8.a = "sticker_sets.requested_timestamp";
        a8.c = new wsy();
        tmk tmkVar8 = new tmk(a8.a());
        this.f = tmkVar8;
        agmi a9 = agmk.a();
        a9.d = 1;
        a9.a = "sticker_sets.display_order";
        a9.c = new wsy();
        tmk tmkVar9 = new tmk(a9.a());
        this.h = tmkVar9;
        agmi a10 = agmk.a();
        a10.d = 4;
        a10.a = "sticker_sets.author";
        a10.c = new wsy();
        tmk tmkVar10 = new tmk(a10.a());
        this.a = tmkVar10;
        this.k = new tmk[]{tmkVar, tmkVar2, tmkVar3, tmkVar4, tmkVar5, tmkVar6, tmkVar7, tmkVar8, tmkVar9, tmkVar10};
    }

    public vti(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, char[] cArr) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.g = armfVar2;
        armfVar3.getClass();
        this.j = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.k = armfVar5;
        armfVar6.getClass();
        this.h = armfVar6;
        armfVar7.getClass();
        this.b = armfVar7;
        armfVar8.getClass();
        this.c = armfVar8;
        armfVar9.getClass();
        this.a = armfVar9;
        armfVar10.getClass();
        this.i = armfVar10;
        armfVar11.getClass();
        this.f = armfVar11;
    }

    public vti(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, byte[] bArr) {
        armfVar.getClass();
        this.i = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.j = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.d = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.a = armfVar7;
        armfVar8.getClass();
        this.b = armfVar8;
        armfVar9.getClass();
        this.g = armfVar9;
        armfVar10.getClass();
        this.k = armfVar10;
        armfVar11.getClass();
        this.h = armfVar11;
    }

    public vti(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
        armfVar.getClass();
        this.h = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        this.c = armfVar5;
        this.j = armfVar6;
        this.i = armfVar7;
        armfVar8.getClass();
        this.f = armfVar8;
        this.d = armfVar9;
        armfVar10.getClass();
        this.g = armfVar10;
        this.k = armfVar11;
    }
}
