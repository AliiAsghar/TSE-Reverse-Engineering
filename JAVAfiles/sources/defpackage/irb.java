package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.ConversationStartRowView;
import com.google.android.apps.messaging.conversation.messagelist.ConversationStartView;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irb extends ire {
    private static final xze d = xze.g("Bugle", "BusinessInfoAdapter");
    public BusinessInfoData c;
    private boolean f;
    private ParticipantsTable.BindData g;

    public irb(aack aackVar, xnv xnvVar) {
        super(aackVar, xnvVar);
    }

    public final void F(BusinessInfoData businessInfoData, ParticipantsTable.BindData bindData) {
        boolean z;
        this.c = businessInfoData;
        this.g = bindData;
        if (businessInfoData != null && bindData != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !this.f) {
            d.p("Business info won't be available, and conversation start is not showing.");
            return;
        }
        if (z) {
            if (this.f) {
                d.l("Info will be available and conversation start is showing");
                q(0);
            } else {
                d.l("Info will be available but conversation start not currently showing.");
                s(0);
            }
        } else {
            d.l("Info will not be available but conversation start is showing..");
            y(0);
        }
        this.f = z;
    }

    @Override // defpackage.no
    public final int b() {
        if (this.f) {
            return 1;
        }
        return 0;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        Uri a;
        ConversationStartRowView conversationStartRowView = (ConversationStartRowView) ((akhx) ooVar).s;
        BusinessInfoData businessInfoData = this.c;
        ParticipantsTable.BindData bindData = this.g;
        if (businessInfoData != null && bindData != null) {
            ConversationStartView conversationStartView = conversationStartRowView.c;
            conversationStartView.f.setText(businessInfoData.getDescription());
            ContactIconView contactIconView = conversationStartRowView.c.e;
            xyo a2 = ConversationStartRowView.a.a();
            a2.A("BusinessInfoData.isVerifiedSmsBrand", businessInfoData.isVerifiedBrand());
            a2.q();
            if (businessInfoData.isVerifiedBrand()) {
                a = conversationStartRowView.d.b(ydk.j(businessInfoData.getLogoImageLocalUri()), tqr.VERIFICATION_VERIFIED);
            } else {
                a = conversationStartRowView.b.a(bindData);
            }
            contactIconView.l(a, bindData.s(), bindData.N(), bindData.t(), bindData.O());
            ConversationStartView conversationStartView2 = conversationStartRowView.c;
            if (businessInfoData.isVerifiedBrand()) {
                ConversationStartView.a.l("Updating for verified brand");
                conversationStartView2.b();
                return;
            }
            if (businessInfoData.getVerificationStatus() != 2) {
                ConversationStartView.a.l("Removing verification for unverified brand");
                conversationStartView2.a();
                return;
            }
            int verifiedBotPlatform = businessInfoData.getVerifiedBotPlatform();
            if (verifiedBotPlatform != 1) {
                if (verifiedBotPlatform != 2) {
                    conversationStartView2.a();
                    return;
                }
                ConversationStartView.a.l("Adding verification for Vodafone brand");
                conversationStartView2.h.setVisibility(0);
                conversationStartView2.g.setVisibility(8);
                conversationStartView2.i.setVisibility(8);
                conversationStartView2.h.setOnClickListener(new iix(conversationStartView2, businessInfoData, 2));
                return;
            }
            ConversationStartView.a.l("Removing verification for Google known verified brand");
            if (!((Boolean) utw.l.e()).booleanValue()) {
                ConversationStartView.a.l("Updating verification for Google verified");
                conversationStartView2.b();
                return;
            } else if (!businessInfoData.containsLocalVerifierInfo()) {
                ConversationStartView.a.l("Removing verification for generalized verifier");
                conversationStartView2.a();
                return;
            } else {
                ConversationStartView.a.l("Updating verification for generalized verifier");
                conversationStartView2.b();
                return;
            }
        }
        ConversationStartRowView.a.l("Business info or participant data not available to bind");
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return -4L;
    }

    @Override // defpackage.ire
    protected final int m(int i) {
        return R.layout.conversation_start_row_view;
    }
}
