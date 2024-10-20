package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ryi {
    public static final xze a = xze.g("BugleAnnotation", "MessageAnnotationData");
    public volatile ConversationIdType b;
    public volatile MessageIdType c = rvc.a;
    public final ArrayList d = new ArrayList();
    private final Object e = new Object();

    public static SuggestionData a(ConversationIdType conversationIdType, MessageIdType messageIdType, aqce aqceVar) {
        aozy createBuilder = aqcz.a.createBuilder();
        aozy createBuilder2 = aqcy.b.createBuilder();
        String a2 = messageIdType.a();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aqcy aqcyVar = (aqcy) createBuilder2.b;
        a2.getClass();
        aqcyVar.l = a2;
        String a3 = conversationIdType.a();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        a3.getClass();
        ((aqcy) apagVar).m = a3;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        ((aqcy) apagVar2).j = "CopyOTP";
        aqbc aqbcVar = aqbc.COPY_OTP;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        ((aqcy) createBuilder2.b).k = aqbcVar.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqcz aqczVar = (aqcz) createBuilder.b;
        aqcy aqcyVar2 = (aqcy) createBuilder2.s();
        aqcyVar2.getClass();
        aqczVar.e = aqcyVar2;
        aqczVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqcz aqczVar2 = (aqcz) createBuilder.b;
        aqceVar.getClass();
        aqczVar2.d = aqceVar;
        aqczVar2.c = 18;
        return new SmartSuggestionItemSuggestionData((aqcz) createBuilder.s());
    }

    public final Optional b() {
        return Collection.EL.stream(this.d).filter(new rsi(14)).findFirst();
    }

    public final void c(List list) {
        Set set = (Set) Collection.EL.stream(list).map(new rxo(13)).flatMap(new rxo(14)).map(new rxo(15)).collect(alls.b);
        if (!list.isEmpty() && set.size() != 1) {
            xyo b = a.b();
            b.H("bind should only be called with annotations for a single message. Message IDs: ");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                b.c(rvc.b((String) it.next()));
            }
            b.q();
        }
        Stream flatMap = Collection.EL.stream(list).map(new rxo(16)).flatMap(new rxo(17));
        int i = alog.d;
        List list2 = (List) flatMap.collect(alls.a);
        if (!list.isEmpty()) {
            stc stcVar = (stc) alzz.aO(list);
            ConversationIdType k = stcVar.k();
            MessageIdType l = stcVar.l();
            synchronized (this.e) {
                if (k.b()) {
                    xyo e = a.e();
                    e.H("conversationId was null for annotation");
                    e.H(stcVar);
                    e.q();
                } else {
                    this.b = k;
                }
                if (l.b()) {
                    xyo e2 = a.e();
                    e2.H("messageId was null for annotation");
                    e2.H(stcVar);
                    e2.q();
                } else {
                    this.c = l;
                }
            }
        }
        synchronized (this.e) {
            this.d.clear();
            this.d.addAll(list2);
        }
    }
}
