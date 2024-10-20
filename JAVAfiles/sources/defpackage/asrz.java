package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum asrz {
    CR("\r"),
    CRLF(VCardBuilder.VCARD_END_OF_LINE),
    LF("\n");

    public final String d;

    asrz(String str) {
        this.d = str;
    }
}
