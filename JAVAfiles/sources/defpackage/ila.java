package defpackage;

import android.widget.EditText;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ila extends zqe {
    int a(MessagePartCoreData messagePartCoreData);

    cg b();

    EditText c();

    rsr d();

    @Deprecated
    ComposeMessageView e();

    void f(boolean z);

    void g();

    void h(long j, long j2);

    void i(boolean z, boolean z2, boolean z3);

    void j(rre rreVar);

    void k(ilb ilbVar);

    void l(MessageCoreData messageCoreData);

    void m(MessageCoreData messageCoreData, boolean z);

    @Override // defpackage.zqe
    boolean n();

    boolean o(MessagePartCoreData messagePartCoreData);

    void p(MessageCoreData messageCoreData, boolean z);
}
