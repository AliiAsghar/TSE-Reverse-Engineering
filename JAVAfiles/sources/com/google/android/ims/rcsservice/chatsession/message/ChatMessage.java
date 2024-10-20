package com.google.android.ims.rcsservice.chatsession.message;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.message.rbm.RbmSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementSerializer;
import defpackage.acyz;
import defpackage.aczd;
import defpackage.adah;
import defpackage.adai;
import defpackage.agkx;
import defpackage.ajru;
import defpackage.aozs;
import defpackage.apag;
import defpackage.apba;
import defpackage.apwq;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ChatMessage implements Parcelable {
    private final Optional<Long> bugleLogMessageIdOpt;
    private final byte[] content;
    private final apwq customCpimHeaders;
    private final String messageId;
    private final boolean omitDispositionNotification;
    private final Type type;
    public static final acyz<Boolean> ignoreParametersWhenMatchingContentType = aczd.a(160762295);
    public static final acyz<Boolean> useOmitDispositionNotification = aczd.a(181027433);
    public static final Parcelable.Creator<ChatMessage> CREATOR = new Parcelable.Creator<ChatMessage>() { // from class: com.google.android.ims.rcsservice.chatsession.message.ChatMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ChatMessage createFromParcel(Parcel parcel) {
            return new ChatMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ChatMessage[] newArray(int i) {
            return new ChatMessage[i];
        }
    };

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum Type {
        UNKNOWN(""),
        TEXT("text/plain"),
        FILE_TRANSFER("application/vnd.gsma.rcs-ft-http+xml"),
        RBM_SPECIFIC_MESSAGE(RbmSpecificMessage.CONTENT_TYPE),
        RBM_SUGGESTION_RESPONSE(RbmSuggestionResponse.CONTENT_TYPE),
        PROTO_MESSAGE(adai.a.toString()),
        TEST("video/aliasing"),
        TEST_FAILURE("video/key-frame-request"),
        LOCATION("application/vnd.gsma.rcspushlocation+xml"),
        ENCRYPTED_MESSAGE(adah.c),
        ENCRYPTION_FTD(adah.e),
        GROUP_SESSION_DATA_MANAGEMENT(GroupManagementContentType.CONTENT_TYPE),
        MESSAGE_RECEIPT(ajru.d.toString());

        private final String contentType;

        Type(String str) {
            this.contentType = str;
        }

        public static Type fromContentType(String str) {
            int indexOf;
            if (str != null) {
                if (((Boolean) ChatMessage.ignoreParametersWhenMatchingContentType.a()).booleanValue() && (indexOf = str.indexOf(";")) > 0) {
                    str = str.substring(0, indexOf).trim();
                }
                for (Type type : values()) {
                    if (type.getContentType().equalsIgnoreCase(str)) {
                        return type;
                    }
                }
            }
            return UNKNOWN;
        }

        public String getContentType() {
            return this.contentType;
        }
    }

    public static ChatMessage createGroupSessionSubjectManagement(String str, String str2) {
        return new ChatMessage(Type.GROUP_SESSION_DATA_MANAGEMENT, GroupManagementSerializer.createGroupSubjectChangeXml(str, str2), str);
    }

    public static String safeGetMessageId(ChatMessage chatMessage) {
        if (chatMessage == null) {
            return "";
        }
        return chatMessage.messageId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ChatMessage chatMessage = (ChatMessage) obj;
            if (((Boolean) useOmitDispositionNotification.a()).booleanValue()) {
                if (Objects.equals(this.messageId, chatMessage.messageId) && Objects.equals(this.bugleLogMessageIdOpt, chatMessage.bugleLogMessageIdOpt) && this.type == chatMessage.type && Arrays.equals(this.content, chatMessage.content) && Objects.equals(this.customCpimHeaders, chatMessage.customCpimHeaders) && this.omitDispositionNotification == chatMessage.omitDispositionNotification) {
                    return true;
                }
                return false;
            }
            if (Objects.equals(this.messageId, chatMessage.messageId) && Objects.equals(this.bugleLogMessageIdOpt, chatMessage.bugleLogMessageIdOpt) && this.type == chatMessage.type && Arrays.equals(this.content, chatMessage.content) && Objects.equals(this.customCpimHeaders, chatMessage.customCpimHeaders)) {
                return true;
            }
        }
        return false;
    }

    public Optional<Long> getBugleLogMessageIdOpt() {
        return this.bugleLogMessageIdOpt;
    }

    public byte[] getContent() {
        return this.content;
    }

    public String getContentAsString() {
        return new String(this.content);
    }

    public String getContentType() {
        return this.type.getContentType();
    }

    public apwq getCustomHeaders() {
        return this.customCpimHeaders;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public boolean getOmitDispositionNotification() {
        return this.omitDispositionNotification;
    }

    public Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hash;
        if (((Boolean) useOmitDispositionNotification.a()).booleanValue()) {
            hash = Objects.hash(this.messageId, this.bugleLogMessageIdOpt, this.type, this.customCpimHeaders, Boolean.valueOf(this.omitDispositionNotification));
        } else {
            hash = Objects.hash(this.messageId, this.bugleLogMessageIdOpt, this.type, this.customCpimHeaders);
        }
        return (hash * 31) + Arrays.hashCode(this.content);
    }

    public String toString() {
        String str;
        apwq apwqVar = this.customCpimHeaders;
        byte[] bArr = this.content;
        Type type = this.type;
        String valueOf = String.valueOf(this.bugleLogMessageIdOpt);
        String valueOf2 = String.valueOf(type);
        int length = bArr.length;
        String valueOf3 = String.valueOf(apwqVar);
        StringBuilder sb = new StringBuilder("ChatMessage{messageId='");
        sb.append(this.messageId);
        sb.append("', bugleLogMessageIdOpt=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(valueOf2);
        sb.append(", content_length=");
        sb.append(length);
        sb.append(", customCpimHeaders=");
        sb.append(valueOf3);
        if (true != this.omitDispositionNotification) {
            str = "";
        } else {
            str = ", omitDispositionNotification";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type.name());
        parcel.writeString(this.messageId);
        parcel.writeInt(this.content.length);
        parcel.writeByteArray(this.content);
        parcel.writeInt(0);
        boolean isPresent = this.bugleLogMessageIdOpt.isPresent();
        parcel.writeInt(isPresent ? 1 : 0);
        if (isPresent) {
            parcel.writeLong(this.bugleLogMessageIdOpt.get().longValue());
        }
        parcel.writeByteArray(this.customCpimHeaders.toByteArray());
        if (((Boolean) useOmitDispositionNotification.a()).booleanValue()) {
            parcel.writeInt(this.omitDispositionNotification ? 1 : 0);
        }
    }

    private ChatMessage(Parcel parcel) {
        apwq apwqVar;
        String readString = parcel.readString();
        readString.getClass();
        this.type = Type.valueOf(readString);
        this.messageId = Objects.toString(parcel.readString(), "");
        byte[] bArr = new byte[parcel.readInt()];
        this.content = bArr;
        parcel.readByteArray(bArr);
        if (parcel.readInt() == 1) {
            parcel.readString();
        }
        this.bugleLogMessageIdOpt = parcel.readInt() == 1 ? Optional.ofNullable(Long.valueOf(parcel.readLong())) : Optional.empty();
        try {
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray == null) {
                apwqVar = apwq.a;
            } else {
                apwqVar = (apwq) apag.parseFrom(apwq.a, createByteArray, aozs.a());
            }
            this.customCpimHeaders = apwqVar;
            if (!((Boolean) useOmitDispositionNotification.a()).booleanValue() || parcel.dataAvail() <= 0) {
                this.omitDispositionNotification = false;
            } else {
                this.omitDispositionNotification = parcel.readInt() == 1;
            }
        } catch (apba e) {
            throw new IllegalStateException("Could not restore ChatMessage from parcel, issue with parsing CustomCpimHeaders", e);
        }
    }

    public ChatMessage(Type type, byte[] bArr) {
        this(type, bArr, agkx.ah());
    }

    public ChatMessage(Type type, byte[] bArr, String str) {
        this.type = type;
        this.content = bArr;
        this.messageId = str;
        this.bugleLogMessageIdOpt = Optional.empty();
        this.customCpimHeaders = apwq.a;
        this.omitDispositionNotification = false;
    }

    public ChatMessage(Type type, byte[] bArr, String str, Long l) {
        this.type = type;
        this.content = bArr;
        this.messageId = str;
        this.bugleLogMessageIdOpt = Optional.ofNullable(l);
        this.customCpimHeaders = apwq.a;
        this.omitDispositionNotification = false;
    }

    public ChatMessage(Type type, byte[] bArr, String str, Long l, apwq apwqVar) {
        this.type = type;
        this.content = bArr;
        this.messageId = str;
        this.bugleLogMessageIdOpt = Optional.ofNullable(l);
        this.customCpimHeaders = apwqVar == null ? apwq.a : apwqVar;
        this.omitDispositionNotification = false;
    }

    public ChatMessage(Type type, byte[] bArr, String str, boolean z) {
        this.type = type;
        this.content = bArr;
        this.messageId = str;
        this.bugleLogMessageIdOpt = Optional.empty();
        this.customCpimHeaders = apwq.a;
        this.omitDispositionNotification = z;
    }
}
