package defpackage;

import android.hardware.Camera;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;
import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aavc implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ aavc(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                CameraTextureView.a.n("Failed waiting on preview manager", (Throwable) obj);
                return;
            case 1:
                Camera camera = (Camera) obj;
                alwo alwoVar = aava.a;
                try {
                    camera.cancelAutoFocus();
                    return;
                } catch (RuntimeException e) {
                    ((alwl) ((alwl) ((alwl) aava.a.h()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "cancelAutoFocus", (char) 1281, "CameraManager.java")).q("RuntimeException in CameraManager.cancelAutoFocus");
                    return;
                }
            case 2:
                abcu.a.l("Report shortcut used completed successfully");
                return;
            case 3:
                abcu.a.r("Unable to successfully report shortcut used", (Throwable) obj);
                return;
            case 4:
                ((acop) obj).c();
                return;
            case 5:
                acyz acyzVar = adhw.d;
                ((adez) obj).m();
                return;
            case 6:
                acyz acyzVar2 = adhw.d;
                ((adez) obj).n();
                return;
            case 7:
                acyz acyzVar3 = adhw.d;
                ((adez) obj).i();
                return;
            case 8:
                acyz acyzVar4 = adhw.d;
                ((adez) obj).l();
                return;
            case 9:
                acyz acyzVar5 = adhw.d;
                ((adfk) obj).g();
                return;
            case 10:
                RcsEngineProxyImpl.lambda$destroyActiveRcsEngine$0((adud) obj);
                return;
            case 11:
                RcsEngineProxyImpl.lambda$destroyRcsEngine$0((adud) obj);
                return;
            case 12:
                ((adpe) obj).p();
                return;
            case 13:
                ((Optional) obj).ifPresent(new aavc(12));
                return;
            case 14:
                ((adum) obj).c = Optional.empty();
                return;
            case 15:
                ((adsi) obj).a();
                return;
            case 16:
                acyz acyzVar6 = adwe.a;
                ((ainb) obj).g = false;
                return;
            case 17:
                akxm akxmVar = (akxm) obj;
                if (akxmVar instanceof aegn) {
                    ((aegn) akxmVar).b();
                    return;
                }
                return;
            case 18:
                ((agxa) obj).g();
                return;
            case 19:
                if (((Long) obj).longValue() >= 0) {
                    z = true;
                }
                d.t(z, "occurrence count can't be negative");
                return;
            default:
                ((aigq) obj).a();
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
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
