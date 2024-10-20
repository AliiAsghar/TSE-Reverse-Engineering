package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajrr implements ajsi {
    public static final ContentType a;
    private final Charset b = StandardCharsets.UTF_8;

    static {
        aoad g = ContentType.g();
        g.C(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        g.B("plain");
        g.A(alor.l("charset", "UTF-8"));
        a = g.y();
    }

    public static final BasicTextMessage c(ajrt ajrtVar) {
        try {
            ContentType contentType = ajrtVar.b;
            ContentType contentType2 = a;
            if (contentType2.e(contentType)) {
                String C = ajrtVar.a.C(Charset.forName((String) contentType.a().getOrDefault(albo.ap("charset"), "UTF-8")));
                aodz aodzVar = new aodz((char[]) null);
                aodzVar.o(C);
                return aodzVar.n();
            }
            throw new ajsk(contentType, "Supported type for this serializer is: " + String.valueOf(contentType2));
        } catch (UnsupportedCharsetException e) {
            throw new ajsh("Error deserializing BasicTextMessage", e);
        }
    }

    @Override // defpackage.ajsi
    public final /* bridge */ /* synthetic */ ajqz a(ajrt ajrtVar) {
        return c(ajrtVar);
    }

    @Override // defpackage.ajsi
    public final /* synthetic */ ajrt b(ajqz ajqzVar) {
        aoad g = ContentType.g();
        g.C(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        g.B("plain");
        g.A(alor.l("charset", this.b.name()));
        ContentType y = g.y();
        ajur ajurVar = new ajur(null);
        ajurVar.g(y);
        ajurVar.f(aozb.x(((BasicTextMessage) ajqzVar).a(), this.b));
        return ajurVar.e();
    }
}
