package defpackage;

import android.provider.Settings;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView;
import com.google.android.apps.messaging.conversation.settings.dataservice.SpamReportingStatus;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izi implements akvz {
    final /* synthetic */ izh a;

    public izi(izh izhVar) {
        this.a = izhVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0073. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v45, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [armf, java.lang.Object] */
    @Override // defpackage.akvz
    public final /* synthetic */ akwa a(akvv akvvVar) {
        ihe iheVar;
        ConversationSettingsOptionItemView.a aVar = (ConversationSettingsOptionItemView.a) akvvVar;
        int ordinal = aVar.a.h.ordinal();
        izh izhVar = this.a;
        BusinessInfoProperty businessInfoProperty = null;
        switch (ordinal) {
            case 8:
                BusinessInfoData businessInfoData = izhVar.b;
                if (businessInfoData != null) {
                    businessInfoProperty = businessInfoData.getPrivacyPolicyUrl();
                }
                if (businessInfoProperty != null) {
                    izhVar.d(businessInfoProperty.getValue());
                    break;
                }
                break;
            case 9:
                BusinessInfoData businessInfoData2 = izhVar.b;
                if (businessInfoData2 != null) {
                    businessInfoProperty = businessInfoData2.getTermsAndConditionsUrl();
                }
                if (businessInfoProperty != null) {
                    izhVar.d(businessInfoProperty.getValue());
                    break;
                }
                break;
            case 10:
                izhVar.g.e(izhVar.e.fe(), "business_messaging");
                break;
            default:
                iyl iylVar = (iyl) izhVar.e.G().e("conversation_settings_base_fragment");
                iylVar.getClass();
                iyn E = iylVar.E();
                rsg rsgVar = aVar.a;
                boolean z = true;
                boolean z2 = !rsgVar.f;
                int ordinal2 = rsgVar.h.ordinal();
                int i = 8;
                if (ordinal2 != 11) {
                    boolean z3 = false;
                    switch (ordinal2) {
                        case 0:
                            rsd rsdVar = E.c;
                            rsdVar.d.a(rsdVar.a, Boolean.valueOf(z2), null, null, null).t();
                            xzb.j("Bugle", "notifications enabled = " + z2);
                            break;
                        case 1:
                            E.w.startActivityForResult(((lzv) E.i.b()).N(E.w.z().getString(R.string.notification_sound_pref_title), rsgVar.d, Settings.System.DEFAULT_NOTIFICATION_URI), 1000);
                            break;
                        case 2:
                            rsd rsdVar2 = E.c;
                            rsdVar2.d.a(rsdVar2.a, null, null, Boolean.valueOf(z2), null).t();
                            xzb.j("Bugle", "vibration enabled = " + z2);
                            break;
                        case 3:
                            tqc tqcVar = rsgVar.l;
                            albo.U(E.e.m(), "Opening notification settings when conversation name is not loaded");
                            String str = E.e.c;
                            if (yhx.d) {
                                E.g = ((xzu) E.n.b()).f(E.x);
                                xzu xzuVar = (xzu) E.n.b();
                                String str2 = E.g;
                                str2.getClass();
                                boolean k = xzuVar.k(str2);
                                Optional d = E.d.c.b.d();
                                if (tqcVar == null || !tqcVar.g()) {
                                    z = false;
                                }
                                if (qrl.a()) {
                                    z3 = E.d.c.b.g();
                                }
                                boolean z4 = z3;
                                if (!z && !k) {
                                    akbo akboVar = (akbo) E.q.b();
                                    xzu xzuVar2 = (xzu) E.n.b();
                                    ConversationId conversationId = E.y;
                                    msh mshVar = (msh) d.orElse(null);
                                    String str3 = E.g;
                                    str3.getClass();
                                    akboVar.c(new ahlp(xzuVar2.c(conversationId, str, mshVar, str3, z4)), E.H);
                                    break;
                                }
                            }
                            E.a(str);
                            break;
                        case 4:
                            ((lzv) E.i.b()).H(E.w.fe());
                            break;
                        case 5:
                            rsd rsdVar3 = E.c;
                            rsdVar3.d.a(rsdVar3.a, null, null, null, Integer.valueOf(z2 ? 1 : 0)).t();
                            xzb.j("Bugle", "xms sending enabled = " + z2);
                            break;
                        case 6:
                            if (((trz) E.k.b()).p()) {
                                ParticipantsTable.BindData bindData = rsgVar.j;
                                bindData.getClass();
                                armf armfVar = E.h;
                                String M = bindData.M();
                                Conversation a = ((miw) armfVar.b()).a(new BugleConversationId(E.x), miv.MINIMAL);
                                akbo akboVar2 = (akbo) E.q.b();
                                jxv jxvVar = (jxv) E.G.b();
                                akboVar2.j(ahlp.k(a.e().b().h(new ijq(jxvVar, M, 5), jxvVar.a)), new ahlp((Object) null), E.F);
                                break;
                            }
                            break;
                        case 7:
                            ParticipantsTable.BindData a2 = rsgVar.a();
                            if (a2 != null && a2.R()) {
                                akbo akboVar3 = (akbo) E.q.b();
                                tby tbyVar = (tby) E.o.b();
                                ConversationIdType conversationIdType = E.x;
                                yyz yyzVar = (yyz) tbyVar.a.b();
                                xxl b = xxm.b();
                                b.d = conversationIdType;
                                b.e = a2.M();
                                b.a = false;
                                b.b = false;
                                b.g = amfe.CONVERSATION_FROM_UNBLOCK_ACTION;
                                b.c(3);
                                b.b(6);
                                akboVar3.j(ahlp.l(yyzVar.e(b.a().a()).h(new its(i), andi.a)), new ahlp(a2), E.E);
                                return akwa.a;
                            }
                            xzb.j("Bugle", "asking user to confirm blocking ".concat(String.valueOf(yyb.bh(((iew) E.v.b()).n(a2, true)))));
                            igz igzVar = (igz) E.m.b();
                            ihb a3 = ihg.a();
                            a3.d(ihe.BLOCK);
                            a3.e = 2;
                            a3.b = a2;
                            a3.c(E.x);
                            a3.c = new igd(4);
                            a3.d = hld.j(a2);
                            a3.e();
                            a3.f = 6;
                            igzVar.d(a3.a());
                            break;
                        default:
                            xyl.c("Unsupported conversation setting item id: ".concat(String.valueOf(String.valueOf(rsgVar.h))));
                            break;
                    }
                } else {
                    SpamReportingStatus spamReportingStatus = new SpamReportingStatus(rsgVar.a(), rsgVar.l);
                    if (rsgVar.l == tqc.SPAM_FOLDER) {
                        ((akbo) E.q.b()).c(new ahlp(aktp.ai(new haw(E, spamReportingStatus.a, i), (Executor) E.u.b())), E.D);
                    } else {
                        ParticipantsTable.BindData bindData2 = spamReportingStatus.a;
                        igz igzVar2 = (igz) E.m.b();
                        ihb a4 = ihg.a();
                        if (E.c.b) {
                            iheVar = ihe.GROUP_SPAM;
                        } else {
                            iheVar = ihe.SPAM;
                        }
                        a4.d(iheVar);
                        a4.e = 2;
                        a4.b = bindData2;
                        a4.c(E.x);
                        a4.c = new igd(4);
                        a4.d = hld.j(bindData2);
                        a4.e();
                        a4.f = 6;
                        igzVar2.d(a4.a());
                    }
                }
                return akwa.a;
        }
        return akwa.a;
    }
}
