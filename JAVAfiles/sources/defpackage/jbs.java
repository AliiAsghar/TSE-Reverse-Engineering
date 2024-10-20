package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbs extends arrp implements arqr {
    private final /* synthetic */ int s;
    public static final jbs r = new jbs(20);
    public static final jbs q = new jbs(19);
    public static final jbs p = new jbs(18);
    public static final jbs o = new jbs(17);
    public static final jbs n = new jbs(16);
    public static final jbs m = new jbs(15);
    public static final jbs l = new jbs(14);
    public static final jbs k = new jbs(13);
    public static final jbs j = new jbs(12);
    public static final jbs i = new jbs(10);
    public static final jbs h = new jbs(9);
    public static final jbs g = new jbs(7);
    public static final jbs f = new jbs(5);
    public static final jbs e = new jbs(4);
    public static final jbs d = new jbs(3);
    public static final jbs c = new jbs(2);
    public static final jbs b = new jbs(1);
    public static final jbs a = new jbs(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbs(int i2) {
        super(1);
        this.s = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        String i2;
        String b2;
        Object obj2;
        boolean z = false;
        switch (this.s) {
            case 0:
                jcb jcbVar = (jcb) obj;
                jcbVar.getClass();
                jcbVar.a();
                return arnb.a;
            case 1:
                jcb jcbVar2 = (jcb) obj;
                jcbVar2.getClass();
                jcbVar2.b();
                return arnb.a;
            case 2:
                jca jcaVar = (jca) obj;
                jcaVar.getClass();
                jcaVar.a();
                return arnb.a;
            case 3:
                jcb jcbVar3 = (jcb) obj;
                jcbVar3.getClass();
                jcbVar3.c();
                return arnb.a;
            case 4:
                aagd aagdVar = (aagd) obj;
                aagdVar.getClass();
                aozy builder = aagdVar.toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                aagd aagdVar2 = (aagd) builder.b;
                aagdVar2.b |= 2;
                aagdVar2.d = 0;
                apag s = builder.s();
                s.getClass();
                return (aagd) s;
            case 5:
                aagd aagdVar3 = (aagd) obj;
                aagdVar3.getClass();
                aozy builder2 = aagdVar3.toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                aagd aagdVar4 = (aagd) builder2.b;
                aagdVar4.b |= 8;
                aagdVar4.f = 0;
                apag s2 = builder2.s();
                s2.getClass();
                return (aagd) s2;
            case 6:
                aagd aagdVar5 = (aagd) obj;
                aagdVar5.getClass();
                aozy builder3 = aagdVar5.toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                aagd aagdVar6 = (aagd) builder3.b;
                aagdVar6.b = 1 | aagdVar6.b;
                aagdVar6.c = false;
                apag s3 = builder3.s();
                s3.getClass();
                return (aagd) s3;
            case 7:
                xnw xnwVar = (xnw) obj;
                xnwVar.getClass();
                xnwVar.a();
                return arnb.a;
            case 8:
                aajh aajhVar = (aajh) obj;
                aajhVar.getClass();
                aajhVar.a();
                return arnb.a;
            case 9:
                return ((lya) obj).a();
            case 10:
                jcu jcuVar = (jcu) obj;
                jcuVar.getClass();
                return jcuVar.getClass();
            case 11:
                miz mizVar = (miz) obj;
                mizVar.getClass();
                mym e2 = mizVar.e();
                if (e2 instanceof myr) {
                    if (((Boolean) ((utz) yig.W.get()).e()).booleanValue()) {
                        myr myrVar = (myr) e2;
                        alog a2 = myrVar.a();
                        a2.getClass();
                        alur it = a2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((qdq) obj2).e() == myq.ORIGINAL_TEXT) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        qdq qdqVar = (qdq) obj2;
                        if (qdqVar == null || (b2 = qdqVar.f()) == null) {
                            b2 = myrVar.b();
                        }
                    } else {
                        b2 = ((myr) e2).b();
                    }
                    b2.getClass();
                    return b2;
                }
                if (e2 instanceof myp) {
                    String n2 = ((myp) e2).n();
                    n2.getClass();
                    return n2;
                }
                if (!(e2 instanceof myt) || (i2 = ((myt) e2).i()) == null) {
                    return "";
                }
                return i2;
            case 12:
                return d.Z(obj);
            case 13:
                return d.Z(obj);
            case 14:
                ((Context) obj).getClass();
                return Integer.valueOf((int) (afzv.c(r5).y * 0.75d));
            case 15:
                afcq afcqVar = (afcq) obj;
                afcqVar.getClass();
                if ((afcqVar.fh() instanceof afgj) || (afcqVar.fh() instanceof afgg)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                return Integer.valueOf(((Number) obj).intValue());
            case 17:
                return Integer.valueOf(((Number) obj).intValue());
            case 18:
                aozy builder4 = ((yfq) obj).toBuilder();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                yfq yfqVar = (yfq) builder4.b;
                yfqVar.b |= 4;
                yfqVar.e = true;
                Object e3 = yfs.a.e();
                e3.getClass();
                int intValue = ((Number) e3).intValue();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                yfq yfqVar2 = (yfq) builder4.b;
                yfqVar2.b = 1 | yfqVar2.b;
                yfqVar2.c = intValue;
                Object e4 = yfs.b.e();
                e4.getClass();
                int intValue2 = ((Number) e4).intValue();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                yfq yfqVar3 = (yfq) builder4.b;
                yfqVar3.b |= 2;
                yfqVar3.d = intValue2;
                return (yfq) builder4.s();
            case 19:
                aozy builder5 = ((yfq) obj).toBuilder();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                yfq yfqVar4 = (yfq) builder5.b;
                yfqVar4.b |= 4;
                yfqVar4.e = false;
                Object e5 = yfs.c.e();
                e5.getClass();
                int intValue3 = ((Number) e5).intValue();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                yfq yfqVar5 = (yfq) builder5.b;
                yfqVar5.b = 1 | yfqVar5.b;
                yfqVar5.c = intValue3;
                Object e6 = yfs.d.e();
                e6.getClass();
                int intValue4 = ((Number) e6).intValue();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                yfq yfqVar6 = (yfq) builder5.b;
                yfqVar6.b |= 2;
                yfqVar6.d = intValue4;
                return (yfq) builder5.s();
            default:
                return ((jrg) obj).a();
        }
    }
}
