package com.google.android.ims.rcsservice.chatsession.message;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementResponse;
import defpackage.advr;
import defpackage.aony;
import defpackage.aoob;
import defpackage.aooc;
import defpackage.aood;
import defpackage.aoog;
import defpackage.aooh;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConversationSuggestionResponseDeserializer {
    public static ConversationSuggestionResponse deserializeFromJson(String str) {
        aony aonyVar = new aony();
        aonyVar.c(ConversationSuggestionResponse.class, new aooc<ConversationSuggestionResponse>() { // from class: com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseDeserializer.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // defpackage.aooc
            public ConversationSuggestionResponse deserialize(aood aoodVar, Type type, aoob aoobVar) {
                aoog d = aoodVar.c().d(GroupManagementResponse.XML_TAG);
                if (d == null) {
                    return null;
                }
                aoog d2 = d.d("reply");
                aoog d3 = d.d(GroupManagementRequest.ACTION_TAG);
                if (d2 == null && d3 == null) {
                    return null;
                }
                ConversationSuggestionResponse conversationSuggestionResponse = new ConversationSuggestionResponse();
                if (d2 != null) {
                    conversationSuggestionResponse.type = ConversationSuggestionResponse.ConversationSuggestionResponseType.REPLY;
                } else {
                    conversationSuggestionResponse.type = ConversationSuggestionResponse.ConversationSuggestionResponseType.ACTION;
                    d2 = d3;
                }
                ConversationSuggestionDeserializer conversationSuggestionDeserializer = new ConversationSuggestionDeserializer();
                String deserializeDisplayText = conversationSuggestionDeserializer.deserializeDisplayText(d2);
                String deserializePostBackData = conversationSuggestionDeserializer.deserializePostBackData(d2);
                if (TextUtils.isEmpty(deserializeDisplayText)) {
                    return null;
                }
                conversationSuggestionResponse.displayText = deserializeDisplayText;
                conversationSuggestionResponse.postBackData = deserializePostBackData;
                return conversationSuggestionResponse;
            }
        });
        try {
            return (ConversationSuggestionResponse) aonyVar.a().i(str, ConversationSuggestionResponse.class);
        } catch (aooh e) {
            advr.i(e, "Unable to deserialize JSON into suggestion response: %s", str);
            return null;
        }
    }
}
