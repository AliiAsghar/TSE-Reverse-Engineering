package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.amdy;
import defpackage.qiu;
import defpackage.qpk;
import defpackage.qwn;
import defpackage.qxs;
import defpackage.rdk;
import defpackage.red;
import defpackage.reh;
import defpackage.rvc;
import defpackage.xze;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReceiveP2pSuggestionsAction extends Action<Void> implements Parcelable {
    private final reh b;
    private static final xze a = xze.g("BugleDataModel", "ReceiveP2pSuggestionsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rdk(4);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        red NK();
    }

    public ReceiveP2pSuggestionsAction(reh rehVar, Parcel parcel) {
        super(parcel, amdy.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION);
        this.b = rehVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ReceiveP2pSuggestionsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        h();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveConversationSuggestions.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        akul ag;
        akrh e = aktp.e("ReceiveP2pSuggestionsAction.executeActionAsync");
        try {
            try {
                MessageIdType b = rvc.b(this.u.l("target_message_id"));
                ArrayList m = this.u.m("rcs.intent.extra.conversationClassifications");
                reh rehVar = this.b;
                int i = qwn.b;
                qwn qwnVar = new qwn(this, 9);
                qwn qwnVar2 = new qwn(this, 10);
                rehVar.b.f(b, m);
                ag = aktp.an(rehVar.b(b, qwnVar), rehVar.a(b, qwnVar2)).h(new qpk(rehVar, b, 4), rehVar.a);
                e.b(ag);
            } catch (BadParcelableException unused) {
                a.m("Failed to unparcel parameters.");
                ag = aktp.ag(null);
            }
            e.close();
            return ag;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h() {
        akrh e = aktp.e("ReceiveP2pSuggestionsAction.executeAction");
        try {
            try {
                MessageIdType b = rvc.b(this.u.l("target_message_id"));
                ArrayList F = this.u.F(new ArrayList());
                reh rehVar = this.b;
                int i = qxs.a;
                qwn qwnVar = new qwn(this, 6);
                qwn qwnVar2 = new qwn(this, 7);
                rehVar.b.f(b, F);
                rehVar.c(b);
                qiu.h(rehVar.b(b, qwnVar));
                qiu.h(rehVar.a(b, qwnVar2));
            } catch (BadParcelableException unused) {
                a.m("Failed to unparcel parameters.");
            }
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
