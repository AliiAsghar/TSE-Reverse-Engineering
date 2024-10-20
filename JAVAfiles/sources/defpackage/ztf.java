package defpackage;

import android.widget.ImageView;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ztf implements IntConsumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ztf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        if (this.b != 0) {
            ((ImageView) this.a).setColorFilter(i);
            return;
        }
        ztr ztrVar = (ztr) this.a;
        ztrVar.j.d(i);
        ztrVar.k.d(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        if (this.b != 0) {
            return IntConsumer$CC.$default$andThen(this, intConsumer);
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
