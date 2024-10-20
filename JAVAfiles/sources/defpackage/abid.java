package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;
import com.google.android.libraries.compose.ui.composable.HugoHostFragment;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.xml.namespace.QName;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abid implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ abid(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.google.android.ims.network.common.RcsEngine, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.c) {
            case 0:
                ((AtomicReference) this.a).set(new abig((String) obj));
                ((CountDownLatch) this.b).countDown();
                return;
            case 1:
                ((AtomicReference) this.a).set(obj);
                ((CountDownLatch) this.b).countDown();
                return;
            case 2:
                aphy aphyVar = (aphy) ((Optional) this.a).get();
                aozy aozyVar = (aozy) this.b;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aphz aphzVar = (aphz) aozyVar.b;
                aphz aphzVar2 = aphz.a;
                aphzVar.g = aphyVar.n;
                aphzVar.b |= 16;
                return;
            case 3:
                ((adtz) obj).e().c((wbn) this.b, this.a);
                return;
            case 4:
                ((adtz) obj).e().d((wdd) this.b, this.a);
                return;
            case 5:
                ((adtz) obj).e().h((web) this.b, this.a);
                return;
            case 6:
                ((adtz) obj).e().e((wdn) this.b, this.a);
                return;
            case 7:
                ((adtz) obj).e().f((wdr) this.b, this.a);
                return;
            case 8:
                ((adtz) obj).e().g((wdx) this.b, this.a);
                return;
            case 9:
                ((adtz) obj).e().b((wbg) this.b, this.a);
                return;
            case 10:
                Optional empty = Optional.empty();
                Object obj2 = this.b;
                admp admpVar = new admp((adjd) obj, empty, new admk(obj2, 3));
                ajqh a = advc.a(admpVar, this.a);
                a.i(false);
                a.h(admpVar.a);
                a.a = new adkk(9);
                ((adms) obj2).b.a(a.g());
                return;
            case 11:
                ((afxz) ((adlz) this.a).a).e(new adiw(((admq) this.b).a));
                return;
            case 12:
                ((RcsEngineProxyImpl) this.a).m229xead5a25a(this.b, (aplh) obj);
                return;
            case 13:
                adwz adwzVar = (adwz) obj;
                Collection.EL.stream(adwzVar.b()).forEach(new abid(this.b, adwzVar, 14));
                Collection.EL.stream(adwzVar.c()).forEach(new abid(this.a, adwzVar, 15));
                return;
            case 14:
                this.a.put((QName) obj, this.b);
                return;
            case 15:
                this.a.put((Class) obj, this.b);
                return;
            case 16:
                ((AtomicReference) obj).set((aoud) ((arlb) this.a).k(new aqwm((albv) this.b)));
                return;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                Object obj3 = this.b;
                if (((ViewGroup) obj3).getParent() != null) {
                    View view = (View) obj3;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = num.intValue();
                        view.setLayoutParams(layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                Object obj4 = this.a;
                ((alvg) HugoHostFragment.a.g().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment", "onCreateView$lambda$6$lambda$4", 116, "HugoHostFragment.kt")).q("View does not have parent yet, so saving height to set when it does have a parent.");
                ((HugoHostFragment) obj4).al = num;
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.c) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public /* synthetic */ abid(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
