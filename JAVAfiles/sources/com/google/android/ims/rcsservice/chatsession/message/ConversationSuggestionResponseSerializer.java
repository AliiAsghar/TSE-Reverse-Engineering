package com.google.android.ims.rcsservice.chatsession.message;

import android.text.TextUtils;
import android.util.Xml;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.advl;
import defpackage.advr;
import defpackage.agkx;
import defpackage.aony;
import defpackage.aood;
import defpackage.aoog;
import defpackage.aooh;
import defpackage.aooj;
import java.io.StringWriter;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConversationSuggestionResponseSerializer {
    private static final String ATTR_POST_BACK_ENCODING = "encoding";
    private static final String NAMESPACE = "";
    private static final String TAG_POST_BACK_DATA = "postbackdata";
    private static final String TAG_REPLY_TEXT = "text";
    private static final String TAG_RESPONSE = "response";
    private static final String TAG_RESPONSE_ROOT = "imSuggestion";
    private static final String TAG_TARGET_MESSAGE_ID = "messageid";

    /* compiled from: PG */
    /* renamed from: com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 {
        final /* synthetic */ ConversationSuggestion val$suggestion;

        public AnonymousClass1(ConversationSuggestion conversationSuggestion) {
            this.val$suggestion = conversationSuggestion;
        }

        public aood serialize(ConversationSuggestion conversationSuggestion, Type type, aooj aoojVar) {
            aoog aoogVar = new aoog();
            String propertyValue = this.val$suggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT);
            if (TextUtils.isEmpty(propertyValue)) {
                propertyValue = this.val$suggestion.getPropertyValue("text");
            }
            if (!TextUtils.isEmpty(propertyValue)) {
                aoogVar.f(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT, propertyValue);
            }
            String postBackData = this.val$suggestion.getPostBackData();
            if (!TextUtils.isEmpty(postBackData)) {
                aoog aoogVar2 = new aoog();
                aoogVar2.f(GroupManagementRequest.DATA_TAG, postBackData);
                aoogVar.e("postback", aoogVar2);
            }
            String typeIdentifier = ConversationSuggestionResponseSerializer.getTypeIdentifier(this.val$suggestion);
            if (typeIdentifier != null) {
                aoog aoogVar3 = new aoog();
                aoogVar3.e(typeIdentifier, aoogVar);
                aoog aoogVar4 = new aoog();
                aoogVar4.e("response", aoogVar3);
                return aoogVar4;
            }
            throw new aooh("Invalid suggestion type");
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$ims$rcsservice$chatsession$message$ConversationSuggestionResponse$ConversationSuggestionResponseType;

        static {
            int[] iArr = new int[ConversationSuggestionResponse.ConversationSuggestionResponseType.values().length];
            $SwitchMap$com$google$android$ims$rcsservice$chatsession$message$ConversationSuggestionResponse$ConversationSuggestionResponseType = iArr;
            try {
                iArr[ConversationSuggestionResponse.ConversationSuggestionResponseType.REPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$ims$rcsservice$chatsession$message$ConversationSuggestionResponse$ConversationSuggestionResponseType[ConversationSuggestionResponse.ConversationSuggestionResponseType.ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static String getTypeIdentifier(ConversationSuggestion conversationSuggestion) {
        switch (conversationSuggestion.getSuggestionType()) {
            case 0:
                return "reply";
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
                return GroupManagementRequest.ACTION_TAG;
            case 6:
            case 7:
            default:
                advr.g("Unsupported suggestion type: %s", Integer.valueOf(conversationSuggestion.getSuggestionType()));
                return null;
        }
    }

    public static String serializeToJson(ConversationSuggestion conversationSuggestion) {
        aony aonyVar = new aony();
        aonyVar.c(ConversationSuggestion.class, new AnonymousClass1(conversationSuggestion));
        try {
            return aonyVar.a().j(conversationSuggestion);
        } catch (aooh e) {
            advr.i(e, "Unable to serialize JSON from suggestion response: %s", conversationSuggestion);
            return null;
        }
    }

    public static String serializeToXml(String str, String str2, String str3, String str4) {
        StringWriter stringWriter;
        try {
            stringWriter = new StringWriter();
        } catch (Throwable th) {
            th = th;
            stringWriter = null;
        }
        try {
            advl advlVar = new advl();
            advlVar.a = stringWriter;
            advlVar.startDocument(Xml.Encoding.UTF_8.toString(), true);
            advlVar.startTag(NAMESPACE, TAG_RESPONSE_ROOT);
            advlVar.startTag(NAMESPACE, TAG_TARGET_MESSAGE_ID);
            advlVar.text(str);
            advlVar.endTag(NAMESPACE, TAG_TARGET_MESSAGE_ID);
            advlVar.startTag(NAMESPACE, "response");
            if (!TextUtils.isEmpty(str2)) {
                advlVar.startTag(NAMESPACE, "text");
                advlVar.text(str2);
                advlVar.endTag(NAMESPACE, "text");
            }
            advlVar.startTag(NAMESPACE, TAG_POST_BACK_DATA);
            advlVar.attribute(NAMESPACE, ATTR_POST_BACK_ENCODING, str4);
            advlVar.text(str3);
            advlVar.endTag(NAMESPACE, TAG_POST_BACK_DATA);
            advlVar.endTag(NAMESPACE, "response");
            advlVar.endTag(NAMESPACE, TAG_RESPONSE_ROOT);
            advlVar.flush();
            String stringWriter2 = stringWriter.toString();
            agkx.aa(stringWriter);
            return stringWriter2;
        } catch (Throwable th2) {
            th = th2;
            agkx.aa(stringWriter);
            throw th;
        }
    }

    public static String getTypeIdentifier(ConversationSuggestionResponse.ConversationSuggestionResponseType conversationSuggestionResponseType) {
        ConversationSuggestionResponse.ConversationSuggestionResponseType conversationSuggestionResponseType2 = ConversationSuggestionResponse.ConversationSuggestionResponseType.UNKNOWN;
        int ordinal = conversationSuggestionResponseType.ordinal();
        if (ordinal == 1) {
            return "reply";
        }
        if (ordinal != 2) {
            advr.g("Unsupported suggestion response type: %s", conversationSuggestionResponseType);
            return null;
        }
        return GroupManagementRequest.ACTION_TAG;
    }
}
