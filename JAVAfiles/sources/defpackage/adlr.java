package defpackage;

import android.net.Uri;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adlr implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ adlr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [com.google.android.ims.network.common.RcsEngine, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                ((adjm) obj).o(5, ((adls) this.a).a.n);
                return;
            case 1:
                ((adjm) obj).o(5, ((adls) this.a).a.n);
                return;
            case 2:
                ((adjm) obj).o(3, ((adls) this.a).a.n);
                return;
            case 3:
                ((adjm) obj).o(3, ((adls) this.a).a.n);
                return;
            case 4:
                ((adjm) obj).o(3, ((adlu) this.a).a.n);
                return;
            case 5:
                ((adjm) obj).o(3, ((adlv) this.a).a.n);
                return;
            case 6:
                Object obj2 = this.a;
                adms admsVar = (adms) obj2;
                adiw adiwVar = (adiw) obj;
                if (((Boolean) admsVar.h.b()).booleanValue()) {
                    qiu.h(admsVar.d.submit(akto.k(new aakf(obj2, adiwVar, 11))));
                    return;
                } else {
                    admsVar.n.v(4, new altx(adiwVar), altc.a);
                    return;
                }
            case 7:
                ((adms) this.a).B((wxb) obj);
                return;
            case 8:
                ((Uri.Builder) this.a).path((String) obj);
                return;
            case 9:
                ((Uri.Builder) this.a).path((String) obj);
                return;
            case 10:
                amwt amwtVar = ((adjl) obj).a;
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                apfv apfvVar = (apfv) aozyVar.b;
                apfv apfvVar2 = apfv.a;
                apfvVar.g = amwtVar.E;
                apfvVar.b |= 256;
                return;
            case 11:
                ((adjr) obj).u((Configuration) this.a);
                return;
            case 12:
                ((RcsEngineProxyImpl) this.a).m239xcd689bc8((adud) obj);
                return;
            case 13:
                ((RcsEngineProxyImpl) this.a).m240xde1e6889((adud) obj);
                return;
            case 14:
                ((RcsEngineProxyImpl) this.a).m241xeed4354a((adud) obj);
                return;
            case 15:
                ((RcsEngineProxyImpl) this.a).m242xff8a020b((adud) obj);
                return;
            case 16:
                ((adud) obj).set(this.a);
                return;
            case 17:
                ((RcsEngineProxyImpl) this.a).m230x6925cf42((adud) obj);
                return;
            case 18:
                ((RcsEngineProxyImpl) this.a).m232xd258cb9b((adud) obj);
                return;
            case 19:
                ((RcsEngineProxyImpl) this.a).m233xe30e985c((adud) obj);
                return;
            default:
                ((RcsEngineProxyImpl) this.a).m234xf3c4651d((adud) obj);
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
