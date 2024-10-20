package defpackage;

import android.os.Parcel;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import j$.util.function.BiConsumer$CC;
import j$.util.stream.Collector;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajrn implements BiConsumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ajrn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.function.Function] */
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        Object apply;
        Object apply2;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    Collector collector = alls.a;
                    apply = this.a.apply(obj2);
                    apply2 = this.b.apply(obj2);
                    ((alok) obj).h(apply, apply2);
                    return;
                }
                arbj arbjVar = new arbj();
                arbjVar.q((String) obj);
                arbjVar.r((String) this.b);
                arbjVar.s((String) obj2);
                MessageExtensionHeader p = arbjVar.p();
                ajqn ajqnVar = (ajqn) this.a;
                if (ajqnVar.a == null) {
                    if (ajqnVar.b == null) {
                        ajqnVar.a = new alob();
                    } else {
                        ajqnVar.a = new alob();
                        ajqnVar.a.j(ajqnVar.b);
                        ajqnVar.b = null;
                    }
                }
                ajqnVar.a.h(p);
                return;
            }
            aphk aphkVar = (aphk) obj2;
            int i2 = acqk.d;
            if (((String) this.b).contains((String) obj)) {
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aphn aphnVar = (aphn) aozyVar.b;
                aphn aphnVar2 = aphn.a;
                aphkVar.getClass();
                apao apaoVar = aphnVar.s;
                if (!apaoVar.c()) {
                    aphnVar.s = apag.mutableCopy(apaoVar);
                }
                aphnVar.s.g(aphkVar.B);
                return;
            }
            return;
        }
        String str = (String) obj;
        Parcel parcel = (Parcel) this.a;
        parcel.writeString(str);
        parcel.writeString((String) this.b.get(str));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ ajrn(String str, aozy aozyVar, int i) {
        this.c = i;
        this.b = str;
        this.a = aozyVar;
    }
}
