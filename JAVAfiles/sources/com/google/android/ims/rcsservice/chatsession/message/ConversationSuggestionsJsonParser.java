package com.google.android.ims.rcsservice.chatsession.message;

import android.text.TextUtils;
import defpackage.adom;
import defpackage.advr;
import defpackage.aonx;
import defpackage.aony;
import defpackage.aook;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConversationSuggestionsJsonParser {
    private aonx parser;

    public ConversationSuggestionsJsonParser() {
        aony aonyVar = new aony();
        aonyVar.b();
        this.parser = aonyVar.a();
    }

    public ArrayList<ConversationSuggestion> parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList<>();
        }
        try {
            ConversationSuggestionsContainer conversationSuggestionsContainer = (ConversationSuggestionsContainer) this.parser.i(str, ConversationSuggestionsContainer.class);
            ArrayList<ConversationSuggestion> arrayList = conversationSuggestionsContainer.suggestions;
            if (!adom.o(arrayList)) {
                advr.c("Parsed %d suggestions from suggested chip list.", Integer.valueOf(conversationSuggestionsContainer.suggestions.size()));
                if (!adom.o(arrayList)) {
                    arrayList.removeAll(Collections.singleton(null));
                }
                return arrayList;
            }
            advr.q("No suggestions found in suggested chip list.", new Object[0]);
            return new ArrayList<>();
        } catch (aook e) {
            advr.i(e, "Unable to parse incoming suggested chip list.", new Object[0]);
            return new ArrayList<>();
        }
    }
}
