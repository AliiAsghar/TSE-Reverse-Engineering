package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ism implements andy {
    final /* synthetic */ MessageIdType a;
    final /* synthetic */ boolean b;
    final /* synthetic */ itb c;

    public ism(itb itbVar, MessageIdType messageIdType, boolean z) {
        this.a = messageIdType;
        this.b = z;
        this.c = itbVar;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
        } else {
            throw new IllegalArgumentException("ensure loaded failed.", th);
        }
    }

    @Override // defpackage.andy
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.aB = false;
        this.c.K(this.a, null);
        this.c.l.c(new ahka("Conversation search results displayed"));
    }
}
