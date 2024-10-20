package defpackage;

import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aagi implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aagi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r6v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [armf, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = 16;
        int i2 = 0;
        switch (this.b) {
            case 0:
                this.a.a(obj);
                return;
            case 1:
                ((zxq) obj).b(((aafk) this.a).l);
                return;
            case 2:
                this.a.a(obj);
                return;
            case 3:
                ((AtomicReference) this.a).set((Integer) obj);
                return;
            case 4:
                this.a.a(obj);
                return;
            case 5:
                alog a = ((lao) obj).a();
                int size = a.size();
                while (i2 < size) {
                    Object obj2 = this.a;
                    lan lanVar = (lan) a.get(i2);
                    ((aaig) obj2).a.values();
                    lanVar.d();
                    i2++;
                }
                return;
            case 6:
                this.a.a(obj);
                return;
            case 7:
                ((abbu) ((wyp) this.a).c.b()).l("Prekey upload scheduled");
                return;
            case 8:
                ((abbu) ((wyp) this.a).c.b()).l("Local prekeys cleared");
                return;
            case 9:
                ((abbu) ((wyp) this.a).c.b()).l("Scytale session deleted");
                return;
            case 10:
                DebugGServiceKeysFragment debugGServiceKeysFragment = (DebugGServiceKeysFragment) this.a;
                ((akbo) debugGServiceKeysFragment.ah.b()).c(ahlp.l((ListenableFuture) obj), debugGServiceKeysFragment.b);
                return;
            case 11:
                xzb.c("Bugle", "Successfully refreshed tachyon registration");
                ((abbu) ((aalt) this.a).Z.b()).l("Successfully refreshed tachyon registration");
                return;
            case 12:
                ((abbu) ((aalt) this.a).Z.b()).l("DebugReceiver triggered.");
                return;
            case 13:
                ((alvg) ((alvg) aalt.d.d()).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionClearGaiaRegistrationTokenExpiration", 3874, "DebugUtilsImpl.java")).q("Successfully cleared Gaia Registration Token Expiration");
                ((abbu) ((aalt) this.a).Z.b()).l("Successfully cleared Gaia Registration Token Expiration");
                return;
            case 14:
                ((Optional) ((apxx) ((aalt) this.a).ao).a).ifPresent(new aabj(17));
                return;
            case 15:
                ((Optional) ((apxx) ((aalt) this.a).aH).a).ifPresent(new aabj(i));
                return;
            case 16:
                xzb.c("Bugle", "Successfully refreshed tachyon registration");
                ((abbu) ((aalt) this.a).Z.b()).l("Successfully refreshed tachyon registration");
                return;
            case 17:
                ((abbu) ((aalt) this.a).Z.b()).l("Removed the data");
                return;
            case 18:
                Object obj3 = this.a;
                qiu.i(aktp.ai(new aakf(obj3, (ykb) obj, i2), ((aalt) obj3).ai).i(new ytu(obj3, i), andi.a).i(new xdg(18), andi.a), new aagi(obj3, 11), andi.a);
                return;
            case 19:
                Object obj4 = this.a;
                aktp.ah(new aaki(obj4, (wxb) obj, 14), ((aalt) obj4).aW).k(qiu.b(), andi.a);
                return;
            default:
                ((abbu) ((aalt) this.a).Z.b()).l("Unregistered successfully from Tachyon");
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
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
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
