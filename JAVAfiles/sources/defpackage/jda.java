package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jda extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(aahp aahpVar, arqg arqgVar, ConversationIdType conversationIdType, byn bynVar, int i) {
        super(0);
        this.e = i;
        this.d = aahpVar;
        this.b = arqgVar;
        this.c = conversationIdType;
        this.a = bynVar;
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [khb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v149, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v165, types: [java.lang.Object, zdy] */
    /* JADX WARN: Type inference failed for: r0v169, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v181, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v184, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v191, types: [java.lang.Object, ddz] */
    /* JADX WARN: Type inference failed for: r0v192, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v204, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v207, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [khb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v58, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, ddz] */
    /* JADX WARN: Type inference failed for: r0v79, types: [khb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [khb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [khb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, nfw] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [myn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v50, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v64, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v90, types: [aeva, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [myn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [asai, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        boolean booleanValue;
        ?? r0;
        long j = 0;
        int i = 3;
        boolean z = false;
        arxm arxmVar = null;
        switch (this.e) {
            case 0:
                ((jdb) this.a).h.a(this.b, this.c, this.d);
                return arnb.a;
            case 1:
                throw null;
            case 2:
                Object e = jcv.a.e();
                e.getClass();
                ((jdk) this.c).a.a(aqjn.aK(((khd) this.b).a, (CharSequence) e, null, null, new jbs(11), 30), ((Context) this.a).getString(R.string.message_context_menu_text_copied_toast_text));
                this.d.b();
                return arnb.a;
            case 3:
                this.c.a();
                ((jwd) this.a).e.set(false);
                alvw g = jwd.a.g();
                g.X(alwp.a, "BugleComposeRow2");
                alvg alvgVar = (alvg) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$showSimDialog$1$1$1", "invoke", 109, "ActiveSimChecker.kt");
                ?? r2 = this.d;
                alvgVar.B("Switching SIM from mSim dialog to id: %s, subId: %s", r2.f(), r2.b());
                Object obj = this.d;
                obj.getClass();
                this.b.a(obj);
                return arnb.a;
            case 4:
                booleanValue = ((Boolean) this.d.a()).booleanValue();
                if (booleanValue && (r0 = this.b) != 0) {
                    Object obj2 = this.a;
                    r0.a();
                    InputMethodManager inputMethodManager = (InputMethodManager) ((Context) obj2).getSystemService(InputMethodManager.class);
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(((View) this.c).getWindowToken(), 0);
                    }
                }
                return arnb.a;
            case 5:
                if (((ansy) ((oxo) ((jzf) this.a).f).a.b()).e("bugle.enable_active_composers_bottom_sheet")) {
                    jzf jzfVar = (jzf) this.a;
                    jzfVar.k.c(new jze((arwe) this.d, jzfVar, (alog) this.c, (asai) this.b, 0));
                }
                return arnb.a;
            case 6:
                if (((kcg) this.a).c.e()) {
                    ((kcg) this.a).c.c(this.b);
                } else {
                    Object obj3 = this.a;
                    Object obj4 = this.c;
                    ?? r3 = this.d;
                    Uri d = r3.d();
                    d.getClass();
                    String j2 = r3.j();
                    j2.getClass();
                    ((kcr) ((kcg) obj3).a).r.a(obj4, d, j2);
                }
                return arnb.a;
            case 7:
                if (((kcg) this.a).c.e()) {
                    ((kcg) this.a).c.c(this.b);
                } else {
                    Object obj5 = this.a;
                    Object obj6 = this.c;
                    ?? r22 = this.d;
                    Uri d2 = r22.d();
                    d2.getClass();
                    String j3 = r22.j();
                    j3.getClass();
                    long j4 = arut.a;
                    ((ken) ((kcg) obj5).b).j.f(obj6, d2, j3, new arut(j), true);
                }
                return arnb.a;
            case 8:
                alvw g2 = kcr.a.g();
                g2.X(alwp.a, "BugleImage");
                alvg alvgVar2 = (alvg) g2.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$createUiDataFlow$defaultUiData$2", "invoke", 261, "ImageBubbleUiAdapter.kt");
                Object obj7 = this.a;
                obj7.getClass();
                alvgVar2.t("Clicked on image with uri: %s", yyb.bc((Uri) obj7));
                Object obj8 = this.b;
                if (obj8 == null || !((myz) obj8).b) {
                    if (!d.F(this.a, Uri.EMPTY)) {
                        Object obj9 = this.d;
                        Object obj10 = this.c;
                        Object obj11 = this.a;
                        obj11.getClass();
                        kcl kclVar = (kcl) obj10;
                        String j5 = kclVar.f.j();
                        j5.getClass();
                        ((kcr) obj9).r.a(kclVar.a, obj11, j5);
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                Object obj12 = this.d;
                ?? r4 = this.c;
                ?? r32 = this.b;
                kcr kcrVar = (kcr) this.a;
                qjh.l(kcrVar.c, kcrVar.d, new hak((ascd) r32, (MessageId) r4, (aers) obj12, kcrVar, (arpe) null, 9), 2);
                return arnb.a;
            case 10:
                String a = kdu.a(((ndk) this.b).g());
                String a2 = kdu.a(((ndk) this.b).e());
                ndk ndkVar = (ndk) this.b;
                String f = ndkVar.f();
                String e2 = ndkVar.e();
                aesb aesbVar = new aesb();
                Object obj13 = this.d;
                Object obj14 = this.b;
                Object obj15 = this.c;
                return new aesc(a, a2, f, (Uri) this.a, e2, ((kdu) obj15).e, aesbVar, new kdt(obj15, obj14, obj13, 1));
            case 11:
                Object obj16 = this.b;
                Object obj17 = this.c;
                ked kedVar = (ked) this.d;
                kdv kdvVar = (kdv) obj17;
                List b = kedVar.b(kdvVar, (String) obj16);
                kds kdsVar = (kds) this.a;
                return kedVar.c(kdvVar, kdsVar.a, ked.d(aqjn.aq(kdsVar.b, b)), kac.q);
            case 12:
                Object obj18 = this.b;
                obj18.getClass();
                long j6 = arut.a;
                ((ken) this.d).j.f(((keg) this.c).a, this.a, obj18, new arut(j), true);
                return true;
            case 13:
                Object obj19 = this.c;
                ?? r42 = this.d;
                ?? r33 = this.b;
                ken kenVar = (ken) this.a;
                qjh.l(kenVar.b, kenVar.d, new hak((ascd) r33, (MessageId) r42, (kep) obj19, kenVar, (arpe) null, 10), 2);
                return arnb.a;
            case 14:
                try {
                    Object obj20 = this.c;
                    alvi alviVar = rqg.a;
                    agnc.d("$primary");
                    rkb rkbVar = ((rqg) obj20).b;
                    rkbVar.d(rkbVar.b(), rkbVar.a(), "backupDb");
                    alvw g3 = rqg.a.g();
                    g3.X(alwp.a, "BugleBackup");
                    ((alvg) g3.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl$restoreFromBackupDatabase$2$1$1$1", "invoke", 68, "DatabaseRestorerImpl.kt")).q("Restoring participants table");
                    long c = rjt.c("DatabaseRestorerImpl::restoreFromBackupDatabase#participantsTable", new quz(this.b, this.c, 4, null));
                    alvw g4 = rqg.a.g();
                    g4.X(alwp.a, "BugleBackup");
                    ((alvg) g4.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl$restoreFromBackupDatabase$2$1$1$1", "invoke", 77, "DatabaseRestorerImpl.kt")).s("Participants restore time: [%s]ms", arut.g(c));
                    alvw g5 = rqg.a.g();
                    g5.X(alwp.a, "BugleBackup");
                    ((alvg) g5.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl$restoreFromBackupDatabase$2$1$1$1", "invoke", 80, "DatabaseRestorerImpl.kt")).q("Restoring conversations table");
                    long c2 = rjt.c("DatabaseRestorerImpl::restoreFromBackupDatabase#conversationsTable", new quz(this.a, this.c, 5));
                    alvw g6 = rqg.a.g();
                    g6.X(alwp.a, "BugleBackup");
                    ((alvg) g6.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl$restoreFromBackupDatabase$2$1$1$1", "invoke", 91, "DatabaseRestorerImpl.kt")).s("Conversations restore time: [%s]ms", arut.g(c2));
                    alvw g7 = rqg.a.g();
                    g7.X(alwp.a, "BugleBackup");
                    ((alvg) g7.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl$restoreFromBackupDatabase$2$1$1$1", "invoke", 94, "DatabaseRestorerImpl.kt")).q("Restoring messages table");
                    long c3 = rjt.c("DatabaseRestorerImpl::restoreFromBackupDatabase#messagesTable", new rqd((lrf) this.d, (rqg) this.c));
                    alvw g8 = rqg.a.g();
                    g8.X(alwp.a, "BugleBackup");
                    ((alvg) g8.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl$restoreFromBackupDatabase$2$1$1$1", "invoke", 101, "DatabaseRestorerImpl.kt")).s("Messages restore time: [%s]ms", arut.g(c3));
                } finally {
                    try {
                        ((rqg) this.c).b();
                        return arnb.a;
                    } catch (Throwable th) {
                    }
                }
                ((rqg) this.c).b();
                return arnb.a;
            case 15:
                ((zen) ((zap) this.d).f).b(yzc.a((mkh) this.c, ((agoe) this.a).b));
                if (((zem) this.b).d == zep.a) {
                    zap zapVar = (zap) this.d;
                    qjh.l(zapVar.a, null, new yqs(zapVar, (agoe) this.a, (arpe) null, 14), 3);
                }
                ((zap) this.d).a();
                return arnb.a;
            case 16:
                Object obj21 = this.c;
                vox voxVar = vox.PROFILE_PEOPLE_SHARING_SOURCE;
                voo vooVar = (voo) obj21;
                voq voqVar = vooVar.f;
                String c4 = vom.c(voqVar.c, voqVar.e, voxVar);
                ?? r15 = this.a;
                if (c4 == null) {
                    c4 = hwr.A(r15);
                }
                ((zen) ((ahmv) this.d).f).b(new ChipData(r15, c4, null, vooVar.g.a, false, 20, null));
                ((zbk) ((ahmv) this.d).i).d();
                if (((zem) this.b).d == zep.a) {
                    ahmv ahmvVar = (ahmv) this.d;
                    qjh.l(ahmvVar.c, null, new yqs(ahmvVar, (msh) this.a, (arpe) null, 19), 3);
                }
                ((ahmv) this.d).e.c();
                return arnb.a;
            case 17:
                igz igzVar = (igz) ((aahp) this.d).c.b();
                Object obj22 = this.a;
                ihb a3 = ihg.a();
                a3.c((ConversationIdType) obj22);
                a3.d(ihe.RBM_BLOCK);
                a3.e = 1;
                a3.d = hld.j((ParticipantsTable.BindData) this.c);
                a3.b = (ParticipantsTable.BindData) this.c;
                a3.c = new ige(2);
                a3.a = new aafg(this.b, i);
                a3.e();
                a3.f = 9;
                igzVar.d(a3.a());
                psi psiVar = (psi) ((aahp) this.d).d.b();
                aozy createBuilder = amtn.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amtn amtnVar = (amtn) createBuilder.b;
                amtnVar.c = 2;
                amtnVar.b |= 1;
                psiVar.h((amtn) createBuilder.s());
                return arnb.a;
            case 18:
                this.a.h(false);
                ((aahp) this.d).f = true;
                this.b.a();
                ((qxr) ((aahp) this.d).b.b()).o((ConversationIdType) this.c, psk.HIDE, true);
                return arnb.a;
            case 19:
                ?? r02 = this.d;
                if (r02 != 0) {
                    Object obj23 = this.a;
                    r02.a();
                    InputMethodManager inputMethodManager2 = (InputMethodManager) ((Context) obj23).getSystemService(InputMethodManager.class);
                    if (inputMethodManager2 != null) {
                        inputMethodManager2.hideSoftInputFromWindow(((View) this.c).getWindowToken(), 0);
                    }
                }
                this.b.a();
                return arnb.a;
            default:
                arqr arqrVar = ((aeun) this.c).c;
                if (arqrVar != null) {
                    arqrVar.a(((ascd) ((arsb) this.d).a).c());
                }
                if (((aeun) this.c).d != null) {
                    arxm arxmVar2 = (arxm) this.a.a();
                    if (arxmVar2 != null) {
                        arxmVar2.v(null);
                    }
                    ?? r03 = this.a;
                    ?? r23 = this.c;
                    ascd ascdVar = (ascd) ((arsb) this.d).a;
                    ?? r43 = this.b;
                    if (((aeun) r23).d != null) {
                        arxmVar = arrn.J(r43, null, null, new gbz((aeva) r23, ascdVar, (arpe) null, 11), 3);
                    }
                    r03.h(arxmVar);
                }
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(aeva aevaVar, arsb arsbVar, arwe arweVar, byn bynVar, int i) {
        super(0);
        this.e = i;
        this.c = aevaVar;
        this.d = arsbVar;
        this.b = arweVar;
        this.a = bynVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(ddz ddzVar, Context context, View view, cas casVar, int i) {
        super(0);
        this.e = i;
        this.b = ddzVar;
        this.a = context;
        this.c = view;
        this.d = casVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(Object obj, Object obj2, Object obj3, arqg arqgVar, int i) {
        super(0);
        this.e = i;
        this.d = obj;
        this.a = obj2;
        this.c = obj3;
        this.b = arqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        super(0);
        this.e = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
        this.d = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(Object obj, Object obj2, Object obj3, Object obj4, int i, char[] cArr) {
        super(0);
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.d = obj3;
        this.c = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(Object obj, Object obj2, Object obj3, Object obj4, int i, short[] sArr) {
        super(0);
        this.e = i;
        this.d = obj;
        this.c = obj2;
        this.a = obj3;
        this.b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(jzf jzfVar, arwe arweVar, alog alogVar, asai asaiVar, int i) {
        super(0);
        this.e = i;
        this.a = jzfVar;
        this.d = arweVar;
        this.c = alogVar;
        this.b = asaiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(lrc lrcVar, jwd jwdVar, nfw nfwVar, arqr arqrVar, int i) {
        super(0);
        this.e = i;
        this.c = lrcVar;
        this.a = jwdVar;
        this.d = nfwVar;
        this.b = arqrVar;
    }
}
