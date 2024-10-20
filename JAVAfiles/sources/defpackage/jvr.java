package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvr extends arpw implements arqv {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(aov aovVar, jym jymVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = aovVar;
        this.b = jymVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 17:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 18:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((jvr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v105, types: [kjf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v68, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r14v73, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, nfw] */
    /* JADX WARN: Type inference failed for: r1v39, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r1v65, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, miz] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = 4;
        Integer num = null;
        switch (this.d) {
            case 0:
                arpl arplVar = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj2 = this.b;
                    lny lnyVar = new lny(yjh.RECORD_AUDIO_PERMISSIONS);
                    this.a = 1;
                    obj = ((jvs) obj2).j.a(lnyVar, this);
                    if (obj == arplVar) {
                        return arplVar;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    ((jvs) this.b).g((Context) this.c, R.string.voice_messages_hold_to_record_tooltip_text);
                } else {
                    ((jvs) this.b).g((Context) this.c, R.string.microphone_permission_denied_text);
                }
                return arnb.a;
            case 1:
                arpl arplVar2 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj3 = this.c;
                    Object obj4 = this.b;
                    jlc jlcVar = jlc.p;
                    this.a = 1;
                    jvf jvfVar = (jvf) obj3;
                    obj = juu.b(jvfVar.g, "location_saved_state_pending_result", jvfVar.j, (String) obj4, jlcVar, this);
                    if (obj == arplVar2) {
                        return arplVar2;
                    }
                }
                ru ruVar = (ru) obj;
                if (ruVar == null) {
                    return arnb.a;
                }
                ((jvf) this.c).b(ruVar);
                return arnb.a;
            case 2:
                arpl arplVar3 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    alvw d = jvs.a.d();
                    d.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter$onLongPress$1", "invokeSuspend", 117, "VoiceInputUiAdapter.kt")).q("Voice input long press");
                    if (((jvw) ((jvs) this.b).c.b()).i()) {
                        return true;
                    }
                    Object obj5 = this.b;
                    Object obj6 = this.c;
                    this.a = 1;
                    obj = ((jvs) obj5).h((Context) obj6, 3, this);
                    if (obj == arplVar3) {
                        return arplVar3;
                    }
                }
                return obj;
            case 3:
                arpl arplVar4 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj7 = this.b;
                    Object obj8 = this.c;
                    this.a = 1;
                    obj = ((jvs) obj7).h((Context) obj8, 4, this);
                    if (obj == arplVar4) {
                        return arplVar4;
                    }
                }
                ((Boolean) obj).booleanValue();
                return arnb.a;
            case 4:
                arpl arplVar5 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj9 = this.b;
                    Object obj10 = this.c;
                    this.a = 1;
                    if (((jvw) obj9).l.v((Uri) obj10, null, null, this) == arplVar5) {
                        return arplVar5;
                    }
                }
                return arnb.a;
            case 5:
                arpl arplVar6 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj11 = this.c;
                    this.a = 1;
                    obj = arrn.U(((jwd) obj11).d, this);
                    if (obj == arplVar6) {
                        return arplVar6;
                    }
                }
                alog alogVar = (alog) obj;
                if (alogVar.isEmpty()) {
                    alvw d2 = jwd.a.d();
                    d2.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$check$1", "invokeSuspend", 51, "ActiveSimChecker.kt")).q("No active self identities, not showing SIM picker dialog");
                    return arnb.a;
                }
                if (alogVar.size() == 1) {
                    alvw g = jwd.a.g();
                    g.X(alwp.a, "BugleComposeRow2");
                    ((alvg) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$check$1", "invokeSuspend", 58, "ActiveSimChecker.kt")).B("Automatically switching SIM to id: %s, subId: %s", ((nfw) aqjn.ag(alogVar)).f(), ((nfw) aqjn.ag(alogVar)).b());
                    ?? r14 = this.b;
                    Object ag = aqjn.ag(alogVar);
                    ag.getClass();
                    r14.a(ag);
                    return arnb.a;
                }
                if (!((jwd) this.c).e.compareAndSet(false, true)) {
                    alvw d3 = jwd.a.d();
                    d3.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$check$1", "invokeSuspend", 68, "ActiveSimChecker.kt")).q("Already displaying SIM picker dialog");
                    return arnb.a;
                }
                alvw d4 = jwd.a.d();
                d4.X(alwp.a, "BugleComposeRow2");
                ((alvg) d4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$check$1", "invokeSuspend", 72, "ActiveSimChecker.kt")).r("Displaying SIM picker dialog with %d subscriptions", alogVar.size());
                Object obj12 = this.c;
                ((jwd) obj12).f.e(false, new eiw(obj12, (Object) alogVar, this.b, 6, (char[]) null));
                return arnb.a;
            case 6:
                arpl arplVar7 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    ?? r142 = this.b;
                    gbw gbwVar = new gbw(this.c, 11);
                    this.a = 1;
                    if (r142.a(gbwVar, this) == arplVar7) {
                        return arplVar7;
                    }
                }
                return arnb.a;
            case 7:
                arpl arplVar8 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    alvw d5 = jwi.a.d();
                    d5.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d5.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl$onSelect$1", "invokeSuspend", 145, "SimSelectorUiAdapterImpl.kt")).t("Selected self identity: %s", this.b);
                    Object obj13 = this.c;
                    jwi jwiVar = (jwi) obj13;
                    akul r = jwiVar.e.r(jwiVar.c, this.b);
                    r.getClass();
                    this.a = 1;
                    obj = arro.F(r, this);
                    if (obj == arplVar8) {
                        return arplVar8;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    alvw d6 = jwi.a.d();
                    d6.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d6.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl$onSelect$1", "invokeSuspend", 149, "SimSelectorUiAdapterImpl.kt")).t("Updated the conversation active self identity: %s", this.b);
                } else {
                    alvw g2 = jwi.a.g();
                    g2.X(alwp.a, "BugleComposeRow2");
                    ((alvg) g2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl$onSelect$1", "invokeSuspend", 151, "SimSelectorUiAdapterImpl.kt")).q("Failed to update the conversation active self identity");
                }
                return arnb.a;
            case 8:
                Object obj14 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj15 = this.c;
                    Object obj16 = this.b;
                    this.a = 1;
                    alvg alvgVar = (alvg) jwy.a.g().h("com/google/android/apps/messaging/conversation2/customthemes/SelectedThemeTracker", "updateSelectedTheme$third_party_java_src_android_app_bugle_phone_java_com_google_android_apps_messaging_conversation2_customthemes_theme_tracker_AUTO_DEPS_ORIGINAL", 119, "SelectedThemeTracker.kt");
                    if (obj16 != null) {
                        num = new Integer(((jxb) obj16).a);
                    }
                    jwy jwyVar = ((jwt) obj15).b;
                    alvgVar.t("Update selected theme to theme id: %s", num);
                    akul o = jwyVar.c.o(jwyVar.b, new mno((jxb) obj16, jwyVar, 1));
                    o.getClass();
                    Object F = arro.F(o, this);
                    if (F != arpl.a) {
                        F = arnb.a;
                    }
                    if (F == obj14) {
                        return obj14;
                    }
                }
                return arnb.a;
            case 9:
                arpl arplVar9 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    ?? r143 = this.b;
                    Object obj17 = this.c;
                    asai a = r143.a();
                    enj enjVar = new enj((jyk) obj17, (arpe) null, 3);
                    this.a = 1;
                    if (armd.q(a, enjVar, this) == arplVar9) {
                        return arplVar9;
                    }
                }
                return arnb.a;
            case 10:
                arpl arplVar10 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj18 = this.c;
                    ?? r1 = this.b;
                    this.a = 1;
                    if (((jyk) obj18).C.b(r1, this) == arplVar10) {
                        return arplVar10;
                    }
                }
                return arnb.a;
            case 11:
                arpl arplVar11 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    asai a2 = cao.a(new jyb(this.c, 5));
                    gbw gbwVar2 = new gbw(this.b, 12);
                    this.a = 1;
                    if (a2.a(gbwVar2, this) == arplVar11) {
                        return arplVar11;
                    }
                }
                return arnb.a;
            case 12:
                arpl arplVar12 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj19 = this.c;
                    Object obj20 = this.b;
                    this.a = 1;
                    if (((kbu) obj19).b((mty) obj20, this) == arplVar12) {
                        return arplVar12;
                    }
                }
                return arnb.a;
            case 13:
                arpl arplVar13 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    akul s = ((kbu) this.c).d.s((mty) this.b);
                    this.a = 1;
                    if (arro.F(s, this) == arplVar13) {
                        return arplVar13;
                    }
                }
                return arnb.a;
            case 14:
                arpl arplVar14 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj21 = this.c;
                    Object obj22 = this.b;
                    this.a = 1;
                    if (((kbu) obj21).a((mty) obj22, this) == arplVar14) {
                        return arplVar14;
                    }
                }
                return arnb.a;
            case 15:
                arpl arplVar15 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj23 = this.c;
                    ?? r12 = this.b;
                    this.a = 1;
                    if (((kcc) obj23).c(r12, this) == arplVar15) {
                        return arplVar15;
                    }
                }
                return arnb.a;
            case 16:
                arpl arplVar16 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj24 = this.b;
                    kcl kclVar = (kcl) this.c;
                    if (true == kclVar.b) {
                        i = 3;
                    }
                    akul q = ((kcr) obj24).f.q(kclVar.a.b(), i);
                    q.getClass();
                    this.a = 1;
                    if (arro.F(q, this) == arplVar16) {
                        return arplVar16;
                    }
                }
                return arnb.a;
            case 17:
                arpl arplVar17 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    akul q2 = ((kcr) this.b).f.q(((kcl) this.c).a.b(), 2);
                    q2.getClass();
                    this.a = 1;
                    if (arro.F(q2, this) == arplVar17) {
                        return arplVar17;
                    }
                }
                return arnb.a;
            case 18:
                arpl arplVar18 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    alvw g3 = kcr.a.g();
                    g3.X(alwp.a, "BugleImage");
                    ((alvg) g3.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$onDownloadClicked$1", "invokeSuspend", 644, "ImageBubbleUiAdapter.kt")).t("Resuming file transfer for messageId=%s", this.b);
                    akul p = ((kcr) this.c).f.p(this.b);
                    this.a = 1;
                    obj = arro.F(p, this);
                    if (obj == arplVar18) {
                        return arplVar18;
                    }
                }
                return arnb.a;
            case 19:
                arpl arplVar19 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj25 = this.c;
                    ?? r13 = this.b;
                    this.a = 1;
                    if (((kcy) obj25).a(r13, this) == arplVar19) {
                        return arplVar19;
                    }
                }
                return arnb.a;
            default:
                arpl arplVar20 = arpl.a;
                int i2 = this.a;
                aqil.P(obj);
                if (i2 == 0) {
                    akul o2 = ((kcy) this.c).d.o(this.b.b());
                    o2.getClass();
                    this.a = 1;
                    if (arro.F(o2, this) == arplVar20) {
                        return arplVar20;
                    }
                }
                return arnb.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [kjf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v8, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, nfw] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, miz] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.d) {
            case 0:
                return new jvr((jvs) this.b, (Context) this.c, arpeVar, 0);
            case 1:
                return new jvr((jvf) this.c, arpeVar, 1);
            case 2:
                return new jvr((jvs) this.b, (Context) this.c, arpeVar, 2, (byte[]) null);
            case 3:
                return new jvr((jvs) this.b, (Context) this.c, arpeVar, 3, (char[]) null);
            case 4:
                return new jvr((jvw) this.b, (Uri) this.c, arpeVar, 4);
            case 5:
                return new jvr((jwd) this.c, (arqr) this.b, arpeVar, 5);
            case 6:
                return new jvr((asai) this.b, (jwi) this.c, arpeVar, 6);
            case 7:
                return new jvr((nfw) this.b, (jwi) this.c, arpeVar, 7);
            case 8:
                return new jvr((jwt) this.c, (jxb) this.b, arpeVar, 8);
            case 9:
                return new jvr((kjf) this.b, (jyk) this.c, arpeVar, 9);
            case 10:
                return new jvr((jyk) this.c, (MessageId) this.b, arpeVar, 10);
            case 11:
                return new jvr((aov) this.c, (jym) this.b, arpeVar, 11);
            case 12:
                return new jvr((kbu) this.c, (mty) this.b, arpeVar, 12);
            case 13:
                return new jvr((kbu) this.c, (mty) this.b, arpeVar, 13, (byte[]) null);
            case 14:
                return new jvr((kbu) this.c, (mty) this.b, arpeVar, 14, (char[]) null);
            case 15:
                return new jvr((kcc) this.c, (miz) this.b, arpeVar, 15);
            case 16:
                return new jvr((kcr) this.b, (kcl) this.c, arpeVar, 16);
            case 17:
                return new jvr((kcr) this.b, (kcl) this.c, arpeVar, 17, (byte[]) null);
            case 18:
                return new jvr((MessageId) this.b, (kcr) this.c, arpeVar, 18);
            case 19:
                return new jvr((kcy) this.c, (miz) this.b, arpeVar, 19);
            default:
                return new jvr((kcy) this.c, (miz) this.b, arpeVar, 20, (byte[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(asai asaiVar, jwi jwiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = asaiVar;
        this.c = jwiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(MessageId messageId, kcr kcrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = messageId;
        this.c = kcrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(jvf jvfVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = jvfVar;
        this.b = "Location";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(jvs jvsVar, Context context, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = jvsVar;
        this.c = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(jvs jvsVar, Context context, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.d = i;
        this.b = jvsVar;
        this.c = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(jvs jvsVar, Context context, arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.d = i;
        this.b = jvsVar;
        this.c = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(jvw jvwVar, Uri uri, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = jvwVar;
        this.c = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(jwd jwdVar, arqr arqrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = jwdVar;
        this.b = arqrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(jwt jwtVar, jxb jxbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = jwtVar;
        this.b = jxbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(jyk jykVar, MessageId messageId, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = jykVar;
        this.b = messageId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(kbu kbuVar, mty mtyVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = kbuVar;
        this.b = mtyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(kbu kbuVar, mty mtyVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.d = i;
        this.c = kbuVar;
        this.b = mtyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(kbu kbuVar, mty mtyVar, arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.d = i;
        this.c = kbuVar;
        this.b = mtyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(kcc kccVar, miz mizVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = kccVar;
        this.b = mizVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(kcr kcrVar, kcl kclVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = kcrVar;
        this.c = kclVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(kcr kcrVar, kcl kclVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.d = i;
        this.b = kcrVar;
        this.c = kclVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(kcy kcyVar, miz mizVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = kcyVar;
        this.b = mizVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(kcy kcyVar, miz mizVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.d = i;
        this.c = kcyVar;
        this.b = mizVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(kjf kjfVar, jyk jykVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = kjfVar;
        this.c = jykVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvr(nfw nfwVar, jwi jwiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = nfwVar;
        this.c = jwiVar;
    }
}
