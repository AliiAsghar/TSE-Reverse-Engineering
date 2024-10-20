package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.qpf;
import defpackage.qpj;
import defpackage.rbs;
import defpackage.rdk;
import defpackage.ree;
import defpackage.rtz;
import defpackage.ruy;
import defpackage.rvc;
import defpackage.rve;
import defpackage.rwd;
import defpackage.rxq;
import defpackage.ubl;
import defpackage.uhj;
import defpackage.vqm;
import defpackage.wfh;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yyb;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReceiveRbmSuggestionsAction extends Action<Void> implements Parcelable {
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final xnv g;
    private final uhj h;
    private final armf i;
    private final armf j;
    private static final xze a = xze.g("Bugle", "ReceiveRbmSuggestionsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rdk(5);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        ree NL();
    }

    public ReceiveRbmSuggestionsAction(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, xnv xnvVar, uhj uhjVar, armf armfVar6, armf armfVar7, Bundle bundle) {
        super(bundle, amdy.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = xnvVar;
        this.h = uhjVar;
        this.i = armfVar6;
        this.j = armfVar7;
    }

    private final void h(MessageIdType messageIdType, ConversationIdType conversationIdType) {
        ArrayList arrayList;
        boolean z;
        String O;
        ArrayList m = this.u.m(RcsIntents.EXTRA_CONVERSATION_SUGGESTIONS);
        if (m == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int size = m.size();
            for (int i = 0; i < size; i++) {
                ConversationSuggestion conversationSuggestion = (ConversationSuggestion) m.get(i);
                int suggestionType = conversationSuggestion.getSuggestionType();
                if (suggestionType == 0 ? !(conversationSuggestion.getSuggestionType() != 0 || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT))) : !(suggestionType == 1 ? conversationSuggestion.getSuggestionType() != 1 || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI)) : suggestionType == 2 ? conversationSuggestion.getSuggestionType() != 2 || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER)) : suggestionType == 3 ? TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) || conversationSuggestion.getSuggestionType() != 3 || (TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY)) && (TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG)))) : suggestionType == 4 ? conversationSuggestion.getSuggestionType() != 4 || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) : suggestionType == 5 ? conversationSuggestion.getSuggestionType() != 5 || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) : suggestionType != 11 || conversationSuggestion.getSuggestionType() != 11 || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_APPLICATION)) || TextUtils.isEmpty(conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI)))) {
                    arrayList2.add(conversationSuggestion);
                } else {
                    xyo e = a.e();
                    e.H("Invalid conversation suggestion:");
                    e.H(conversationSuggestion);
                    e.q();
                }
            }
            arrayList = arrayList2;
        }
        if (!conversationIdType.b() && ((ubl) this.f.b()).c(conversationIdType)) {
            z = true;
        } else {
            z = false;
        }
        ((wfh) this.d.b()).E(arrayList, messageIdType, z, this.g.f().toEpochMilli());
        if (arrayList != null) {
            if (conversationIdType.b()) {
                ParticipantsTable.BindData b = ((rxq) this.b.b()).b(this.u.l(RcsIntents.EXTRA_USER_ID));
                if (((Boolean) qpf.a.e()).booleanValue()) {
                    if (b != null && (O = b.O()) != null) {
                        Optional map = ((qpj) this.j.b()).o(O).map(new rbs(8));
                        if (map.isPresent()) {
                            conversationIdType = (ConversationIdType) map.get();
                        }
                    }
                    a.q("Existing conversation for sender participant not found. Returning empty conversation ID");
                    conversationIdType = ruy.a;
                } else {
                    conversationIdType = ((rtz) this.c.b()).m(((vqm) this.i.b()).j(yyb.cU(b)));
                }
            }
            if (!conversationIdType.b()) {
                this.h.m(conversationIdType);
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ReceiveRbmSuggestionsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        akrh e = aktp.e("ReceiveRbmSuggestionsAction.executeAction");
        try {
            rve b = rve.b(this.u.f(), RcsIntents.EXTRA_TARGET_RCS_MESSAGE_ID);
            if (b.i()) {
                a.q("Couldn't add RBM bot suggestions to conversation: empty RCS message ID");
            } else {
                MessageCoreData s = ((rwd) this.e.b()).s(b);
                if (s == null) {
                    xyo e2 = a.e();
                    e2.H("Adding RBM suggestion with target RCS message ID not yet found.");
                    e2.z("targetRcsMessageId", b);
                    e2.q();
                    h(rvc.a, ruy.a);
                } else {
                    h(s.B(), s.z());
                }
            }
            e.close();
            return null;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveConversationSuggestions.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ReceiveRbmSuggestionsAction(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, xnv xnvVar, uhj uhjVar, armf armfVar6, armf armfVar7, Parcel parcel) {
        super(parcel, amdy.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = xnvVar;
        this.h = uhjVar;
        this.i = armfVar6;
        this.j = armfVar7;
    }
}
