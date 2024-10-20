package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafx implements xdc {
    private static final xze a = xze.g("Bugle", "RbmSuggestionRule");
    private final xve b;
    private final aagc c;
    private final Optional d;
    private final mbl e;

    public aafx(xve xveVar, aagc aagcVar, Optional optional, mbl mblVar) {
        xveVar.getClass();
        aagcVar.getClass();
        optional.getClass();
        mblVar.getClass();
        this.b = xveVar;
        this.c = aagcVar;
        this.d = optional;
        this.e = mblVar;
    }

    private final boolean c(boolean z, ConversationSuggestion conversationSuggestion, String str) {
        boolean z2 = true;
        if (!z) {
            if (conversationSuggestion.hasFallbackUrl()) {
                this.e.e("Bugle.Rbm.Suggestions.FallbackUrl.PotentialFallback", aabr.w(conversationSuggestion.getSuggestionType()));
                xyo c = a.c();
                c.H(str);
                c.H("intent not supported on this device, but fallback URL exists");
                c.L("suggestion", conversationSuggestion.toString());
                c.q();
            } else {
                z2 = false;
            }
            if (!z2) {
                this.e.e("Bugle.Rbm.Suggestions.FallbackUrl.NoFallbackUrlButActionUnsupported", aabr.w(conversationSuggestion.getSuggestionType()));
                xyo e = a.e();
                e.H(str);
                e.H("intent not supported on this device");
                e.L("suggestion", conversationSuggestion.toString());
                e.q();
            }
        }
        return z2;
    }

    @Override // defpackage.xdc
    public final boolean a(SuggestionData suggestionData) {
        suggestionData.getClass();
        return suggestionData instanceof RbmSuggestionData;
    }

    @Override // defpackage.xdc
    public final Object b(SuggestionData suggestionData, arpe arpeVar) {
        boolean z = false;
        if (!(suggestionData instanceof RbmSuggestionData)) {
            return false;
        }
        RbmSuggestionData rbmSuggestionData = (RbmSuggestionData) suggestionData;
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        int suggestionType = conversationSuggestion.getSuggestionType();
        if (suggestionType != 0) {
            if (suggestionType != 1) {
                if (suggestionType != 2) {
                    if (suggestionType != 3) {
                        if (suggestionType != 4) {
                            if (suggestionType == 5) {
                                z = c(this.d.isPresent(), conversationSuggestion, "Location share");
                            }
                        } else {
                            z = c(this.b.c(this.c.a(rbmSuggestionData)), conversationSuggestion, "Calendar");
                        }
                    } else {
                        z = c(this.b.c(aagc.d(rbmSuggestionData)), conversationSuggestion, "Map");
                    }
                } else {
                    z = c(this.b.c(this.c.b(rbmSuggestionData)), conversationSuggestion, "Phone");
                }
            } else {
                z = c(this.b.c(this.c.c(rbmSuggestionData)), conversationSuggestion, "Web");
            }
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
