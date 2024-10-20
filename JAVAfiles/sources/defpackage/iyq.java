package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyq extends no {
    public rsf c;
    final /* synthetic */ iyn d;

    public iyq(iyn iynVar) {
        this.d = iynVar;
    }

    public final alog F(rsf rsfVar) {
        if (rsfVar == null) {
            int i = alog.d;
            return alsx.a;
        }
        iyn iynVar = this.d;
        ParticipantsTable.BindData a = rsfVar.b.a();
        boolean m = iynVar.e.m();
        if (a != null && vcp.k(a)) {
            BusinessInfoData businessInfoData = (BusinessInfoData) this.d.f.orElse(null);
            ArrayList arrayList = new ArrayList(rse.a());
            if (!m) {
                arrayList.remove(rse.SETTING_NOTIFICATION);
            }
            arrayList.remove(rse.SETTING_XMS_MODE);
            arrayList.remove(rse.SETTING_SECURITY_KEY);
            arrayList.remove(rse.SETTING_SPAM_REPORTING);
            if (businessInfoData != null) {
                BusinessInfoProperty privacyPolicyUrl = businessInfoData.getPrivacyPolicyUrl();
                if (privacyPolicyUrl != null && !TextUtils.isEmpty(privacyPolicyUrl.getValue())) {
                    arrayList.add(rse.SETTING_PRIVACY_POLICY);
                } else {
                    rsg.a.q("Can't add privacy policy setting: business doesn't have it.");
                }
                BusinessInfoProperty termsAndConditionsUrl = businessInfoData.getTermsAndConditionsUrl();
                if (termsAndConditionsUrl != null && !TextUtils.isEmpty(termsAndConditionsUrl.getValue())) {
                    arrayList.add(rse.SETTING_TERMS_OF_SERVICE);
                }
            }
            arrayList.add(rse.SETTING_LEARN_MORE_BUSINESS_MESSAGING);
            return alog.n(arrayList);
        }
        boolean z = this.d.c.c;
        boolean z2 = false;
        if (a != null && rsfVar.a.h() == 0) {
            z2 = true;
        }
        boolean z3 = rsfVar.d;
        ArrayList arrayList2 = new ArrayList(rse.a());
        if (!z2) {
            arrayList2.remove(rse.SETTING_XMS_MODE);
            arrayList2.remove(rse.SETTING_BLOCKED);
            arrayList2.remove(rse.SETTING_SECURITY_KEY);
        } else {
            arrayList2.remove(rse.SETTING_SPAM_REPORTING);
        }
        if (!z) {
            arrayList2.remove(rse.SETTING_XMS_MODE);
            arrayList2.remove(rse.SETTING_SECURITY_KEY);
        }
        if (!z3) {
            arrayList2.remove(rse.SETTING_SECURITY_KEY);
        }
        if (!m) {
            arrayList2.remove(rse.SETTING_NOTIFICATION);
        }
        return alog.n(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(ConversationSettingsOptionItemView conversationSettingsOptionItemView, int i) {
        boolean z;
        float f;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        rsf rsfVar = this.c;
        rse rseVar = (rse) m().get(i);
        rsg rsgVar = conversationSettingsOptionItemView.d;
        rsgVar.c = null;
        rsgVar.d = null;
        rsgVar.e = true;
        rsgVar.g = true;
        rsgVar.i = true;
        rsgVar.h = rseVar;
        rsgVar.j = rsfVar.b.a();
        rsgVar.k = rsfVar.c;
        rsgVar.l = rsfVar.e;
        boolean z5 = rsfVar.d;
        smr smrVar = rsfVar.a;
        boolean af = smrVar.af();
        boolean ag = smrVar.ag();
        int i4 = 0;
        switch (rseVar) {
            case SETTING_NOTIFICATION_ENABLED:
                rsgVar.b = rsgVar.p.getString(R.string.notifications_enabled_conversation_pref_title);
                rsgVar.f = af;
                break;
            case SETTING_NOTIFICATION_SOUND_URI:
                rsgVar.b = rsgVar.p.getString(R.string.notification_sound_pref_title);
                Uri a = rsgVar.m.a(smrVar.Q());
                rsgVar.c = rsgVar.p.getString(R.string.silent_ringtone);
                Optional optional = rsfVar.f;
                if (optional.isPresent()) {
                    rsgVar.c = (String) optional.get();
                }
                rsgVar.e = false;
                rsgVar.d = a;
                rsgVar.g = af;
                break;
            case SETTING_NOTIFICATION_VIBRATION:
                rsgVar.b = rsgVar.p.getString(R.string.notification_vibrate_pref_title);
                rsgVar.f = ag;
                rsgVar.g = af;
                break;
            case SETTING_NOTIFICATION:
                rsgVar.b = rsgVar.p.getString(R.string.notifications_enabled_conversation_pref_title);
                rsgVar.e = false;
                break;
            case SETTING_APP_SETTINGS:
                rsgVar.b = rsgVar.p.getString(R.string.app_settings_conversation_pref_title);
                rsgVar.e = false;
                break;
            case SETTING_XMS_MODE:
                rsgVar.b = rsgVar.p.getString(R.string.xms_send_mode_pref_title_v2);
                if (smrVar.p() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                rsgVar.f = z2;
                break;
            case SETTING_SECURITY_KEY:
                rsgVar.e = false;
                if (rsgVar.q.p() && z5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                rsgVar.i = z3;
                rsgVar.b = rsgVar.p.getString(R.string.security_key_top_level_title);
                break;
            case SETTING_BLOCKED:
                xyl.l(rsgVar.j);
                if (true != rsgVar.j.R()) {
                    i2 = R.string.block_contact_title;
                } else {
                    i2 = R.string.unblock_contact_title;
                }
                rsgVar.b = rsgVar.p.getString(i2);
                rsgVar.e = false;
                ParticipantsTable.BindData bindData = rsgVar.j;
                if (bindData != null && !rsgVar.n.e(bindData.O()) && rsgVar.o.b()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                rsgVar.i = z4;
                break;
            case SETTING_PRIVACY_POLICY:
                rsgVar.b = rsgVar.p.getString(R.string.info_and_options_view_privacy_policy);
                rsgVar.e = false;
                break;
            case SETTING_TERMS_OF_SERVICE:
                rsgVar.b = rsgVar.p.getString(R.string.info_and_options_view_terms_of_service);
                rsgVar.e = false;
                break;
            case SETTING_LEARN_MORE_BUSINESS_MESSAGING:
                rsgVar.b = yyb.bs(rsgVar.p);
                rsgVar.e = false;
                break;
            case SETTING_SPAM_REPORTING:
                ParticipantsTable.BindData a2 = rsgVar.a();
                tqc tqcVar = rsgVar.l;
                if (a2 == null) {
                    rsgVar.i = false;
                    break;
                } else {
                    if (tqcVar == tqc.SPAM_FOLDER) {
                        i3 = R.string.unreport_contact_title;
                    } else {
                        i3 = R.string.report_contact_title;
                    }
                    rsgVar.b = rsgVar.p.getString(i3);
                    rsgVar.e = false;
                    rsgVar.i = !rsgVar.n.e(a2.O());
                    break;
                }
        }
        conversationSettingsOptionItemView.a.setText(conversationSettingsOptionItemView.d.b);
        conversationSettingsOptionItemView.a.setContentDescription(conversationSettingsOptionItemView.d.b);
        String str = conversationSettingsOptionItemView.d.c;
        if (TextUtils.isEmpty(str)) {
            conversationSettingsOptionItemView.b.setVisibility(8);
        } else {
            conversationSettingsOptionItemView.b.setVisibility(0);
            conversationSettingsOptionItemView.b.setText(str);
        }
        if (conversationSettingsOptionItemView.d.e) {
            conversationSettingsOptionItemView.c.setVisibility(0);
            conversationSettingsOptionItemView.c.setChecked(conversationSettingsOptionItemView.d.f);
        } else {
            conversationSettingsOptionItemView.c.setVisibility(8);
        }
        boolean z6 = conversationSettingsOptionItemView.d.g;
        if (z6 != conversationSettingsOptionItemView.isEnabled()) {
            conversationSettingsOptionItemView.a.setEnabled(z6);
            conversationSettingsOptionItemView.b.setEnabled(z6);
            conversationSettingsOptionItemView.c.setEnabled(z6);
            if (true != z6) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            conversationSettingsOptionItemView.setAlpha(f);
            conversationSettingsOptionItemView.setEnabled(z6);
        }
        boolean z7 = conversationSettingsOptionItemView.d.i;
        if (conversationSettingsOptionItemView.getVisibility() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z7 != z) {
            if (true != z7) {
                i4 = 8;
            }
            conversationSettingsOptionItemView.setVisibility(i4);
        }
    }

    @Override // defpackage.no
    public final int b() {
        if (this.c == null) {
            return 0;
        }
        return m().size();
    }

    @Override // defpackage.no
    public final int c(int i) {
        return R.layout.conversation_settings_option_item_view;
    }

    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        return new akhx(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false), (char[]) null);
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        G((ConversationSettingsOptionItemView) ((akhx) ooVar).s, i);
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return 2131624139L;
    }

    public final alog m() {
        return F(this.c);
    }
}
