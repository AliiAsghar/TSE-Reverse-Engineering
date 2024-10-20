package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.AutoValue_GetMessagesResponse;
import com.google.android.rcs.client.messaging.AutoValue_GroupOperationResult;
import com.google.android.rcs.client.messaging.GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.AutoValue_ChatMessage;
import com.google.android.rcs.client.messaging.data.AutoValue_GroupEvent;
import com.google.android.rcs.client.messaging.data.AutoValue_SubjectExtension;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import j$.time.Instant;
import j$.util.Optional;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajur {
    public Object a;
    public Object b;

    public ajur() {
        this.a = "Unknown";
        this.b = "Unknown";
    }

    public static String a(String str, boolean z) {
        if (!"VisibleUsingXml".equals(str) && !"Visible".equals(str) && !"Invisible".equals(str)) {
            throw new IllegalStateException("Illegal visibility state: ".concat(String.valueOf(str)));
        }
        if (z) {
            if ("Invisible".equals(str)) {
                return "Invisible_to_Visible";
            }
            return str;
        }
        if ("VisibleUsingXml".equals(str)) {
            return "VisibleUsingXml_to_Invisible";
        }
        if ("Visible".equals(str)) {
            return "Visible_to_Invisible";
        }
        return str;
    }

    public static final String d(boolean z, boolean z2) {
        if (z) {
            if (true != z2) {
                return "Visible";
            }
            return "VisibleUsingXml";
        }
        return "Invisible";
    }

    public final void A(List list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null places");
    }

    public final void B(List list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null places");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final aibs C() {
        ?? r0 = this.b;
        if (r0 != 0) {
            return new aibs(r0, (adae) this.a);
        }
        throw new IllegalStateException("Missing required properties: placeFields");
    }

    public final void D(List list) {
        if (list != null) {
            this.b = list;
            return;
        }
        throw new NullPointerException("Null placeFields");
    }

    public final void b(boolean z, boolean z2) {
        Object obj;
        if (((String) this.a).equals("Unknown")) {
            obj = d(z, z2);
        } else {
            obj = this.a;
        }
        this.a = obj;
    }

    public final void c(boolean z, boolean z2) {
        Object obj;
        if (((String) this.b).equals("Unknown")) {
            obj = d(z, z2);
        } else {
            obj = this.b;
        }
        this.b = obj;
    }

    public final ajrt e() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new ajrt((aozb) obj2, (ContentType) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" content");
        }
        if (this.b == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(aozb aozbVar) {
        if (aozbVar != null) {
            this.a = aozbVar;
            return;
        }
        throw new NullPointerException("Null content");
    }

    public final void g(ContentType contentType) {
        if (contentType != null) {
            this.b = contentType;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    public final SubjectExtension h() {
        return new AutoValue_SubjectExtension((Optional) this.b, (Optional) this.a);
    }

    public final void i(RcsDestinationId rcsDestinationId) {
        this.b = Optional.of(rcsDestinationId);
    }

    public final void j(Instant instant) {
        this.a = Optional.of(instant);
    }

    public final GroupEvent k() {
        Object obj = this.b;
        if (obj != null) {
            this.a = ((alob) obj).g();
        } else if (this.a == null) {
            int i = alog.d;
            this.a = alsx.a;
        }
        return new AutoValue_GroupEvent((alog) this.a);
    }

    public final ChatMessage l() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new AutoValue_ChatMessage((aozb) obj2, (ContentType) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" content");
        }
        if (this.b == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void m(aozb aozbVar) {
        if (aozbVar != null) {
            this.a = aozbVar;
            return;
        }
        throw new NullPointerException("Null content");
    }

    public final void n(ContentType contentType) {
        if (contentType != null) {
            this.b = contentType;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    public final ajpy o() {
        return new ajpa((Optional) this.b, (Optional) this.a);
    }

    public final GroupOperationResult p() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != null && (obj = this.a) != null) {
            return new AutoValue_GroupOperationResult((MessagingResult) obj2, (Conversation) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" result");
        }
        if (this.a == null) {
            sb.append(" conversation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void q(Conversation conversation) {
        if (conversation != null) {
            this.a = conversation;
            return;
        }
        throw new NullPointerException("Null conversation");
    }

    public final void r(MessagingResult messagingResult) {
        if (messagingResult != null) {
            this.b = messagingResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final GetMessagesResponse s() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != null && (obj = this.a) != null) {
            return new AutoValue_GetMessagesResponse((MessagingResult) obj2, (alog) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" result");
        }
        if (this.a == null) {
            sb.append(" messages");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void t(List list) {
        this.a = alog.n(list);
    }

    public final void u(MessagingResult messagingResult) {
        if (messagingResult != null) {
            this.b = messagingResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final GetGroupNotificationsResponse v() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new AutoValue_GetGroupNotificationsResponse((MessagingResult) obj2, (alog) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" result");
        }
        if (this.b == null) {
            sb.append(" notifications");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void w(List list) {
        this.b = alog.n(list);
    }

    public final void x(MessagingResult messagingResult) {
        if (messagingResult != null) {
            this.a = messagingResult;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public final void y(List list) {
        OutputStream outputStream = (OutputStream) alzz.aO(list);
        if (outputStream instanceof aivp) {
            this.a = (aivp) outputStream;
            this.b = (OutputStream) list.get(0);
        }
    }

    public final void z() {
        if (this.a != null) {
            ((OutputStream) this.b).flush();
            ((aivp) this.a).a.getFD().sync();
            return;
        }
        throw new aivn("Cannot sync underlying stream");
    }

    public ajur(byte[] bArr) {
    }

    public ajur(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = Optional.empty();
        this.a = Optional.empty();
    }

    public ajur(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = Optional.empty();
        this.a = Optional.empty();
    }
}
