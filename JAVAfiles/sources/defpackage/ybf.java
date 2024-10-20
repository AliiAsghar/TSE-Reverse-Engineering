package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.MediaPlayer;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ybf implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ybf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        yaz yazVar;
        AudioFocusRequest build;
        int i = 8;
        int i2 = 1;
        switch (this.b) {
            case 0:
                Integer num = (Integer) obj;
                num.intValue();
                Object obj2 = this.a;
                synchronized (((ybg) obj2).i) {
                    for (yao yaoVar : (List) Map.EL.getOrDefault(((ybg) obj2).h, num, new ArrayList())) {
                        yaoVar.getClass();
                        qiu.h(aktp.ah(new ybh(yaoVar, i2), ((ybg) obj2).b));
                    }
                    for (yao yaoVar2 : (List) Map.EL.getOrDefault(((ybg) obj2).h, -1, new ArrayList())) {
                        yaoVar2.getClass();
                        qiu.h(aktp.ah(new ybh(yaoVar2, i2), ((ybg) obj2).b));
                    }
                }
                return;
            case 1:
                yao yaoVar3 = (yao) obj;
                yaoVar3.getClass();
                qiu.h(aktp.ah(new ybh(yaoVar3, i2), ((ybg) this.a).b));
                return;
            case 2:
                ybj ybjVar = (ybj) this.a;
                yaz a = ybjVar.c.a((ServiceState) obj, ybjVar.d);
                yaz yazVar2 = (yaz) ybjVar.f.getAndSet(a);
                ybjVar.g.set(yazVar2);
                ((alwl) ybj.a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "onNetworkStateChanged", 161, "NetworkStateMonitorSPlusServiceState.java")).J("NetworkStateMonitorSPlusServiceState onNetworkStateChanged for subId %d: %s to %s", Integer.valueOf(ybjVar.d), yazVar2, a);
                ybjVar.b.q(Integer.valueOf(ybjVar.d));
                return;
            case 3:
                int level = ((SignalStrength) obj).getLevel();
                if (level != 1 && level != 2 && level != 3 && level != 4) {
                    yazVar = yaz.UNKNOWN;
                } else {
                    yazVar = yaz.AVAILABLE;
                }
                ybl yblVar = (ybl) this.a;
                yaz yazVar3 = (yaz) yblVar.e.getAndSet(yazVar);
                yblVar.f.set(yazVar3);
                ((alwl) ybl.a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "onNetworkStateChanged", 156, "NetworkStateMonitorSSignalStrength.java")).J("NetworkStateMonitorSSignalStrength onNetworkStateChanged for subId %d: %s to %s", Integer.valueOf(yblVar.c), yazVar3, yazVar);
                yblVar.b.q(Integer.valueOf(yblVar.c));
                return;
            case 4:
                alwo alwoVar = ybq.a;
                this.a.q((ServiceState) obj);
                return;
            case 5:
                ((MediaPlayer) this.a).setLooping(((Boolean) obj).booleanValue());
                return;
            case 6:
                Float f = (Float) obj;
                alwo alwoVar2 = ygs.a;
                ((MediaPlayer) this.a).setVolume(f.floatValue(), f.floatValue());
                return;
            case 7:
                ygs ygsVar = (ygs) this.a;
                AudioFocusRequest audioFocusRequest = ygsVar.f;
                if (audioFocusRequest != null) {
                    ygsVar.d.abandonAudioFocusRequest(audioFocusRequest);
                    ygsVar.f = null;
                    return;
                }
                return;
            case 8:
                ex$$ExternalSyntheticApiModelOutline1.m(this.a).setAudioAttributes((AudioAttributes) obj);
                return;
            case 9:
                AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(3);
                ybf ybfVar = new ybf(builder, i);
                ygs ygsVar2 = (ygs) this.a;
                ygsVar2.b.e.ifPresent(ybfVar);
                build = builder.build();
                ygsVar2.f = build;
                ygsVar2.d.requestAudioFocus(ygsVar2.f);
                return;
            case 10:
                ((MediaPlayer) this.a).setAudioAttributes((AudioAttributes) obj);
                return;
            case 11:
                this.a.a(obj);
                return;
            case 12:
                this.a.a(obj);
                return;
            case 13:
                alde aldeVar = (alde) obj;
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aldf aldfVar = (aldf) aozyVar.b;
                aldf aldfVar2 = aldf.a;
                aldeVar.getClass();
                aldfVar.d = aldeVar;
                aldfVar.c = 2;
                return;
            case 14:
                ((aloh) this.a).b((String) yiq.s.e(), (alda) obj);
                return;
            case 15:
                aldm aldmVar = (aldm) obj;
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                aldo aldoVar = (aldo) aozyVar2.b;
                aldo aldoVar2 = aldo.a;
                aldmVar.getClass();
                aldoVar.e = aldmVar;
                aldoVar.b |= 8;
                return;
            case 16:
                aldp aldpVar = (aldp) obj;
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                aldo aldoVar3 = (aldo) aozyVar3.b;
                aldo aldoVar4 = aldo.a;
                aldpVar.getClass();
                aldoVar3.f = aldpVar;
                aldoVar3.b |= 16;
                return;
            case 17:
                ((aozy) this.a).aD((alda) obj);
                return;
            case 18:
                icm icmVar = (icm) ((wfh) obj).a;
                icmVar.a(((ykv) this.a).a(), ich.b(icmVar.a));
                return;
            case 19:
                this.a.a(obj);
                return;
            default:
                this.a.a(obj);
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
