package defpackage;

import android.view.View;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxf extends kxj {
    private final boolean a;
    private final SelectedConversation b;
    private final View c;
    private final MessageIdType d;
    private final lrf e;

    public kxf(boolean z, SelectedConversation selectedConversation, View view, MessageIdType messageIdType, lrf lrfVar) {
        this.a = z;
        this.b = selectedConversation;
        this.c = view;
        if (messageIdType != null) {
            this.d = messageIdType;
            this.e = lrfVar;
            return;
        }
        throw new NullPointerException("Null messageId");
    }

    @Override // defpackage.kxj
    public final View a() {
        return this.c;
    }

    @Override // defpackage.kxj
    public final SelectedConversation b() {
        return this.b;
    }

    @Override // defpackage.kxj
    public final MessageIdType c() {
        return this.d;
    }

    @Override // defpackage.kxj
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.kxj
    public final lrf e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxj) {
            kxj kxjVar = (kxj) obj;
            if (this.a == kxjVar.d() && this.b.equals(kxjVar.b()) && this.c.equals(kxjVar.a()) && this.d.equals(kxjVar.c()) && this.e.equals(kxjVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        lrf lrfVar = this.e;
        MessageIdType messageIdType = this.d;
        View view = this.c;
        return "ConversationClickEvent{isLongClick=" + this.a + ", selectedConversation=" + this.b.toString() + ", view=" + view.toString() + ", messageId=" + messageIdType.toString() + ", renderData=" + lrfVar.toString() + "}";
    }
}
