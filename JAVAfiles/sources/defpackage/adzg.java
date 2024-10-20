package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adzg implements adxa {
    public String a;
    public final List b = new ArrayList();
    public final armf c;

    public adzg(armf armfVar) {
        this.c = armfVar;
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:rlmi", "resource");
        xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, this.a);
        if (!this.b.isEmpty()) {
            for (Object obj : this.b) {
                if (obj instanceof adzf) {
                    ((adzf) obj).c(xmlSerializer);
                } else if (obj instanceof adzc) {
                    ((adzc) obj).c(xmlSerializer);
                }
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:rlmi", "resource");
    }
}
