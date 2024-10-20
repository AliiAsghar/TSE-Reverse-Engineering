package defpackage;

import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajsb implements ajqv {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    private final ajsj c;

    public ajsb(ajsj ajsjVar) {
        this.c = ajsjVar;
    }

    private final void h(ajqz ajqzVar, Class cls) {
        boolean z = false;
        if (this.a.isEmpty() && this.b.isEmpty()) {
            z = true;
        }
        albo.U(z, "This visitor has already been used. Please create another one.");
        try {
            this.a = Optional.of(this.c.b(cls).b(ajqzVar));
        } catch (ajsh e) {
            this.b = Optional.of(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.a.isPresent();
    }

    @Override // defpackage.ajqv
    public final void b(BasicTextMessage basicTextMessage) {
        h(basicTextMessage, BasicTextMessage.class);
    }

    @Override // defpackage.ajqv
    public final void c(ChatMessage chatMessage) {
        h(chatMessage, ChatMessage.class);
    }

    @Override // defpackage.ajqv
    public final void d(FileTransferInformation fileTransferInformation) {
        h(fileTransferInformation, FileTransferInformation.class);
    }

    @Override // defpackage.ajqv
    public final void e(IsComposingMessage isComposingMessage) {
        h(isComposingMessage, IsComposingMessage.class);
    }

    @Override // defpackage.ajqv
    public final void f(LocationInformation locationInformation) {
        h(locationInformation, LocationInformation.class);
    }

    @Override // defpackage.ajqv
    public final void g(MessageReceipt messageReceipt) {
        h(messageReceipt, MessageReceipt.class);
    }
}
