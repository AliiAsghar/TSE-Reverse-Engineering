package defpackage;

import android.util.Base64;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.net.InetAddress;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uoc implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ uoc(amwt amwtVar, vrk vrkVar, adiv adivVar, int i) {
        this.d = i;
        this.b = amwtVar;
        this.c = vrkVar;
        this.a = adivVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return Function$CC.$default$andThen(this, function);
                            }
                            return Function$CC.$default$andThen(this, function);
                        }
                        return Function$CC.$default$andThen(this, function);
                    }
                    return Function$CC.$default$andThen(this, function);
                }
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [vba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        Iterable iterable;
        usc a;
        int i = this.d;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                InetAddress inetAddress = (InetAddress) obj;
                                return new aill((atmb) this.a, (atng) this.b, inetAddress.getHostAddress(), ailk.a(inetAddress.getHostName()), ((ailk) this.c).b);
                            }
                            String str = (String) obj;
                            return agpr.o(this.b, str, ((agpr) this.c).a.get(str), (String) this.a);
                        }
                        KeyPair keyPair = (KeyPair) obj;
                        xyo d = yuu.a.d();
                        d.H("Creating vsms hash using key pair with public key");
                        d.z("public key", Base64.encodeToString(keyPair.getPublic().getEncoded(), 0));
                        d.q();
                        return ((yuu) this.c).h((ECPrivateKey) keyPair.getPrivate(), this.b, (String) this.a);
                    }
                    int i3 = ((wxb) obj).d;
                    Object obj2 = this.a;
                    return vrm.a((amwt) this.b, (vrk) this.c, i3, Optional.of(obj2));
                }
                Object obj3 = this.b;
                Object obj4 = this.a;
                vhf vhfVar = new vhf(obj4, obj3, i2);
                vhi vhiVar = (vhi) obj4;
                Optional optional = vhiVar.h;
                Optional optional2 = vhiVar.g;
                Object obj5 = vhiVar.i.get();
                Object obj6 = optional2.get();
                Object obj7 = optional.get();
                return new vhe(vhiVar.b, vhfVar, (xgj) obj5, (vti) obj6, (wpp) obj7, vhiVar.c, this.c, 3, Optional.empty(), ((Integer) vbh.f.e()).intValue(), ((Integer) vbh.g.e()).intValue(), ((Integer) vbh.h.e()).intValue(), true, true, false);
            }
            tce tceVar = (tce) obj;
            tceVar.f(((qei) this.c).d);
            tceVar.d((rve) this.a);
            tceVar.U(new agmd("pending_incoming_message_rcs_table.content_type", 1, String.valueOf(this.b)));
            tceVar.b(tqn.DECRYPTED);
            return tceVar;
        }
        uqa uqaVar = (uqa) obj;
        Object obj8 = this.a;
        uqaVar.d((String) obj8);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            String str2 = ((upk) it.next()).c.b;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        Set aE = aqjn.aE(arrayList);
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 42050) {
            agnc.t("deduplication_tag", intValue);
        }
        Object obj9 = this.c;
        uqaVar.U(new agmf("work_queue.deduplication_tag", 3, uqa.X(aE), false));
        use useVar = (use) ((Map) ((uof) obj9).d.d.c()).get(obj8);
        if (useVar != null && (a = useVar.a()) != null) {
            iterable = a.b;
        } else {
            iterable = arnv.a;
        }
        uqaVar.U(new agmf("work_queue._id", 4, uqa.X(iterable), true));
        return uqaVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return Function$CC.$default$compose(this, function);
                            }
                            return Function$CC.$default$compose(this, function);
                        }
                        return Function$CC.$default$compose(this, function);
                    }
                    return Function$CC.$default$compose(this, function);
                }
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ uoc(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ uoc(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ uoc(Object obj, Collection collection, String str, int i) {
        this.d = i;
        this.c = obj;
        this.b = collection;
        this.a = str;
    }
}
