package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rdu extends arpw implements arqv {
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdu(ConversationIdType conversationIdType, int i, MessageIdType messageIdType, abej abejVar, long j, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.f = i2;
        this.c = conversationIdType;
        this.a = i;
        this.e = messageIdType;
        this.d = abejVar;
        this.b = j;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                return ((rdu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((rdu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((rdu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                aqil.P(obj);
                alwl alwlVar = (alwl) abej.a.g();
                alwlVar.X(ydl.M, "MessagesPageDataBuilder");
                alwlVar.J("#loadNextPage for conversation: %s, with page size: %s, with oldest message: %s", this.c, new Integer(this.a), this.e);
                ibi ibiVar = (ibi) ((abej) this.d).c.b();
                Object obj2 = this.c;
                int i2 = this.a;
                ConversationIdType conversationIdType = (ConversationIdType) obj2;
                sda b = scq.b(conversationIdType, (MessageIdType) this.e, this.b, i2);
                b.c(new rrv(3));
                b.d(new atkn((agmh) sdc.b.a));
                b.u(i2);
                alog t = ((say) ibiVar.a).b(true, false, conversationIdType, b.b()).b().t();
                t.getClass();
                ArrayList arrayList = new ArrayList(aqjn.J(t, 10));
                alur it = t.iterator();
                while (it.hasNext()) {
                    abej abejVar = (abej) this.d;
                    arrayList.add(((yvy) abejVar.b.b()).a(((vid) abejVar.d.b()).b((saz) it.next()), null, (Context) abejVar.f.b()));
                }
                return arrayList;
            }
            aqil.P(obj);
            long j = this.b;
            Object obj3 = this.e;
            Object obj4 = this.d;
            int i3 = this.a;
            rcr rcrVar = (rcr) this.c;
            rcrVar.c.c(rcrVar.b, i3, (String) obj4, (String) obj3, 131, j);
            return arnb.a;
        }
        aqil.P(obj);
        long j2 = this.b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        int i4 = this.a;
        reb rebVar = (reb) this.c;
        rebVar.n.c(rebVar.d, i4, (String) obj6, (String) obj5, 131, j2);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                Object obj2 = this.c;
                int i2 = this.a;
                Object obj3 = this.e;
                return new rdu((ConversationIdType) obj2, i2, (MessageIdType) obj3, (abej) this.d, this.b, arpeVar, 2);
            }
            Object obj4 = this.c;
            int i3 = this.a;
            Object obj5 = this.d;
            return new rdu((rcr) obj4, i3, (String) obj5, (String) this.e, this.b, arpeVar, 1);
        }
        Object obj6 = this.c;
        int i4 = this.a;
        Object obj7 = this.d;
        return new rdu((reb) obj6, i4, (String) obj7, (String) this.e, this.b, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdu(rcr rcrVar, int i, String str, String str2, long j, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.f = i2;
        this.c = rcrVar;
        this.a = i;
        this.d = str;
        this.e = str2;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdu(reb rebVar, int i, String str, String str2, long j, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.f = i2;
        this.c = rebVar;
        this.a = i;
        this.d = str;
        this.e = str2;
        this.b = j;
    }
}
