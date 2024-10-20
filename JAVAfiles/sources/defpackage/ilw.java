package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.videotrimmer.FileInfoResult;
import j$.util.Optional;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilw implements ila {
    public rsa A;
    public EditText B;
    public final imk C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final rsr G;
    public EditText H;
    public ltx I;
    public a J;
    public ilb K;
    public EditText L;
    public final ily M;
    public ammc N;
    public rtj O;
    public final armf P;
    public final armf Q;
    public final armf R;
    public final armf S;
    public final armf T;
    public final xvv U;
    public final armf V;
    public final armf W;
    public final armf X;
    public final armf Y;
    public final eoy Z;
    public final hwo aa;
    public final iji ab;
    public final aohs ac;
    private final armf ae;
    private final armf af;
    private final armf ag;
    private final armf ah;
    private final armf ai;
    private final armf aj;
    private final armf ak;
    private ikl al;
    private Optional am = Optional.empty();
    private final armf an;
    private final kor ao;
    private final kor ap;
    public final ajwt b;
    public final mci c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final BugleConversationId g;
    public final rru h;
    public final armf i;
    public final armf j;
    public final cg k;
    public final akbo l;
    public final InputMethodManager m;
    public final rtg n;
    public final armf o;
    public final ryg p;
    public final armf q;
    public final Optional r;
    public final yya s;
    public final armf t;
    public final akgu u;
    public final aksr v;
    public final lbi w;
    public AttachmentsContainer x;
    public ComposeMessageView y;
    public rre z;
    private static final alwo ad = alwo.o("BugleHqms");
    public static final alwo a = alwo.o("BugleDraft");

    public ilw(armf armfVar, armf armfVar2, armf armfVar3, mci mciVar, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, hwo hwoVar, armf armfVar10, eoy eoyVar, lig ligVar, armf armfVar11, rss rssVar, armf armfVar12, cg cgVar, akbo akboVar, kor korVar, InputMethodManager inputMethodManager, rtg rtgVar, iji ijiVar, armf armfVar13, armf armfVar14, armf armfVar15, Optional optional, yya yyaVar, armf armfVar16, aohs aohsVar, akgu akguVar, aksr aksrVar, lbi lbiVar, armf armfVar17, kor korVar2, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, String str, ajwt ajwtVar, armf armfVar26, armf armfVar27, armf armfVar28, armf armfVar29) {
        this.V = armfVar;
        this.W = armfVar2;
        this.X = armfVar3;
        this.c = mciVar;
        this.d = armfVar4;
        this.ae = armfVar5;
        this.e = armfVar6;
        this.af = armfVar7;
        this.ag = armfVar8;
        this.f = armfVar9;
        this.aa = hwoVar;
        this.h = (rru) armfVar10.b();
        this.Z = eoyVar;
        this.i = armfVar19;
        this.U = new xvv("convo1_dsdr_groups", new gvc(armfVar27, 2));
        this.Y = armfVar29;
        this.C = ligVar.g(ruy.b(str));
        rsr a2 = rssVar.a(ruy.b(str), false);
        this.G = a2;
        this.j = armfVar12;
        this.k = cgVar;
        this.l = akboVar;
        this.ao = korVar;
        this.m = inputMethodManager;
        this.n = rtgVar;
        this.ab = ijiVar;
        this.o = armfVar13;
        this.p = (ryg) armfVar14.b();
        this.q = armfVar15;
        this.r = optional;
        this.s = yyaVar;
        this.t = armfVar16;
        this.ac = aohsVar;
        this.u = akguVar;
        this.v = aksrVar;
        this.w = lbiVar;
        this.ai = armfVar17;
        this.ap = korVar2;
        this.aj = armfVar18;
        this.ak = armfVar20;
        this.g = new BugleConversationId(ruy.b(str));
        this.b = ajwtVar;
        this.ah = armfVar21;
        this.Q = armfVar22;
        this.R = armfVar23;
        this.an = armfVar24;
        this.S = armfVar25;
        this.T = armfVar26;
        this.P = armfVar28;
        qdq qdqVar = (qdq) armfVar11.b();
        kqz kqzVar = (kqz) qdqVar.a;
        apya apyaVar = kqzVar.b.n;
        krv krvVar = kqzVar.a;
        this.M = new ily(a2, apyaVar, krvVar.dt, (psw) krvVar.hG.b(), (ryg) ((kqz) qdqVar.a).a.ok.b(), (msk) ((kqz) qdqVar.a).a.dd.b());
    }

    private final void A(String str) {
        r(str).ifPresent(new ile(6));
    }

    private final boolean B() {
        ily ilyVar = this.M;
        boolean z = false;
        if (ilyVar.c.ac() && ilyVar.g) {
            z = true;
        }
        ((alwl) a.m().h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "updateDraftMessageType", 1450, "DraftEditorFragmentPeer.java")).t("isRcsSendingEnabled in compose view: %s", Boolean.valueOf(z));
        boolean ag = this.G.ag(z);
        if (ag) {
            this.y.E().c.T();
            this.y.E().c.V();
        }
        return ag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(MessageCoreData messageCoreData, boolean z) {
        this.C.d(messageCoreData, z);
    }

    @Override // defpackage.ila
    public final int a(MessagePartCoreData messagePartCoreData) {
        if (this.G.S(Collections.singletonList(messagePartCoreData), this.y.E().s().b())) {
            boolean z = false;
            if (messagePartCoreData instanceof PendingAttachmentData) {
                f(false);
                this.y.E().x();
            } else {
                this.y.E().y(true);
                ((gpx) this.an.b()).x();
            }
            if (((Boolean) vof.a.e()).booleanValue() && messagePartCoreData.bi() && messagePartCoreData.t() != null) {
                Uri t = messagePartCoreData.t();
                t.getClass();
                alog r = alog.r(t.toString());
                boolean isPresent = this.ao.c().isPresent();
                if (!r.isEmpty()) {
                    if (isPresent) {
                        ((alwl) ad.m().h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "requestMediaUploadStates", 820, "DraftEditorFragmentPeer.java")).q("Requesting upload states from Google Photos Api Client.");
                        this.l.c(new ahlp(((vnz) this.ao.c().get()).a()), this.w);
                    }
                } else if (isPresent) {
                    alwl alwlVar = (alwl) ad.m().h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "requestMediaUploadStates", 813, "DraftEditorFragmentPeer.java");
                    boolean isEmpty = r.isEmpty();
                    if (this.b != null) {
                        z = true;
                    }
                    alwlVar.I("Conditions not met to request upload states, attachmentUrisEmpty=%s, isLocalAccountIdDefined=%s.", isEmpty, z);
                }
            }
            s();
        } else if (((Boolean) ipe.g.e()).booleanValue()) {
            return -1;
        }
        return this.G.k() - 1;
    }

    @Override // defpackage.ila
    public final cg b() {
        return this.k;
    }

    @Override // defpackage.ila
    public final EditText c() {
        return this.L;
    }

    @Override // defpackage.ila
    public final rsr d() {
        return this.G;
    }

    @Override // defpackage.ila
    @Deprecated
    public final ComposeMessageView e() {
        return this.y;
    }

    @Override // defpackage.ila
    public final void f(boolean z) {
        this.B.setShowSoftInputOnFocus(z);
        if (this.B.requestFocus()) {
            this.L = this.B;
            if (z) {
                this.K.R(new ile(5), null);
            }
        }
        this.B.setShowSoftInputOnFocus(true);
    }

    @Override // defpackage.ila
    public final void g() {
        this.y.E().F();
    }

    @Override // defpackage.ila
    public final void h(long j, long j2) {
        x(new mbh(j, j2), 1, false, null);
    }

    @Override // defpackage.ila
    public final void i(boolean z, boolean z2, boolean z3) {
        y(new mbh(((xnv) this.f.b()).f().toEpochMilli(), ((xnv) this.f.b()).a()), z, z2, z3, 1);
    }

    @Override // defpackage.ila
    public final void j(rre rreVar) {
        this.z = rreVar;
        ComposeMessageView composeMessageView = this.y;
        if (composeMessageView != null) {
            composeMessageView.E().M(rreVar);
        }
    }

    @Override // defpackage.ila
    public final void k(ilb ilbVar) {
        this.K = ilbVar;
        ComposeMessageView composeMessageView = this.y;
        if (composeMessageView != null) {
            composeMessageView.E().z(ilbVar);
        }
    }

    @Override // defpackage.ila
    public final void l(MessageCoreData messageCoreData) {
        m(messageCoreData, false);
    }

    @Override // defpackage.ila
    public final void m(MessageCoreData messageCoreData, boolean z) {
        p(messageCoreData, z);
    }

    @Override // defpackage.ila, defpackage.zqe
    public final boolean n() {
        return this.y.E().W();
    }

    @Override // defpackage.ila
    public final boolean o(MessagePartCoreData messagePartCoreData) {
        boolean z = false;
        this.y.E().y(false);
        if (this.G.w(messagePartCoreData) != null) {
            z = true;
        }
        if (z) {
            s();
        }
        return z;
    }

    @Override // defpackage.ila
    public final void p(MessageCoreData messageCoreData, boolean z) {
        if (((Boolean) abdh.a.e()).booleanValue() && messageCoreData.c() == 1) {
            int i = 0;
            if (((MessagePartCoreData) messageCoreData.W().get(0)).bz()) {
                Context x = this.k.x();
                x.getClass();
                if (aabr.X(x.getPackageManager())) {
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) messageCoreData.W().get(0);
                    if (messagePartCoreData.bz()) {
                        messagePartCoreData.t().getClass();
                        this.J.a = z;
                        this.ap.c().ifPresent(new ilf(this, messageCoreData, i));
                        return;
                    }
                    return;
                }
            }
        }
        C(messageCoreData, z);
    }

    public final int q(SelfIdentityId selfIdentityId) {
        ryg rygVar = this.p;
        if (rygVar != null) {
            qwm c = rygVar.c(selfIdentityId);
            if (c != null) {
                if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
                    ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "getConversationSelfSubId", 1478, "DraftEditorFragmentPeer.java")).w("DraftEditorFragmentPeer#getConversationSelfSubId returning subId=%s for selfId=%s", c.e(), selfIdentityId);
                }
                return c.e();
            }
            if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
                ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "getConversationSelfSubId", 1486, "DraftEditorFragmentPeer.java")).t("DraftEditorFragmentPeer#getConversationSelfSubId no subscription found for selfId=%s", selfIdentityId);
                return -1;
            }
            return -1;
        }
        if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "getConversationSelfSubId", 1494, "DraftEditorFragmentPeer.java")).t("DraftEditorFragmentPeer#getConversationSelfSubId selfParticipantsData not loaded yet. Returning -1 for selfId=%s", selfIdentityId);
            return -1;
        }
        return -1;
    }

    public final Optional r(String str) {
        return Optional.ofNullable(this.k.Q).map(new ijs(str, 13));
    }

    public final void s() {
        if (!this.F) {
            this.D = true;
        }
    }

    public final void t() {
        ilb ilbVar;
        if (this.al != null && this.N != null && (ilbVar = this.K) != null) {
            ilbVar.aj();
        }
    }

    public final void u(SelfIdentityId selfIdentityId) {
        ilb ilbVar;
        this.al = rrl.d(this.h, this.g.a);
        zrb E = this.y.E();
        ikl iklVar = this.al;
        iklVar.getClass();
        E.c.B = iklVar;
        if (selfIdentityId != null && !selfIdentityId.equals(this.G.s())) {
            this.G.R(selfIdentityId, q(selfIdentityId));
            ilb ilbVar2 = this.K;
            if (ilbVar2 != null) {
                ilbVar2.aj();
            }
        }
        ily ilyVar = this.M;
        ikl iklVar2 = this.al;
        iklVar2.getClass();
        ilyVar.d = iklVar2;
        ilyVar.a();
        if (ilyVar.d == null) {
            if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
                ((alwl) ((alwl) ily.a.g()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateIsRcsConversation", 133, "DraftEditorRcsController.java")).t("DraftEditorRcsController#updateIsRcsConversation left as %s because is metadata is not loaded", Boolean.valueOf(ilyVar.f));
            }
        } else if (!ilyVar.b() && !ilyVar.d.d()) {
            if (ilyVar.d.c()) {
                nct nctVar = (nct) ilyVar.b.b();
                int q = ilyVar.c.q();
                if (ilyVar.d.k.isEmpty()) {
                    ilyVar.f = nctVar.e(nctVar.b(Optional.empty(), q));
                    if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
                        ((alwl) ((alwl) ily.a.g()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateIsRcsConversation", 155, "DraftEditorRcsController.java")).F("DraftEditorRcsController#updateIsRcsConversation=%s with subId=%s (other person has no phone number?!)", ilyVar.f, q);
                    }
                } else {
                    ilyVar.f = nctVar.e(nctVar.c(q, ilyVar.d.k));
                    if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
                        ((alwl) ((alwl) ily.a.g()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateIsRcsConversation", 166, "DraftEditorRcsController.java")).F("DraftEditorRcsController#updateIsRcsConversation=%s with subId=%s using normal 1:1 check", ilyVar.f, q);
                    }
                }
            } else {
                ilyVar.f = false;
            }
        } else {
            if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
                ((alwl) ((alwl) ily.a.g()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateIsRcsConversation", 142, "DraftEditorRcsController.java")).q("DraftEditorRcsController#updateIsRcsConversation=true because is rbm or rcs group");
            }
            ilyVar.f = true;
        }
        w("onConversationMetadataUpdated");
        ikl iklVar3 = this.al;
        iklVar3.getClass();
        if (iklVar3.d()) {
            if (iklVar3 != null && (ilbVar = this.K) != null) {
                ilbVar.aj();
                return;
            }
            return;
        }
        t();
    }

    public final void v(int i) {
        A(this.k.z().getString(i));
    }

    public final void w(String str) {
        if (!B()) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "updateDraftMessageTypeWithFailureLogging", 1440, "DraftEditorFragmentPeer.java")).t("%s: couldn't convert draft: keeping as prior type", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    public final void x(mbh mbhVar, int i, boolean z, atok atokVar) {
        atok atokVar2;
        akrh e;
        ?? r3;
        String quantityString;
        if (atokVar == null) {
            armf armfVar = this.i;
            atokVar2 = yyb.ba();
            ((xcs) armfVar.b()).g(xcr.SEND_BUTTON_LEGACY, atokVar2.b);
            ((xcs) this.i.b()).e(xcr.SEND_BUTTON_ACCURATE, atokVar2.b);
            ((xcs) this.i.b()).e(xcr.NOTIFICATION, atokVar2.b);
        } else {
            atokVar2 = atokVar;
        }
        long j = mbhVar.a;
        long j2 = mbhVar.b;
        this.x.E();
        int o = zop.o(this.G);
        this.x.E();
        int p = zop.p(this.G);
        try {
            this.K.R(new ile(1), null);
        } catch (Throwable th) {
            ((alwl) ((alwl) ((alwl) a.h()).g(th)).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "sendCheckedDraftMessage", (char) 1778, "DraftEditorFragmentPeer.java")).q("An error occurred while marking the draft as ready to send");
        }
        int i2 = 0;
        MessageCoreData v = this.G.v(j, false);
        if (v.cb()) {
            v.bJ(atokVar2);
            ((mho) this.ai.b()).ad(amgj.CONVERSATION_ACTIVITY, atokVar2, mbhVar);
            int i3 = 3;
            if (((zxy) this.e.b()).t()) {
                e = aktp.e("DraftEditorFragmentPeer::getSmartComposeSuggestionPresenter");
                try {
                    this.y.E().w().ifPresent(new ile(i3));
                    e.close();
                } finally {
                }
            }
            Optional map = this.G.o.map(new ilg(j, i2));
            e = aktp.e("DraftEditorFragmentPeer::setGooglePhotosSharingState");
            try {
                if (((Boolean) vof.a.e()).booleanValue() && !v.aD().isEmpty()) {
                    if (this.b != null) {
                        aozy createBuilder = voe.a.createBuilder();
                        aozy createBuilder2 = vod.a.createBuilder();
                        int i4 = this.b.a;
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        vod vodVar = (vod) createBuilder2.b;
                        vodVar.b |= 1;
                        vodVar.c = i4;
                        vod vodVar2 = (vod) createBuilder2.s();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        voe voeVar = (voe) createBuilder.b;
                        vodVar2.getClass();
                        voeVar.c = vodVar2;
                        voeVar.b = 101;
                        ((MessageData) v).o = (voe) createBuilder.s();
                    } else {
                        throw new IllegalStateException("Sign-in is required for Google Photos usage");
                    }
                }
                e.close();
                if (i - 1 != 0) {
                    if (!this.am.isEmpty()) {
                        if (this.y.E().c.af()) {
                            ilb ilbVar = this.K;
                            ilbVar.bv(v);
                            this.am = Optional.empty();
                            this.y.E().B();
                            r3 = 0;
                        } else {
                            throw new IllegalStateException("Scheduled send not enabled.");
                        }
                    } else {
                        throw new IllegalStateException("Cannot schedule message with empty scheduled time.");
                    }
                } else {
                    mho mhoVar = (mho) this.ai.b();
                    this.G.x();
                    mhoVar.ap(v);
                    r3 = 0;
                    this.K.bw(v, j2, z, map, Optional.of(Boolean.valueOf(this.G.p)));
                }
                this.G.G(true);
                this.y.E().F();
                this.y.E().c.z();
                this.y.E().c.J();
                f(r3);
                if (!((ykw) this.af.b()).q("save_original_media_toast_msg_showed", r3)) {
                    cj fe = this.k.fe();
                    if (fe != null && o + p > 0) {
                        Resources resources = fe.getResources();
                        String string = resources.getString(R.string.app_name);
                        if (o > 0 && p > 0) {
                            Object[] objArr = new Object[1];
                            objArr[r3] = Integer.valueOf(o);
                            String quantityString2 = resources.getQuantityString(R.plurals.original_image_plural_info, o, objArr);
                            Object[] objArr2 = new Object[1];
                            objArr2[r3] = Integer.valueOf(p);
                            String quantityString3 = resources.getQuantityString(R.plurals.original_video_plural_info, p, objArr2);
                            Object[] objArr3 = new Object[3];
                            objArr3[r3] = quantityString2;
                            objArr3[1] = quantityString3;
                            objArr3[2] = string;
                            quantityString = resources.getString(R.string.original_media_saved_info, objArr3);
                        } else if (o > 0) {
                            Object[] objArr4 = new Object[2];
                            objArr4[r3] = Integer.valueOf(o);
                            objArr4[1] = string;
                            quantityString = resources.getQuantityString(R.plurals.original_images_only_saved_info, o, objArr4);
                        } else {
                            Object[] objArr5 = new Object[2];
                            objArr5[r3] = Integer.valueOf(p);
                            objArr5[1] = string;
                            quantityString = resources.getQuantityString(R.plurals.original_videos_only_saved_info, p, objArr5);
                        }
                        A(quantityString);
                    }
                    ((ykw) this.af.b()).h("save_original_media_toast_msg_showed", true);
                }
                if (!B()) {
                    ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "sendCheckedDraftMessage", 1876, "DraftEditorFragmentPeer.java")).q("cannot set draft RCS status");
                }
            } finally {
            }
        }
    }

    public final void y(final mbh mbhVar, final boolean z, boolean z2, final boolean z3, final int i) {
        ParticipantsTable.BindData a2;
        String O;
        ParticipantsTable.BindData a3;
        msh q;
        alwo alwoVar = a;
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "sendDraftMessage", 1530, "DraftEditorFragmentPeer.java")).t("Initiated outgoing message processing in conversation %s", this.g);
        if (!this.G.Y()) {
            if (this.K != null && this.A != null && this.al != null) {
                akrh e = aktp.e("DraftEditorFragmentPeer::sendDraftMessage");
                try {
                    if (!this.K.bf()) {
                        ((abco) this.ag.b()).a();
                    }
                    final atok ba = yyb.ba();
                    if (i - 1 != 0) {
                        this.am = this.y.E().c.i();
                    } else {
                        ((mho) this.ai.b()).ag(this.G.o());
                        ((xcs) this.i.b()).g(xcr.SEND_BUTTON_LEGACY, ba.b);
                        ((xcs) this.i.b()).e(xcr.SEND_BUTTON_ACCURATE, ba.b);
                        ((xcs) this.i.b()).e(xcr.NOTIFICATION, ba.b);
                    }
                    akrh e2 = aktp.e("DraftEditorFragmentPeer::hideSimPicker");
                    try {
                        this.y.E().c.y();
                        e2.close();
                        akrh e3 = aktp.e("DraftEditorFragmentPeer::setHasEmergencyRecipient");
                        try {
                            boolean z4 = false;
                            if (((Boolean) new mst(3).get()).booleanValue()) {
                                rsa rsaVar = this.A;
                                if (rsaVar != null && (a3 = rsaVar.a()) != null) {
                                    q = ((msk) this.ah.b()).q(a3);
                                    rsr rsrVar = this.G;
                                    if (q != null && q.v()) {
                                        z4 = true;
                                    }
                                    rsrVar.j = z4;
                                }
                                q = null;
                                rsr rsrVar2 = this.G;
                                if (q != null) {
                                    z4 = true;
                                }
                                rsrVar2.j = z4;
                            } else {
                                rsa rsaVar2 = this.A;
                                if (rsaVar2 == null || (a2 = rsaVar2.a()) == null) {
                                    O = null;
                                } else {
                                    O = a2.O();
                                }
                                rsr rsrVar3 = this.G;
                                if (!TextUtils.isEmpty(O)) {
                                    yjr yjrVar = (yjr) this.ae.b();
                                    O.getClass();
                                    if (yjrVar.z(O)) {
                                        z4 = true;
                                    }
                                }
                                rsrVar3.j = z4;
                            }
                            e3.close();
                            e3 = aktp.e("DraftEditorFragmentPeer::logXsl");
                            try {
                                ((uac) this.aj.b()).x(ba, null, 36, Optional.of(asgt.BUGLE_SENDING_INTERNAL_STATUS_VERIFYING_MESSAGE));
                                e3.close();
                                rsr rsrVar4 = this.G;
                                rsrVar4.E(z, z2, q(rsrVar4.s()), new rsk() { // from class: ilh
                                    @Override // defpackage.rsk
                                    public final void a(rsr rsrVar5, rsq rsqVar) {
                                        ilw ilwVar = ilw.this;
                                        if (rsrVar5 == ilwVar.G) {
                                            boolean z5 = z;
                                            boolean z6 = false;
                                            switch (rsqVar) {
                                                case PASSED:
                                                    ilwVar.x(mbhVar, i, z3, ba);
                                                    return;
                                                case HAS_PENDING_ATTACHMENTS:
                                                    ilwVar.v(R.string.cant_send_message_while_loading_attachments);
                                                    return;
                                                case NO_SELF_PHONE_NUMBER_IN_GROUP_MMS:
                                                    ilwVar.K.aq(true);
                                                    return;
                                                case MESSAGE_OVER_LIMIT:
                                                    d.s(z5);
                                                    ilwVar.K.aO(rsrVar5, true, false);
                                                    return;
                                                case VIDEO_ATTACHMENT_LIMIT_EXCEEDED:
                                                    d.s(z5);
                                                    ilwVar.K.aO(rsrVar5, true, true);
                                                    return;
                                                case SIM_NOT_READY:
                                                    ilwVar.v(R.string.cant_send_message_without_active_subscription);
                                                    return;
                                                case NEED_TO_CONFIRM_SMS_ENCODING:
                                                    ilwVar.K.P();
                                                    return;
                                                case RCS_DISABLED:
                                                    ilwVar.v(R.string.cant_send_rcs_message_when_rcs_disabled_v2);
                                                    return;
                                                case MMS_WHEN_MASS_SMS:
                                                    ilwVar.v(R.string.cant_send_group_mms_message_when_group_mms_is_disabled);
                                                    return;
                                                case SIM_CANT_SEND_MMS:
                                                    cj fe = ilwVar.k.fe();
                                                    if (fe != null) {
                                                        int b = ((yjy) ilwVar.t.b()).b();
                                                        int q2 = ilwVar.G.q();
                                                        if (b != q2) {
                                                            z6 = true;
                                                        }
                                                        d.s(z6);
                                                        abbj.a(fe, ((yjy) ilwVar.t.b()).h(q2).t(), ((yjy) ilwVar.t.b()).h(b).t(), true);
                                                        return;
                                                    }
                                                    return;
                                                case MMS_DISABLED:
                                                    ilwVar.v(R.string.mms_failure_outgoing_disabled);
                                                    return;
                                                case EXCEEDS_SMS_MESSAGE_LENGTH_TO_EMERGENCY_NUMBER:
                                                    ilwVar.K.aP();
                                                    return;
                                                case IS_REPLY_WITHOUT_RCS:
                                                    ilwVar.r(ilwVar.k.S(R.string.error_text_draft_is_reply_without_rcs_v2)).ifPresent(new ile(2));
                                                    return;
                                                case IS_REPLY_TO_MISSING_MESSAGE:
                                                    ilwVar.r(ilwVar.k.S(R.string.error_text_draft_is_reply_to_missing_message)).ifPresent(new ile(4));
                                                    return;
                                                default:
                                                    return;
                                            }
                                        }
                                    }
                                }, this.y.E().s());
                                d.s(!this.B.getText().toString().equals("assert-on-send"));
                                e.close();
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            e2.close();
                            throw th;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } finally {
                }
            } else {
                v(R.string.cant_send_message_while_loading_conversation);
            }
        } else {
            ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer", "sendDraftMessage", 1533, "DraftEditorFragmentPeer.java")).q("Message can't be sent or scheduled: still checking draft");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class a implements akbp<MessageCoreData, FileInfoResult> {
        boolean a = true;

        public a() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            ((uvi) ilw.this.q.b()).b(th);
            ilw.this.C((MessageCoreData) obj, this.a);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            MessageCoreData messageCoreData = (MessageCoreData) obj;
            FileInfoResult fileInfoResult = (FileInfoResult) obj2;
            messageCoreData.getClass();
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) messageCoreData.W().get(0);
            ComposeMessageView composeMessageView = ilw.this.y;
            composeMessageView.getClass();
            int n = composeMessageView.E().n();
            int b = messagePartCoreData.b();
            int c = messagePartCoreData.c();
            if (fileInfoResult != null) {
                if (aabr.Y(messagePartCoreData.U(), fileInfoResult.b, n)) {
                    aktp.K(new abde(Uri.parse(fileInfoResult.a), n / 1024, c, b), ilw.this.k);
                    return;
                }
            }
            ilw.this.C(messageCoreData, this.a);
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
