package defpackage;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akzl implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akzl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    this.a.a(obj);
                    return;
                } else {
                    this.a.a(obj);
                    return;
                }
            }
            ((ArrayList) this.a).add((Enum) obj);
            return;
        }
        Enum r3 = (Enum) obj;
        r3.getClass();
        ((akzm) this.a).a.add(new akze(r3));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
                return Consumer$CC.$default$andThen(this, consumer);
            }
            return Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
