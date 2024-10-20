package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajzr implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ajzr(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return ((aqrs) obj).a((aqux) this.b, (aqrr) this.a);
                        }
                        String str = (String) obj;
                        str.getClass();
                        StringBuilder sb = new StringBuilder();
                        aknt akntVar = (aknt) this.a;
                        sb.append(akntVar.a);
                        sb.append(str);
                        sb.append(".pb");
                        String sb2 = sb.toString();
                        return ((aohs) ((alhm) this.b).b).B(akntVar.c, sb2);
                    }
                    Throwable th = (Throwable) obj;
                    boolean z = th instanceof CancellationException;
                    Object obj2 = this.b;
                    Object obj3 = this.a;
                    if (!z) {
                        try {
                            ((aodz) obj2).k();
                            ((akhj) obj3).c((aodz) obj2);
                            return null;
                        } catch (NullPointerException e) {
                            ((alvg) ((alvg) ((alvg) akhj.a.h()).g(e)).h("com/google/apps/tiktok/dataservice/local/LocalSubscriptionMixinUpdater", "appendLoadCompletion", (char) 334, "LocalSubscriptionMixinUpdater.java")).q("LocalSubscriptionMixinUpdater silently ignored NullPointerException");
                            throw e;
                        }
                    }
                    throw ((CancellationException) th);
                }
                aodz aodzVar = (aodz) this.b;
                aodzVar.k();
                ((akhj) this.a).c(aodzVar);
                return null;
            }
            ajzw ajzwVar = (ajzw) obj;
            alok alokVar = new alok();
            aozy builder = ajzwVar.toBuilder();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            ((ajzw) builder.b).a().clear();
            for (Map.Entry entry : DesugarCollections.unmodifiableMap(ajzwVar.d).entrySet()) {
                ajzb ajzbVar = ((ajzz) entry.getValue()).d;
                if (ajzbVar == null) {
                    ajzbVar = ajzb.a;
                }
                if (((alpt) this.a).contains(ajzbVar.i)) {
                    builder.ay(((Integer) entry.getKey()).intValue(), (ajzz) entry.getValue());
                } else {
                    alokVar.i(entry);
                }
            }
            alor b = akkd.b(this.b, builder);
            alor b2 = alokVar.b();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            ((ajzw) builder.b).a().putAll(b2);
            return new ajzs(b, (ajzw) builder.s());
        }
        ajzs ajzsVar = (ajzs) this.a.apply((ajzw) obj);
        ((AtomicReference) this.b).set(ajzsVar.a);
        return ajzsVar.b;
    }

    public /* synthetic */ ajzr(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
