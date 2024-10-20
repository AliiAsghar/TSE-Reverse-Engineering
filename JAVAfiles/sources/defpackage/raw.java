package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.PauseRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.ResumeRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.workqueue.WorkQueueWorkerShim;
import com.google.android.ims.util.common.RcsIntents;
import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.Scope;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class raw implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ raw(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v54, types: [ufw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.lang.Object, apbt] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        String str;
        gsw gswVar;
        switch (this.c) {
            case 0:
                MarkAsReadAction markAsReadAction = (MarkAsReadAction) this.a;
                if (!markAsReadAction.j.isEmpty()) {
                    ?? r0 = this.b;
                    for (int i = 0; i < ((alsx) r0).c; i++) {
                        ((uyr) markAsReadAction.j.get()).a();
                    }
                    return null;
                }
                throw new IllegalStateException("Tried to mark as read a Lighter conversation, but LighterMarkAsRead is not present");
            case 1:
                ((qzw) this.a).o.b((MessageIdType) this.b).w(0L);
                return null;
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    ?? r9 = this.b;
                    Object obj2 = this.a;
                    alvw g = PauseRcsFileTransferAction.a.g();
                    g.X(alwp.a, "BugleDataModel");
                    alvg alvgVar = (alvg) g;
                    alvgVar.X(ydl.b, r9.B());
                    alvgVar.X(ydl.f, r9.E());
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction", "updateMessageStatusForFailedPause", 217, "PauseRcsFileTransferAction.java")).q("No ongoing file transfer to pause so changing to manual download.");
                    r9.bI(110);
                    ((rwd) ((PauseRcsFileTransferAction) obj2).c.b()).N(r9);
                }
                return null;
            case 3:
                rfo rfoVar = (rfo) obj;
                rfo rfoVar2 = rfo.NO_FILE_TRANSFER_BIND_DATA;
                boolean z = rfoVar.h;
                ?? r1 = this.b;
                Object obj3 = this.a;
                if (z) {
                    ResumeRcsFileTransferAction resumeRcsFileTransferAction = (ResumeRcsFileTransferAction) obj3;
                    Instant f = resumeRcsFileTransferAction.c.f();
                    if (r1.a() < ((Integer) qzh.a.e()).intValue()) {
                        r1.aO(f, ((piy) resumeRcsFileTransferAction.h.b()).a());
                    } else {
                        r1.aS(f.toEpochMilli());
                    }
                    rwd rwdVar = (rwd) resumeRcsFileTransferAction.b.b();
                    ConversationIdType z2 = r1.z();
                    MessageIdType B = r1.B();
                    sya syaVar = new sya();
                    syaVar.aj("ResumeRcsFileTransferAction#updateMessageRow");
                    syaVar.L(r1.j());
                    syaVar.G(r1.q());
                    syaVar.w(r1.m());
                    syaVar.m(r1.k());
                    rwdVar.J(z2, B, syaVar);
                    rbk.d(uvl.u(r1), (Action) obj3);
                } else if (rvx.p(r1.j())) {
                    ((ResumeRcsFileTransferAction) obj3).d.c("Bugle.Rcs.Files.Transfer.Outgoing.Resumed.Counts");
                }
                return rfoVar;
            case 4:
                xpr xprVar = (xpr) obj;
                alvw d = ResumeRcsFileTransferAction.a.d();
                d.X(alwp.a, "BugleDataModel");
                alvg alvgVar2 = (alvg) d;
                ?? r12 = this.a;
                alvgVar2.X(ydl.b, r12.B());
                alvgVar2.X(ydl.f, r12.E());
                alvgVar2.X(xod.a, this.b);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeDownloadForChatApi", 370, "ResumeRcsFileTransferAction.java")).q("Resume download successfully queued.");
                if (xprVar != null) {
                    return rfo.DOWNLOAD_RESUME_SUCCESS;
                }
                return rfo.DOWNLOAD_RESUME_FAILED;
            case 5:
                alvi alviVar = ResumeRcsFileTransferAction.a;
                boolean equals = ((vqh) obj).equals(vqh.a);
                Object obj4 = this.b;
                ?? r13 = this.a;
                if (equals) {
                    alvw i2 = ResumeRcsFileTransferAction.a.i();
                    i2.X(alwp.a, "BugleDataModel");
                    alvg alvgVar3 = (alvg) i2;
                    alvgVar3.X(ydl.b, r13.B());
                    alvgVar3.X(ydl.f, r13.E());
                    alvgVar3.X(xod.a, obj4);
                    ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeUploadForChatApi", 310, "ResumeRcsFileTransferAction.java")).q("Resume upload successfully queued.");
                    return rfo.UPLOAD_RESUME_SUCCESS;
                }
                alvw d2 = ResumeRcsFileTransferAction.a.d();
                d2.X(alwp.a, "BugleDataModel");
                alvg alvgVar4 = (alvg) d2;
                alvgVar4.X(ydl.b, r13.B());
                alvgVar4.X(ydl.f, r13.E());
                alvgVar4.X(xod.a, obj4);
                ((alvg) alvgVar4.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeUploadForChatApi", 318, "ResumeRcsFileTransferAction.java")).q("Resume upload not successfully queued.");
                return rfo.UPLOAD_RESUME_FAILED;
            case 6:
                Void r92 = (Void) obj;
                ((wjk) ((SendMessageAction) this.a).c.b()).c(this.b);
                return r92;
            case 7:
                SetupExpressiveStickersAction setupExpressiveStickersAction = (SetupExpressiveStickersAction) this.a;
                albo.bR(((aiqj) setupExpressiveStickersAction.e.b()).a(), qjc.a(new adsc(setupExpressiveStickersAction, (aouz) this.b, 1)), andi.a);
                return null;
            case 8:
                int i3 = tri.a;
                if (((Boolean) obj).booleanValue()) {
                    abnq g2 = ((abnr) this.a).g(this.b);
                    g2.i(-1);
                    g2.c();
                }
                return null;
            case 9:
                anid anidVar = (anid) obj;
                Object obj5 = this.b;
                Object obj6 = this.a;
                ttb ttbVar = (ttb) obj6;
                synchronized (ttbVar.c) {
                    ((ttb) obj6).c.remove(obj5);
                    if (!((ttb) obj6).c.isEmpty()) {
                        str = twj.c(anidVar);
                    } else {
                        str = "scytale_";
                    }
                }
                return NativeBaseCrypto.resetDataStore(Scope.create(ttbVar.d.b()), ttbVar.b, str);
            case 10:
                ((ttb) this.a).g.i((String) this.b);
                return null;
            case 11:
                Optional optional = (Optional) obj;
                boolean isEmpty = optional.isEmpty();
                Object obj7 = this.a;
                if (isEmpty) {
                    ttj.a.o("E2EE deprovisioned and there is no RCS MSISDN. Clean up E2EE draft states");
                    ((tsa) ((ttj) obj7).i.b()).g(uax.DOWNGRADE_E2EE_NOT_PROVISIONED);
                } else {
                    if (((String) this.b).equals(((qei) optional.get()).d)) {
                        ttj.a.o("E2EE deprovisioned for matching RCS MSISDN. Clean up E2EE draft states");
                        ((tsa) ((ttj) obj7).i.b()).g(uax.DOWNGRADE_E2EE_NOT_PROVISIONED);
                    } else {
                        ttj.a.o("E2EE deprovisioned but there is a different RCS MSISDN. Not cleaning up.");
                    }
                }
                return null;
            case 12:
                qej qejVar = (qej) obj;
                ?? r02 = this.a;
                MessagePartCoreData G = r02.G();
                G.getClass();
                G.bH();
                spr a = ttv.a(r02.D());
                try {
                    boolean moveToFirst = a.moveToFirst();
                    Object obj8 = this.b;
                    if (moveToFirst) {
                        aozy b = ((ttv) obj8).b(a);
                        aozb aozbVar = qejVar.d;
                        if (!b.b.isMutable()) {
                            b.u();
                        }
                        apwk apwkVar = (apwk) b.b;
                        apwk apwkVar2 = apwk.a;
                        aozbVar.getClass();
                        apwkVar.b |= 4;
                        apwkVar.e = aozbVar;
                        apwk apwkVar3 = (apwk) b.s();
                        a.close();
                        return apwkVar3;
                    }
                    ((iji) ((ttv) obj8).i.b()).r(r02.D(), 6);
                    throw new IllegalArgumentException("The etouffee metadata was missing.");
                } catch (Throwable th) {
                    try {
                        a.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 13:
                vqh vqhVar = (vqh) obj;
                if (vqhVar.b == 0) {
                    ?? r03 = this.a;
                    Object obj9 = this.b;
                    if (!wxz.e(r03) && !wxz.c(r03, ((tuh) obj9).b)) {
                        vqg a2 = vqh.a(3, 10003);
                        a2.b(1);
                        aozy createBuilder = amxb.a.createBuilder();
                        aozy createBuilder2 = amxc.a.createBuilder();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar = createBuilder2.b;
                        amxc amxcVar = (amxc) apagVar;
                        amxcVar.d = 1;
                        amxcVar.b |= 4;
                        amwx amwxVar = amwx.CHAT_API_EMPTY_CHAT_MESSAGE;
                        if (!apagVar.isMutable()) {
                            createBuilder2.u();
                        }
                        amxc amxcVar2 = (amxc) createBuilder2.b;
                        amxcVar2.e = amwxVar.x;
                        amxcVar2.b |= 8;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amxb amxbVar = (amxb) createBuilder.b;
                        amxc amxcVar3 = (amxc) createBuilder2.s();
                        amxcVar3.getClass();
                        amxbVar.c = amxcVar3;
                        amxbVar.b |= 1;
                        a2.d = (amxb) createBuilder.s();
                        return a2.a();
                    }
                    return vqhVar;
                }
                return vqhVar;
            case 14:
                Scope create = Scope.create(((tvt) this.a).j.b());
                tib tibVar = new tib(tid.a);
                tibVar.d(new ttr(this.b, 9));
                thv thvVar = (thv) tibVar.b().t().get(0);
                thvVar.ao(1, "tachyon_registration_id");
                ((NativeMessageEncryptorV2) obj).deleteSession(create, thvVar.b);
                return null;
            case 15:
                atkn atknVar = (atkn) obj;
                uga.d((ufy) atknVar.b, atknVar.a, this.b, (rra) this.a);
                return null;
            case 16:
                Uri uri = (Uri) obj;
                ((ujc) this.b).e.a.remove(this.a);
                return uri;
            case 17:
                List list = (List) obj;
                alpt alptVar = ukj.a;
                gsi gsiVar = (gsi) this.a;
                String ag = albo.ag(gsiVar.d("vsms_sender_id"));
                int a3 = gsiVar.a("vsms_mcc_key", -1);
                int a4 = gsiVar.a("vsms_mnc_key", -1);
                String ag2 = albo.ag(gsiVar.d("sms_verification_existing_brand_version_key"));
                aozy createBuilder3 = anlx.a.createBuilder();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                ((anlx) createBuilder3.b).d = ag;
                aozy createBuilder4 = anmb.a.createBuilder();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar2 = createBuilder4.b;
                ((anmb) apagVar2).b = a3;
                if (!apagVar2.isMutable()) {
                    createBuilder4.u();
                }
                ((anmb) createBuilder4.b).c = a4;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                anlx anlxVar = (anlx) createBuilder3.b;
                anmb anmbVar = (anmb) createBuilder4.s();
                anmbVar.getClass();
                anlxVar.e = anmbVar;
                anlxVar.b |= 2;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar3 = createBuilder3.b;
                ((anlx) apagVar3).f = ag2;
                if (!apagVar3.isMutable()) {
                    createBuilder3.u();
                }
                anlx anlxVar2 = (anlx) createBuilder3.b;
                apax apaxVar = anlxVar2.g;
                if (!apaxVar.c()) {
                    anlxVar2.g = apag.mutableCopy(apaxVar);
                }
                Object obj10 = this.b;
                aoyj.addAll(list, anlxVar2.g);
                if (yul.a.containsValue(obj10)) {
                    anmh anmhVar = (anmh) ((alsw) yul.a).d.getOrDefault(obj10, anmh.REGISTRATION_TYPE_UNSPECIFIED);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ((anlx) createBuilder3.b).h = anmhVar.a();
                }
                anlx anlxVar3 = (anlx) createBuilder3.s();
                xyo a5 = ukj.c.a();
                a5.H("Verification params");
                a5.L("senderId", anlxVar3.d);
                anmb anmbVar2 = anlxVar3.e;
                if (anmbVar2 == null) {
                    anmbVar2 = anmb.a;
                }
                a5.z("MccMnc", anmbVar2);
                a5.M("hashes", anlxVar3.g);
                a5.q();
                return (anlx) createBuilder3.s();
            case 18:
                List<gtl> list2 = (List) obj;
                Object obj11 = this.a;
                ucz h = ((arjs) obj11).h();
                try {
                    for (gtl gtlVar : list2) {
                        if (gtlVar.b != gtk.SUCCEEDED) {
                            Iterator it = gtlVar.c.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    Object obj12 = this.b;
                                    if (obj12 == null || ((Pattern) obj12).matcher(str2).matches()) {
                                    }
                                } else {
                                    ((arjs) obj11).g("WM " + gtlVar.a.toString() + " ==> " + String.valueOf(gtlVar));
                                }
                            }
                        }
                    }
                    h.close();
                    return null;
                } catch (Throwable th3) {
                    try {
                        h.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 19:
                urn urnVar = (urn) obj;
                alvw f2 = WorkQueueWorkerShim.e.f();
                f2.X(alwp.a, "BugleWorkQueue");
                alvg alvgVar5 = (alvg) ((alvg) f2).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerShim", "startWork", 82, "WorkQueueWorkerShim.java");
                Object obj13 = this.b;
                alvgVar5.D("completed work for %s; retry status is %s", obj13, urnVar);
                Object obj14 = this.a;
                if (urnVar == urn.CONTINUE) {
                    upy a6 = uqb.a();
                    a6.w("recordWorkManagerWorkStarted");
                    a6.d(new uol(obj13, 15));
                    upv upvVar = (upv) a6.b().n();
                    try {
                        upr uprVar = (upr) upvVar.cM();
                        if (uprVar == null) {
                            gswVar = new gsw();
                        } else {
                            try {
                                ((upp) ((WorkQueueWorkerShim) obj14).f.b()).b(uprVar);
                                gswVar = new gsw();
                            } catch (unr e) {
                                throw new AssertionError("Unhandled exception", e);
                            }
                        }
                        upvVar.close();
                        return gswVar;
                    } catch (Throwable th5) {
                        try {
                            upvVar.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (urnVar == urn.RETRY) {
                    return new gsv();
                }
                return new gsw();
            default:
                alvw m = utt.a.m();
                alvz alvzVar = uuj.a;
                ?? r2 = this.b;
                m.X(alvzVar, r2);
                ((alwl) m.h("com/google/android/apps/messaging/shared/experiments/PhenotypeHelper", "commitCsLibPhenotypeAsync", 130, "PhenotypeHelper.java")).t("CsLib Ph flags committed. success: %b", (Boolean) obj);
                utt uttVar = (utt) this.a;
                if (albo.ar(r2, "com.google.android.ims.library")) {
                    alwl alwlVar = (alwl) utt.a.g();
                    alwlVar.X(uuj.b, r2);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/experiments/PhenotypeHelper", "commitCsLibPhenotypeAsync", 137, "PhenotypeHelper.java")).q("Notify about updates in current package");
                    Intent a7 = lqn.f(uttVar.b, acyt.class, RcsIntents.ACTION_CSLIB_FLAGS_UPDATED).a();
                    a7.putExtra(RcsIntents.EXTRA_MENDEL_PACKAGE_NAME, (String) r2);
                    uttVar.b.sendBroadcast(a7);
                    acpq.I(uttVar.b);
                    uttVar.a();
                } else {
                    alwl alwlVar2 = (alwl) utt.a.g();
                    alwlVar2.X(uuj.b, "com.google.android.ims.library");
                    alwlVar2.X(uuj.a, r2);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/experiments/PhenotypeHelper", "commitCsLibPhenotypeAsync", 154, "PhenotypeHelper.java")).q("Skipping sending updates, package not current.");
                }
                return null;
        }
    }

    public /* synthetic */ raw(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
