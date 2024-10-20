package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxj {
    public final MessageCoreData a;
    public final Uri b;
    public final int c;
    public final alog d;
    public final boolean e;

    public yxj() {
        throw null;
    }

    public static yxi a() {
        yxi yxiVar = new yxi();
        int i = alog.d;
        yxiVar.e(alsx.a);
        yxiVar.b(false);
        return yxiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yxj) {
            yxj yxjVar = (yxj) obj;
            if (this.a.equals(yxjVar.a) && this.b.equals(yxjVar.b) && this.c == yxjVar.c && alzz.at(this.d, yxjVar.d) && this.e == yxjVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        alog alogVar = this.d;
        Uri uri = this.b;
        return "SendMmsMessageRequest{messageCoreData=" + String.valueOf(this.a) + ", messageUri=" + String.valueOf(uri) + ", subId=" + this.c + ", recipients=" + String.valueOf(alogVar) + ", isRetry=" + this.e + "}";
    }

    public yxj(MessageCoreData messageCoreData, Uri uri, int i, alog alogVar, boolean z) {
        this.a = messageCoreData;
        this.b = uri;
        this.c = i;
        this.d = alogVar;
        this.e = z;
    }
}
