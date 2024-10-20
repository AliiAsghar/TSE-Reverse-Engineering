package defpackage;

import com.android.vcard.VCardConfig;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aivq {
    public static final Charset a;

    static {
        Charset.forName("US-ASCII");
        Charset.forName(VCardConfig.DEFAULT_INTERMEDIATE_CHARSET);
        a = Charset.forName("UTF-8");
    }
}
