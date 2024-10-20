package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AlertController;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.media3.ui.TrackSelectionView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.tombstone.ConversationTombstoneView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jh implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v32, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v47, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v55, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        boolean z = false;
        Message message4 = null;
        String str = null;
        message4 = null;
        switch (this.b) {
            case 0:
                ((hm) this.a).f();
                return;
            case 1:
                AlertController alertController = (AlertController) this.a;
                if (view == alertController.j && (message3 = alertController.l) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == alertController.m && (message2 = alertController.o) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == alertController.p && (message = alertController.r) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                AlertController alertController2 = (AlertController) this.a;
                alertController2.I.obtainMessage(1, alertController2.b).sendToTarget();
                return;
            case 2:
                SearchView searchView = (SearchView) this.a;
                if (view == searchView.mSearchButton) {
                    searchView.onSearchClicked();
                    return;
                }
                if (view == searchView.mCloseButton) {
                    searchView.onCloseClicked();
                    return;
                }
                if (view == searchView.mGoButton) {
                    searchView.onSubmitQuery();
                    return;
                } else if (view == searchView.mVoiceButton) {
                    searchView.onVoiceClicked();
                    return;
                } else {
                    if (view == searchView.mSearchSrcTextView) {
                        searchView.forceSuggestionQuery();
                        return;
                    }
                    return;
                }
            case 3:
                ((Toolbar) this.a).j();
                return;
            case 4:
                fyj fyjVar = (fyj) this.a;
                boolean z2 = fyjVar.E;
                boolean z3 = !z2;
                if (z2 == z3) {
                    return;
                }
                fyjVar.E = z3;
                fyjVar.e(fyjVar.q, z3);
                fyjVar.e(fyjVar.r, z3);
                return;
            case 5:
                fyd fydVar = (fyd) this.a;
                ert ertVar = fydVar.c.D;
                if (ertVar != null && ertVar.l(29)) {
                    ese I = fydVar.c.D.I();
                    ert ertVar2 = fydVar.c.D;
                    int i = eul.a;
                    fiu fiuVar = new fiu((fiv) I);
                    fiuVar.d(1);
                    fiuVar.c(1);
                    ertVar2.O(new fiv(fiuVar));
                    fyj fyjVar2 = fydVar.c;
                    fyjVar2.c.m(1, fyjVar2.getResources().getString(R.string.exo_track_selection_auto));
                    fydVar.c.g.dismiss();
                    return;
                }
                return;
            case 6:
                fyh fyhVar = (fyh) this.a;
                ert ertVar3 = fyhVar.c.D;
                if (ertVar3 != null && ertVar3.l(29)) {
                    ese I2 = fyhVar.c.D.I();
                    ert ertVar4 = fyhVar.c.D;
                    fiu fiuVar2 = new fiu((fiv) I2);
                    fiuVar2.d(3);
                    fiuVar2.p = -3;
                    fiuVar2.n = new alob().g();
                    fiuVar2.o = 0;
                    ertVar4.O(new fiv(fiuVar2));
                    fyhVar.c.g.dismiss();
                    return;
                }
                return;
            case 7:
                fyu fyuVar = (fyu) this.a;
                fyuVar.i();
                if (view.getId() == R.id.exo_overflow_show) {
                    fyuVar.m.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        fyuVar.n.start();
                        return;
                    }
                    return;
                }
            case 8:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.a;
                if (view == trackSelectionView.a) {
                    trackSelectionView.e = true;
                    trackSelectionView.d.clear();
                } else if (view == trackSelectionView.b) {
                    trackSelectionView.e = false;
                    trackSelectionView.d.clear();
                } else {
                    trackSelectionView.e = false;
                    Object tag = view.getTag();
                    dzg.g(tag);
                    throw null;
                }
                trackSelectionView.a.setChecked(trackSelectionView.e);
                CheckedTextView checkedTextView = trackSelectionView.b;
                if (!trackSelectionView.e && trackSelectionView.d.size() == 0) {
                    z = true;
                }
                checkedTextView.setChecked(z);
                throw null;
            case 9:
                ((Preference) this.a).b(view);
                return;
            case 10:
                ((ifz) this.a).d.get().run();
                return;
            case 11:
                ((ihz) this.a).a();
                return;
            case 12:
                ConversationMessageView conversationMessageView = (ConversationMessageView) view.getTag(R.id.conversation_message_view_clickable_tag);
                itb itbVar = (itb) this.a;
                if (!itbVar.aO.d()) {
                    if (conversationMessageView != null) {
                        itbVar.F(conversationMessageView.e, 2);
                        itbVar.m(conversationMessageView);
                        return;
                    } else if (view instanceof aacl) {
                        if (view instanceof ConversationMessageView) {
                            itbVar.i();
                            itbVar.j();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (view.getTag(R.id.reply_snippet_tag) != null) {
                    MessageIdType b = rvc.b((String) view.getTag(R.id.reply_snippet_tag));
                    if (!b.b()) {
                        itbVar.l(b, true);
                        return;
                    }
                    return;
                }
                if (view instanceof ConversationMessageView) {
                    aacl aaclVar = (aacl) view;
                    itbVar.F(aaclVar.c(), 2);
                    itbVar.m(aaclVar);
                    return;
                } else {
                    if (conversationMessageView != null) {
                        itbVar.F(conversationMessageView.e, 2);
                        itbVar.m(conversationMessageView);
                        return;
                    }
                    return;
                }
            case 13:
                utz utzVar = itb.a;
                this.a.onClick(view);
                return;
            case 14:
                ConversationTombstoneView conversationTombstoneView = (ConversationTombstoneView) this.a;
                if (((Boolean) conversationTombstoneView.i.b()).booleanValue()) {
                    ajwt ajwtVar = ((itb) conversationTombstoneView.k).g;
                    Intent p = ((lzv) conversationTombstoneView.d.b()).p(conversationTombstoneView.getContext());
                    if (ajwtVar != null) {
                        ajya.c(p, ajwtVar);
                    }
                    akto.n(conversationTombstoneView.getContext(), p);
                    return;
                }
                akto.n(conversationTombstoneView.getContext(), ((lzv) conversationTombstoneView.d.b()).p(conversationTombstoneView.getContext()));
                return;
            case 15:
                alvi alviVar = ixd.a;
                this.a.run();
                return;
            case 16:
                ixd ixdVar = (ixd) this.a;
                if (!ixdVar.M.aw()) {
                    alvw i2 = ixd.a.i();
                    i2.X(alwp.a, "Bugle");
                    alvg alvgVar = (alvg) i2;
                    alvgVar.X(ydl.p, ixdVar.L);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "getConversationNameClickListener", 7005, "ConversationFragmentPeer.java")).q("ConversationFragment: ConversationFragment has been detached when conversation name is clicked");
                    return;
                }
                rrl rrlVar = (rrl) ixdVar.ca.a();
                if (rrlVar.b.b()) {
                    ixdVar.Z(2);
                    return;
                }
                if (rrlVar.r()) {
                    BusinessInfoData businessInfoData = rrlVar.i;
                    if (businessInfoData != null) {
                        str = businessInfoData.getRbmBotId();
                    }
                    ((mho) ixdVar.X.b()).aN(2, amho.BIZINFO_SOURCE_CONVERSATION_TITLE, str);
                    ixdVar.Z(2);
                    return;
                }
                ixdVar.Z(2);
                return;
            case 17:
                alvi alviVar2 = ixd.a;
                this.a.run();
                return;
            case 18:
                Context x = ((ixd) this.a).M.x();
                x.getClass();
                ajgi ajgiVar = new ajgi(x);
                ajgiVar.y(null);
                ajgiVar.n(x.getString(R.string.messaging_not_supported_with_short_code_dialog_body));
                ajgiVar.j(true);
                ajgiVar.o(R.string.messaging_not_supported_with_short_code_dialog_dismiss_button, new iws(0));
                ajgiVar.create().show();
                return;
            case 19:
                alvw d = ixd.a.d();
                d.X(alwp.a, "Bugle");
                alvg alvgVar2 = (alvg) d;
                ixd ixdVar2 = (ixd) this.a;
                alvgVar2.X(ydl.p, ixdVar2.L);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "displayComposeDisabledMessage", 5847, "ConversationFragmentPeer.java")).q("ConversationFragment: Set default sms button clicked");
                ixdVar2.M.startActivityForResult(((lzv) ixdVar2.af.b()).l(ixdVar2.q()), 1);
                return;
            default:
                ((iyk) this.a).c().d();
                return;
        }
    }

    public /* synthetic */ jh(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
