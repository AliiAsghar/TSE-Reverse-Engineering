package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvx {
    public final apwo a;
    public final ChatMessage b;
    public final Optional c;

    public tvx() {
        throw null;
    }

    public static tvx a(apwo apwoVar, ChatMessage chatMessage) {
        return new tvx(apwoVar, chatMessage, Optional.empty());
    }

    public static tvx b(ttf ttfVar) {
        return new tvx(null, null, Optional.of(ttfVar));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tvx) {
            tvx tvxVar = (tvx) obj;
            apwo apwoVar = this.a;
            if (apwoVar != null ? apwoVar.equals(tvxVar.a) : tvxVar.a == null) {
                ChatMessage chatMessage = this.b;
                if (chatMessage != null ? chatMessage.equals(tvxVar.b) : tvxVar.b == null) {
                    if (this.c.equals(tvxVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        apwo apwoVar = this.a;
        int i = 0;
        if (apwoVar == null) {
            hashCode = 0;
        } else {
            hashCode = apwoVar.hashCode();
        }
        ChatMessage chatMessage = this.b;
        if (chatMessage != null) {
            i = chatMessage.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        ChatMessage chatMessage = this.b;
        return "SecretMessageAndReceipt{decryptedSecretMessage=" + String.valueOf(this.a) + ", receiptToSend=" + String.valueOf(chatMessage) + ", reasonForAborting=" + optional.toString() + "}";
    }

    public tvx(apwo apwoVar, ChatMessage chatMessage, Optional optional) {
        this.a = apwoVar;
        this.b = chatMessage;
        this.c = optional;
    }
}
