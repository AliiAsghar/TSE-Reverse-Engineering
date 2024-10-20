package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvq implements ncq {
    public final ConversationIdType a;
    private final arwe b;
    private final BugleConversationId c;
    private final rzz d;
    private final iew e;
    private final kor f;

    public mvq(iew iewVar, kor korVar, arwe arweVar, BugleConversationId bugleConversationId) {
        this.e = iewVar;
        this.f = korVar;
        this.b = arweVar;
        this.c = bugleConversationId;
        this.a = bugleConversationId.a;
        wtc b = ScheduledSendTable.b();
        b.c((wsz) ScheduledSendTable.d.g);
        b.d(new mvp(this, 0));
        sxy d = MessagesTable.d();
        d.c(MessagesTable.c.a);
        b.D(agoh.b(d.b(), MessagesTable.c.a, (agmh) ScheduledSendTable.d.f).a());
        this.d = iewVar.m(b.b(), "BugleMessageRespository.ScheduledMessagesQuery");
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.d.f(new kzq(ncpVar, 11), "ScheduledMessageObservableSupplier::register", "ScheduledMessageObservableSupplier::callback", "ScheduledMessageObservableSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        akul c;
        c = qjh.c(this.b, arpj.a, arwf.a, new leb(this, (arpe) null, 18));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    @Override // defpackage.ncq
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final alog c() {
        agpj agpjVar = wsv.a;
        wss a = wsu.a();
        a.w("getScheduledMessagesForConversation1");
        a.c(new wki(this.a, 2));
        a.c(new wmi(6));
        znj znjVar = wsu.b;
        a.z((String) DesugarArrays.stream(new atkn[]{new atkn((agmh) znjVar.b), new atkn((agmh) znjVar.a)}).map(new wmi(4)).collect(Collectors.joining(", ")));
        alog t = a.b().t();
        t.getClass();
        ArrayList arrayList = new ArrayList(aqjn.J(t, 10));
        alur it = t.iterator();
        while (it.hasNext()) {
            wsn wsnVar = (wsn) it.next();
            kor korVar = this.f;
            BugleConversationId bugleConversationId = this.c;
            myj myjVar = (myj) korVar.b.b();
            myjVar.getClass();
            wsnVar.getClass();
            arrayList.add(new mty(myjVar, korVar.a, bugleConversationId, wsnVar));
        }
        return alzz.aZ(arrayList);
    }
}
