package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.IntConsumer$CC;
import j$.util.stream.IntStream;
import java.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kvz implements akgh<Optional<kyd>> {
    final /* synthetic */ kvw a;

    public kvz(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        kuy.a.r("Error getting conversation changed view part", th);
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        final Optional optional = (Optional) obj;
        if (!optional.isEmpty()) {
            gcj m = ((kxm) this.a.p.b()).m();
            ConversationIdType b = ((kyd) optional.get()).b();
            if (m != null) {
                IntStream.CC.range(0, m.size()).filter(new zok(m, b, 1)).findFirst().ifPresent(new IntConsumer() { // from class: kvy
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i) {
                        alpr alprVar = new alpr();
                        alprVar.c(((kyd) optional.get()).a());
                        ((kxm) kvz.this.a.p.b()).r(i, new kzv(alprVar.g(), true));
                    }

                    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                        return IntConsumer$CC.$default$andThen(this, intConsumer);
                    }
                });
            }
        }
    }

    @Override // defpackage.akgh
    public final void b() {
    }
}
