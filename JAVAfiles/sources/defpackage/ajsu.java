package defpackage;

import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupMember;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajsu implements Function {
    private final ajtp a;

    public ajsu() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wbw apply(GroupEvent groupEvent) {
        aozy createBuilder = wbw.a.createBuilder();
        alog a = groupEvent.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            wbz wbzVar = (wbz) this.a.m().fu((GroupMember) a.get(i));
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbw wbwVar = (wbw) createBuilder.b;
            wbzVar.getClass();
            apax apaxVar = wbwVar.b;
            if (!apaxVar.c()) {
                wbwVar.b = apag.mutableCopy(apaxVar);
            }
            wbwVar.b.add(wbzVar);
        }
        return (wbw) createBuilder.s();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public ajsu(ajtp ajtpVar) {
        this.a = ajtpVar;
    }
}
