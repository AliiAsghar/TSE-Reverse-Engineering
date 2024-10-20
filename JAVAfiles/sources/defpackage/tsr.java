package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tsr extends unp {
    private static final xze a = xze.g("BugleEtouffee", "UpdateConversationEncryptionStatusHandler");

    @Deprecated
    private final tsp b;
    private final armf c;
    private final armf d;

    public tsr(armf armfVar, armf armfVar2, tsp tspVar) {
        this.d = armfVar;
        this.c = armfVar2;
        this.b = tspVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c(unv.WORKMANAGER_ONLY);
        a2.g(gry.EXPONENTIAL);
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a2.a = gsdVar.a();
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("UpdateConversationEncryptionStatusHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        tss tssVar = (tss) apbtVar;
        ConversationIdType b = ruy.b(tssVar.b);
        if (b.b()) {
            a.q("Conversation ID is missing.");
            return aktp.ag(upm.b());
        }
        xyo a2 = a.a();
        a2.H("Processing work item");
        a2.b(b);
        a2.q();
        if (((okg) this.d.b()).a()) {
            d.s(!tssVar.c.isEmpty());
            apax apaxVar = tssVar.c;
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = apaxVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((tsc) this.c.b()).a((qei) it.next(), b).a());
            }
            return aktp.am(arrayList).h(new kli(15), andi.a);
        }
        return this.b.e(b).h(new rgh(10), andi.a);
    }

    @Override // defpackage.unx
    public final apca e() {
        return tss.a.getParserForType();
    }
}
