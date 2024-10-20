package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.ConversationStartView;
import com.google.android.apps.messaging.conversation.settings.BusinessContactActionView;
import com.google.android.apps.messaging.privacy.etouffeetoggle.EtouffeeToggleActivity;
import com.google.android.apps.messaging.privacy.settings.PrivacySettingsActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.ui.appsettings.FederatedLearningSettingsActivity;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iix implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ iix(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v52, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, adiv] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        amej amejVar;
        switch (this.c) {
            case 0:
                zhi zhiVar = (zhi) this.b;
                rry rryVar = ((ConversationMessageView) zhiVar.b).e;
                d.s(((Optional) zhiVar.c).isPresent());
                iit iitVar = iit.REACTION_BADGE;
                int ordinal = ((iit) this.a).ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 5) {
                                return;
                            }
                            adjw adjwVar = new adjw();
                            aozy createBuilder = abas.a.createBuilder();
                            String a = rryVar.t().a();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            abas abasVar = (abas) createBuilder.b;
                            a.getClass();
                            abasVar.b = 4 | abasVar.b;
                            abasVar.d = a;
                            String a2 = rryVar.u().a();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            apag apagVar = createBuilder.b;
                            abas abasVar2 = (abas) apagVar;
                            a2.getClass();
                            abasVar2.b = 2 | abasVar2.b;
                            abasVar2.c = a2;
                            if (!apagVar.isMutable()) {
                                createBuilder.u();
                            }
                            apag apagVar2 = createBuilder.b;
                            abas abasVar3 = (abas) apagVar2;
                            abasVar3.b |= 8;
                            abasVar3.e = true;
                            long j = rryVar.h;
                            if (!apagVar2.isMutable()) {
                                createBuilder.u();
                            }
                            abas abasVar4 = (abas) createBuilder.b;
                            abasVar4.b |= 16;
                            abasVar4.f = j;
                            adjwVar.d((abas) createBuilder.s());
                            aktp.L(adjwVar.c(), (View) zhiVar.b);
                            return;
                        }
                        int i = alog.d;
                        aktp.L(new aafs(alsx.a), (View) zhiVar.b);
                        return;
                    }
                    aktp.L(new jbi((View) zhiVar.b, view, new BugleConversationId(rryVar.t()), rryVar.u(), rryVar.n()), (View) zhiVar.b);
                    return;
                }
                ipq f = ((iuu) ((Optional) zhiVar.c).get()).f();
                SelfIdentityId s = rryVar.s();
                wks wksVar = rryVar.p;
                wksVar.getClass();
                aktp.L(new ius(f, s, wksVar), (View) zhiVar.b);
                return;
            case 1:
                int b = ((oo) this.a).b();
                Object obj = this.b;
                if (b == 0) {
                    fyj fyjVar = (fyj) obj;
                    fyf fyfVar = fyjVar.d;
                    View view2 = fyjVar.s;
                    dzg.g(view2);
                    fyjVar.a(fyfVar, view2);
                    return;
                }
                if (b == 1) {
                    fyj fyjVar2 = (fyj) obj;
                    fyd fydVar = fyjVar2.f;
                    View view3 = fyjVar2.s;
                    dzg.g(view3);
                    fyjVar2.a(fydVar, view3);
                    return;
                }
                ((fyj) obj).g.dismiss();
                return;
            case 2:
                ConversationStartView conversationStartView = (ConversationStartView) this.a;
                mho mhoVar = conversationStartView.c;
                BusinessInfoData businessInfoData = (BusinessInfoData) this.b;
                mhoVar.aN(3, amho.BIZINFO_SOURCE_CONVERSATION_START, businessInfoData.getRbmBotId());
                ((zfh) conversationStartView.d.b()).n(businessInfoData, conversationStartView.getContext(), (ksm) conversationStartView.b.b());
                return;
            case 3:
                lzv lzvVar = (lzv) ((ixd) this.b).af.b();
                Context context = (Context) this.a;
                akto.n(context, lzvVar.o(context));
                return;
            case 4:
                ((ksm) ((ixd) this.b).ah.b()).i((Activity) this.a);
                return;
            case 5:
                Object obj2 = this.b;
                Object obj3 = this.a;
                if (obj2 == null) {
                    BusinessContactActionView businessContactActionView = (BusinessContactActionView) obj3;
                    businessContactActionView.a.aL(1, 3, null);
                    businessContactActionView.b.k(R.string.business_action_failed_to_launch);
                    return;
                } else {
                    xvd xvdVar = (xvd) obj2;
                    if (!xvdVar.i()) {
                        ((BusinessContactActionView) obj3).b.k(R.string.business_action_failed_to_launch);
                    }
                    ((BusinessContactActionView) obj3).a.aL(xvdVar.j(), 3, xvdVar.h());
                    return;
                }
            case 6:
                ksw kswVar = new ksw(null, null);
                kswVar.f(amek.BUGLE_ADVANCED_FEEDBACK_SOURCE_MESSAGE_DETAIL);
                ((kor) this.b).a((Context) this.a, kswVar.e());
                return;
            case 7:
                CheckBox checkBox = (CheckBox) this.a;
                checkBox.toggle();
                if (checkBox.isChecked()) {
                    amejVar = amej.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_CONSENTED;
                } else {
                    amejVar = amej.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_REJECTED;
                }
                ((kto) this.b).o.a = amejVar;
                return;
            case 8:
                kwl kwlVar = (kwl) this.a;
                lfl lflVar = (lfl) kwlVar.d.b();
                ExtendedFloatingActionButton extendedFloatingActionButton = kwlVar.h;
                extendedFloatingActionButton.getClass();
                ((ahct) lflVar.a.b()).a(new adwq(5).k(), ahcz.c(extendedFloatingActionButton));
                this.b.run();
                return;
            case 9:
                ((kxm) this.b).L(false, (kxl) this.a);
                return;
            case 10:
                d.ag((URLSpan) this.a);
                ((ahjj) this.b).r();
                return;
            case 11:
                lea.a((URLSpan) this.a, (ahjj) this.b, view);
                return;
            case 12:
                ((EtouffeeToggleActivity) ((lrf) this.b).a).startActivity(new Intent("android.intent.action.VIEW").setData((Uri) this.a));
                return;
            case 13:
                alvi alviVar = lrp.a;
                Object obj4 = this.a;
                obj4.getClass();
                Intent data = new Intent("android.intent.action.VIEW").setData((Uri) this.b);
                data.getClass();
                akto.n((Context) obj4, data);
                return;
            case 14:
                ((PrivacySettingsActivity) ((lru) this.b).a).startActivity(new Intent("android.intent.action.VIEW").setData((Uri) this.a));
                return;
            case 15:
                aktp.L(new ubd(), (View) this.a);
                ((mbl) ((uaj) this.b).b.b()).c("Bugle.Etouffee.Education.Alert.Dialog.Count");
                return;
            case 16:
                Object obj5 = this.a;
                FederatedLearningSettingsActivity federatedLearningSettingsActivity = (FederatedLearningSettingsActivity) obj5;
                federatedLearningSettingsActivity.H.ay(3, 3);
                federatedLearningSettingsActivity.G.e((Context) obj5, (String) this.b);
                return;
            case 17:
                ((lzv) r0.p.b()).y(((zky) this.a).a, (String) this.b);
                return;
            case 18:
                zky zkyVar = (zky) this.a;
                ((lzv) zkyVar.p.b()).U((Activity) zkyVar.q.b(), adom.n(this.b).a, 4);
                return;
            case 19:
                ((lzv) r0.p.b()).y(((zky) this.a).a, (String) this.b);
                return;
            default:
                ((lzv) r0.p.b()).y(((zky) this.a).a, (String) this.b);
                return;
        }
    }

    public /* synthetic */ iix(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
