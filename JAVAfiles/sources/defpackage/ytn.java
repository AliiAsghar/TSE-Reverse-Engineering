package defpackage;

import com.google.communication.synapse.security.scytale.UserDevices;
import j$.util.DesugarCollections;
import j$.util.function.BiConsumer$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ytn implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ytn(int i, ArrayList arrayList, int i2) {
        this.c = i2;
        this.a = i;
        this.b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = 0;
        if (this.c != 0) {
            String str = (String) obj;
            Collection collection = (Collection) obj2;
            Object obj3 = this.b;
            int i2 = this.a;
            if (i2 == 1) {
                ((ArrayList) obj3).add(new UserDevices(str, new ArrayList(collection)));
                return;
            }
            xyo c = tvy.a.c();
            c.H("Expanding the recipient.");
            c.x("multiplier", i2);
            c.q();
            while (i < i2) {
                ((ArrayList) obj3).add(new UserDevices(str, new ArrayList(collection)));
                i++;
            }
            return;
        }
        String str2 = (String) obj;
        alog alogVar = (alog) obj2;
        alor alorVar = ytp.a;
        if (alogVar.isEmpty()) {
            return;
        }
        int i3 = this.a;
        Object obj4 = this.b;
        String a = ytp.a(str2, i3);
        anmj anmjVar = anmj.a;
        a.getClass();
        aozy aozyVar = (aozy) obj4;
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(((anmo) aozyVar.b).y);
        if (unmodifiableMap.containsKey(a)) {
            anmjVar = (anmj) unmodifiableMap.get(a);
        }
        aozy builder = anmjVar.toBuilder();
        int size = alogVar.size();
        while (i < size) {
            yus yusVar = (yus) alogVar.get(i);
            aozy createBuilder = anmi.a.createBuilder();
            aozb aozbVar = yusVar.a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ((anmi) apagVar).c = aozbVar;
            apct apctVar = yusVar.b;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            anmi anmiVar = (anmi) createBuilder.b;
            anmiVar.d = apctVar;
            anmiVar.b |= 1;
            anmi anmiVar2 = (anmi) createBuilder.s();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            anmj anmjVar2 = (anmj) builder.b;
            anmiVar2.getClass();
            apax apaxVar = anmjVar2.b;
            if (!apaxVar.c()) {
                anmjVar2.b = apag.mutableCopy(apaxVar);
            }
            anmjVar2.b.add(anmiVar2);
            i++;
        }
        anmj anmjVar3 = (anmj) builder.s();
        a.getClass();
        anmjVar3.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        anmo anmoVar = (anmo) aozyVar.b;
        apbo apboVar = anmoVar.y;
        if (!apboVar.b) {
            anmoVar.y = apboVar.a();
        }
        anmoVar.y.put(a, anmjVar3);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        if (this.c != 0) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ ytn(aozy aozyVar, int i, int i2) {
        this.c = i2;
        this.b = aozyVar;
        this.a = i;
    }
}
