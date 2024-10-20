package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rwm implements ujz, rwo, xzh {
    public static final uuf a = uuh.f(uuh.b, "max_original_message_id_cache_size", 200);
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    @Override // defpackage.ujz
    public final void b(MessageCoreData messageCoreData) {
        f(messageCoreData.E(), messageCoreData.D());
    }

    @Override // defpackage.rwo
    public final /* synthetic */ void c(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.rwo
    public final /* synthetic */ void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.rwo
    public final void e(MessageCoreData messageCoreData) {
        f(messageCoreData.E(), messageCoreData.D());
    }

    public final void f(rve rveVar, rve rveVar2) {
        if (rveVar.i()) {
            return;
        }
        if (this.b.size() > ((Long) a.e()).longValue()) {
            this.b.clear();
        }
        this.b.put(rveVar, rveVar2);
    }

    @Override // defpackage.xzh
    public final void l(int i) {
        this.b.clear();
    }

    @Override // defpackage.rwo
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.ujz
    public final void a(MessageIdType messageIdType, rve rveVar) {
    }
}
