package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uku implements uld {
    public static final /* synthetic */ int a = 0;
    private static final alwo b = alwo.o("BugleCms");
    private final nxt c;
    private final ulc d;
    private final qif e;
    private final armf f;
    private final armf g;

    public uku(ulc ulcVar, qif qifVar, nxt nxtVar, armf armfVar, armf armfVar2) {
        this.d = ulcVar;
        this.e = qifVar;
        this.f = armfVar;
        this.c = nxtVar;
        this.g = armfVar2;
    }

    @Override // defpackage.uld
    public final List a() {
        alog alogVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.d.a(2, 1, umx.b(17)).a());
        ((alwl) ((alwl) b.g()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationTriggers", "getCreateTriggersSqls", 66, "CmsConversationTriggers.java")).q("Creating trigger SQL for delete conversation");
        rzy c = this.d.c(2, 3, umx.b(9), true);
        c.h = "cms_id";
        arrayList.add(c.a());
        rzy a2 = this.d.a(2, 2, umx.b(3));
        a2.c = alzz.ap("snippet_text", "sort_timestamp", "archive_status");
        a2.a = umx.c(3);
        arrayList.add(a2.a());
        rzy a3 = this.d.a(2, 2, umx.b(5));
        a3.c = alzz.ap("name", "icon", "current_self_id", "participant_id_list", "join_state", "conv_type", "send_mode", "marked_as_unread");
        a3.a = umx.c(5);
        arrayList.add(a3.a());
        if (this.e.h()) {
            if (((okf) this.f.b()).a()) {
                rzy a4 = this.d.b(6, 1).a(2, "conversation_id");
                a4.e = 2;
                a4.f = umx.b(5);
                arrayList.add(a4.a());
                rzy a5 = this.d.b(6, 3).a(2, "conversation_id");
                a5.e = 2;
                a5.f = umx.b(5);
                arrayList.add(a5.a());
            } else {
                rzy a6 = this.d.b(6, 1).a(2, "conversation_id");
                a6.e = 2;
                a6.f = umx.b(5);
                arrayList.add(a6.a());
                rzy a7 = this.d.b(6, 3).a(2, "conversation_id");
                a7.e = 2;
                a7.f = umx.b(5);
                arrayList.add(a7.a());
            }
        } else if (((okf) this.f.b()).a()) {
            rzy rzyVar = new rzy();
            rzyVar.i = 1;
            rzyVar.d = 32;
            rzyVar.b = 6;
            rzyVar.e = 2;
            rzyVar.h = "conversation_id";
            rzyVar.c();
            rzyVar.g = this.c.a();
            rzyVar.f = umx.b(5);
            arrayList.add(rzyVar.a());
            rzy rzyVar2 = new rzy();
            rzyVar2.i = 3;
            rzyVar2.d = 32;
            rzyVar2.b = 6;
            rzyVar2.e = 2;
            rzyVar2.h = "conversation_id";
            rzyVar2.c();
            rzyVar2.g = this.c.a();
            rzyVar2.f = umx.b(5);
            arrayList.add(rzyVar2.a());
        } else {
            rzy rzyVar3 = new rzy();
            rzyVar3.i = 1;
            rzyVar3.d = 32;
            rzyVar3.b = 6;
            rzyVar3.e = 2;
            rzyVar3.h = "conversation_id";
            rzyVar3.c();
            rzyVar3.g = this.c.a();
            rzyVar3.f = umx.b(5);
            arrayList.add(rzyVar3.a());
            rzy rzyVar4 = new rzy();
            rzyVar4.i = 3;
            rzyVar4.d = 32;
            rzyVar4.b = 6;
            rzyVar4.e = 2;
            rzyVar4.h = "conversation_id";
            rzyVar4.c();
            rzyVar4.g = this.c.a();
            rzyVar4.f = umx.b(5);
            arrayList.add(rzyVar4.a());
        }
        if (xxy.a() && ((Boolean) ((utz) xxy.i.get()).e()).booleanValue()) {
            if (((Optional) ((apxx) this.g).a).isPresent()) {
                Stream flatMap = Collection.EL.stream(((Map) ((Optional) ((apxx) this.g).a).get()).values()).flatMap(new uid(15));
                int i = alog.d;
                alogVar = (alog) flatMap.collect(alls.a);
            } else {
                int i2 = alog.d;
                alogVar = alsx.a;
            }
            arrayList.addAll(alogVar);
        }
        return arrayList;
    }
}
