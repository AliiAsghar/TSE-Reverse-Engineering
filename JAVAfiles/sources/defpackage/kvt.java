package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class kvt implements akbp<Void, Boolean> {
    final /* synthetic */ kvw a;

    public kvt(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        kuy.a.r("Failed to get Gaia promo callback", th);
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void c(Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            ((Optional) ((apxx) this.a.C).a).ifPresent(new ixe(17));
        } else {
            ((Optional) ((apxx) this.a.ai).a).ifPresent(new Consumer() { // from class: kvs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj3) {
                    kvt kvtVar = kvt.this;
                    kvtVar.a.b.F().getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", 2);
                    ((kqd) obj3).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
