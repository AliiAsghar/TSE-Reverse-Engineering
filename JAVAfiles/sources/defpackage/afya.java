package defpackage;

import android.view.View;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class afya extends arrm implements arqr {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afya(Object obj, int i, byte[] bArr) {
        super(1, obj, afwt.class, "setSearchText", "setSearchText(Ljava/lang/String;)V", 0);
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [armf, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        View view;
        agdu agduVar = null;
        switch (this.a) {
            case 0:
                agdp agdpVar = (agdp) obj;
                agdpVar.getClass();
                afye afyeVar = (afye) this.e;
                alvi alviVar = afye.b;
                agaq agaqVar = agaq.a;
                if (agdpVar.ordinal() == 3) {
                    afzs afzsVar = (afzs) afyeVar.k.c(afye.a[0]);
                    if (afzsVar != null) {
                        afzsVar.setSelected(false);
                    }
                    afyeVar.k.d(afye.a[0], null);
                }
                afyeVar.e.f(agdpVar);
                afye.q(afyeVar, 0, 0, 3);
                return arnb.a;
            case 1:
                String str = (String) obj;
                str.getClass();
                afwt afwtVar = (afwt) this.e;
                artm[] artmVarArr = afwt.a;
                afwtVar.k(str);
                return arnb.a;
            case 2:
                RendererContainer rendererContainer = (RendererContainer) obj;
                rendererContainer.getClass();
                aged agedVar = (aged) this.e;
                alvi alviVar2 = aged.b;
                ((alvg) aged.b.g().h("com/google/android/libraries/compose/ui/rendering/renderer/Renderer", "attachContainer", 152, "Renderer.kt")).t("Attaching to container %s added to anchor", rendererContainer);
                View a = rendererContainer.a();
                a.getLayoutParams().height = agedVar.c.e;
                a.setTranslationY(-agedVar.c.e);
                a.requestLayout();
                rendererContainer.addOnLayoutChangeListener(agedVar.f);
                if (agedVar.d == null) {
                    adwo adwoVar = agedVar.h;
                    afzg afzgVar = new afzg(agedVar, 20);
                    agdk agdkVar = new agdk(new agef(agedVar, 1), new afyq(agedVar, 14));
                    zay zayVar = new zay(agedVar, 10, (int[][]) null);
                    agdq agdqVar = agedVar.c;
                    zay zayVar2 = new zay(agdqVar, 11, (boolean[][]) null);
                    if (agdqVar.e > 0) {
                        view = rendererContainer.a();
                    } else {
                        view = null;
                    }
                    anca ancaVar = (anca) adwoVar.a.b();
                    ancaVar.getClass();
                    agedVar.d = new agdu(ancaVar, rendererContainer, afzgVar, agdkVar, zayVar, zayVar2, view);
                }
                agdu agduVar2 = agedVar.d;
                if (agduVar2 == null) {
                    arro.b("touchListener");
                } else {
                    agduVar = agduVar2;
                }
                agduVar.f(true);
                agem agemVar = agedVar.e;
                if (agemVar != null && agedVar.d(agemVar.aM()) == null) {
                    agee c = agedVar.c();
                    if (c != null) {
                        c.a(agemVar, agedVar.c);
                    } else {
                        throw new IllegalStateException("RendererFragment wasn't attached");
                    }
                }
                aged.l(agedVar, agedVar.b());
                return arnb.a;
            case 3:
                RendererContainer rendererContainer2 = (RendererContainer) obj;
                rendererContainer2.getClass();
                aged agedVar2 = (aged) this.e;
                alvi alviVar3 = aged.b;
                ((alvg) aged.b.g().h("com/google/android/libraries/compose/ui/rendering/renderer/Renderer", "detachContainer", 161, "Renderer.kt")).t("Detaching to container %s from anchor", rendererContainer2);
                agdu agduVar3 = agedVar2.d;
                if (agduVar3 != null) {
                    agduVar3.f(false);
                }
                rendererContainer2.removeOnLayoutChangeListener(agedVar2.f);
                if (!agedVar2.c.h) {
                    agedVar2.i.g();
                }
                return arnb.a;
            case 4:
                ((agig) this.e).c(((Number) obj).floatValue());
                return arnb.a;
            case 5:
                Callable callable = (Callable) obj;
                callable.getClass();
                akdq akdqVar = (akdq) this.e;
                int i = akdq.b;
                return akdqVar.a(callable);
            case 6:
                Callable callable2 = (Callable) obj;
                callable2.getClass();
                akdq akdqVar2 = (akdq) this.e;
                int i2 = akdq.b;
                return akdqVar2.a(callable2);
            case 7:
                Callable callable3 = (Callable) obj;
                callable3.getClass();
                akdq akdqVar3 = (akdq) this.e;
                int i3 = akdq.b;
                return akdqVar3.a(callable3);
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                return ((akiv) this.e).a(str2);
            case 9:
                akie akieVar = (akie) obj;
                akieVar.getClass();
                akjb akjbVar = (akjb) this.e;
                aozy createBuilder = akie.a.createBuilder();
                createBuilder.getClass();
                if (d.F(akieVar, akec.k(createBuilder))) {
                    ListenableFuture a2 = ((aiwu) akjbVar.i.get()).a();
                    a2.getClass();
                    return a2;
                }
                return albo.bI(akieVar);
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                return ((akiv) this.e).a(str3);
            case 11:
                String str4 = (String) obj;
                str4.getClass();
                return ((akjz) this.e).a(str4);
            case 12:
                String str5 = (String) obj;
                str5.getClass();
                return ((akjz) this.e).a(str5);
            default:
                ((arxp) this.e).a((Throwable) obj);
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afya(Object obj, int i) {
        super(1, obj, afye.class, "onRenderingStateChanged", "onRenderingStateChanged(Lcom/google/android/libraries/compose/ui/rendering/RenderingState;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afya(Object obj, int i, char[] cArr) {
        super(1, obj, aged.class, "attachContainer", "attachContainer(Lcom/google/android/libraries/compose/ui/rendering/container/RendererContainer;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afya(Object obj, int i, short[] sArr) {
        super(1, obj, aged.class, "detachContainer", "detachContainer(Lcom/google/android/libraries/compose/ui/rendering/container/RendererContainer;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afya(Object obj, int i, int[] iArr) {
        super(1, obj, agig.class, "onSeek", "onSeek(F)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afya(Object obj, int i, float[] fArr) {
        super(1, obj, akdq.class, "asErrorPropagatingCallable", "asErrorPropagatingCallable(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Callable;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afya(Object obj, int i, char[][] cArr) {
        super(1, obj, akiv.class, "create", "create(Ljava/lang/String;)Lcom/google/apps/tiktok/experiments/phenotype/DeviceConfigurationCommitter;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afya(Object obj, int i, short[][] sArr) {
        super(1, obj, akjb.class, "getFromFallbackCacheOrImmediate", "getFromFallbackCacheOrImmediate(Lcom/google/apps/tiktok/experiments/FlagSnapshot;)Lcom/google/common/util/concurrent/ListenableFuture;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afya(Object obj, int i, float[][] fArr) {
        super(1, obj, akjz.class, "create", "create(Ljava/lang/String;)Lcom/google/apps/tiktok/experiments/phenotype/UserConfigurationCommitter;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afya(Object obj, int i, byte[][][] bArr) {
        super(1, obj, arxp.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        this.a = i;
    }
}
