package defpackage;

import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import com.google.android.rcs.client.messaging.data.MessageReceipt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ajqv {
    void b(BasicTextMessage basicTextMessage);

    void c(ChatMessage chatMessage);

    void d(FileTransferInformation fileTransferInformation);

    void e(IsComposingMessage isComposingMessage);

    void f(LocationInformation locationInformation);

    void g(MessageReceipt messageReceipt);
}
