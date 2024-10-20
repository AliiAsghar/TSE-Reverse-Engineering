package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajru {
    public static final ContentType a;
    public static final ContentType b;
    public static final ContentType c;
    public static final ContentType d;
    public static final ContentType e;
    public static final ContentType f;
    public static final ContentType g;
    public static final ContentType h;
    public static final ContentType i;
    public static final ContentType j;

    static {
        aoad g2 = ContentType.g();
        g2.C("application");
        g2.B("im-iscomposing+xml");
        a = g2.y();
        aoad g3 = ContentType.g();
        g3.C("application");
        g3.B("vnd.gsma.rcs-ft-http+xml");
        b = g3.y();
        aoad g4 = ContentType.g();
        g4.C("application");
        g4.B("vnd.gsma.rcspushlocation+xml");
        c = g4.y();
        aoad g5 = ContentType.g();
        g5.C("message");
        g5.B("imdn+xml");
        d = g5.y();
        aoad g6 = ContentType.g();
        g6.C(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        g6.B("plain");
        e = g6.y();
        aoad g7 = ContentType.g();
        g7.C("application");
        g7.B("vnd.gsma.botmessage.v1.0+json");
        f = g7.y();
        aoad g8 = ContentType.g();
        g8.C("application");
        g8.B("vnd.gsma.botsuggestion.v1.0+json");
        g = g8.y();
        aoad g9 = ContentType.g();
        g9.C("image");
        g9.B("jpeg");
        h = g9.y();
        aoad g10 = ContentType.g();
        g10.C("application");
        g10.B("octet-stream");
        i = g10.y();
        aoad g11 = ContentType.g();
        g11.C("application");
        g11.B("txt");
        j = g11.y();
    }
}
