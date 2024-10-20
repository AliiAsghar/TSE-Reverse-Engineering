package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxl {
    public final MessageCoreData a;
    public final Uri b;
    public final int c;
    public final msh d;
    public final String e;
    public final boolean f;

    public yxl() {
        throw null;
    }

    public static yxk a() {
        yxk yxkVar = new yxk();
        yxkVar.b(false);
        return yxkVar;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof yxl) {
            yxl yxlVar = (yxl) obj;
            if (this.a.equals(yxlVar.a) && this.b.equals(yxlVar.b) && this.c == yxlVar.c && this.d.equals(yxlVar.d) && ((str = this.e) != null ? str.equals(yxlVar.e) : yxlVar.e == null) && this.f == yxlVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        if (true != this.f) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        msh mshVar = this.d;
        Uri uri = this.b;
        return "SendSmsMessageRequest{messageCoreData=" + String.valueOf(this.a) + ", messageUri=" + String.valueOf(uri) + ", subId=" + this.c + ", recipient=" + String.valueOf(mshVar) + ", smsServiceCenter=" + this.e + ", isRetry=" + this.f + "}";
    }

    public yxl(MessageCoreData messageCoreData, Uri uri, int i, msh mshVar, String str, boolean z) {
        this.a = messageCoreData;
        this.b = uri;
        this.c = i;
        this.d = mshVar;
        this.e = str;
        this.f = z;
    }
}
