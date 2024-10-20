package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aifb implements aifc {
    public final long a;
    private final Context b;
    private final Uri c;

    public aifb() {
        throw null;
    }

    public static aipw c(Uri uri) {
        String str;
        if (true != uri.toString().startsWith(Telephony.Mms.CONTENT_URI.toString())) {
            str = "com.google.android.apps.messaging";
        } else {
            str = "com.android.providers.telephony";
        }
        return aipw.a(str);
    }

    @Override // defpackage.aifc
    public final long a() {
        return this.a;
    }

    @Override // defpackage.aifc
    public final InputStream b() {
        Context context = this.b;
        Uri uri = this.c;
        return aipx.b(context, uri, c(uri));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aifb) {
            aifb aifbVar = (aifb) obj;
            if (this.b.equals(aifbVar.b) && this.c.equals(aifbVar.c) && this.a == aifbVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        long j = this.a;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Uri uri = this.c;
        return "FileContent{context=" + this.b.toString() + ", contentUri=" + uri.toString() + ", contentLength=" + this.a + "}";
    }

    public aifb(Context context, Uri uri, long j) {
        this.b = context;
        if (uri == null) {
            throw new NullPointerException("Null contentUri");
        }
        this.c = uri;
        this.a = j;
    }
}
