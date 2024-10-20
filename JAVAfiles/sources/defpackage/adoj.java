package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adoj implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ adoj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                ((RcsEngineProxyImpl) this.a).m235x8a9168c4((adud) obj);
                return;
            case 1:
                ((RcsEngineProxyImpl) this.a).m231x79db9c03((adud) obj);
                return;
            case 2:
                ((RcsEngineProxyImpl) this.a).m236x9b473585((adud) obj);
                return;
            case 3:
                ((RcsEngineProxyImpl) this.a).m237xabfd0246((adud) obj);
                return;
            case 4:
                ((RcsEngineProxyImpl) this.a).m238xbcb2cf07((adud) obj);
                return;
            case 5:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    ((adoz) this.a).q = str;
                    return;
                }
                return;
            case 6:
                ((aiji) this.a).e((aijg) obj);
                return;
            case 7:
                ((alob) this.a).h((String) obj);
                return;
            case 8:
                ((IntentFilter) this.a).addAction((String) obj);
                return;
            case 9:
                advd.c((advc) this.a, obj);
                return;
            case 10:
                ((StringBuilder) this.a).append((String) obj);
                return;
            case 11:
                aquj aqujVar = new aquj("X-Android-Cert", aqut.c);
                ((aqut) this.a).h(aqujVar, (String) obj);
                return;
            case 12:
                ((Bundle) this.a).putString("preference_value", (String) obj);
                return;
            case 13:
                this.a.a(obj);
                return;
            case 14:
                this.a.a(obj);
                return;
            case 15:
                this.a.a(obj);
                return;
            case 16:
                afye.q((afye) this.a, 0, ((Integer) obj).intValue(), 1);
                return;
            case 17:
                this.a.a(obj);
                return;
            case 18:
                Object obj2 = agnc.a;
                this.a.add((String) obj);
                return;
            case 19:
                ThreadLocal threadLocal = agoz.a;
                ((agpw) obj).f((adwp) this.a);
                return;
            default:
                ((alob) this.a).h((agxa) obj);
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
