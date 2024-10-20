package defpackage;

import com.google.android.rcs.client.messaging.data.GroupInformation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ajsv implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wbx apply(GroupInformation groupInformation) {
        aozy createBuilder = wbx.a.createBuilder();
        String e = groupInformation.e();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbx wbxVar = (wbx) createBuilder.b;
        wbxVar.b |= 1;
        wbxVar.c = e;
        e(groupInformation, createBuilder);
        b(groupInformation, createBuilder);
        c(groupInformation, createBuilder);
        d(groupInformation, createBuilder);
        if (groupInformation.c().isPresent()) {
            f(groupInformation, createBuilder);
        }
        return (wbx) createBuilder.s();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(GroupInformation groupInformation, aozy aozyVar);

    public void c(GroupInformation groupInformation, aozy aozyVar) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(GroupInformation groupInformation, aozy aozyVar);

    public void e(GroupInformation groupInformation, aozy aozyVar) {
        throw null;
    }

    public abstract void f(GroupInformation groupInformation, aozy aozyVar);
}
