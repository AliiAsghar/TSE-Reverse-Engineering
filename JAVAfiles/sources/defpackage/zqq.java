package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.ContactsContract;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaAttachmentView;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaDownloadOverlayView;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zqq implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zqq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v45, types: [zsq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [zsq, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Uri d;
        Uri d2;
        ConversationRichCardView conversationRichCardView;
        int i = 16;
        Uri uri = null;
        rti rtiVar = null;
        uri = null;
        int i2 = 1;
        switch (this.b) {
            case 0:
                ((zqu) this.a).c();
                return;
            case 1:
                VCardAttachmentView vCardAttachmentView = (VCardAttachmentView) this.a;
                if (vCardAttachmentView.e.g()) {
                    rtu rtuVar = (rtu) vCardAttachmentView.e.a();
                    xyl.l(rtuVar);
                    String n = rtuVar.n();
                    if (n != null) {
                        uri = ContactsContract.Contacts.getLookupUri(rtuVar.a(), n);
                    }
                }
                if (uri != null) {
                    vCardAttachmentView.a.e(vCardAttachmentView.getContext(), uri, 2);
                    return;
                }
                return;
            case 2:
                zri zriVar = (zri) this.a;
                zriVar.D(false);
                zxa zxaVar = zriVar.j;
                iry iryVar = new iry(zxaVar, i);
                ixd ixdVar = (ixd) zxaVar;
                ixdVar.R(null, iryVar);
                ixdVar.bX.i();
                ixdVar.l();
                zriVar.F();
                return;
            case 3:
                zri zriVar2 = (zri) this.a;
                rsr rsrVar = (rsr) zriVar2.y.a();
                rsrVar.P(null);
                rsrVar.m = false;
                zriVar2.o.setText((CharSequence) null);
                zriVar2.N(false);
                zriVar2.A();
                zriVar2.G = false;
                xwr.i(zriVar2.w, zriVar2.ar.getResources().getString(R.string.subject_deleted));
                return;
            case 4:
                ((zri) this.a).b.toggle();
                return;
            case 5:
                xze xzeVar = zri.a;
                this.a.run();
                return;
            case 6:
                ztr ztrVar = (ztr) this.a;
                ((mbl) ztrVar.c.b()).c("Bugle.Banners2o.CloseButtonClicked.Count");
                zts ztsVar = ztrVar.D;
                if (ztsVar != null) {
                    ztsVar.a(ztrVar);
                }
                ((alwl) ((alwl) ztr.a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/FullBannerUiController", "setOnCloseClickListener", 378, "FullBannerUiController.java")).q("Banner close button clicked");
                return;
            case 7:
                ztr ztrVar2 = (ztr) this.a;
                ((mbl) ztrVar2.c.b()).c("Bugle.Banners2o.StartButtonClicked.Count");
                zts ztsVar2 = ztrVar2.B;
                if (ztsVar2 != null) {
                    ztsVar2.a(ztrVar2);
                }
                ((alwl) ((alwl) ztr.a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/FullBannerUiController", "setOnStartButtonClickListener", 359, "FullBannerUiController.java")).q("Banner start button clicked");
                return;
            case 8:
                ztr ztrVar3 = (ztr) this.a;
                ((mbl) ztrVar3.c.b()).c("Bugle.Banners2o.EndButtonClicked.Count");
                zts ztsVar3 = ztrVar3.A;
                if (ztsVar3 != null) {
                    ztsVar3.a(ztrVar3);
                }
                ((alwl) ((alwl) ztr.a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/FullBannerUiController", "setOnEndButtonClickListener", 342, "FullBannerUiController.java")).q("Banner end button clicked");
                return;
            case 9:
                int i3 = ztq.j;
                ((alwl) ((alwl) ztr.a.g()).h("com/google/android/apps/messaging/ui/conversation/banners2o/FullBannerUiController$BannerCardView", "<init>", 1281, "FullBannerUiController.java")).q("Banner chip clicked");
                ztr ztrVar4 = (ztr) this.a;
                if (ztrVar4.E != 1 && !ztrVar4.u && ztrVar4.t <= 0 && !ztrVar4.v) {
                    ((mbl) ztrVar4.c.b()).c("Bugle.Banners2o.Expanded.Count");
                    zwf zwfVar = new zwf();
                    zwfVar.setDuration(166L);
                    View view2 = ztrVar4.k.d;
                    view2.getClass();
                    zwfVar.addTarget(view2);
                    Fade fade = new Fade(2);
                    fade.setStartDelay(83L);
                    fade.setDuration(83L);
                    fade.addTarget(ztrVar4.i);
                    zwe zweVar = new zwe();
                    zweVar.setStartDelay(83L);
                    zweVar.setDuration(333L);
                    zweVar.addTarget(ztrVar4.g);
                    ChangeBounds changeBounds = new ChangeBounds();
                    changeBounds.setStartDelay(83L);
                    changeBounds.setDuration(333L);
                    changeBounds.addTarget(ztrVar4.f);
                    changeBounds.addTarget(ztrVar4.g);
                    Fade fade2 = new Fade(1);
                    fade2.setStartDelay(333L);
                    fade2.setDuration(83L);
                    fade2.addTarget(ztrVar4.h);
                    zwf zwfVar2 = new zwf();
                    zwfVar2.setStartDelay(333L);
                    zwfVar2.setDuration(166L);
                    View view3 = ztrVar4.j.d;
                    view3.getClass();
                    zwfVar2.addTarget(view3);
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(fade);
                    transitionSet.addTransition(changeBounds);
                    transitionSet.addTransition(fade2);
                    transitionSet.addTransition(zweVar);
                    transitionSet.addTransition(zwfVar2);
                    transitionSet.addTransition(zwfVar);
                    transitionSet.addListener((Transition.TransitionListener) new akuh(ztrVar4.G, new ztm(ztrVar4), "FullBannerUiController: Expand transition"));
                    ztr.b(ztrVar4.g, 16, new zth(i2));
                    TransitionManager.beginDelayedTransition(ztrVar4.f, transitionSet);
                    ztrVar4.E = 1;
                    ztrVar4.h.setVisibility(0);
                    ztrVar4.i.setVisibility(8);
                    ztrVar4.e.b(ztrVar4.f);
                    ztrVar4.g.gb(ztrVar4.d.getResources().getDimension(R.dimen.banner2o_full_corner_radius));
                    ztrVar4.j.setScaleX(1.0f);
                    ztrVar4.j.setScaleY(1.0f);
                    ztrVar4.k.setScaleX(brg.a);
                    ztrVar4.k.setScaleY(brg.a);
                }
                zts ztsVar4 = ztrVar4.C;
                if (ztsVar4 != null) {
                    ztsVar4.a(ztrVar4);
                    return;
                }
                return;
            case 10:
                ?? r1 = this.a;
                zut zutVar = (zut) r1;
                ResolvedRecipient resolvedRecipient = zutVar.f;
                if (resolvedRecipient != null && (d = resolvedRecipient.d()) != null) {
                    ((qky) zutVar.c.b()).e(zutVar.b, d, 9);
                }
                zutVar.i();
                zutVar.d.a(r1, false);
                return;
            case 11:
                ?? r12 = this.a;
                zuz zuzVar = (zuz) r12;
                ResolvedRecipient resolvedRecipient2 = zuzVar.f;
                if (resolvedRecipient2 != null && (d2 = resolvedRecipient2.d()) != null) {
                    ((qky) zuzVar.c.b()).e(zuzVar.b, d2, 10);
                }
                zuzVar.i();
                zuzVar.d.a(r12, false);
                return;
            case 12:
                ((aaaz) this.a).dismiss();
                return;
            case 13:
                Object obj = this.a;
                int b = ((oo) obj).b();
                afim afimVar = (afim) obj;
                String str = (String) ((aaaz) afimVar.t).d.get(b);
                ahjj ahjjVar = ((aaaz) afimVar.t).n;
                ahjjVar.getClass();
                ((aaat) ahjjVar.a).E(str);
                ((aaaz) afimVar.t).dismiss();
                return;
            case 14:
                xyl.l(((ConversationMessageTransferView) this.a).b);
                if (((ConversationMessageTransferView) this.a).a.au()) {
                    if (((ConversationMessageTransferView) this.a).a.ao()) {
                        ConversationMessageView conversationMessageView = (ConversationMessageView) ((ConversationMessageTransferView) this.a).b;
                        aack aackVar = conversationMessageView.s;
                        rry rryVar = conversationMessageView.e;
                        d.s(!rryVar.av());
                        itb itbVar = (itb) aackVar;
                        if (rryVar.ah(itbVar.f.F()) && itbVar.m.b(itbVar.f.F())) {
                            itbVar.aP.a(rryVar.u()).t();
                            return;
                        }
                        return;
                    }
                    ConversationMessageView conversationMessageView2 = (ConversationMessageView) ((ConversationMessageTransferView) this.a).b;
                    rry rryVar2 = conversationMessageView2.e;
                    if (rryVar2 != null) {
                        itb itbVar2 = (itb) conversationMessageView2.s;
                        if (rryVar2.ad(itbVar2.f.F()) && itbVar2.m.b(itbVar2.f.F())) {
                            rti d3 = itbVar2.d(rryVar2.s());
                            if (rryVar2.av() && rryVar2.f() == 112 && d3 != null) {
                                int b2 = itbVar2.n.b();
                                yjy yjyVar = itbVar2.n;
                                int i4 = d3.a;
                                if (!yjyVar.o(i4)) {
                                    abbj.a(itbVar2.f.F(), itbVar2.n.h(i4).t(), itbVar2.n.h(b2).t(), false);
                                    return;
                                }
                            }
                            itbVar2.o(rryVar2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (((ConversationMessageTransferView) this.a).a.aM()) {
                    ConversationMessageView conversationMessageView3 = (ConversationMessageView) ((ConversationMessageTransferView) this.a).b;
                    aack aackVar2 = conversationMessageView3.s;
                    rry rryVar3 = conversationMessageView3.e;
                    d.s(!rryVar3.av());
                    itb itbVar3 = (itb) aackVar2;
                    if (rryVar3.ah(itbVar3.f.F()) && itbVar3.m.b(itbVar3.f.F())) {
                        itbVar3.aP.a(rryVar3.u()).t();
                        return;
                    }
                    return;
                }
                ConversationMessageView conversationMessageView4 = (ConversationMessageView) ((ConversationMessageTransferView) this.a).b;
                aack aackVar3 = conversationMessageView4.s;
                rry rryVar4 = conversationMessageView4.e;
                if (rryVar4.ag()) {
                    itb itbVar4 = (itb) aackVar3;
                    if (itbVar4.m.b(itbVar4.f.F())) {
                        itbVar4.an.m(rryVar4.u());
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ConversationMessageView conversationMessageView5 = (ConversationMessageView) this.a;
                conversationMessageView5.B.c(conversationMessageView5.getContext(), conversationMessageView5.e);
                return;
            case 16:
                ((aadx) this.a).a.F().finish();
                return;
            case 17:
                aadx aadxVar = (aadx) this.a;
                cj F = aadxVar.a.F();
                GoogleHelp googleHelp = new GoogleHelp("eligible");
                googleHelp.G = true;
                googleHelp.q = Uri.parse((String) aadxVar.b.b());
                InProductHelp inProductHelp = new InProductHelp(googleHelp, null, null, 0, null, 0, null);
                inProductHelp.c = (String) aadxVar.b.b();
                new acak((Activity) F).c(inProductHelp);
                return;
            case 18:
                view.getClass();
                boolean F2 = d.F(((Button) view.findViewById(R.id.rbm_bottom_sheet_sim_button)).getText(), view.getContext().getResources().getString(R.string.rbm_got_it_button));
                Object obj2 = this.a;
                if (F2) {
                    ((aaed) obj2).a.d();
                    return;
                }
                aaed aaedVar = (aaed) obj2;
                int i5 = ((adix) aqjn.W(((adji) aaedVar.d.b()).k())).a;
                rtj rtjVar = aaedVar.h;
                if (rtjVar == null) {
                    arro.b("selfIdentityListData");
                    rtjVar = null;
                }
                alur it = rtjVar.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    rti rtiVar2 = (rti) it.next();
                    if (rtiVar2.a == i5) {
                        rtiVar = rtiVar2;
                    }
                }
                if (rtiVar == null) {
                    aaedVar.a.d();
                    return;
                } else {
                    aktp.L(new jae(rtiVar), view);
                    aaedVar.a.d();
                    return;
                }
            case 19:
                RichCardMediaAttachmentView richCardMediaAttachmentView = (RichCardMediaAttachmentView) this.a;
                if (richCardMediaAttachmentView.l == 2 && richCardMediaAttachmentView.k == 5 && (conversationRichCardView = richCardMediaAttachmentView.m) != null) {
                    MessagePartCoreData i6 = conversationRichCardView.i();
                    Rect g = ((yai) richCardMediaAttachmentView.f.b()).g(view);
                    ConversationRichCardView conversationRichCardView2 = richCardMediaAttachmentView.m;
                    aack aackVar4 = conversationRichCardView2.m;
                    if (aackVar4 != null && i6 != null) {
                        aackVar4.E(conversationRichCardView2, i6, g, false);
                        return;
                    }
                    return;
                }
                return;
            default:
                RichCardMediaDownloadOverlayView richCardMediaDownloadOverlayView = (RichCardMediaDownloadOverlayView) this.a;
                if (richCardMediaDownloadOverlayView.b == null) {
                    xyl.c("A click event happened, but RichCardMediaTransferHost was not set for this view.");
                    return;
                }
                int d4 = richCardMediaDownloadOverlayView.d();
                int i7 = d4 - 1;
                if (d4 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                return;
                            }
                        } else {
                            RichCardMediaAttachmentView richCardMediaAttachmentView2 = ((RichCardMediaDownloadOverlayView) this.a).b;
                            ConversationRichCardView conversationRichCardView3 = richCardMediaAttachmentView2.m;
                            if (conversationRichCardView3 == null) {
                                xyl.c("A download cancellation was requested but the RichCardMediaAttachmentHost was null for this view.");
                                return;
                            }
                            String j = conversationRichCardView3.j();
                            if (j == null) {
                                RichCardMediaAttachmentView.a.m("Requested cancellation of download that has no url in the first place");
                                return;
                            }
                            ((ujc) ((uja) richCardMediaAttachmentView2.d.b()).a).a(Uri.parse(j));
                            richCardMediaAttachmentView2.h = 0;
                            richCardMediaAttachmentView2.k = 2;
                            richCardMediaAttachmentView2.c.c();
                            return;
                        }
                    }
                    RichCardMediaAttachmentView richCardMediaAttachmentView3 = ((RichCardMediaDownloadOverlayView) this.a).b;
                    ConversationRichCardView conversationRichCardView4 = richCardMediaAttachmentView3.m;
                    if (conversationRichCardView4 == null) {
                        xyl.c("A download cancellation was requested but the RichCardMediaAttachmentHost was null for this view.");
                        return;
                    }
                    MessagePartCoreData i8 = conversationRichCardView4.i();
                    if (i8 == null) {
                        RichCardMediaAttachmentView.a.m("Requested download of media but there is no associated media message part data");
                        return;
                    }
                    ((uja) richCardMediaAttachmentView3.d.b()).a(i8, richCardMediaAttachmentView3);
                    richCardMediaAttachmentView3.k = 3;
                    richCardMediaAttachmentView3.c.c();
                    return;
                }
                throw null;
        }
    }

    public zqq(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
