package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mux extends agmc {
    public static final /* synthetic */ int b = 0;
    public final Consumer a;
    private final agnq c;
    private final List f = new ArrayList();
    private final pna g;

    public mux(agnq agnqVar, Consumer consumer, pna pnaVar) {
        this.c = agnqVar;
        this.a = consumer;
        this.g = pnaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f(agpr agprVar, List list) {
        sxy d;
        boolean ap;
        if (this.g.a()) {
            d = MessagesTable.d();
            d.w("MessageChangeQueryListener#preChangeInTransaction-messages1");
            d.d(new mtm(11));
        } else {
            d = MessagesTable.d();
            d.w("MessageChangeQueryListener#preChangeInTransaction-messages1");
            d.d(new mtm(12));
            d.g(new mtm(13));
        }
        alur it = agprVar.e.iterator();
        while (it.hasNext()) {
            d.k((syb) ((agpw) it.next()));
        }
        sxz sxzVar = (sxz) agprVar;
        int i = 0;
        if (((Boolean) muv.e.e()).booleanValue() && sxzVar.l("message_status")) {
            i = sxzVar.a();
        }
        sxt sxtVar = (sxt) d.b().n();
        while (sxtVar.moveToNext()) {
            try {
                if (this.g.a()) {
                    sxz sxzVar2 = (sxz) agprVar;
                    if (sxzVar2.l("is_hidden")) {
                        ap = sxzVar2.a.getAsBoolean("is_hidden").booleanValue();
                    } else {
                        ap = sxtVar.ap();
                    }
                    if (!ap) {
                    }
                }
                list.add(new mzi(miq.UPDATE, new CoreBugleMessageId(sxtVar.E(), -1L), new BugleConversationId(sxtVar.C()), Instant.ofEpochMilli(sxtVar.s()), i));
            } catch (Throwable th) {
                try {
                    sxtVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        sxtVar.close();
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        MessagesTable.BindData bindData = (MessagesTable.BindData) agloVar.p();
        if (bindData != null && !bindData.T() && (!((Boolean) muv.c.e()).booleanValue() || bindData.q() != 4)) {
            List list = this.f;
            miq miqVar = miq.INSERT;
            CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.A(), -1L);
            ConversationIdType z = bindData.z();
            z.getClass();
            list.add(new mzi(miqVar, coreBugleMessageId, new BugleConversationId(z), Instant.ofEpochMilli(bindData.t()), 0));
        }
        MessagesTable.BindData[] bindDataArr = (MessagesTable.BindData[]) agloVar.t();
        if (bindDataArr != null) {
            for (MessagesTable.BindData bindData2 : bindDataArr) {
                if (!bindData2.T() && !bindData2.A().b()) {
                    List list2 = this.f;
                    miq miqVar2 = miq.INSERT;
                    CoreBugleMessageId coreBugleMessageId2 = new CoreBugleMessageId(bindData2.A(), -1L);
                    ConversationIdType z2 = bindData2.z();
                    z2.getClass();
                    list2.add(new mzi(miqVar2, coreBugleMessageId2, new BugleConversationId(z2), Instant.ofEpochMilli(bindData2.t()), 0));
                }
            }
        }
        agpr r = agloVar.r();
        if (r != null) {
            ArrayList arrayList = new ArrayList();
            f(r, arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mzi mziVar = (mzi) arrayList.get(i);
                if (Collection.EL.stream(this.f).anyMatch(new isg(mziVar, 17))) {
                    this.f.add(mziVar);
                }
            }
        }
        if (!this.f.isEmpty()) {
            List list3 = this.f;
            agnq agnqVar = this.c;
            alog n = alog.n(list3);
            agnqVar.h(new mla(2), String.valueOf(n.hashCode()), new nan(this, n, 1));
        }
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ void c(agoz agozVar, aglo agloVar) {
        this.f.clear();
        agpr r = agloVar.r();
        if (r != null) {
            f(r, this.f);
        }
        agpw s = agloVar.s();
        if (s != null) {
            sxy d = MessagesTable.d();
            d.w("+MessageChangeQueryListener#preChangeInTransaction-messages2");
            d.d(new mtm(14));
            d.k((syb) s);
            d.g(new mtm(15));
            sxt sxtVar = (sxt) d.b().n();
            while (sxtVar.moveToNext()) {
                try {
                    this.f.add(new mzi(miq.DELETE, new CoreBugleMessageId(sxtVar.E(), -1L), new BugleConversationId(sxtVar.C()), Instant.ofEpochMilli(sxtVar.s()), 0));
                } catch (Throwable th) {
                    try {
                        sxtVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            sxtVar.close();
        }
    }
}
