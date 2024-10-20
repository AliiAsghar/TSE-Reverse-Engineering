package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vmr {
    public final String a;
    public final CharSequence b;
    public final Uri c;
    public final String d;
    public final boolean e;
    public final MessageIdType f;
    private final boolean g;
    private final boolean h;

    public vmr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmr) {
            vmr vmrVar = (vmr) obj;
            String str = this.a;
            if (str != null ? str.equals(vmrVar.a) : vmrVar.a == null) {
                CharSequence charSequence = this.b;
                if (charSequence != null ? charSequence.equals(vmrVar.b) : vmrVar.b == null) {
                    Uri uri = this.c;
                    if (uri != null ? uri.equals(vmrVar.c) : vmrVar.c == null) {
                        String str2 = this.d;
                        if (str2 != null ? str2.equals(vmrVar.d) : vmrVar.d == null) {
                            if (this.g == vmrVar.g && this.e == vmrVar.e && this.h == vmrVar.h && this.f.equals(vmrVar.f)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i;
        int i2;
        String str = this.a;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        CharSequence charSequence = this.b;
        if (charSequence == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = charSequence.hashCode();
        }
        int i4 = hashCode ^ 1000003;
        Uri uri = this.c;
        if (uri == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = uri.hashCode();
        }
        int i5 = ((((i4 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i6 = (i5 ^ i3) * 1000003;
        int i7 = 1237;
        if (true != this.g) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i8 = (i6 ^ i) * 1000003;
        if (true != this.e) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i9 = (i8 ^ i2) * 1000003;
        if (true == this.h) {
            i7 = 1231;
        }
        return ((i9 ^ i7) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        MessageIdType messageIdType = this.f;
        Uri uri = this.c;
        return "IncomingMessageLineInfo{senderName=" + this.a + ", text=" + String.valueOf(this.b) + ", attachmentUri=" + String.valueOf(uri) + ", attachmentType=" + this.d + ", isMmsPushNotification=" + this.g + ", isManualDownloadNeeded=" + this.e + ", isEitherRichCardOrCarousel=" + this.h + ", messageId=" + messageIdType.toString() + "}";
    }

    public vmr(String str, CharSequence charSequence, Uri uri, String str2, boolean z, boolean z2, boolean z3, MessageIdType messageIdType) {
        this.a = str;
        this.b = charSequence;
        this.c = uri;
        this.d = str2;
        this.g = z;
        this.e = z2;
        this.h = z3;
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.f = messageIdType;
    }
}
