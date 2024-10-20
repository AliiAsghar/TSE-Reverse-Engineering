package defpackage;

import android.net.Uri;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uhy {
    public static final Uri a = Uri.parse("content://com.google.android.apps.messaging.shared.datamodel.provider.sharedstorage.SharedStorageProvider");

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, apbt] */
    public static apbt a(String str, apbt apbtVar) {
        return apbtVar.getParserForType().h(Base64.decode(str, 0), aozs.a());
    }

    public static String b(apbt apbtVar) {
        return Base64.encodeToString(apbtVar.toByteArray(), 0);
    }
}
