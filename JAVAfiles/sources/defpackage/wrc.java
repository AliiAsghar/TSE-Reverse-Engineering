package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wrc extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler");
    private static final Map c = aqjn.m(new armo(wrt.OUTCOME_SUCCESS, aqjn.m(new armo(wrh.HELP_NOT_LONGER_NEED, wqh.b), new armo(wrh.WAITING_FOR_HELP, wqh.a))), new armo(wrt.OUTCOME_FAILURE, aqjn.m(new armo(wrh.HELP_NOT_LONGER_NEED, wqh.d), new armo(wrh.WAITING_FOR_HELP, wqh.c))));
    public final rvw b;
    private final arwe d;
    private final ryg e;
    private final Optional f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final woy j;
    private final msk k;
    private final armf l;
    private final wsd m;
    private final armf n;
    private final wqq o;
    private final wsl p;
    private final znj q;
    private final znj r;
    private final znj s;

    public wrc(arwe arweVar, wqq wqqVar, rvw rvwVar, znj znjVar, znj znjVar2, ryg rygVar, znj znjVar3, Optional optional, armf armfVar, armf armfVar2, armf armfVar3, woy woyVar, msk mskVar, wsl wslVar, armf armfVar4, wsd wsdVar, armf armfVar5) {
        arweVar.getClass();
        wqqVar.getClass();
        rvwVar.getClass();
        rygVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        mskVar.getClass();
        wslVar.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.d = arweVar;
        this.o = wqqVar;
        this.b = rvwVar;
        this.r = znjVar;
        this.s = znjVar2;
        this.e = rygVar;
        this.q = znjVar3;
        this.f = optional;
        this.g = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.j = woyVar;
        this.k = mskVar;
        this.p = wslVar;
        this.l = armfVar4;
        this.m = wsdVar;
        this.n = armfVar5;
    }

    private final void n(ConversationIdType conversationIdType, MessageCoreData messageCoreData, wrt wrtVar, amgs amgsVar, MessageCoreData messageCoreData2) {
        Object ac = this.q.ac(messageCoreData);
        int i = 0;
        if (armq.d(ac)) {
            Uri uri = (Uri) ac;
            alvw g = a.g();
            g.X(alwp.a, "BugleEmergencySOS");
            alvg alvgVar = (alvg) g;
            alvgVar.X(ydl.R, uri);
            alvgVar.X(ydl.S, messageCoreData.A());
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/questionnaireretriever/RetrieveQuestionnaireWorkHandler", "insertIntoTelephonyDatabase", 386, "RetrieveQuestionnaireWorkHandler.kt")).q("Successfully inserted the satellite message in Telephony DB");
            messageCoreData.br(uri);
            this.f.ifPresent(new wqw(new uxc(messageCoreData, 8), i));
        }
        ((agnq) this.l.b()).e("RetrieveQuestionnaireWorkHandler#insertToBugleDatabaseAndNotifyUI", new vri((Object) this, (Object) messageCoreData, (Object) messageCoreData2, 7, (char[]) null));
        ((ruq) this.n.b()).d(conversationIdType, messageCoreData2.B(), Long.valueOf(messageCoreData2.n()), tqc.UNARCHIVED, false);
        mho mhoVar = (mho) this.g.b();
        if (wrtVar == wrt.OUTCOME_SUCCESS) {
            int e = this.e.d().e();
            amgl amglVar = (amgl) amgu.a.createBuilder();
            amglVar.getClass();
            akec.aT(2, amglVar);
            boolean cz = messageCoreData.cz();
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar = (amgu) amglVar.b;
            amguVar.c |= 1073741824;
            amguVar.aj = cz;
            amgsVar.getClass();
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar2 = (amgu) amglVar.b;
            amguVar2.aB = amgsVar.e;
            amguVar2.d |= 65536;
            mhoVar.M(messageCoreData, e, (amgl) akec.aN(amglVar).toBuilder());
            return;
        }
        mgm mgmVar = new mgm(null);
        mgmVar.e(messageCoreData);
        mgmVar.h(this.e.d().e());
        mgmVar.f(-2);
        mgmVar.b(-1);
        mgmVar.c(0);
        mgmVar.d = 1;
        mgmVar.d(0);
        mgmVar.g(amgsVar);
        mhoVar.I(mgmVar.a());
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        armf armfVar = this.h;
        une a2 = unf.a();
        a2.d((int) ((Number) armfVar.b()).longValue());
        a2.g(gry.EXPONENTIAL);
        Object b = this.i.b();
        b.getClass();
        a2.h(((Number) b).longValue());
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("RetrieveQuestionnaireWorkHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c2;
        ((aozo) apbtVar).getClass();
        c2 = qjh.c(this.d, arpj.a, arwf.a, new vck(this, (arpe) null, 12));
        return c2;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = aozo.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.msh r5, defpackage.wrw r6, defpackage.arpe r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.wqy
            if (r0 == 0) goto L13
            r0 = r7
            wqy r0 = (defpackage.wqy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wqy r0 = new wqy
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            msg r5 = r0.e
            wrc r6 = r0.d
            defpackage.aqil.P(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r7)
            woy r7 = r4.j
            r0.d = r4
            r2 = r5
            msg r2 = (defpackage.msg) r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r7 = r7.e(r5, r6, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r6 = r4
        L49:
            smr r7 = (defpackage.smr) r7
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = r7.x()
            r7.getClass()
            ryg r0 = r6.e
            qwm r0 = r0.d()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r0 = r0.g()
            woy r6 = r6.j
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r5 = r6.a(r5)
            wqx r6 = new wqx
            r6.<init>(r7, r0, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrc.j(msh, wrw, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, tqx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.wrw r19, java.util.List r20, defpackage.msh r21, defpackage.arpe r22) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrc.k(wrw, java.util.List, msh, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x021b, code lost:
    
        if (r0.b(r2) == r3) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0207, code lost:
    
        if (r14.k(r4, r0, r5, r2) != r3) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c6, code lost:
    
        if (r14.m(r4, r12, r0, r2) == r3) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0169, code lost:
    
        if (r14.m(r0, r15, r5, r2) != r3) goto L70;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r6v6, types: [wrc, java.lang.Object, wrw] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.arpe r19) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrc.l(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, tqx] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, tqx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.wrw r21, java.util.List r22, defpackage.msh r23, defpackage.arpe r24) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrc.m(wrw, java.util.List, msh, arpe):java.lang.Object");
    }
}
