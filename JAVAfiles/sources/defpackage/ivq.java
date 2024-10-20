package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.messaging.popup.federatedlearning.FederatedLearningPopupView;
import com.google.android.apps.messaging.popup.spam.SpamPopupView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageLinkPreviewView;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;
import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivq implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ivq(iji ijiVar, ConversationIdType conversationIdType, iqs iqsVar, int i) {
        this.d = i;
        this.b = ijiVar;
        this.c = conversationIdType;
        this.a = iqsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData] */
    /* JADX WARN: Type inference failed for: r0v58, types: [aack, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, android.content.DialogInterface] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v33, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v55, types: [java.lang.Object, aafw] */
    /* JADX WARN: Type inference failed for: r12v56, types: [com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData, java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData] */
    /* JADX WARN: Type inference failed for: r12v57, types: [java.lang.Object, android.content.DialogInterface] */
    /* JADX WARN: Type inference failed for: r12v69, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v24, types: [xuv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v67, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zqu zquVar;
        ValueAnimator valueAnimator;
        zxa zxaVar;
        switch (this.d) {
            case 0:
                ((lzv) ((ixd) this.a).af.b()).y((Context) this.b, (String) this.c);
                return;
            case 1:
                Object obj = this.a;
                qpd qpdVar = qpd.RCS_GROUP_SELF_ONLY;
                iqs iqsVar = (iqs) obj;
                String str = iqsVar.b;
                boolean z = iqsVar.c;
                int i = iqsVar.a;
                iji ijiVar = (iji) this.b;
                Object obj2 = ijiVar.c;
                ((gpx) ijiVar.a).u((Context) obj2, (ConversationIdType) this.c, true, i, z, str, 4, qpdVar);
                return;
            case 2:
                ((lzv) ((ixd) this.a).af.b()).y((Context) this.b, (String) this.c);
                return;
            case 3:
                ?? r12 = this.a;
                Object obj3 = this.b;
                if (!TextUtils.isEmpty(r12)) {
                    FederatedLearningPopupView federatedLearningPopupView = (FederatedLearningPopupView) obj3;
                    federatedLearningPopupView.b.e(federatedLearningPopupView.getContext(), (String) r12);
                    return;
                } else {
                    FederatedLearningPopupView federatedLearningPopupView2 = (FederatedLearningPopupView) obj3;
                    federatedLearningPopupView2.a.y(federatedLearningPopupView2.getContext(), (String) this.c);
                    return;
                }
            case 4:
                SpamPopupView spamPopupView = (SpamPopupView) this.b;
                lrb lrbVar = spamPopupView.e;
                if (lrbVar != null && !((Boolean) ymd.c.e()).booleanValue()) {
                    ((mho) lrbVar.d.b()).ay(2, 2);
                }
                ?? r0 = this.a;
                if (!TextUtils.isEmpty(r0)) {
                    ((ksm) spamPopupView.d.b()).e(spamPopupView.getContext(), (String) r0);
                    return;
                } else {
                    ((lzv) spamPopupView.c.b()).y(spamPopupView.getContext(), (String) this.c);
                    return;
                }
            case 5:
                ((lzv) ((uad) this.a).b.b()).y((Context) this.b, (String) this.c);
                return;
            case 6:
                this.c.i(this.b, ((xum) this.a).b.g(view), false);
                return;
            case 7:
                ((znj) ((zhi) this.a).c.b()).f((String) this.c, (rry) this.b);
                return;
            case 8:
                zri zriVar = ((ComposeMessageView) this.a).E().c;
                if (yig.b() && (zxaVar = zriVar.j) != null) {
                    zxaVar.R(new zmi(zriVar, 17), new zle(15));
                }
                if (((Boolean) ((utz) yig.ai.get()).e()).booleanValue() && (valueAnimator = (zquVar = (zqu) this.b).q) != null && valueAnimator.isRunning()) {
                    ?? r02 = this.c;
                    zquVar.q.end();
                    ((iji) r02.b()).h(true);
                    return;
                }
                return;
            case 9:
                ConversationMessageLinkPreviewView conversationMessageLinkPreviewView = (ConversationMessageLinkPreviewView) this.a;
                if (conversationMessageLinkPreviewView.m.getVisibility() != 0) {
                    conversationMessageLinkPreviewView.l.setVisibility(8);
                    conversationMessageLinkPreviewView.k.setVisibility(8);
                    conversationMessageLinkPreviewView.m.setVisibility(0);
                    conversationMessageLinkPreviewView.m.setAlpha(brg.a);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(conversationMessageLinkPreviewView.m, "alpha", brg.a, 1.0f);
                    ofFloat.setDuration(300L);
                    ofFloat.start();
                }
                if (!((lrf) conversationMessageLinkPreviewView.f.b()).b()) {
                    ((lrf) conversationMessageLinkPreviewView.f.b()).g();
                }
                conversationMessageLinkPreviewView.b.b((MessageIdType) this.b);
                if (((Boolean) utw.w.e()).booleanValue()) {
                    conversationMessageLinkPreviewView.c.d((String) this.c);
                    return;
                }
                return;
            case 10:
                ((aafk) this.a).l(this.b, this.c);
                return;
            case 11:
                ?? r122 = this.b;
                this.a.h(r122);
                aagk aagkVar = (aagk) this.c;
                Object b = aagkVar.e.b();
                b.getClass();
                qjh.l((arwe) b, null, new zez(aagkVar, (SmartSuggestionData) r122, (arpe) null, 11), 3);
                return;
            case 12:
                ?? r123 = this.b;
                Object obj4 = this.a;
                Object obj5 = this.c;
                try {
                    int parseInt = Integer.parseInt(((EditText) obj4).getText().toString().trim());
                    ((trz) ((wyp) obj5).f.b()).g(parseInt);
                    ((abbu) ((wyp) obj5).c.b()).l(a.bV(parseInt, "Set multiplier = "));
                    r123.dismiss();
                    return;
                } catch (RuntimeException e) {
                    xzb.p("Bugle", e, "Failed to set multiplier.");
                    ((abbu) ((wyp) obj5).c.b()).l("Failed to set multiplier.");
                    r123.dismiss();
                    return;
                }
            case 13:
                aalt aaltVar = (aalt) this.c;
                znj znjVar = (znj) aaltVar.H.b();
                int i2 = alog.d;
                znjVar.v(alsx.a);
                String obj6 = ((EditText) this.a).getText().toString();
                if (!TextUtils.isEmpty(obj6)) {
                    List d = ytd.d(obj6);
                    if (!d.isEmpty()) {
                        znj znjVar2 = (znj) aaltVar.H.b();
                        Stream stream = Collection.EL.stream(d);
                        msk mskVar = (msk) aaltVar.aC.b();
                        mskVar.getClass();
                        znjVar2.v((java.util.Collection) stream.map(new aaky(mskVar, 9)).collect(alls.a));
                    }
                }
                ?? r03 = this.b;
                ((abbu) aaltVar.Z.b()).l("List updated to: ".concat(String.valueOf((String) Collection.EL.stream(alog.n(((znj) aaltVar.H.b()).b)).map(new aakq(7)).collect(Collectors.joining(",")))));
                r03.dismiss();
                return;
            case 14:
                ((UncertifiedDeviceActivity) this.c).startActivity((Intent) this.b, (Bundle) this.a);
                return;
            case 15:
                alvg alvgVar = (alvg) afvn.u.g().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder", "bind$lambda$8", 140, "MediaViewHolder.kt");
                String str2 = ((afvn) this.a).z;
                Object obj7 = this.b;
                alvgVar.D("%s clicked with media=%s", str2, obj7);
                this.c.a(obj7);
                return;
            case 16:
                Object obj8 = this.a;
                Object obj9 = this.b;
                afxo afxoVar = (afxo) this.c;
                arrn.J(afxoVar.e, null, null, new afop(afxoVar, (afxc) obj9, (afxk) obj8, (arpe) null, 3), 3);
                return;
            case 17:
                asgf asgfVar = new asgf();
                ((ajbh) this.a).a = null;
                ajap ajapVar = (ajap) this.b;
                ajapVar.j(ajapVar.d, ajapVar.k, ajapVar.h, aizr.j(ajapVar.f));
                ajapVar.b.dismissAllowingStateLoss();
                ahnz.K(asgfVar, ajapVar.d, (String) this.c);
                return;
            case 18:
                asgf asgfVar2 = new asgf();
                ((ajax) this.a).a = null;
                ajap ajapVar2 = (ajap) this.b;
                ajapVar2.j(ajapVar2.d, ajapVar2.k, ajapVar2.h, aizr.j(ajapVar2.f));
                ajapVar2.b.dismissAllowingStateLoss();
                ahnz.K(asgfVar2, ajapVar2.d, (String) this.c);
                return;
            case 19:
                asgf asgfVar3 = new asgf();
                this.b.onClick(view);
                ahnz.L(asgfVar3, ((ajap) this.a).d, (String) this.c);
                return;
            default:
                asgf asgfVar4 = new asgf();
                ((ajac) this.b).c = null;
                ajap ajapVar3 = (ajap) this.a;
                ajapVar3.j(ajapVar3.d, ajapVar3.k, ajapVar3.h, aizr.j(ajapVar3.f));
                ajapVar3.b.dismissAllowingStateLoss();
                ahnz.K(asgfVar4, ajapVar3.d, (String) this.c);
                return;
        }
    }

    public /* synthetic */ ivq(Object obj, EditText editText, DialogInterface dialogInterface, int i) {
        this.d = i;
        this.c = obj;
        this.a = editText;
        this.b = dialogInterface;
    }

    public /* synthetic */ ivq(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ivq(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ivq(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ivq(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
