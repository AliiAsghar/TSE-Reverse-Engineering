package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafn extends aafr {
    private static final xze a = xze.g("Bugle", "RbmSuggestionAcceptor");
    private final aagc b;
    private final abbu c;
    private final mbl d;
    private final Optional e;
    private final xve f;

    public aafn(aagc aagcVar, armf armfVar, armf armfVar2, armf armfVar3, abbu abbuVar, mbl mblVar, Optional optional, xve xveVar, qdq qdqVar) {
        super(qdqVar, armfVar, armfVar2, armfVar3);
        this.b = aagcVar;
        this.c = abbuVar;
        this.d = mblVar;
        this.e = optional;
        this.f = xveVar;
    }

    private final void d(RbmSuggestionData rbmSuggestionData) {
        Intent intent = null;
        if (rbmSuggestionData.b.canUseFallbackUrl()) {
            aagc aagcVar = this.b;
            ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
            if (!conversationSuggestion.canUseFallbackUrl()) {
                xyo c = aagc.a.c();
                c.H("Suggestion is not a type that supports fallback urls. Cannot create fallback url intent");
                c.M("suggestion", rbmSuggestionData);
                c.q();
            } else if (!conversationSuggestion.hasFallbackUrl()) {
                xyo c2 = aagc.a.c();
                c2.H("Suggestion has no fallback url. Cannot create fallback url intent.");
                c2.M("suggestion", rbmSuggestionData);
                c2.q();
            } else {
                String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
                if (TextUtils.isEmpty(propertyValue)) {
                    xyo c3 = aagc.a.c();
                    c3.H("Suggestion somehow has empty fallback url. Cannot create fallback url intent.");
                    c3.M("suggestion", rbmSuggestionData);
                    c3.q();
                } else {
                    intent = aagcVar.b.b(propertyValue);
                }
            }
        }
        if (intent != null) {
            if (this.f.d(intent)) {
                this.d.e("Bugle.Rbm.Suggestions.FallbackUrl.FallbackOccurred", aabr.w(rbmSuggestionData.b.getSuggestionType()));
                this.o.y(rbmSuggestionData);
                return;
            } else {
                xyo b = a.b();
                b.H("No app on device seems able to handle fallback URL web action.");
                b.L("suggestion", rbmSuggestionData.toString());
                b.q();
            }
        }
        xyo e = a.e();
        e.H("No app on device seems able to handle this action.");
        e.L("suggestion", rbmSuggestionData.toString());
        e.q();
        this.c.k(R.string.business_action_failed_to_launch);
    }

    public final void a(SuggestionData suggestionData) {
        Intent c;
        if (suggestionData instanceof RbmSuggestionData) {
            RbmSuggestionData rbmSuggestionData = (RbmSuggestionData) suggestionData;
            int suggestionType = rbmSuggestionData.b.getSuggestionType();
            if (suggestionType != 0) {
                if (suggestionType != 5) {
                    int suggestionType2 = rbmSuggestionData.b.getSuggestionType();
                    if (suggestionType2 != 1) {
                        if (suggestionType2 != 2) {
                            if (suggestionType2 != 3) {
                                if (suggestionType2 != 4) {
                                    c = null;
                                } else {
                                    c = this.b.a(rbmSuggestionData);
                                }
                            } else {
                                c = aagc.d(rbmSuggestionData);
                            }
                        } else {
                            c = this.b.b(rbmSuggestionData);
                        }
                    } else {
                        c = this.b.c(rbmSuggestionData);
                    }
                    if (c != null && this.f.d(c)) {
                        this.o.y(rbmSuggestionData);
                        return;
                    } else {
                        d(rbmSuggestionData);
                        return;
                    }
                }
                if (this.e.isEmpty()) {
                    d(rbmSuggestionData);
                    return;
                } else {
                    c();
                    this.o.y(suggestionData);
                    return;
                }
            }
            super.b(suggestionData);
            ((ixd) this.o.a).V(true);
            return;
        }
        a.m("Non RBM suggestion passed to RbmSuggestionAcceptor");
        throw new IllegalStateException("Non RBM suggestion passed to RbmSuggestionAcceptor");
    }
}
