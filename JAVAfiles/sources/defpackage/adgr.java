package defpackage;

import android.os.Bundle;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adgr implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ adgr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                apgf a = adfs.a((String) obj);
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                apgz apgzVar = (apgz) aozyVar.b;
                apgz apgzVar2 = apgz.a;
                a.getClass();
                apao apaoVar = apgzVar.e;
                if (!apaoVar.c()) {
                    apgzVar.e = apag.mutableCopy(apaoVar);
                }
                apgzVar.e.g(a.z);
                return;
            case 1:
                apgf a2 = adfs.a((String) obj);
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                apgz apgzVar3 = (apgz) aozyVar2.b;
                apgz apgzVar4 = apgz.a;
                a2.getClass();
                apao apaoVar2 = apgzVar3.d;
                if (!apaoVar2.c()) {
                    apgzVar3.d = apag.mutableCopy(apaoVar2);
                }
                apgzVar3.d.g(a2.z);
                return;
            case 2:
                apgf a3 = adfs.a((String) obj);
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                apgz apgzVar5 = (apgz) aozyVar3.b;
                apgz apgzVar6 = apgz.a;
                a3.getClass();
                apao apaoVar3 = apgzVar5.f;
                if (!apaoVar3.c()) {
                    apgzVar5.f = apag.mutableCopy(apaoVar3);
                }
                apgzVar5.f.g(a3.z);
                return;
            case 3:
                ((adgw) this.a).a((adfn) obj);
                return;
            case 4:
                acyz acyzVar = adhw.d;
                ((adfk) obj).f((acok) this.a);
                return;
            case 5:
                acyz acyzVar2 = adhw.d;
                ((adez) obj).j((String) this.a);
                return;
            case 6:
                acyz acyzVar3 = adhw.d;
                ((adfk) obj).h((acok) this.a);
                return;
            case 7:
                acyz acyzVar4 = adhw.d;
                ((adez) obj).h((adey) this.a);
                return;
            case 8:
                acyz acyzVar5 = adhw.d;
                ((adez) obj).k((String) this.a);
                return;
            case 9:
                ((Bundle) this.a).putString("com.google.android.ims.provisioning.sim.id.key", (String) obj);
                return;
            case 10:
                acyz acyzVar6 = adlw.a;
                ((admw) this.a).b("tachyon_identity_key", (String) obj);
                return;
            case 11:
                acyz acyzVar7 = adlw.a;
                ((adkf) this.a).b(((adjn) obj).b);
                return;
            case 12:
                ((acrm) obj).a(((anjs) this.a).i(), advy.PROVISIONING_ENGINE_STATE_MACHINE);
                return;
            case 13:
                ((adjm) obj).o(1, ((adkv) this.a).a.n);
                return;
            case 14:
                ((adjm) obj).o(2, ((adkw) this.a).a.n);
                return;
            case 15:
                ((adjm) obj).n(((adkx) this.a).a.r);
                return;
            case 16:
                ((adjm) obj).o(3, ((adlk) this.a).a.n);
                return;
            case 17:
                adjw adjwVar = (adjw) obj;
                if (adjwVar.a == this.a) {
                    adjwVar.a = null;
                    return;
                }
                return;
            case 18:
                ((adjw) obj).a = this.a;
                return;
            case 19:
                ((adjm) obj).o(2, ((adlq) this.a).a.n);
                return;
            default:
                ((adjm) obj).o(3, ((adlq) this.a).a.n);
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
