package defpackage;

import android.location.Location;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdz implements absx {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public acdz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.absx
    public final /* synthetic */ void a(Object obj) {
        absw abswVar;
        switch (this.b) {
            case 0:
                ((acdt) ((acea) this.a).a).b.d(null);
                return;
            case 1:
                ((abgj) obj).l((LocationResult) this.a);
                return;
            case 2:
                ((acde) obj).a((Location) this.a);
                return;
            case 3:
                acdy acdyVar = ((aceb) this.a).a;
                synchronized (acdyVar) {
                    ((acdn) acdyVar).b = false;
                    abswVar = ((acdn) acdyVar).a.b;
                }
                if (abswVar != null) {
                    ((acdn) acdyVar).c.h(abswVar, 2441);
                    return;
                }
                return;
            case 4:
                ahuy ahuyVar = (ahuy) obj;
                try {
                    Object obj2 = this.a;
                    aozs aozsVar = aozs.a;
                    apcc apccVar = apcc.a;
                    ahuu ahuuVar = (ahuu) apag.parseFrom(ahuu.a, (byte[]) obj2, aozs.a);
                    for (ahop ahopVar : ahuyVar.b.c.values()) {
                        apax apaxVar = ahuuVar.b;
                        ahlp ahlpVar = ahut.f;
                        if (apaxVar != null && !apaxVar.isEmpty()) {
                            boolean z = false;
                            for (Map.Entry entry : ahlpVar.a.entrySet()) {
                                if (apaxVar.contains(((algx) entry.getKey()).a)) {
                                    boolean z2 = ((ahut) entry.getValue()).e;
                                    z = true;
                                }
                            }
                            if (z) {
                                ahuyVar.a.a();
                                return;
                            }
                        }
                    }
                    return;
                } catch (apba unused) {
                    return;
                }
            case 5:
                Object obj3 = this.a;
                try {
                    new acke((DataHolder) obj3, 0);
                    if (obj3 != null) {
                        ((DataHolder) obj3).close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (obj3 != null) {
                        try {
                            ((DataHolder) obj3).close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            case 6:
                try {
                    ((acko) obj).l(new acke((DataHolder) this.a, 1, null));
                    return;
                } finally {
                    ((DataHolder) this.a).close();
                }
            case 7:
                ((acko) obj).j((MessageEventParcelable) this.a);
                return;
            default:
                ((ChannelEventParcelable) this.a).a((acjv) obj);
                return;
        }
    }

    @Override // defpackage.absx
    public final void b() {
        int i = this.b;
        if (i != 5) {
            if (i != 6) {
                return;
            }
            ((DataHolder) this.a).close();
            return;
        }
        ((DataHolder) this.a).close();
    }
}
