package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.constraint.ConstraintLayout;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrb extends zrk implements zra {
    public final armf b;
    public final zri c;

    /* JADX WARN: Type inference failed for: r0v23, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v109, types: [java.lang.Object, aaex] */
    /* JADX WARN: Type inference failed for: r2v58, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [armf, java.lang.Object] */
    public zrb(armf armfVar, armf armfVar2) {
        this.b = armfVar;
        zrj zrjVar = (zrj) armfVar2.b();
        armf armfVar3 = zrjVar.a;
        ComposeMessageView composeMessageView = (ComposeMessageView) zrjVar.b.b();
        composeMessageView.getClass();
        armf armfVar4 = zrjVar.c;
        armf armfVar5 = zrjVar.d;
        armf armfVar6 = zrjVar.e;
        armf armfVar7 = zrjVar.f;
        armf armfVar8 = zrjVar.g;
        armf armfVar9 = zrjVar.h;
        armf armfVar10 = zrjVar.i;
        armf armfVar11 = zrjVar.j;
        armf armfVar12 = zrjVar.k;
        armf armfVar13 = zrjVar.l;
        armf armfVar14 = zrjVar.m;
        armf armfVar15 = zrjVar.n;
        armf armfVar16 = zrjVar.o;
        armf armfVar17 = zrjVar.p;
        armf armfVar18 = zrjVar.q;
        armf armfVar19 = zrjVar.r;
        armf armfVar20 = zrjVar.s;
        armf armfVar21 = zrjVar.t;
        armf armfVar22 = zrjVar.u;
        armf armfVar23 = zrjVar.v;
        armf armfVar24 = zrjVar.w;
        armf armfVar25 = zrjVar.x;
        armf armfVar26 = zrjVar.y;
        armf armfVar27 = zrjVar.z;
        armf armfVar28 = zrjVar.A;
        armf armfVar29 = zrjVar.B;
        armf armfVar30 = zrjVar.C;
        armf armfVar31 = zrjVar.D;
        Context context = (Context) zrjVar.E.b();
        context.getClass();
        armf armfVar32 = zrjVar.F;
        ?? b = zrjVar.G.b();
        b.getClass();
        armf armfVar33 = zrjVar.H;
        armf armfVar34 = zrjVar.I;
        armf armfVar35 = zrjVar.J;
        armf armfVar36 = zrjVar.K;
        armf armfVar37 = zrjVar.L;
        armf armfVar38 = zrjVar.M;
        armf armfVar39 = zrjVar.N;
        armf armfVar40 = zrjVar.O;
        armf armfVar41 = zrjVar.P;
        armf armfVar42 = zrjVar.Q;
        armf armfVar43 = zrjVar.R;
        psw pswVar = (psw) zrjVar.S.b();
        pswVar.getClass();
        ryg rygVar = (ryg) zrjVar.T.b();
        rygVar.getClass();
        zri zriVar = new zri(armfVar3, composeMessageView, armfVar4, armfVar5, armfVar6, armfVar7, armfVar8, armfVar9, armfVar10, armfVar11, armfVar12, armfVar13, armfVar14, armfVar15, armfVar16, armfVar17, armfVar18, armfVar19, armfVar20, armfVar21, armfVar22, armfVar23, armfVar24, armfVar25, armfVar26, armfVar27, armfVar28, armfVar29, armfVar30, armfVar31, context, armfVar32, b, armfVar33, armfVar34, armfVar35, armfVar36, armfVar37, armfVar38, armfVar39, armfVar40, armfVar41, armfVar42, armfVar43, pswVar, rygVar, zrjVar.U, zrjVar.V, zrjVar.W, zrjVar.X);
        this.c = zriVar;
        if (zriVar.ar.isInEditMode()) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) zriVar.ar.findViewById(R.id.compose_message_container);
        linearLayout.removeView(zriVar.ar.findViewById(R.id.send_message_button_container));
        int i = 1;
        LayoutInflater.from(zriVar.k).inflate(R.layout.send_button, (ViewGroup) linearLayout, true);
        aair aairVar = (aair) zriVar.S.b();
        zrb h = zriVar.h();
        abdc abdcVar = (abdc) aairVar.g.b();
        abdcVar.getClass();
        zqx zqxVar = (zqx) aairVar.a.b();
        zqxVar.getClass();
        xnv xnvVar = (xnv) aairVar.b.b();
        xnvVar.getClass();
        zrs zrsVar = (zrs) aairVar.h.b();
        zrsVar.getClass();
        uvi uviVar = (uvi) aairVar.e.b();
        uviVar.getClass();
        zriVar.l = new zqz(abdcVar, zqxVar, xnvVar, zrsVar, uviVar, h, (Optional) ((apxx) aairVar.d).a, aairVar.c, aairVar.f);
        zriVar.n = (PlainTextEditText) zriVar.ar.findViewById(R.id.compose_message_text);
        zriVar.L();
        zriVar.n.setMaxLines(1);
        zriVar.n.setEllipsize(TextUtils.TruncateAt.END);
        zriVar.m = (PlainTextEditText) zriVar.ar.findViewById(R.id.compose_message_suggestion_text);
        if (((zxy) zriVar.O.b()).t() && ((Optional) ((apxx) zriVar.P).a).isPresent()) {
            aaey aaeyVar = (aaey) ((Optional) ((apxx) zriVar.P).a).get();
            PlainTextEditText plainTextEditText = zriVar.n;
            PlainTextEditText plainTextEditText2 = zriVar.m;
            zriVar.h();
            zriVar.C = Optional.of(aaeyVar.a());
            zriVar.C.get().b();
        }
        if (((Boolean) yig.C.e()).booleanValue()) {
            String l = zriVar.l(ruy.a);
            zriVar.n.setPrivateImeOptions(l);
            zriVar.m.setPrivateImeOptions(l);
        }
        if (!zriVar.ae()) {
            zriVar.n.setShowSoftInputOnFocus(false);
        }
        if (!zriVar.ae()) {
            zriVar.n.setOnEditorActionListener(new aksi((aksr) zriVar.ac.b(), zriVar.h(), "ComposeMessageViewPeer composeEditText onEditorAction"));
        }
        zriVar.n.addTextChangedListener(new aksq((aksr) zriVar.ac.b(), zriVar.h(), "ComposeMessageViewPeer composeEditText textWatcher"));
        int i2 = 3;
        if (!zriVar.ae()) {
            zriVar.n.setOnFocusChangeListener(new aksc((aksr) zriVar.ac.b(), new ilc(zriVar, i2), "ComposeMessageViewPeer composeEditText onFocusChange"));
        }
        int i3 = 2;
        zriVar.n.setOnClickListener(new akwb((aksr) zriVar.ac.b(), "ComposeMessageViewPeer composeEditText onClick", new zqq(zriVar, i3), i));
        zriVar.n.setFilters(new InputFilter[]{new InputFilter.LengthFilter(((xbf) zriVar.T.b()).a(-1).f())});
        zriVar.p = zriVar.n;
        boolean ae = zriVar.ae();
        rrb rrbVar = zriVar.y;
        PlainTextEditText plainTextEditText3 = zriVar.n;
        aoij aoijVar = new aoij(zriVar, rrbVar, plainTextEditText3, (byte[]) null);
        if (!ae) {
            plainTextEditText3.d(aoijVar, zra.fq);
        }
        zriVar.o = (PlainTextEditText) zriVar.ar.findViewById(R.id.compose_subject_text);
        zriVar.o.addTextChangedListener(new aksq((aksr) zriVar.ac.b(), zriVar.h(), "ComposeMessageViewPeer composeSubject textWatcher"));
        zriVar.o.setFilters(new InputFilter[]{new InputFilter.LengthFilter(((xbf) zriVar.T.b()).a(-1).e())});
        int i4 = 4;
        if (!zriVar.ae()) {
            zriVar.o.setOnFocusChangeListener(new aksc((aksr) zriVar.ac.b(), new ilc(zriVar, i4), "ComposeMessageViewPeer composeSubjectText onFocusChange"));
        }
        if (!ae) {
            zriVar.o.d(aoijVar, zra.fq);
        }
        zriVar.w = (ImageButton) zriVar.ar.findViewById(R.id.delete_subject_button);
        zriVar.w.setOnClickListener(new akwb((aksr) zriVar.ac.b(), "ComposeMessageViewPeer deleteSubjectButton onClick", new zqq(zriVar, i2), i));
        zriVar.v = zriVar.ar.findViewById(R.id.subject_view);
        int d = ahnz.d(zriVar.o, R.attr.colorOnSurfaceVariant);
        zriVar.o.setHintTextColor(d);
        zriVar.w.getDrawable().setTint(d);
        zriVar.m.setTextColor(d);
        zriVar.m.setHintTextColor(d);
        zriVar.n.setHintTextColor(d);
        zriVar.u = (AsyncImageView) zriVar.ar.findViewById(R.id.send_message_button_icon);
        zriVar.t = zriVar.ar.findViewById(R.id.send_message_button_container);
        afvl afvlVar = new afvl((aksr) zriVar.ac.b(), "Send Message Long Click", new View.OnLongClickListener() { // from class: zrc
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                aktp.L(new imb(), view);
                return true;
            }
        }, i3);
        zrh zrhVar = new zrh(zriVar);
        if (zriVar.g().r() || zriVar.M) {
            wyp wypVar = (wyp) zriVar.Z.b();
            ComposeMessageView composeMessageView2 = zriVar.ar;
            rrb rrbVar2 = zriVar.y;
            zsg zsgVar = (zsg) wypVar.f.b();
            zsgVar.getClass();
            Context context2 = (Context) wypVar.e.b();
            context2.getClass();
            Vibrator vibrator = (Vibrator) wypVar.a.b();
            vibrator.getClass();
            wfh wfhVar = (wfh) wypVar.g.b();
            wfhVar.getClass();
            ?? r12 = wypVar.c;
            ?? r14 = wypVar.b;
            ?? r3 = wypVar.d;
            composeMessageView2.getClass();
            rrbVar2.getClass();
            zriVar.f = new zsh(zsgVar, context2, vibrator, wfhVar, r12, r14, r3, composeMessageView2, rrbVar2);
            zriVar.H = true;
        }
        zriVar.e = (AttachmentsContainer) zriVar.ar.findViewById(R.id.attachments_container);
        zop E = zriVar.e.E();
        zrb h2 = zriVar.h();
        E.a = h2;
        ImageView imageView = (ImageView) h2.o(R.id.compress_info_image_view);
        imageView.getClass();
        E.g = imageView;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(E.r).inflate(R.layout.mms_compress_tooltip_content, (ViewGroup) null);
        E.B = new abac(frameLayout, 1, E.g, 3);
        E.g.getDrawingRect(new Rect());
        ((abbt) E.B.a).setTranslationY(frameLayout.getResources().getDimension(R.dimen.compress_info_tooltip_y_offset));
        ((abbt) E.B.a).i = (int) E.r.getResources().getDimension(R.dimen.tooltip_max_width);
        LinearLayout linearLayout2 = (LinearLayout) h2.o(R.id.compose_message_container);
        linearLayout2.getClass();
        E.h = linearLayout2;
        E.h.addOnLayoutChangeListener(new fyc(E, 8, null));
        E.g.setColorFilter(E.r.getColor(R.color.google_grey600));
        E.g.setOnClickListener(new uai(E, 19));
        E.g.addOnLayoutChangeListener(new fyc(E, 7));
        zriVar.r = (TextView) zriVar.ar.findViewById(R.id.char_counter);
        zriVar.s = (TextView) zriVar.ar.findViewById(R.id.message_indicator);
        zriVar.h = (ConstraintLayout) zriVar.ar.findViewById(R.id.message_compose_view_container_with_c2o);
        zriVar.i = (ViewGroup) zriVar.ar.findViewById(R.id.compose_message_box_linear_layout);
        aohs aohsVar = (aohs) zriVar.am.b();
        aohs.v(zriVar.u, "Send Button");
        aohsVar.s(zriVar.u, new ima());
        zriVar.u.setOnLongClickListener(afvlVar);
        zriVar.u.setAccessibilityDelegate(zrhVar);
        if (((ohc) zriVar.aq.b()).a()) {
            zriVar.u.setBackground(null);
        }
        wyp wypVar2 = (wyp) zriVar.af.b();
        ComposeMessageView composeMessageView3 = zriVar.ar;
        Context context3 = (Context) wypVar2.e.b();
        context3.getClass();
        aksr aksrVar = (aksr) wypVar2.f.b();
        aksrVar.getClass();
        Optional optional = (Optional) ((apxx) wypVar2.a).a;
        ?? r13 = wypVar2.d;
        ?? r142 = wypVar2.b;
        composeMessageView3.getClass();
        zriVar.g = new zqu(context3, aksrVar, optional, r13, r142, composeMessageView3, wypVar2.g, wypVar2.c);
        if (yig.b()) {
            zriVar.w();
        }
        zriVar.q = ((Optional) ((apxx) zriVar.ag).a).map(new yur(zriVar, 17));
        zriVar.M(aabr.aF(zriVar.h, 10));
        zriVar.H();
        zriVar.b = (CheckBox) zriVar.ar.findViewById(R.id.priority_checkbox);
        zriVar.c = (TextView) zriVar.ar.findViewById(R.id.priority_text);
        zriVar.d = (LinearLayout) zriVar.ar.findViewById(R.id.priority_checkbox_container);
        zriVar.d.setOnClickListener(new zqq(zriVar, i4));
        zriVar.b.setClickable(false);
        zriVar.b.setOnCheckedChangeListener(zriVar.h());
        zriVar.x = new xvy(zriVar.ar, R.id.reply_snippet_stub, R.id.reply_snippet_inflated);
        zriVar.D = ((Optional) ((apxx) zriVar.ao).a).map(new zkf(i4));
    }

    public final void A(rsr rsrVar, zxa zxaVar) {
        zri zriVar = this.c;
        zriVar.r(rsrVar);
        zriVar.s(zxaVar);
        if (!zriVar.ae()) {
            rsrVar.f = zxaVar;
        }
    }

    public final void B() {
        this.c.t();
    }

    @Override // defpackage.aacb
    public final void C(boolean z) {
        zri zriVar = this.c;
        zxa zxaVar = zriVar.j;
        if (zxaVar != null) {
            zxaVar.R(null, new ive(zriVar, z, 7));
        }
    }

    public final void D(int i) {
        zri zriVar = this.c;
        if (((trz) zriVar.an.b()).i()) {
            zriVar.U(Integer.valueOf(i));
        }
        zriVar.V();
    }

    public final void E() {
        zri zriVar = this.c;
        zriVar.I = true;
        zriVar.n.setOnEditorActionListener(null);
        zriVar.n.removeTextChangedListener(null);
        zriVar.o.setOnEditorActionListener(null);
        zriVar.o.removeTextChangedListener(null);
        zriVar.ar.removeView(zriVar.n);
        zriVar.ar.removeView(zriVar.o);
        zriVar.C.ifPresent(new zle(18));
        zriVar.q.ifPresent(new zle(19));
    }

    public final void F() {
        this.c.G();
    }

    public final void G() {
        this.c.H();
    }

    @Deprecated
    public final void H() {
        this.c.K();
    }

    @Override // defpackage.aacb
    public final void I(boolean z) {
        zri zriVar = this.c;
        if (zriVar.F.g()) {
            zriVar.W();
            zriVar.D(false);
            zriVar.K();
            zxa zxaVar = zriVar.j;
            if (zxaVar != null) {
                zxaVar.R(new ivd(z, 5), new ivd(z, 6));
            }
        }
    }

    public final void J(Bundle bundle) {
        zxa zxaVar = this.c.j;
        if (zxaVar != null) {
            zxaVar.R(null, new zrg(bundle, 1));
        }
    }

    public final void K(rti rtiVar) {
        zri zriVar = this.c;
        SelfIdentityId d = zriVar.d();
        if (d != null) {
            SelfIdentityId selfIdentityId = rtiVar.b;
            if (!TextUtils.equals(d.a(), ((SelfIdentityIdImpl) selfIdentityId).a)) {
                ((mbl) zriVar.X.b()).c("Bugle.UI.Conversations.SimSwap.Click");
                xyo c = zri.a.c();
                c.H("Click select SIM: ");
                c.H(selfIdentityId);
                c.q();
                zriVar.Q(selfIdentityId, rtiVar.a);
            }
        }
    }

    public final void L(ajwt ajwtVar) {
        this.c.N = ajwtVar;
    }

    public final void M(rre rreVar) {
        this.c.F = rreVar;
    }

    public final void N(ConversationIdType conversationIdType) {
        zri zriVar = this.c;
        zriVar.n.setPrivateImeOptions(zriVar.l(conversationIdType));
    }

    @Override // defpackage.aacb
    public final void O(int i) {
        this.c.ar.setImportantForAccessibility(i);
    }

    public final void P(rtj rtjVar) {
        zri zriVar = this.c;
        zriVar.z = rtjVar;
        zriVar.E();
    }

    public final void Q() {
        zri zriVar = this.c;
        zxa zxaVar = zriVar.j;
        if (zxaVar != null) {
            zxaVar.R(new zrg(zriVar, 2), new zrg(zriVar, 3));
        }
    }

    public final void R() {
        zri zriVar = this.c;
        aiut.f(zriVar.ax);
        zriVar.y.f();
        zxa zxaVar = zriVar.j;
        if (zxaVar != null) {
            zxaVar.R(null, new zrf(15));
            zriVar.j = null;
        }
        zqz zqzVar = zriVar.l;
        zqzVar.a.h(zqzVar.d);
    }

    @Override // defpackage.aacb
    public final void S() {
        this.c.S();
    }

    public final void T() {
        this.c.W();
    }

    public final boolean U() {
        return this.c.Y();
    }

    public final boolean V() {
        return this.c.ab();
    }

    public final boolean W() {
        zri zriVar = this.c;
        zxa zxaVar = zriVar.j;
        if (zxaVar != null) {
            return ((Boolean) zxaVar.H(new zkf(6), new yur(zriVar, 18))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.aacb
    public final void X() {
        ConstraintLayout constraintLayout = this.c.h;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
    }

    public final void Y() {
        this.c.P(true);
    }

    public final void Z() {
        this.c.C.ifPresent(new zle(20));
    }

    @Override // defpackage.ino
    public final void a(ins insVar) {
        this.c.a(insVar);
    }

    public final void aa() {
        zri zriVar = this.c;
        zriVar.v(new zrg(zriVar, 5));
    }

    public final void ab() {
        zri zriVar = this.c;
        zriVar.D.ifPresentOrElse(new zmi(zriVar, 19), new zom(zriVar, 9));
    }

    @Override // defpackage.rsm
    public final void ah() {
        this.c.ah();
    }

    @Override // defpackage.rsm
    public final void ai(rsr rsrVar, int i) {
        akrh e = aktp.e("ComposeMessageViewPeer::onDraftChanged");
        try {
            this.c.ai(rsrVar, i);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ino
    public final void b(ins insVar) {
        this.c.b(insVar);
    }

    @Override // defpackage.rsm
    public final void bp(rsr rsrVar) {
        this.c.bp(rsrVar);
    }

    @Override // defpackage.zra
    public final zqo c() {
        return this.c.g.i;
    }

    @Override // defpackage.zra
    public final CharSequence d() {
        return this.c.j();
    }

    @Override // defpackage.zra
    public final String e() {
        rti f = this.c.f();
        if (f != null) {
            return wfh.y(f.d);
        }
        return null;
    }

    @Override // defpackage.zra
    public final void f(String str) {
        this.c.n.setHint(str);
    }

    @Override // defpackage.zra
    public final void g(int i) {
        Drawable k;
        zri zriVar = this.c;
        if (zriVar.ab()) {
            k = ((zpt) zriVar.aa.b()).k(zriVar.k, i, true);
        } else {
            k = ((zpt) zriVar.aa.b()).k(zriVar.k, i, false);
        }
        k.setAutoMirrored(true);
        Drawable background = zriVar.u.getBackground();
        AsyncImageView asyncImageView = zriVar.u;
        asyncImageView.d(null);
        asyncImageView.setImageDrawable(k);
        zriVar.B(background);
    }

    @Override // defpackage.zra
    public final void h(boolean z) {
        this.c.E = z;
    }

    @Override // defpackage.zra
    public final void i(boolean z) {
        int i;
        zri zriVar = this.c;
        if (!z) {
            zriVar.e.E().a();
        }
        if (true != z) {
            i = 8;
        } else {
            i = 0;
        }
        zriVar.s.setVisibility(i);
        int dimensionPixelSize = zriVar.k.getResources().getDimensionPixelSize(R.dimen.compose_message_send_button_with_indicator_padding_bottom);
        int dimensionPixelSize2 = zriVar.k.getResources().getDimensionPixelSize(R.dimen.compose_message_send_button_with_indicator_padding_top);
        int dimensionPixelSize3 = zriVar.k.getResources().getDimensionPixelSize(R.dimen.compose_message_send_button_without_indicator_padding);
        AsyncImageView asyncImageView = zriVar.u;
        int paddingStart = asyncImageView.getPaddingStart();
        if (true != z) {
            dimensionPixelSize2 = dimensionPixelSize3;
        }
        int paddingEnd = zriVar.u.getPaddingEnd();
        if (true != z) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        asyncImageView.setPaddingRelative(paddingStart, dimensionPixelSize2, paddingEnd, dimensionPixelSize);
    }

    @Override // defpackage.zra
    public final boolean j() {
        zri zriVar = this.c;
        if (!zriVar.y.g()) {
            return false;
        }
        if (TextUtils.isEmpty(zriVar.j()) && !zriVar.ac() && !zriVar.aa()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.zra
    public final boolean k() {
        zri zriVar = this.c;
        if (zriVar.ae()) {
            ikl iklVar = zriVar.B;
            if (iklVar == null || !iklVar.d()) {
                return false;
            }
            return true;
        }
        return ((rrl) zriVar.F.a()).b.d();
    }

    @Override // defpackage.zra
    public final boolean l() {
        return this.c.E;
    }

    @Override // defpackage.zra
    public final boolean m() {
        return this.c.ag();
    }

    public final int n() {
        zri zriVar = this.c;
        if (zriVar.j != null) {
            ydf ydfVar = (ydf) zriVar.ab.b();
            zxa zxaVar = zriVar.j;
            zxaVar.getClass();
            int a = zxaVar.a();
            zxa zxaVar2 = zriVar.j;
            zxaVar2.getClass();
            return ydfVar.a(a, zxaVar2.b());
        }
        return 307200;
    }

    @Override // defpackage.zwy
    public final View o(int i) {
        return this.c.ar.findViewById(i);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.c.onCheckedChanged(compoundButton, z);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.c.onEditorAction(textView, i, keyEvent);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.c.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // defpackage.aacb
    public final View p() {
        return ((ixd) this.c.j).cr;
    }

    @Override // defpackage.aacb
    public final View q() {
        return ((ixd) this.c.j).cr.a;
    }

    public final SelfIdentityId r() {
        return this.c.d();
    }

    public final rre s() {
        return this.c.e();
    }

    public final rsr t() {
        zri zriVar = this.c;
        rsr rsrVar = (rsr) zriVar.y.a();
        rsrVar.Q(zriVar.j().toString());
        rsrVar.P(zriVar.k().toString());
        rsrVar.m = zriVar.Z();
        return rsrVar;
    }

    @Override // defpackage.aacb
    public final MessagePartCoreData u(MessagePartCoreData messagePartCoreData) {
        zri zriVar = this.c;
        MessagePartCoreData w = ((rsr) zriVar.y.a()).w(messagePartCoreData);
        zriVar.n(false);
        return w;
    }

    public final PlainTextEditText v() {
        return this.c.n;
    }

    public final Optional w() {
        return this.c.C;
    }

    public final void x() {
        this.c.m();
    }

    public final void y(boolean z) {
        this.c.n(z);
    }

    public final void z(zxa zxaVar) {
        this.c.s(zxaVar);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // defpackage.rsm
    public final void al(rsr rsrVar) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
