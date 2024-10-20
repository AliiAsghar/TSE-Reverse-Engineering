package defpackage;

import java.lang.reflect.Constructor;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arnd extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arnd(int i) {
        super(1);
        this.b = i;
        this.a = "";
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r6v26, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.lang.Object, atoo] */
    /* JADX WARN: Type inference failed for: r6v60, types: [java.lang.Object, atoo] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        Object obj2;
        Object obj3 = null;
        switch (this.b) {
            case 0:
                if (obj == this.a) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                anjg anjgVar = (anjg) obj;
                anjgVar.getClass();
                aozy createBuilder = apcp.a.createBuilder();
                createBuilder.getClass();
                aovn.e(anjgVar.b, createBuilder);
                Object obj4 = ((aojh) this.a).a;
                apcp d = aovn.d(createBuilder);
                aozy aozyVar = (aozy) obj4;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aqfp aqfpVar = (aqfp) aozyVar.b;
                aqfp aqfpVar2 = aqfp.a;
                aqfpVar.d = d;
                aqfpVar.b |= 32;
                return arnb.a;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                arnk arnkVar = (arnk) this.a;
                return arnkVar.j(key) + "=" + arnkVar.j(entry.getValue());
            case 3:
                String str = (String) obj;
                str.getClass();
                return ((String) this.a).concat(str);
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                if (arsd.M(str2)) {
                    int length = str2.length();
                    Object obj5 = this.a;
                    if (length < ((String) obj5).length()) {
                        return obj5;
                    }
                    return str2;
                }
                return ((String) this.a).concat(str2);
            case 5:
                artb artbVar = (artb) obj;
                artbVar.getClass();
                return arsd.H(this.a, artbVar);
            case 6:
                this.a.w(arnb.a);
                return arnb.a;
            case 7:
                this.a.cancel(false);
                return arnb.a;
            case 8:
                this.a.cancel(false);
                return arnb.a;
            case 9:
                Throwable th = (Throwable) obj;
                Object newInstance = ((Constructor) this.a).newInstance(th.getMessage(), th);
                newInstance.getClass();
                return (Throwable) newInstance;
            case 10:
                Throwable th2 = (Throwable) obj;
                Object newInstance2 = ((Constructor) this.a).newInstance(th2.getMessage());
                newInstance2.getClass();
                Throwable th3 = (Throwable) newInstance2;
                th3.initCause(th2);
                return th3;
            case 11:
                Object newInstance3 = ((Constructor) this.a).newInstance((Throwable) obj);
                newInstance3.getClass();
                return (Throwable) newInstance3;
            case 12:
                Object newInstance4 = ((Constructor) this.a).newInstance(null);
                newInstance4.getClass();
                Throwable th4 = (Throwable) newInstance4;
                th4.initCause((Throwable) obj);
                return th4;
            case 13:
                Throwable th5 = (Throwable) obj;
                try {
                    Throwable th6 = (Throwable) this.a.a(th5);
                    boolean F = d.F(th5.getMessage(), th6.getMessage());
                    obj2 = th6;
                    if (!F) {
                        boolean F2 = d.F(th6.getMessage(), th5.toString());
                        obj2 = th6;
                        if (!F2) {
                            obj2 = null;
                        }
                    }
                } catch (Throwable th7) {
                    obj2 = aqil.O(th7);
                }
                if (true != (obj2 instanceof armp)) {
                    obj3 = obj2;
                }
                return (Throwable) obj3;
            case 14:
                ((asgm) this.a).d();
                return arnb.a;
            case 15:
                ((acit) this.a).e();
                return arnb.a;
            case 16:
                this.a.c();
                return arnb.a;
            default:
                this.a.c();
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arnd(int i, byte[] bArr) {
        super(1);
        this.b = i;
        this.a = "    ";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arnd(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }
}
