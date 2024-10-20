package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uky implements uld {
    private static final alwo a = alwo.o("BugleCms");
    private final ulc b;

    public uky(ulc ulcVar) {
        this.b = ulcVar;
    }

    @Override // defpackage.uld
    public final List a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.b.a(1, 1, umx.b(17)).a());
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsObjectTriggers", "getCreateTriggersSqls", 57, "CmsObjectTriggers.java")).q("Creating trigger SQL for delete object");
        rzy c = this.b.c(1, 3, umx.b(9), true);
        c.h = "cms_id";
        arrayList.add(c.a());
        rzy a2 = this.b.a(1, 2, umx.b(33));
        a2.c = alzz.ap("conversation_id");
        a2.e = 1;
        arrayList.add(a2.a());
        rzy a3 = this.b.a(1, 2, umx.b(3));
        a3.a = "conv";
        a3.h = "conversation_id";
        a3.c = alzz.ap("read");
        a3.e = 2;
        a3.b("NEW.read");
        a3.b("NEW.received_timestamp > (select cms_most_recent_read_message_timestamp_ms from conversations where NEW.conversation_id = conversations._id)");
        arrayList.add(a3.a());
        return arrayList;
    }
}
