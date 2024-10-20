package defpackage;

import defpackage.cvc;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aedh extends arrp implements arqr {
    private final /* synthetic */ int u;
    public static final aedh t = new aedh(20);
    public static final aedh s = new aedh(19);
    public static final aedh r = new aedh(18);
    public static final aedh q = new aedh(17);
    public static final aedh p = new aedh(16);
    public static final aedh o = new aedh(15);
    public static final aedh n = new aedh(14);
    public static final aedh m = new aedh(13);
    public static final aedh l = new aedh(12);
    public static final aedh k = new aedh(11);
    public static final aedh j = new aedh(10);
    public static final aedh i = new aedh(9);
    public static final aedh h = new aedh(8);
    public static final aedh g = new aedh(7);
    public static final aedh f = new aedh(6);
    public static final aedh e = new aedh(5);
    public static final aedh d = new aedh(4);
    public static final aedh c = new aedh(3);
    public static final aedh b = new aedh(2);
    public static final aedh a = new aedh(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aedh(int i2) {
        super(1);
        this.u = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        switch (this.u) {
            case 0:
                ((aecj) obj).getClass();
                return new asgm();
            case 1:
                aeaa aeaaVar = (aeaa) obj;
                aeaaVar.getClass();
                return aeaaVar.a();
            case 2:
                InputStream inputStream = (InputStream) obj;
                inputStream.getClass();
                return (aote) apag.parseFrom(aote.a, inputStream);
            case 3:
                aozy aozyVar = (aozy) obj;
                aozyVar.getClass();
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aedx aedxVar = (aedx) aozyVar.b;
                aedx aedxVar2 = aedx.a;
                aedxVar.b &= -65;
                aedxVar.i = 0L;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                apag apagVar = aozyVar.b;
                aedx aedxVar3 = (aedx) apagVar;
                aedxVar3.b &= -33;
                aedxVar3.h = 0L;
                if (!apagVar.isMutable()) {
                    aozyVar.u();
                }
                apag apagVar2 = aozyVar.b;
                aedx aedxVar4 = (aedx) apagVar2;
                aedxVar4.b &= -129;
                aedxVar4.j = false;
                if (!apagVar2.isMutable()) {
                    aozyVar.u();
                }
                apag apagVar3 = aozyVar.b;
                aedx aedxVar5 = (aedx) apagVar3;
                aedxVar5.b &= -257;
                aedxVar5.k = aedx.a.k;
                if (!apagVar3.isMutable()) {
                    aozyVar.u();
                }
                aedx aedxVar6 = (aedx) aozyVar.b;
                aedxVar6.b &= -17;
                aedxVar6.g = aedx.a.g;
                return arnb.a;
            case 4:
                ((dho) obj).getClass();
                return arnb.a;
            case 5:
                ((dho) obj).getClass();
                return arnb.a;
            case 6:
                ((Number) obj).floatValue();
                return arnb.a;
            case 7:
                ((brd) obj).getClass();
                return true;
            case 8:
                ((Boolean) obj).booleanValue();
                return arnb.a;
            case 9:
                ((ciy) obj).getClass();
                return arnb.a;
            case 10:
                return d.Z(obj);
            case 11:
                ((wd) obj).getClass();
                return new wr(wx.g(zs.d(0, 0, null, 7), 2), wx.h(zs.d(0, 0, null, 7), 2));
            case 12:
                return Integer.valueOf(((Number) obj).intValue());
            case 13:
                dho dhoVar = (dho) obj;
                dhoVar.getClass();
                dhl.d(dhoVar);
                return arnb.a;
            case 14:
                ((String) obj).getClass();
                return arnb.a;
            case 15:
                return null;
            case 16:
                dho dhoVar2 = (dho) obj;
                dhoVar2.getClass();
                dhl.k(dhoVar2, 0);
                return arnb.a;
            case 17:
                return null;
            case 18:
                ((cvc.a) obj).getClass();
                return arnb.a;
            case 19:
                cle cleVar = (cle) obj;
                cleVar.getClass();
                cleVar.r(true);
                cleVar.A(awh.a);
                return arnb.a;
            default:
                cle cleVar2 = (cle) obj;
                cleVar2.getClass();
                cleVar2.s(1);
                return arnb.a;
        }
    }
}
