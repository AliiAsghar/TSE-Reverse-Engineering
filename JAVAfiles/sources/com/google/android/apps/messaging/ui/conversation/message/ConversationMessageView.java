package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.suggestions.shortcuts.SuggestionShortcutView;
import defpackage.aabj;
import defpackage.aack;
import defpackage.aacl;
import defpackage.aacm;
import defpackage.aacp;
import defpackage.aacq;
import defpackage.aacr;
import defpackage.aacz;
import defpackage.aagh;
import defpackage.abal;
import defpackage.abbj;
import defpackage.abbu;
import defpackage.abcp;
import defpackage.adjw;
import defpackage.akul;
import defpackage.alhr;
import defpackage.alog;
import defpackage.alsx;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.amho;
import defpackage.anen;
import defpackage.aohs;
import defpackage.apwt;
import defpackage.apxx;
import defpackage.aquq;
import defpackage.armf;
import defpackage.arro;
import defpackage.d;
import defpackage.ibx;
import defpackage.ish;
import defpackage.iyh;
import defpackage.ksi;
import defpackage.kyn;
import defpackage.lbp;
import defpackage.lbu;
import defpackage.lrf;
import defpackage.mce;
import defpackage.mgr;
import defpackage.mho;
import defpackage.nhn;
import defpackage.nw;
import defpackage.qiu;
import defpackage.qyh;
import defpackage.rry;
import defpackage.rvx;
import defpackage.trz;
import defpackage.tvu;
import defpackage.utw;
import defpackage.utz;
import defpackage.uuf;
import defpackage.uuh;
import defpackage.uvl;
import defpackage.vid;
import defpackage.wsm;
import defpackage.xca;
import defpackage.xnv;
import defpackage.xog;
import defpackage.xuo;
import defpackage.xuv;
import defpackage.xvc;
import defpackage.xvy;
import defpackage.xwr;
import defpackage.xyl;
import defpackage.yai;
import defpackage.ydc;
import defpackage.ytk;
import defpackage.zhg;
import defpackage.zhi;
import defpackage.zjm;
import defpackage.zng;
import defpackage.zof;
import defpackage.zpt;
import defpackage.zrd;
import defpackage.zvp;
import defpackage.zxp;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationMessageView extends aacz implements View.OnClickListener, View.OnLongClickListener, aacl, xuv, xuo, zxp, aacr {
    public ksi A;
    public abbj B;
    public zpt C;
    public armf D;
    public Optional E;
    public apwt F;
    public armf G;
    public armf H;
    public alog I;
    public abcp J;
    public armf K;
    public armf L;
    public apwt M;
    public armf N;
    public apwt O;
    public armf P;
    public armf Q;
    public armf R;
    public armf S;
    public armf T;
    public armf U;
    public xvc V;
    public iyh W;
    public zhg aa;
    public zof ab;
    public zng ac;
    public zhi ad;
    public zjm ae;
    public vid af;
    public aohs ag;
    private xvy ai;
    private ContactIconView aj;
    private xvy ak;
    private xvy al;
    private ViewGroup am;
    private xvy an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private final List ar;
    private boolean as;
    private akul at;
    private boolean au;
    private int av;
    private MessageIdType aw;
    private View.OnClickListener ax;
    private View.OnLongClickListener ay;
    private aacp az;
    public rry e;
    public xvy f;
    public ConversationMessageBubbleView g;
    public TextView h;
    public TextView i;
    public xvy j;
    public xvy k;
    public aacp l;
    public xvy m;
    public boolean n;
    public Optional o;
    public boolean p;
    public final int q;
    public boolean r;
    public aack s;
    public String t;
    public alog u;
    public final AtomicReference v;
    public mce w;
    public yai x;
    public ytk y;
    public aacq z;
    private static final alwo ah = alwo.o("BugleMessageView");
    public static final uuf a = uuh.q(143245445);
    public static final uuf b = uuh.n(uuh.b, "use_default_sender_color_in_group", false);
    public static final alhr c = uuh.x(204810985, "skip_chat_api_flag_check_on_get_progress");
    public static final uuf d = uuh.n(uuh.b, "log_message_view_measure_and_layout_results", false);

    public ConversationMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ar = new ArrayList();
        this.o = Optional.empty();
        this.q = (int) getResources().getDimension(R.dimen.message_margin_default);
        this.v = new AtomicReference();
        this.av = 0;
        setWillNotDraw(false);
        this.au = false;
    }

    private final void H() {
        ((Optional) this.G.b()).ifPresent(new aacm(this, 14));
        ((Optional) this.G.b()).ifPresent(new aacm(this, 15));
    }

    private final void I(View view) {
        view.setTag(R.id.conversation_message_view_clickable_tag, this);
        view.setOnClickListener(this.ax);
        view.setOnLongClickListener(this.ay);
    }

    private final boolean J() {
        return uvl.o(this.e);
    }

    private final boolean K() {
        return tvu.c(this.e.b());
    }

    private final boolean L() {
        return this.e.aJ();
    }

    public final boolean A() {
        return this.e.ab();
    }

    protected final boolean B() {
        if (!this.ai.i() || ((MessageAttachmentsView) this.ai.b()).c.getChildCount() <= 0) {
            return false;
        }
        return true;
    }

    protected final boolean C() {
        return this.e.au();
    }

    public final boolean D() {
        if (this.o.isPresent()) {
            return ((Boolean) this.o.get()).booleanValue();
        }
        if ((((Boolean) wsm.a.e()).booleanValue() && L()) || d.z(this.e.f())) {
            return false;
        }
        if (!this.e.an() && !this.e.aN()) {
            return true;
        }
        if ((this.as && this.e.aF() && rvx.j(this.e.f())) || this.e.ay()) {
            return true;
        }
        return this.p;
    }

    public final boolean E() {
        if (!this.e.am() && TextUtils.isEmpty(((xca) this.M.b()).d(getResources(), this.e.E()))) {
            return this.e.aU();
        }
        return true;
    }

    @Override // defpackage.aacv
    public final void b() {
        AppCompatImageView appCompatImageView;
        aacp aacpVar = this.az;
        aacpVar.v = null;
        int i = alog.d;
        aacpVar.w = alsx.a;
        aacpVar.x = false;
        xvy xvyVar = aacpVar.A;
        if (xvyVar == null) {
            appCompatImageView = null;
        } else {
            appCompatImageView = (AppCompatImageView) xvyVar.b();
        }
        if (appCompatImageView != null) {
            ((aquq) aacpVar.z.b()).h().i(appCompatImageView);
        }
        xvy xvyVar2 = aacpVar.A;
        if (xvyVar2 != null) {
            xvyVar2.e();
            aacpVar.A = null;
        }
        akul akulVar = aacpVar.B;
        if (akulVar != null) {
            akulVar.cancel(false);
        }
        this.t = null;
        zof zofVar = this.ab;
        ((xvy) zofVar.b).d(new aacm(zofVar, 18));
        if (this.an.i()) {
            ConversationMessageLinkPreviewView conversationMessageLinkPreviewView = (ConversationMessageLinkPreviewView) this.an.b();
            conversationMessageLinkPreviewView.setVisibility(8);
            conversationMessageLinkPreviewView.m.setVisibility(8);
            conversationMessageLinkPreviewView.k.setVisibility(8);
            conversationMessageLinkPreviewView.l.setVisibility(8);
            conversationMessageLinkPreviewView.a();
            conversationMessageLinkPreviewView.j.setVisibility(8);
            conversationMessageLinkPreviewView.h.setImageDrawable(null);
            conversationMessageLinkPreviewView.i.setImageDrawable(null);
            conversationMessageLinkPreviewView.n = false;
            ViewGroup.LayoutParams layoutParams = conversationMessageLinkPreviewView.k.getLayoutParams();
            layoutParams.height = -2;
            conversationMessageLinkPreviewView.k.setLayoutParams(layoutParams);
        }
        if (this.j.i()) {
            ((SuggestionShortcutView) this.j.b()).E().b();
        }
        xvy xvyVar3 = this.al;
        if (xvyVar3 != null && xvyVar3.i()) {
            xvyVar3.e();
        }
        ConversationMessageBubbleView conversationMessageBubbleView = this.g;
        conversationMessageBubbleView.d(false);
        conversationMessageBubbleView.c(false, true);
    }

    @Override // defpackage.aacl
    public final rry c() {
        return this.e;
    }

    @Override // defpackage.aacl
    public final void d(Object obj) {
        if (obj instanceof xog) {
            this.ai.d(new aacm(obj, 16));
            return;
        }
        if (obj instanceof SuperSortLabel) {
            ((Optional) ((apxx) this.K).a).ifPresent(new aabj(8));
        } else {
            if (obj instanceof lbu) {
                if (lbp.b()) {
                    String str = ((lbu) obj).a;
                    ((Optional) ((apxx) this.K).a).ifPresent(new aabj(9));
                    return;
                }
                return;
            }
            throw new IllegalStateException("ConversationMessageView.bindPayload() does not support ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    @Override // defpackage.aacl
    public final void e(aack aackVar) {
        this.s = aackVar;
    }

    @Override // defpackage.xuo
    public final int f() {
        return 1;
    }

    @Override // defpackage.zxp
    public final void fT() {
        H();
    }

    /* JADX WARN: Code restructure failed: missing block: B:361:0x036d, code lost:
    
        if (r9.a.aE() == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x01d3, code lost:
    
        if (r6.e(r7, r0) == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04b8 A[Catch: all -> 0x0c95, TryCatch #0 {all -> 0x0c95, blocks: (B:113:0x04ae, B:115:0x04b8, B:345:0x04c5), top: B:112:0x04ae }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0c46  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04c5 A[Catch: all -> 0x0c95, TRY_LEAVE, TryCatch #0 {all -> 0x0c95, blocks: (B:113:0x04ae, B:115:0x04b8, B:345:0x04c5), top: B:112:0x04ae }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02af  */
    /* JADX WARN: Type inference failed for: r0v102, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [armf, java.lang.Object] */
    @Override // defpackage.aacl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.rry r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 3235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView.g(rry, boolean, boolean):void");
    }

    @Override // defpackage.xuo
    public final boolean h(AudioAttachmentView audioAttachmentView) {
        return onLongClick((View) audioAttachmentView.getParent());
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        if (((Boolean) utw.ae.e()).booleanValue()) {
            return false;
        }
        return super.hasOverlappingRendering();
    }

    @Override // defpackage.xuv
    public final boolean i(MessagePartCoreData messagePartCoreData, Rect rect, boolean z) {
        if (messagePartCoreData == null) {
            TextView textView = this.az.k;
            if (textView != null) {
                if (z) {
                    onLongClick(textView);
                    return false;
                }
                onClick(textView);
                return false;
            }
            return false;
        }
        return this.s.E(this, messagePartCoreData, rect, z);
    }

    protected final int j() {
        if (this.ak.i() && J()) {
            return ((BadgesRecyclerView) this.ak.b()).getMeasuredHeight();
        }
        return 0;
    }

    protected final int k() {
        if (this.ak.i()) {
            return ((BadgesRecyclerView) this.ak.b()).getMeasuredWidth();
        }
        return 0;
    }

    protected final int l() {
        return this.g.getMeasuredHeight();
    }

    protected final int m() {
        View view;
        if (B()) {
            view = ((MessageAttachmentsView) this.ai.b()).c.getChildAt(0);
        } else {
            view = null;
        }
        if (view == null) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    protected final int n() {
        return this.aj.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int o() {
        return this.aj.getMeasuredWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aacp aacpVar = this.az;
        aacpVar.y = new zrd(aacpVar, 3);
        ((Optional) aacpVar.e.b()).ifPresent(new aacm(aacpVar, 5));
        ((Optional) this.F.b()).ifPresent(new aacm(this, 17));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        if (this.az.l(view) && (onClickListener = this.ax) != null) {
            onClickListener.onClick(view);
            return;
        }
        Object tag = view.getTag();
        if (tag instanceof MessagePartData) {
            i((MessagePartCoreData) tag, this.x.g(view), false);
        } else {
            callOnClick();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        aacp aacpVar = this.az;
        ((Optional) aacpVar.e.b()).ifPresent(new aacm(aacpVar, 2));
        ((Optional) this.F.b()).ifPresent(new aacm(this, 12));
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        String str;
        super.onDraw(canvas);
        if (this.au) {
            int i = 7;
            if (this.e.au()) {
                this.e.v().g(new aacm(this, i));
            }
            if (this.e.aC()) {
                this.e.B().ifPresent(new aacm(this, 8));
                if (!this.e.u().b()) {
                    this.e.B().ifPresent(new aacm(this, 9));
                }
            }
            if (this.e.aN()) {
                int c2 = this.e.c();
                if (c2 != 0) {
                    if (c2 != 1) {
                        if (c2 != 3) {
                            if (c2 != 4) {
                                if (c2 != 7) {
                                    xyl.c("Unknown protocol " + this.e.c());
                                }
                                this.e.B().ifPresent(new aacm(this, 10));
                            } else {
                                str = "Bugle.UI.ConversationActivity.Send.Duration.Cloud.Sync";
                            }
                        } else if (this.e.ak()) {
                            str = "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Attachment";
                        } else {
                            str = "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Text";
                        }
                    } else if (this.e.ak()) {
                        str = "Bugle.UI.ConversationActivity.Send.Duration.Mms.Attachment";
                    } else {
                        str = "Bugle.UI.ConversationActivity.Send.Duration.Mms.Text";
                    }
                } else {
                    str = "Bugle.UI.ConversationActivity.Send.Duration.Sms";
                }
                this.w.o(str, this.e.u().a());
                this.e.B().ifPresent(new aacm(this, 10));
            }
            if (rvx.l(this.e.f())) {
                this.e.B().ifPresent(new aacm(this, 11));
            }
            if (this.e.f() == 1 && this.av != 1) {
                mgr mgrVar = (mgr) this.S.b();
                MessageIdType u = this.e.u();
                u.getClass();
                qiu.h(mgrVar.a(u, 30));
            } else if (this.e.f() == 2 && this.av != 2) {
                mgr mgrVar2 = (mgr) this.S.b();
                MessageIdType u2 = this.e.u();
                u2.getClass();
                qiu.h(mgrVar2.a(u2, 31));
            }
            this.av = this.e.f();
            this.au = false;
        }
    }

    /* JADX WARN: Type inference failed for: r17v0, types: [apwt, java.lang.Object] */
    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.ad = new zhi((Optional) ((apxx) this.aa.a).a, this);
        this.e = this.af.a();
        ContactIconView contactIconView = (ContactIconView) findViewById(R.id.contact_icon);
        this.aj = contactIconView;
        contactIconView.setOnLongClickListener(new ish(this, 7));
        this.aj.p = amho.BIZINFO_SOURCE_CONVERSATION_AVATAR;
        this.g = (ConversationMessageBubbleView) findViewById(R.id.message_content);
        this.ai = new xvy(this.g, R.id.message_attachments_view_stub, R.id.message_attachments, new kyn(this, 3));
        this.ab = new zof(this.ai, this);
        this.am = (ViewGroup) findViewById(R.id.message_text_and_info);
        this.i = (TextView) findViewById(R.id.message_sender_name);
        adjw adjwVar = (adjw) this.O.b();
        adjwVar.a = (ConversationMessageMetadataView) findViewById(R.id.message_metadata);
        Object obj = adjwVar.a;
        if (obj == null) {
            arro.b("messageMetadataView");
            obj = null;
        }
        ((ConversationMessageMetadataView) obj).setVisibility(0);
        this.h = (TextView) findViewById(R.id.message_separator);
        this.ak = new xvy(this, R.id.message_badges, R.id.message_badges_inflated, new kyn(this, 4));
        this.j = new xvy(this, R.id.suggestion_shortcut, R.id.suggestion_shortcut_inflated, new kyn(this, 5));
        this.ao = this.y.d();
        this.an = new xvy(this.g, R.id.message_link_preview_view_stub, R.id.message_link_preview_view, new kyn(this, 6));
        this.al = new xvy(this, R.id.reply_snippet, R.id.reply_snippet_bubble_inflated);
        aacq aacqVar = this.z;
        armf armfVar = aacqVar.a;
        ViewGroup viewGroup = this.am;
        xvy xvyVar = this.an;
        xvy xvyVar2 = this.al;
        rry rryVar = this.e;
        Context context = (Context) armfVar.b();
        context.getClass();
        Optional optional = (Optional) aacqVar.b.b();
        optional.getClass();
        ydc ydcVar = (ydc) aacqVar.c.b();
        ydcVar.getClass();
        Optional optional2 = (Optional) aacqVar.d.b();
        optional2.getClass();
        ytk ytkVar = (ytk) aacqVar.e.b();
        ytkVar.getClass();
        abbj abbjVar = (abbj) aacqVar.f.b();
        abbjVar.getClass();
        qyh qyhVar = (qyh) aacqVar.g.b();
        qyhVar.getClass();
        anen anenVar = (anen) aacqVar.h.b();
        anenVar.getClass();
        zpt zptVar = (zpt) aacqVar.i.b();
        zptVar.getClass();
        iyh iyhVar = (iyh) aacqVar.j.b();
        iyhVar.getClass();
        mho mhoVar = (mho) aacqVar.k.b();
        mhoVar.getClass();
        xca xcaVar = (xca) aacqVar.l.b();
        xcaVar.getClass();
        trz trzVar = (trz) aacqVar.m.b();
        trzVar.getClass();
        ?? b2 = aacqVar.n.b();
        b2.getClass();
        armf armfVar2 = aacqVar.o;
        lrf lrfVar = (lrf) aacqVar.p.b();
        lrfVar.getClass();
        armf armfVar3 = aacqVar.q;
        armf armfVar4 = aacqVar.r;
        armf armfVar5 = aacqVar.s;
        armf armfVar6 = aacqVar.t;
        armf armfVar7 = aacqVar.u;
        Optional optional3 = (Optional) ((apxx) aacqVar.v).a;
        xnv xnvVar = (xnv) aacqVar.w.b();
        xnvVar.getClass();
        Optional optional4 = (Optional) ((apxx) aacqVar.x).a;
        viewGroup.getClass();
        xvyVar.getClass();
        rryVar.getClass();
        aacp aacpVar = new aacp(context, optional, ydcVar, optional2, ytkVar, abbjVar, qyhVar, anenVar, zptVar, iyhVar, mhoVar, xcaVar, trzVar, b2, armfVar2, lrfVar, armfVar3, armfVar4, armfVar5, armfVar6, armfVar7, optional3, xnvVar, optional4, this, viewGroup, xvyVar, xvyVar2, rryVar);
        this.l = aacpVar;
        this.az = aacpVar;
        if (abal.a()) {
            this.E.isPresent();
        }
        this.f = new xvy(this, R.id.reminder_icon, R.id.reminder_icon_inflated);
        this.m = new xvy(this, R.id.change_category_view_stub, R.id.change_category_view);
        H();
        this.k = new xvy(this, R.id.reply_button, R.id.reply_button_inflated);
        ((Optional) ((apxx) this.H).a).map(new zvp(this, 5));
        xvy xvyVar3 = this.k;
        xvyVar3.getClass();
        if (xvyVar3.i()) {
            xvyVar3.getClass();
            ((ComposeView) xvyVar3.b()).setVisibility(8);
        }
        if (((Boolean) ((utz) ibx.a.get()).e()).booleanValue()) {
            abbu.i(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e.aB()) {
            String str = xwr.a;
            if (xwr.h(getContext()) && motionEvent.getAction() == 0) {
                float abs = Math.abs((getMeasuredWidth() / 2) - motionEvent.getX());
                int min = Math.min(getBottom(), ((View) getParent()).getHeight()) - Math.max(getTop(), 0);
                float abs2 = Math.abs(((min / 2) + (r1 - getTop())) - motionEvent.getY());
                if (abs <= 1.0f && abs2 <= 1.0f) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int dimensionPixelSize;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        final int i49;
        int i50;
        final int i51;
        int i52;
        int i53;
        int i54;
        int p;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int dimensionPixelSize2;
        int i69;
        int i70;
        int i71;
        int i72;
        zjm zjmVar = this.ae;
        int measuredWidth = this.g.getMeasuredWidth();
        int l = l();
        int o = o();
        int n = n();
        int measuredWidth2 = this.h.getMeasuredWidth();
        int t = t();
        int measuredWidth3 = this.f.i() ? ((ImageView) this.f.b()).getMeasuredWidth() : 0;
        int measuredHeight = this.f.i() ? ((ImageView) this.f.b()).getMeasuredHeight() : 0;
        Object obj = ((adjw) this.O.b()).a;
        if (obj == null) {
            arro.b("messageMetadataView");
            obj = null;
        }
        int measuredWidth4 = ((ConversationMessageMetadataView) obj).getMeasuredWidth();
        int s = s();
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int i73 = this.q;
        xvy xvyVar = this.k;
        if (xvyVar == null || !xvyVar.i()) {
            i5 = paddingEnd;
            i6 = 0;
        } else {
            i6 = ((ComposeView) xvyVar.b()).getMeasuredWidth();
            i5 = paddingEnd;
        }
        xvy xvyVar2 = this.k;
        if (xvyVar2 == null || !xvyVar2.i()) {
            i7 = i6;
            i8 = 0;
        } else {
            i8 = ((ComposeView) xvyVar2.b()).getMeasuredHeight();
            i7 = i6;
        }
        int measuredHeight2 = this.i.isShown() ? this.i.getMeasuredHeight() : 0;
        int i74 = i3 - i;
        int i75 = i8;
        int paddingTop = getPaddingTop();
        Resources resources = getResources();
        ((Optional) zjmVar.a).isPresent();
        ((Optional) zjmVar.a).isPresent();
        if (r() == 0) {
            int i76 = i74 / 2;
            int i77 = measuredWidth2 / 2;
            i9 = t + paddingTop;
            i11 = i76 + i77;
            i10 = i76 - i77;
        } else {
            i9 = paddingTop;
            i10 = 0;
            i11 = 0;
        }
        int i78 = l + i9;
        int i79 = i78 - measuredHeight;
        if (C()) {
            if (!z() && !this.r) {
                i56 = o + paddingStart;
                i12 = i73 + i56;
                i54 = measuredWidth + i12;
                i58 = i78 - n;
                if (i58 < i9) {
                    i57 = n + i9;
                    i58 = i9;
                } else {
                    i57 = i78;
                }
                p = B() ? i12 + p() : i54;
                i55 = p + measuredWidth3;
            } else {
                if (!this.r) {
                    paddingStart = paddingStart + o + i73;
                }
                i54 = measuredWidth + paddingStart;
                p = B() ? p() + paddingStart : i54;
                i55 = p + measuredWidth3;
                i12 = paddingStart;
                i56 = 0;
                i57 = 0;
                i58 = 0;
                paddingStart = 0;
            }
            if (z() || j() == 0) {
                i59 = i54;
                i60 = i56;
                i61 = i57;
                i62 = 0;
                i63 = 0;
                i64 = 0;
                i65 = 0;
            } else {
                nw nwVar = ((RecyclerView) this.ak.b()).m;
                nwVar.getClass();
                i59 = i54;
                int q = q();
                i60 = i56;
                i61 = i57;
                int i80 = 0;
                int i81 = 0;
                while (i80 < nwVar.at()) {
                    View aF = nwVar.aF(i80);
                    aF.getClass();
                    int br = i81 + nw.br(aF);
                    if (br > q) {
                        break;
                    }
                    i80++;
                    i81 = br;
                }
                if (i81 == 0) {
                    if (k() != 0) {
                        i62 = i12;
                        i63 = k() + i62;
                        i64 = i78 - resources.getDimensionPixelSize(R.dimen.badge_overlap_message_bubble);
                        i65 = j() + i64;
                    } else {
                        i81 = 0;
                    }
                }
                i62 = (q + i12) - i81;
                i63 = k() + i62;
                i64 = i78 - resources.getDimensionPixelSize(R.dimen.badge_overlap_message_bubble);
                i65 = j() + i64;
            }
            int i82 = i12 + measuredWidth4;
            int i83 = i65 != 0 ? i65 : i78;
            int i84 = i83 + s;
            int q2 = q();
            int i85 = i63;
            int i86 = measuredHeight2;
            int i87 = i64;
            int b2 = zjm.b(this, i9, i78, i75, i86);
            int i88 = i75 + b2;
            if (B()) {
                i68 = i12 + m();
                i66 = i62;
                i67 = R.dimen.reply_button_horizontal_margin;
                dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
            } else {
                i66 = i62;
                i67 = R.dimen.reply_button_horizontal_margin;
                i68 = i12 + q2;
                dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
            }
            int i89 = i68 + dimensionPixelSize2;
            int i90 = i89 + i7;
            if (u() != 0) {
                i71 = i12 + q2 + resources.getDimensionPixelSize(i67);
                i69 = i71 + v();
                i70 = i78 - u();
                i72 = i78;
            } else {
                i69 = 0;
                i70 = 0;
                i71 = 0;
                i72 = 0;
            }
            i22 = i55;
            i30 = i70;
            i28 = paddingStart;
            i25 = i89;
            i26 = p;
            i20 = i90;
            i27 = i83;
            i29 = i61;
            i31 = i71;
            i32 = i72;
            i23 = i85;
            i41 = i88;
            i36 = i65;
            i37 = i12;
            i39 = i60;
            i24 = i87;
            i40 = i69;
            i21 = i59;
            i35 = i74;
            i38 = i84;
            i42 = b2;
            i43 = i58;
            i34 = i82;
            i33 = i66;
        } else {
            int i91 = measuredHeight2;
            int i92 = i74 - i5;
            i12 = i92 - measuredWidth;
            if (j() != 0) {
                i13 = i92 - k();
                int dimensionPixelSize3 = i78 - resources.getDimensionPixelSize(R.dimen.badge_overlap_message_bubble);
                i16 = j() + dimensionPixelSize3;
                i15 = dimensionPixelSize3;
                i14 = i92;
            } else {
                i13 = 0;
                i14 = 0;
                i15 = 0;
                i16 = 0;
            }
            int i93 = i92 - measuredWidth4;
            int i94 = i16 != 0 ? i16 : i78;
            int i95 = i94 + s;
            if (B()) {
                int p2 = (i92 - p()) - measuredWidth3;
                i18 = i92 - p();
                i17 = p2;
            } else {
                i17 = i12 - measuredWidth3;
                i18 = i12;
            }
            int b3 = zjm.b(this, i9, i78, i75, i91);
            int i96 = i75 + b3;
            if (B()) {
                i19 = i13;
                dimensionPixelSize = (i92 - m()) - resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
            } else {
                i19 = i13;
                dimensionPixelSize = i12 - resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
            }
            int i97 = dimensionPixelSize - i7;
            if (u() != 0) {
                if (B()) {
                    i45 = i92 - m();
                    i44 = dimensionPixelSize;
                } else {
                    i44 = dimensionPixelSize;
                    i45 = i12;
                }
                int dimensionPixelSize4 = i45 - resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
                int v = dimensionPixelSize4 - v();
                i20 = i44;
                i32 = i78;
                i22 = i18;
                i23 = i14;
                i30 = i78 - u();
                i24 = i15;
                i25 = i97;
                i26 = i17;
                i27 = i94;
                i31 = v;
                i28 = 0;
                i29 = 0;
                i33 = i19;
                i34 = i92;
                i35 = i74;
                i36 = i16;
                i37 = i93;
                i38 = i95;
                i40 = dimensionPixelSize4;
                i41 = i96;
                i42 = b3;
                i21 = i34;
                i43 = 0;
                i39 = 0;
            } else {
                i20 = dimensionPixelSize;
                i21 = i92;
                i22 = i18;
                i23 = i14;
                i24 = i15;
                i25 = i97;
                i26 = i17;
                i27 = i94;
                i28 = 0;
                i29 = 0;
                i30 = 0;
                i31 = 0;
                i32 = 0;
                i33 = i19;
                i34 = i21;
                i35 = i74;
                i36 = i16;
                i37 = i93;
                i38 = i95;
                i39 = 0;
                i40 = 0;
                i41 = i96;
                i42 = b3;
                i43 = 0;
            }
        }
        Rect rect = new Rect(i10, paddingTop, i11, i9);
        Rect rect2 = new Rect(i28, i43, i39, i29);
        Rect rect3 = new Rect(i12, i9, i21, i78);
        Rect rect4 = new Rect(i26, i79, i22, i78);
        Rect rect5 = new Rect(i37, i27, i34, i38);
        Rect rect6 = new Rect(i33, i24, i23, i36);
        final Rect rect7 = new Rect(i25, i42, i20, i41);
        Rect rect8 = new Rect(i31, i30, i40, i32);
        if (!this.r) {
            ContactIconView contactIconView = this.aj;
            int i98 = 8;
            if (rect2.top != rect2.bottom && rect2.left != rect2.right) {
                i98 = 0;
            }
            contactIconView.setVisibility(i98);
        }
        int i99 = rect.left;
        int i100 = rect.right;
        int i101 = rect.top;
        int i102 = rect.bottom;
        int i103 = rect2.left;
        int i104 = rect2.right;
        int i105 = rect2.top;
        int i106 = rect2.bottom;
        int i107 = rect3.left;
        int i108 = i35 - i107;
        int i109 = rect3.right;
        int i110 = i35 - i109;
        int i111 = rect3.top;
        int i112 = rect3.bottom;
        int i113 = rect5.left;
        int i114 = rect5.right;
        int i115 = rect5.top;
        int i116 = rect5.bottom;
        int i117 = rect6.left;
        int i118 = rect6.right;
        int i119 = rect6.top;
        int i120 = rect6.bottom;
        int i121 = rect8.left;
        int i122 = rect8.right;
        int i123 = rect8.top;
        int i124 = rect8.bottom;
        final boolean z2 = getLayoutDirection() == 1;
        if (z2) {
            if (!this.r) {
                this.aj.layout(i35 - i104, i105, i35 - i103, i106);
            }
            this.g.layout(i110, i111, i108, i112);
            ((adjw) this.O.b()).e(i35 - i114, i115, i35 - i113, i116);
            i46 = i109;
            i47 = i107;
        } else {
            if (!this.r) {
                this.aj.layout(i103, i105, i104, i106);
            }
            i46 = i109;
            i47 = i107;
            this.g.layout(i47, i111, i46, i112);
            ((adjw) this.O.b()).e(i113, i115, i114, i116);
        }
        BadgesRecyclerView badgesRecyclerView = (BadgesRecyclerView) this.ak.b();
        badgesRecyclerView.setClipToOutline(true);
        badgesRecyclerView.E().a.setOnTouchListener(new nhn(1));
        int max = Math.max(getPaddingStart(), i117);
        int min = Math.min(i35 - getPaddingEnd(), i118);
        if (z2) {
            int i125 = min - max;
            int i126 = i35 - max;
            int i127 = i126 - i125;
            i48 = i120;
            min = i126;
            max = i127;
        } else {
            i48 = i120;
        }
        badgesRecyclerView.layout(max, i119, min, i48);
        if (((Boolean) ((utz) aagh.a.get()).e()).booleanValue() && this.j.i()) {
            SuggestionShortcutView suggestionShortcutView = (SuggestionShortcutView) this.j.b();
            if (z2) {
                i53 = i35 - i121;
                i52 = i53 - (i122 - i121);
            } else {
                i52 = i121;
                i53 = i122;
            }
            suggestionShortcutView.layout(i52, i123, i53, i124);
        }
        final int i128 = rect4.left;
        final int i129 = rect4.right;
        final int i130 = rect4.top;
        final int i131 = rect4.bottom;
        this.E.isPresent();
        if (B() && E()) {
            int measuredWidth5 = this.g.c.getMeasuredWidth();
            int abs = Math.abs(i129 - i128);
            if (z2) {
                int abs2 = Math.abs(i110 - i108);
                if (C()) {
                    i49 = i110 + (abs2 - measuredWidth5);
                    i51 = i49 - abs;
                } else {
                    i50 = i110 + measuredWidth5;
                    i49 = i50 + abs;
                    i51 = i50;
                }
            } else if (C()) {
                i50 = i47 + measuredWidth5;
                i49 = i50 + abs;
                i51 = i50;
            } else {
                i49 = i46 - measuredWidth5;
                i51 = i49 - abs;
            }
            this.f.d(new Consumer() { // from class: aact
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj2) {
                    uuf uufVar = ConversationMessageView.a;
                    ((ImageView) obj2).layout(i51, i130, i49, i131);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            final boolean z3 = z2;
            final int i132 = i35;
            this.f.d(new Consumer() { // from class: aacu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj2) {
                    int i133;
                    ImageView imageView = (ImageView) obj2;
                    uuf uufVar = ConversationMessageView.a;
                    int i134 = i132;
                    int i135 = i129;
                    int i136 = i128;
                    boolean z4 = z3;
                    if (z4) {
                        i133 = i134 - i135;
                    } else {
                        i133 = i136;
                    }
                    if (z4) {
                        i135 = i134 - i136;
                    }
                    imageView.layout(i133, i130, i135, i131);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        this.h.layout(i99, i101, i100, i102);
        xvy xvyVar3 = this.k;
        if (xvyVar3 != null) {
            final int i133 = i35;
            xvyVar3.d(new Consumer() { // from class: aacs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj2) {
                    int i134;
                    int i135;
                    ComposeView composeView = (ComposeView) obj2;
                    uuf uufVar = ConversationMessageView.a;
                    int i136 = i133;
                    Rect rect9 = rect7;
                    boolean z4 = z2;
                    if (z4) {
                        i134 = i136 - rect9.right;
                    } else {
                        i134 = rect9.left;
                    }
                    int i137 = rect9.top;
                    if (z4) {
                        i135 = i136 - rect9.left;
                    } else {
                        i135 = rect9.right;
                    }
                    composeView.layout(i134, i137, i135, rect9.bottom);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (((Boolean) d.e()).booleanValue()) {
            ((alwl) ((alwl) ah.g()).h("com/google/android/apps/messaging/ui/conversation/message/ConversationMessageView", "onLayout", 777, "ConversationMessageView.java")).L("ConversationMessageView{%s}.onLayout: contentStart=%s, contentEnd=%s, contentTop=%s, contentBottom=%s", this.e.u(), Integer.valueOf(i47), Integer.valueOf(i46), Integer.valueOf(i111), Integer.valueOf(i112));
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.az.l(view)) {
            View.OnLongClickListener onLongClickListener = this.ay;
            if (onLongClickListener != null) {
                return onLongClickListener.onLongClick(view);
            }
            return performLongClick();
        }
        Object tag = view.getTag();
        if (tag instanceof MessagePartData) {
            return i((MessagePartCoreData) tag, this.x.g(view), true);
        }
        if (((Boolean) a.e()).booleanValue()) {
            return performLongClick();
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int dimensionPixelSize;
        float f;
        int i3;
        ViewGroup viewGroup;
        zjm zjmVar = this.ae;
        int size = View.MeasureSpec.getSize(i);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.conversation_message_contact_icon_size);
        int i4 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize2, 1073741824);
        ((Optional) zjmVar.a).isPresent();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        w(makeMeasureSpec2, makeMeasureSpec2);
        if (this.e.al()) {
            x(makeMeasureSpec3, makeMeasureSpec3);
        } else {
            x(makeMeasureSpec4, makeMeasureSpec4);
        }
        boolean z = this.r;
        if (z) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.message_margin_default);
        }
        if (true != z) {
            f = 2.0f;
        } else {
            f = 0.75f;
        }
        int min = Math.min((((size - ((int) (o() * f))) - dimensionPixelSize) - getPaddingStart()) - getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.message_bubble_max_width));
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE);
        this.g.measure(makeMeasureSpec5, makeMeasureSpec);
        this.h.measure(makeMeasureSpec, makeMeasureSpec);
        Object obj = ((adjw) this.O.b()).a;
        if (obj == null) {
            arro.b("messageMetadataView");
            obj = null;
        }
        ((ConversationMessageMetadataView) obj).measure(makeMeasureSpec5, makeMeasureSpec);
        if (this.ak.i()) {
            ((BadgesRecyclerView) this.ak.b()).measure(makeMeasureSpec, makeMeasureSpec);
        }
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.suggestion_shortcut_size), 1073741824);
        if (this.j.i()) {
            ((SuggestionShortcutView) this.j.b()).measure(makeMeasureSpec6, makeMeasureSpec6);
        }
        xvy xvyVar = this.k;
        if (xvyVar != null && xvyVar.i()) {
            ((ComposeView) xvyVar.b()).measure(makeMeasureSpec, makeMeasureSpec);
        }
        rry rryVar = this.e;
        if (rryVar != null && rryVar.r != null) {
            if (rryVar.ak()) {
                y(View.MeasureSpec.makeMeasureSpec(m(), 1073741824), makeMeasureSpec);
            } else {
                xvy xvyVar2 = this.al;
                if (xvyVar2 != null && xvyVar2.i()) {
                    i3 = ((ComposeView) xvyVar2.b()).getMeasuredWidth();
                } else {
                    i3 = 0;
                }
                int makeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec(Math.min(Math.max(i3, q()), min), 1073741824);
                ConversationMessageBubbleView conversationMessageBubbleView = this.g;
                if (conversationMessageBubbleView != null && (viewGroup = conversationMessageBubbleView.c) != null) {
                    viewGroup.measure(makeMeasureSpec7, makeMeasureSpec);
                }
                y(makeMeasureSpec7, makeMeasureSpec);
            }
        }
        xvy xvyVar3 = this.ai;
        if (xvyVar3 != null && xvyVar3.i()) {
            int paddingStart = (min - ((MessageAttachmentsView) xvyVar3.b()).getPaddingStart()) - ((MessageAttachmentsView) this.ai.b()).getPaddingEnd();
            Iterator it = this.ar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).measure(View.MeasureSpec.makeMeasureSpec(paddingStart, 1073741824), View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.audio_attachment_view_playback_height), 1073741824));
            }
        }
        if (r() == 0) {
            i4 = t();
        }
        int paddingTop = getPaddingTop() + Math.max(n(), l() + s() + j()) + i4 + getPaddingBottom();
        setMeasuredDimension(size, paddingTop);
        if (((Boolean) d.e()).booleanValue()) {
            ((alwl) ((alwl) ah.g()).h("com/google/android/apps/messaging/ui/conversation/message/ConversationMessageView", "onMeasure", 422, "ConversationMessageView.java")).J("ConversationMessageView{%s}.onMeasure: %s x %s", this.e.u(), Integer.valueOf(size), Integer.valueOf(paddingTop));
        }
    }

    protected final int p() {
        if (B()) {
            return ((MessageAttachmentsView) this.ai.b()).c.getChildAt(r0.getChildCount() - 1).getMeasuredWidth();
        }
        return 0;
    }

    protected final int q() {
        int measuredWidth = this.g.c.getMeasuredWidth();
        if ((measuredWidth == 0 || this.g.c.getVisibility() != 0) && B()) {
            return ((MessageAttachmentsView) this.ai.b()).c.getMeasuredWidth();
        }
        return measuredWidth;
    }

    protected final int r() {
        return this.h.getVisibility();
    }

    protected final int s() {
        Object obj = ((adjw) this.O.b()).a;
        if (obj == null) {
            arro.b("messageMetadataView");
            obj = null;
        }
        ConversationMessageMetadataView conversationMessageMetadataView = (ConversationMessageMetadataView) obj;
        if (conversationMessageMetadataView.j != null) {
            return conversationMessageMetadataView.getMeasuredHeight();
        }
        if (((Boolean) ConversationMessageMetadataView.a.e()).booleanValue()) {
            if (conversationMessageMetadataView.k) {
                return conversationMessageMetadataView.getMeasuredHeight();
            }
            return 0;
        }
        return conversationMessageMetadataView.getLayoutParams().height;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.ax = onClickListener;
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.ay = onLongClickListener;
    }

    protected final int t() {
        return this.h.getMeasuredHeight();
    }

    protected final int u() {
        if (this.j.i()) {
            return ((SuggestionShortcutView) this.j.b()).getMeasuredHeight();
        }
        return 0;
    }

    protected final int v() {
        if (this.j.i()) {
            return ((SuggestionShortcutView) this.j.b()).getMeasuredWidth();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(int i, int i2) {
        this.aj.measure(i, i2);
    }

    protected final void x(int i, int i2) {
        if (this.f.i()) {
            ((ImageView) this.f.b()).measure(i, i2);
        }
    }

    protected final void y(int i, int i2) {
        xvy xvyVar = this.al;
        if (xvyVar != null && xvyVar.i()) {
            ((ComposeView) xvyVar.b()).measure(i, i2);
        }
    }

    public final boolean z() {
        return this.e.aa();
    }

    @Override // defpackage.aacv
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }
}
