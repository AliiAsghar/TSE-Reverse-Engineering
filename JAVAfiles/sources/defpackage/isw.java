package defpackage;

import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class isw implements akbp<Void, List<apdj>> {
    final /* synthetic */ itb a;

    public isw(itb itbVar) {
        this.a = itbVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        xzb.i("Bugle", th, "Unable to show reactions summary for message");
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        this.a.G.ifPresent(new Consumer() { // from class: isv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void q(Object obj3) {
                isw.this.a.f.x().getClass();
                ((iuu) obj3).e();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
